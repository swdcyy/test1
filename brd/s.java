package brd.s;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.NotificationLite;
import java.lang.StringBuilder;

public final class s	// class@0002d0
{
    public final Object a;
    public static final s b;

    static {
       s.b = new s(null);
    }
    public void s(Object p0){
       super();
       this.a = p0;
    }
    public static s a(){
       return s.b;
    }
    public static s b(Throwable p0){
       a.c(p0, "error is null");
       return new s(NotificationLite.error(p0));
    }
    public static s c(Object p0){
       a.c(p0, "value is null");
       return new s(p0);
    }
    public Throwable d(){
       s ta = this.a;
       if (NotificationLite.isError(ta)) {
          return NotificationLite.getError(ta);
       }
       return null;
    }
    public Object e(){
       s ta = this.a;
       if (ta != null && !NotificationLite.isError(ta)) {
          return this.a;
       }
       return null;
    }
    public boolean equals(Object p0){
       if (p0 instanceof s) {
          return a.a(this.a, p0.a);
       }
       return false;
    }
    public boolean f(){
       boolean b = (this.a == null)? true: false;
       return b;
    }
    public boolean g(){
       return NotificationLite.isError(this.a);
    }
    public boolean h(){
       s ta = this.a;
       boolean b = (ta != null && !NotificationLite.isError(ta))? true: false;
       return b;
    }
    public int hashCode(){
       s ta = this.a;
       int i = (ta != null)? ta.hashCode(): 0;
       return i;
    }
    public String toString(){
       s ta = this.a;
       if (ta == null) {
          return "OnCompleteNotification";
       }
       if (NotificationLite.isError(ta)) {
          return "OnErrorNotification["+NotificationLite.getError(ta)+"]";
       }
       return "OnNextNotification["+this.a+"]";
    }
}
