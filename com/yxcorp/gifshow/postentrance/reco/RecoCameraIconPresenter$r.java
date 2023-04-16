package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$r;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;

public final class RecoCameraIconPresenter$r implements g	// class@00106d
{
    public static final RecoCameraIconPresenter$r b;

    static {
       RecoCameraIconPresenter$r.b = new RecoCameraIconPresenter$r();
    }
    public void RecoCameraIconPresenter$r(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$r.class, "1")) {
       }else {
          g.C().e("RecoCameraIconPresenter", "parse PostSessionExitEvent error", p0);
       }
       return;
    }
}
