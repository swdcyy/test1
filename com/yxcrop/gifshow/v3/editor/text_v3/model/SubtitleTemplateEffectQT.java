package com.yxcrop.gifshow.v3.editor.text_v3.model.SubtitleTemplateEffectQT;
import java.io.Serializable;
import com.yxcrop.gifshow.v3.editor.text_v3.model.DurationConfigQT;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class SubtitleTemplateEffectQT implements Serializable	// class@000c18
{
    public DurationConfigQT durationConfig;
    public String id;
    public String kalaokColor;
    public long type;

    public void SubtitleTemplateEffectQT(DurationConfigQT p0,String p1,String p2,long p3){
       a.p(p1, "id");
       super();
       this.durationConfig = p0;
       this.id = p1;
       this.kalaokColor = p2;
       this.type = p3;
    }
    public void SubtitleTemplateEffectQT(DurationConfigQT p0,String p1,String p2,long p3,int p4,u p5){
       DurationConfigQT uDurationCon = (p4 & 0x01)? null: p0;
       String str = (p4 & 0x04)? null: p2;
       super(uDurationCon, p1, str, p3);
       return;
    }
    public final DurationConfigQT getDurationConfig(){
       return this.durationConfig;
    }
    public final String getId(){
       return this.id;
    }
    public final String getKalaokColor(){
       return this.kalaokColor;
    }
    public final long getType(){
       return this.type;
    }
    public final void setDurationConfig(DurationConfigQT p0){
       this.durationConfig = p0;
    }
    public final void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTemplateEffectQT.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.id = p0;
       return;
    }
    public final void setKalaokColor(String p0){
       this.kalaokColor = p0;
    }
    public final void setType(long p0){
       this.type = p0;
    }
}
