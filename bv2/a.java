package bv2.a;
import com.kuaishou.live.viewcontroller.ViewController;
import msd.t;
import ss2.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.FixGridLayoutManager;
import android.content.Context;
import lnc.a1;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import bv2.d;
import androidx.recyclerview.widget.RecyclerView$n;
import us2.d;
import ts2.f;
import rs2.c;
import android.app.Activity;
import us2.a;
import androidx.lifecycle.LiveData;
import us2.b;
import androidx.lifecycle.LifecycleOwner;
import brd.t;
import jv2.a;
import android.view.ViewGroup;
import ts2.h;
import java.lang.Iterable;
import java.util.Iterator;

public final class a extends ViewController	// class@000469
{
    public final t j;
    public final e k;

    public void a(t p0,e p1){
       a.p(p0, "micSeatPendantsFactory");
       a.p(p1, "micSeatDataManager");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0e40);
       RecyclerView recyclerView = this.A2(R.id.voice_party_audio_chat_view);
       if (!PatchProxy.applyVoidOneRefs(recyclerView, this, uoa, "3")) {
          FixGridLayoutManager uFixGridLayo = new FixGridLayoutManager(this.D2(), 3, -1, a1.d(0x7f07107b), 0, 16, null);
          recyclerView.setLayoutManager(uoa);
          recyclerView.setItemAnimator(objArray);
          recyclerView.addItemDecoration(new d());
       }
       d uod = new d(this.D2(), this.k);
       c uoc = new c(this, this.B2(), b.a(uod), recyclerView);
       t ot = t.empty();
       a.o(ot, "Observable.empty\(\)");
       Iterator iterator = this.j.invoke(this, this.k, uod, uoc, ot, new a(uoc, this.A2(R.id.voice_party_audio_chat_view_container))).iterator();
       while (iterator.hasNext()) {
          this.z2(iterator.next());
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.k.d();
       return;
    }
}
