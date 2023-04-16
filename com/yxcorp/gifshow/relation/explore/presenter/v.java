package com.yxcorp.gifshow.relation.explore.presenter.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import com.yxcorp.gifshow.relation.explore.presenter.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7c.c;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import fac.c;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.widget.ImageView;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import eg.a;
import android.widget.TextView;
import com.kwai.framework.model.user.RecoUser;
import zf6.k;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import k2b.e0;
import gbc.b;
import hac.f1;
import erd.g;
import crd.b;
import brd.t;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.relation.explore.presenter.u;
import java.lang.Runnable;
import n7c.e;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import hac.g1;
import com.yxcorp.gifshow.relation.explore.presenter.t;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.p1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.v$b;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import y8c.d;
import fac.b;

public class v extends PresenterV2	// class@001866
{
    public KwaiImageView A;
    public View B;
    public ImageView C;
    public TextView D;
    public TextView E;
    public View F;
    public boolean G;
    public final View$OnClickListener H;
    public int p;
    public RecoUser q;
    public List r;
    public PublishSubject s;
    public PublishSubject t;
    public c u;
    public BaseFragment v;
    public d w;
    public b x;
    public int y;
    public KwaiImageView z;
    public static final ContactPermissionHolder I;

    static {
       v.I = new ContactPermissionHolder(new b(new c()));
    }
    public void v(){
       super();
       this.p = -1;
       this.H = new v$a(this);
    }
    public void E8(){
       a$a uoa;
       ViewGroup$LayoutParams layoutParams2;
       int i;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "2")) {
          return;
       }
       this.G = c.a();
       if (!PatchProxy.applyVoid(objArray, this, ov, "4")) {
          RecyclerView$LayoutParams layoutParams3 = this.m8().getLayoutParams();
          layoutParams3.width = this.u.g();
          layoutParams3.height = (int)((float)this.u.c() + (this.u.e() * (float)a1.d(0x7f07028d)));
          this.m8().setLayoutParams(layoutParams3);
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "5")) {
          layoutParams2 = this.z.getLayoutParams();
          int i1 = (this.G != null)? 200: 110;
          i1 = a.c(((float)i1 * this.u.e()), a.b().getResources());
          int i2 = (this.G != null)? this.u.g(): a.c((this.u.e() * 0x42f00000), a.b().getResources());
          layoutParams2.width = i2;
          layoutParams2.height = i1;
          this.z.setLayoutParams(layoutParams2);
       }
       String str = 2;
       PymkGuideCard pymkGuideCar = 0x41400000;
       if (!PatchProxy.applyVoid(objArray, this, ov, "7")) {
          layoutParams2 = this.A.getLayoutParams();
          i = this.u.g() - (a.c(pymkGuideCar, a.b().getResources()) * 2);
          layoutParams2.width = i;
          layoutParams2.height = (i * 146) / 336;
          this.A.setLayoutParams(layoutParams2);
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "6")) {
          layoutParams2 = this.F.getLayoutParams();
          i = a.c((this.u.e() * 40.00f), a.b().getResources());
          layoutParams2.width = i;
          layoutParams2.height = i;
          this.F.setLayoutParams(layoutParams2);
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "8")) {
          this.D.setTextSize(0, (float)a.c((this.u.e() * 20.00f), a.b().getResources()));
          ViewGroup$MarginLayoutParams layoutParams1 = this.D.getLayoutParams();
          if (this.G != null) {
             str = 44;
          }
          layoutParams1.topMargin = a.c(((float)str * this.u.e()), a.b().getResources());
          this.D.setLayoutParams(layoutParams1);
       }
       if (!PatchProxy.applyVoid(objArray, this, ov, "9")) {
          ViewGroup$MarginLayoutParams layoutParams = this.E.getLayoutParams();
          layoutParams.topMargin = a.c((this.u.e() * pymkGuideCar), a.b().getResources());
          this.E.setLayoutParams(layoutParams);
          this.E.setTextSize(0, (float)a.c((this.u.e() * 15.00f), a.b().getResources()));
       }
       v ov1 = 8;
       if (this.G != null) {
          this.B.setVisibility(0);
       }else {
          this.B.setVisibility(ov1);
       }
       this.C.setVisibility(0);
       RecoUser mPymkGuideCa = this.q.mPymkGuideCard;
       str = ":ks-features:ft-social:relation";
       if (k.d() && !TextUtils.isEmpty(mPymkGuideCa.mDarkHeadUrl)) {
          uoa = a.d();
          uoa.b(str);
          uoa.d(ImageSource.ICON);
          this.z.M(mPymkGuideCa.mDarkHeadUrl, uoa.a());
       }else if(!TextUtils.isEmpty(mPymkGuideCa.mHeadUrl)){
          uoa = a.d();
          uoa.b(str);
          uoa.d(ImageSource.ICON);
          this.z.M(mPymkGuideCa.mHeadUrl, uoa.a());
       }
       if (!TextUtils.isEmpty(mPymkGuideCa.mPhotoUrl) && c.b()) {
          a$a uoa1 = a.d();
          uoa1.b(str);
          uoa1.d(ImageSource.ICON);
          this.A.M(mPymkGuideCa.mPhotoUrl, uoa1.a());
          this.A.setVisibility(0);
       }else {
          this.A.setVisibility(ov1);
       }
       if (!TextUtils.isEmpty(mPymkGuideCa.mSubTitle)) {
          this.E.setText(mPymkGuideCa.mSubTitle);
       }
       if (v.I.d()) {
          this.R8();
       }else if(!TextUtils.isEmpty(mPymkGuideCa.mTitle)){
          this.D.setText(mPymkGuideCa.mTitle);
       }
       b.g(this.y, this.v);
       this.X7(this.t.subscribe(new f1(this)));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "10")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       ContactPermissionHolder i = v.I;
       if (i.d()) {
          b.f("second_view", this.y, this.v);
       }else {
          b.f("view", this.y, this.v);
       }
       i.g(this.getActivity(), this.y, new u(this, activity));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, v.class, "11")) {
          return;
       }
       v tp = this.p;
       if (tp != -1) {
          e.d(tp, this.D, this.E);
       }else {
          this.X7(b.f().map(new e()).observeOn(d.a).subscribe(new g1(this), t.b));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "3")) {
          return;
       }
       this.z = p0.findViewById(0x7f0a0333);
       this.F = p0.findViewById(0x7f0a0785);
       this.D = p0.findViewById(0x7f0a3f2c);
       this.E = p0.findViewById(0x7f0a3bd1);
       this.A = p0.findViewById(0x7f0a3041);
       this.B = p0.findViewById(0x7f0a1047);
       p1.c(this.F, a1.e(16.00f), a1.e(16.00f), a1.e(16.00f), a1.e(16.00f));
       this.F.setOnClickListener(this.H);
       m1.b(p0, new v$b(this), R.id.bigcard_contact_guide_card);
       this.C = p0.findViewById(0x7f0a38be);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.q = this.q8(RecoUser.class);
       this.s = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       this.t = this.r8("relation_btn_click");
       this.u = this.q8(c.class);
       this.v = this.r8("FRAGMENT");
       this.w = this.r8("ADAPTER_POSITION_GETTER");
       b uob = this.q8(b.class);
       this.x = uob;
       this.y = uob.b;
       return;
    }
}
