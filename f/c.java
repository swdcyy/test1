package f.c;
import f.m;
import java.lang.String;
import java.util.concurrent.ScheduledFuture;
import f.c$a;
import java.lang.Object;
import java.lang.StringBuilder;

public final class c extends m	// class@001f89
{
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ScheduledFuture d;

    public void c(String p0,boolean p1,boolean p2,ScheduledFuture p3,c$a p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public ScheduledFuture a(){
       return this.d;
    }
    public boolean b(){
       return this.c;
    }
    public String c(){
       return this.a;
    }
    public boolean d(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof m) {
          return false;
       }
       if (!(this.a).equals(p0.c()) || (this.b != p0.d() || (this.c != p0.b() || !this.d.equals(p0.a())))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       int i = 0xf4243;
       int i1 = ((this.a).hashCode() ^ i) * i;
       int i2 = 1231;
       int i3 = (this.b != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.c == null) {
          i2 = 1237;
       }
       return (((i1 ^ i2) * i) ^ this.d.hashCode());
    }
    public String toString(){
       return "ScheduleTask{tag="+this.a+", taskFinished="+this.b+", schedulerFinished="+this.c+", scheduledFutureDelay="+this.d+"}";
    }
}
