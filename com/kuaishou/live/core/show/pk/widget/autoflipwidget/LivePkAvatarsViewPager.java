package com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.util.SparseArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Math;
import java.util.Collections;
import java.lang.reflect.Field;
import java.lang.Boolean;
import java.lang.Exception;
import android.view.MotionEvent;
import ge2.e;
import android.widget.Scroller;

public class LivePkAvatarsViewPager extends ViewPager	// class@000db5
{
    public List b;
    public SparseArray c;

    public void LivePkAvatarsViewPager(Context p0){
       super(p0, null);
    }
    public void LivePkAvatarsViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.c = new SparseArray();
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (PatchProxy.isSupport(LivePkAvatarsViewPager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LivePkAvatarsViewPager.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p1 || this.c.size() != p0) {
          this.b.clear();
          this.c.clear();
          int i = this.i(this);
          for (int i1 = 0; i1 < p0; i1 = i1 + 1) {
             int i2 = i - this.i(this.getChildAt(i1));
             i2 = Math.abs(i2);
             if (this.c.get(i2) != null) {
                i2 = i2 + 1;
             }
             this.b.add(Integer.valueOf(i2));
             this.c.append(i2, Integer.valueOf(i1));
          }
          Collections.sort(this.b);
       }
       p0--;
       return this.c.get(this.b.get((p0 - p1)).intValue()).intValue();
    }
    public final int i(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePkAvatarsViewPager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       return (ointArray[0] + (p0.getWidth() / 2));
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LivePkAvatarsViewPager.class, "3")) {
          return;
       }
       try{
          super.onAttachedToWindow();
          Field declaredFiel = ViewPager.class.getDeclaredField("mFirstLayout");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, Boolean.FALSE);
          this.setCurrentItem(this.getCurrentItem());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void setAvatarScrollerDuration(int p0){
       if (PatchProxy.isSupport(LivePkAvatarsViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePkAvatarsViewPager.class, "1")) {
          return;
       }
       try{
          Field declaredFiel = ViewPager.class.getDeclaredField("mScroller");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, new e(this.getContext(), p0));
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public void setScroller(Scroller p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkAvatarsViewPager.class, "2")) {
          return;
       }
       try{
          Field declaredFiel = ViewPager.class.getDeclaredField("mScroller");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this, p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
