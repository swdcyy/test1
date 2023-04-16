package f.d;
import f.n;
import java.lang.String;
import f.n$a;
import f.n$c;
import f.d$a;
import java.lang.Object;
import java.lang.StringBuilder;

public final class d extends n	// class@001f8c
{
    public final String a;
    public final n$a b;
    public final n$c c;

    public void d(String p0,n$a p1,n$c p2,d$a p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public n$a a(){
       return this.b;
    }
    public String c(){
       return this.a;
    }
    public n$c d(){
       return this.c;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof n) {
          return false;
       }
       if (!(this.a).equals(p0.c()) || (!this.b.equals(p0.a()) || !this.c.equals(p0.d()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((((((this.a).hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode());
    }
    public String toString(){
       return "StartupConfigEntry{configPolicy="+this.a+", bitcodeConfig="+this.b+", interpreterConfig="+this.c+"}";
    }
}
