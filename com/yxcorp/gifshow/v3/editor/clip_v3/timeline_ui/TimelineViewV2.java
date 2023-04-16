package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$a;
import nsd.u;
import lnc.a1;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineStatus;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$segmentAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$layoutManager$2;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$itemAnimator$2;
import android.util.AttributeSet;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.a;
import java.util.Objects;
import t36.f;
import dpc.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import dpc.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$b;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$c;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.OffsetLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$f;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$e;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$g;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$h;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView;
import java.util.List;
import fpc.a;
import epc.a;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimelineViewV2$i;
import epc.b;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$a;

public final class TimelineViewV2 extends ConstraintLayout	// class@000df1
{
    public View B;
    public TimelineRecyclerView C;
    public a D;
    public TimelineStatus E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public final p J;
    public final p K;
    public final p L;
    public HashMap M;
    public static final int N;
    public static final int O;
    public static final TimelineViewV2$a P;

    static {
       TimelineViewV2.P = new TimelineViewV2$a(null);
       TimelineViewV2.N = a1.e(60.00f);
       TimelineViewV2.O = a1.e(3.00f);
    }
    public void TimelineViewV2(Context p0){
       a.p(p0, "context");
       super(p0);
       this.E = TimelineStatus.IDLE;
       this.H = -1;
       this.J = s.c(TimelineViewV2$segmentAdapter$2.INSTANCE);
       this.K = s.c(new TimelineViewV2$layoutManager$2(this));
       this.L = s.c(TimelineViewV2$itemAnimator$2.INSTANCE);
       this.O(p0);
    }
    public void TimelineViewV2(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1);
       this.E = TimelineStatus.IDLE;
       this.H = -1;
       this.J = s.c(TimelineViewV2$segmentAdapter$2.INSTANCE);
       this.K = s.c(new TimelineViewV2$layoutManager$2(this));
       this.L = s.c(TimelineViewV2$itemAnimator$2.INSTANCE);
       this.O(p0);
    }
    public void TimelineViewV2(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attributeSet");
       super(p0, p1, p2);
       this.E = TimelineStatus.IDLE;
       this.H = -1;
       this.J = s.c(TimelineViewV2$segmentAdapter$2.INSTANCE);
       this.K = s.c(new TimelineViewV2$layoutManager$2(this));
       this.L = s.c(TimelineViewV2$itemAnimator$2.INSTANCE);
       this.O(p0);
    }
    public static void T(TimelineViewV2 p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = -1;
       }
       p0.S(p1);
       return;
    }
    public final void L(a$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "23")) {
          return;
       }
       a.p(p0, "listener");
       a itemAnimator = this.getItemAnimator();
       Objects.requireNonNull(itemAnimator);
       if (!PatchProxy.applyVoidOneRefs(p0, itemAnimator, a.class, "1")) {
          itemAnimator.w.d(p0);
       }
       return;
    }
    public final void M(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2.class, "17")) {
          return;
       }
       this.getSegmentAdapter().k0();
       return;
    }
    public final void N(Runnable p0){
       TimelineViewV2 tC;
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "26")) {
          return;
       }
       String str = "runnable";
       a.p(p0, str);
       String str1 = "segmentRecyclerView";
       if (PostExperimentUtils.R0()) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "27")) {
             a.p(p0, str);
             tC = this.C;
             if (tC == null) {
                a.S(str1);
             }
             if (tC.getChildCount() <= 0) {
                tC = this.C;
                if (tC == null) {
                   a.S(str1);
                }
                tC.getViewTreeObserver().addOnGlobalLayoutListener(new j(this, p0));
             }else {
                p0.run();
             }
          }
          return;
       }else {
          tC = this.C;
          if (tC == null) {
             a.S(str1);
          }
          if (tC.getChildCount() <= 0) {
             tC = this.C;
             if (tC == null) {
                a.S(str1);
             }
             tC.getViewTreeObserver().addOnGlobalLayoutListener(new TimelineViewV2$b(this, p0));
             return;
          }else {
             tC = this.C;
             if (tC == null) {
                a.S(str1);
             }
             View childAt = tC.getChildAt(0);
             a.o(childAt, "segmentRecyclerView.getChildAt\(0\)");
             childAt.getViewTreeObserver().addOnGlobalLayoutListener(new TimelineViewV2$c(childAt, p0));
             return;
          }
       }
    }
    public final void O(Context p0){
       TimelineViewV2 tC;
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "9")) {
          return;
       }
       a.d(p0, R.layout.arg_RES_7f0d1605, this, true);
       View view = this.findViewById(R.id.cursor);
       a.o(view, "findViewById\(R.id.cursor\)");
       this.B = view;
       view = this.findViewById(R.id.timeline_recycler_view);
       a.o(view, "findViewById\(R.id.timeline_recycler_view\)");
       this.C = view;
       String str = "segmentRecyclerView";
       if (!PostExperimentUtils.R0()) {
          tC = this.C;
          if (tC == null) {
             a.S(str);
          }
          tC.setAdapter(this.getSegmentAdapter());
       }
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.setItemAnimator(null);
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.setLayoutManager(this.getLayoutManager());
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.addOnScrollListener(new TimelineViewV2$d());
       TimelineViewV2$f uof = new TimelineViewV2$f(this);
       TimelineViewV2 tC1 = this.C;
       if (tC1 == null) {
          a.S(str);
       }
       if (tC1.getItemDecorationCount() > 0) {
          tC1 = this.C;
          if (tC1 == null) {
             a.S(str);
          }
          tC1.removeItemDecorationAt(0);
       }
       tC1 = this.C;
       if (tC1 == null) {
          a.S(str);
       }
       tC1.addItemDecoration(uof);
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.setHasFixedSize(true);
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       tC.setFocusableInTouchMode(0);
       this.getViewTreeObserver().addOnGlobalLayoutListener(new TimelineViewV2$e(this));
       return;
    }
    public final boolean P(int p0){
       if (PatchProxy.isSupport(TimelineViewV2.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TimelineViewV2.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = this.getLayoutManager().c();
       boolean b = (this.getLayoutManager().i0() <= p0 && i >= p0)? true: false;
       return b;
    }
    public final void Q(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2.class, "19")) {
          return;
       }
       TimelineViewV2 tC = this.C;
       String str = "segmentRecyclerView";
       if (tC == null) {
          a.S(str);
       }
       if (tC.isComputingLayout()) {
          tC = this.C;
          if (tC == null) {
             a.S(str);
          }
          tC.post(new TimelineViewV2$g(this));
       }else {
          this.getSegmentAdapter().p0(0, this.getSegmentAdapter().getItemCount());
       }
       return;
    }
    public final void R(int p0){
       if (PatchProxy.isSupport(TimelineViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TimelineViewV2.class, "20")) {
          return;
       }
       this.getSegmentAdapter().t0(p0);
       return;
    }
    public final void S(int p0){
       if (PatchProxy.isSupport(TimelineViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TimelineViewV2.class, "18")) {
          return;
       }
       int i = this.getLayoutManager().i0();
       int i1 = this.getLayoutManager().c();
       if (p0 >= 0) {
          i = Math.min(p0, i);
       }
       if (p0 >= 0) {
          i1 = Math.max(p0, i1);
       }
       TimelineViewV2 tC = this.C;
       String str = "segmentRecyclerView";
       if (tC == null) {
          a.S(str);
       }
       if (tC.isComputingLayout()) {
          tC = this.C;
          if (tC == null) {
             a.S(str);
          }
          tC.post(new TimelineViewV2$h(this, i, i1));
       }else {
          this.getSegmentAdapter().p0(i, ((i1 - i) + 1));
       }
       return;
    }
    public final void U(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2.class, "22")) {
          return;
       }
       TimelineViewV2 tC = this.C;
       if (tC == null) {
          a.S("segmentRecyclerView");
       }
       tC.setItemAnimator(this.getItemAnimator());
       return;
    }
    public final void V(int p0){
       if (PatchProxy.isSupport(TimelineViewV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TimelineViewV2.class, "21")) {
          return;
       }
       this.getSegmentAdapter().l0(p0);
       return;
    }
    public final void W(int p0,boolean p1){
       TimelineViewV2 tC;
       if (PatchProxy.isSupport(TimelineViewV2.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, TimelineViewV2.class, "10")) {
          return;
       }
       if (p1) {
          tC = this.C;
          if (tC == null) {
             a.S("segmentRecyclerView");
          }
          tC.A(p0, 0);
       }else {
          tC = this.C;
          if (tC == null) {
             a.S("segmentRecyclerView");
          }
          tC.scrollTo(p0, 0);
       }
       return;
    }
    public final void X(){
       if (PatchProxy.applyVoid(null, this, TimelineViewV2.class, "13")) {
          return;
       }
       if (this.E != TimelineStatus.DRAGGING) {
          return;
       }
       this.E = TimelineStatus.IDLE;
       TimelineViewV2 tD = this.D;
       if (tD == null) {
          a.S("segmentDragListener");
       }
       tD.a(this.H, this.getSegmentAdapter().g.get(this.H), this.I, 0);
       return;
    }
    public final void Y(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "16")) {
          return;
       }
       a.p(p0, "list");
       f segmentAdapt = this.getSegmentAdapter();
       Objects.requireNonNull(segmentAdapt);
       if (!PatchProxy.applyVoidOneRefs(p0, segmentAdapt, f.class, "3")) {
          a.p(p0, "<set-?>");
          segmentAdapt.g = p0;
       }
       this.getLayoutManager().r = p0;
       return;
    }
    public final View getCursorView(){
       TimelineViewV2 obj = PatchProxy.apply(null, this, TimelineViewV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       if (obj == null) {
          a.S("cursorView");
       }
       return obj;
    }
    public final int getDraggingIndex(){
       return this.H;
    }
    public final a getItemAnimator(){
       Object obj = PatchProxy.apply(null, this, TimelineViewV2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public final OffsetLinearLayoutManager getLayoutManager(){
       Object obj = PatchProxy.apply(null, this, TimelineViewV2.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final float getLeftItemOffset(){
       return this.F;
    }
    public final float getRightItemOffset(){
       return this.G;
    }
    public final f getSegmentAdapter(){
       Object obj = PatchProxy.apply(null, this, TimelineViewV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.J.getValue();
    }
    public final TimelineRecyclerView getSegmentRecyclerView(){
       TimelineViewV2 obj = PatchProxy.apply(null, this, TimelineViewV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj == null) {
          a.S("segmentRecyclerView");
       }
       return obj;
    }
    public final TimelineStatus getStatus(){
       return this.E;
    }
    public final void setCursorView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.B = p0;
       return;
    }
    public final void setDraggingIndex(int p0){
       this.H = p0;
    }
    public final void setDraggingLeft(boolean p0){
       this.I = p0;
    }
    public final void setLeftItemOffset(float p0){
       this.F = p0;
    }
    public final void setRightItemOffset(float p0){
       this.G = p0;
    }
    public final void setSegmentDragListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       this.D = p0;
       this.getSegmentAdapter().h = new TimelineViewV2$i(this, p0);
       return;
    }
    public final void setSegmentRecyclerView(TimelineRecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.C = p0;
       return;
    }
    public final void setStatus(TimelineStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.E = p0;
       return;
    }
    public final void setTimelineClickListener(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "11")) {
          return;
       }
       a.p(p0, "listener");
       f segmentAdapt = this.getSegmentAdapter();
       Objects.requireNonNull(segmentAdapt);
       if (!PatchProxy.applyVoidOneRefs(p0, segmentAdapt, f.class, "2")) {
          a.p(p0, "<set-?>");
          segmentAdapt.f = p0;
       }
       return;
    }
    public final void setTimelineScrollChange(UserTouchRecyclerView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimelineViewV2.class, "14")) {
          return;
       }
       a.p(p0, "listener");
       TimelineViewV2 tC = this.C;
       if (tC == null) {
          a.S("segmentRecyclerView");
       }
       tC.x(p0);
       return;
    }
}
