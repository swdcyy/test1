package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSDownloadAction;
import xvc.b;
import nsd.u;

public final class TTSDownloadAction extends b	// class@000b10
{
    public final boolean isUpdate;
    public final int selectedDrawerLayerIndex;

    public void TTSDownloadAction(){
       super(false, false, 3, null);
    }
    public void TTSDownloadAction(boolean p0,int p1){
       super();
       this.isUpdate = p0;
       this.selectedDrawerLayerIndex = p1;
    }
    public void TTSDownloadAction(boolean p0,int p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = -1;
       }
       super(p0, p1);
       return;
    }
    public final int getSelectedDrawerLayerIndex(){
       return this.selectedDrawerLayerIndex;
    }
    public final boolean isUpdate(){
       return this.isUpdate;
    }
}
