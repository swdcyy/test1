package g59.m;
import java.lang.Object;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.ad.detail.fragment.AdDetailVMFragment;

public final class m	// class@00240e
{

    public void m(){
       super();
    }
    public static View a(Activity p0,Fragment p1,int p2){
       StringBuilder obj;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, m.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != null && (p1.getParentFragment() != null && p1.getParentFragment().getView() != null)) {
          return p1.getParentFragment().getView().findViewById(p2);
       }else {
          obj = "fragment == null:";
          boolean b = true;
          boolean b1 = (p1 == null)? true: false;
          obj = obj+b1+"ParentFragment == null:";
          if (p1 == null || p1.getParentFragment() != null) {
             b = false;
          }
          Object[] objArray = new Object[0];
          j0.f("DetailViewUtil_FindCurrentView_Error", obj+b, objArray);
          return p0.findViewById(p2);
       }
    }
    public static boolean b(Fragment p0){
       return p0 instanceof AdDetailVMFragment;
    }
}
