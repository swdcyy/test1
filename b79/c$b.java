package b79.c$b;
import com.yxcorp.gifshow.widget.m;
import b79.c;
import q79.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.QMedia;
import r79.a;
import w69.k;
import java.util.List;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import r79.c;
import kotlin.jvm.internal.a;
import w69.f;
import o79.q;
import java.lang.Math;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import z69.y;

public final class c$b extends m	// class@00037f
{
    public final c c;
    public final d d;

    public void c$b(c p0,d p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       c$b tc;
       boolean b;
       q a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       c obj = null;
       p0 = (p0 != null)? p0.getTag(R.id.ksa_media_item): obj;
       if (p0 instanceof QMedia) {
          obj = p0;
       }
       if (obj != null) {
          if (this.d.s0().m().e0 != null) {
             tc = this.c;
             List list = this.d.m();
             Objects.requireNonNull(tc);
             String str = "3";
             tc = PatchProxy.applyTwoRefs(obj, list, tc, c.class, str);
             if (tc != PatchProxyResult.class) {
                b = tc.booleanValue();
             }else {
                b = false;
                if (list != null && (!list.isEmpty() && !list.isEmpty())) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      if (a.g(iterator.next().getPath(), obj.getPath())) {
                         b = true;
                         break ;
                      }
                   }
                }
             }
             if (!b) {
                if (this.d.s0().d().f()) {
                   a = q.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidOneRefs(obj, a, q.class, str)) {
                      a.q(obj, "item");
                      obj.mClipDuration = (obj.isVideo())? Math.min(obj.duration, 4000): 2500;
                   }
                }
                String str1 = this.d.o0(obj);
                if (str1 != null) {
                   s.h(str1);
                }else {
                   tc = this.c;
                   obj = tc.k;
                   if (obj != null) {
                      obj.vb(tc.getAdapterPosition());
                   }
                }
             }else {
                tc = this.c;
                obj = tc.k;
                if (obj != null) {
                   obj.vb(tc.getAdapterPosition());
                }
             }
          }else {
             tc = this.c;
             obj = tc.k;
             if (obj != null) {
                obj.vb(tc.getAdapterPosition());
             }
          }
       }
       return;
    }
}
