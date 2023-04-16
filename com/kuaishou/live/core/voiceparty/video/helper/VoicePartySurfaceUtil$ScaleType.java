package com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType;
import java.lang.Enum;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType$1;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$ScaleType$2;
import com.kuaishou.live.core.voiceparty.video.helper.VoicePartySurfaceUtil$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Point;

public abstract class VoicePartySurfaceUtil$ScaleType extends Enum	// class@001adf
{
    public static final VoicePartySurfaceUtil$ScaleType[] $VALUES;
    public static final VoicePartySurfaceUtil$ScaleType CenterCrop;
    public static final VoicePartySurfaceUtil$ScaleType FitCenter;

    static {
       VoicePartySurfaceUtil$ScaleType$1 scaleType$1 = new VoicePartySurfaceUtil$ScaleType$1("CenterCrop", 0);
       VoicePartySurfaceUtil$ScaleType.CenterCrop = scaleType$1;
       VoicePartySurfaceUtil$ScaleType$2 scaleType$2 = new VoicePartySurfaceUtil$ScaleType$2("FitCenter", 1);
       VoicePartySurfaceUtil$ScaleType.FitCenter = scaleType$2;
       VoicePartySurfaceUtil$ScaleType[] scaleTypeArr = new VoicePartySurfaceUtil$ScaleType[]{scaleType$1,scaleType$2};
       VoicePartySurfaceUtil$ScaleType.$VALUES = scaleTypeArr;
    }
    public void VoicePartySurfaceUtil$ScaleType(String p0,int p1){
       super(p0, p1);
    }
    public void VoicePartySurfaceUtil$ScaleType(String p0,int p1,VoicePartySurfaceUtil$a p2){
       super(p0, p1);
    }
    public static VoicePartySurfaceUtil$ScaleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoicePartySurfaceUtil$ScaleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoicePartySurfaceUtil$ScaleType.class, p0);
    }
    public static VoicePartySurfaceUtil$ScaleType[] values(){
       Object obj = PatchProxy.apply(null, null, VoicePartySurfaceUtil$ScaleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoicePartySurfaceUtil$ScaleType.$VALUES.clone();
    }
    public abstract void adjust(ViewGroup$MarginLayoutParams p0,Point p1,Point p2);
}
