package com.kwai.tokenshare.presenter.d;
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
import android.view.View;
import java.util.List;
import com.kwai.tokenshare.KwaiTokenGalleryView;
import android.widget.Button;
import com.kwai.tokenshare.presenter.d$a;
import android.view.View$OnClickListener;
import ekd.m1;
import fu7.d;
import fu7.f;
import fu7.e;
import com.kwai.tokenshare.KwaiTokenDialog;

public class d extends PresenterV2	// class@001940
{
    public TextView p;
    public TextView q;
    public TextView r;
    public Button s;
    public KwaiTokenGalleryView t;
    public View u;
    public ShareTokenInfo v;
    public KwaiTokenDialog w;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.v.mTokenDialog;
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          ShareTokenInfo mTokenDialog1 = this.v.mTokenDialog;
          if (mTokenDialog1 == null || TextUtils.x(mTokenDialog1.mPoiTitle)) {
             this.u.setVisibility(8);
          }else {
             this.p.setText(mTokenDialog1.mPoiTitle);
             this.q.setText(mTokenDialog1.mPoiAddress);
          }
       }
       if (mTokenDialog != null) {
          this.t.a(mTokenDialog.mPoiCovers, 0xff000000);
          this.s.setText(mTokenDialog.mAction);
          this.r.setText(mTokenDialog.mSource);
       }
       this.s.setOnClickListener(new d$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0992);
       this.p = m1.f(p0, 0x7f0a3bd1);
       this.s = m1.f(p0, 0x7f0a007c);
       this.u = m1.f(p0, 0x7f0a3f4a);
       this.r = m1.f(p0, 0x7f0a3a8f);
       this.t = m1.f(p0, 0x7f0a1046);
       m1.a(p0, new d(this), R.id.close);
       m1.a(p0, new f(this), R.id.source);
       m1.a(p0, new e(this), R.id.gallery);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.v = this.q8(ShareTokenInfo.class);
       this.w = this.q8(KwaiTokenDialog.class);
       return;
    }
}
