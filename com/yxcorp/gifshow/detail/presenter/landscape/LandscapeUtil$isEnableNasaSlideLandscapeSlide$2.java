package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil$isEnableNasaSlideLandscapeSlide$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class LandscapeUtil$isEnableNasaSlideLandscapeSlide$2 extends Lambda implements a	// class@0016ea
{
    public static final LandscapeUtil$isEnableNasaSlideLandscapeSlide$2 INSTANCE;

    static {
       LandscapeUtil$isEnableNasaSlideLandscapeSlide$2.INSTANCE = new LandscapeUtil$isEnableNasaSlideLandscapeSlide$2();
    }
    public void LandscapeUtil$isEnableNasaSlideLandscapeSlide$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LandscapeUtil$isEnableNasaSlideLandscapeSlide$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableNasaSlideDetailLandscapeSlide", false);
    }
}
