package com.kuaishou.live.common.core.component.chat.multi.window.LiveMultiChatWindowContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.Pair;
import usd.q;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup;

public final class LiveMultiChatWindowContainer extends FrameLayout	// class@001046
{
    public final LinkedHashMap b;
    public LinearLayout c;
    public HashMap d;

    public void LiveMultiChatWindowContainer(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMultiChatWindowContainer(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMultiChatWindowContainer(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = new LinkedHashMap();
       this.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       LinearLayout linearLayout = new LinearLayout(p0);
       this.c = linearLayout;
       linearLayout.setOrientation(1);
       linearLayout.setGravity(80);
       linearLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       this.addView(this.c);
    }
    public void LiveMultiChatWindowContainer(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(boolean p0,View p1){
       int i1;
       if (PatchProxy.isSupport(LiveMultiChatWindowContainer.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveMultiChatWindowContainer.class, "4")) {
          return;
       }
       int i = 0;
       if (PatchProxy.isSupport(LiveMultiChatWindowContainer.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LiveMultiChatWindowContainer.class, "5");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else if(this.b.isEmpty() || !p0){
             i1 = 0;
          }else {
             Iterator iterator = this.b.entrySet().iterator();
             int i2 = 0;
             while (iterator.hasNext()) {
                if (!iterator.next().getValue().getSecond().booleanValue()) {
                   i2 = i2 + 1;
                }
             }
             i1 = q.u(i2, this.c.getChildCount());
          }
       }else {
          goto label_0037 ;
       }
       b.P(LiveLogTag.MULTI_CHAT.appendTag("LiveMultiChatWindowContainer"), "addSmallWindowView guest"+i1);
       if (this.indexOfChild(this.c) != -1) {
          i = 1;
       }
       if (!i) {
          this.addView(this.c);
       }
       this.c.addView(p1, i1);
       return;
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiChatWindowContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "userId");
       return this.b.containsKey(p0);
    }
    public synchronized final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatWindowContainer.class, "6")) {
          return;
       }
       a.p(p0, "userId");
       if (this.b.containsKey(p0)) {
          Pair pair = this.b.remove(p0);
          View first = (pair != null)? pair.getFirst(): null;
          if (first != null) {
             int i = 1;
             LiveMultiChatWindowContainer liveMultiCha = (this.c.indexOfChild(first) != -1)? 1: null;
             if (liveMultiCha) {
                this.c.removeView(first);
             }
             if (this.indexOfChild(first) == -1) {
                i = 0;
             }
             if (i) {
                this.removeView(first);
             }
          }
       }
    label_0050 :
       return;
    }
    public final int getWidgetCount(){
       Object obj = PatchProxy.apply(null, this, LiveMultiChatWindowContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
}
