package bo4.b;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import ju4.e;

public class b	// class@0003a8
{

    public void b(){
       super();
    }
    public static String a(Fragment p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || TextUtils.x(p1)) {
          return null;
       }
       FragmentActivity activity = p0.getActivity();
       if (activity == null) {
          return null;
       }
       return e.j(activity, "page_dy_sync_method", p1);
    }
}
