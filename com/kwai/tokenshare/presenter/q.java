package com.kwai.tokenshare.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import android.widget.Button;
import java.lang.CharSequence;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.m0;
import android.view.View$OnClickListener;
import fu7.l0;
import fu7.n0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class q extends PresenterV2	// class@00194e
{
    public TextView p;
    public KwaiImageView q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public Button u;
    public ImageView v;
    public ShareTokenInfo w;
    public KwaiTokenDialog x;

    public void q(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.w.mTokenDialog;
       int i = 8;
       if (mTokenDialog.mAvatarPlaceHolderImage != null) {
          this.u.setVisibility(0);
          this.u.setText(mTokenDialog.mAction);
          this.q.setVisibility(0);
          this.q.setPlaceHolderImage(mTokenDialog.mAvatarPlaceHolderImage);
          this.q.U(mTokenDialog.mAvatarUrls);
       }else {
          this.q.setVisibility(i);
          this.u.setVisibility(i);
       }
       if (mTokenDialog.mType == 11) {
          this.r.L(mTokenDialog.mCoverUrl);
          this.t.setVisibility(i);
       }else {
          this.t.setText(mTokenDialog.mDescription);
          if (mTokenDialog.mType == 14) {
             this.v.setImageResource(R.drawable.arg_RES_7f08245c);
          }
       }
       this.s.setText(mTokenDialog.mTitle);
       this.p.setText(mTokenDialog.mSource);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a3f07);
       this.p = m1.f(p0, 0x7f0a3a8f);
       this.t = m1.f(p0, 0x7f0a0a92);
       this.s = m1.f(p0, 0x7f0a3f2c);
       this.q = m1.f(p0, 0x7f0a0333);
       this.u = m1.f(p0, 0x7f0a007c);
       this.r = m1.f(p0, 0x7f0a09d2);
       m1.a(p0, new m0(this), R.id.action);
       m1.a(p0, new l0(this), R.id.close);
       m1.a(p0, new n0(this), R.id.source);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.w = this.q8(ShareTokenInfo.class);
       this.x = this.q8(KwaiTokenDialog.class);
       return;
    }
}
