package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$ChangeTemplateInfo;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;

public final class VideoTemplateProject$ChangeTemplateInfo implements Serializable	// class@001978
{
    public List clipDurations;
    public final boolean isKs;
    public final String themeId;

    public void VideoTemplateProject$ChangeTemplateInfo(String p0,boolean p1){
       a.p(p0, "themeId");
       super();
       this.themeId = p0;
       this.isKs = p1;
    }
    public final List getClipDurations(){
       return this.clipDurations;
    }
    public final String getThemeId(){
       return this.themeId;
    }
    public final boolean isKs(){
       return this.isKs;
    }
    public final void setClipDurations(List p0){
       this.clipDurations = p0;
    }
}
