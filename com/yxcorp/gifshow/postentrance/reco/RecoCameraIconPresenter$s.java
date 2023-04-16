package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$s;
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

public final class RecoCameraIconPresenter$s implements CameraViewSwitcher$d	// class@00106e
{
    public final RecoCameraIconPresenter a;

    public void RecoCameraIconPresenter$s(RecoCameraIconPresenter p0){
       this.a = p0;
       super();
    }
    public void a(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecoCameraIconPresenter$s.class, "1")) {
          return;
       }
       a.p(p0, "previousView");
       a.p(p1, "nextView");
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "outSwitchDelegate", objArray);
       this.a.X8().f(p1);
       return;
    }
}
