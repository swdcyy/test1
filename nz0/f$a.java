package nz0.f$a;
import vk1.a;
import nz0.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import mk1.h;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.Iterator;
import java.util.List;
import jk1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import gy2.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gy2.c;
import gy2.a;

public class f$a implements a	// class@003437
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return this.a.C;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "2")) {
          return;
       }
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       f uof = f.class;
       if (!PatchProxy.applyVoid(objArray, ta, uof, "5")) {
          h m = ta.w.m;
          if (m != null) {
             if (m.isAdded()) {
                e uoe = ta.v.R().getChildFragmentManager().beginTransaction();
                uoe.u(m);
                uoe.m();
                Iterator iterator = ta.F.iterator();
                while (iterator.hasNext()) {
                   iterator.next().d();
                }
             }
             Object obj = PatchProxy.apply(objArray, ta, uof, "10");
             boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableCallDismissWhenGiftFragmentRemove", false);
             if (b) {
                f.e.a(ta.getActivity()).a(m);
             }
          }
       }
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}
