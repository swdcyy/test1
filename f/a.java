package f.a;
import f.g;
import java.lang.String;
import com.kuaishou.security.kste.export.InvokeCallback;
import f.a$a;
import java.lang.Object;
import java.util.Arrays;
import f.g$a;
import f.a$b;
import java.lang.StringBuilder;

public final class a extends g	// class@001f83
{
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final int e;
    public final long f;
    public final InvokeCallback g;
    public final String h;

    public void a(String p0,String p1,String p2,byte[] p3,int p4,long p5,InvokeCallback p6,String p7,a$a p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public String a(){
       return this.a;
    }
    public InvokeCallback c(){
       return this.g;
    }
    public byte[] d(){
       return this.d;
    }
    public String e(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof g) {
          return false;
       }
       if ((this.a).equals(p0.a()) && ((this.b).equals(p0.e()) && (this.c).equals(p0.j()))) {
          a td = this.d;
          a d = (p0 instanceof a)? p0.d: p0.d();
          if (Arrays.equals(td, d) && (this.e == p0.f() && !this.f - p0.h())) {
             td = this.g;
             if (td == null) {
                if (p0.c() != null) {
                label_0079 :
                   b = false;
                label_007a :
                   return b;
                }
             }else if(td.equals(p0.c())){
             }
             if ((this.h).equals(p0.g())) {
                goto label_007a ;
             }else {
                goto label_0079 ;
             }
          }else {
             goto label_0079 ;
          }
       }else {
          goto label_0079 ;
       }
    }
    public int f(){
       return this.e;
    }
    public String g(){
       return this.h;
    }
    public long h(){
       return this.f;
    }
    public int hashCode(){
       int i = 0xf4243;
       a tf = this.f;
       int i1 = ((((((((((((this.a).hashCode() ^ i) * i) ^ (this.b).hashCode()) * i) ^ (this.c).hashCode()) * i) ^ Arrays.hashCode(this.d)) * i) ^ this.e) * i) ^ (int)(tf ^ (tf >> 32))) * i;
       tf = this.g;
       int i2 = (tf == null)? 0: tf.hashCode();
       return (((i1 ^ i2) * i) ^ (this.h).hashCode());
    }
    public g$a i(){
       return new a$b(this);
    }
    public String j(){
       return this.c;
    }
    public String toString(){
       return "BCInvokeTask{appkey="+this.a+", kpn="+this.b+", vmBizId="+this.c+", input="+Arrays.toString(this.d)+", maxOutLen="+this.e+", timeout="+this.f+", callback="+this.g+", taskTag="+this.h+"}";
    }
}
