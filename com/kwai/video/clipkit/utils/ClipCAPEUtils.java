package com.kwai.video.clipkit.utils.ClipCAPEUtils;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.clipkit.config.EditorEncodeConfigManager;
import com.kwai.video.clipkit.config.EditorEncodeConfig$CapeConfig;

public class ClipCAPEUtils	// class@001af4
{

    public void ClipCAPEUtils(){
       super();
    }
    public static boolean enableCAPE(){
       EditorEncodeConfig$CapeConfig obj = PatchProxy.apply(null, null, ClipCAPEUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = EditorEncodeConfigManager.getInstance().getCapeConfig();
       if (obj != null) {
          return obj.enableCape();
       }
       return false;
    }
}
