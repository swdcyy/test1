package com.yxcorp.gifshow.detail.slidev2.presenter.SearchDetailAutoPlayNextPresenter;
import bf5.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.SearchDetailAutoPlayNextPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import tkd.b;
import tkd.d;
import gf5.a;
import bf5.b;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rf5.u;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class SearchDetailAutoPlayNextPresenter extends SlidePlayAutoPlayNextPresenter implements c	// class@0018c0
{
    public PhotoDetailParam f1;
    public u g1;
    public int h1;
    public b i1;
    public final ViewPager$i j1;

    public void SearchDetailAutoPlayNextPresenter(){
       super();
       this.h1 = 0;
       this.j1 = new SearchDetailAutoPlayNextPresenter$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchDetailAutoPlayNextPresenter.class, "2")) {
          return;
       }
       super.E8();
       if (c.g()) {
          objArray = d.a(-2036324525).EY();
       }
       this.i1 = objArray;
       this.Z = false;
       this.V0.i(this.j1);
       return;
    }
    public void E9(){
       if (PatchProxy.applyVoid(null, this, SearchDetailAutoPlayNextPresenter.class, "7")) {
          return;
       }
       if (this.Y == null) {
          return;
       }
       SlidePlayAutoPlayNextPresenter slidePlayAut = 1;
       if (this.h1 != slidePlayAut) {
          slidePlayAut = null;
       }
       if (slidePlayAut) {
          return;
       }else {
          SearchDetailAutoPlayNextPresenter ti1 = this.i1;
          if (ti1 != null && !ti1.b(this)) {
             return;
          }else if(this.V0.H(this.x)){
             this.V0.L(this.W0);
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SearchDetailAutoPlayNextPresenter.class, "3")) {
          return;
       }
       super.J8();
       this.V0.g(this.j1);
       return;
    }
    public PhotoDetailParam d1(){
       return this.f1;
    }
    public QPhoto getPhoto(){
       return this.x;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SearchDetailAutoPlayNextPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.f1 = this.q8(PhotoDetailParam.class);
       this.g1 = this.q8(u.class);
       return;
    }
    public void k9(){
       SearchDetailAutoPlayNextPresenter searchDetail = SearchDetailAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, searchDetail, "5")) {
          return;
       }
       super.k9();
       if (!PatchProxy.applyVoid(objArray, this, searchDetail, "6")) {
          SlidePlayAutoPlayNextPresenter tq = this.q;
          if (tq != null) {
             ViewGroup$LayoutParams layoutParams = tq.getLayoutParams();
             layoutParams.height = 0;
             layoutParams.width = 0;
          }
       }
       return;
    }
    public boolean m9(){
       return false;
    }
    public boolean n9(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SearchDetailAutoPlayNextPresenter searchDetail = SearchDetailAutoPlayNextPresenter.class;
       Object obj = PatchProxy.apply(null, this, searchDetail, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.i1.a()) {
          Object obj1 = PatchProxy.apply(null, this, searchDetail, "8");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!this.g1.q() - 0x3f800000){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0040 :
             return b;
          }
       }
       b = false;
       goto label_0040 ;
    }
    public SlidePlayViewModel p0(){
       return this.V0;
    }
}
