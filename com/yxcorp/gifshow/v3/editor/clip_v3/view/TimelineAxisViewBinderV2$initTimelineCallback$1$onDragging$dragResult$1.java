package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$initTimelineCallback$1$onDragging$dragResult$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2$initTimelineCallback$1;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinderV2;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.yxcorp.utility.Log;
import hwc.b;

public final class TimelineAxisViewBinderV2$initTimelineCallback$1$onDragging$dragResult$1 extends Lambda implements l	// class@000e1d
{
    public final float $deltaX;
    public final double $deltaXTime;
    public final int $index;
    public final boolean $isLeft;
    public final TimelineAxisViewBinderV2$initTimelineCallback$1 this$0;

    public void TimelineAxisViewBinderV2$initTimelineCallback$1$onDragging$dragResult$1(TimelineAxisViewBinderV2$initTimelineCallback$1 p0,int p1,boolean p2,float p3,double p4){
       this.this$0 = p0;
       this.$index = p1;
       this.$isLeft = p2;
       this.$deltaX = p3;
       this.$deltaXTime = p4;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.floatValue());
       return l1.a;
    }
    public final void invoke(float p0){
       TimelineAxisViewBinderV2 d;
       if (PatchProxy.isSupport(TimelineAxisViewBinderV2$initTimelineCallback$1$onDragging$dragResult$1.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TimelineAxisViewBinderV2$initTimelineCallback$1$onDragging$dragResult$1.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("TimelineAxisViewBinder", "onDragging, index="+this.$index+", isLeft="+this.$isLeft+", "+"deltaX="+this.$deltaX+"£¬offset="+p0, objArray);
       int i1 = (int)p0;
       if (this.$isLeft != null) {
          if (this.this$0.d.d.P(i)) {
             d = this.this$0.d.d;
             d.setLeftItemOffset((d.getLeftItemOffset() + (float)i1));
          }else {
             this.this$0.d.d.getSegmentRecyclerView().scrollBy((- i1), i);
          }
       }else {
          d = this.this$0.d.d;
          d.setRightItemOffset((d.getRightItemOffset() + (float)i1));
       }
       this.this$0.d.d.getCursorView().setTranslationX(((float)i1 + this.this$0.d.d.getCursorView().getTranslationX()));
       if (this.$deltaXTime && (!p0 && this.this$0.b != null)) {
          Log.b("TimelineAxisViewBinder", "try to vibrate");
          b.c();
       }
    label_00ce :
       p0.b = i1;
       return;
    }
}
