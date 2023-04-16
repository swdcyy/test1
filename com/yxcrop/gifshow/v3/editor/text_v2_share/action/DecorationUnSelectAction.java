package com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import xvc.b;
import nsd.u;

public final class DecorationUnSelectAction extends b	// class@000b76
{
    public final boolean panelOpen;

    public void DecorationUnSelectAction(){
       super(false, 1, null);
    }
    public void DecorationUnSelectAction(boolean p0){
       super();
       this.panelOpen = p0;
    }
    public void DecorationUnSelectAction(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public final boolean getPanelOpen(){
       return this.panelOpen;
    }
}
