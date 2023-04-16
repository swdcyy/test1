package com.kuaishou.live.core.voiceparty.theater.tube.widget.ScrollAwareTabLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.ScrollAwareTabLayout$a;

public class ScrollAwareTabLayout extends TabLayout	// class@001a41
{
    public ScrollAwareTabLayout$a b;

    public void ScrollAwareTabLayout(Context p0){
       super(p0);
    }
    public void ScrollAwareTabLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ScrollAwareTabLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ScrollAwareTabLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ScrollAwareTabLayout.class, "1")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       ScrollAwareTabLayout tb = this.b;
       if (tb != null) {
          tb.onScrollChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void setOnScrollListener(ScrollAwareTabLayout$a p0){
       this.b = p0;
    }
}
