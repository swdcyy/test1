package com.yxcorp.gifshow.v3.model.SubtitleRecognizedInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class SubtitleRecognizedInfo implements Serializable	// class@001575
{
    public int delayMs;
    public String fileKey;
    public int resultType;
    public int status;
    public List subtitles;

    public void SubtitleRecognizedInfo(){
       super();
       this.fileKey = "";
       this.subtitles = new ArrayList();
    }
    public final int getDelayMs(){
       return this.delayMs;
    }
    public final String getFileKey(){
       return this.fileKey;
    }
    public final int getResultType(){
       return this.resultType;
    }
    public final int getStatus(){
       return this.status;
    }
    public final List getSubtitles(){
       return this.subtitles;
    }
    public final void setDelayMs(int p0){
       this.delayMs = p0;
    }
    public final void setFileKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleRecognizedInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fileKey = p0;
       return;
    }
    public final void setResultType(int p0){
       this.resultType = p0;
    }
    public final void setStatus(int p0){
       this.status = p0;
    }
    public final void setSubtitles(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleRecognizedInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.subtitles = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SubtitleRecognizedInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "result: "+this.subtitles;
    }
}
