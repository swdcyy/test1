package com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$initTimelineCallback$1;
import epc.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder;
import java.lang.Object;
import fpc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.OffsetLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import cpc.b;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDragEndAction;
import xvc.b;
import opc.f;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$initTimelineCallback$1$onDragging$dragResult$1;
import java.lang.System;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDraggingSdkAction;
import msd.l;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDraggingAction;
import yoc.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import bpc.c;
import bpc.f;
import java.util.List;
import uvc.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SegmentDragStartAction;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.TimelineAxisViewBinder$initTimelineCallback$1$onDragStart$1;

public final class TimelineAxisViewBinder$initTimelineCallback$1 implements a	// class@000e17
{
    public long a;
    public int b;
    public double c;
    public final TimelineAxisViewBinder d;

    public void TimelineAxisViewBinder$initTimelineCallback$1(TimelineAxisViewBinder p0){
       this.d = p0;
       super();
       this.b = -1;
    }
    public void a(int p0,a p1,boolean p2,float p3){
       TimeLineTagContainer timeLineTagC;
       if (PatchProxy.isSupport(TimelineAxisViewBinder$initTimelineCallback$1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Float.valueOf(p3), this, TimelineAxisViewBinder$initTimelineCallback$1.class, "3")) {
          return;
       }
       a.p(p1, "segment");
       Object[] objArray = new Object[0];
       String str = "TimelineAxisViewBinder";
       a.D().w(str, "onDragEnd, index="+p0+", isLeft="+p2+", deltaX="+p3, objArray);
       this.d.d.getSegmentRecyclerView().requestDisallowInterceptTouchEvent(0);
       this.d.d.setLeftItemOffset(0);
       this.d.d.setRightItemOffset(0);
       this.d.d.getCursorView().setTranslationX(0);
       RecyclerView$LayoutManager layoutManage = this.d.d.getSegmentRecyclerView().getLayoutManager();
       Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.OffsetLinearLayoutManager");
       int i = p0 - layoutManage.i0();
       Object[] objArray1 = new Object[0];
       a.D().w(str, "onDragEnd "+i, objArray1);
       View childAt = this.d.d.getSegmentRecyclerView().getChildAt(i);
       childAt = (childAt != null)? childAt.findViewById(R.id.info_text_container): null;
       if (childAt instanceof TimeLineTagContainer) {
          childAt.a();
       }
       TimelineAxisViewBinder$initTimelineCallback$1 td = this.d;
       td.i = true;
       td.h = true;
       SegmentDragEndAction segmentDragE = new SegmentDragEndAction(p0, p2, b.a(p3), this.c);
       td.c.t0(true);
       p0.h = false;
       return;
    }
    public void b(int p0,a p1,boolean p2,float p3){
       if (PatchProxy.isSupport(TimelineAxisViewBinder$initTimelineCallback$1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Float.valueOf(p3), this, TimelineAxisViewBinder$initTimelineCallback$1.class, "2")) {
          return;
       }
       a.p(p1, "segment");
       double d = b.a(p3);
       TimelineAxisViewBinder$initTimelineCallback$1$onDragging$dragResult$1 oinitTimelin = new TimelineAxisViewBinder$initTimelineCallback$1$onDragging$dragResult$1(this, p0, p2, p3, d);
       if ((System.currentTimeMillis() - this.a) - (long)300 > 0) {
          SegmentDraggingSdkAction segmentDragg = new SegmentDraggingSdkAction(p0, p2, d, this.c, p1);
          this.d.c.t0(v0);
          this.a = System.currentTimeMillis();
       }else {
          SegmentDraggingAction segmentDragg1 = new SegmentDraggingAction(p0, p2, d, this.c, p1);
          this.d.c.t0(v0);
       }
       return;
    }
    public void c(int p0,a p1,boolean p2){
       if (PatchProxy.isSupport(TimelineAxisViewBinder$initTimelineCallback$1.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, TimelineAxisViewBinder$initTimelineCallback$1.class, "1")) {
          return;
       }
       a.p(p1, "segment");
       Object[] objArray = new Object[0];
       a.D().w("TimelineAxisViewBinder", "onDragStart, index="+p0+", isLeft="+p2, objArray);
       double d = f.a.g(p0, 0, this.d.c.o0().e().f());
       double d1 = this.d.c.o0().a().c();
       if (p2) {
          this.d.d.getCursorView().setTranslationX(b.h((d - d1)));
       }else {
          this.d.d.getCursorView().setTranslationX(b.h(((d + p1.k()) - d1)));
       }
       this.b = -1;
       this.d.d.getSegmentRecyclerView().requestDisallowInterceptTouchEvent(true);
       TimelineAxisViewBinder c = this.d.c;
       SegmentDragStartAction segmentDragS = new SegmentDragStartAction(p0, p2, c.u0().e().e(), new TimelineAxisViewBinder$initTimelineCallback$1$onDragStart$1(this));
       c.t0(v6);
       return;
    }
}
