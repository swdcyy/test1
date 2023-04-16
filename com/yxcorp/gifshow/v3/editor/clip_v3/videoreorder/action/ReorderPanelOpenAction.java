package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderPanelOpenAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;

public final class ReorderPanelOpenAction extends EditSdkAction	// class@000e03
{
    public final int selectIndex;

    public void ReorderPanelOpenAction(int p0){
       super();
       this.selectIndex = p0;
    }
    public final int getSelectIndex(){
       return this.selectIndex;
    }
}
