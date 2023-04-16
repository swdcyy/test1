package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$c;
import ezb.f;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import ezb.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vzb.a;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;
import com.kwai.gifshow.post.api.feature.camera.model.CameraIconInfo;
import com.kuaishou.android.model.mix.PostShowInfo;
import an6.e;
import nsd.u;
import android.view.View;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import a0c.g;
import q87.c;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.model.CDNUrl;

public final class RecoCameraIconPresenter$c extends f	// class@00105e
{
    public Drawable c;
    public Drawable d;
    public RecoCameraIconPresenter$d e;
    public CDNUrl[] f;
    public CDNUrl[] g;
    public final RecoCameraIconPresenter h;

    public void RecoCameraIconPresenter$c(RecoCameraIconPresenter p0){
       this.h = p0;
       super(1);
    }
    public l b(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RecoCameraIconPresenter$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RecoCameraIconPresenter$c te = this.e;
       if (te != null) {
          objArray = te.a();
       }
       l ol = new l(null, null, null, null, null, objArray, 31, null);
       return obj;
    }
    public View c(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.X8();
    }
    public String d(){
       return "RecoCameraIconPresenter";
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter$c.class, "2")) {
          return;
       }
       this.h.b9();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter$c.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "refresh", objArray);
       this.h.c9();
       return;
    }
    public final Drawable j(){
       return this.c;
    }
    public final RecoCameraIconPresenter$d k(){
       return this.e;
    }
    public final void l(CDNUrl[] p0){
       this.f = p0;
    }
    public final void m(Drawable p0){
       this.d = p0;
    }
}
