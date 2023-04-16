package com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroup;
import java.io.Serializable;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroup$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AssistantTemplateGroup implements Serializable	// class@001d0d
{
    public String bubbleText;
    public int groupType;
    public int recognitionType;
    public List templates;
    public static final AssistantTemplateGroup$a Companion;
    public static final long serialVersionUID;

    static {
       AssistantTemplateGroup.Companion = new AssistantTemplateGroup$a(null);
    }
    public void AssistantTemplateGroup(){
       super();
       this.recognitionType = 1;
       this.templates = new ArrayList();
    }
    public final String getBubbleText(){
       return this.bubbleText;
    }
    public final int getGroupType(){
       return this.groupType;
    }
    public final int getRecognitionType(){
       return this.recognitionType;
    }
    public final List getTemplates(){
       return this.templates;
    }
    public final void setBubbleText(String p0){
       this.bubbleText = p0;
    }
    public final void setGroupType(int p0){
       this.groupType = p0;
    }
    public final void setRecognitionType(int p0){
       this.recognitionType = p0;
    }
    public final void setTemplates(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantTemplateGroup.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.templates = p0;
       return;
    }
}
