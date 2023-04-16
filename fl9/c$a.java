package fl9.c$a;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;
import fl9.c;
import java.lang.Object;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import u2.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import java.lang.Boolean;
import fl9.b;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import g9c.d;
import fk9.b;
import g9c.a;
import com.kuaishou.android.model.mix.QComment;
import android.view.ViewGroup;

public class c$a implements ObservableLinearLayoutManager$a	// class@00232d
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(ObservableLinearLayoutManager p0){
       h.a(this, p0);
    }
    public void b(ObservableLinearLayoutManager p0,int p1,int p2){
       c c;
       boolean b;
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       if (ta.c == p1 && (p2 == ta.d && p0.findViewByPosition(p1) != null)) {
          c$a ta1 = this.a;
          c = ta1.c;
          Objects.requireNonNull(ta1);
          if (PatchProxy.isSupport(uoc)) {
             Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(c), ta1, uoc, "1");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
             label_0053 :
                i1 = p0.E();
                b = (c < p0.h() || c > i1)? true: false;
             }
          }else {
             goto label_0053 ;
          }
          if (b || this.a.a != null) {
             ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(p0, ta1, uoc, "2")) {
                View view = p0.findViewByPosition(ta1.c);
                if (view != null) {
                   uoc = ta1.b;
                   c c1 = ta1.c;
                   d uod = d.class;
                   View view1 = null;
                   if (PatchProxy.isSupport(uod)) {
                      QComment obj1 = PatchProxy.applyTwoRefs(uoc, Integer.valueOf(c1), view1, uod, "35");
                      if (obj1 != patchProxyRe) {
                         i = obj1.intValue();
                      }else {
                      label_00a6 :
                         d adapter = uoc.getAdapter();
                         if (adapter != null) {
                            b uob = adapter.W0();
                            if (uob != null && (c1 - adapter.b1()) >= 0) {
                               obj1 = uob.N0((c1 - adapter.b1()));
                               if (obj1 == null || obj1.isSub()) {
                                  i1 = c1 - adapter.b1();
                                  while (true) {
                                     if (i1 >= 0) {
                                        QComment qComment = uob.N0(i1);
                                        if (qComment != null && (obj1 != null && (qComment.mType == 1 && obj1.mParent == qComment))) {
                                           i = adapter.b1() + i1;
                                           break ;
                                        }else {
                                           i1 = i1 - 1;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         i = -1;
                      }
                   }else {
                      goto label_00a6 ;
                   }
                   if (i >= 0) {
                      view1 = p0.findViewByPosition(i);
                   }
                   if (view1 == null) {
                      ta1.b.scrollBy(0, (view.getTop() - ta1.b.getPaddingTop()));
                   }else {
                      ta1.b.scrollBy(0, (view1.getTop() - ta1.b.getPaddingTop()));
                   }
                }
             }
          }
       }
    label_0121 :
       p0.X0(this.a.e);
       return;
    }
    public void c(ObservableLinearLayoutManager p0){
       h.b(this, p0);
    }
}
