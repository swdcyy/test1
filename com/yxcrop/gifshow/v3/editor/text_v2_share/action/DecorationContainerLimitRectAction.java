package com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationContainerLimitRectAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import android.graphics.RectF;
import nsd.u;

public final class DecorationContainerLimitRectAction extends EditSdkAction	// class@000b6f
{
    public final RectF containerLimitRect;

    public void DecorationContainerLimitRectAction(){
       super(null, 1, null);
    }
    public void DecorationContainerLimitRectAction(RectF p0){
       super();
       this.containerLimitRect = p0;
    }
    public void DecorationContainerLimitRectAction(RectF p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public final RectF getContainerLimitRect(){
       return this.containerLimitRect;
    }
}
