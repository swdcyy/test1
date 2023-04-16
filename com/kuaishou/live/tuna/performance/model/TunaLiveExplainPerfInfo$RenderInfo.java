package com.kuaishou.live.tuna.performance.model.TunaLiveExplainPerfInfo$RenderInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class TunaLiveExplainPerfInfo$RenderInfo implements Serializable	// class@000fbe
{
    public String mBusinessType;
    public JsonObject mExtra;
    public String mRenderBundleId;
    public long mRenderCost;
    public String mRenderResult;
    public int mRenderType;
    public static final long serialVersionUID = 0x9ff89e669e01a4b1;

    public void TunaLiveExplainPerfInfo$RenderInfo(){
       super();
       this.mBusinessType = "";
       this.mRenderType = 0;
       this.mRenderResult = "PLC_0";
       this.mRenderBundleId = "";
       this.mRenderCost = 0;
    }
    public static String generateTKError(int p0){
       if (PatchProxy.isSupport(TunaLiveExplainPerfInfo$RenderInfo.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, TunaLiveExplainPerfInfo$RenderInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return "TK_"+p0;
    }
}
