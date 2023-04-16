package com.yxcorp.gifshow.home.block.topbar.appbar.FullHeightScrollingBehavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.List;
import com.google.android.material.appbar.AppBarLayout;
import android.widget.LinearLayout;

public final class FullHeightScrollingBehavior extends AppBarLayout$ScrollingViewBehavior	// class@00165a
{

    public void FullHeightScrollingBehavior(){
       super();
    }
    public void FullHeightScrollingBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onMeasureChild(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       View obj;
       if (PatchProxy.isSupport(FullHeightScrollingBehavior.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, FullHeightScrollingBehavior.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "parent");
       a.p(p1, "child");
       List list = p0.s(p1);
       a.o(list, "parent.getDependencies\(child\)");
       obj = PatchProxy.applyOneRefs(list, this, FullHeightScrollingBehavior.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = list.size();
          p3 = 0;
          while (true) {
             if (p3 < obj) {
                View view = list.get(p3);
                if (view instanceof AppBarLayout) {
                   obj = view;
                }else {
                   p3++;
                }
             }else {
                obj = null;
             }
          }
       }
       if (obj != null) {
          p1.setTranslationY((- (float)(obj.getMeasuredHeight() - obj.getTotalScrollRange())));
       }
       return 0;
    }
}
