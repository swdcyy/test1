package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import i79.b;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.model.KSMemoryClipType;

public final class AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2 extends Lambda implements l	// class@001959
{
    public static final AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2 INSTANCE;

    static {
       AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2.INSTANCE = new AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2();
    }
    public void AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$initStartEndAssetAndMusicClip$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.d() == KSMemoryClipType.OPENING || p0.d() == KSMemoryClipType.ENDING)? true: false;
       return b;
    }
}
