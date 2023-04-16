package okhttp3.MultipartBody;
import okhttp3.RequestBody;
import java.lang.String;
import okhttp3.MediaType;
import okio.ByteString;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Object;
import okhttp3.internal.Util;
import okio.c;
import okhttp3.MultipartBody$Part;
import okio.b;
import okhttp3.Headers;

public final class MultipartBody extends RequestBody	// class@002084
{
    public final ByteString boundary;
    public long contentLength;
    public final MediaType contentType;
    public final MediaType originalType;
    public final List parts;
    public static final MediaType ALTERNATIVE;
    public static final byte[] COLONSPACE;
    public static final byte[] CRLF;
    public static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;

    static {
       MultipartBody.MIXED = MediaType.get("multipart/mixed");
       MultipartBody.ALTERNATIVE = MediaType.get("multipart/alternative");
       MultipartBody.DIGEST = MediaType.get("multipart/digest");
       MultipartBody.PARALLEL = MediaType.get("multipart/parallel");
       MultipartBody.FORM = MediaType.get("multipart/form-data");
       MultipartBody.COLONSPACE = new byte[2]{':',0x20};
       MultipartBody.CRLF = new byte[2]{0x0d,0x0a};
       MultipartBody.DASHDASH = new byte[2]{'-','-'};
    }
    public void MultipartBody(ByteString p0,MediaType p1,List p2){
       super();
       this.contentLength = -1;
       this.boundary = p0;
       this.originalType = p1;
       this.contentType = MediaType.get(p1+"; boundary="+p0.utf8());
       this.parts = Util.immutableList(p2);
    }
    public static StringBuilder appendQuotedString(StringBuilder p0,String p1){
       p0 = p0+'"';
       int i = p1.length();
       int i1 = 0;
       while (i1 < i) {
          char c = p1.charAt(i1);
          if (c != 10) {
             if (c != 13) {
                p0 = (c != '"')? p0+c: p0+"%22";
             }else {
                p0 = p0+"%0D";
             }
          }else {
             p0 = p0+"%0A";
          }
          i1 = i1 + 1;
       }
       return p0+'"';
    }
    public String boundary(){
       return this.boundary.utf8();
    }
    public long contentLength(){
       MultipartBody tcontentLeng = this.contentLength;
       if (tcontentLeng - -1) {
          return tcontentLeng;
       }
       long l = this.writeOrCountBytes(null, true);
       this.contentLength = l;
       return l;
    }
    public MediaType contentType(){
       return this.contentType;
    }
    public MultipartBody$Part part(int p0){
       return this.parts.get(p0);
    }
    public List parts(){
       return this.parts;
    }
    public int size(){
       return this.parts.size();
    }
    public MediaType type(){
       return this.originalType;
    }
    public final long writeOrCountBytes(c p0,boolean p1){
       b uob;
       b uob1;
       if (p1) {
          uob = new b();
          uob1 = uob;
       }else {
          uob1 = null;
       }
       int i = this.parts.size();
       long l = 0;
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             MultipartBody$Part part = this.parts.get(i1);
             MultipartBody$Part headers = part.headers;
             part = part.body;
             uob.write(MultipartBody.DASHDASH);
             uob.Y0(this.boundary);
             uob.write(MultipartBody.CRLF);
             if (headers != null) {
                int i2 = headers.size();
                for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                   uob.writeUtf8(headers.name(i3)).write(MultipartBody.COLONSPACE).writeUtf8(headers.value(i3)).write(MultipartBody.CRLF);
                }
             }
             MediaType mediaType = part.contentType();
             if (mediaType != null) {
                uob.writeUtf8("Content-Type: ").writeUtf8(mediaType.toString()).write(MultipartBody.CRLF);
             }
             long l1 = part.contentLength();
             String str = -1;
             if (l1 - str) {
                uob.writeUtf8("Content-Length: ").writeDecimalLong(l1).write(MultipartBody.CRLF);
             }else if(p1){
                uob1.a();
                return str;
             }
             byte[] cRLF = MultipartBody.CRLF;
             uob.write(cRLF);
             if (p1) {
                l = l + l1;
             }else {
                part.writeTo(uob);
             }
             uob.write(cRLF);
             i1 = i1 + 1;
          }else {
             byte[] dASHDASH = MultipartBody.DASHDASH;
             uob.write(dASHDASH);
             uob.Y0(this.boundary);
             uob.write(dASHDASH);
             uob.write(MultipartBody.CRLF);
             if (p1) {
                l = l + uob1.p();
                uob1.a();
                break ;
             }
             break ;
          }
       }
       return l;
    }
    public void writeTo(c p0){
       this.writeOrCountBytes(p0, false);
    }
}
