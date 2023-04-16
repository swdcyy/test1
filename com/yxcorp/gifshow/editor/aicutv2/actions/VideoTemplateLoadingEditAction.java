package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingEditAction;
import xvc.b;
import nsd.u;

public final class VideoTemplateLoadingEditAction extends b	// class@001b87
{
    public final boolean applyStyle;
    public final boolean isTemplateUnify;

    public void VideoTemplateLoadingEditAction(){
       super(false, false, 3, null);
    }
    public void VideoTemplateLoadingEditAction(boolean p0,boolean p1){
       super();
       this.applyStyle = p0;
       this.isTemplateUnify = p1;
    }
    public void VideoTemplateLoadingEditAction(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = true;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final boolean getApplyStyle(){
       return this.applyStyle;
    }
    public final boolean isTemplateUnify(){
       return this.isTemplateUnify;
    }
}
