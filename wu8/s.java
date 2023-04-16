package wu8.s;
import wu8.q;
import java.lang.String;
import ub7.f;
import bv8.a;
import wu8.o;
import wu8.s$a;
import java.lang.Object;
import wu8.q$a;
import wu8.s$b;
import java.lang.StringBuilder;

public final class s extends q	// class@002796
{
    public final String a;
    public final long b;
    public final boolean c;
    public final f d;
    public final a e;
    public final o f;
    public final boolean g;
    public final f h;
    public final f i;
    public final String j;
    public final boolean k;
    public final long l;
    public final boolean m;

    public void s(String p0,long p1,boolean p2,f p3,a p4,o p5,boolean p6,f p7,f p8,String p9,boolean p10,long p11,boolean p12,s$a p13){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
    }
    public f a(){
       return this.i;
    }
    public f b(){
       return this.h;
    }
    public a c(){
       return this.e;
    }
    public boolean d(){
       return this.k;
    }
    public long e(){
       return this.l;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof q) {
          return false;
       }
       if ((this.a).equals(p0.n()) && (!this.b - p0.l() && (this.c == p0.g() && (this.d.equals(p0.h()) && this.e.equals(p0.c()))))) {
          s tf = this.f;
          if (tf == null) {
             if (p0.j() != null) {
             label_009d :
                b = false;
             label_009e :
                return b;
             }
          }else if(tf.equals(p0.j())){
          }
          if (this.g == p0.i() && (this.h.equals(p0.b()) && (this.i.equals(p0.a()) && ((this.j).equals(p0.k()) && (this.k == p0.d() && (!this.l - p0.e() && this.m == p0.f())))))) {
             goto label_009e ;
          }else {
             goto label_009d ;
          }
       }else {
          goto label_009d ;
       }
    }
    public boolean f(){
       return this.m;
    }
    public boolean g(){
       return this.c;
    }
    public f h(){
       return this.d;
    }
    public int hashCode(){
       int i = 0xf4243;
       s tb = this.b;
       int i1 = ((((this.a).hashCode() ^ i) * i) ^ (int)(tb ^ (tb >> 32))) * i;
       int i2 = 1231;
       int i3 = (this.c != null)? 1231: 1237;
       i1 = (((((i1 ^ i3) * i) ^ this.d.hashCode()) * i) ^ this.e.hashCode()) * i;
       tb = this.f;
       i3 = (tb == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = (this.g != null)? 1231: 1237;
       i1 = (((((((i1 ^ i3) * i) ^ this.h.hashCode()) * i) ^ this.i.hashCode()) * i) ^ (this.j).hashCode()) * i;
       i3 = (this.k != null)? 1231: 1237;
       s tl = this.l;
       i1 = (((i1 ^ i3) * i) ^ (int)(tl ^ (tl >> 32))) * i;
       if (this.m == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public boolean i(){
       return this.g;
    }
    public o j(){
       return this.f;
    }
    public String k(){
       return this.j;
    }
    public long l(){
       return this.b;
    }
    public q$a m(){
       return new s$b(this);
    }
    public String n(){
       return this.a;
    }
    public String toString(){
       return "ABTestInitParams{userId="+this.a+", requestInterval="+this.b+", isInMultiProcessMode="+this.c+", isInSubsidiaryMode="+this.d+", apiService="+this.e+", passportSTListener="+this.f+", needSwitchHost="+this.g+", apiRouter="+this.h+", apiParams="+this.i+", requestConfigUrlPath="+this.j+", enableEntranceLog="+this.k+", entranceLogIntervalMs="+this.l+", entranceLogUsingHighFrequency="+this.m+"}";
    }
}
