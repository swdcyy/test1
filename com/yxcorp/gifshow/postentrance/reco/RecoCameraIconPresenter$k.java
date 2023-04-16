package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$k;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Objects;

public final class RecoCameraIconPresenter$k implements o	// class@001066
{
    public static final RecoCameraIconPresenter$k b;

    static {
       RecoCameraIconPresenter$k.b = new RecoCameraIconPresenter$k();
    }
    public void RecoCameraIconPresenter$k(){
       super();
    }
    public Object apply(Object p0){
       Object[] objArray = PatchProxy.applyOneRefs(p0, this, RecoCameraIconPresenter$k.class, "1");
       if (objArray != PatchProxyResult.class) {
       }else {
          a.p(p0, "urlList");
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          p0 = p0.toArray(uCDNUrlArray);
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Array<T>");
          objArray = p0;
       }
       return objArray;
    }
}
