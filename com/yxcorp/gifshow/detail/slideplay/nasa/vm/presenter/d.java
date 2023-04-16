package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import o56.d;
import y6a.k;
import erd.g;
import crd.b;
import brd.t;
import y6a.l;
import io.reactivex.subjects.PublishSubject;

public class d extends PresenterV2	// class@001814
{
    public boolean p;
    public long q;
    public PublishSubject r;
    public PublishSubject s;
    public QPhoto t;
    public NasaBizParam u;

    public void d(){
       super();
       this.q = 0;
    }
    public void E8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, d.class, "2")) {
          return;
       }
       String str = "3";
       d obj = PatchProxy.applyWithListener(objArray, this, d.class, str);
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.u;
          if (obj == null || !obj.getNasaSlideParam().isHomeFeatureStyle()) {
             PatchProxy.onMethodExit(d.class, str);
          }else {
             obj = this.t;
             if (obj == null || (!obj.isVideoType() && (!this.t.isSinglePhoto() && (!this.t.isKtv() && (!this.t.isAtlasPhotos() && !this.t.isLongPhotos()))))) {
                PatchProxy.onMethodExit(d.class, str);
             }else if(!d.a && !this.q){
                b = true;
             }else {
                b = false;
             }
             PatchProxy.onMethodExit(d.class, str);
          }
          b = false;
       }
       if (!b) {
          this.q = -1;
          PatchProxy.onMethodExit(d.class, "2");
          return;
       }else {
          obj = this.r;
          if (obj != null) {
             this.X7(obj.subscribe(new k(this)));
          }
          obj = this.s;
          if (obj != null) {
             this.X7(obj.subscribe(new l(this)));
          }
          this.p = true;
          PatchProxy.onMethodExit(d.class, "2");
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, d.class, "6")) {
          return;
       }
       if (this.p != null) {
          this.p = false;
          this.q = -1;
       }
       PatchProxy.onMethodExit(d.class, "6");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, d.class, "1")) {
          return;
       }
       this.r = this.t8("DETAIL_ELEMENT_ONBIND");
       this.s = this.t8("DETAIL_ELEMENT_BECOMES_ATTACHED");
       this.t = this.s8(QPhoto.class);
       this.u = this.s8(NasaBizParam.class);
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
