package com.yxcorp.gifshow.hotspot.presenter.d$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hotspot.presenter.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import kwa.f;

public class d$a extends RecyclerView$r	// class@0018e7
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       d$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d.class, "10") && ta.z != null) {
          d x = ta.x;
          if (x != null) {
             x = x.i0();
             View view = ta.x.findViewByPosition(x);
             if (view != null) {
                ta.z.c(view.getLeft());
             }
             ta.z.d(x);
          }
       }
       return;
    }
}
