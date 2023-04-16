package com.yxcorp.gifshow.relation.pymk.kem.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.PymkDialogItemViewResponse;
import android.text.TextPaint;
import android.widget.TextView;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ki5.b;
import crd.b;
import com.yxcorp.gifshow.pymk.b;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kwai.framework.model.user.UserExtraInfo;
import brd.a0;
import lbc.k;
import erd.g;
import java.util.Map;
import com.yxcorp.gifshow.model.response.dialog.KemPymkDialogResponse;
import kbc.b;
import java.lang.Integer;
import android.view.View;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import rq4.r;
import rq4.n;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.b$b;
import android.widget.ImageView;

public class b extends PresenterV2	// class@00194e
{
    public KwaiImageView p;
    public EmojiTextView q;
    public TextView r;
    public PymkDialogItemViewResponse s;
    public int t;
    public Map u;
    public boolean v;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          PymkDialogItemViewResponse mUser = this.s.mUser;
          this.q.getPaint().setFakeBoldText(true);
          if (mUser.mIsHiddenUser != null) {
             b tq = this.q;
             String str = (TextUtils.x(mUser.mHiddenUserName))? b.b().c(R.string.arg_RES_7f103fcb): mUser.mHiddenUserName;
             tq.setText(str);
          }else if(PatchProxy.applyVoidOneRefs(mUser, this, uob, "11")){
             this.X7(b.l(this.q, mUser));
          }
          this.p.getHierarchy().L(RoundingParams.a());
          g.b(this.p, mUser, HeadImageSize.MIDDLE);
          User mExtraInfo = mUser.mExtraInfo;
          if (mExtraInfo != null) {
             if (mExtraInfo.mRecoTextInfo != null) {
                this.X7(b.d(mExtraInfo).Q(new k(this)));
             }else {
                this.r.setText(TextUtils.k(mExtraInfo.mRecommendReason));
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "8") && this.v == null) {
          this.v = true;
          Object obj = this.u.get("key_pymk_response");
          if (obj instanceof KemPymkDialogResponse) {
             b.f(obj, this.s.mUser, this.t);
          }
       }
       return;
    }
    public final void P8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "9")) {
          return;
       }
       Object obj = this.u.get("key_pymk_response");
       if (obj instanceof KemPymkDialogResponse) {
          b.e(obj, this.s.mUser, this.t, p0);
       }
       return;
    }
    public final void R8(User p0,View p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "7")) {
          return;
       }
       p1.setTag(R.id.tag_view_refere, Integer.valueOf(126));
       p1.setTag(R.id.tag_pymk_portal_refer, Integer.valueOf(44));
       p1.setTag(R.id.tag_pymk_follow_text_refer, p0.mFollowActionReasonTextId);
       ProfileStartParam profileStart = ProfileStartParam.l(p0);
       profileStart.r(p1);
       d.a(-1718536792).Y7(this.getActivity(), profileStart);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "10")) {
          p1 = this.u.get("key_pymk_response");
          if (p1 instanceof KemPymkDialogResponse) {
             KemPymkDialogResponse mPrsId = p1.mPrsId;
             if (!PatchProxy.applyVoidTwoRefs(mPrsId, p0, null, b.class, "11")) {
                r or = b.b(mPrsId);
                or.d = 1;
                n on = new n();
                on.a = p0.getId();
                on.d = p0.mPosition + 1;
                or.g = on;
                b.g(or);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0333);
       this.q = m1.f(p0, 0x7f0a2d10);
       this.r = m1.f(p0, 0x7f0a0aac);
       p0.setOnClickListener(new b$a(this));
       this.p.setOnClickListener(new b$b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.s = this.q8(PymkDialogItemViewResponse.class);
       this.t = this.r8("ADAPTER_POSITION").intValue();
       this.u = this.r8("EXTRAS");
       return;
    }
}
