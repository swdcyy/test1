package com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineUserSeekAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;

public final class DecorationTimelineUserSeekAction extends b	// class@000b87
{
    public final double currentTime;
    public final boolean isPlay;
    public final UpdateTo updateTo;

    public void DecorationTimelineUserSeekAction(double p0,boolean p1,UpdateTo p2){
       a.p(p2, "updateTo");
       super();
       this.currentTime = p0;
       this.isPlay = p1;
       this.updateTo = p2;
    }
    public void DecorationTimelineUserSeekAction(double p0,boolean p1,UpdateTo p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = UpdateTo.BOTH;
       }
       super(p0, p1, p2);
       return;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
    public final boolean isPlay(){
       return this.isPlay;
    }
}
