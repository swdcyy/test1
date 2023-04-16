package com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil$isEnableNasaSlideLandscape$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class LandscapeUtil$isEnableNasaSlideLandscape$2 extends Lambda implements a	// class@0016e9
{
    public static final LandscapeUtil$isEnableNasaSlideLandscape$2 INSTANCE;

    static {
       LandscapeUtil$isEnableNasaSlideLandscape$2.INSTANCE = new LandscapeUtil$isEnableNasaSlideLandscape$2();
    }
    public void LandscapeUtil$isEnableNasaSlideLandscape$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LandscapeUtil$isEnableNasaSlideLandscape$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableNasaSlideDetailLandscape", true);
    }
}
