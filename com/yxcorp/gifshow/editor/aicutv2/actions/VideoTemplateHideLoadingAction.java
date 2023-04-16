package com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateHideLoadingAction;
import xvc.b;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class VideoTemplateHideLoadingAction extends b	// class@001b82
{
    public final boolean applyStyle;
    public final AICutErrorCode error;

    public void VideoTemplateHideLoadingAction(AICutErrorCode p0,boolean p1){
       a.p(p0, "error");
       super();
       this.error = p0;
       this.applyStyle = p1;
    }
    public final boolean getApplyStyle(){
       return this.applyStyle;
    }
    public final AICutErrorCode getError(){
       return this.error;
    }
}
