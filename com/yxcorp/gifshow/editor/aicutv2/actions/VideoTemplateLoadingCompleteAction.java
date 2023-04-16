package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingCompleteAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import xoc.c;

public final class VideoTemplateLoadingCompleteAction extends EditSdkAction	// class@001b86
{
    public final boolean applyStyle;
    public final boolean isTemplateFromAICutItem;
    public final boolean needOnSelectedCallback;
    public final VideoTemplate template;

    public void VideoTemplateLoadingCompleteAction(VideoTemplate p0,boolean p1,boolean p2,boolean p3){
       super();
       this.template = p0;
       this.applyStyle = p1;
       this.needOnSelectedCallback = p2;
       this.isTemplateFromAICutItem = p3;
    }
    public final boolean getApplyStyle(){
       return this.applyStyle;
    }
    public final boolean getNeedOnSelectedCallback(){
       return this.needOnSelectedCallback;
    }
    public final VideoTemplate getTemplate(){
       return this.template;
    }
    public final boolean isTemplateFromAICutItem(){
       return this.isTemplateFromAICutItem;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoTemplateLoadingCompleteAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       if (this.applyStyle != null) {
          VideoTemplateLoadingCompleteAction ttemplate = this.template;
          if (ttemplate != null) {
             c.a.c(p0, ttemplate, this.isTemplateFromAICutItem);
          }
       }
       return;
    }
}
