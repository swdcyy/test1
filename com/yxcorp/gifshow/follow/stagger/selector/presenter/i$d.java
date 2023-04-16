package com.yxcorp.gifshow.follow.stagger.selector.presenter.i$d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ro5.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import co5.p$b;
import co5.p;
import wq6.d;
import as6.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wq6.h;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import lnc.a1;

public class i$d extends AnimatorListenerAdapter	// class@00124a
{
    public final boolean a;
    public final i b;

    public void i$d(i p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       if (this.a == null && a.u(this.b.p)) {
          c.a(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterTabRadioPresenter"), "hideTriangle");
          a.k(this.b.p);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       if (this.a != null) {
          p$b uob = p.c();
          uob.b(HomeActionBarSkinHelper.l(a.d(this.b.p), this.b.getContext()));
          uob.a(0);
          uob.c(IconifyTextViewNew$a.a);
          uob.d((float)a1.e(0x3f000000));
          a.t(this.b.p, uob);
       }
       return;
    }
}
