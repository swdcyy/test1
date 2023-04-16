package fia.z$e;
import erd.g;
import fia.z;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import bia.d;
import com.kwai.robust.PatchProxyResult;
import xl8.b;
import fia.f0;
import java.lang.Runnable;
import lnc.a1;

public final class z$e implements g	// class@002941
{
    public final z b;

    public void z$e(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$e.class, "1")) {
       }else {
          a.o(p0, "entranceShow");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, z.class, "19")) {
                z v = p0.v;
                if (v != null && !v.getVisibility()) {
                   v = p0.x;
                   if (v != null && !v.isRunning()) {
                   label_00a4 :
                      return;
                   }
                }
                if (!p0.W8()) {
                   goto label_00a4 ;
                }else {
                   c.a(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("FollowSlideLiveTipsV2Presenter"), "showLiveTipsBtnIfNeed");
                   v = p0.p;
                   if (v == null) {
                      a.S("mLiveTipsEntranceState");
                   }
                   Objects.requireNonNull(v);
                   Object obj = PatchProxy.apply(objArray, v, d.class, "12");
                   if (obj == PatchProxyResult.class) {
                      obj = v.h.a();
                      a.o(obj, "mLiveTipsEntranceCollapseAnimationState.value");
                   }
                   if (obj.booleanValue()) {
                      v = p0.v;
                      if (v != null) {
                         v.postDelayed(new f0(p0), 300);
                      }
                   }else {
                      v = p0.y;
                      if (v != null) {
                         v.start();
                      }
                   }
                   p0.S8(a1.e(110.00f));
                   goto label_00a4 ;
                }
             }
          }else {
             this.b.Z8();
             goto label_00a4 ;
          }
       }
    }
}
