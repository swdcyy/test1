package ai3.c$a;
import aa1.b;
import ai3.c;
import java.lang.Object;
import java.util.List;
import xs5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import tkd.b;
import tkd.d;
import vt5.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c$a implements b	// class@0000e2
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public List a(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c$a uoa = c$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != patchProxyRe) {
       }else {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, uoa, "2");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             ArrayList uArrayList = new ArrayList();
             if (e.r(p0.a)) {
                uArrayList.add(d.a(0x2e5315fc).ve());
             }
             obj = uArrayList;
          }
       }
       return obj;
    }
}
