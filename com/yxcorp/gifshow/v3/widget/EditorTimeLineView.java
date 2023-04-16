package com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.ITimelineView;
import ml8.d;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.widget.adv.f;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView$a;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$a;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer;
import android.view.GestureDetector;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView$d;
import android.view.GestureDetector$OnGestureListener;
import axc.f;
import com.yxcorp.gifshow.widget.trimvideo.AdvHorizontalScroller$b;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.widget.BaseRangeView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import java.util.Collection;
import faa.a;
import q87.c;
import java.util.Iterator;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import ekd.q;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$b;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.v3.widget.gestures.TimeLineGestureProcessor;
import com.yxcorp.gifshow.v3.widget.gestures.ITimeLineGestureProcessor;
import java.util.List;
import com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo$TimelineAssetType;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView$c;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo;
import ekd.m1;
import lnc.a1;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.v3.widget.a;
import java.util.Comparator;
import java.util.Collections;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.Math;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Double;
import java.lang.Boolean;
import axc.e;
import com.yxcorp.gifshow.v3.widget.b;
import android.widget.FrameLayout$LayoutParams;
import axc.d;
import java.util.Objects;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import com.yxcorp.gifshow.widget.adv.ITimelineView$e;
import android.view.MotionEvent;
import com.yxcorp.gifshow.widget.adv.ITimelineView$b;

public class EditorTimeLineView extends AdvHorizontalScroller implements ITimelineView, d	// class@001642
{
    public boolean A;
    public LinearBitmapContainer g;
    public FrameLayout h;
    public FrameLayout i;
    public ITimelineView$d j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Rect[] o;
    public ITimelineView$e p;
    public final List q;
    public List r;
    public boolean s;
    public int t;
    public final List u;
    public ITimeLineGestureProcessor v;
    public final f w;
    public GestureDetector x;
    public final Runnable y;
    public final ITimelineView$IRangeView$b z;
    public static final int B;

    public void EditorTimeLineView(Context p0){
       super(p0, null);
    }
    public void EditorTimeLineView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void EditorTimeLineView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = false;
       this.q = new ArrayList();
       this.r = new ArrayList();
       this.u = Lists.b();
       f uof = new f();
       this.w = uof;
       this.y = new EditorTimeLineView$a(this);
       this.z = new EditorTimeLineView$b(this);
       boolean b = true;
       this.A = b;
       if (PatchProxy.applyVoid(null, this, EditorTimeLineView.class, "2")) {
       }else {
          this.removeAllViews();
          a.d(this.getContext(), R.layout.arg_RES_7f0d12b3, this, b);
          this.doBindView(this);
          this.h.requestDisallowInterceptTouchEvent(b);
          this.g.requestDisallowInterceptTouchEvent(b);
          this.g.setAdapter(uof);
          this.x = new GestureDetector(this.getContext(), new EditorTimeLineView$d(this));
          this.l();
          this.setOnScrollListener(new f(this));
       }
       return;
    }
    public ITimelineView E(){
       HashMap hashMap;
       TimelineAssetInfo$TimelineAssetType timelineAsse;
       ITimeLineGestureProcessor iTimeLineGes = this;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, iTimeLineGes, EditorTimeLineView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (iTimeLineGes.h == null) {
          return iTimeLineGes;
       }
       obj = new HashMap();
       int childCount = iTimeLineGes.h.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          if (iTimeLineGes.h.getChildAt(i1) instanceof BaseRangeView) {
             BaseRangeView childAt = iTimeLineGes.h.getChildAt(i1);
             if (childAt.getBindData() != null) {
                obj.put(childAt.getBindData(), childAt);
             }
          }
          i1 = i1 + 1;
       }
       iTimeLineGes.h.removeAllViews();
       ArrayList uArrayList = new ArrayList(obj.values());
       Object[] objArray1 = new Object[i];
       String str = "EditorTimeLineView";
       a.D().w(str, "notifyDataSetChanged", objArray1);
       ArrayList uArrayList1 = new ArrayList();
       uArrayList1.addAll(iTimeLineGes.r);
       uArrayList1.addAll(iTimeLineGes.q);
       Iterator iterator = uArrayList1.iterator();
       while (iterator.hasNext()) {
          ITimelineView$IRangeView$a iRangeView$a = iterator.next();
          Object[] objArray2 = new Object[i];
          a.D().w(str, "unUsedNormalAndClipRangeViewList style: "+iRangeView$a.i().toString()+", range is selected: "+iRangeView$a.s(), objArray2);
          if (obj.containsKey(iRangeView$a)) {
             uArrayList.remove(obj.get(iRangeView$a));
          }
       }
       ArrayList uArrayList2 = new ArrayList();
       Object[] objArray3 = objArray;
       int i2 = 0;
       int i3 = 1;
       while (i2 < uArrayList1.size()) {
          ITimelineView$IRangeView$a iRangeView$a1 = uArrayList1.get(i2);
          iRangeView$a1.o = iTimeLineGes.j.l;
          BaseRangeView uBaseRangeVi = obj.remove(iRangeView$a1);
          if (uBaseRangeVi == null && !q.f(uArrayList)) {
             uBaseRangeVi = uArrayList.remove(i);
          }
          if (uBaseRangeVi == null) {
             uBaseRangeVi = new BaseRangeView(this.getContext());
          }
          uBaseRangeVi.b(iRangeView$a1).f(iTimeLineGes.z);
          if (uBaseRangeVi.getParent() instanceof ViewGroup) {
             uBaseRangeVi.getParent().removeView(uBaseRangeVi);
          }
          iTimeLineGes.h.addView(uBaseRangeVi, iTimeLineGes.o(uBaseRangeVi, iRangeView$a1));
          uBaseRangeVi.g(iTimeLineGes.i);
          if (iRangeView$a1.s()) {
             objArray = iRangeView$a1;
          }
          if (iRangeView$a1.p()) {
             objArray3 = iRangeView$a1;
          }
          if (iTimeLineGes.v == null) {
             iTimeLineGes.v = new TimeLineGestureProcessor();
          }
          int i4 = iTimeLineGes.j.m ^ i3;
          iTimeLineGes.v.e(i4);
          uBaseRangeVi.c(iTimeLineGes.v, iTimeLineGes.m);
          int i5 = iTimeLineGes.q.size() - i3;
          if (i2 != i5) {
             double d = iRangeView$a1.h();
             double d1 = iRangeView$a1.g();
             int i6 = iTimeLineGes.q(d);
             i = iTimeLineGes.q(d1);
             TimelineAssetInfo$TimelineAssetType nONE = TimelineAssetInfo$TimelineAssetType.NONE;
             int i7 = EditorTimeLineView$c.a[iRangeView$a1.k().ordinal()];
             hashMap = obj;
             if (i7 != 1) {
                if (i7 != 2) {
                   if (i7 != 3) {
                      timelineAsse = (i7 != 4)? nONE: TimelineAssetInfo$TimelineAssetType.VIDEO_OPENING;
                   }else {
                      timelineAsse = TimelineAssetInfo$TimelineAssetType.STICKER;
                   }
                }else {
                   timelineAsse = TimelineAssetInfo$TimelineAssetType.SUBTITLE;
                }
             }else {
                timelineAsse = TimelineAssetInfo$TimelineAssetType.TEXT;
             }
             if (timelineAsse != nONE && (d - d1 <= 0 && i6 <= i)) {
                TimelineAssetInfo timelineAsse1 = new TimelineAssetInfo(d, d1, i6, i, timelineAsse);
                uArrayList2.add(i7);
             }
          }else {
             hashMap = obj;
          }
       label_01a7 :
          uArrayList2.addAll(iTimeLineGes.u);
          iTimeLineGes.v.d(uArrayList2);
          i2 = i2 + 1;
          obj = hashMap;
          i = 0;
       }
       boolean b = true;
       if (objArray != null) {
          iTimeLineGes.w(objArray, b);
       }
       if (objArray == null && objArray3 != null) {
          iTimeLineGes.u(objArray3, b);
       }
       iTimeLineGes.t(false);
       return iTimeLineGes;
    }
    public boolean a(){
       return this.s;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, EditorTimeLineView.class, "24")) {
          return;
       }
       EditorTimeLineView tv = this.v;
       if (tv != null) {
          tv.b();
       }
       return;
    }
    public ITimelineView c(ITimelineView$IRangeView$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.o()) {
          this.u(p0, true);
       }
       return this;
    }
    public ITimelineView d(ITimelineView$IRangeView$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.r()) {
          this.w(p0, true);
       }
       return this;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorTimeLineView.class, "1")) {
          return;
       }
       this.i = m1.f(p0, 0x7f0a0923);
       this.h = m1.f(p0, 0x7f0a0ef4);
       this.g = m1.f(p0, 0x7f0a28bd);
       return;
    }
    public void e(ITimelineView$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorTimeLineView.class, "13")) {
          return;
       }
       this.j = p0;
       int i = (p0.l != null)? 0x7f070f08: 0x7f070f07;
       this.l = a1.d(i);
       this.l();
       return;
    }
    public ITimelineView f(ITimelineView$IRangeView$a p0,int p1){
       if (PatchProxy.isSupport(EditorTimeLineView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, EditorTimeLineView.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Iterator iterator = this.n(p0).iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p1);
       }
       return this;
    }
    public ITimelineView g(ITimelineView$IRangeView$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.w(p0, false);
       this.u(p0, false);
       return this;
    }
    public double getCurrentViewTime(){
       Object obj = PatchProxy.apply(null, this, EditorTimeLineView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.r(this.getScrollX());
    }
    public List getLayerSortedRangeViewList(){
       ArrayList obj = PatchProxy.apply(null, this, EditorTimeLineView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       EditorTimeLineView th = this.h;
       if (th != null && th.getChildCount()) {
          int i = 0;
          int childCount = this.h.getChildCount();
          while (i < childCount) {
             if (this.h.getChildAt(i) instanceof ITimelineView$IRangeView && this.h.getChildAt(i).getBindData() != null) {
                obj.add(this.h.getChildAt(i));
             }
             i = i + 1;
          }
       }
       Collections.sort(obj, a.b);
       return obj;
    }
    public Rect[] getLeftRightEdgesOnScreen(){
       Rect[] obj = PatchProxy.apply(null, this, EditorTimeLineView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o == null) {
          obj = new Rect[2];
          this.o = obj;
          boolean b = true;
          Rect rect = n.B(this, b);
          Rect left = rect.left;
          this.o[0] = new Rect(left, rect.top, (n.c(a.a().a(), 10.00f) + left), rect.bottom);
          this.o[b] = new Rect((rect.right - n.c(a.a().a(), 10.00f)), rect.top, rect.right, rect.bottom);
       }
       return this.o;
    }
    public List getNormalViewModels(){
       return this.q;
    }
    public int getPixelsForSecond(){
       return this.m;
    }
    public int getTotalWidth(){
       Object obj = PatchProxy.apply(null, this, EditorTimeLineView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)Math.floor((this.j.b * (double)this.m));
    }
    public List getViewModels(){
       ArrayList obj = PatchProxy.apply(null, this, EditorTimeLineView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.r);
       obj.addAll(this.q);
       return obj;
    }
    public ITimelineView h(ITimelineView$IRangeView$a p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n(p0).iterator();
       while (obj.hasNext()) {
          ITimelineView$IRangeView iRangeView = obj.next();
          iRangeView.g(this.h);
          iRangeView.d();
          ITimelineView$IRangeView iRangeView1 = iRangeView;
          iRangeView1.setLayoutParams(this.o(iRangeView, p0));
          iRangeView1.requestLayout();
       }
       return this;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, EditorTimeLineView.class, "14")) {
          return;
       }
       k1.o(this.y);
       return;
    }
    public void j(double p0,boolean p1){
       ITimelineView$d b1;
       if (PatchProxy.isSupport(EditorTimeLineView.class) && PatchProxy.applyVoidTwoRefs(Double.valueOf(p0), Boolean.valueOf(p1), this, EditorTimeLineView.class, "9")) {
          return;
       }
       boolean b = false;
       this.t(b);
       if (this.s != null) {
          return;
       }
       if (p1) {
          EditorTimeLineView tj = this.j;
          if (tj != null) {
             ITimelineView$d o = tj.o;
             if (o > 0 && (p0 % (double)o)) {
                EditorTimeLineView tm = this.m;
                EditorTimeLineView tj1 = this.j;
                o = tj1.o;
                double d = (double)(int)((float)Math.round((((double)tm * p0) / (double)(o * (float)tm))) * o);
                b1 = tj1.b;
                b1 = (!d - b1)? (double)(int)(b1 - (double)o): d;
             }
          }
       }
       if (this.q(b1) >= 10) {
          b = this.q(b1);
       }
       k1.o(new e(this, b));
       return;
    }
    public ITimelineView k(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.q.clear();
       if (p0 != null) {
          this.q.addAll(p0);
       }
       EditorTimeLineView tq = this.q;
       if (tq != null) {
          Collections.sort(tq, b.b);
       }
       return this;
    }
    public final void l(){
       EditorTimeLineView tj2;
       ITimelineView$d o1;
       int i2;
       double d1;
       int i3;
       f g;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorTimeLineView.class, "5")) {
          return;
       }
       if (this.h != null) {
          EditorTimeLineView tj = this.j;
          if (tj != null) {
             ITimelineView$d d = tj.d;
             if (d > null) {
                this.k = d;
                int i = (tj.l != null)? 0x7f070418: 0x7f070417;
                i = a1.d(i);
                EditorTimeLineView tj1 = this.j;
                ITimelineView$d o = tj1.o;
                int i1 = 1;
                if (o > 0 && tj1.m != null) {
                   tj2 = this.j;
                   o1 = tj2.o;
                   i2 = (int)(Math.ceil((double)((float)((tj1.e * i) / tj1.f) / o)) * (double)o1);
                   this.m = (int)((float)i2 / o1);
                   d1 = (tj2.b / (double)o1) + 0x3fe3333340000000;
                }else {
                   i2 = (int)Math.ceil(((double)(tj1.e * i) / (double)tj1.f));
                   EditorTimeLineView tj3 = this.j;
                   ITimelineView$d c = tj3.c;
                   this.m = c;
                   ITimelineView$d b = tj3.b;
                   double d2 = (double)i2;
                   if (((double)c * b) - d2 < 0) {
                      this.m = (int)(d2 / b);
                      i3 = 1;
                   label_008c :
                      int totalWidth = this.getTotalWidth();
                      this.h.getLayoutParams().width = (this.l * 2) + totalWidth;
                      this.h.getLayoutParams().height = this.j.d;
                      this.h.getLayoutParams().leftMargin = - this.l;
                      this.h.getLayoutParams().rightMargin = - this.l;
                      EditorTimeLineView th = this.h;
                      th.setLayoutParams(th.getLayoutParams());
                      int i4 = 0;
                      this.i.setPadding((int)(((float)n.y(a.a().a()) / 2.00f) - (float)this.j.n), i4, ((int)((float)n.y(a.a().a()) / 2.00f) + a1.e(0x3f800000)), i4);
                      this.g.getParent().getLayoutParams().width = totalWidth;
                      this.g.getParent().setLayoutParams(this.g.getParent().getLayoutParams());
                      this.g.getLayoutParams().width = totalWidth;
                      this.g.getLayoutParams().height = i;
                      tj2 = this.g;
                      tj2.setLayoutParams(tj2.getLayoutParams());
                      tj2 = this.w;
                      o1 = this.j.b;
                      d uod = new d(this);
                      Objects.requireNonNull(tj2);
                      if (PatchProxy.isSupport(f.class)) {
                         Object[] objArray1 = new Object[]{Integer.valueOf(i2),Integer.valueOf(i),Integer.valueOf(i3),Double.valueOf(o1),objArray,uod};
                         if (!PatchProxy.applyVoid(objArray1, tj2, f.class, "1")) {
                         }
                      }else {
                      }
                   }else {
                      d1 = Math.ceil((((double)c * b) / d2));
                   }
                }
                i3 = (int)d1;
                goto label_008c ;
             }
          }
       }
       return;
    }
    public void m(boolean p0){
       if (PatchProxy.isSupport(EditorTimeLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditorTimeLineView.class, "8")) {
          return;
       }
       if (this.b != null && !PatchProxy.applyVoid(null, this, EditorTimeLineView.class, "29")) {
          EditorTimeLineView tp = this.p;
          if (tp != null) {
             tp.f(this.getCurrentViewTime());
          }
       }
       this.t(p0);
       return;
    }
    public List n(ITimelineView$IRangeView$a p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       int childCount = this.h.getChildCount();
       while (i < childCount) {
          if (this.h.getChildAt(i) instanceof ITimelineView$IRangeView) {
             ITimelineView$IRangeView childAt = this.h.getChildAt(i);
             if (childAt.getBindData() != null && (p0 == null || childAt.getBindData().d() == p0.d())) {
                obj.add(childAt);
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public final ViewGroup$MarginLayoutParams o(ITimelineView$IRangeView p0,ITimelineView$IRangeView$a p1){
       int i3;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, EditorTimeLineView.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.q(p1.h());
       int i1 = this.q(p1.g());
       if (i1 >= this.getTotalWidth()) {
          i1 = this.getTotalWidth();
       }
       int i2 = Math.abs((i1 - i)) + (p0.getHandlerWidth() * 2);
       if (i1 >= i) {
          i = this.q(p1.h());
          i3 = this.q(p1.g());
       }else {
          i = this.q(p1.g());
          i3 = this.q(p1.h());
          i2 = 0;
       }
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i2, this.k);
       layoutParams.leftMargin = (i - p0.getHandlerWidth()) + this.l;
       obj = new Object[0];
       a.D().s("EditorTimeLineView", "generateLayoutParamForRangeView: left="+i+",right="+i3+",width="+this.g.getWidth()+",mHandleWidth="+this.l, obj);
       return layoutParams;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.A == null) {
          return false;
       }
       boolean b = true;
       if (!p0.getAction()) {
          this.n = b;
       }else if(p0.getAction() == b || p0.getAction() == 3){
          this.n = false;
       }
       this.x.onTouchEvent(p0);
       return super.onTouchEvent(p0);
    }
    public double p(int p0,int p1){
       if (PatchProxy.isSupport(EditorTimeLineView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EditorTimeLineView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return (this.r((p1 + p0)) - this.r(p0));
    }
    public int q(double p0){
       if (PatchProxy.isSupport(EditorTimeLineView.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, EditorTimeLineView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)Math.ceil(((double)this.m * p0));
    }
    public double r(int p0){
       return ((double)p0 / (double)this.m);
    }
    public void s(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorTimeLineView.class, "7")) {
          return;
       }
       this.u.clear();
       this.u.addAll(p0);
       return;
    }
    public void setClipRangeDataList(List p0){
       this.r = p0;
    }
    public void setTimelineListener(ITimelineView$e p0){
       this.p = p0;
    }
    public void setTouchEnable(boolean p0){
       this.A = p0;
    }
    public void t(boolean p0){
       if (PatchProxy.isSupport(EditorTimeLineView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditorTimeLineView.class, "31")) {
          return;
       }
       EditorTimeLineView tj = this.j;
       if (tj != null && tj.h != null) {
          ITimelineView$d g = tj.g;
          if (g != null) {
             double d = g.b();
             if (p0) {
                d = d - (double)this.j.o;
             }
             float f = (float)((((double)this.m * d) - (double)this.q(d)) + ((double)(this.getWidth() + this.j.n) / 2.00f));
             Object[] objArray = new Object[0];
             a.D().s("EditorTimeLineView", "updateCenterIndicator result: "+f+" currentTime: "+d, objArray);
             this.j.h.setTranslationX(f);
          }
       }
       return;
    }
    public final void u(ITimelineView$IRangeView$a p0,boolean p1){
       if (PatchProxy.isSupport(EditorTimeLineView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditorTimeLineView.class, "27")) {
          return;
       }
       Iterator iterator = this.n(p0).iterator();
       while (iterator.hasNext()) {
          ITimelineView$IRangeView iRangeView = iterator.next();
          iRangeView.getBindData().y(p1);
          iRangeView.g(this.h);
          if (p1) {
             iRangeView.bringToFront();
             iRangeView.requestLayout();
          }
       }
       return;
    }
    public ITimelineView v(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorTimeLineView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.q.clear();
       if (p0 != null) {
          this.q.addAll(p0);
       }
       return this;
    }
    public final void w(ITimelineView$IRangeView$a p0,boolean p1){
       if (PatchProxy.isSupport(EditorTimeLineView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditorTimeLineView.class, "26")) {
          return;
       }
       Iterator iterator = this.n(p0).iterator();
       while (iterator.hasNext()) {
          ITimelineView$IRangeView iRangeView = iterator.next();
          iRangeView.getBindData().B(p1);
          iRangeView.g(this.h);
          if (p1) {
             iRangeView.bringToFront();
             iRangeView.requestLayout();
          }
       }
       return;
    }
}
