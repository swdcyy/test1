package com.yxcorp.gifshow.relation.explore.presenter.m$a;
import com.google.android.material.appbar.AppBarLayout$c;
import com.yxcorp.gifshow.relation.explore.presenter.m;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Math;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.i;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class m$a implements AppBarLayout$c	// class@001855
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void Y0(AppBarLayout p0,int p1){
       boolean b1;
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       boolean b = true;
       if (Math.abs(p1) < 3) {
          m$a tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(null, tb, m.class, "2");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             m w = tb.w;
             b1 = (w != null && w.isEmpty())? true: false;
          }
          if (!b1) {
          label_0048 :
             this.b.u.setEnabled(b);
             if (b) {
                this.b.v.stopScroll();
             }
             return;
          }
       }
       b = false;
       goto label_0048 ;
    }
}
