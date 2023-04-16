package com.kwai.tokenshare.presenter.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import android.widget.Button;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.w;
import android.view.View$OnClickListener;
import fu7.x;
import fu7.v;
import com.kwai.tokenshare.KwaiTokenDialog;

public class l extends PresenterV2	// class@001948
{
    public TextView p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public Button t;
    public ShareTokenInfo u;
    public KwaiTokenDialog v;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.u.mTokenDialog;
       if (mTokenDialog.mAvatarPlaceHolderImage != null) {
          this.t.setVisibility(0);
          this.q.setVisibility(0);
          this.q.setPlaceHolderImage(mTokenDialog.mAvatarPlaceHolderImage);
          this.q.U(mTokenDialog.mAvatarUrls);
       }else {
          int i = 8;
          this.q.setVisibility(i);
          this.t.setVisibility(i);
       }
       this.r.setText(mTokenDialog.mTitle);
       this.p.setText(mTokenDialog.mSource);
       this.s.setText(mTokenDialog.mErrorMessage);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0a92);
       this.t = m1.f(p0, 0x7f0a007c);
       this.q = m1.f(p0, 0x7f0a0333);
       this.r = m1.f(p0, 0x7f0a3f2c);
       this.p = m1.f(p0, 0x7f0a3a8f);
       m1.a(p0, new w(this), R.id.action);
       m1.a(p0, new x(this), R.id.source);
       m1.a(p0, new v(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.u = this.q8(ShareTokenInfo.class);
       this.v = this.q8(KwaiTokenDialog.class);
       return;
    }
}
