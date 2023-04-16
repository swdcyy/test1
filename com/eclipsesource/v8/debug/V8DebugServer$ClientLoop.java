package com.eclipsesource.v8.debug.V8DebugServer$ClientLoop;
import java.lang.Runnable;
import com.eclipsesource.v8.debug.V8DebugServer;
import java.lang.Object;
import com.eclipsesource.v8.debug.V8DebugServer$1;
import java.lang.System;
import java.io.InputStream;
import java.net.Socket;
import java.lang.Math;
import java.lang.String;
import java.nio.charset.Charset;
import java.util.List;
import java.lang.Integer;
import java.io.IOException;
import java.lang.StringBuilder;
import java.net.ServerSocket;
import java.lang.Throwable;

public class V8DebugServer$ClientLoop implements Runnable	// class@000ffa
{
    public int from;
    public final V8DebugServer this$0;

    public void V8DebugServer$ClientLoop(V8DebugServer p0){
       this.this$0 = p0;
       super();
    }
    public void V8DebugServer$ClientLoop(V8DebugServer p0,V8DebugServer$1 p1){
       super(p0);
    }
    public final int indexOf(byte[] p0,byte[] p1,int p2,int p3){
       int len = p0.length;
       while (true) {
          if (p2 < p3) {
             int i = 0;
             while (true) {
                if (i <= len) {
                   if (i == len) {
                      return p2;
                   }
                   int i1 = p2 + i;
                   if (i1 >= p3 || p1[i1] != p0[i]) {
                   label_0017 :
                      p2++;
                   }else {
                      i = i + 1;
                   }
                }else {
                   goto label_0017 ;
                }
             }
             return -1;
          }else {
             goto label_001a ;
          }
       }
    }
    public final byte[] join(byte[] p0,byte[] p1,int p2,int p3){
       byte[] uobyteArray = new byte[(p0.length + p3)];
       System.arraycopy(p0, 0, uobyteArray, 0, p0.length);
       System.arraycopy(p1, p2, uobyteArray, p0.length, p3);
       return uobyteArray;
    }
    public final void processClientRequests(){
       V8DebugServer requests;
       byte[] uobyteArray = new byte[0];
       byte[] uobyteArray1 = new byte[4096];
       V8DebugServer clientLock = this.this$0.clientLock;
       _monitor_enter(clientLock);
       InputStream inputStream = this.this$0.client.getInputStream();
       _monitor_exit(clientLock);
       byte[] uobyteArray2 = uobyteArray;
       int i = 0;
       boolean b = false;
       int i1 = -1;
       int i2 = i - 4096;
       i2 = inputStream.read(uobyteArray1, i, i2);
       while (i2 > 0) {
          i2 = i2 + i;
          this.from = 0;
          do {
             if (i1 < 0) {
                i1 = this.readContentLength(uobyteArray1, i2);
                if (i1 >= 0) {
                label_002e :
                   if (!b) {
                      b = this.skipToolInfo(uobyteArray1, i2);
                      if (b) {
                      }
                   }else {
                   }
                }
             }else {
                goto label_002e ;
             }
             break ;
          } while (this.from >= i2);
          V8DebugServer$ClientLoop tfrom = this.from;
          if (tfrom < i2) {
             int i3 = i2 - tfrom;
             System.arraycopy(uobyteArray1, tfrom, uobyteArray1, 0, i3);
             i = i2 - this.from;
          }else {
             i = 0;
          }
       }
       return;
    }
    public final int readContentLength(byte[] p0,int p1){
       String str;
       byte[] pROTOCOL_CON = V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES;
       int i = this.indexOf(pROTOCOL_CON, p0, this.from, p1);
       int i1 = -1;
       if (i < 0) {
          return i1;
       }
       i = i + pROTOCOL_CON.length;
       pROTOCOL_CON = V8DebugServer.PROTOCOL_EOL_BYTES;
       p1 = this.indexOf(pROTOCOL_CON, p0, i, p1);
       if (p1 < 0) {
          return i1;
       }
       int i2 = p1 - i;
       Charset pROTOCOL_CHA = V8DebugServer.PROTOCOL_CHARSET;
       try{
          str = new String(p0, i, i2, pROTOCOL_CHA);
          this.from = p1 + pROTOCOL_CON.length;
          return Integer.parseInt(str.trim());
       }catch(java.lang.Exception e0){
          throw new IOException("Invalid content length header: \'"+str+"\' in message"+new String(p0, V8DebugServer.PROTOCOL_CHARSET));
       }
    }
    public void run(){
       V8DebugServer clientLock;
       try{
          while (true) {
             Socket socket = this.this$0.server.accept();
             socket.setTcpNoDelay(true);
             clientLock = this.this$0.clientLock;
             _monitor_enter(clientLock);
             V8DebugServer$ClientLoop tthis$0 = this.this$0;
             tthis$0.client = socket;
             tthis$0.waitForConnection = false;
             tthis$0.clientLock.notifyAll();
             _monitor_exit(clientLock);
             this.startHandshake();
             this.processClientRequests();
          }
       }catch(java.lang.Exception e0){
          clientLock = this.this$0.clientLock;
          _monitor_enter(clientLock);
          V8DebugServer client = this.this$0.client;
          if (client != null) {
             client.close();
             this.this$0.client = null;
          }
          _monitor_exit(clientLock);
          this.this$0.logError(e0);
          goto label_0000 ;
       }
    }
    public final boolean skipToolInfo(byte[] p0,int p1){
       byte[] pROTOCOL_EOL = V8DebugServer.PROTOCOL_EOL_BYTES;
       int i = this.indexOf(pROTOCOL_EOL, p0, this.from, p1);
       if (i < 0) {
          return false;
       }
       this.from = i + pROTOCOL_EOL.length;
       return true;
    }
    public final void startHandshake(){
       this.this$0.sendMessage("V8-Version: 4.10.253\r\nProtocol-Version: 1\r\nEmbedding-Host: j2v8 4.0.0\r\nType: connect\r\n", "");
    }
}
