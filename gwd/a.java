package gwd.a;
import java.lang.Runnable;
import fwd.b;
import fwd.a;
import java.net.URI;
import org.java_websocket.drafts.c;
import org.java_websocket.drafts.b;
import java.util.Map;
import java.net.Proxy;
import java.util.concurrent.CountDownLatch;
import fwd.d;
import org.java_websocket.c;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.Socket;
import org.java_websocket.enums.ReadyState;
import java.io.IOException;
import javax.net.ssl.SSLException;
import java.lang.Exception;
import java.util.concurrent.BlockingQueue;
import java.nio.ByteBuffer;
import jwd.h;
import jwd.f;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;
import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.io.OutputStream;
import gwd.a$a;
import java.lang.RuntimeException;
import java.util.Objects;
import org.java_websocket.enums.Role;
import org.java_websocket.enums.Opcode;
import iwd.b;
import iwd.a;
import org.java_websocket.framing.e;
import org.java_websocket.framing.d;
import org.java_websocket.framing.c;
import java.lang.Throwable;
import iwd.c;
import jwd.d;
import jwd.g;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import jwd.b;
import jwd.a;
import exd.c;
import org.java_websocket.exceptions.InvalidHandshakeException;

public abstract class a extends a implements Runnable, b	// class@000f68
{
    public CountDownLatch closeLatch;
    public CountDownLatch connectLatch;
    public Thread connectReadThread;
    public int connectTimeout;
    public b draft;
    public d engine;
    public Map headers;
    public OutputStream ostream;
    public Proxy proxy;
    public Socket socket;
    public SocketFactory socketFactory;
    public URI uri;
    public Thread writeThread;

    public void a(URI p0){
       super(p0, new c());
    }
    public void a(URI p0,Map p1){
       super(p0, new c(), p1);
    }
    public void a(URI p0,b p1){
       super(p0, p1, null, 0);
    }
    public void a(URI p0,b p1,Map p2){
       super(p0, p1, p2, 0);
    }
    public void a(URI p0,b p1,Map p2,int p3){
       super();
       this.uri = null;
       this.engine = null;
       this.socket = null;
       this.socketFactory = null;
       this.proxy = Proxy.NO_PROXY;
       this.connectLatch = new CountDownLatch(1);
       this.closeLatch = new CountDownLatch(1);
       this.connectTimeout = 0;
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       if (p1 == null) {
          throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
       }
       this.uri = p0;
       this.draft = p1;
       this.headers = p2;
       this.connectTimeout = p3;
       this.setTcpNoDelay(0);
       this.setReuseAddr(0);
       this.engine = new d(this, p1);
       return;
    }
    public void close(){
       if (this.writeThread != null) {
          this.engine.close(1000);
       }
       return;
    }
    public void close(int p0){
       this.engine.close(p0);
    }
    public void close(int p0,String p1){
       this.engine.close(p0, p1);
    }
    public void closeBlocking(){
       this.close();
       this.closeLatch.await();
    }
    public void closeConnection(int p0,String p1){
       this.engine.closeConnection(p0, p1);
    }
    public void connect(){
       if (this.connectReadThread != null) {
          throw new IllegalStateException("WebSocketClient objects are not reuseable");
       }
       Thread thread = new Thread(this);
       this.connectReadThread = thread;
       thread.setName("WebSocketConnectReadThread-"+this.connectReadThread.getId());
       this.connectReadThread.start();
       return;
    }
    public boolean connectBlocking(){
       this.connect();
       this.connectLatch.await();
       return this.engine.isOpen();
    }
    public boolean connectBlocking(long p0,TimeUnit p1){
       this.connect();
       boolean b = (this.connectLatch.await(p0, p1) && this.engine.isOpen())? true: false;
       return b;
    }
    public Object getAttachment(){
       return this.engine.v;
    }
    public b getConnection(){
       return this.engine;
    }
    public Collection getConnections(){
       return Collections.singletonList(this.engine);
    }
    public b getDraft(){
       return this.draft;
    }
    public InetSocketAddress getLocalSocketAddress(){
       a tengine = this.engine;
       return tengine.d.getLocalSocketAddress(tengine);
    }
    public InetSocketAddress getLocalSocketAddress(b p0){
       a tsocket = this.socket;
       if (tsocket != null) {
          return tsocket.getLocalSocketAddress();
       }
       return null;
    }
    public final int getPort(){
       int port = this.uri.getPort();
       if (port != -1) {
          return port;
       }
       String scheme = this.uri.getScheme();
       if (("wss").equals(scheme)) {
          return 443;
       }
       if (("ws").equals(scheme)) {
          return 80;
       }
       throw new IllegalArgumentException("unknown scheme: "+scheme);
    }
    public ReadyState getReadyState(){
       return this.engine.getReadyState();
    }
    public InetSocketAddress getRemoteSocketAddress(){
       a tengine = this.engine;
       return tengine.d.getRemoteSocketAddress(tengine);
    }
    public InetSocketAddress getRemoteSocketAddress(b p0){
       a tsocket = this.socket;
       if (tsocket != null) {
          return tsocket.getRemoteSocketAddress();
       }
       return null;
    }
    public String getResourceDescriptor(){
       return this.uri.getPath();
    }
    public Socket getSocket(){
       return this.socket;
    }
    public URI getURI(){
       return this.uri;
    }
    public void handleIOException(IOException p0){
       if (p0 instanceof SSLException) {
          this.onError(p0);
       }
       this.engine.h();
       return;
    }
    public boolean hasBufferedData(){
       return (this.engine.b.isEmpty() ^ 0x01);
    }
    public boolean isClosed(){
       return this.engine.isClosed();
    }
    public boolean isClosing(){
       return this.engine.isClosing();
    }
    public boolean isFlushAndClose(){
       return this.engine.isFlushAndClose();
    }
    public boolean isOpen(){
       return this.engine.isOpen();
    }
    public abstract void onClose(int p0,String p1,boolean p2);
    public void onCloseInitiated(int p0,String p1){
    }
    public void onClosing(int p0,String p1,boolean p2){
    }
    public abstract void onError(Exception p0);
    public abstract void onMessage(String p0);
    public void onMessage(ByteBuffer p0){
    }
    public abstract void onOpen(h p0);
    public final void onWebsocketClose(b p0,int p1,String p2,boolean p3){
       this.stopConnectionLostTimer();
       a twriteThread = this.writeThread;
       if (twriteThread != null) {
          twriteThread.interrupt();
       }
       this.onClose(p1, p2, p3);
       this.connectLatch.countDown();
       this.closeLatch.countDown();
       return;
    }
    public void onWebsocketCloseInitiated(b p0,int p1,String p2){
       this.onCloseInitiated(p1, p2);
    }
    public void onWebsocketClosing(b p0,int p1,String p2,boolean p3){
       this.onClosing(p1, p2, p3);
    }
    public final void onWebsocketError(b p0,Exception p1){
       this.onError(p1);
    }
    public final void onWebsocketMessage(b p0,String p1){
       this.onMessage(p1);
    }
    public final void onWebsocketMessage(b p0,ByteBuffer p1){
       this.onMessage(p1);
    }
    public final void onWebsocketOpen(b p0,f p1){
       this.startConnectionLostTimer();
       this.onOpen(p1);
       this.connectLatch.countDown();
    }
    public final void onWriteDemand(b p0){
    }
    public void reconnect(){
       this.reset();
       this.connect();
    }
    public boolean reconnectBlocking(){
       this.reset();
       return this.connectBlocking();
    }
    public final void reset(){
       Thread thread = Thread.currentThread();
       if (thread == this.writeThread || thread == this.connectReadThread) {
          throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
       }
       try{
          this.closeBlocking();
          a twriteThread = this.writeThread;
          Thread thread1 = null;
          if (twriteThread != null) {
             twriteThread.interrupt();
             this.writeThread = thread1;
          }
          twriteThread = this.connectReadThread;
          if (twriteThread != null) {
             twriteThread.interrupt();
             this.connectReadThread = thread1;
          }
          this.draft.o();
          twriteThread = this.socket;
          if (twriteThread != null) {
             twriteThread.close();
             this.socket = thread1;
          }
          this.connectLatch = new CountDownLatch(1);
          this.closeLatch = new CountDownLatch(1);
          this.engine = new d(this, this.draft);
          return;
       }catch(java.lang.Exception e0){
          this.onError(e0);
          this.engine.closeConnection(1006, e0.getMessage());
          return;
       }
    }
    public void run(){
       String str;
       int i = -1;
       try{
          a tsocketFacto = this.socketFactory;
          boolean b = true;
          if (tsocketFacto != null) {
             this.socket = tsocketFacto.createSocket();
          }else {
             tsocketFacto = this.socket;
             if (tsocketFacto == null) {
                this.socket = new Socket(this.proxy);
                str = 1;
             label_0024 :
                this.socket.setTcpNoDelay(this.isTcpNoDelay());
                this.socket.setReuseAddress(this.isReuseAddr());
                if (!this.socket.isBound()) {
                   this.socket.connect(new InetSocketAddress(this.uri.getHost(), this.getPort()), this.connectTimeout);
                }
                if (str && ("wss").equals(this.uri.getScheme())) {
                   SSLContext instance = SSLContext.getInstance("TLSv1.2");
                   instance.init(null, null, null);
                   this.socket = instance.getSocketFactory().createSocket(this.socket, this.uri.getHost(), this.getPort(), b);
                }
                InputStream inputStream = this.socket.getInputStream();
                this.ostream = this.socket.getOutputStream();
                this.sendHandshake();
                Thread thread = new Thread(new a$a(this, this));
                this.writeThread = thread;
                thread.start();
                byte[] uobyteArray = new byte[0x4000];
                try{
                   while (!this.isClosing() && !this.isClosed()) {
                      int i1 = inputStream.read(uobyteArray);
                      if (i1 != i) {
                         this.engine.f(ByteBuffer.wrap(uobyteArray, 0, i1));
                      }else {
                         break ;
                      }
                   }
                   this.engine.h();
                }catch(java.io.IOException e0){
                   this.handleIOException(e0);
                }catch(java.lang.RuntimeException e0){
                   this.onError(e0);
                   this.engine.closeConnection(1006, e0.getMessage());
                }
                this.connectReadThread = null;
                return;
             }else if(!tsocketFacto.isClosed()){
                try{
                   throw new IOException();
                }catch(java.lang.Exception e1){
                   this.onWebsocketError(this.engine, e1);
                   this.engine.closeConnection(i, e1.getMessage());
                   return;
                }
             }
          }
          str = null;
          goto label_0024 ;
       }catch(java.lang.Exception e1){
       }
    }
    public void send(String p0){
       a tengine = this.engine;
       Objects.requireNonNull(tengine);
       if (p0 == null) {
          throw new IllegalArgumentException("Cannot send \'null\' data to a WebSocketImpl.");
       }
       d k = tengine.k;
       boolean b = (tengine.l == Role.CLIENT)? true: false;
       tengine.p(k.f(p0, b));
       return;
    }
    public void send(ByteBuffer p0){
       this.engine.send(p0);
    }
    public void send(byte[] p0){
       a tengine = this.engine;
       Objects.requireNonNull(tengine);
       tengine.send(ByteBuffer.wrap(p0));
    }
    public void sendFragmentedFrame(Opcode p0,ByteBuffer p1,boolean p2){
       b uob;
       a tengine = this.engine;
       d k = tengine.k;
       Objects.requireNonNull(k);
       Opcode bINARY = Opcode.BINARY;
       if (p0 != bINARY && p0 != Opcode.TEXT) {
          throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
       }
       if (k.b != null) {
          uob = new b();
       }else {
          k.b = p0;
          if (p0 == bINARY) {
             uob = new a();
          }else if(p0 == Opcode.TEXT){
             uob = new e();
          }else {
             uob = null;
          }
       }
       uob.d(p1);
       try{
          uob.c(p2);
          uob.b();
          k.b = (p2)? null: p0;
          tengine.p(Collections.singletonList(uob));
          return;
       }catch(org.java_websocket.exceptions.InvalidDataException e6){
          throw new IllegalArgumentException(e6);
       }
    }
    public void sendFrame(c p0){
       this.engine.sendFrame(p0);
    }
    public void sendFrame(Collection p0){
       this.engine.p(p0);
    }
    public final void sendHandshake(){
       String rawPath = this.uri.getRawPath();
       String rawQuery = this.uri.getRawQuery();
       if (rawPath == null || !rawPath.length()) {
          rawPath = "/";
       }
       if (rawQuery != null) {
          rawPath = rawPath+'?'+rawQuery;
       }
       int port = this.getPort();
       StringBuilder str = this.uri.getHost();
       rawQuery = (port != 80 && port != 443)? ":"+port: "";
       d uod = new d();
       uod.setResourceDescriptor(rawPath);
       uod.put("Host", str+rawQuery);
       a theaders = this.headers;
       if (theaders != null) {
          Iterator iterator = theaders.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             uod.put(key, uEntry.getValue());
          }
       }
       theaders = this.engine;
       theaders.n = theaders.k.k(uod);
       rawQuery = uod.getResourceDescriptor();
       try{
          theaders.r = rawQuery;
          theaders.d.onWebsocketHandshakeSentAsClient(theaders, theaders.n);
          theaders.s(theaders.k.h(theaders.n));
          return;
       }catch(org.java_websocket.exceptions.InvalidDataException e0){
          throw new InvalidHandshakeException("Handshake data rejected by client.");
       }catch(java.lang.RuntimeException e1){
          d.w.error("Exception in startHandshake", e1);
          theaders.d.onWebsocketError(theaders, e1);
          throw new InvalidHandshakeException("rejected because of "+e1);
       }
    }
    public void sendPing(){
       this.engine.sendPing();
    }
    public void setAttachment(Object p0){
       this.engine.v = p0;
    }
    public void setProxy(Proxy p0){
       if (p0 == null) {
          throw new IllegalArgumentException();
       }
       this.proxy = p0;
       return;
    }
    public void setSocket(Socket p0){
       if (this.socket != null) {
          throw new IllegalStateException("socket has already been set");
       }
       this.socket = p0;
       return;
    }
    public void setSocketFactory(SocketFactory p0){
       this.socketFactory = p0;
    }
}
