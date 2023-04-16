package com.gifshow.kanim.parser.moshi.JsonReader;
import java.io.Closeable;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import okio.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.gifshow.kanim.parser.moshi.a;
import okio.c;
import okio.b;
import com.gifshow.kanim.parser.moshi.JsonEncodingException;
import java.lang.StringBuilder;
import hh.a;
import com.gifshow.kanim.parser.moshi.JsonReader$Token;
import java.util.Arrays;
import com.gifshow.kanim.parser.moshi.JsonDataException;
import com.gifshow.kanim.parser.moshi.JsonReader$a;

public abstract class JsonReader implements Closeable	// class@0015c8
{
    public int b;
    public int[] c;
    public String[] d;
    public int[] e;
    public boolean f;
    public boolean g;
    public static final String[] h;

    static {
       String[] stringArray = new String[128];
       JsonReader.h = stringArray;
       int i = 0;
       for (int i1 = 0; i1 <= 31; i1 = i1 + 1) {
          Object[] objArray = new Object[1];
          objArray[i] = Integer.valueOf(i1);
          JsonReader.h[i1] = String.format("\\u%04x", objArray);
       }
       stringArray = JsonReader.h;
       stringArray[34] = "\\\"";
       stringArray[92] = "\\\\";
       stringArray[9] = "\\t";
       stringArray[8] = "\\b";
       stringArray[10] = "\\n";
       stringArray[13] = "\\r";
       stringArray[12] = "\\f";
    }
    public void JsonReader(){
       super();
       int[] ointArray = new int[32];
       this.c = ointArray;
       String[] stringArray = new String[32];
       this.d = stringArray;
       int[] ointArray1 = new int[32];
       this.e = ointArray1;
    }
    public static JsonReader r(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsonReader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(p0);
    }
    public static void z(c p0,String p1){
       object oobject;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonReader.class, "5")) {
          return;
       }
       String[] h = JsonReader.h;
       p0.writeByte(34);
       int i = p1.length();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          char c = p1.charAt(i1);
          if (c < 128) {
             oobject = h[c];
             if (oobject == null) {
             label_0041 :
                i1 = i1 + 1;
             }
          }else if(c == 8232){
             oobject = "\\u2028";
          }else if(c == 8233){
             oobject = "\\u2029";
          }
          if (i2 < i1) {
             p0.writeUtf8(p1, i2, i1);
          }
          p0.writeUtf8(oobject);
          i2 = i1 + 1;
          goto label_0041 ;
       }
       if (i2 < i) {
          p0.writeUtf8(p1, i2, i);
       }
       p0.writeByte(34);
       return;
    }
    public final JsonEncodingException A(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsonReader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new JsonEncodingException(p0+" at path "+this.getPath());
    }
    public abstract void a();
    public abstract void c();
    public abstract void e();
    public abstract void f();
    public abstract boolean g();
    public final String getPath(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsonReader obj = PatchProxy.apply(null, this, JsonReader.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       JsonReader tc = this.c;
       JsonReader td = this.d;
       JsonReader te = this.e;
       if (PatchProxy.isSupport(a.class)) {
          str = PatchProxy.applyFourRefs(Integer.valueOf(obj), tc, td, te, null, a.class, "1");
          if (str != patchProxyRe) {
          label_0079 :
             return str;
          }
       }
       StringBuilder str1 = '$';
       int i = 0;
       while (i < obj) {
          int i1 = tc[i];
          if (i1 != 1 && i1 != 2) {
             if (i1 == 3 || (i1 == 4 || i1 == 5)) {
                str1 = str1+'.';
                if (td[i] != null) {
                   str1 = str1+td[i];
                }
             }
          }else {
             str1 = str1+'['+te[i]+']';
          }
          i = i + 1;
       }
       str = str1;
       goto label_0079 ;
    }
    public abstract boolean j();
    public abstract double k();
    public abstract int l();
    public abstract String o();
    public abstract String p();
    public abstract JsonReader$Token s();
    public final void u(int p0){
       if (PatchProxy.isSupport(JsonReader.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, JsonReader.class, "2")) {
          return;
       }
       JsonReader tb = this.b;
       JsonReader tc = this.c;
       if (tb == tc.length) {
          if (tb != 256) {
             this.c = Arrays.copyOf(tc, (tc.length * 2));
             tb = this.d;
             this.d = Arrays.copyOf(tb, (tb.length * 2));
             tb = this.e;
             this.e = Arrays.copyOf(tb, (tb.length * 2));
          }else {
             throw new JsonDataException("Nesting too deep at "+this.getPath());
          }
       }
       tc = this.b;
       this.b = tc + 1;
       this.c[tc] = p0;
       return;
    }
    public abstract int v(JsonReader$a p0);
    public abstract void x();
    public abstract void y();
}
