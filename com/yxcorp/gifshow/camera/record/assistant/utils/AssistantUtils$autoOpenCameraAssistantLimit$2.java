package com.yxcorp.gifshow.camera.record.assistant.utils.AssistantUtils$autoOpenCameraAssistantLimit$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class AssistantUtils$autoOpenCameraAssistantLimit$2 extends Lambda implements a	// class@001d1e
{
    public static final AssistantUtils$autoOpenCameraAssistantLimit$2 INSTANCE;

    static {
       AssistantUtils$autoOpenCameraAssistantLimit$2.INSTANCE = new AssistantUtils$autoOpenCameraAssistantLimit$2();
    }
    public void AssistantUtils$autoOpenCameraAssistantLimit$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, AssistantUtils$autoOpenCameraAssistantLimit$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("autoOpenCameraAssistantLimit", -1);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
