package com.yxcorp.gifshow.v3.editor.music_v2.action.MusicAttachUIAction;
import xvc.b;
import nsd.u;

public final class MusicAttachUIAction extends b	// class@001077
{
    public final boolean uiOptionCanShowBeatSync;

    public void MusicAttachUIAction(){
       super(false, 1, null);
    }
    public void MusicAttachUIAction(boolean p0){
       super();
       this.uiOptionCanShowBeatSync = p0;
    }
    public void MusicAttachUIAction(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public final boolean getUiOptionCanShowBeatSync(){
       return this.uiOptionCanShowBeatSync;
    }
}
