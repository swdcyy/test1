package com.kuaishou.live.common.core.basic.widget.NoScrollViewPager;
import com.yxcorp.gifshow.widget.viewpager.CustomViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;

public class NoScrollViewPager extends CustomViewPager	// class@000f32
{

    public void NoScrollViewPager(Context p0){
       super(p0);
    }
    public void NoScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(NoScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NoScrollViewPager.class, "1")) {
          return;
       }
       this.setCurrentItem(p0, false);
       return;
    }
}
