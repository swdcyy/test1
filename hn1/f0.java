package hn1.f0;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.s;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.Number;

public final class f0 extends p	// class@00272c
{
    public s f;
    public RecyclerView g;

    public void f0(){
       super();
    }
    public void b(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       super.b(p0);
       this.g = p0;
       return;
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, f0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "layoutManager");
       a.p(p1, "targetView");
       obj = new int[]{this.s(p1, this.q(p0)),0};
       return obj;
    }
    public View h(RecyclerView$LayoutManager p0){
       Object obj2;
       int i2;
       int i3;
       int childCount1;
       View childAt;
       int this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f0 uof0 = f0.class;
       s obj = PatchProxy.applyOneRefs(p0, this, uof0, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "layoutManager");
       obj = this.q(p0);
       View view = PatchProxy.applyTwoRefs(p0, obj, this, uof0, "6");
       if (view != patchProxyRe) {
       }else {
          int childCount = p0.getChildCount();
          int i = 0;
          if (childCount) {
             int i1 = 0;
             boolean b = true;
             if (PatchProxy.isSupport(uof0)) {
                Object obj1 = PatchProxy.applyThreeRefs(p0, obj, Integer.valueOf(childCount), this, f0.class, "7");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                label_004d :
                   view = p0.getChildAt((childCount - b));
                   int i5 = (view != null && (p0.getItemCount() - b) == p0.getPosition(view))? 1: 0;
                   if (!i5 || obj.d(view) != obj.i()) {
                      b = false;
                   }
                }
             }else {
                goto label_004d ;
             }
             if (b) {
                obj2 = PatchProxy.applyTwoRefs(p0, obj, this, uof0, "9");
                if (obj2 != patchProxyRe) {
                }else {
                   i2 = obj.n();
                   i3 = obj.i();
                   childCount1 = p0.getChildCount();
                   while (true) {
                      if (i1 < childCount1) {
                         childAt = p0.getChildAt(i1);
                         this = obj.d(childAt);
                         if (obj.g(childAt) >= i2 && this <= i3) {
                            view = childAt;
                            break ;
                         }else {
                            i1 = i1 + 1;
                         }
                      }
                   }
                }
             }else {
                obj2 = PatchProxy.applyTwoRefs(p0, obj, this, uof0, "8");
                if (obj2 != patchProxyRe) {
                }else {
                   i2 = Integer.MAX_VALUE;
                   i3 = obj.n();
                   childCount1 = p0.getChildCount();
                   while (i1 < childCount1) {
                      childAt = p0.getChildAt(i1);
                      int i4 = obj.g(childAt) - i3;
                      i4 = Math.abs(i4);
                      if (i4 < i2) {
                         i = childAt;
                         i2 = i4;
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             view = obj2;
          }
          view = i;
       }
       return view;
    }
    public final s q(RecyclerView$LayoutManager p0){
       f0 obj = PatchProxy.applyOneRefs(p0, this, f0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          s os = s.a(p0);
          this.f = os;
          a.o(os, "OrientationHelper.create¡­zontalHelper = this\n    }");
       }
       return obj;
    }
    public final int s(View p0,s p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p1.g(p0) - p1.n());
    }
}
