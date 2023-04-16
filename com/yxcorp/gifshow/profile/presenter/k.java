package com.yxcorp.gifshow.profile.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import brd.t;
import t45.d;
import brd.z;
import i4c.f1;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import u3c.e;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.profile.model.ProfileRankIconInfo;
import android.view.View;
import android.view.ViewStub;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import i4c.g1;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.n;
import java.lang.Integer;

public class k extends PresenterV2	// class@001450
{
    public QPhoto p;
    public PhotoMeta q;
    public int r;
    public boolean s;
    public int t;
    public KwaiImageView u;
    public TextView v;
    public View w;
    public ViewStub x;

    public void k(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.P8();
       this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new f1(this)));
       return;
    }
    public final void P8(){
       int b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
          return;
       }
       View obj = PatchProxy.apply(objArray, this, ok, "5");
       ProfileRankIconInfo profileRankI = 1;
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.r == profileRankI && (this.p.isPublic() && this.s == null)){
          k tq = this.q;
          if (tq != null && (e.a.a(tq) != null && !this.p.showCoCreateIcon())) {
             b = true;
          }
       }
    label_0045 :
       b = false;
       int i1 = 8;
       if (b) {
          if (this.w == null) {
             obj = this.x.inflate();
             this.w = obj;
             this.u = m1.f(obj, 0x7f0a3284);
             this.v = m1.f(this.w, 0x7f0a3285);
          }
          this.w.setVisibility(i);
          this.v.setVisibility(i1);
          this.v.setTextSize(i, (float)a1.d(R.dimen.arg_RES_7f07027a));
          if (!PatchProxy.applyVoid(objArray, this, ok, "6")) {
             ok = this.q;
             if (ok != null) {
                e a = e.a;
                if (a.a(ok) != null) {
                   ProfileRankIconInfo profileRankI1 = a.a(this.q);
                   ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
                   b = a1.d(R.dimen.arg_RES_7f0702ab);
                   layoutParams.height = b;
                   ProfileRankIconInfo mIconWidth = profileRankI1.mIconWidth;
                   if (mIconWidth > null) {
                      profileRankI = profileRankI1.mIconHeight;
                      if (profileRankI > null) {
                         b = (int)(((float)mIconWidth / (float)profileRankI) * (float)b);
                      label_00c7 :
                         layoutParams.width = b;
                         this.u.setLayoutParams(layoutParams);
                         this.u.setVisibility(i);
                         a$a uoa = a.d();
                         uoa.b(":ks-features:ft-social:profile");
                         this.u.Y(profileRankI1.mIconUrls, uoa.a(), new g1(this, layoutParams, profileRankI1));
                      }
                   }
                   b = a1.d(R.dimen.arg_RES_7f0702d6);
                   goto label_00c7 ;
                }
             }
          }
       }else {
          View[] viewArray = new View[]{this.x,this.w};
          n.Z(i1, viewArray);
       }
    label_00fb :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a32da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.s8(PhotoMeta.class);
       this.r = this.r8("TAB_ID").intValue();
       this.t = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
