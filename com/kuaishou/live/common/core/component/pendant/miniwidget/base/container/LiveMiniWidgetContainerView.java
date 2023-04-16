package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.util.AttributeSet;
import k51.b;
import android.view.View;
import i2b.a;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import java.lang.Boolean;

public class LiveMiniWidgetContainerView extends FrameLayout	// class@0016eb
{
    public ViewGroup b;
    public ViewPager c;
    public LinearLayout d;
    public boolean e;

    public void LiveMiniWidgetContainerView(Context p0){
       super(p0);
       this.a(p0);
    }
    public void LiveMiniWidgetContainerView(Context p0,int p1,int p2){
       super(p0);
       if (!PatchProxy.isSupport(LiveMiniWidgetContainerView.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveMiniWidgetContainerView.class, "2")) {
          this.a(p0);
          p0.width = p1;
          p0.height = p2;
       }
       return;
    }
    public void LiveMiniWidgetContainerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0);
    }
    public void LiveMiniWidgetContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniWidgetContainerView.class, "1")) {
          return;
       }
       a.c(p0, b.a(R.layout.arg_RES_7f0d0ca3, 0x7f0d0ca4), this);
       this.b = this.findViewById(0x7f0a218b);
       this.c = this.findViewById(0x7f0a218c);
       this.d = this.findViewById(0x7f0a218d);
       return;
    }
    public LinearLayout getIndicatorLayout(){
       LiveMiniWidgetContainerView td = (this.e != null)? this.d: null;
       return td;
    }
    public ViewPager getViewPager(){
       return this.c;
    }
    public void setEnableIndicator(boolean p0){
       if (PatchProxy.isSupport(LiveMiniWidgetContainerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveMiniWidgetContainerView.class, "3")) {
          return;
       }
       this.e = p0;
       LiveMiniWidgetContainerView td = this.d;
       int i = (p0)? 0: 8;
       td.setVisibility(i);
       return;
    }
}
