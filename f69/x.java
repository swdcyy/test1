package f69.x;
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
import com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.user.base.RichTextMetaExt;
import brd.a0;
import com.yxcorp.gifshow.b;
import t45.d;
import brd.z;
import f69.v;
import f69.w;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import f69.u;
import android.view.View$OnClickListener;
import ol5.a;

public class x extends PresenterV2	// class@0022c8
{
    public KwaiImageView p;
    public EmojiTextView q;
    public EmojiTextView r;
    public EmojiTextView s;
    public a t;
    public User u;
    public RelationAggregateFragment v;
    public String w;

    public void x(){
       super();
    }
    public void E8(){
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox, "3")) {
          return;
       }
       g.b(this.p, this.u, HeadImageSize.MIDDLE);
       this.q.setText(f.e(this.u));
       this.r.setText(f.e(this.u));
       if (this.v.Hh()) {
          if (!PatchProxy.applyVoid(objArray, this, ox, "4")) {
             User mExtraInfo = this.u.mExtraInfo;
             if (mExtraInfo != null) {
                if (!this.S8(mExtraInfo)) {
                   this.R8(false);
                }
             }else {
                this.R8(false);
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, ox, "5")){
          ox = this.u;
          User mExtraInfo1 = ox.mExtraInfo;
          if (!ox.isFriend() || (TextUtils.n(this.u.getId(), QCurrentUser.ME.getId()) || (this.u.mFriendClap == null || (mExtraInfo1 == null || !this.S8(mExtraInfo1))))) {
             ox = this.u;
             if (ox.mFavorited != null) {
                this.s.setText(a1.p(R.string.arg_RES_7f1039f7));
                this.R8(true);
             }else if(!ox.isFriend()){
                ox = this.u;
                if (ox.mVisitorBeFollowed == null || !ox.isFollowingOrFollowRequesting()) {
                   if (mExtraInfo1 != null) {
                      if (!this.S8(mExtraInfo1)) {
                         this.R8(false);
                      }
                   }else {
                      this.R8(false);
                   }
                }
             }
             this.R8(true);
             this.s.setText(a1.p(R.string.arg_RES_7f1010c7));
          }
       }
       return;
    }
    public final void P8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, x.class, "7")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.R8(false);
       }else {
          this.R8(true);
          p1 = (TextUtils.x(p1))? "": "£º"+p1;
          this.s.setText(p0+p1);
       }
       return;
    }
    public final void R8(boolean p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ox, "8")) {
          return;
       }
       if (p0) {
          this.s.setVisibility(0);
          this.q.setVisibility(0);
          this.r.setVisibility(8);
       }else {
          this.s.setVisibility(8);
          this.q.setVisibility(8);
          this.r.setVisibility(0);
       }
       return;
    }
    public final boolean S8(UserExtraInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, x.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mRecoTextInfo != null) {
          this.R8(true);
          this.s.setText(RichTextMetaExt.g(p0.mRecoTextInfo));
          return true;
       }else if(!TextUtils.x(p0.mRecommendReason)){
          if (p0.mRecommendReasonValue == 7) {
             this.X7(b.b(p0).G(d.a).R(new v(this, p0), new w(this, p0)));
          }else {
             this.P8(p0.mRecommendReason, "");
          }
          return true;
       }else {
          return false;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3590);
       this.r = m1.f(p0, 0x7f0a3591);
       this.p = m1.f(p0, 0x7f0a358e);
       this.s = m1.f(p0, 0x7f0a3593);
       m1.a(p0, new u(this), R.id.reminder_mix_item_click_layout);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.t = this.s8(a.class);
       this.u = this.q8(User.class);
       this.v = this.r8("RELATION_USER_FRAGMENT");
       this.w = this.r8("RELATION_USER_FOLLOW_REFER");
       return;
    }
}
