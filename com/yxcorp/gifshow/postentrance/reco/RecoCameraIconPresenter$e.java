package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$e;
import fw8.b;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hn5.c;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import ezb.f;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$c;
import a0c.g;
import q87.c;

public final class RecoCameraIconPresenter$e extends b	// class@001060
{
    public final RecoCameraIconPresenter b;

    public void RecoCameraIconPresenter$e(RecoCameraIconPresenter p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       if (!p0 instanceof c && a.g(this.b.V8().e(), RecoCameraIconPresenter.P8(this.b))) {
          Object[] objArray = new Object[0];
          g.C().w("RecoCameraIconPresenter", "onActivityResumed, resetCameraView", objArray);
          this.b.b9();
       }
       return;
    }
}
