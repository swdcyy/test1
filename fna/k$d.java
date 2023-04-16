package fna.k$d;
import android.view.View$OnTouchListener;
import fna.k;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import gna.a;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class k$d implements View$OnTouchListener	// class@00298b
{
    public float b;
    public float c;
    public boolean d;
    public final k e;
    public final RecyclerView f;
    public final ViewGroup g;
    public final ViewGroup h;

    public void k$d(k p0,RecyclerView p1,ViewGroup p2,ViewGroup p3){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       float f;
       k$d te1;
       k$d te2;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, k$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       k$d te = this.e;
       k u = te.u;
       k t = te.t;
       if (te.r != null) {
          t = null;
       }else {
          u = null;
       }
       LinearLayoutManager linearLayout = null;
       if (te.s != null) {
          RecyclerView$Adapter adapter = this.f.getAdapter();
          if (!adapter instanceof a) {
             adapter = linearLayout;
          }
          if (adapter != null && adapter.L0() == true) {
          label_006b :
             u = null;
             t = null;
          }else if(!p1.getAction()){
             k$d te5 = this.e;
             if (GrowthCommonExtKt.b(this.g) >= (- te5.y)) {
                te5.r = b;
                te5.t = true;
                t = 1;
             }else {
                te5 = this.e;
                if (GrowthCommonExtKt.b(this.g) == (- te5.w)) {
                   te5.r = true;
                   te5.u = true;
                   u = 1;
                }
             }
          }
       }else {
          goto label_006b ;
       }
       if (u != null && !p1.getAction()) {
          u = (!GrowthCommonExtKt.a(this.f))? 1: null;
       }
    label_0080 :
       int action = p1.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_0109 :
                   if (t != null) {
                      RecyclerView$LayoutManager layoutManage = this.f.getLayoutManager();
                      if (layoutManage instanceof LinearLayoutManager) {
                         linearLayout = layoutManage;
                      }
                      if (linearLayout != null) {
                         linearLayout.scrollToPositionWithOffset(b, b);
                      }
                      f = this.b - p1.getRawY();
                      if (this.d != null || p1.getAction() == 3) {
                         this.h.dispatchTouchEvent(p1);
                      }
                      te1 = this.e;
                      if (f - (float)te1.x > 0) {
                         te1.P8(this.g, (- te1.w));
                         te2 = this.e;
                         te2.r = true;
                         te2.u = true;
                      }else {
                         te1.P8(this.g, b);
                         te1 = this.e;
                         te1.r = b;
                         te1.t = true;
                      }
                      return true;
                   }else if(u != null){
                      f = p1.getRawY() - this.b;
                      if (this.d != null || p1.getAction() == 3) {
                         this.h.dispatchTouchEvent(p1);
                      }
                      te1 = this.e;
                      if (f - (float)te1.x > 0) {
                         te1.P8(this.g, b);
                         te1.r = b;
                         RecyclerView$LayoutManager layoutManage1 = this.f.getLayoutManager();
                         if (layoutManage1 instanceof LinearLayoutManager) {
                            linearLayout = layoutManage1;
                         }
                         if (linearLayout != null) {
                            linearLayout.scrollToPositionWithOffset(b, b);
                         }
                         b.t = true;
                      }else {
                         te1.P8(this.g, (- te1.w));
                         te2 = this.e;
                         te2.r = true;
                         te2.u = true;
                      }
                      return true;
                   }
                }
             }else if(t != null){
                f = this.b - p1.getRawY();
                k$d te3 = this.e;
                if (Math.abs(f) - (float)te3.y > 0) {
                   this.d = b;
                }
                if (f - (float)b > 0) {
                   GrowthCommonExtKt.g(this.g, Math.max((int)(- f), (- te3.w)));
                }else {
                   GrowthCommonExtKt.g(this.g, b);
                }
                this.e.V8();
                this.c = f;
                return true;
             }else if(u != null){
                f = p1.getRawY() - this.b;
                k$d te4 = this.e;
                if (Math.abs(f) - (float)te4.y > 0) {
                   this.d = b;
                }
                if (f - (float)b > 0) {
                   GrowthCommonExtKt.g(this.g, (int)((float)(- te4.w) + f));
                }else {
                   this.h.dispatchTouchEvent(p1);
                   GrowthCommonExtKt.g(this.g, (- this.e.w));
                }
                this.e.V8();
                this.c = f;
                return true;
             }
          }else {
             goto label_0109 ;
          }
       }else {
          this.c = 0;
          if (t != null || u != null) {
             this.b = p1.getRawY();
             this.h.dispatchTouchEvent(p1);
             this.d = true;
             return true;
          }
       }
       return b;
    }
}
