package g72.j$a;
import kr5.c;
import g72.j;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.Animator;
import z12.x;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import g72.k;
import android.animation.Animator$AnimatorListener;
import g72.i;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import t02.r1;
import tx1.a;

public class j$a extends c	// class@002a87
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.n(p0);
    }
    public void h(LiveFloatingScreenCommonData p0,KwaiImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$a.class, "1")) {
          return;
       }
       super.h(p0, p1);
       j$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p1, ta, j.class, "4")) {
          x.I(ta.v);
          ObjectAnimator objectAnimat = j.a(p1, new float[2]{0x3f800000,0});
          ta.v = objectAnimat;
          objectAnimat.setDuration(800);
          ta.v.addListener(new k(ta, p1));
       }
       k1.s(new i(this), this.a, 600);
       return;
    }
    public boolean n(LiveFloatingScreenCommonData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.n(p0);
       UserInfo userInfo = p0.getUserInfo();
       if (userInfo == null) {
          return 0;
       }
       j$a ta = this.a;
       j q = ta.q;
       if (q != null) {
          q.U.w0(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 0, false, 79);
       }else {
          j r = ta.r;
          if (r != null) {
             r.Z.g3(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 0, 79);
          }
       }
       return true;
    }
}
