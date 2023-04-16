package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r19.c;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import android.view.View;
import xz5.c;
import r19.e;
import vz5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import xz5.a;
import xz5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uz5.c;
import zz5.d;
import vz5.f;
import org.greenrobot.eventbus.a;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import ekd.m1;
import android.view.ViewStub;
import de5.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import cda.i;
import tkd.b;
import tkd.d;
import nl9.u;
import az6.a;

public class a extends PresenterV2	// class@0016d7
{
    public b A;
    public final Runnable B;
    public a C;
    public ViewStub p;
    public View q;
    public List r;
    public QPhoto s;
    public BaseFragment t;
    public a u;
    public PhotoMeta v;
    public PhotoDetailParam w;
    public SlidePlayViewModel x;
    public RecyclerView y;
    public a z;

    public void a(){
       super();
       this.z = null;
       this.A = null;
       this.B = new c(this);
       this.C = new a$a(this);
    }
    public void E8(){
       a tq;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.t.getParentFragment());
       this.x = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.t, this.C);
       }else {
          tq = this.r;
          if (tq != null) {
             tq.add(this.C);
          }
       }
       tq = this.q;
       if (tq != null) {
          tq.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          uoa = this.x;
          if (uoa != null) {
             this.z = new c(uoa);
             this.A = new e(this);
          }
          uoa = this.z;
          if (uoa != null) {
             a tA = this.A;
             if (tA != null) {
                tq = this.s;
                d.a(tq, this.t, new c(tq, uoa, tA));
                uoa = this.s;
                d.a(uoa, this.t, new f(uoa, this.z, this.A));
             }
          }
       }
    label_0073 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a.d().p(this);
       this.y = this.getActivity().findViewById(0x7f0a32a9);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a.d().t(this);
       this.p = null;
       k1.m(this.B);
       return;
    }
    public final void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       a tx = this.x;
       if (tx != null) {
          if (tx.H(this.s)) {
             this.x.Y(true);
          }else if(this.x.f0(this.s)){
             this.x.u(true);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d1f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.t8("DETAIL_ATTACH_LISTENERS");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.s8(a.class);
       this.v = this.q8(PhotoMeta.class);
       this.w = this.q8(PhotoDetailParam.class);
       return;
    }
    public void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a ts = this.s;
       if (ts != null && ((p0.a).equals(ts.getPhotoId()) && this.v.mFilterStatus != 2)) {
          d.a(-1694791652).a60(this.s, this.t, this.w.mSource);
          this.s.setFilterStatus(2);
          this.P8(false);
       }
    label_003f :
       return;
    }
}
