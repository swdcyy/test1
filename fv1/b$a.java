package fv1.b$a;
import erd.g;
import fv1.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantAdapter;
import java.util.ArrayList;
import gv1.e;
import gv1.b;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.recyclerview.widget.h$b;
import u2.f;
import java.util.Iterator;
import java.lang.Iterable;
import ls5.a;
import android.view.ViewGroup;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import trd.u;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class b$a implements g	// class@0023b9
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj;
       int i;
       List list;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, str)) {
       }else {
          b c = this.b.c;
          if (c == null) {
             a.S("recyclerView");
          }
          c.invalidateItemDecorations();
          b d = this.b.d;
          if (d == null) {
             a.S("pendantAdapter");
          }
          a.o(p0, "it");
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(p0, d, TempPlayPendantAdapter.class, str)) {
             a.p(p0, "items");
             if (p0.size() < 3) {
                list = p0;
             }else {
                ArrayList uArrayList3 = new ArrayList();
                int i1 = 0;
                ArrayList obj3 = 2;
                while (i1 < obj3) {
                   uArrayList3.add(p0.get(i1));
                   i1 = i1 + 1;
                }
                uArrayList3.add(new e(p0.subList(obj3, p0.size())));
                obj3 = uArrayList3;
             }
             ViewControllerAdapter.J0(d, list, new b(d.L0(), list), null, false, 12, null);
          }
          b$a tb = this.b;
          b e = tb.e;
          if (!PatchProxy.applyVoidTwoRefs(e, p0, tb, b.class, "4")) {
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                i = e.contains(obj) ^ 0x01;
                if (i) {
                   uArrayList1.add(obj);
                }
             }
             ArrayList uArrayList2 = new ArrayList();
             Iterator iterator1 = e.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                i = p0.contains(obj) ^ 0x01;
                if (i) {
                   uArrayList2.add(obj);
                }
             }
             iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                Object obj1 = iterator1.next();
                obj1.d(tb.h);
                b.d0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController.onAttach", "bizType", obj1.getId(), "item", obj1);
             }
             iterator1 = uArrayList2.iterator();
             while (iterator1.hasNext()) {
                Object obj2 = iterator1.next();
                obj2.e(tb.h);
                b.d0(LiveLogTag.LIVE_TOP_PENDANT, "LiveTempPlayPendantController.onDetach", "bizType", obj2.getId(), "item", obj2);
             }
          }
          this.b.e = p0;
          LiveLogTag lIVE_TOP_PEN = LiveLogTag.LIVE_TOP_PENDANT;
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          p0 = p0.iterator();
          while (p0.hasNext()) {
             uArrayList.add(p0.next().getId());
          }
          b.c0(lIVE_TOP_PEN, "LiveTempPlayPendantController.observePendantDisplayItems", "bizType list", CollectionsKt___CollectionsKt.V2(uArrayList, ";", null, null, 0, null, null, 62, null));
       }
       return;
    }
}
