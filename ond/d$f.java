package ond.d$f;
import androidx.recyclerview.widget.RecyclerView$r;
import ond.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import kotlin.Pair;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class d$f extends RecyclerView$r	// class@00202b
{
    public final d a;

    public void d$f(d p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(d$f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$f.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       d$f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d.class, "15")) {
          p1 = ta.D();
          List decorationDr = ta.e.getDecorationDrawerList();
          a.o(decorationDr, "mContainerView.decorationDrawerList");
          Iterator iterator = decorationDr.iterator();
          while (iterator.hasNext()) {
             EditDecorationBaseDrawer uEditDecorat = iterator.next();
             if (uEditDecorat.getIdentifyList().isEmpty()) {
                continue ;
             }else {
                a.o(uEditDecorat, "it");
                int i = ta.E(uEditDecorat).component1().intValue();
                if (i < 0) {
                }else {
                   int i2 = 0;
                   for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                      i2 = i2 + ta.I(ta.d.u0(i1)).c;
                   }
                   i2 = i2 - p1;
                   uEditDecorat.setAdditionOffsetY(i2);
                   ta.e.C0(uEditDecorat);
                }
             }
          }
       }
       return;
    }
}
