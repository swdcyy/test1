package b2.c;
import android.view.accessibility.AccessibilityManager;
import b2.c$b;
import b2.c$c;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;

public final class c	// class@000abe
{

    public static boolean a(AccessibilityManager p0,c$b p1){
       return p0.addTouchExplorationStateChangeListener(new c$c(p1));
    }
    public static boolean b(AccessibilityManager p0,c$b p1){
       if (p1 == null) {
          return false;
       }
       return p0.removeTouchExplorationStateChangeListener(new c$c(p1));
    }
}
