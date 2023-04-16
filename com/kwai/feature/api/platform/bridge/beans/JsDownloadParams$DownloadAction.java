package com.kwai.feature.api.platform.bridge.beans.JsDownloadParams$DownloadAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsDownloadParams$DownloadAction extends Enum	// class@001059
{
    public static final JsDownloadParams$DownloadAction[] $VALUES;
    public static final JsDownloadParams$DownloadAction PAUSE;
    public static final JsDownloadParams$DownloadAction RESUME;
    public static final JsDownloadParams$DownloadAction START;
    public static final JsDownloadParams$DownloadAction STOP;

    static {
       JsDownloadParams$DownloadAction uDownloadAct = new JsDownloadParams$DownloadAction("START", 0);
       JsDownloadParams$DownloadAction.START = uDownloadAct;
       JsDownloadParams$DownloadAction uDownloadAct1 = new JsDownloadParams$DownloadAction("RESUME", 1);
       JsDownloadParams$DownloadAction.RESUME = uDownloadAct1;
       JsDownloadParams$DownloadAction uDownloadAct2 = new JsDownloadParams$DownloadAction("PAUSE", 2);
       JsDownloadParams$DownloadAction.PAUSE = uDownloadAct2;
       JsDownloadParams$DownloadAction uDownloadAct3 = new JsDownloadParams$DownloadAction("STOP", 3);
       JsDownloadParams$DownloadAction.STOP = uDownloadAct3;
       JsDownloadParams$DownloadAction[] uDownloadAct4 = new JsDownloadParams$DownloadAction[]{uDownloadAct,uDownloadAct1,uDownloadAct2,uDownloadAct3};
       JsDownloadParams$DownloadAction.$VALUES = uDownloadAct4;
    }
    public void JsDownloadParams$DownloadAction(String p0,int p1){
       super(p0, p1);
    }
    public static JsDownloadParams$DownloadAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsDownloadParams$DownloadAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsDownloadParams$DownloadAction.class, p0);
    }
    public static JsDownloadParams$DownloadAction[] values(){
       Object obj = PatchProxy.apply(null, null, JsDownloadParams$DownloadAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsDownloadParams$DownloadAction.$VALUES.clone();
    }
}
