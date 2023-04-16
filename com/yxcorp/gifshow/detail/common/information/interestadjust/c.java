package com.yxcorp.gifshow.detail.common.information.interestadjust.c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import hy9.m;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import android.widget.Button;
import hy9.f;
import hy9.g;
import hy9.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import qp7.x0;
import pp7.b;
import hy9.k;
import android.view.View$OnClickListener;

public final class c implements Observer	// class@001427
{
    public final d b;
    public final m c;

    public void c(d p0,m p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       int i = 0;
       if (p0.intValue() == 1) {
          tb.m.setVisibility(4);
          tb.n.setVisibility(i);
          tc.g(new f(tb));
          tb.v();
       }else if(!p0.intValue()){
          tb.m.setVisibility(4);
          tb.n.setVisibility(4);
       }else {
          tb.m.setVisibility(i);
          tb.n.setVisibility(i);
          tc.g(new g(tb));
          p0 = new h(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tc, m.class, "5")) {
             tc.g.d(tc.c(), p0);
          }
          if (!PatchProxy.applyVoid(null, tb, d.class, "4")) {
             tb.m.setOnClickListener(new k(tb));
          }
          tb.v();
       }
       return;
    }
}
