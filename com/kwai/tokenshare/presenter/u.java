package com.kwai.tokenshare.presenter.u;
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
import android.widget.Button;
import ekd.m1;
import fu7.z0;
import android.view.View$OnClickListener;
import fu7.a1;
import fu7.y0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class u extends PresenterV2	// class@001952
{
    public TextView p;
    public ImageView q;
    public TextView r;
    public TextView s;
    public Button t;
    public View u;
    public TextView v;
    public ShareTokenInfo w;
    public KwaiTokenDialog x;

    public void u(){
       super();
    }
    public void E8(){
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.w.mTokenDialog;
       if (!PatchProxy.applyVoid(objArray, this, ou, "7")) {
          ShareTokenInfo mTokenDialog1 = this.w.mTokenDialog;
          if (mTokenDialog1 == null || TextUtils.x(mTokenDialog1.mTagName)) {
             this.u.setVisibility(8);
          }else {
             this.p.setText(mTokenDialog1.mTagName);
             Object[] objArray1 = new Object[]{Integer.valueOf(mTokenDialog1.mPhotoCount)};
             int i = 0;
             this.r.setText(this.getContext().getString(R.string.arg_RES_7f104bb2, objArray1));
             switch (mTokenDialog1.mTagType){
                 case 1:
                 case 2:
                   i = 0x7f08235d;
                   break;
                 case 3:
                   i = 0x7f082353;
                   break;
                 case 4:
                   i = 0x7f082352;
                   break;
                 case 5:
                   i = 0x7f08235c;
                   break;
                 case 6:
                   i = 0x7f082351;
                   break;
                 default:
             }
             if (i) {
                this.q.setImageResource(i);
             }
          }
       }
       if (mTokenDialog != null) {
          this.t.setText(mTokenDialog.mAction);
          this.s.setText(mTokenDialog.mSource);
          this.v.setText(mTokenDialog.mErrorMessage);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3f4a);
       this.v = m1.f(p0, 0x7f0a0a92);
       this.t = m1.f(p0, 0x7f0a007c);
       this.r = m1.f(p0, 0x7f0a0992);
       this.q = m1.f(p0, 0x7f0a3f54);
       this.s = m1.f(p0, 0x7f0a3a8f);
       this.p = m1.f(p0, 0x7f0a3bd1);
       m1.a(p0, new z0(this), R.id.action);
       m1.a(p0, new a1(this), R.id.source);
       m1.a(p0, new y0(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.w = this.q8(ShareTokenInfo.class);
       this.x = this.q8(KwaiTokenDialog.class);
       return;
    }
}
