package com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip$a;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import java.util.ArrayList;
import android.view.View;
import java.util.HashSet;

public final class KSPagerSlidingTabStrip$a implements Runnable	// class@001ad3
{
    public final KSPagerSlidingTabStrip b;

    public void KSPagerSlidingTabStrip$a(KSPagerSlidingTabStrip p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KSPagerSlidingTabStrip$a.class, "1")) {
          return;
       }
       KSPagerSlidingTabStrip$a tb = this.b;
       KSPagerSlidingTabStrip x1 = tb.x1;
       if (x1 != null) {
          PagerSlidingTabStrip g = tb.g;
          a.o(g, "tabsContainer");
          int childCount = g.getChildCount();
          if (childCount > 0) {
             int i = 0;
             while (i < childCount) {
                if (i < this.b.z1.size()) {
                   View childAt = this.b.g.getChildAt(i);
                   String str = "tabsContainer.getChildAt\(index\)";
                   a.o(childAt, str);
                   KSPagerSlidingTabStrip$a tb1 = this.b;
                   int i1 = x1.getWidth() + tb1.A1;
                   if (childAt.getRight() <= i1) {
                      childAt = tb1.g.getChildAt(i);
                      a.o(childAt, str);
                      KSPagerSlidingTabStrip$a tb2 = this.b;
                      if (childAt.getLeft() >= tb2.A1) {
                         tb2.w1.add(tb2.z1.get(i));
                      }
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
}
