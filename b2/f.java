package b2.f;
import java.lang.Object;
import android.view.accessibility.AccessibilityRecord;
import android.view.View;

public class f	// class@000ac8
{
    public final AccessibilityRecord a;

    public void f(Object p0){
       super();
       this.a = p0;
    }
    public static f a(){
       return new f(AccessibilityRecord.obtain());
    }
    public static void d(AccessibilityRecord p0,int p1){
       p0.setMaxScrollX(p1);
    }
    public static void e(AccessibilityRecord p0,int p1){
       p0.setMaxScrollY(p1);
    }
    public static void g(AccessibilityRecord p0,View p1,int p2){
       p0.setSource(p1, p2);
    }
    public void b(int p0){
       this.a.setFromIndex(p0);
    }
    public void c(int p0){
       this.a.setItemCount(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof f) {
          return false;
       }
       f ta = this.a;
       if (ta == null) {
          if (p0.a != null) {
             return false;
          }
       }else if(!ta.equals(p0.a)){
          return false;
       }
       return true;
    }
    public void f(boolean p0){
       this.a.setScrollable(p0);
    }
    public void h(int p0){
       this.a.setToIndex(p0);
    }
    public int hashCode(){
       f ta = this.a;
       int i = (ta == null)? 0: ta.hashCode();
       return i;
    }
}
