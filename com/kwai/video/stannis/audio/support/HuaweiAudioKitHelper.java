package com.kwai.video.stannis.audio.support.HuaweiAudioKitHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build;

public class HuaweiAudioKitHelper	// class@000c44
{
    public static boolean useAudioKit;

    public void HuaweiAudioKitHelper(){
       super();
    }
    public static boolean isUseAudioKit(){
       Object obj = PatchProxy.apply(null, null, HuaweiAudioKitHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (("HUAWEI").equalsIgnoreCase(Build.MANUFACTURER) && (HuaweiAudioKitHelper.useAudioKit || ("HONOR").equalsIgnoreCase(Build.BRAND)))? true: false;
       return b;
    }
    public static void setUseAudioKit(boolean p0){
       HuaweiAudioKitHelper.useAudioKit = p0;
    }
}
