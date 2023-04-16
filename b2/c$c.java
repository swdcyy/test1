package b2.c$c;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import b2.c$b;
import java.lang.Object;

public final class c$c implements AccessibilityManager$TouchExplorationStateChangeListener	// class@000abd
{
    public final c$b a;

    public void c$c(c$b p0){
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof c$c) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public int hashCode(){
       return this.a.hashCode();
    }
    public void onTouchExplorationStateChanged(boolean p0){
       this.a.onTouchExplorationStateChanged(p0);
    }
}
