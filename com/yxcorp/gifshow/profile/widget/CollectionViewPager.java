package com.yxcorp.gifshow.profile.widget.CollectionViewPager;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewParent;
import android.view.ViewGroup;

public class CollectionViewPager extends CommonLogViewPager	// class@0015ed
{
    public int u;

    public void CollectionViewPager(Context p0){
       super(p0);
    }
    public void CollectionViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = (int)p0.getX();
       if (p0.getAction() == 2) {
          int i1 = i - this.u;
          if (!this.getCurrentItem() && i1 > 0) {
             this.getParent().requestDisallowInterceptTouchEvent(false);
          }
       }
       this.u = i;
       return super.dispatchTouchEvent(p0);
    }
}
