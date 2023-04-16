package br6.d;
import com.kwai.kcube.TabIdentifier;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import a2.i0;
import com.kwai.kcube.decorator.AlwaysInterceptTouchEventCoordinatorLayout;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public final class d	// class@0005de
{
    public final ViewGroup a;
    public final ViewGroup b;

    public void d(TabIdentifier p0,Context p1,ViewGroup p2,boolean p3){
       a.p(p0, "containerId");
       a.p(p1, "context");
       a.p(p2, "viewPager");
       super();
       this.b = p2;
       p2.setId(i0.l());
       AlwaysInterceptTouchEventCoordinatorLayout uAlwaysInter = (p3)? new AlwaysInterceptTouchEventCoordinatorLayout(p1): new FrameLayout(p1);
       this.a = uAlwaysInter;
       uAlwaysInter.addView(p2, -1, -1);
       return;
    }
    public final void a(ViewGroup$LayoutParams p0,int p1){
       if (p0 instanceof CoordinatorLayout$LayoutParams) {
          p0.c = p1;
       }else if(p0 instanceof FrameLayout$LayoutParams){
          p0.gravity = p1;
       }
       return;
    }
}
