package com.kwai.component.photo.reduce.e$a;
import androidx.recyclerview.widget.RecyclerView$i;
import com.kwai.component.photo.reduce.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.animation.ValueAnimator;

public class e$a extends RecyclerView$i	// class@000ae0
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void j(int p0,int p1){
       e s;
       int i;
       e uoe = e.class;
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       e$a ta = this.a;
       if (ta.r == null) {
          ta.s = ta.p.getMeasuredHeight();
          ta = this.a;
          s = ta.s;
          Objects.requireNonNull(ta);
          Object obj = PatchProxy.apply(null, ta, uoe, "3");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             int i1 = 0;
             i = (ta.p.getChildCount() <= 0)? 0: ta.p.getChildAt(i1).getHeight() + ta.p.getLayoutParams().topMargin;
          }
          ta.r = s + i;
       }
       if (this.a.p.getAdapter().getItemCount() % 2) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, uoe, "6")) {
             s = ta.q;
             if (s != null) {
                s.cancel();
                ta.q.removeAllListeners();
             }
          }
          ta = this.a;
          ta.P8(ta.s, ta.r);
       }
       return;
    }
    public void l(int p0,int p1){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!(this.a.p.getAdapter().getItemCount() % 2)) {
          e$a ta = this.a;
          ta.P8(ta.r, ta.s);
       }
       return;
    }
}
