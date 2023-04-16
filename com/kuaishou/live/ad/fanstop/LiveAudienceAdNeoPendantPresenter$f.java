package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$f;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import kotlin.jvm.internal.a;

public final class LiveAudienceAdNeoPendantPresenter$f implements o	// class@00096b
{
    public static final LiveAudienceAdNeoPendantPresenter$f b;

    static {
       LiveAudienceAdNeoPendantPresenter$f.b = new LiveAudienceAdNeoPendantPresenter$f();
    }
    public void LiveAudienceAdNeoPendantPresenter$f(){
       super();
    }
    public Object apply(Object p0){
       ProvideNeoInfo provideNeoIn = PatchProxy.applyOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter$f.class, "1");
       if (provideNeoIn != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          provideNeoIn = p0.mData;
       }
       return provideNeoIn;
    }
}
