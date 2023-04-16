package androidx.appcompat.widget.a$b;
import java.lang.Comparable;
import android.content.pm.ResolveInfo;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import java.math.BigDecimal;

public final class a$b implements Comparable	// class@000637
{
    public final ResolveInfo b;
    public float c;

    public void a$b(ResolveInfo p0){
       super();
       this.b = p0;
    }
    public int a(a$b p0){
       return (Float.floatToIntBits(p0.c) - Float.floatToIntBits(this.c));
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (a$b.class != p0.getClass()) {
          return false;
       }
       if (Float.floatToIntBits(this.c) != Float.floatToIntBits(p0.c)) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       return (Float.floatToIntBits(this.c) + 31);
    }
    public String toString(){
       return "["+"resolveInfo:"+this.b.toString()+"; weight:"+new BigDecimal((double)this.c)+"]";
    }
}
