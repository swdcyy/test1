package com.kuaishou.live.common.core.component.comments.item.a;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.common.core.component.comments.item.e$a;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.comments.item.e;
import android.view.ViewGroup;
import hf1.b;
import java.lang.Runnable;
import hf1.c;

public final class a implements View$OnLayoutChangeListener	// class@001099
{
    public final e$a b;
    public final View c;

    public void a(e$a p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       a tb = this.b;
       a tc = this.c;
       Objects.requireNonNull(tb);
       if ((p7 - p5) != (p3 - p1)) {
          if (tb.n.c != null) {
             if (tb.g.getRight() > tb.k.getRight()) {
                tc.post(new b(tb));
             }
          }else {
             tc.post(new c(tb, p3, p1));
          }
       }
       return;
    }
}
