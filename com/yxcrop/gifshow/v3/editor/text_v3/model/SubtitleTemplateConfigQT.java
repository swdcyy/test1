package com.yxcrop.gifshow.v3.editor.text_v3.model.SubtitleTemplateConfigQT;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class SubtitleTemplateConfigQT implements Serializable	// class@000c17
{
    public String animationPath;
    public String stylePath;
    public String type;
    public String version;

    public void SubtitleTemplateConfigQT(String p0,String p1,String p2,String p3){
       a.p(p0, "animationPath");
       a.p(p1, "stylePath");
       a.p(p2, "type");
       a.p(p3, "version");
       super();
       this.animationPath = p0;
       this.stylePath = p1;
       this.type = p2;
       this.version = p3;
    }
    public final String getAnimationPath(){
       return this.animationPath;
    }
    public final String getStylePath(){
       return this.stylePath;
    }
    public final String getType(){
       return this.type;
    }
    public final String getVersion(){
       return this.version;
    }
    public final void setAnimationPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTemplateConfigQT.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.animationPath = p0;
       return;
    }
    public final void setStylePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTemplateConfigQT.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.stylePath = p0;
       return;
    }
    public final void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTemplateConfigQT.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.type = p0;
       return;
    }
    public final void setVersion(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTemplateConfigQT.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.version = p0;
       return;
    }
}
