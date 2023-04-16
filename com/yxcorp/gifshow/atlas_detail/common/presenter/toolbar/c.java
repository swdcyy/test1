package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import android.os.Handler;
import g99.k;
import g99.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.b;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import zz5.d;
import android.view.View;
import com.kwai.slide.play.detail.rightactionbar.follow.element.h;
import lnc.c3$a;
import lnc.c3;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.slide.play.detail.rightactionbar.follow.element.i;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.framework.model.user.User;
import org.json.JSONObject;
import je5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c$a;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import android.widget.TextView;
import android.text.TextPaint;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import o56.a;
import java.lang.CharSequence;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import java.lang.Integer;
import android.view.ViewParent;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class c extends PresenterV2	// class@001ba8
{
    public TextView A;
    public ViewStub B;
    public ViewStub C;
    public ImageView D;
    public CircleWithStrokeView E;
    public boolean F;
    public boolean G;
    public boolean H;
    public AnimatorSet I;
    public AnimatorSet J;
    public final Runnable K;
    public final Runnable L;
    public final Handler p;
    public PhotoDetailParam q;
    public QPhoto r;
    public User s;
    public f t;
    public BaseFragment u;
    public f v;
    public PublishSubject w;
    public View x;
    public AvatarWithPendantView y;
    public View z;
    public static final float M;
    public static final float N;
    public static final float O;

    static {
       c.M = (float)a1.e(18.00f);
       c.N = (float)a1.e(22.00f);
       c.O = (float)a1.e(2.00f);
    }
    public void c(){
       super();
       this.p = new Handler();
       this.K = new k(this);
       this.L = new l(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       d.b(this.r, this.u, new b(this));
       return;
    }
    public void H8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       this.F = true;
       this.x.clearAnimation();
       this.p.removeCallbacksAndMessages(objArray);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6") && this.H != null) {
          c3.c(this.I, h.a);
          c3.c(this.J, h.a);
          k1.m(this.K);
          k1.m(this.L);
          c3.c(this.E, i.a);
       }
       return;
    }
    public final String P8(AvatarInfoResponse p0){
       if (p0 != null && p0.mIsShopLive != null) {
          return "SHOPPING_LIVE";
       }
       return "COMMON_LIVE";
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_HEAD";
       JSONObject jSONObject = b.b(this.s);
       if (jSONObject != null) {
          uElementPack.params = jSONObject.toString();
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.r.mEntity);
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
    public final void S8(){
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "12")) {
          return;
       }
       this.x.clearAnimation();
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.I = uAnimatorSet;
       uAnimatorSet.setDuration(830);
       this.I.setInterpolator(new LinearInterpolator());
       c tI = this.I;
       Animator[] uAnimatorArr = new Animator[1];
       c tx = this.x;
       AnimatorSet uAnimatorSet1 = PatchProxy.applyOneRefs(tx, this, uoc, "14");
       if (uAnimatorSet1 != PatchProxyResult.class) {
       }else {
          AnimatorSet uAnimatorSet2 = new AnimatorSet();
          Animator[] uAnimatorArr1 = new Animator[]{ObjectAnimator.ofFloat(tx, "scaleX", new float[3]{0x3f6b851f,0x3f800000,0x3f6b851f}),ObjectAnimator.ofFloat(tx, "scaleY", new float[3]{0x3f6b851f,0x3f800000,0x3f6b851f})};
          uAnimatorSet2.playTogether(uAnimatorArr1);
          uAnimatorSet1 = uAnimatorSet2;
       }
       uAnimatorArr[0] = uAnimatorSet1;
       tI.playTogether(uAnimatorArr);
       this.I.addListener(new c$a(this));
       this.I.start();
       return;
    }
    public void doBindView(View p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.live_tip_text);
       this.A = textView;
       textView.getPaint().setFakeBoldText(true);
       this.z = m1.f(p0, 0x7f0a269a);
       AvatarWithPendantView uAvatarWithP = m1.f(p0, R.id.avatar_with_pendant);
       this.y = uAvatarWithP;
       if (uAvatarWithP == null) {
          this.x = m1.f(p0, 0x7f0a0333);
       }else if(a.d()){
          this.y.setContentDescription(a1.p(R.string.arg_RES_7f10031d));
       }
       this.x = this.y.getAvatar();
       this.C = m1.f(p0, 0x7f0a0ae3);
       this.B = m1.f(p0, 0x7f0a0ab5);
       c tx = this.x;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(tx, Integer.valueOf(0x7f0a0fe6), this, uoc, "10")) {
          ViewParent parent = tx.getParent();
          while (parent instanceof ViewGroup) {
             ViewParent viewParent = parent;
             if (viewParent.getId() != 0x7f0a0fe6) {
                boolean b = false;
                viewParent.setClipChildren(b);
                viewParent.setClipToPadding(b);
                parent = parent.getParent();
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(User.class);
       this.t = this.x8("LOG_LISTENER");
       this.u = this.r8("DETAIL_FRAGMENT");
       this.v = this.x8("DETAIL_AVATAR_CLICK_HANDLER");
       this.w = this.r8("DETAIL_LIVING_TAG_SHOW_OBSERVER");
       return;
    }
}
