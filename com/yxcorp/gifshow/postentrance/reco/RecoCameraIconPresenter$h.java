package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$h;
import erd.g;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;

public final class RecoCameraIconPresenter$h implements g	// class@001063
{
    public final RecoCameraIconPresenter b;

    public void RecoCameraIconPresenter$h(RecoCameraIconPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$h.class, "1")) {
       }else {
          g.C().e("RecoCameraIconPresenter", "fetch error", p0);
          this.b.b9();
       }
       return;
    }
}
