package com.yxcorp.gifshow.activity.share.presenter.n1$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.activity.share.presenter.n1;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import g9c.a;
import xw8.c;
import xw8.b;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import zw8.x2;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class n1$b extends RecyclerView$r	// class@001416
{
    public final n1 a;

    public void n1$b(n1 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       n1$b uob = n1$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p1) {
          LinearLayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage == null) {
             return;
          }else {
             int i = layoutManage.h();
             n1$b ta = this.a;
             Objects.requireNonNull(ta);
             n1 on1 = n1.class;
             if (!PatchProxy.isSupport(on1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta, on1, "29")) {
                ta.f1 = i;
                ta.R.v(i);
                int i1 = 0;
                int i2 = 0;
                while (i1 < ta.c1.getItemCount()) {
                   if (ta.c1.s1(i1).b() == i) {
                      i2 = i1;
                   }
                   i1 = i1 + 1;
                }
                ta.X0.scrollToPosition(i2);
                ta.X0.getViewTreeObserver().addOnGlobalLayoutListener(new x2(ta, i2));
             }
          }
       }
       return;
    }
}
