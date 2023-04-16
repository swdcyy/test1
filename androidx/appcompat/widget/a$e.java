package androidx.appcompat.widget.a$e;
import android.content.ComponentName;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.Float;
import java.lang.StringBuilder;
import java.math.BigDecimal;

public final class a$e	// class@00063a
{
    public final ComponentName a;
    public final long b;
    public final float c;

    public void a$e(ComponentName p0,long p1,float p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a$e(String p0,long p1,float p2){
       super(ComponentName.unflattenFromString(p0), p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (a$e.class != p0.getClass()) {
          return false;
       }
       a$e ta = this.a;
       if (ta == null) {
          if (p0.a != null) {
             return false;
          }
       }else if(!ta.equals(p0.a)){
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }else if(Float.floatToIntBits(this.c) != Float.floatToIntBits(p0.c)){
          return false;
       }else {
          return true;
       }
    }
    public int hashCode(){
       a$e ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       a$e tb = this.b;
       return (((((i + 31) * 31) + (int)(tb ^ (tb >> 32))) * 31) + Float.floatToIntBits(this.c));
    }
    public String toString(){
       return "["+"; activity:"+this.a+"; time:"+this.b+"; weight:"+new BigDecimal((double)this.c)+"]";
    }
}
