package okhttp3.internal.ws.RealWebSocket;
import okhttp3.WebSocket;
import okhttp3.internal.ws.WebSocketReader$FrameCallback;
import okhttp3.Protocol;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import okhttp3.Request;
import okhttp3.WebSocketListener;
import java.util.Random;
import java.util.ArrayDeque;
import java.lang.String;
import okio.ByteString;
import okhttp3.internal.ws.RealWebSocket$1;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.Call;
import okhttp3.Response;
import java.net.ProtocolException;
import okhttp3.internal.ws.WebSocketProtocol;
import okhttp3.internal.ws.RealWebSocket$Close;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import okhttp3.EventListener;
import okhttp3.Request$Builder;
import okhttp3.internal.Internal;
import okio.o;
import okhttp3.internal.ws.RealWebSocket$2;
import okhttp3.Callback;
import java.lang.Exception;
import java.util.concurrent.ScheduledFuture;
import java.lang.Throwable;
import java.io.Closeable;
import okhttp3.internal.Util;
import okhttp3.internal.ws.RealWebSocket$Streams;
import okhttp3.internal.ws.WebSocketWriter;
import okio.c;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.ws.RealWebSocket$PingRunnable;
import java.lang.Runnable;
import okhttp3.internal.ws.WebSocketReader;
import okio.d;
import java.lang.IllegalStateException;
import java.util.Objects;
import okhttp3.internal.ws.RealWebSocket$Message;
import okhttp3.internal.ws.RealWebSocket$CancelRunnable;
import okio.m;
import okio.l;
import cud.j;
import java.lang.AssertionError;
import java.net.SocketTimeoutException;

public final class RealWebSocket implements WebSocket, WebSocketReader$FrameCallback	// class@001fdc
{
    public boolean awaitingPong;
    public Call call;
    public ScheduledFuture cancelFuture;
    public boolean enqueuedClose;
    public ScheduledExecutorService executor;
    public boolean failed;
    public final String key;
    public final WebSocketListener listener;
    public final ArrayDeque messageAndCloseQueue;
    public final Request originalRequest;
    public final long pingIntervalMillis;
    public final ArrayDeque pongQueue;
    public long queueSize;
    public final Random random;
    public WebSocketReader reader;
    public int receivedCloseCode;
    public String receivedCloseReason;
    public int receivedPingCount;
    public int receivedPongCount;
    public int sentPingCount;
    public RealWebSocket$Streams streams;
    public WebSocketWriter writer;
    public final Runnable writerRunnable;
    public static final boolean $assertionsDisabled;
    public static final List ONLY_HTTP1;

    static {
       RealWebSocket.ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    }
    public void RealWebSocket(Request p0,WebSocketListener p1,Random p2,long p3){
       super();
       this.pongQueue = new ArrayDeque();
       this.messageAndCloseQueue = new ArrayDeque();
       this.receivedCloseCode = -1;
       if (!("GET").equals(p0.method())) {
          throw new IllegalArgumentException("Request must be GET: "+p0.method());
       }
       this.originalRequest = p0;
       this.listener = p1;
       this.random = p2;
       this.pingIntervalMillis = p3;
       byte[] uobyteArray = new byte[16];
       p2.nextBytes(uobyteArray);
       this.key = ByteString.of(uobyteArray).base64();
       this.writerRunnable = new RealWebSocket$1(this);
       return;
    }
    public void awaitTermination(int p0,TimeUnit p1){
       this.executor.awaitTermination((long)p0, p1);
    }
    public void cancel(){
       this.call.cancel();
    }
    public void checkResponse(Response p0){
       if (p0.code() != 101) {
          throw new ProtocolException("Expected HTTP 101 response but was \'"+p0.code()+" "+p0.message()+"\'");
       }
       String str = p0.header("Connection");
       String str1 = "Upgrade";
       if (!str1.equalsIgnoreCase(str)) {
          throw new ProtocolException("Expected \'Connection\' header value \'Upgrade\' but was \'"+str+"\'");
       }
       str = p0.header(str1);
       if (!("websocket").equalsIgnoreCase(str)) {
          throw new ProtocolException("Expected \'Upgrade\' header value \'websocket\' but was \'"+str+"\'");
       }
       String str2 = p0.header("Sec-WebSocket-Accept");
       str = ByteString.encodeUtf8(this.key+"258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
       if (str.equals(str2)) {
          return;
       }
       throw new ProtocolException("Expected \'Sec-WebSocket-Accept\' header value \'"+str+"\' but was \'"+str2+"\'");
    }
    public boolean close(int p0,String p1){
       return this.close(p0, p1, 0xea60);
    }
    public synchronized boolean close(int p0,String p1,long p2){
       WebSocketProtocol.validateCloseCode(p0);
       ByteString uByteString = null;
       if (p1 != null) {
          uByteString = ByteString.encodeUtf8(p1);
          if ((long)uByteString.size() - 123 > 0) {
             throw new IllegalArgumentException("reason.size\(\) > 123: "+p1);
          }
       }
       if (this.failed != null || this.enqueuedClose != null) {
          return false;
       }else {
          this.enqueuedClose = true;
          this.messageAndCloseQueue.add(new RealWebSocket$Close(p0, uByteString, p2));
          this.runWriter();
          return true;
       }
    }
    public void connect(OkHttpClient p0){
       Request request = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
       Call uCall = Internal.instance.newWebSocketCall(p0.newBuilder().eventListener(EventListener.NONE).protocols(RealWebSocket.ONLY_HTTP1).build(), request);
       this.call = uCall;
       uCall.timeout().clearTimeout();
       this.call.enqueue(new RealWebSocket$2(this, request));
    }
    public void failWebSocket(Exception p0,Response p1){
       _monitor_enter(this);
       if (this.failed != null) {
          _monitor_exit(this);
          return;
       }else {
          this.failed = true;
          RealWebSocket tstreams = this.streams;
          this.streams = null;
          RealWebSocket tcancelFutur = this.cancelFuture;
          if (tcancelFutur != null) {
             tcancelFutur.cancel(false);
          }
          tcancelFutur = this.executor;
          if (tcancelFutur != null) {
             tcancelFutur.shutdown();
          }
          _monitor_exit(this);
          this.listener.onFailure(this, p0, p1);
          Util.closeQuietly(tstreams);
          return;
       }
    }
    public void initReaderAndWriter(String p0,RealWebSocket$Streams p1){
       _monitor_enter(this);
       this.streams = p1;
       this.writer = new WebSocketWriter(p1.client, p1.sink, this.random);
       ScheduledThreadPoolExecutor scheduledThr = new ScheduledThreadPoolExecutor(1, Util.threadFactory(p0, false));
       this.executor = scheduledThr;
       if (this.pingIntervalMillis) {
          RealWebSocket tpingInterva = this.pingIntervalMillis;
          scheduledThr.scheduleAtFixedRate(new RealWebSocket$PingRunnable(this), tpingInterva, tpingInterva, TimeUnit.MILLISECONDS);
       }
       if (!this.messageAndCloseQueue.isEmpty()) {
          this.runWriter();
       }
       _monitor_exit(this);
       this.reader = new WebSocketReader(p1.client, p1.source, this);
       return;
    }
    public void loopReader(){
       while (this.receivedCloseCode == -1) {
          this.reader.processNextFrame();
       }
       return;
    }
    public void onReadClose(int p0,String p1){
       RealWebSocket tcancelFutur;
       int i = -1;
       if (p0 == i) {
          throw new IllegalArgumentException();
       }
       _monitor_enter(this);
       if (this.receivedCloseCode != i) {
          throw new IllegalStateException("already closed");
       }
       this.receivedCloseCode = p0;
       this.receivedCloseReason = p1;
       RealWebSocket$Streams streams = null;
       if (this.enqueuedClose != null && this.messageAndCloseQueue.isEmpty()) {
          RealWebSocket tstreams = this.streams;
          this.streams = streams;
          tcancelFutur = this.cancelFuture;
          if (tcancelFutur != null) {
             tcancelFutur.cancel(false);
          }
          this.executor.shutdown();
          tcancelFutur = tstreams;
       }
       _monitor_exit(this);
       this.listener.onClosing(this, p0, p1);
       if (tcancelFutur != null) {
          this.listener.onClosed(this, p0, p1);
       }
       Util.closeQuietly(tcancelFutur);
       return;
    }
    public void onReadMessage(String p0){
       this.listener.onMessage(this, p0);
    }
    public void onReadMessage(ByteString p0){
       this.listener.onMessage(this, p0);
    }
    public synchronized void onReadPing(ByteString p0){
       if (this.failed != null || (this.enqueuedClose != null && this.messageAndCloseQueue.isEmpty())) {
          return;
       }
       this.pongQueue.add(p0);
       this.runWriter();
       this.receivedPingCount = this.receivedPingCount + 1;
       return;
    }
    public synchronized void onReadPong(ByteString p0){
       this.receivedPongCount = this.receivedPongCount + 1;
       this.awaitingPong = false;
    }
    public synchronized boolean pong(ByteString p0){
       if (this.failed != null || (this.enqueuedClose != null && this.messageAndCloseQueue.isEmpty())) {
          return false;
       }
       this.pongQueue.add(p0);
       this.runWriter();
       return true;
    }
    public boolean processNextFrame(){
       boolean b = false;
       try{
          this.reader.processNextFrame();
          if (this.receivedCloseCode == -1) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e1){
          this.failWebSocket(e1, null);
          return b;
       }
    }
    public synchronized long queueSize(){
       return this.queueSize;
    }
    public synchronized int receivedPingCount(){
       return this.receivedPingCount;
    }
    public synchronized int receivedPongCount(){
       return this.receivedPongCount;
    }
    public Request request(){
       return this.originalRequest;
    }
    public final void runWriter(){
       RealWebSocket texecutor = this.executor;
       if (texecutor != null) {
          texecutor.execute(this.writerRunnable);
       }
       return;
    }
    public boolean send(String p0){
       Objects.requireNonNull(p0, "text == null");
       return this.send(ByteString.encodeUtf8(p0), 1);
    }
    public boolean send(ByteString p0){
       Objects.requireNonNull(p0, "bytes == null");
       return this.send(p0, 2);
    }
    public synchronized final boolean send(ByteString p0,int p1){
       boolean b = false;
       if (this.failed != null || this.enqueuedClose != null) {
          return b;
       }
       if ((this.queueSize + (long)p0.size()) - 0x1000000 > 0) {
          this.close(1001, null);
          return b;
       }else {
          this.queueSize = this.queueSize + (long)p0.size();
          this.messageAndCloseQueue.add(new RealWebSocket$Message(p1, p0));
          this.runWriter();
          return true;
       }
    }
    public synchronized int sentPingCount(){
       return this.sentPingCount;
    }
    public void tearDown(){
       RealWebSocket tcancelFutur = this.cancelFuture;
       if (tcancelFutur != null) {
          tcancelFutur.cancel(false);
       }
       this.executor.shutdown();
       this.executor.awaitTermination(10, TimeUnit.SECONDS);
       return;
    }
    public boolean writeOneFrame(){
       RealWebSocket treceivedClo;
       RealWebSocket treceivedClo1;
       RealWebSocket$Streams streams1;
       _monitor_enter(this);
       boolean b = false;
       if (this.failed != null) {
          _monitor_exit(this);
          return b;
       }else {
          RealWebSocket twriter = this.writer;
          ByteString uByteString = this.pongQueue.poll();
          RealWebSocket realWebSocke = -1;
          RealWebSocket$Streams streams = null;
          if (uByteString == null) {
             Object obj = this.messageAndCloseQueue.poll();
             if (obj instanceof RealWebSocket$Close) {
                treceivedClo = this.receivedCloseCode;
                treceivedClo1 = this.receivedCloseReason;
                if (treceivedClo != realWebSocke) {
                   realWebSocke = this.streams;
                   this.streams = streams;
                   this.executor.shutdown();
                   streams = obj;
                   RealWebSocket realWebSocke1 = realWebSocke;
                   realWebSocke = treceivedClo;
                   treceivedClo = realWebSocke1;
                }else {
                   this.cancelFuture = this.executor.schedule(new RealWebSocket$CancelRunnable(this), obj.cancelAfterCloseMillis, TimeUnit.MILLISECONDS);
                   realWebSocke = treceivedClo;
                   streams1 = streams;
                }
             }else if(obj == null){
                _monitor_exit(this);
                return b;
             }else {
                streams1 = streams;
                treceivedClo1 = streams1;
             }
             streams = obj;
          }else {
             streams1 = streams;
             treceivedClo1 = streams1;
          }
          _monitor_exit(this);
          if (uByteString != null) {
             twriter.writePong(uByteString);
          }else if(streams instanceof RealWebSocket$Message){
             RealWebSocket$Message data = streams.data;
             j oj = l.c(twriter.newMessageSink(streams.formatOpcode, (long)data.size()));
             oj.Y0(data);
             oj.close();
             _monitor_enter(this);
             this.queueSize = this.queueSize - (long)data.size();
             _monitor_exit(this);
          }else if(streams instanceof RealWebSocket$Close){
             twriter.writeClose(streams.code, streams.reason);
             if (treceivedClo != null) {
                this.listener.onClosed(this, realWebSocke, treceivedClo1);
             }
          }else {
             throw new AssertionError();
          }
          Util.closeQuietly(treceivedClo);
          return true;
       }
    }
    public void writePingFrame(){
       _monitor_enter(this);
       if (this.failed != null) {
          _monitor_exit(this);
          return;
       }else {
          RealWebSocket twriter = this.writer;
          StringBuilder str = -1;
          RealWebSocket tsentPingCou = (this.awaitingPong != null)? this.sentPingCount: -1;
          this.sentPingCount = this.sentPingCount + 1;
          this.awaitingPong = true;
          _monitor_exit(this);
          if (tsentPingCou != str) {
             this.failWebSocket(new SocketTimeoutException("sent ping but didn\'t receive pong within "+this.pingIntervalMillis+"ms \(after "+(tsentPingCou - 1)+" successful ping/pongs\)"), null);
             return;
          }else {
             try{
                twriter.writePing(ByteString.EMPTY);
             }catch(java.io.IOException e0){
                this.failWebSocket(e0, null);
             }
             return;
          }
       }
    }
}
