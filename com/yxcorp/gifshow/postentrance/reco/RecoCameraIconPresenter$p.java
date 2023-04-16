package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$p;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;

public final class RecoCameraIconPresenter$p implements g	// class@00106b
{
    public static final RecoCameraIconPresenter$p b;

    static {
       RecoCameraIconPresenter$p.b = new RecoCameraIconPresenter$p();
    }
    public void RecoCameraIconPresenter$p(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoCameraIconPresenter$p.class, "1")) {
       }else {
          g.C().e("RecoCameraIconPresenter", "observable evePostEntranceRecommendData error", p0);
       }
       return;
    }
}
