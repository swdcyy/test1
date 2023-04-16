package com.eclipsesource.v8.utils.V8Executor;
import java.lang.Thread;
import java.lang.String;
import java.util.LinkedList;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.lang.Exception;
import com.eclipsesource.v8.utils.V8Executor$ExecutorTermination;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Object;
import java.lang.StringBuilder;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Locker;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;

public class V8Executor extends Thread	// class@00101b
{
    public Exception exception;
    public boolean forceTerminating;
    public boolean longRunning;
    public String messageHandler;
    public LinkedList messageQueue;
    public String result;
    public V8 runtime;
    public final String script;
    public boolean shuttingDown;
    public boolean terminated;

    public void V8Executor(String p0){
       super(p0, false, null);
    }
    public void V8Executor(String p0,boolean p1,String p2){
       super();
       this.terminated = false;
       this.shuttingDown = false;
       this.forceTerminating = false;
       this.exception = null;
       this.messageQueue = new LinkedList();
       this.script = p0;
       this.longRunning = p1;
       this.messageHandler = p2;
    }
    public void forceTermination(){
       _monitor_enter(this);
       this.forceTerminating = true;
       this.shuttingDown = true;
       V8Executor truntime = this.runtime;
       if (truntime != null) {
          truntime.terminateExecution();
       }
       this.notify();
       _monitor_exit(this);
       return;
    }
    public Exception getException(){
       return this.exception;
    }
    public String getResult(){
       return this.result;
    }
    public boolean hasException(){
       boolean b = (this.exception != null)? true: false;
       return b;
    }
    public boolean hasTerminated(){
       return this.terminated;
    }
    public boolean isShuttingDown(){
       return this.shuttingDown;
    }
    public boolean isTerminating(){
       return this.forceTerminating;
    }
    public void postMessage(String[] p0){
       _monitor_enter(this);
       this.messageQueue.add(p0);
       this.notify();
       _monitor_exit(this);
    }
    public void run(){
       int i;
       String[] obj;
       _monitor_enter(this);
       V8 v8 = V8.createV8Runtime();
       this.runtime = v8;
       v8.registerJavaMethod(new V8Executor$ExecutorTermination(this), "__j2v8__checkThreadTerminate");
       this.setup(this.runtime);
       _monitor_exit(this);
       try{
          i = 1;
          if (this.forceTerminating == null) {
             obj = this.runtime.executeScript("__j2v8__checkThreadTerminate\(\);\n"+this.script, this.getName(), -1);
             if (obj != null) {
                this.result = obj.toString();
             }
             if (obj instanceof Releasable) {
                obj.release();
             }
          }
          while (true) {
             if (this.forceTerminating == null && this.longRunning != null) {
                _monitor_enter(this);
                if (this.messageQueue.isEmpty() && this.shuttingDown == null) {
                   this.wait();
                }
                if (!this.messageQueue.isEmpty() || (this.shuttingDown != null || this.forceTerminating != null)) {
                   _monitor_exit(this);
                   _monitor_enter(this);
                   if (this.runtime.getLocker().hasLock()) {
                      this.runtime.close();
                      this.runtime = null;
                      break ;
                   }
                   break ;
                }else {
                   _monitor_exit(this);
                   if (!this.messageQueue.isEmpty()) {
                      int i1 = 0;
                      obj = this.messageQueue.remove(i1);
                      V8Array v8Array = new V8Array(this.runtime);
                      V8Array v8Array1 = new V8Array(this.runtime);
                      int len = obj.length;
                      for (; i1 < len; i1 = i1 + 1) {
                         v8Array1.push(obj[i1]);
                      }
                      v8Array.push(v8Array1);
                      this.runtime.executeVoidFunction(this.messageHandler, v8Array);
                      v8Array1.close();
                      v8Array.close();
                   }
                }
             }else {
                _monitor_enter(this);
                if (this.runtime.getLocker().hasLock()) {
                   this.runtime.close();
                   this.runtime = null;
                }
                this.terminated = i;
                _monitor_exit(this);
             }
          }
          this.terminated = i;
          _monitor_exit(this);
          return;
       }catch(java.lang.Exception e2){
          this.exception = e2;
          _monitor_enter(this);
          if (this.runtime.getLocker().hasLock()) {
             this.runtime.close();
             this.runtime = null;
          }
          this.terminated = i;
          _monitor_exit(this);
       }
       return;
    }
    public void setup(V8 p0){
    }
    public void shutdown(){
       _monitor_enter(this);
       this.shuttingDown = true;
       this.notify();
       _monitor_exit(this);
    }
}
