package okhttp3.Dispatcher;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.Iterator;
import java.util.Deque;
import okhttp3.RealCall$AsyncCall;
import okhttp3.RealCall;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;
import java.util.concurrent.BlockingQueue;
import java.lang.Runnable;
import java.lang.AssertionError;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class Dispatcher	// class@002070
{
    public ExecutorService executorService;
    public Runnable idleCallback;
    public int maxRequests;
    public int maxRequestsPerHost;
    public final Deque readyAsyncCalls;
    public final Deque runningAsyncCalls;
    public final Deque runningSyncCalls;
    public static final boolean $assertionsDisabled;

    public void Dispatcher(){
       super();
       this.maxRequests = 64;
       this.maxRequestsPerHost = 5;
       this.readyAsyncCalls = new ArrayDeque();
       this.runningAsyncCalls = new ArrayDeque();
       this.runningSyncCalls = new ArrayDeque();
    }
    public void Dispatcher(ExecutorService p0){
       super();
       this.maxRequests = 64;
       this.maxRequestsPerHost = 5;
       this.readyAsyncCalls = new ArrayDeque();
       this.runningAsyncCalls = new ArrayDeque();
       this.runningSyncCalls = new ArrayDeque();
       this.executorService = p0;
    }
    public synchronized void cancelAll(){
       Iterator iterator = this.readyAsyncCalls.iterator();
       while (iterator.hasNext()) {
          iterator.next().get().cancel();
       }
       iterator = this.runningAsyncCalls.iterator();
       while (iterator.hasNext()) {
          iterator.next().get().cancel();
       }
       iterator = this.runningSyncCalls.iterator();
       while (iterator.hasNext()) {
          iterator.next().cancel();
       }
       return;
    }
    public void enqueue(RealCall$AsyncCall p0){
       _monitor_enter(this);
       this.readyAsyncCalls.add(p0);
       _monitor_exit(this);
       this.promoteAndExecute();
    }
    public synchronized void executed(RealCall p0){
       this.runningSyncCalls.add(p0);
    }
    public synchronized ExecutorService executorService(){
       if (this.executorService == null) {
          ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
          this.executorService = v0;
       }
       return this.executorService;
    }
    public final void finished(Deque p0,Object p1){
       _monitor_enter(this);
       if (!p0.remove(p1)) {
          throw new AssertionError("Call wasn\'t in-flight!");
       }
       Dispatcher tidleCallbac = this.idleCallback;
       _monitor_exit(this);
       if (!this.promoteAndExecute() && tidleCallbac != null) {
          tidleCallbac.run();
       }
       return;
    }
    public void finished(RealCall$AsyncCall p0){
       this.finished(this.runningAsyncCalls, p0);
    }
    public void finished(RealCall p0){
       this.finished(this.runningSyncCalls, p0);
    }
    public synchronized int getMaxRequests(){
       return this.maxRequests;
    }
    public synchronized int getMaxRequestsPerHost(){
       return this.maxRequestsPerHost;
    }
    public final boolean promoteAndExecute(){
       ArrayList uArrayList = new ArrayList();
       _monitor_enter(this);
       Iterator iterator = this.readyAsyncCalls.iterator();
       while (iterator.hasNext()) {
          RealCall$AsyncCall uAsyncCall = iterator.next();
          if (this.runningAsyncCalls.size() >= this.maxRequests) {
             break ;
          }else if(this.runningCallsForHost(uAsyncCall) >= this.maxRequestsPerHost){
             continue ;
          }else {
             iterator.remove();
             uArrayList.add(uAsyncCall);
             this.runningAsyncCalls.add(uAsyncCall);
          }
       }
       int i = 0;
       boolean b = (this.runningCallsCount() > 0)? true: false;
       _monitor_exit(this);
       int i1 = uArrayList.size();
       for (; i < i1; i = i + 1) {
          uArrayList.get(i).executeOn(this.executorService());
       }
       return b;
    }
    public synchronized List queuedCalls(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.readyAsyncCalls.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().get());
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public synchronized int queuedCallsCount(){
       return this.readyAsyncCalls.size();
    }
    public synchronized List runningCalls(){
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.runningSyncCalls);
       Iterator iterator = this.runningAsyncCalls.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().get());
       }
       return Collections.unmodifiableList(uArrayList);
    }
    public synchronized int runningCallsCount(){
       return (this.runningAsyncCalls.size() + this.runningSyncCalls.size());
    }
    public final int runningCallsForHost(RealCall$AsyncCall p0){
       Iterator iterator = this.runningAsyncCalls.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          RealCall$AsyncCall uAsyncCall = iterator.next();
          if (uAsyncCall.get().forWebSocket == null && (uAsyncCall.host()).equals(p0.host())) {
             i = i + 1;
          }
       }
       return i;
    }
    public synchronized void setIdleCallback(Runnable p0){
       this.idleCallback = p0;
    }
    public void setMaxRequests(int p0){
       if (p0 < 1) {
          throw new IllegalArgumentException("max < 1: "+p0);
       }
       _monitor_enter(this);
       this.maxRequests = p0;
       _monitor_exit(this);
       this.promoteAndExecute();
       return;
    }
    public void setMaxRequestsPerHost(int p0){
       if (p0 < 1) {
          throw new IllegalArgumentException("max < 1: "+p0);
       }
       _monitor_enter(this);
       this.maxRequestsPerHost = p0;
       _monitor_exit(this);
       this.promoteAndExecute();
       return;
    }
}
