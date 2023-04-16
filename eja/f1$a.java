package eja.f1$a;
import erd.g;
import eja.f1;
import java.lang.Object;
import jsa.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import vja.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import androidx.fragment.app.Fragment;
import tyc.q4;

public final class f1$a implements g	// class@0026c2
{
    public final f1 b;

    public void f1$a(f1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$a.class, "1")) {
       }else {
          f1$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, f1.class, "5")) {
             d.a(KsLogFollowTag.STAGGER_REFRESH, "PymkDialogFollowEvent");
             p0 = tb.p;
             if (p0 == null) {
                a.S("mFragment");
             }
             p0.J3(RefreshType.FOLLOW_RETURN_REFRESH);
             p0 = tb.p;
             if (p0 == null) {
                a.S("mFragment");
             }
             if (!p0 instanceof Fragment) {
                p0 = null;
             }
             q4.e(p0);
          }
       }
       return;
    }
}
