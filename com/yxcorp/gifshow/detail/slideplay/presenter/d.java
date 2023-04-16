package com.yxcorp.gifshow.detail.slideplay.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wd5.a;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.presenter.d$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import v6a.f8;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import wd5.o;
import crd.a;
import e7a.p;
import erd.g;
import crd.b;
import brd.t;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import lnc.b9;
import h8a.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import xx9.a;

public class d extends PresenterV2	// class@00185d
{
    public a A;
    public QPhoto p;
    public BaseFragment q;
    public o r;
    public SparseIntArray s;
    public SlidePlayViewModel t;
    public RecyclerView u;
    public ViewStubInflater2 v;
    public t w;
    public a x;
    public a y;
    public final a z;

    public void d(){
       super();
       this.z = new a("longCover");
       this.A = new d$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.t = slidePlayVie;
       slidePlayVie.P(this.q, this.A);
       this.v.d(this.m8());
       this.u = this.m8().findViewById(0x7f0a2d47);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       this.t.D(this.q, this.A);
       return;
    }
    public final RecyclerView P8(){
       RecyclerView recyclerView;
       d obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.v.a() == null)? this.u: this.v.a();
       return obj;
    }
    public SparseIntArray R8(){
       RecyclerView obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.P8();
       if (obj == null) {
          return null;
       }
       if (obj.getAdapter() == null || !obj.getAdapter() instanceof f8) {
          return null;
       }
       return obj.getAdapter().A;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.r.c = this.p.getAtlasList().size();
       this.X8();
       a uoa = new a();
       this.x = uoa;
       uoa.c(this.w.subscribe(new p(this)));
       return;
    }
    public void V8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       if (!this.Y8() && (PatchProxy.applyVoid(objArray, this, uod, "6") || (this.R8() != null && this.R8().size()))) {
          RecyclerView recyclerView = this.P8();
          if (recyclerView != null) {
             LinearLayoutManager layoutManage = recyclerView.getLayoutManager();
             if (layoutManage != null) {
                for (int i = layoutManage.i0(); i <= layoutManage.c(); i = i + 1) {
                   int i1 = this.R8().get(i) + 1;
                   this.R8().put(i, i1);
                }
             }
          }
       }
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       int i = 0;
       int i2 = 0;
       for (int i1 = 0; i1 < this.s.size(); i1 = i1 + 1) {
          i2 = i2 + this.s.valueAt(i1);
       }
       SparseIntArray sparseIntArr = this.R8();
       if (sparseIntArr != null) {
          int i3 = 0;
          for (; i < sparseIntArr.size(); i = i + 1) {
             i3 = i3 + sparseIntArr.valueAt(i);
          }
          this.r.f = sparseIntArr.size();
          this.r.g = i3;
       }
       this.r.b = this.z.b();
       this.r.a = this.z.c();
       d tr = this.r;
       tr.e = i2;
       tr.d = this.s.size();
       this.r.c = this.p.getAtlasList().size();
       if (sparseIntArr != null) {
          sparseIntArr.clear();
       }
       this.z.a();
       this.s.clear();
       b9.a(this.x);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.s.put(0, (this.s.get(0) + 1));
       this.z.d(0);
       return;
    }
    public boolean Y8(){
       return this instanceof a;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.r8("SLIDE_ATLAS_VSE_INFO");
       this.s = this.r8("ATLAS_VIEWED_COUNTS");
       this.v = this.r8("NASA_LONG_PHOTO_SCREEN_CLEAN_VIEW");
       this.w = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       this.y = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       return;
    }
}
