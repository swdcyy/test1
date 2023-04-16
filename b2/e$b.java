package b2.e$b;
import b2.e$a;
import b2.e;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.d;

public class e$b extends e$a	// class@000ac5
{

    public void e$b(e p0){
       super(p0);
    }
    public AccessibilityNodeInfo findFocus(int p0){
       d uod = this.a.b(p0);
       if (uod == null) {
          return null;
       }
       return uod.F0();
    }
}
