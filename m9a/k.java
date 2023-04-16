package m9a.k;
import java.lang.Object;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public class k	// class@002f82
{

    public void k(){
       super();
    }
    public static View a(Activity p0,Fragment p1,int p2){
       o obj;
       if (PatchProxy.isSupport(k.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, k.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != null && (p1.getParentFragment() != null && p1.getParentFragment().getView() != null)) {
          return p1.getParentFragment().getView().findViewById(p2);
       }else {
          obj = o.C();
          StringBuilder str = "fragment == null:";
          boolean b = true;
          boolean b1 = (p1 == null)? true: false;
          str = str+b1+"ParentFragment == null:";
          if (p1 == null || p1.getParentFragment() != null) {
             b = false;
          }
          Object[] objArray = new Object[0];
          obj.w("DetailViewUtil_FindCurrentView_Error", str+b, objArray);
          return p0.findViewById(p2);
       }
    }
}
