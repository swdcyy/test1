package lg.i;
import com.facebook.yoga.YogaUnit;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import lg.i$a;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class i	// class@002559
{
    public final float a;
    public final YogaUnit b;
    public static final i c;
    public static final i d;
    public static final i e;

    static {
       i.c = new i(Float.NaN, YogaUnit.UNDEFINED);
       i.d = new i(0, YogaUnit.POINT);
       i.e = new i(Float.NaN, YogaUnit.AUTO);
    }
    public void i(float p0,YogaUnit p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof i) {
          i tb = this.b;
          if (tb == p0.b && (tb != YogaUnit.UNDEFINED && (tb == YogaUnit.AUTO || !Float.compare(this.a, p0.a)))) {
             b = true;
          }
       }
       return b;
    }
    public int hashCode(){
       return (Float.floatToIntBits(this.a) + this.b.intValue());
    }
    public String toString(){
       int i = i$a.a[this.b.ordinal()];
       if (i == 1) {
          return "undefined";
       }
       if (i == 2) {
          return Float.toString(this.a);
       }
       if (i == 3) {
          return this.a+"%";
       }
       if (i == 4) {
          return "auto";
       }
       throw new IllegalStateException();
    }
}
