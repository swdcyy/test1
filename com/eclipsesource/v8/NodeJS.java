package com.eclipsesource.v8.NodeJS;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.eclipsesource.v8.NodeJS$1;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.io.PrintWriter;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.NodeJS$2;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.Releasable;

public class NodeJS	// class@000fce
{
    public String nodeVersion;
    public V8Function require;
    public V8 v8;

    public void NodeJS(V8 p0){
       super();
       this.nodeVersion = null;
       this.v8 = p0;
    }
    public static NodeJS createNodeJS(){
       return NodeJS.createNodeJS(null);
    }
    public static NodeJS createNodeJS(File p0){
       V8 v8 = V8.createV8Runtime("global");
       NodeJS nodeJS = new NodeJS(v8);
       NodeJS$1 u1 = new NodeJS$1(nodeJS);
       String str = "__run";
       try{
          v8.registerJavaMethod(u1, str);
          File uFile = NodeJS.createTemporaryScriptFile("global.__run\(require, exports, module, __filename, __dirname\);", "startup");
          v8.createNodeRuntime(uFile.getAbsolutePath());
          uFile.delete();
          if (p0 != null) {
             nodeJS.exec(p0);
          }
          return nodeJS;
       }catch(java.io.IOException e4){
          throw new RuntimeException(e4);
       }
    }
    public static File createTemporaryScriptFile(String p0,String p1){
       File uFile = File.createTempFile(p1, ".js.tmp");
       PrintWriter printWriter = new PrintWriter(uFile, "UTF-8");
       printWriter.print(p0);
       printWriter.close();
       return uFile;
    }
    public final V8Function createScriptExecutionCallback(File p0){
       return new V8Function(this.v8, new NodeJS$2(this, p0));
    }
    public void exec(File p0){
       V8Function v8Function = this.createScriptExecutionCallback(p0);
       V8Object object = this.v8.getObject("process");
       V8Array v8Array = new V8Array(this.v8);
       v8Array.push(v8Function);
       object.executeObjectFunction("nextTick", v8Array);
       this.safeRelease(object);
       this.safeRelease(v8Array);
       this.safeRelease(v8Function);
    }
    public String getNodeVersion(){
       NodeJS tnodeVersion = this.nodeVersion;
       if (tnodeVersion != null) {
          return tnodeVersion;
       }
       V8Object object = this.v8.getObject("process");
       V8Object object1 = object.getObject("versions");
       this.nodeVersion = object1.getString("node");
       this.safeRelease(object);
       this.safeRelease(object1);
       return this.nodeVersion;
    }
    public V8 getRuntime(){
       return this.v8;
    }
    public boolean handleMessage(){
       this.v8.checkThread();
       return this.v8.pumpMessageLoop();
    }
    public void init(V8Function p0){
       this.require = p0;
    }
    public boolean isRunning(){
       this.v8.checkThread();
       return this.v8.isRunning();
    }
    public void release(){
       this.v8.checkThread();
       if (!this.require.isReleased()) {
          this.require.close();
       }
       if (!this.v8.isReleased()) {
          this.v8.close();
       }
       return;
    }
    public V8Object require(File p0){
       this.v8.checkThread();
       V8Array v8Array = new V8Array(this.v8);
       v8Array.push(p0.getAbsolutePath());
       v8Array.close();
       return this.require.call(null, v8Array);
    }
    public final void safeRelease(Releasable p0){
       if (p0 != null) {
          p0.release();
       }
       return;
    }
}
