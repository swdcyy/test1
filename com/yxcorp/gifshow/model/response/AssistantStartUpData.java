package com.yxcorp.gifshow.model.response.AssistantStartUpData;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AssistantStartUpData	// class@001f19
{
    public String assistantSideBarName;
    public String doubleLineTextDeputy;
    public String doubleLineTextMain;
    public Long floatShowDurMs;
    public String floatText;
    public Long floatWaitingShowDurMs;
    public Map initAssistantTitleMap;
    public Map initRecognitionTitleMap;
    public String manualFloatDeputyText;
    public String manualFloatText;
    public Long recognitionTimeOutMs;
    public Long silentRecognitionStartTimeMs;

    public void AssistantStartUpData(){
       super();
       this.initRecognitionTitleMap = null;
       this.initAssistantTitleMap = null;
       this.recognitionTimeOutMs = null;
       this.floatShowDurMs = null;
       this.floatWaitingShowDurMs = null;
       this.silentRecognitionStartTimeMs = null;
       this.floatText = null;
       this.manualFloatText = null;
       this.manualFloatDeputyText = null;
       this.assistantSideBarName = null;
       this.doubleLineTextMain = null;
       this.doubleLineTextDeputy = null;
    }
    public final Map a(){
       return this.initAssistantTitleMap;
    }
    public final Map b(){
       return this.initRecognitionTitleMap;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AssistantStartUpData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AssistantStartUpData && (a.g(this.initRecognitionTitleMap, p0.initRecognitionTitleMap) && (a.g(this.initAssistantTitleMap, p0.initAssistantTitleMap) && (a.g(this.recognitionTimeOutMs, p0.recognitionTimeOutMs) && (a.g(this.floatShowDurMs, p0.floatShowDurMs) && (a.g(this.floatWaitingShowDurMs, p0.floatWaitingShowDurMs) && (a.g(this.silentRecognitionStartTimeMs, p0.silentRecognitionStartTimeMs) && (a.g(this.floatText, p0.floatText) && (a.g(this.manualFloatText, p0.manualFloatText) && (a.g(this.manualFloatDeputyText, p0.manualFloatDeputyText) && (a.g(this.assistantSideBarName, p0.assistantSideBarName) && (a.g(this.doubleLineTextMain, p0.doubleLineTextMain) && a.g(this.doubleLineTextDeputy, p0.doubleLineTextDeputy)))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       AssistantStartUpData obj = PatchProxy.apply(null, this, AssistantStartUpData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.initRecognitionTitleMap;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AssistantStartUpData tinitAssista = this.initAssistantTitleMap;
       int i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.recognitionTimeOutMs;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.floatShowDurMs;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.floatWaitingShowDurMs;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.silentRecognitionStartTimeMs;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.floatText;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.manualFloatText;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.manualFloatDeputyText;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.assistantSideBarName;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.doubleLineTextMain;
       i2 = (tinitAssista != null)? tinitAssista.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tinitAssista = this.doubleLineTextDeputy;
       if (tinitAssista != null) {
          i = tinitAssista.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AssistantStartUpData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AssistantStartUpData\(initRecognitionTitleMap="+this.initRecognitionTitleMap+", initAssistantTitleMap="+this.initAssistantTitleMap+", recognitionTimeOutMs="+this.recognitionTimeOutMs+", floatShowDurMs="+this.floatShowDurMs+", floatWaitingShowDurMs="+this.floatWaitingShowDurMs+", silentRecognitionStartTimeMs="+this.silentRecognitionStartTimeMs+", floatText="+this.floatText+", manualFloatText="+this.manualFloatText+", manualFloatDeputyText="+this.manualFloatDeputyText+", assistantSideBarName="+this.assistantSideBarName+", doubleLineTextMain="+this.doubleLineTextMain+", doubleLineTextDeputy="+this.doubleLineTextDeputy+"\)";
    }
}
