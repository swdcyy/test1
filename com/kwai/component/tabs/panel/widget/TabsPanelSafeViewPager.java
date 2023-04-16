package com.kwai.component.tabs.panel.widget.TabsPanelSafeViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public class TabsPanelSafeViewPager extends ViewPager	// class@000b8a
{
    public boolean b;

    public void TabsPanelSafeViewPager(Context p0){
       super(p0, null);
    }
    public void TabsPanelSafeViewPager(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public final boolean getDefaultSwitchItemNoAnimation(){
       return this.b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, TabsPanelSafeViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          b = super.onInterceptTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e0){
          b = false;
       }
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, TabsPanelSafeViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          b = super.onTouchEvent(p0);
       }catch(java.lang.IllegalArgumentException e0){
          b = false;
       }
       return b;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(TabsPanelSafeViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabsPanelSafeViewPager.class, "3")) {
          return;
       }
       super.setCurrentItem(p0, (this.b ^ 0x01));
       return;
    }
    public final void setDefaultSwitchItemNoAnimation(boolean p0){
       this.b = p0;
    }
}
