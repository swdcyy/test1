package okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http.HttpCodec;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.StreamAllocation;
import okio.d;
import okio.c;
import java.lang.Object;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Request;
import okio.m;
import java.lang.String;
import java.lang.IllegalStateException;
import okio.h;
import okio.o;
import kotlin.jvm.internal.a;
import okhttp3.internal.http1.Http1Codec$ChunkedSink;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import okio.n;
import okhttp3.internal.http1.Http1Codec$ChunkedSource;
import okhttp3.internal.http1.Http1Codec$FixedLengthSink;
import okhttp3.internal.http1.Http1Codec$FixedLengthSource;
import okhttp3.internal.http1.Http1Codec$UnknownLengthSource;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.l;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import okhttp3.internal.Internal;
import okhttp3.Response$Builder;
import okhttp3.internal.http.StatusLine;
import okhttp3.Protocol;
import java.io.IOException;
import java.lang.Throwable;
import okhttp3.Route;
import java.net.Proxy;
import java.net.Proxy$Type;
import okhttp3.internal.http.RequestLine;

public final class Http1Codec implements HttpCodec	// class@0020c6
{
    public final OkHttpClient client;
    public long headerLimit;
    public final c sink;
    public final d source;
    public int state;
    public final StreamAllocation streamAllocation;

    public void Http1Codec(OkHttpClient p0,StreamAllocation p1,d p2,c p3){
       super();
       this.state = 0;
       this.headerLimit = 0x40000;
       this.client = p0;
       this.streamAllocation = p1;
       this.source = p2;
       this.sink = p3;
    }
    public void cancel(){
       RealConnection realConnecti = this.streamAllocation.connection();
       if (realConnecti != null) {
          realConnecti.cancel();
       }
       return;
    }
    public m createRequestBody(Request p0,long p1){
       if (("chunked").equalsIgnoreCase(p0.header("Transfer-Encoding"))) {
          return this.newChunkedSink();
       }
       if (p1 - -1) {
          return this.newFixedLengthSink(p1);
       }
       throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }
    public void detachTimeout(h p0){
       h a = p0.a;
       o nONE = o.NONE;
       a.q(nONE, "delegate");
       p0.a = nONE;
       a.clearDeadline();
       a.clearTimeout();
    }
    public void finishRequest(){
       this.sink.flush();
    }
    public void flushRequest(){
       this.sink.flush();
    }
    public boolean isClosed(){
       boolean b = (this.state == 6)? true: false;
       return b;
    }
    public m newChunkedSink(){
       if (this.state != 1) {
          throw new IllegalStateException("state: "+this.state);
       }
       this.state = 2;
       return new Http1Codec$ChunkedSink(this);
    }
    public n newChunkedSource(HttpUrl p0){
       if (this.state != 4) {
          throw new IllegalStateException("state: "+this.state);
       }
       this.state = 5;
       return new Http1Codec$ChunkedSource(this, p0);
    }
    public m newFixedLengthSink(long p0){
       if (this.state != 1) {
          throw new IllegalStateException("state: "+this.state);
       }
       this.state = 2;
       return new Http1Codec$FixedLengthSink(this, p0);
    }
    public n newFixedLengthSource(long p0){
       if (this.state != 4) {
          throw new IllegalStateException("state: "+this.state);
       }
       this.state = 5;
       return new Http1Codec$FixedLengthSource(this, p0);
    }
    public n newUnknownLengthSource(){
       if (this.state != 4) {
          throw new IllegalStateException("state: "+this.state);
       }
       Http1Codec tstreamAlloc = this.streamAllocation;
       if (tstreamAlloc == null) {
          throw new IllegalStateException("streamAllocation == null");
       }
       this.state = 5;
       tstreamAlloc.noNewStreams();
       return new Http1Codec$UnknownLengthSource(this);
    }
    public ResponseBody openResponseBody(Response p0){
       long l;
       Http1Codec tstreamAlloc = this.streamAllocation;
       tstreamAlloc.eventListener.responseBodyStart(tstreamAlloc.call);
       String str = p0.header("Content-Type");
       if (!HttpHeaders.hasBody(p0)) {
          return new RealResponseBody(str, 0, l.d(this.newFixedLengthSource(0)));
       }
       if (("chunked").equalsIgnoreCase(p0.header("Transfer-Encoding"))) {
          return new RealResponseBody(str, -1, l.d(this.newChunkedSource(p0.request().url())));
       }
       l = HttpHeaders.contentLength(p0);
       if (l - -1) {
          return new RealResponseBody(str, l, l.d(this.newFixedLengthSource(l)));
       }
       return new RealResponseBody(str, -1, l.d(this.newUnknownLengthSource()));
    }
    public final String readHeaderLine(){
       String str = this.source.readUtf8LineStrict(this.headerLimit);
       this.headerLimit = this.headerLimit - (long)str.length();
       return str;
    }
    public Headers readHeaders(){
       Headers$Builder uBuilder = new Headers$Builder();
       String str = this.readHeaderLine();
       while (str.length()) {
          Internal.instance.addLenient(uBuilder, str);
       }
       return uBuilder.build();
    }
    public Response$Builder readResponseHeaders(boolean p0){
       Http1Codec tstate = this.state;
       int i = 3;
       if (tstate != 1 && tstate != i) {
          throw new IllegalStateException("state: "+this.state);
       }
       try{
          StatusLine statusLine = StatusLine.parse(this.readHeaderLine());
          Response$Builder uBuilder = new Response$Builder().protocol(statusLine.protocol).code(statusLine.code).message(statusLine.message).headers(this.readHeaders());
          if (p0 && statusLine.code == 100) {
             return null;
          }
          if (statusLine.code == 100) {
             this.state = i;
             return uBuilder;
          }else {
             this.state = 4;
             return uBuilder;
          }
       }catch(java.io.EOFException e5){
          IOException iOException = new IOException("unexpected end of stream on "+this.streamAllocation);
          iOException.initCause(e5);
          throw iOException;
       }
    }
    public void writeRequest(Headers p0,String p1){
       if (this.state != null) {
          throw new IllegalStateException("state: "+this.state);
       }
       this.sink.writeUtf8(p1).writeUtf8("\r\n");
       int i1 = p0.size();
       for (int i = 0; i < i1; i++) {
          this.sink.writeUtf8(p0.name(i)).writeUtf8(": ").writeUtf8(p0.value(i)).writeUtf8("\r\n");
       }
       this.sink.writeUtf8("\r\n");
       this.state = 1;
       return;
    }
    public void writeRequestHeaders(Request p0){
       this.writeRequest(p0.headers(), RequestLine.get(p0, this.streamAllocation.connection().route().proxy().type()));
    }
}
