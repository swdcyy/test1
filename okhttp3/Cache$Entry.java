package okhttp3.Cache$Entry;
import java.lang.StringBuilder;
import okhttp3.internal.platform.Platform;
import java.lang.String;
import okhttp3.Response;
import java.lang.Object;
import okhttp3.Request;
import okhttp3.HttpUrl;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.Protocol;
import okhttp3.Handshake;
import okio.n;
import okio.d;
import okio.l;
import cud.k;
import okhttp3.Headers$Builder;
import okhttp3.Cache;
import okhttp3.internal.http.StatusLine;
import java.lang.Long;
import okhttp3.CipherSuite;
import java.util.List;
import okhttp3.TlsVersion;
import java.io.IOException;
import java.util.Collections;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import okio.b;
import okio.ByteString;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import okhttp3.internal.cache.DiskLruCache$Snapshot;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import okhttp3.Response$Builder;
import okhttp3.Cache$CacheResponseBody;
import okhttp3.ResponseBody;
import okio.c;
import java.security.cert.CertificateEncodingException;
import okhttp3.internal.cache.DiskLruCache$Editor;
import okio.m;
import cud.j;

public final class Cache$Entry	// class@001f35
{
    public final int code;
    public final Handshake handshake;
    public final String message;
    public final Protocol protocol;
    public final long receivedResponseMillis;
    public final String requestMethod;
    public final Headers responseHeaders;
    public final long sentRequestMillis;
    public final String url;
    public final Headers varyHeaders;
    public static final String RECEIVED_MILLIS;
    public static final String SENT_MILLIS;

    static {
       Cache$Entry.SENT_MILLIS = Platform.get().getPrefix()+"-Sent-Millis";
       Cache$Entry.RECEIVED_MILLIS = Platform.get().getPrefix()+"-Received-Millis";
    }
    public void Cache$Entry(Response p0){
       super();
       this.url = p0.request().url().toString();
       this.varyHeaders = HttpHeaders.varyHeaders(p0);
       this.requestMethod = p0.request().method();
       this.protocol = p0.protocol();
       this.code = p0.code();
       this.message = p0.message();
       this.responseHeaders = p0.headers();
       this.handshake = p0.handshake();
       this.sentRequestMillis = p0.sentRequestAtMillis();
       this.receivedResponseMillis = p0.receivedResponseAtMillis();
    }
    public void Cache$Entry(n p0){
       long l;
       super();
       d uod = l.d(p0);
       d uod1 = uod;
       this.url = uod1.readUtf8LineStrict();
       this.requestMethod = uod1.readUtf8LineStrict();
       Headers$Builder uBuilder = new Headers$Builder();
       int i = Cache.readInt(uod);
       int i1 = 0;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          uBuilder.addLenient(uod1.readUtf8LineStrict());
       }
       this.varyHeaders = uBuilder.build();
       StatusLine statusLine = StatusLine.parse(uod1.readUtf8LineStrict());
       this.protocol = statusLine.protocol;
       this.code = statusLine.code;
       this.message = statusLine.message;
       uBuilder = new Headers$Builder();
       i = Cache.readInt(uod);
       for (; i1 < i; i1 = i1 + 1) {
          uBuilder.addLenient(uod1.readUtf8LineStrict());
       }
       String sENT_MILLIS = Cache$Entry.SENT_MILLIS;
       String str = uBuilder.get(sENT_MILLIS);
       String rECEIVED_MIL = Cache$Entry.RECEIVED_MILLIS;
       String str1 = uBuilder.get(rECEIVED_MIL);
       uBuilder.removeAll(sENT_MILLIS);
       uBuilder.removeAll(rECEIVED_MIL);
       l = 0;
       long l1 = (str != null)? Long.parseLong(str): l;
       this.sentRequestMillis = l1;
       if (str1 != null) {
          l = Long.parseLong(str1);
       }
       this.receivedResponseMillis = l;
       this.responseHeaders = uBuilder.build();
       if (this.isHttps()) {
          String str2 = uod1.readUtf8LineStrict();
          if (str2.length() <= 0) {
             CipherSuite uCipherSuite = CipherSuite.forJavaName(uod1.readUtf8LineStrict());
             List list = this.readCertificateList(uod);
             List list1 = this.readCertificateList(uod);
             TlsVersion tlsVersion = (!uod1.exhausted())? TlsVersion.forJavaName(uod1.readUtf8LineStrict()): TlsVersion.SSL_3_0;
             this.handshake = Handshake.get(tlsVersion, uCipherSuite, list, list1);
          }else {
             throw new IOException("expected \"\" but was \""+str2+"\"");
          }
       }else {
          this.handshake = null;
       }
       p0.close();
       return;
    }
    public final boolean isHttps(){
       return (this.url).startsWith("https://");
    }
    public boolean matches(Request p0,Response p1){
       boolean b = ((this.url).equals(p0.url().toString()) && ((this.requestMethod).equals(p0.method()) && HttpHeaders.varyMatches(p1, this.varyHeaders, p0)))? true: false;
       return b;
    }
    public final List readCertificateList(d p0){
       int i = Cache.readInt(p0);
       if (i == -1) {
          return Collections.emptyList();
       }
       try{
          CertificateFactory instance = CertificateFactory.getInstance("X.509");
          ArrayList uArrayList = new ArrayList(i);
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             b uob = new b();
             uob.u(ByteString.decodeBase64(p0.readUtf8LineStrict()));
             uArrayList.add(instance.generateCertificate(uob.inputStream()));
          }
          return uArrayList;
       }catch(java.security.cert.CertificateException e7){
          throw new IOException(e7.getMessage());
       }
    }
    public Response response(DiskLruCache$Snapshot p0){
       return new Response$Builder().request(new Request$Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new Cache$CacheResponseBody(p0, this.responseHeaders.get("Content-Type"), this.responseHeaders.get("Content-Length"))).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
    }
    public final void writeCertList(c p0,List p1){
       try{
          p0.writeDecimalLong((long)p1.size()).writeByte(10);
          int i1 = p1.size();
          for (int i = 0; i < i1; i = i + 1) {
             p0.writeUtf8(ByteString.of(p1.get(i).getEncoded()).base64()).writeByte(10);
          }
          return;
       }catch(java.security.cert.CertificateEncodingException e5){
          throw new IOException(e5.getMessage());
       }
    }
    public void writeTo(DiskLruCache$Editor p0){
       int i = 0;
       c uoc = l.c(p0.newSink(i));
       c uoc1 = uoc;
       uoc1.writeUtf8(this.url);
       uoc1.writeByte(10);
       uoc1.writeUtf8(this.requestMethod);
       uoc1.writeByte(10);
       uoc1.writeDecimalLong((long)this.varyHeaders.size());
       uoc1.writeByte(10);
       int i1 = this.varyHeaders.size();
       int i2 = 0;
       String str = ": ";
       while (i2 < i1) {
          uoc1.writeUtf8(this.varyHeaders.name(i2));
          uoc1.writeUtf8(str);
          uoc1.writeUtf8(this.varyHeaders.value(i2));
          uoc1.writeByte(10);
          i2 = i2 + 1;
       }
       uoc1.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString());
       uoc1.writeByte(10);
       uoc1.writeDecimalLong((long)(this.responseHeaders.size() + 2));
       uoc1.writeByte(10);
       i1 = this.responseHeaders.size();
       for (; i < i1; i = i + 1) {
          uoc1.writeUtf8(this.responseHeaders.name(i));
          uoc1.writeUtf8(str);
          uoc1.writeUtf8(this.responseHeaders.value(i));
          uoc1.writeByte(10);
       }
       uoc1.writeUtf8(Cache$Entry.SENT_MILLIS);
       uoc1.writeUtf8(str);
       uoc1.writeDecimalLong(this.sentRequestMillis);
       uoc1.writeByte(10);
       uoc1.writeUtf8(Cache$Entry.RECEIVED_MILLIS);
       uoc1.writeUtf8(str);
       uoc1.writeDecimalLong(this.receivedResponseMillis);
       uoc1.writeByte(10);
       if (this.isHttps()) {
          uoc1.writeByte(10);
          uoc1.writeUtf8(this.handshake.cipherSuite().javaName());
          uoc1.writeByte(10);
          this.writeCertList(uoc, this.handshake.peerCertificates());
          this.writeCertList(uoc, this.handshake.localCertificates());
          uoc1.writeUtf8(this.handshake.tlsVersion().javaName());
          uoc1.writeByte(10);
       }
       uoc1.close();
       return;
    }
}
