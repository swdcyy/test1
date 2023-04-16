package com.eclipsesource.v8.debug.V8DebugServer;
import java.lang.String;
import java.nio.charset.Charset;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.util.LinkedList;
import com.eclipsesource.v8.V8Object;
import java.lang.System;
import java.io.PrintStream;
import com.eclipsesource.v8.V8Value;
import java.lang.StringBuilder;
import java.net.ServerSocket;
import java.lang.Throwable;
import com.eclipsesource.v8.V8Array;
import java.net.Socket;
import java.lang.Math;
import java.lang.CharSequence;
import java.util.List;
import java.lang.Thread;
import java.lang.Integer;
import java.io.OutputStream;
import java.io.IOException;
import com.eclipsesource.v8.debug.V8DebugServer$EventHandler;
import com.eclipsesource.v8.debug.V8DebugServer$1;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.debug.V8DebugServer$ClientLoop;
import java.lang.Runnable;

public class V8DebugServer	// class@000ffc
{
    public Socket client;
    public Object clientLock;
    public V8Object debugObject;
    public List requests;
    public V8Object runningStateDcp;
    public V8 runtime;
    public ServerSocket server;
    public V8Object stoppedStateDcp;
    public boolean traceCommunication;
    public boolean waitForConnection;
    public static String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    public static final Charset PROTOCOL_CHARSET;
    public static final byte[] PROTOCOL_CONTENT_LENGTH_BYTES;
    public static final byte[] PROTOCOL_EOL_BYTES;

    static {
       Charset uCharset = Charset.forName("UTF-8");
       V8DebugServer.PROTOCOL_CHARSET = uCharset;
       V8DebugServer.PROTOCOL_EOL_BYTES = ("\r\n").getBytes(uCharset);
       V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES = ("Content-Length:").getBytes(uCharset);
    }
    public void V8DebugServer(V8 p0,int p1,boolean p2){
       super();
       this.clientLock = new Object();
       this.traceCommunication = false;
       this.requests = new LinkedList();
       this.runtime = p0;
       this.waitForConnection = p2;
       V8Object object = p0.getObject(V8DebugServer.DEBUG_OBJECT_NAME);
       if (object == null) {
          System.err.println("Cannot initialize debugger server - global debug object not found.");
          return;
       }else {
          this.debugObject = object.getObject("Debug");
          object.close();
          String str = "\(function\(\) {\n "+V8DebugServer.DEBUG_OBJECT_NAME+".Debug. "+"__j2v8_MakeBreakEvent"+" = function \(break_id,breakpoints_hit\) {\n  return new "+V8DebugServer.DEBUG_OBJECT_NAME+".BreakEvent\(break_id,breakpoints_hit\);\n }\n "+V8DebugServer.DEBUG_OBJECT_NAME+".Debug. "+"__j2v8_MakeCompileEvent"+" = function\(script,type\) {\n  var scripts = "+V8DebugServer.DEBUG_OBJECT_NAME+".Debug.scripts\(\)\n  for \(var i in scripts\) {\n   if \(scripts[i].id == script.id\(\)\) {\n     return new "+V8DebugServer.DEBUG_OBJECT_NAME+".CompileEvent\(scripts[i], type\);\n   }\n  }\n  return {toJSONProtocol: function\(\) {return \'\'}}\n }\n}\)\(\)";
          try{
             p0.executeVoidScript(str);
             this.server = new ServerSocket(p1);
          }catch(java.lang.Exception e3){
             this.logError(e3);
          }
          return;
       }
    }
    public static void configureV8ForDebugging(){
       V8.setFlags("-expose-debug-as="+V8DebugServer.DEBUG_OBJECT_NAME);
    }
    public void enterBreakLoop(V8Object p0,V8Object p1){
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(false);
       this.stoppedStateDcp = p0.executeObjectFunction("debugCommandProcessor", v8Array);
       v8Array.close();
       V8Array array = p1.getArray("break_points_hit_");
       v8Array = new V8Array(this.runtime);
       v8Array.push(p0.getInteger("break_id"));
       v8Array.push(array);
       p0 = this.debugObject.executeObjectFunction("__j2v8_MakeBreakEvent", v8Array);
       String str = p0.executeStringFunction("toJSONProtocol", null);
       if (this.traceCommunication != null) {
          System.out.println("Sending event \(Break\):\n"+str);
       }
       this.sendJson(str);
       v8Array.close();
       array.close();
       p0.close();
       try{
          while (this.isConnected() && !this.stoppedStateDcp.executeBooleanFunction("isRunning", null)) {
             long l = 10;
             this.processRequests(l);
          }
          this.stoppedStateDcp.close();
          this.stoppedStateDcp = null;
          return;
       }catch(java.lang.InterruptedException e0){
       }
    }
    public int getPort(){
       V8DebugServer tserver = this.server;
       int localPort = (tserver != null && tserver.isBound())? this.server.getLocalPort(): -1;
       return localPort;
    }
    public boolean isConnected(){
       boolean b;
       V8DebugServer tclientLock = this.clientLock;
       _monitor_enter(tclientLock);
       if (this.server != null) {
          V8DebugServer tclient = this.client;
          if (tclient != null && tclient.isConnected()) {
             b = true;
          label_0014 :
             _monitor_exit(tclientLock);
             return b;
          }
       }
       b = false;
       goto label_0014 ;
    }
    public void logError(Throwable p0){
    }
    public final void processRequest(String p0){
       int i = 1000;
       if (this.traceCommunication != null) {
          System.out.println("Got message: \n"+p0.substring(0, Math.min(p0.length(), i)));
       }
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       V8DebugServer tstoppedStat = this.stoppedStateDcp;
       if (tstoppedStat == null) {
          tstoppedStat = this.runningStateDcp;
       }
       String str = tstoppedStat.executeFunction("processDebugJSONRequest", v8Array).toString();
       if (this.stoppedStateDcp == null) {
          String str1 = "\"running\":false";
          if (str.contains(str1)) {
             str = ((str.replace(str1, "\"running\":true")).replace("\"success\":true", "\"success\":false")).replace("{\"", "{\"message\":\"Client requested suspension is not supported on J2V8.\",\"");
             tstoppedStat.add("running_", true);
          }
       }
       if (this.traceCommunication != null) {
          System.out.println("Returning response: \n"+str.substring(0, Math.min(str.length(), i)));
       }
       this.sendJson(str);
       return;
    }
    public void processRequests(long p0){
       long l1;
       if (this.server == null) {
          return;
       }
       long l = System.currentTimeMillis();
       do {
          V8DebugServer trequests = this.requests;
          _monitor_enter(trequests);
          V8DebugServer trequests1 = this.requests;
          String[] stringArray = new String[trequests1.size()];
          String[] stringArray1 = trequests1.toArray(stringArray);
          this.requests.clear();
          _monitor_exit(trequests);
          int len = stringArray1.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray1[i];
             try{
                this.processRequest(oobject);
             }catch(java.lang.Exception e5){
                this.logError(e5);
             }
             i = i + 1;
          }
          if (stringArray1.length <= 0) {
             v4 = p0;
             if (i > 0) {
                Thread.sleep(10);
             }
             if (i > 0) {
             }
          }
          l1 = l + p0;
       } while (l1 - System.currentTimeMillis() <= 0);
       return;
    }
    public void sendCompileEvent(V8Object p0){
       if (!this.isConnected()) {
          return;
       }
       p0 = p0.getObject("script_");
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(p0);
       v8Array.push(p0.getInteger("type_"));
       V8Object v8Object = this.debugObject.executeObjectFunction("__j2v8_MakeCompileEvent", v8Array);
       String str = v8Object.executeStringFunction("toJSONProtocol", null);
       if (this.traceCommunication != null) {
          System.out.println("Sending event \(CompileEvent\):\n"+str.substring(0, Math.min(str.length(), 1000)));
       }
       if (str.length() > 0) {
          this.sendJson(str);
       }
       v8Array.close();
       p0.close();
       v8Object.close();
       return;
    }
    public final void sendJson(String p0){
       this.sendMessage("", p0.replace("\\/", "/"));
    }
    public void sendMessage(String p0,String p1){
       V8DebugServer tclientLock = this.clientLock;
       _monitor_enter(tclientLock);
       if (!this.isConnected()) {
          throw new IOException("There is no connected client.");
       }
       Charset pROTOCOL_CHA = V8DebugServer.PROTOCOL_CHARSET;
       byte[] bytes = p1.getBytes(pROTOCOL_CHA);
       this.client.getOutputStream().write((p0+"Content-Length:"+Integer.toString(bytes.length)+"\r\n"+"\r\n").getBytes(pROTOCOL_CHA));
       if (bytes.length > 0) {
          this.client.getOutputStream().write(bytes);
       }
       _monitor_exit(tclientLock);
       return;
    }
    public void setTraceCommunication(boolean p0){
       this.traceCommunication = p0;
    }
    public final void setupEventHandler(){
       this.debugObject.registerJavaMethod(new V8DebugServer$EventHandler(this, null), "__j2v8_debug_handler");
       V8Function object = this.debugObject.getObject("__j2v8_debug_handler");
       V8Array v8Array = new V8Array(this.runtime);
       v8Array.push(object);
       this.debugObject.executeFunction("setListener", v8Array);
       if (object != null && !object.isReleased()) {
          object.close();
       }
       if (!v8Array.isReleased()) {
          v8Array.close();
       }
       return;
    }
    public void start(){
       if (this.server == null) {
          return;
       }
       Thread thread = new Thread(new V8DebugServer$ClientLoop(this, null), "J2V8 Debugger Server");
       thread.setDaemon(true);
       thread.start();
       this.setupEventHandler();
       this.runningStateDcp = this.runtime.executeObjectScript("\(function\(\) {return new "+V8DebugServer.DEBUG_OBJECT_NAME+".DebugCommandProcessor\(null, true\)}\)\(\)");
       if (this.waitForConnection != null) {
          V8DebugServer tclientLock = this.clientLock;
          _monitor_enter(tclientLock);
          try{
             while (this.waitForConnection != null) {
                this.clientLock.wait();
             }
             _monitor_exit(tclientLock);
             long l = 100;
             try{
                this.processRequests(l);
             }catch(java.lang.InterruptedException e0){
             }
          }catch(java.lang.InterruptedException e0){
          }
       }
    }
    public void stop(){
       V8DebugServer tclientLock;
       V8Object v8Object = null;
       try{
          this.server.close();
          tclientLock = this.clientLock;
          _monitor_enter(tclientLock);
          V8DebugServer tclient = this.client;
          if (tclient != null) {
             tclient.close();
             this.client = v8Object;
          }
          _monitor_exit(tclientLock);
       }catch(java.io.IOException e1){
          this.logError(e1);
       }
       tclientLock = this.runningStateDcp;
       if (tclientLock != null) {
          tclientLock.close();
          this.runningStateDcp = v8Object;
       }
       tclientLock = this.debugObject;
       if (tclientLock != null) {
          tclientLock.close();
          this.debugObject = v8Object;
       }
       tclientLock = this.stoppedStateDcp;
       if (tclientLock != null) {
          tclientLock.close();
          this.stoppedStateDcp = v8Object;
       }
       return;
    }
}
