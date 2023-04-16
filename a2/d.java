package a2.d;
import java.lang.Object;
import android.os.Build$VERSION;
import android.view.DisplayCutout;
import java.lang.Class;
import z1.d;
import java.lang.String;
import java.lang.StringBuilder;

public final class d	// class@000053
{
    public final Object a;

    public void d(Object p0){
       super();
       this.a = p0;
    }
    public static d e(Object p0){
       p0 = (p0 == null)? null: new d(p0);
       return p0;
    }
    public int a(){
       if (Build$VERSION.SDK_INT >= 28) {
          return this.a.getSafeInsetBottom();
       }
       return 0;
    }
    public int b(){
       if (Build$VERSION.SDK_INT >= 28) {
          return this.a.getSafeInsetLeft();
       }
       return 0;
    }
    public int c(){
       if (Build$VERSION.SDK_INT >= 28) {
          return this.a.getSafeInsetRight();
       }
       return 0;
    }
    public int d(){
       if (Build$VERSION.SDK_INT >= 28) {
          return this.a.getSafeInsetTop();
       }
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || d.class != p0.getClass()) {
          return false;
       }
       return d.a(this.a, p0.a);
    }
    public int hashCode(){
       d ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return i;
    }
    public String toString(){
       return "DisplayCutoutCompat{"+this.a+"}";
    }
}
