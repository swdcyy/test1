package k3.d;
import android.app.Notification;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class d	// class@00246f
{
    public final int a;
    public final int b;
    public final Notification c;

    public void d(int p0,Notification p1,int p2){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
    }
    public int a(){
       return this.b;
    }
    public Notification b(){
       return this.c;
    }
    public int c(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || d.class != p0.getClass()) {
          return b;
       }
       if (this.a != p0.a) {
          return b;
       }
       if (this.b != p0.b) {
          return b;
       }
       return this.c.equals(p0.c);
    }
    public int hashCode(){
       return ((((this.a * 31) + this.b) * 31) + this.c.hashCode());
    }
    public String toString(){
       return "ForegroundInfo{"+"mNotificationId="+this.a+", mForegroundServiceType="+this.b+", mNotification="+this.c+'}';
    }
}
