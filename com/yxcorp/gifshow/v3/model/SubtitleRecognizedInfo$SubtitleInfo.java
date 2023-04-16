package com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo$SubtitleInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SubtitleRecognizedInfo$SubtitleInfo implements Serializable	// class@001574
{
    public float endTime;
    public float startTime;
    public String text;
    public int type;

    public void SubtitleRecognizedInfo$SubtitleInfo(){
       super();
       this.text = "";
       this.type = -1;
    }
    public final float getEndTime(){
       return this.endTime;
    }
    public final float getStartTime(){
       return this.startTime;
    }
    public final String getText(){
       return this.text;
    }
    public final int getType(){
       return this.type;
    }
    public final void setEndTime(float p0){
       this.endTime = p0;
    }
    public final void setStartTime(float p0){
       this.startTime = p0;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleRecognizedInfo$SubtitleInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.text = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SubtitleRecognizedInfo$SubtitleInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SubtitleInfo{mText=\'"+this.text+'''+", mStartTime="+this.startTime+", mEndTime="+this.endTime+'}';
    }
}
