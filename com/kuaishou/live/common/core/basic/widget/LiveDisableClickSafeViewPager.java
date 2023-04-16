package com.kuaishou.live.common.core.basic.widget.LiveDisableClickSafeViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;

public class LiveDisableClickSafeViewPager extends ViewPager	// class@000f16
{
    public long b;
    public boolean c;

    public void LiveDisableClickSafeViewPager(Context p0){
       super(p0, null);
    }
    public void LiveDisableClickSafeViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void i(){
       this.c = true;
    }
    public void j(){
       this.c = false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDisableClickSafeViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.c != null) {
          return b;
       }
       if (!p0.getAction() && (System.currentTimeMillis() - this.b) - 300 < 0) {
          return b;
       }
       if (p0.getAction() == 1 || p0.getAction() == 3) {
          this.b = System.currentTimeMillis();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDisableClickSafeViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0.getAction() && (System.currentTimeMillis() - this.b) - 300 < 0) {
          return b;
       }
       boolean b1 = super.onTouchEvent(p0);
       if (p0.getAction() == 1 || p0.getAction() == 3) {
          this.b = System.currentTimeMillis();
       }
       if (p0.getAction() && b1) {
          b = true;
       }
       return b;
    }
}
