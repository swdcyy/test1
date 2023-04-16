package com.kwai.tokenshare.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import android.content.Context;
import android.widget.ImageView;
import com.yxcorp.utility.n;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import android.net.Uri;
import ekd.w0;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import zf6.j;
import lnc.a1;
import android.text.TextPaint;
import android.graphics.Paint;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.q;
import android.view.View$OnClickListener;
import fu7.o;
import fu7.p;
import fu7.n;
import com.kwai.tokenshare.KwaiTokenDialog;

public class i extends PresenterV2	// class@001945
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public Button t;
    public TextView u;
    public ShareTokenInfo v;
    public KwaiTokenDialog w;

    public void i(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.v.mTokenDialog;
       this.p.B(w0.f(mTokenDialog.mAvatarUrl), n.c(this.p.getContext(), 68.00f), n.c(this.p.getContext(), 68.00f), objArray);
       this.q.setText(mTokenDialog.mTitle);
       this.r.setText(mTokenDialog.mSubTitle);
       if (TextUtils.isEmpty(mTokenDialog.mDescription)) {
          this.s.setVisibility(8);
       }else {
          this.s.setText(mTokenDialog.mDescription);
       }
       this.t.setText(mTokenDialog.mAction);
       this.u.setText(mTokenDialog.mSource);
       Drawable uDrawable = j.n(this.getContext(), R.drawable.arg_RES_7f0824c3, 0x7f0606b9);
       uDrawable.setBounds(0, 0, a1.e(6.00f), a1.e(12.00f));
       this.u.setCompoundDrawables(objArray, objArray, uDrawable, objArray);
       this.q.getPaint().setFakeBoldText(true);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0a95);
       this.q = m1.f(p0, 0x7f0a3f2c);
       this.u = m1.f(p0, 0x7f0a3a8f);
       this.r = m1.f(p0, 0x7f0a3bf5);
       this.t = m1.f(p0, 0x7f0a007c);
       this.p = m1.f(p0, 0x7f0a0333);
       m1.a(p0, new q(this), R.id.source);
       m1.a(p0, new o(this), R.id.close);
       m1.a(p0, new p(this), R.id.action);
       m1.a(p0, new n(this), R.id.avatar);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.v = this.q8(ShareTokenInfo.class);
       this.w = this.q8(KwaiTokenDialog.class);
       return;
    }
}
