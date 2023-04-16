package com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFramePlayerTimeUpdatedAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.state.KSKeyFramePanelPlayerState$UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class KeyFramePlayerTimeUpdatedAction extends b	// class@001010
{
    public final double playbackPts;
    public final KSKeyFramePanelPlayerState$UpdateTo updateTo;

    public void KeyFramePlayerTimeUpdatedAction(double p0,KSKeyFramePanelPlayerState$UpdateTo p1){
       a.p(p1, "updateTo");
       super();
       this.playbackPts = p0;
       this.updateTo = p1;
    }
    public final double getPlaybackPts(){
       return this.playbackPts;
    }
    public final KSKeyFramePanelPlayerState$UpdateTo getUpdateTo(){
       return this.updateTo;
    }
}
