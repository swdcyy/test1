package cv2.b;
import com.kuaishou.live.viewcontroller.ViewController;
import ss2.e;
import msd.t;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import us2.d;
import android.content.Context;
import ts2.f;
import com.kwai.robust.PatchProxyResult;
import ts2.h;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import cv2.a;
import java.lang.Enum;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.FixLinearLayoutManager;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.FixGridLayoutManager;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$n;
import k17.b;
import java.lang.Integer;
import java.lang.Number;
import yx2.j;
import rs2.c;
import android.app.Activity;
import us2.a;
import androidx.lifecycle.LiveData;
import us2.b;
import androidx.lifecycle.LifecycleOwner;
import brd.t;
import jv2.a;
import android.view.ViewGroup;
import java.lang.Iterable;
import java.util.Iterator;

public final class b extends ViewController	// class@0023e9
{
    public final e j;
    public final t k;
    public final TheaterDisplayMode l;

    public void b(e p0,t p1,TheaterDisplayMode p2){
       a.p(p0, "micSeatDataManager");
       a.p(p1, "micSeatPendantsFactory");
       a.p(p2, "displayMode");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       Object obj = this;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uob, "1")) {
          return;
       }
       obj.Q2(R.layout.arg_RES_7f0d0e41);
       d uod = new d(this.D2(), obj.j);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = PatchProxy.applyOneRefs(uod, obj, uob, "2");
       if (uoc != patchProxyRe) {
       }else {
          RecyclerView recyclerView = obj.A2(R.id.live_voice_party_theater_chat_view);
          recyclerView.setItemAnimator(objArray);
          FixLinearLayoutManager uFixLinearLa = PatchProxy.apply(objArray, obj, uob, "3");
          a uoa = null;
          if (uFixLinearLa != patchProxyRe) {
          }else {
             int i1 = a.a[obj.l.ordinal()];
             if (i1 != 1) {
                int i2 = 0x7f07032a;
                if (i1 != 2) {
                   uFixLinearLa = new FixLinearLayoutManager(this.D2(), a1.d(0x7f07030d), a1.d(i2), uoa);
                }else {
                   FixGridLayoutManager uFixGridLayo = new FixGridLayoutManager(this.D2(), 6, -1, a1.d(i2), 0, 16, null);
                }
             }else {
                uFixLinearLa = new FixLinearLayoutManager(this.D2(), -1, a1.d(0x7f0702fe), 1);
             }
          }
          recyclerView.setLayoutManager(uFixLinearLa);
          Object[] objArray1 = PatchProxy.apply(objArray, obj, uob, "4");
          if (objArray1 != patchProxyRe) {
          }else {
             int i = a.b[obj.l.ordinal()];
             LiveData liveData = 24;
             if (i != 1) {
                if (i == 2) {
                   objArray = new b(uoa, uoa, j.a(this.P2(), Integer.valueOf(liveData)));
                }
             }else {
                objArray = new b(1, uoa, j.a(this.P2(), Integer.valueOf(liveData)));
             }
             objArray1 = objArray;
          }
          if (objArray1 != null) {
             recyclerView.addItemDecoration(objArray1);
          }
          uoc = new c(obj, this.B2(), b.a(uod), recyclerView);
       }
       t ot = t.empty();
       a.o(ot, "Observable.empty\(\)");
       Iterator iterator = obj.k.invoke(this, obj.j, uod, uoc, ot, new a(uoc, obj.A2(R.id.theater_chat_view_container))).iterator();
       while (iterator.hasNext()) {
          obj.z2(iterator.next());
       }
       return;
    }
}
