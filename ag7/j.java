package ag7.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.Objects;
import java.lang.StringBuilder;

public class j	// class@0000c9
{
    public int a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public double i;
    public String j;
    public int k;
    public int l;

    public void j(){
       super();
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof j) {
          return false;
       }
       if (this.a != p0.a || !(this.b).equals(p0.b)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a),this.b};
       return Objects.hash(objArray);
    }
    public String toString(){
       return "ThreadInfo{ tid= "+this.a+", name="+this.b+", cpuTime="+this.g+"\(utm="+this.c+",stm="+this.d+"\), processCpuTime="+this.h+", cpuUsage="+this.i+", status="+this.j+", nice="+this.k;
    }
}
