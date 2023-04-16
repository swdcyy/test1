package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$g;
import erd.g;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import ezb.f;

public final class RecoCameraIconPresenter$g implements g	// class@001062
{
    public final RecoCameraIconPresenter b;
    public final CDNUrl[][] c;
    public final RecoCameraIconPresenter$d d;
    public final CDNUrl[] e;

    public void RecoCameraIconPresenter$g(RecoCameraIconPresenter p0,CDNUrl[][] p1,RecoCameraIconPresenter$d p2,CDNUrl[] p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$g.class, "1")) {
       }else {
          a.p(p0, "drawables");
          int i = 0;
          int i1 = 1;
          Object[] objArray = (!p0.length)? 1: null;
          if (objArray) {
             objArray = new Object[i];
             g.C().w("RecoCameraIconPresenter", "fetchIcon, drawables is empty", objArray);
             this.b.b9();
          }else if(!this.b.Z8()){
             objArray = new Object[i];
             g.C().w("RecoCameraIconPresenter", "fetchIcon success, disableShowReco", objArray);
          }else {
             object oobject = this.c[i];
             if (oobject == null) {
                objArray = new Object[i];
                g.C().w("RecoCameraIconPresenter", "requestedCdnUrl is null", objArray);
             }else if(this.b.a9()){
                objArray = new Object[i];
                g.C().w("RecoCameraIconPresenter", "fetchIcon success, need pending", objArray);
                p0.t = this.d;
             }else {
                Object[] objArray1 = new Object[i];
                g.C().w("RecoCameraIconPresenter", "fetchIcon, success", objArray1);
                RecoCameraIconPresenter.P8(this.b).c = p0[i];
                RecoCameraIconPresenter.P8(this.b).g = oobject;
                if (p0.length > i1 && this.e != null) {
                   RecoCameraIconPresenter.P8(this.b).m(p0[i1]);
                   RecoCameraIconPresenter.P8(this.b).l(this.e);
                }else {
                   Drawable uDrawable = null;
                   RecoCameraIconPresenter.P8(this.b).m(uDrawable);
                   RecoCameraIconPresenter.P8(this.b).l(uDrawable);
                }
                p0.e = this.d;
                Object[] objArray2 = new Object[i];
                g.C().w("RecoCameraIconPresenter", "tryShowOrRefresh "+RecoCameraIconPresenter.P8(this.b).k(), objArray2);
                this.b.V8().k(RecoCameraIconPresenter.P8(this.b));
             }
          }
       }
       return;
    }
}
