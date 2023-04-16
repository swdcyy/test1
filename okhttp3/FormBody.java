package okhttp3.FormBody;
import okhttp3.RequestBody;
import java.lang.String;
import okhttp3.MediaType;
import java.util.List;
import okhttp3.internal.Util;
import okio.c;
import java.lang.Object;
import okhttp3.HttpUrl;
import okio.b;

public final class FormBody extends RequestBody	// class@002078
{
    public final List encodedNames;
    public final List encodedValues;
    public static final MediaType CONTENT_TYPE;

    static {
       FormBody.CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    }
    public void FormBody(List p0,List p1){
       super();
       this.encodedNames = Util.immutableList(p0);
       this.encodedValues = Util.immutableList(p1);
    }
    public long contentLength(){
       return this.writeOrCountBytes(null, true);
    }
    public MediaType contentType(){
       return FormBody.CONTENT_TYPE;
    }
    public String encodedName(int p0){
       return this.encodedNames.get(p0);
    }
    public String encodedValue(int p0){
       return this.encodedValues.get(p0);
    }
    public String name(int p0){
       return HttpUrl.percentDecode(this.encodedName(p0), true);
    }
    public int size(){
       return this.encodedNames.size();
    }
    public String value(int p0){
       return HttpUrl.percentDecode(this.encodedValue(p0), true);
    }
    public final long writeOrCountBytes(c p0,boolean p1){
       long l;
       b uob = (p1)? new b(): p0.buffer();
       int i1 = this.encodedNames.size();
       for (int i = 0; i < i1; i = i + 1) {
          if (i > 0) {
             uob.y(38);
          }
          uob.P(this.encodedNames.get(i));
          uob.y(61);
          uob.P(this.encodedValues.get(i));
       }
       if (p1) {
          l = uob.p();
          uob.a();
       }else {
          l = 0;
       }
       return l;
    }
    public void writeTo(c p0){
       this.writeOrCountBytes(p0, false);
    }
}
