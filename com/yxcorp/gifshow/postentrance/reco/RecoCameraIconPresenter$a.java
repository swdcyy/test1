package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import qrd.p;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$b;

public final class RecoCameraIconPresenter$a	// class@00105c
{

    public void RecoCameraIconPresenter$a(){
       super();
    }
    public void RecoCameraIconPresenter$a(u p0){
       super();
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$a.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = RecoCameraIconPresenter.F.getValue();
       }
       return obj.longValue();
    }
    public final RecoCameraIconPresenter$b b(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RecoCameraIconPresenter.G.getValue();
    }
}
