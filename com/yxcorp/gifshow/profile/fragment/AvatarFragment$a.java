package com.yxcorp.gifshow.profile.fragment.AvatarFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import im8.f;
import java.lang.Boolean;
import ekd.j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.e;
import brd.t;
import t45.d;
import brd.z;
import k3c.b;
import erd.g;
import crd.b;
import k3c.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import lnc.d2;
import android.app.Activity;
import rkd.b;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class AvatarFragment$a extends PresenterV2	// class@0012f8
{
    public User p;
    public CDNUrl[] q;
    public KwaiImageView r;
    public f s;
    public PublishSubject t;

    public void AvatarFragment$a(){
       super();
    }
    public void E8(){
       a$a uoa;
       if (PatchProxy.applyVoid(null, this, AvatarFragment$a.class, "3")) {
          return;
       }
       if (this.p.isBanned()) {
          this.r.setImageResource(R.drawable.detail_avatar_secret);
          this.r.setBackgroundColor(0xff000000);
          this.r.getHierarchy().u(t$b.h);
          RelativeLayout$LayoutParams layoutParams = this.r.getLayoutParams();
          layoutParams.width = n.y(this.getContext()) - a1.e(0x42f00000);
          layoutParams.addRule(14);
          this.r.setLayoutParams(layoutParams);
       }else if(this.s.get().booleanValue()){
          this.r.getHierarchy().u(t$b.h);
       }else {
          this.r.getHierarchy().u(t$b.a);
       }
       String str = ":ks-features:ft-social:profile-edit";
       if (!j.h(this.q)) {
          uoa = a.d();
          uoa.b(str);
          this.r.X(this.q, uoa.a());
       }else {
          uoa = a.d();
          uoa.b(str);
          this.r.X(this.p.getAvatars(), uoa.a());
       }
       this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new b(this)));
       this.P8(Boolean.FALSE);
       this.X7(this.t.subscribe(new a(this)));
       return;
    }
    public final void P8(Boolean p0){
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$a.class, "4")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
       if (d2.m(this.getContext().getResources().getConfiguration())) {
          i = d2.b(this.getActivity()) / 2;
          i1 = d2.b(this.getActivity()) / 2;
       }else if(b.g()){
          i = d2.a(this.getActivity()) / 2;
          i1 = d2.a(this.getActivity()) / 2;
       }else {
          i = n.z(this.getContext());
          i1 = i;
       }
       layoutParams.height = i;
       layoutParams.width = i1;
       this.r.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFragment$a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0370);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AvatarFragment$a.class, "1")) {
          return;
       }
       this.p = this.r8("user");
       this.q = this.r8("cnds");
       this.s = this.x8("defaultHead");
       this.t = this.r8("CONFIGURATION_CHANGED_EVENT");
       return;
    }
}
