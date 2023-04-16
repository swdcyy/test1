package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;

public final class RecoCameraIconPresenter$f implements Runnable	// class@001061
{
    public final RecoCameraIconPresenter b;

    public void RecoCameraIconPresenter$f(RecoCameraIconPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter$f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "autoClose recoCameraIcon", objArray);
       this.b.b9();
       return;
    }
}
