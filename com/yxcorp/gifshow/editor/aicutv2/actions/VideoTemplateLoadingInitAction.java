package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingInitAction;
import xvc.b;
import brd.v;
import nsd.u;

public final class VideoTemplateLoadingInitAction extends b	// class@001b88
{
    public final v externalEmitter;

    public void VideoTemplateLoadingInitAction(){
       super(null, 1, null);
    }
    public void VideoTemplateLoadingInitAction(v p0){
       super();
       this.externalEmitter = p0;
    }
    public void VideoTemplateLoadingInitAction(v p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public final v getExternalEmitter(){
       return this.externalEmitter;
    }
}
