package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherItem;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import lnc.a1;
import java.lang.Integer;
import com.kwai.live.gzone.auth.LiveGzoneAuthorAuthenticationTagResponse$Tag;
import com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherFragment$c$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import y8c.d;
import fq5.b;
import g37.g;
import g37.f;

public class LiveGzoneAccompanyPlayTogetherFragment$c extends PresenterV2	// class@000dfc
{
    public View A;
    public TextView B;
    public TextView C;
    public View D;
    public KwaiImageView E;
    public TextView F;
    public View G;
    public LiveGzoneAccompanyPlayTogetherItem p;
    public d q;
    public b r;
    public String s;
    public String t;
    public String u;
    public g v;
    public f w;
    public KwaiImageView x;
    public TextView y;
    public TextView z;

    public void LiveGzoneAccompanyPlayTogetherFragment$c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyPlayTogetherFragment$c.class, "3")) {
          return;
       }
       LiveGzoneAccompanyPlayTogetherItem mUserInfo = this.p.mUserInfo;
       if (mUserInfo == null) {
          return;
       }
       this.x.U(mUserInfo.mAvatars);
       LiveGzoneAccompanyPlayTogetherFragment.Ih(this.z, this.p.mAccompanyMode);
       LiveGzoneAccompanyPlayTogetherFragment$c tA = this.A;
       int i = (TextUtils.x(this.p.mAccompanyMode))? 8: 0;
       tA.setVisibility(i);
       this.C.setText(this.p.mUserInfo.mName);
       LiveGzoneAccompanyPlayTogetherFragment.Ih(this.y, this.p.mGameRequirement);
       Object[] objArray = new Object[]{Integer.valueOf(this.p.mWaitingCount)};
       this.B.setText(String.format(a1.p(R.string.arg_RES_7f1023e2), objArray));
       if (this.p.mTag != null) {
          this.D.setVisibility(0);
          this.E.L(this.p.mTag.mIcon);
          this.F.setText(this.p.mTag.mTitle);
       }else {
          this.D.setVisibility(8);
       }
       LiveGzoneAccompanyPlayTogetherFragment$c$a uoc$a = new LiveGzoneAccompanyPlayTogetherFragment$c$a(this);
       this.G.setOnClickListener(uoc$a);
       this.x.setOnClickListener(uoc$a);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyPlayTogetherFragment$c.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a1e90);
       this.C = m1.f(p0, 0x7f0a1fc4);
       this.y = m1.f(p0, 0x7f0a1f18);
       this.z = m1.f(p0, 0x7f0a1dbf);
       this.A = m1.f(p0, 0x7f0a1dc0);
       this.B = m1.f(p0, 0x7f0a1dc1);
       this.D = m1.f(p0, 0x7f0a1e8d);
       this.E = m1.f(p0, 0x7f0a1e8e);
       this.F = m1.f(p0, 0x7f0a1e8f);
       this.G = m1.f(p0, 0x7f0a1f1c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyPlayTogetherFragment$c.class, "1")) {
          return;
       }
       this.p = this.q8(LiveGzoneAccompanyPlayTogetherItem.class);
       this.q = this.r8("ADAPTER_POSITION_GETTER");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("ANCHOR_ID");
       this.t = this.t8("LIVE_GAME_ID");
       this.u = this.r8("LIVE_GAME_NAME");
       this.v = this.t8("LIVE_GZONE_AUDIENCE_ACCOMPANY_SERVICE");
       this.w = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_SERVICE");
       return;
    }
}
