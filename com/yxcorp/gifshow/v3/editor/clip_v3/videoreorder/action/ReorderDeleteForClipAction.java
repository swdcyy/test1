package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderDeleteForClipAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;

public final class ReorderDeleteForClipAction extends EditSdkAction	// class@000dfe
{
    public final int curPos;

    public void ReorderDeleteForClipAction(int p0){
       super();
       this.curPos = p0;
    }
    public final int getCurPos(){
       return this.curPos;
    }
}
