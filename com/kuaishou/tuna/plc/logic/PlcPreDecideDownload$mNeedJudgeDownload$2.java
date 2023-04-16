package com.kuaishou.tuna.plc.logic.PlcPreDecideDownload$mNeedJudgeDownload$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PlcPreDecideDownload$mNeedJudgeDownload$2 extends Lambda implements a	// class@001029
{
    public static final PlcPreDecideDownload$mNeedJudgeDownload$2 INSTANCE;

    static {
       PlcPreDecideDownload$mNeedJudgeDownload$2.INSTANCE = new PlcPreDecideDownload$mNeedJudgeDownload$2();
    }
    public void PlcPreDecideDownload$mNeedJudgeDownload$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PlcPreDecideDownload$mNeedJudgeDownload$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("plc_download_app", false);
    }
}
