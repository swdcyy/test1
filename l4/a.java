package l4.a;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.lang.CharSequence;

public class a	// class@00250e
{
    public Boolean a;
    public String b;
    public String c;
    public ReadableMap d;
    public Boolean e;
    public Boolean f;
    public String g;
    public String h;
    public Boolean i;
    public Boolean j;
    public long k;
    public Boolean l;
    public Boolean m;
    public ReadableArray n;

    public void a(ReadableMap p0){
       ReadableArray readableArra1;
       ReadableArray readableArra2;
       super();
       Boolean fALSE = Boolean.FALSE;
       this.f = fALSE;
       Boolean tRUE = Boolean.TRUE;
       this.j = tRUE;
       this.k = 0xea60;
       this.l = fALSE;
       this.m = tRUE;
       ReadableArray readableArra = null;
       this.n = readableArra;
       if (p0 == null) {
          return;
       }
       String str = "fileCache";
       boolean b = false;
       boolean booleanx = (p0.hasKey(str))? p0.getBoolean(str): false;
       this.a = Boolean.valueOf(booleanx);
       str = "path";
       str = (p0.hasKey(str))? p0.getString(str): readableArra;
       this.b = str;
       str = "appendExt";
       str = (p0.hasKey(str))? p0.getString(str): "";
       this.c = str;
       str = "trusty";
       booleanx = (p0.hasKey(str))? p0.getBoolean(str): false;
       this.e = Boolean.valueOf(booleanx);
       str = "wifiOnly";
       booleanx = (p0.hasKey(str))? p0.getBoolean(str): false;
       this.f = Boolean.valueOf(booleanx);
       str = "addAndroidDownloads";
       if (p0.hasKey(str)) {
          this.d = p0.getMap(str);
       }
       str = "binaryContentTypes";
       if (p0.hasKey(str)) {
          this.n = p0.getArray(str);
       }
       a tb = this.b;
       if (tb != null && (tb.toLowerCase()).contains("?append=true")) {
          this.j = fALSE;
       }
       String str1 = "overwrite";
       if (p0.hasKey(str1)) {
          this.j = Boolean.valueOf(p0.getBoolean(str1));
       }
       str1 = "followRedirect";
       if (p0.hasKey(str1)) {
          this.m = Boolean.valueOf(p0.getBoolean(str1));
       }
       str1 = "key";
       str1 = (p0.hasKey(str1))? p0.getString(str1): readableArra;
       this.g = str1;
       str1 = "contentType";
       if (p0.hasKey(str1)) {
          readableArra = p0.getString(str1);
       }
       this.h = readableArra;
       str1 = "increment";
       boolean booleanx1 = (p0.hasKey(str1))? p0.getBoolean(str1): false;
       this.l = Boolean.valueOf(booleanx1);
       str1 = "auto";
       if (p0.hasKey(str1)) {
          b = p0.getBoolean(str1);
       }
       this.i = Boolean.valueOf(b);
       str1 = "timeout";
       if (p0.hasKey(str1)) {
          this.k = (long)p0.getInt(str1);
       }
       return;
    }
}
