package sid.p;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import z1.d;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class p	// class@00242d
{
    public boolean a;
    public boolean b;
    public String c;

    public void p(){
       super();
       this.a = true;
       this.b = true;
       this.c = "amap";
    }
    public static p c(){
       return new p();
    }
    public String a(){
       return this.c;
    }
    public boolean b(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || p.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || !d.a(this.c, p0.c))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Boolean.valueOf(this.a),Boolean.valueOf(this.b),this.c};
       return d.b(objArray);
    }
    public String toString(){
       return "KwaiLocationRequestParam{updateCache="+this.a+", onceLocation="+this.b+", sdkType=\'"+this.c+'''+'}';
    }
}
