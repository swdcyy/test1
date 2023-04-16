package b6c.a;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;

public final class a	// class@0003b9
{

    public static final ViewPager a(View p0){
       ViewParent viewParent = null;
       Object obj = PatchProxy.applyOneRefs(p0, viewParent, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewParent parent = p0.getParent();
       while (true) {
          v0 = parent instanceof ViewPager;
          if (!obj) {
             ViewParent parent1 = (parent != null)? parent.getParent(): viewParent;
             if (parent1 != null) {
                if (parent != null) {
                   parent = parent.getParent();
                }else {
                   parent = viewParent;
                }
             }else if(!obj){
                viewParent = parent;
                break ;
             }
             break ;
          }else {
             goto label_002b ;
          }
       }
       return viewParent;
    }
}
