package com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;

public final class DecorationSelectActionV3 extends EditDraftAction	// class@000b75
{
    public final int layerIndex;

    public void DecorationSelectActionV3(int p0){
       super(false, 1, null);
       this.layerIndex = p0;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
}
