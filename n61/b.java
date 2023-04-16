package n61.b;
import java.lang.Object;
import android.view.View;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.Boolean;
import qp.b;
import com.kwai.robust.PatchProxyResult;

public class b	// class@0032b1
{

    public void b(){
       super();
    }
    public static void a(int p0,View p1,Map p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, b.class, "3")) {
          return;
       }
       ViewParent parent = p1.getParent();
       if (parent instanceof ViewGroup) {
          b.g("LiveBottomBarWidgetUtils", " add item itemView parent is not null, remove it", "showing map contains status ", Boolean.valueOf(p2.containsKey(Integer.valueOf(p0))), "item view tag ", p1.getTag(), "id : ", Integer.valueOf(p0));
          parent.removeView(p1);
       }
       return;
    }
    public static View b(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0.findViewWithTag(Integer.valueOf(p1));
    }
}
