package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$m;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$d;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import kotlin.Pair;
import java.lang.Number;

public final class RecoCameraIconPresenter$m implements CameraViewSwitcher$d	// class@001068
{
    public final RecoCameraIconPresenter a;

    public void RecoCameraIconPresenter$m(RecoCameraIconPresenter p0){
       this.a = p0;
       super();
    }
    public void a(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecoCameraIconPresenter$m.class, "1")) {
          return;
       }
       a.p(p0, "previousView");
       a.p(p1, "nextView");
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "inSwitchDelegate", objArray);
       if (a.g(this.a.X8(), p0)) {
          RecoCameraIconPresenter$m ta = this.a;
          ta.z = ta.X8().getCameraButtonView();
       }else {
          p1.z = p0;
       }
       Pair pair = this.a.Y8();
       this.a.X8().g(pair.getFirst().intValue(), pair.getSecond().intValue());
       this.a.c9();
       return;
    }
}
