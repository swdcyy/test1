package com.kwai.tokenshare.presenter.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.kwai.tokenshare.model.TokenInfoModel;
import com.kwai.tokenshare.model.TokenDialogModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import android.widget.ImageView;
import b06.e;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.c0;
import android.view.View$OnClickListener;
import fu7.b0;
import fu7.a0;
import fu7.d0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class n extends PresenterV2	// class@00194a
{
    public KwaiImageView p;
    public TextView q;
    public KwaiImageView r;
    public ImageView s;
    public ImageView t;
    public Button u;
    public TextView v;
    public ShareTokenInfo w;
    public KwaiTokenDialog x;

    public void n(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.w.mTokenDialog;
       this.p.setPlaceHolderImage(mTokenDialog.mAvatarPlaceHolderImage);
       this.p.U(mTokenDialog.mAvatarUrls);
       this.q.setText(mTokenDialog.mTitle);
       this.v.setText(mTokenDialog.mSource);
       this.r.setPlaceHolderImage(new ColorDrawable(mTokenDialog.mCoverPlaceHolderColor));
       this.r.U(mTokenDialog.mCoverUrls);
       this.u.setText(mTokenDialog.mAction);
       mTokenDialog = this.w.mExtras;
       if (mTokenDialog != null && mTokenDialog.mDialogModel.mPhoto != null) {
          QPhoto qPhoto = new QPhoto(mTokenDialog.mDialogModel.mPhoto);
          this.t.setImageResource(R.drawable.arg_RES_7f08098f);
          n tt = this.t;
          int i = (qPhoto.isLiveStream())? 0: 4;
          tt.setVisibility(i);
          if (qPhoto.isImageType()) {
             this.s.setImageResource(e.c(qPhoto));
             this.s.setVisibility(0);
          }else {
             this.s.setVisibility(4);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a007c);
       this.r = m1.f(p0, 0x7f0a300b);
       this.p = m1.f(p0, 0x7f0a0333);
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.t = m1.f(p0, 0x7f0a215e);
       this.s = m1.f(p0, 0x7f0a136c);
       this.v = m1.f(p0, 0x7f0a3a8f);
       m1.a(p0, new c0(this), R.id.photo);
       m1.a(p0, new b0(this), R.id.action);
       m1.a(p0, new a0(this), R.id.close);
       m1.a(p0, new d0(this), R.id.source);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.w = this.q8(ShareTokenInfo.class);
       this.x = this.q8(KwaiTokenDialog.class);
       return;
    }
}
