package com.yxcorp.gifshow.detail.slidev2.serial.presenter.a;
import p8a.a$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fw6.c;
import sy6.a;
import p8a.a;
import uw9.o;
import q87.c;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import t8a.g;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.util.List;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;

public class a extends PresenterV2 implements a$a	// class@0019e6
{
    public final String p;
    public final int q;
    public a r;
    public MilanoContainerEventBus s;
    public a t;

    public void a(){
       super();
       this.p = "NasaDetailSerialLoadPrePresenter";
       this.q = 3;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       c dataSource = this.r.getDataSource();
       int i = 0;
       if (dataSource instanceof a) {
          Object[] objArray = new Object[i];
          o.C().w("NasaDetailSerialLoadPrePresenter", "onBind pageList", objArray);
          this.t = dataSource;
          dataSource.W0(this);
          this.X7(this.s.C.subscribe(new g(this), Functions.e));
          return;
       }else {
          Object[] objArray1 = new Object[i];
          o.C().w("NasaDetailSerialLoadPrePresenter", "onBind pagelist invalid!!!", objArray1);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tt = this.t;
       if (tt != null) {
          tt.W0(null);
       }
       return;
    }
    public boolean j0(boolean p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       o.C().w("NasaDetailSerialLoadPrePresenter", "onNasaLoadingPageSuccess isFirstPage£º"+p0, objArray);
       if (q.f(p1)) {
          Object[] objArray1 = new Object[0];
          o.C().w("NasaDetailSerialLoadPrePresenter", "onNasaLoadingPageSuccess param invalid", objArray1);
          return 0;
       }else {
          QPhoto currentPhoto = this.r.getCurrentPhoto();
          if (!p1.contains(currentPhoto)) {
             currentPhoto = null;
             objArray = new Object[0];
             o.C().w("NasaDetailSerialLoadPrePresenter", "onNasaLoadingPageSuccess no current photo", objArray);
          }
          Object[] objArray2 = new Object[]{Integer.valueOf(p1.indexOf(currentPhoto))};
          o.C().w("NasaDetailSerialLoadPrePresenter", "onNasaLoadingPageSuccess index:", objArray2);
          objArray2 = new Object[]{Integer.valueOf(p1.size())};
          o.C().w("NasaDetailSerialLoadPrePresenter", "onNasaLoadingPageSuccess size:", objArray2);
          this.r.x(p1, currentPhoto, 0, "NasaDetailSerialLoadPrePresenter");
          return 1;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       this.s = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
