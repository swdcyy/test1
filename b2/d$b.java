package b2.d$b;
import java.lang.Object;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;

public class d$b	// class@000ac0
{
    public final Object a;

    public void d$b(Object p0){
       super();
       this.a = p0;
    }
    public static d$b a(int p0,int p1,boolean p2,int p3){
       return new d$b(AccessibilityNodeInfo$CollectionInfo.obtain(p0, p1, p2, p3));
    }
}
