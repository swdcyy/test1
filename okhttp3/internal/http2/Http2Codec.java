package okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http.HttpCodec;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.OkHttpClient;
import okhttp3.Interceptor$Chain;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Headers;
import java.util.ArrayList;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import okhttp3.HttpUrl;
import okhttp3.internal.http.RequestLine;
import java.util.Locale;
import okhttp3.Response$Builder;
import okhttp3.Headers$Builder;
import java.lang.StringBuilder;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.Internal;
import java.net.ProtocolException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Stream;
import okio.m;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http2.Http2Codec$StreamFinishingSource;
import okio.n;
import okhttp3.internal.http.RealResponseBody;
import okio.d;
import okio.l;
import okhttp3.RequestBody;
import okio.o;
import java.util.concurrent.TimeUnit;

public final class Http2Codec implements HttpCodec	// class@001f9f
{
    public final Interceptor$Chain chain;
    public final Http2Connection connection;
    public final Protocol protocol;
    public Http2Stream stream;
    public final StreamAllocation streamAllocation;
    public static final List HTTP_2_SKIPPED_REQUEST_HEADERS;
    public static final List HTTP_2_SKIPPED_RESPONSE_HEADERS;

    static {
       String[] stringArray = new String[]{"connection","host","keep-alive","proxy-connection","te","transfer-encoding","encoding","upgrade",":method",":path",":scheme",":authority"};
       Http2Codec.HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(stringArray);
       stringArray = new String[]{"connection","host","keep-alive","proxy-connection","te","transfer-encoding","encoding","upgrade"};
       Http2Codec.HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(stringArray);
    }
    public void Http2Codec(OkHttpClient p0,Interceptor$Chain p1,StreamAllocation p2,Http2Connection p3){
       super();
       this.chain = p1;
       this.streamAllocation = p2;
       this.connection = p3;
       Protocol h2_PRIOR_KNO = Protocol.H2_PRIOR_KNOWLEDGE;
       if (p0.protocols().contains(h2_PRIOR_KNO)) {
       }else {
          h2_PRIOR_KNO = Protocol.HTTP_2;
       }
       this.protocol = h2_PRIOR_KNO;
       return;
    }
    public static List http2HeadersList(Request p0){
       Headers headers = p0.headers();
       ArrayList uArrayList = new ArrayList((headers.size() + 4));
       uArrayList.add(new Header(Header.TARGET_METHOD, p0.method()));
       uArrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(p0.url())));
       String str = p0.header("Host");
       if (str != null) {
          uArrayList.add(new Header(Header.TARGET_AUTHORITY, str));
       }
       uArrayList.add(new Header(Header.TARGET_SCHEME, p0.url().scheme()));
       int i = 0;
       int i1 = headers.size();
       while (i < i1) {
          ByteString uByteString = ByteString.encodeUtf8((headers.name(i)).toLowerCase(Locale.US));
          if (!Http2Codec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(uByteString.utf8())) {
             uArrayList.add(new Header(uByteString, headers.value(i)));
          }
          i++;
       }
       return uArrayList;
    }
    public static Response$Builder readHttp2HeadersList(Headers p0,Protocol p1){
       Headers$Builder uBuilder = new Headers$Builder();
       int i = p0.size();
       StringBuilder str = null;
       int i1 = 0;
       while (i1 < i) {
          String str1 = p0.name(i1);
          String str2 = p0.value(i1);
          if (str1.equals(":status")) {
             str = StatusLine.parse("HTTP/1.1 "+str2);
          }else if(!Http2Codec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(str1)){
             Internal.instance.addLenient(uBuilder, str1, str2);
          }
          i1 = i1 + 1;
       }
       if (str != null) {
          return new Response$Builder().protocol(p1).code(str.code).message(str.message).headers(uBuilder.build());
       }
       throw new ProtocolException("Expected \':status\' header not present");
    }
    public void cancel(){
       Http2Codec tstream = this.stream;
       if (tstream != null) {
          tstream.closeLater(ErrorCode.CANCEL);
       }
       return;
    }
    public m createRequestBody(Request p0,long p1){
       return this.stream.getSink();
    }
    public void finishRequest(){
       this.stream.getSink().close();
    }
    public void flushRequest(){
       this.connection.flush();
    }
    public ResponseBody openResponseBody(Response p0){
       Http2Codec tstreamAlloc = this.streamAllocation;
       tstreamAlloc.eventListener.responseBodyStart(tstreamAlloc.call);
       return new RealResponseBody(p0.header("Content-Type"), HttpHeaders.contentLength(p0), l.d(new Http2Codec$StreamFinishingSource(this, this.stream.getSource())));
    }
    public Response$Builder readResponseHeaders(boolean p0){
       Response$Builder uBuilder = Http2Codec.readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
       if (p0 && Internal.instance.code(uBuilder) == 100) {
          return null;
       }
       return uBuilder;
    }
    public void writeRequestHeaders(Request p0){
       if (this.stream != null) {
          return;
       }
       boolean b = (p0.body() != null)? true: false;
       Http2Stream http2Stream = this.connection.newStream(Http2Codec.http2HeadersList(p0), b);
       this.stream = http2Stream;
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       http2Stream.readTimeout().timeout((long)this.chain.readTimeoutMillis(), mILLISECONDS);
       this.stream.writeTimeout().timeout((long)this.chain.writeTimeoutMillis(), mILLISECONDS);
       return;
    }
}
