package b2.d$c;
import java.lang.Object;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;

public class d$c	// class@000ac1
{
    public final Object a;

    public void d$c(Object p0){
       super();
       this.a = p0;
    }
    public static d$c a(int p0,int p1,int p2,int p3,boolean p4){
       return new d$c(AccessibilityNodeInfo$CollectionItemInfo.obtain(p0, p1, p2, p3, p4));
    }
    public static d$c b(int p0,int p1,int p2,int p3,boolean p4,boolean p5){
       return new d$c(AccessibilityNodeInfo$CollectionItemInfo.obtain(p0, p1, p2, p3, p4, p5));
    }
}
