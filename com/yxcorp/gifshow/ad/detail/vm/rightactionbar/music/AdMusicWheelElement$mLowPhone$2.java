package com.yxcorp.gifshow.ad.detail.vm.rightactionbar.music.AdMusicWheelElement$mLowPhone$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.perf.phonelevel.d;

public final class AdMusicWheelElement$mLowPhone$2 extends Lambda implements a	// class@001730
{
    public static final AdMusicWheelElement$mLowPhone$2 INSTANCE;

    static {
       AdMusicWheelElement$mLowPhone$2.INSTANCE = new AdMusicWheelElement$mLowPhone$2();
    }
    public void AdMusicWheelElement$mLowPhone$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, AdMusicWheelElement$mLowPhone$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-404437045);
       a.o(obj, "Singleton.get\(PhoneLevelUtils::class.java\)");
       return obj.g();
    }
}
