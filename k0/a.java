package k0.a;
import aegon.chrome.net.r;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.lang.String;
import k0.a$a;
import java.util.Arrays;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Byte;

public class a	// class@002451
{
    public final int a;
    public final List b;
    public final boolean c;
    public final String d;
    public final String e;
    public final byte[] f;

    public void a(r p0){
       super();
       this.a = p0.c();
       this.b = Collections.unmodifiableList(new ArrayList(p0.b()));
       this.c = p0.j();
       this.d = a.a(p0.e(), "");
       this.e = a.a(p0.f(), "");
       this.f = a$a.h;
    }
    public void a(a$a p0){
       super();
       this.a = p0.a;
       this.b = Collections.unmodifiableList(new ArrayList(p0.b));
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
    }
    public static Object a(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       return p1;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof a) {
          return b;
       }
       if (this.a == p0.a && (this.b.equals(p0.b) && (this.c == p0.c && ((this.d).equals(p0.d) && ((this.e).equals(p0.e) && Arrays.equals(this.f, p0.f)))))) {
          b = true;
       }
    label_003d :
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a),this.b,Boolean.valueOf(this.c),this.d,this.e,Integer.valueOf(Arrays.hashCode(this.f))};
       return Objects.hash(objArray);
    }
    public String toString(){
       StringBuilder str = "HTTP Status Code: "+this.a+" Headers: "+this.b.toString()+" Was Cached: "+this.c+" Negotiated Protocol: "+this.d+" Proxy Server: "+this.e;
       StringBuilder str1 = " Response Body ";
       try{
          str+str1;
          str = str+"\(UTF-8\): "+new String(this.f, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e0){
          str1 = "\(hexadecimal\): ";
          StringBuilder str2 = "";
          a tf = this.f;
          int len = tf.length;
          int i = 0;
       label_00ae :
          if (i < len) {
             Object[] objArray = new Object[]{Byte.valueOf(tf[i])};
             str2 = str2+String.format("%02x", objArray);
             i = i + 1;
             goto label_00ae ;
          }else {
             str = e0+str1+str2;
          }
       }
       return str;
    }
}
