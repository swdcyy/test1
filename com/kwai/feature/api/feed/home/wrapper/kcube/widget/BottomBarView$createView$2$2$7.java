package com.kwai.feature.api.feed.home.wrapper.kcube.widget.BottomBarView$createView$2$2$7;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.google.android.material.tabs.KCubeTabLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.android.material.tabs.TabLayout;
import android.content.res.ColorStateList;
import android.widget.HorizontalScrollView;
import android.view.View;
import android.view.ViewGroup;
import rkd.b;
import java.lang.Integer;
import ukd.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class BottomBarView$createView$2$2$7 extends Lambda implements l	// class@000f46
{
    public static final BottomBarView$createView$2$2$7 INSTANCE;

    static {
       BottomBarView$createView$2$2$7.INSTANCE = new BottomBarView$createView$2$2$7();
    }
    public void BottomBarView$createView$2$2$7(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(KCubeTabLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomBarView$createView$2$2$7.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       int i = 0;
       p0.setTabGravity(i);
       p0.setSelectedTabIndicatorHeight(i);
       p0.setTabMode(1);
       ColorStateList uColorStateL = null;
       p0.setTabRippleColor(uColorStateL);
       if (p0.getChildCount() > 0) {
          View childAt = p0.getChildAt(i);
          if (childAt instanceof ViewGroup) {
             uColorStateL = childAt;
          }
          if (uColorStateL != null) {
             uColorStateL.setClipChildren(i);
          }
       }
       if (b.g()) {
          a.o(p0, "requestedTabMaxWidth", Integer.valueOf(i));
       }
       return;
    }
}
