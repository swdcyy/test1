package com.kwai.tokenshare.presenter.t;
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
import android.content.Context;
import java.lang.Integer;
import android.widget.ImageView;
import android.view.View;
import java.util.List;
import com.kwai.tokenshare.KwaiTokenGalleryView;
import android.widget.Button;
import ekd.m1;
import fu7.v0;
import android.view.View$OnClickListener;
import fu7.w0;
import fu7.x0;
import fu7.u0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class t extends PresenterV2	// class@001951
{
    public TextView p;
    public ImageView q;
    public TextView r;
    public TextView s;
    public Button t;
    public KwaiTokenGalleryView u;
    public View v;
    public ShareTokenInfo w;
    public KwaiTokenDialog x;

    public void t(){
       super();
    }
    public void E8(){
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.w.mTokenDialog;
       if (!PatchProxy.applyVoid(objArray, this, ot, "8")) {
          ShareTokenInfo mTokenDialog1 = this.w.mTokenDialog;
          int i = 8;
          if (mTokenDialog1 == null || TextUtils.x(mTokenDialog1.mTagName)) {
             this.v.setVisibility(i);
          }else {
             this.p.setText(mTokenDialog1.mTagName);
             int i1 = 0;
             if (mTokenDialog1.mPhotoCount == null) {
                this.r.setVisibility(i);
             }else {
                Object[] objArray1 = new Object[]{Integer.valueOf(mTokenDialog1.mPhotoCount)};
                this.r.setText(this.getContext().getString(R.string.arg_RES_7f104bb2, objArray1));
                this.r.setVisibility(i1);
             }
             switch (mTokenDialog1.mTagType){
                 case 1:
                 case 2:
                   i1 = 0x7f08235d;
                   break;
                 case 3:
                   i1 = 0x7f082353;
                   break;
                 case 4:
                   i1 = 0x7f082352;
                   break;
                 case 5:
                   i1 = 0x7f08235c;
                   break;
                 case 6:
                   i1 = 0x7f082351;
                   break;
                 default:
             }
             if (i1) {
                this.q.setImageResource(i1);
             }
          }
       }
       if (mTokenDialog != null) {
          this.u.a(mTokenDialog.mPhotoCovers, 0xff000000);
          this.t.setText(mTokenDialog.mAction);
          this.s.setText(mTokenDialog.mSource);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3bd1);
       this.q = m1.f(p0, 0x7f0a3f54);
       this.s = m1.f(p0, 0x7f0a3a8f);
       this.r = m1.f(p0, 0x7f0a0992);
       this.v = m1.f(p0, 0x7f0a3f4a);
       this.t = m1.f(p0, 0x7f0a007c);
       this.u = m1.f(p0, 0x7f0a1046);
       m1.a(p0, new v0(this), R.id.action);
       m1.a(p0, new w0(this), R.id.gallery);
       m1.a(p0, new x0(this), R.id.source);
       m1.a(p0, new u0(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.w = this.q8(ShareTokenInfo.class);
       this.x = this.q8(KwaiTokenDialog.class);
       return;
    }
}
