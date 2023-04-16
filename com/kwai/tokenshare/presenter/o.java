package com.kwai.tokenshare.presenter.o;
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
import com.kwai.tokenshare.presenter.o$a;
import android.view.View$OnClickListener;
import ekd.m1;
import fu7.f0;
import fu7.g0;
import fu7.e0;
import com.kwai.tokenshare.KwaiTokenDialog;

public class o extends PresenterV2	// class@00194c
{
    public TextView p;
    public TextView q;
    public TextView r;
    public Button s;
    public KwaiTokenGalleryView t;
    public View u;
    public ShareTokenInfo v;
    public KwaiTokenDialog w;

    public void o(){
       super();
    }
    public void E8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "3")) {
          return;
       }
       ShareTokenInfo mTokenDialog = this.v.mTokenDialog;
       if (!PatchProxy.applyVoid(objArray, this, oo, "7")) {
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
       this.s.setOnClickListener(new o$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a1046);
       this.p = m1.f(p0, 0x7f0a3bd1);
       this.r = m1.f(p0, 0x7f0a3a8f);
       this.q = m1.f(p0, 0x7f0a0992);
       this.u = m1.f(p0, 0x7f0a3f4a);
       this.s = m1.f(p0, 0x7f0a007c);
       m1.a(p0, new f0(this), R.id.gallery);
       m1.a(p0, new g0(this), R.id.source);
       m1.a(p0, new e0(this), R.id.close);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.v = this.q8(ShareTokenInfo.class);
       this.w = this.q8(KwaiTokenDialog.class);
       return;
    }
}
