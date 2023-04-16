package fia.f$d;
import erd.g;
import fia.f;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import bia.j;
import java.lang.Boolean;
import xl8.b;
import bia.d;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class f$d implements g	// class@0028ff
{
    public final f b;

    public void f$d(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "1")) {
       }else {
          a.p(p0, "pymiTipsShowResponse");
          p0 = p0.mPymiUserBar;
          if (p0 == null || q.f(p0.mInfos)) {
             p0.I = new ArrayList();
             p0 = this.b;
             Objects.requireNonNull(p0);
             f uof = PatchProxy.apply(null, p0, f.class, "12");
             if (uof != PatchProxyResult.class) {
             }else {
                uof = p0.w;
                if (uof == null) {
                   a.S("mFollowScreenState");
                }
             }
             Objects.requireNonNull(uof);
             p0 = j.class;
             if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, uof, p0, "3")) {
                uof.a.d(Boolean.TRUE);
             }
             this.b.S8().e(false);
             this.b.S8().f(false);
             p0 = this.b.R8().O();
             if (p0 != null) {
                a.o(p0, "it");
                if (p0.f1() > 0) {
                   p0.d(false, 2);
                   p0.W(false);
                }
             }
          }
       }
       return;
    }
}
