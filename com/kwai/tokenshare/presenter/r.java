package com.kwai.tokenshare.presenter.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import android.view.ViewGroup$LayoutParams;
import android.widget.Button;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.q0;
import android.view.View$OnClickListener;
import fu7.o0;
import fu7.p0;
import fu7.r0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class r extends PresenterV2	// class@00194f
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public Button s;
    public TextView t;
    public ShareTokenInfo u;
    public KwaiTokenDialog v;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.u.mTokenDialog;
       this.t.setText(mTokenDialog.mSource);
       this.p.setPlaceHolderImage(mTokenDialog.mAvatarPlaceHolderImage);
       this.p.U(mTokenDialog.mAvatarUrls);
       this.r.setText(mTokenDialog.mDescription);
       ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
       if (TextUtils.x(mTokenDialog.mDescription)) {
          this.r.setVisibility(8);
          layoutParams.topMargin = n.c(this.getContext(), 0x41f00000);
       }else {
          this.r.setVisibility(0);
          layoutParams.topMargin = n.c(this.getContext(), 20.00f);
       }
       this.q.setText(mTokenDialog.mTitle);
       this.s.setText(mTokenDialog.mAction);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0a92);
       this.t = m1.f(p0, 0x7f0a3a8f);
       this.s = m1.f(p0, 0x7f0a007c);
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.p = m1.f(p0, 0x7f0a0333);
       m1.a(p0, new q0(this), R.id.avatar);
       m1.a(p0, new o0(this), R.id.close);
       m1.a(p0, new p0(this), R.id.action);
       m1.a(p0, new r0(this), R.id.source);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.u = this.q8(ShareTokenInfo.class);
       this.v = this.q8(KwaiTokenDialog.class);
       return;
    }
}
