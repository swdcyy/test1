package com.yxcorp.gifshow.ad.detail.presenter.player.f;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;
import com.yxcorp.gifshow.ad.detail.presenter.player.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import o56.d;
import d19.h;
import d19.g;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f extends b	// class@00167d
{
    public List A;
    public BaseFragment B;
    public t C;
    public boolean D;
    public final a E;
    public KwaiImageView x;
    public View y;
    public SlidePlayViewModel z;

    public void f(){
       super();
       this.E = new f$a(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "5")) {
          return;
       }
       if (!this.W8()) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          f ty = this.y;
          int i = 0;
          if (ty != null) {
             ty.setVisibility(i);
          }
          this.x.setVisibility(i);
       }
       super.E8();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.B.getParentFragment());
       this.z = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.B, this.E);
       }else {
          this.A.add(this.E);
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "9")) {
          this.u = (!d.a)? new h(this): objArray;
       }
    label_0060 :
       this.X7(this.C.subscribe(new g(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       if (!this.W8()) {
          return;
       }
       super.J8();
       f tz = this.z;
       if (tz != null) {
          tz.D(this.B, this.E);
       }else {
          this.A.remove(this.E);
       }
       return;
    }
    public KwaiImageView P8(){
       return this.x;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.S8();
       f ty = this.y;
       if (ty != null) {
          ty.setVisibility(8);
       }
       return;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q.isImageType();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a319f);
       this.y = m1.f(p0, 0x7f0a302f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.A = this.r8("DETAIL_ATTACH_LISTENERS");
       this.B = this.r8("DETAIL_FRAGMENT");
       this.C = this.r8("DETAIL_POSTER_EVENT");
       return;
    }
}
