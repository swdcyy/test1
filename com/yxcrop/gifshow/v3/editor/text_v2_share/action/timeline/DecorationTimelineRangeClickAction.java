package com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineRangeClickAction;
import xvc.b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class DecorationTimelineRangeClickAction extends b	// class@000b86
{
    public final double currentTime;
    public final ITimelineView$IRangeView$a rangeViewData;
    public final UpdateTo updateTo;

    public void DecorationTimelineRangeClickAction(ITimelineView$IRangeView$a p0,double p1,UpdateTo p2){
       a.p(p0, "rangeViewData");
       a.p(p2, "updateTo");
       super();
       this.rangeViewData = p0;
       this.currentTime = p1;
       this.updateTo = p2;
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final ITimelineView$IRangeView$a getRangeViewData(){
       return this.rangeViewData;
    }
    public final UpdateTo getUpdateTo(){
       return this.updateTo;
    }
}
