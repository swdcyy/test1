package b2.e$a;
import android.view.accessibility.AccessibilityNodeProvider;
import b2.e;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.d;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import android.os.Bundle;

public class e$a extends AccessibilityNodeProvider	// class@000ac4
{
    public final e a;

    public void e$a(e p0){
       super();
       this.a = p0;
    }
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int p0){
       d uod = this.a.a(p0);
       if (uod == null) {
          return null;
       }
       return uod.F0();
    }
    public List findAccessibilityNodeInfosByText(String p0,int p1){
       Objects.requireNonNull(this.a);
       return null;
    }
    public boolean performAction(int p0,int p1,Bundle p2){
       return this.a.d(p0, p1, p2);
    }
}
