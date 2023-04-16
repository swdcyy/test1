package com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import kotlin.jvm.internal.a;
import vy6.a;
import qrd.l1;
import com.yxcorp.gifshow.growth.freetraffic.GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1;
import java.lang.Throwable;
import qrd.j0;
import java.util.List;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class GrowthFreeTrafficPresenter extends PresenterV2	// class@001382
{
    public List p;
    public QPhoto q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public final a t;

    public void GrowthFreeTrafficPresenter(){
       super();
       this.t = new GrowthFreeTrafficPresenter$a(this);
    }
    public void E8(){
       l1 a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthFreeTrafficPresenter.class, "2")) {
          return;
       }
       GrowthFreeTrafficPresenter tr = this.r;
       if (tr != null) {
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
          this.s = slidePlayVie;
          if (slidePlayVie != null) {
             GrowthFreeTrafficPresenter tr1 = this.r;
             a.m(tr1);
             slidePlayVie.P(tr1, this.t);
             a = l1.a;
          }else {
             a = new GrowthFreeTrafficPresenter$onBind$$inlined$runCatching$lambda$1(this);
          }
          objArray = a;
       }
       Result.constructor-impl(objArray);
       return;
    }
    public void J8(){
       l1 a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrowthFreeTrafficPresenter.class, "3")) {
          return;
       }
       GrowthFreeTrafficPresenter tt = this.t;
       GrowthFreeTrafficPresenter ts = this.s;
       if (ts != null && this.r != null) {
          a.m(ts);
          tt = this.r;
          a.m(tt);
          ts.D(tt, this.t);
          a = l1.a;
       }else {
          ts = this.p;
          if (ts != null) {
             objArray = Boolean.valueOf(ts.remove(tt));
          }
          a = objArray;
       }
       Result.constructor-impl(a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, GrowthFreeTrafficPresenter.class, "1")) {
          return;
       }
       this.p = this.t8("DETAIL_ATTACH_LISTENERS");
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       this.r = this.t8("DETAIL_FRAGMENT");
       return;
    }
}
