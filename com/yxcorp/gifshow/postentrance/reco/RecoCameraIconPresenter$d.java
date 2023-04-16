package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;
import vzb.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RecoCameraIconPresenter$d	// class@00105f
{
    public final a a;

    public void RecoCameraIconPresenter$d(a p0){
       a.p(p0, "eveRecommendData");
       super();
       this.a = p0;
    }
    public final a a(){
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.a);
    }
}
