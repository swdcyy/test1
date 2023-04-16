package com.yxcorp.gifshow.relation.explore.presenter.gallery.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.c;
import xwb.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7c.c;
import com.kwai.framework.model.user.RecoUser;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dac.b;
import dac.d;
import k2b.e0;
import gbc.b;
import zf6.k;
import com.yxcorp.gifshow.pymk.PymkGuideCard;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import iac.b;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import dac.a;
import iac.c;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import iac.e;
import java.lang.Runnable;
import n7c.e;
import com.yxcorp.gifshow.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import iac.d;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.b$b;
import y8c.d;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;

public class b extends PresenterV2	// class@001835
{
    public View A;
    public View B;
    public int C;
    public BaseFragment D;
    public b E;
    public boolean F;
    public int p;
    public RecoUser q;
    public d r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;
    public PymkGuideCard v;
    public KwaiImageView w;
    public KwaiImageView x;
    public TextView y;
    public TextView z;
    public static final ContactPermissionHolder G;

    static {
       b.G = new ContactPermissionHolder(new b(new c()));
    }
    public void b(){
       super();
       this.p = -1;
       this.F = false;
    }
    public void E8(){
       a$a uoa;
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.F = c.f();
       this.v = this.q.mPymkGuideCard;
       this.E = d.a(this.D);
       if (this.v != null) {
          b.g(this.C, this.D);
          String str = ":ks-features:ft-social:relation";
          if (k.d() && !TextUtils.isEmpty(this.v.mDarkHeadUrl)) {
             uoa = a.d();
             uoa.b(str);
             uoa.d(ImageSource.ICON);
             this.w.M(this.v.mDarkHeadUrl, uoa.a());
          }else if(!TextUtils.isEmpty(this.v.mHeadUrl)){
             uoa = a.d();
             uoa.b(str);
             uoa.d(ImageSource.ICON);
             this.w.M(this.v.mHeadUrl, uoa.a());
          }
          if (!TextUtils.isEmpty(this.v.mPhotoUrl) && !c.d()) {
             this.x.setVisibility(0);
             a$a uoa1 = a.d();
             uoa1.b(str);
             uoa1.d(ImageSource.ICON);
             this.x.M(this.v.mPhotoUrl, uoa1.a());
          }else {
             this.x.setVisibility(8);
          }
          if (this.F != null && this.E.e()) {
             this.R8();
          }else {
             this.y.setText(this.v.mTitle);
             this.z.setText(this.v.mSubTitle);
          }
          this.y.setText(this.v.mTitle);
          this.z.setText(this.v.mSubTitle);
          if (c.d()) {
             this.B.setVisibility(0);
          }else {
             this.B.setVisibility(8);
          }
       }
       this.X7(this.t.subscribe(new b(this)));
       if (this.F != null) {
          this.X7(RxBus.f.f(a.class).subscribe(new c(this)));
       }
       return;
    }
    public void P8(){
       String str;
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (activity == null) {
          return;
       }
       if (this.F != null && b.G.d()) {
          str = "second_view";
       }else if(this.F != null){
          str = "view";
       }else {
          str = "open";
       }
       b.f(str, this.C, this.D);
       if (this.F != null) {
          this.E.c(false, this.C);
       }else {
          b.G.g(activity, this.C, new e(this));
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tp = this.p;
       if (tp != -1) {
          e.d(tp, this.y, this.z);
       }else {
          this.X7(b.f().map(new e()).observeOn(d.a).subscribe(new d(this), a.b));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.w = p0.findViewById(0x7f0a0333);
       this.x = p0.findViewById(0x7f0a3041);
       this.y = p0.findViewById(0x7f0a3f2c);
       this.z = p0.findViewById(0x7f0a3bd1);
       p0.setOnClickListener(new b$a(this));
       View view = p0.findViewById(R.id.close_btn);
       this.A = view;
       view.setOnClickListener(new b$b(this));
       this.B = p0.findViewById(0x7f0a1047);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.r8("PYMK_ACCESS_IDSitem_data");
       this.r = this.r8("ADAPTER_POSITION_GETTER");
       this.s = this.r8("PYMK_ACCESS_IDSclose_user");
       this.C = this.r8("PYMK_ACCESS_IDSportal").intValue();
       this.t = this.r8("relation_btn_click");
       this.u = this.r8("PYMK_ACCESS_IDSbigcard_btn");
       this.D = this.r8("FRAGMENT");
       return;
    }
}
