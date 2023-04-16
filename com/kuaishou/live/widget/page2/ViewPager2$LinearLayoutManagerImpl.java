package com.kuaishou.live.widget.page2.ViewPager2$LinearLayoutManagerImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.widget.page2.ViewPager2;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$t;
import b2.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.widget.page2.ViewPager2$d;
import android.os.Bundle;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;
import com.kuaishou.live.widget.page2.ViewPager2$LinearLayoutManagerImpl$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$x;

public class ViewPager2$LinearLayoutManagerImpl extends LinearLayoutManager	// class@001028
{
    public final ViewPager2 r;

    public void ViewPager2$LinearLayoutManagerImpl(ViewPager2 p0,Context p1){
       this.r = p0;
       super(p1);
    }
    public void N(RecyclerView$y p0,int[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewPager2$LinearLayoutManagerImpl.class, "3")) {
          return;
       }
       int offscreenPag = this.r.getOffscreenPageLimit();
       if (offscreenPag == -1) {
          super.N(p0, p1);
          return;
       }else {
          int i = this.r.getPageSize() * offscreenPag;
          p1[0] = i;
          p1[1] = i;
          return;
       }
    }
    public void onInitializeAccessibilityNodeInfo(RecyclerView$t p0,RecyclerView$y p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ViewPager2$LinearLayoutManagerImpl.class, "2")) {
          return;
       }
       super.onInitializeAccessibilityNodeInfo(p0, p1, p2);
       this.r.u.h(p2);
       return;
    }
    public boolean performAccessibilityAction(RecyclerView$t p0,RecyclerView$y p1,int p2,Bundle p3){
       if (PatchProxy.isSupport(ViewPager2$LinearLayoutManagerImpl.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, ViewPager2$LinearLayoutManagerImpl.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.r.u.a(p2)) {
          return this.r.u.i(p2);
       }else {
          return super.performAccessibilityAction(p0, p1, p2, p3);
       }
    }
    public boolean requestChildRectangleOnScreen(RecyclerView p0,View p1,Rect p2,boolean p3,boolean p4){
       return false;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       if (PatchProxy.isSupport(ViewPager2$LinearLayoutManagerImpl.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ViewPager2$LinearLayoutManagerImpl.class, "4")) {
          return;
       }
       ViewPager2$LinearLayoutManagerImpl$a linearLayout = new ViewPager2$LinearLayoutManagerImpl$a(this, p0.getContext());
       linearLayout.p(p2);
       this.startSmoothScroll(linearLayout);
       return;
    }
}
