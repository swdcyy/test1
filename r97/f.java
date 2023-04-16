package r97.f;
import r97.r;
import java.lang.String;
import r97.o;
import r97.f$a;
import java.lang.Object;
import r97.r$a;
import r97.f$b;
import java.lang.StringBuilder;

public final class f extends r	// class@002341
{
    public final String a;
    public final o b;
    public final String c;
    public final String d;
    public final String e;

    public void f(String p0,o p1,String p2,String p3,String p4,f$a p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public String a(){
       return this.e;
    }
    public o c(){
       return this.b;
    }
    public String d(){
       return this.a;
    }
    public String e(){
       return this.c;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof r) {
          return false;
       }
       f ta = this.a;
       if (ta == null) {
          if (p0.d() == null) {
          label_0020 :
             if (this.b.equals(p0.c()) && ((this.c).equals(p0.e()) && (this.d).equals(p0.g()))) {
                ta = this.e;
                if (ta == null) {
                   if (p0.a() == null) {
                   label_005b :
                      return b;
                   }
                }else if(ta.equals(p0.a())){
                   goto label_005b ;
                }
             }
          }
       }else if(ta.equals(p0.d())){
          goto label_0020 ;
       }
       b = false;
       goto label_005b ;
    }
    public r$a f(){
       return new f$b(this);
    }
    public String g(){
       return this.d;
    }
    public int hashCode(){
       f ta = this.a;
       int i = 0;
       int i1 = (ta == null)? 0: ta.hashCode();
       i1 = (((((((i1 ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ (this.c).hashCode()) * 0xf4243) ^ (this.d).hashCode()) * 0xf4243;
       f te = this.e;
       if (te != null) {
          i = te.hashCode();
       }
       return (i1 ^ i);
    }
    public String toString(){
       return "CustomStatEvent{eventId="+this.a+", commonParams="+this.b+", key="+this.c+", value="+this.d+", biz="+this.e+"}";
    }
}
