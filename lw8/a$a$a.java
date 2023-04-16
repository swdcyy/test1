package lw8.a$a$a;
import com.yxcorp.gifshow.widget.m;
import lw8.a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import vw8.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.ContactTargetItem;
import y8c.d;
import k2b.v1$d;
import k2b.v1$c;
import lw8.b;
import lw8.a;
import java.util.List;
import g9c.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class a$a$a extends m	// class@002dc0
{
    public final a$a c;

    public void a$a$a(a$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       a b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "1")) {
          return;
       }
       a$a$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, a$a.class, "5")) {
          b a = b.a;
          a$a p = tc.p;
          String str = "item";
          if (p == null) {
             a.S(str);
          }
          ContactTargetItem mId = p.mId;
          a.o(mId, "item.mId");
          a$a q = tc.q;
          if (q == null) {
             a.S("position");
          }
          a.a(mId, q.get()).b();
          a = tc.x.s1();
          if (a != null) {
             b = tc.x.B;
             q = tc.p;
             if (q == null) {
                a.S(str);
             }
             a.a(b, q);
          }
          tc.P8();
          a$a x = tc.x;
          a$a p1 = tc.p;
          if (p1 == null) {
             a.S(str);
          }
          Objects.requireNonNull(x);
          if (!PatchProxy.applyVoidOneRefs(p1, x, a.class, "9")) {
             List list = x.Q0();
             a.o(list, "list");
             int i = 0;
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (a.g(p1.mId, obj.mId)) {
                   int i2 = a.g(p1.mSection, obj.mSection) ^ 0x01;
                   if (i2) {
                      obj.mSelected = p1.mSelected;
                      x.l0(i);
                   }
                }
                i = i1;
             }
          }
       }
       return;
    }
}
