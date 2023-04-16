package b2.d$d;
import java.lang.Object;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;

public class d$d	// class@000ac2
{
    public final Object a;

    public void d$d(Object p0){
       super();
       this.a = p0;
    }
    public static d$d a(int p0,float p1,float p2,float p3){
       return new d$d(AccessibilityNodeInfo$RangeInfo.obtain(p0, p1, p2, p3));
    }
}
