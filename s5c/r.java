package s5c.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import lu7.f;
import java.lang.CharSequence;
import android.widget.TextView;
import z5c.h;
import android.view.ViewStub;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import s5c.o;
import android.view.View$OnClickListener;
import lnc.a1;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import brd.a0;
import com.yxcorp.gifshow.b;
import t45.d;
import brd.z;
import s5c.p;
import s5c.q;
import erd.g;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import r5c.a;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import java.lang.Boolean;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import s5c.n;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;

public class r extends PresenterV2	// class@004139
{
    public User p;
    public StatusPanelListFragment q;
    public QPhoto r;
    public String s;
    public KwaiImageView t;
    public EmojiTextView u;
    public EmojiTextView v;
    public EmojiTextView w;
    public View x;

    public void r(){
       super();
    }
    public void E8(){
       r or = r.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or, "3")) {
          return;
       }
       g.b(this.t, this.p, HeadImageSize.MIDDLE);
       this.u.setText(f.e(this.p));
       this.v.setText(f.e(this.p));
       boolean b = true;
       if (("COLLECTION").equals(this.s) && !PatchProxy.applyVoid(objArray, this, or, "8")) {
          if (h.i(this.p)) {
             r tx = this.x;
             if (tx instanceof ViewStub) {
                this.x = tx.inflate();
             }
             this.x.setBackground(h.b(this.p));
             this.x.getPaint().setFakeBoldText(b);
             this.x.setTextColor(h.f(this.p));
             this.x.setText(h.e(this.p));
             if (!this.x.hasOnClickListeners()) {
                this.x.setOnClickListener(new o(this));
             }
          }else {
             this.x.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, or, "4")) {
          boolean b1 = false;
          if (this.p.isFollowingOrFollowRequesting()) {
             or = this.p;
             if (or.mFavorited == null && !or.isFriend()) {
                or = 1;
             label_00c1 :
                if (or) {
                   this.S8(b1);
                }else {
                   or = this.p;
                   User mExtraInfo = or.mExtraInfo;
                   if (or.mFavorited != null) {
                      this.w.setText(a1.p(R.string.arg_RES_7f1039f7));
                      this.S8(b);
                   }else if(or.isFriend() && !TextUtils.n(this.p.getId(), QCurrentUser.ME.getId())){
                      this.S8(b);
                      this.w.setText(a1.p(R.string.arg_RES_7f1010c7));
                   }else if(mExtraInfo != null){
                      if (mExtraInfo.mRecoTextInfo != null) {
                         this.S8(b);
                         this.w.setText(RichTextMetaExt.g(mExtraInfo.mRecoTextInfo));
                      }else if(!TextUtils.x(mExtraInfo.mRecommendReason)){
                         if (mExtraInfo.mRecommendReasonValue == 7) {
                            this.X7(b.b(mExtraInfo).G(d.a).R(new p(this, mExtraInfo), new q(this, mExtraInfo)));
                         }else {
                            this.R8(mExtraInfo.mRecommendReason, "");
                         }
                      }else {
                         this.S8(b1);
                      }
                   }else {
                      this.S8(b1);
                   }
                }
             }
          }
          or = null;
          goto label_00c1 ;
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, r.class, "7")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       a.a(this.p, this.s, this.r);
       d.a(-1718536792).Y7(this.getActivity(), ProfileStartParam.l(this.p));
       return;
    }
    public final void R8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.S8(false);
       }else {
          this.S8(true);
          p1 = (TextUtils.x(p1))? "": "£º"+p1;
          this.w.setText(p0+p1);
       }
       return;
    }
    public final void S8(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "6")) {
          return;
       }
       String str = "COLLECTION";
       int i = 0;
       if (p0) {
          this.w.setVisibility(i);
          this.u.setVisibility(i);
          this.v.setVisibility(8);
          if (str.equals(this.s)) {
             r tx = this.x;
             if (!h.i(this.p)) {
                i = 8;
             }
             tx.setVisibility(i);
          }
       }else {
          this.w.setVisibility(8);
          this.u.setVisibility(8);
          this.v.setVisibility(i);
          if (str.equals(this.s)) {
             this.x.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1497);
       this.v = m1.f(p0, 0x7f0a1499);
       this.t = m1.f(p0, 0x7f0a1477);
       this.w = m1.f(p0, 0x7f0a14d4);
       this.x = m1.f(p0, 0x7f0a14c5);
       m1.a(p0, new n(this), R.id.item_click_layout);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.r8("FRIEND_LIKE_USER_LIST_FRAGMENT");
       this.r = this.q8(QPhoto.class);
       this.s = this.t8("STATUS_PANEL_TAB_ID");
       return;
    }
}
