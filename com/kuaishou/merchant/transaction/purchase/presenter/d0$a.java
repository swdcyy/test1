package com.kuaishou.merchant.transaction.purchase.presenter.d0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.d0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.d0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.core.widget.NestedScrollView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import ue4.o;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView$b;
import java.util.LinkedList;

public class d0$a implements d0$b	// class@00096b
{
    public final d0 a;

    public void d0$a(d0 p0){
       this.a = p0;
       super();
    }
    public void b(int p0){
       d0$a uoa = d0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       d0 r = this.a.r;
       if (r != null) {
          r.scrollTo(0, p0);
       }
       return;
    }
    public int c(View p0){
       int i;
       d0 obj = PatchProxy.applyOneRefs(p0, this, d0$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 != null) {
          obj = this.a.r;
          if (obj != null && obj != p0) {
             i = o.q(obj, p0, 5);
          label_0024 :
             return i;
          }
       }
       i = 0;
       goto label_0024 ;
    }
    public int d(){
       d0 obj = PatchProxy.apply(null, this, d0$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.r;
       int height = (obj != null)? obj.getHeight(): 0;
       return height;
    }
    public void e(NestedScrollView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "1")) {
          return;
       }
       if (!this.a.q.contains(p0)) {
          this.a.q.add(p0);
       }
       return;
    }
    public void f(NestedScrollView$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "2")) {
          return;
       }
       this.a.q.remove(p0);
       return;
    }
    public int getScrollY(){
       d0 obj = PatchProxy.apply(null, this, d0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.r;
       int scrollY = (obj != null)? obj.getScrollY(): 0;
       return scrollY;
    }
}
