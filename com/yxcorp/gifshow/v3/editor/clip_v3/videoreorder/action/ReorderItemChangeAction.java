package com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.action.ReorderItemChangeAction;
import xvc.b;
import nsd.u;

public final class ReorderItemChangeAction extends b	// class@000dff
{
    public final int currentSelectIndex;
    public final boolean seekToTrackAssetStart;

    public void ReorderItemChangeAction(){
       super(0, 0, 3, null);
    }
    public void ReorderItemChangeAction(int p0,boolean p1){
       super();
       this.currentSelectIndex = p0;
       this.seekToTrackAssetStart = p1;
    }
    public void ReorderItemChangeAction(int p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public final int getCurrentSelectIndex(){
       return this.currentSelectIndex;
    }
    public final boolean getSeekToTrackAssetStart(){
       return this.seekToTrackAssetStart;
    }
}
