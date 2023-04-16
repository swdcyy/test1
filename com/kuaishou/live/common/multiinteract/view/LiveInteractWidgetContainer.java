package com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.kuaishou.live.common.multiinteract.view.LiveInteractWidgetContainer$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import java.lang.Boolean;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import android.view.View$MeasureSpec;

public final class LiveInteractWidgetContainer extends FrameLayout	// class@001806
{
    public final HashMap b;
    public HashMap c;

    public void LiveInteractWidgetContainer(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveInteractWidgetContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveInteractWidgetContainer(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new HashMap();
    }
    public void LiveInteractWidgetContainer(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(String p0,LiveInteractWidgetContainer$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveInteractWidgetContainer.class, "1")) {
          return;
       }
       a.p(p0, "viewKey");
       this.b.put(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveInteractWidgetContainer.class, "2")) {
          ArrayList uArrayList = new ArrayList(this.b.keySet());
          int i = 0;
          int childCount = this.getChildCount();
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             a.o(childAt, "getChildAt\(index\)");
             if (this.b.containsKey(String.valueOf(childAt.hashCode()))) {
                uArrayList.remove(String.valueOf(childAt.hashCode()));
             }
             i++;
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             this.b.remove(iterator.next());
          }
       }
       this.requestLayout();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(LiveInteractWidgetContainer.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveInteractWidgetContainer.class, "4")) {
             return;
          }
       }
       int measuredWidt = this.getMeasuredWidth();
       p1 = this.getMeasuredHeight();
       p2 = this.getChildCount();
       while (i < p2) {
          View childAt = this.getChildAt(i);
          a.o(childAt, "getChildAt\(index\)");
          LiveInteractWidgetContainer$a uoa = this.b.get(String.valueOf(childAt.hashCode()));
          String str = "LiveLiteChatWidgetContainer";
          if (uoa == null) {
             b.P(LiveLogTag.LIVE_MULTI_INTERACT.appendTag(str), "no position info");
          }else {
             float f = (float)measuredWidt;
             float f1 = uoa.b * f;
             int i1 = (int)f1;
             f = f * uoa.c();
             float f2 = (float)i1 + f;
             int i2 = (int)f2;
             f2 = (float)p1;
             float f3 = uoa.a * f2;
             int i3 = (int)f3;
             f2 = f2 * uoa.b();
             float f4 = (float)i3 + f2;
             int i4 = (int)f4;
             LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
             lIVE_MULTI_I.appendTag(str);
             LiveLogTag liveLogTag = lIVE_MULTI_I;
             b.P(liveLogTag, "layout chatView: "+i1+", "+i2+", "+i3+", "+i4+", "+uoa.a());
             childAt.layout(i1, i3, i2, i4);
          }
          i = i + 1;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveInteractWidgetContainer.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveInteractWidgetContainer.class, "3")) {
          return;
       }
       b.P(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveLiteChatWidgetContainer"), "onMeasure");
       super.onMeasure(p0, p1);
       p0 = 0;
       p1 = this.getChildCount();
       while (p0 < p1) {
          View childAt = this.getChildAt(p0);
          a.o(childAt, "getChildAt\(index\)");
          LiveInteractWidgetContainer$a uoa = this.b.get(String.valueOf(childAt.hashCode()));
          if (uoa == null) {
             b.P(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveLiteChatWidgetContainer"), "no position info");
          }else {
             float f = (float)this.getMeasuredWidth() * uoa.c();
             int i = (int)f;
             float f1 = (float)this.getMeasuredHeight() * uoa.b();
             int i1 = (int)f1;
             b.P(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveLiteChatWidgetContainer"), "measure chatView: "+i+", "+i1+", "+uoa.a());
             childAt.measure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), View$MeasureSpec.makeMeasureSpec(i1, 0x40000000));
          }
          p0++;
       }
       return;
    }
}
