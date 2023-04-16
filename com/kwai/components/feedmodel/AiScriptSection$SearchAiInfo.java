package com.kwai.components.feedmodel.AiScriptSection$SearchAiInfo;
import java.io.Serializable;
import com.kwai.components.feedmodel.AiScriptSection;
import java.lang.Object;

public class AiScriptSection$SearchAiInfo implements Serializable	// class@000c0d
{
    public String mAiScript;
    public long mBeginTime;
    public long mEndTime;
    public final AiScriptSection this$0;

    public void AiScriptSection$SearchAiInfo(AiScriptSection p0){
       this.this$0 = p0;
       super();
    }
    public long getBeginTimePosition(){
       return this.mBeginTime;
    }
    public long getEndTimePosition(){
       return this.mEndTime;
    }
}
