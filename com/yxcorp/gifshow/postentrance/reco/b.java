package com.yxcorp.gifshow.postentrance.reco.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$a;
import q87.c;

public final class b implements Runnable	// class@001073
{
    public final RecoCameraIconPresenter$q b;

    public void b(RecoCameraIconPresenter$q p0){
       this.b = p0;
       super();
    }
    public final void run(){
       RecoCameraIconPresenter$q b;
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "after postSessionExitEvent "+RecoCameraIconPresenter.I.a()+"ms", objArray);
       b = this.b.b;
       b.v = null;
       b.R8();
       return;
    }
}
