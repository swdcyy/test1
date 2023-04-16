package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectHandlerAdjustAction;
import xvc.b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class EffectHandlerAdjustAction extends b	// class@000f28
{
    public final double pendingLengthChanged;
    public final double pendingStartChanged;
    public final int rangeIndex;
    public final ITimelineView$IRangeView$a rangeView;
    public final UpdateTo updateTo;
    public final double videoDuration;

    public void EffectHandlerAdjustAction(double p0,double p1,ITimelineView$IRangeView$a p2,int p3,double p4,UpdateTo p5){
       a.p(p2, "rangeView");
       a.p(p5, "updateTo");
       super();
       this.pendingStartChanged = p0;
       this.pendingLengthChanged = p1;
       this.rangeView = p2;
       this.rangeIndex = p3;
       this.videoDuration = p4;
       this.updateTo = p5;
    }
    public final double getPendingLengthChanged(){
       return this.pendingLengthChanged;
    }
    public final double getPendingStartChanged(){
       return this.pendingStartChanged;
    }
    public final int getRangeIndex(){
       return this.rangeIndex;
    }
    public final ITimelineView$IRangeView$a getRangeView(){
       return this.rangeView;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
    public final double getVideoDuration(){
       return this.videoDuration;
    }
}
