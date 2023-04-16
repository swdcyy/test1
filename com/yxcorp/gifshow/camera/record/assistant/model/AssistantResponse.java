package com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AssistantResponse implements Serializable	// class@001d0b
{
    public final int INITIAL_POSITIOIN;
    public List b;
    public int initPosition;
    public List magicFaceCollectionList;
    public List musicCollectionList;
    public String nextCursor;
    public List templateGroup;
    public static final AssistantResponse$a Companion;
    public static final long serialVersionUID;

    static {
       AssistantResponse.Companion = new AssistantResponse$a(null);
    }
    public void AssistantResponse(){
       super();
       this.templateGroup = new ArrayList();
       this.magicFaceCollectionList = new ArrayList();
       this.musicCollectionList = new ArrayList();
       this.b = new ArrayList();
       this.INITIAL_POSITIOIN = 1;
       this.initPosition = 1;
    }
    public final int getInitPosition(){
       return this.initPosition;
    }
    public final List getMagicFaceCollectionList(){
       return this.magicFaceCollectionList;
    }
    public final List getMusicCollectionList(){
       return this.musicCollectionList;
    }
    public final String getNextCursor(){
       return this.nextCursor;
    }
    public final List getTemplateGroup(){
       return this.templateGroup;
    }
    public final List getTemplateList(){
       return this.b;
    }
    public final void setInitPosition(int p0){
       this.initPosition = p0;
    }
    public final void setMagicFaceCollectionList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantResponse.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.magicFaceCollectionList = p0;
       return;
    }
    public final void setMusicCollectionList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantResponse.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.musicCollectionList = p0;
       return;
    }
    public final void setNextCursor(String p0){
       this.nextCursor = p0;
    }
    public final void setTemplateGroup(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantResponse.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.templateGroup = p0;
       return;
    }
    public final void setTemplateList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantResponse.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
}
