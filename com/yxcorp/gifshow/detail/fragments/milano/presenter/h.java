package com.yxcorp.gifshow.detail.fragments.milano.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import v0a.u0;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.h$a;
import v0a.r0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import sy6.a;
import df5.e;
import hf5.g;
import wkd.b;
import zy5.k;
import brd.t;
import zy5.d;
import v0a.s0;
import erd.g;
import crd.b;
import v0a.t0;
import java.lang.Runnable;
import ekd.k1;
import uw9.o;
import q87.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.c;
import java.lang.StringBuilder;
import fw6.c;
import hn5.i0;
import java.util.ArrayList;
import zy5.i;

public class h extends PresenterV2	// class@00152b
{
    public final BrowsePage p;
    public a q;
    public g r;
    public final Runnable s;
    public final q t;
    public final e u;

    public void h(BrowsePage p0){
       super();
       this.s = new u0(this);
       this.t = new h$a(this);
       this.u = new r0(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.q.e(this.t);
       this.r.L5(this.u);
       this.X7(b.a(-275376108).b().subscribe(new s0(this)));
       this.X7(this.r.m().subscribe(new t0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.q.b(this.t);
       this.r.p8(this.u);
       k1.m(this.s);
       return;
    }
    public final void P8(){
       int i1;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       o.C().w("NasaQPhotoDuplicatedPresenter", "start filter", objArray1);
       List list = this.q.i0();
       if (q.f(list)) {
          return;
       }
       if (this.q.r()) {
          i1 = c.d(this.q, this.q.getCurrentPhoto());
          if (i1 == -1) {
             i1 = 0;
          }
       }else {
          i1 = this.q.a0();
       }
       if (i1 < 0) {
          String str = "filter error,startIndex = "+i1+",currentDataSource="+this.q.getDataSource();
          objArray2 = new Object[i];
          o.C().w("NasaQPhotoDuplicatedPresenter", str, objArray2);
          i0.b("NasaQPhotoDuplicatedPresenter", str);
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          k ok = b.a(-275376108);
          while (i1 < list.size()) {
             QPhoto qPhoto = list.get(i1);
             if (!qPhoto.isShowed() && (ok.a(qPhoto, i.a(this.p, i)) && qPhoto != this.q.getCurrentPhoto())) {
                uArrayList.add(qPhoto);
             }
          label_00ab :
             i1 = i1 + 1;
          }
          if (q.f(uArrayList)) {
             return;
          }else {
             objArray2 = new Object[i];
             o.C().w("NasaQPhotoDuplicatedPresenter", "start remove", objArray2);
             this.q.J(uArrayList, objArray, "NasaQPhotoDuplicatedPresenter");
             return;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.q8(g.class);
       return;
    }
}
