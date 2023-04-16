package com.kwai.tokenshare.presenter.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import android.view.ViewGroup$LayoutParams;
import android.widget.Button;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.k0;
import android.view.View$OnClickListener;
import fu7.h0;
import fu7.i0;
import fu7.j0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class p extends PresenterV2	// class@00194d
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public Button s;
    public TextView t;
    public ShareTokenInfo u;
    public KwaiTokenDialog v;

    public void p(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.u.mTokenDialog;
       int i = 8;
       p op = null;
       if (TextUtils.x(mTokenDialog.mSource)) {
          this.t.setVisibility(i);
       }else {
          this.t.setText(mTokenDialog.mSource);
          this.t.setVisibility(op);
       }
       this.p.setPlaceHolderImage(mTokenDialog.mAvatarPlaceHolderImage);
       this.p.U(mTokenDialog.mAvatarUrls);
       this.r.setText(mTokenDialog.mDescription);
       ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
       if (TextUtils.x(mTokenDialog.mDescription)) {
          this.r.setVisibility(i);
          layoutParams.topMargin = n.c(this.getContext(), 0x41f00000);
       }else {
          this.r.setVisibility(op);
          layoutParams.topMargin = n.c(this.getContext(), 20.00f);
       }
       this.q.setText(mTokenDialog.mTitle);
       this.s.setText(mTokenDialog.mAction);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.p = m1.f(p0, 0x7f0a0333);
       this.r = m1.f(p0, 0x7f0a0a92);
       this.t = m1.f(p0, 0x7f0a3a8f);
       this.s = m1.f(p0, 0x7f0a007c);
       m1.a(p0, new k0(this), R.id.source);
       m1.a(p0, new h0(this), R.id.close);
       m1.a(p0, new i0(this), R.id.action);
       m1.a(p0, new j0(this), R.id.avatar);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.u = this.q8(ShareTokenInfo.class);
       this.v = this.q8(KwaiTokenDialog.class);
       return;
    }
}
