package p80.u;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p80.v;
import p80.d;
import com.kuaishou.webkit.extension.KwSdk;
import java.util.HashMap;
import java.util.ArrayList;
import nsd.u;

public final class u implements Runnable	// class@0028df
{
    public static final u b;

    static {
       u.b = new u();
    }
    public void u(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, u.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, v.class, "16")) {
          String coreVersionN = KwSdk.getCoreVersionName();
          String str = "";
          String str1 = (coreVersionN != null)? coreVersionN: str;
          coreVersionN = KwSdk.getVersionName();
          String str2 = (coreVersionN != null)? coreVersionN: str;
          d uod = new d(str1, str2, 0, 0, 12, 0);
          v.g(v0);
       }
       return;
    }
}
