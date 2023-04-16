package d61.i;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import lnc.a1;

public class i	// class@001f21
{

    public void i(){
       super();
    }
    public static boolean a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || SystemUtil.a(21)) {
          return false;
       }
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060c92));
       return true;
    }
}
