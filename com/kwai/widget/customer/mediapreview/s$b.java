package com.kwai.widget.customer.mediapreview.s$b;
import androidx.recyclerview.widget.RecyclerView$q;
import com.kwai.widget.customer.mediapreview.s;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import kx7.c;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Math;
import g9c.a;
import lnc.a1;

public class s$b implements RecyclerView$q	// class@001143
{
    public float b;
    public boolean c;
    public final s d;

    public void s$b(s p0){
       this.d = p0;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       s$b uob;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, s$b.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       int action = p1.getAction();
       if (action) {
          int i = 2;
          if (action == i) {
             s$b td = this.d;
             Objects.requireNonNull(td);
             Object[] objArray = null;
             Object obj = PatchProxy.apply(objArray, td, s.class, "5");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
                View childAt = td.p.getChildAt(false);
                if (childAt != null) {
                   int childAdapter = td.p.getChildAdapterPosition(childAt);
                   objArray = (Math.abs(childAt.getLeft()) > (childAt.getMeasuredWidth() / i))? td.q.N0((childAdapter + true)): td.q.N0(childAdapter);
                }
             }
             if (objArray == null) {
                return false;
             }else {
                action = this.d.q.P0(objArray);
                float f = this.b - p1.getX();
                if (Math.abs(f) - (float)a1.e(3.00f) < 0) {
                   return false;
                }else if(f < 0){
                   uob = 1;
                }else {
                   uob = null;
                }
                if (this.c == null) {
                   if (!action && uob) {
                      this.c = true;
                      return true;
                   }else if(!uob && action == (this.d.q.getItemCount() - true)){
                      this.c = true;
                      return true;
                   }
                }
             }
          }
       }else {
          this.b = p1.getX();
          this.c = false;
       }
       return false;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
    }
}
