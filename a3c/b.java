package a3c.b;
import java.lang.Object;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.CustomAppBarLayoutBehavior;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.profile.widget.ConsumeScrollRecyclerViewPager;

public class b	// class@000063
{

    public void b(){
       super();
    }
    public static void a(View p0,AppBarLayout p1,boolean p2){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "2")) {
          return;
       }
       if (p2 && p0 instanceof NestedScrollViewPager) {
          Object obj = p0;
          if (!PatchProxy.applyVoidTwoRefs(obj, p1, null, uob, "3")) {
             CoordinatorLayout$Behavior uBehavior = p1.getLayoutParams().f();
             if (uBehavior instanceof CustomAppBarLayoutBehavior) {
                uBehavior.M();
             }
             obj.k();
          }
       }
       if (p0 != null) {
          b.b(p0);
       }
       p1.p(true, true);
       return;
    }
    public static void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "4")) {
          return;
       }
       int i = 0;
       if (p0 instanceof RecyclerView) {
          p0.scrollToPosition(i);
          return;
       }else if(!p0 instanceof ViewGroup){
          return;
       }else {
          while (i < p0.getChildCount()) {
             if (!p0.getChildAt(i) instanceof ConsumeScrollRecyclerViewPager) {
                b.b(p0.getChildAt(i));
             }
             i = i + 1;
          }
          return;
       }
    }
}
