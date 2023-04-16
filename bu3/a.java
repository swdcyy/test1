package bu3.a;
import bu3.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.lang.Float;
import lnc.o5;
import java.lang.Boolean;

public class a implements b	// class@000448
{

    public void a(){
       super();
    }
    public HalfContainerParams a(String p0){
       HalfContainerParams obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HalfContainerParams();
       if (TextUtils.x(p0)) {
          return obj;
       }
       Uri uri = Uri.parse(p0);
       obj.c = Float.parseFloat(x0.b(uri, "heightRatio", "0"));
       obj.d = Float.parseFloat(x0.b(uri, "absoluteHeight", "0"));
       obj.f = o5.b(x0.b(uri, "topRadius", "0"), 0);
       obj.e = Float.parseFloat(x0.b(uri, "maskAlpha", "0"));
       obj.g = Boolean.parseBoolean(x0.b(uri, "disableClickOutsideDismiss", "false"));
       obj.h = Boolean.parseBoolean(x0.b(uri, "enableDragHalfToFull", "false"));
       obj.i = Boolean.parseBoolean(x0.b(uri, "showStatusBar", "false"));
       return obj;
    }
}
