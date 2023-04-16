package j02.m;
import com.kuaishou.live.viewcontroller.ViewController;
import hf3.a;
import xp5.g;
import vq5.d;
import aq5.d;
import xp5.i;
import msd.a;
import jv1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import j02.m$a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j02.n;
import java.util.List;
import com.kuaishou.android.live.log.b;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.View;
import j02.o;
import androidx.lifecycle.ViewModel;
import j02.k;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import j02.e;
import androidx.lifecycle.Observer;
import j02.f;
import j02.g;
import j02.h;
import j02.i;
import com.kuaishou.live.common.treasurebox.widget.LiveAudienceTreasureBoxWidgetView;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import com.kwai.robust.PatchProxyResult;

public final class m extends ViewController	// class@002a24
{
    public o j;
    public k k;
    public final ViewModelProvider l;
    public final a m;
    public final g n;
    public d o;
    public final d p;
    public final i q;
    public final a r;
    public final b s;

    public void m(a p0,g p1,d p2,d p3,i p4,a p5,b p6){
       a.p(p0, "liveLongConnection");
       a.p(p1, "liveInfoManager");
       a.p(p2, "liveRouterManager");
       a.p(p3, "liveBizManager");
       a.p(p4, "liveLogPackageProvider");
       a.p(p5, "isLiteStreamType");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.s = p6;
       this.l = new ViewModelProvider(this, new m$a(this));
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, m.class, str)) {
          return;
       }
       b.P(n.a, "onCreate");
       this.R2(new FrameLayout(this.D2()));
       ViewModel viewModel = this.l.get(o.class);
       a.o(viewModel, "viewModelProvider.get\(Li¡­BoxViewModel::class.java\)");
       this.j = viewModel;
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       k ok = new k(view, this, this.q, this.r);
       this.k = ok;
       m tj = this.j;
       if (tj == null) {
          a.S("treasureBoxViewModel");
       }
       Objects.requireNonNull(ok);
       if (!PatchProxy.applyVoidOneRefs(tj, ok, k.class, str)) {
          a.p(tj, "viewModel");
          ok.c = tj;
          LiveData liveData = Transformations.distinctUntilChanged(tj.C0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(ok.f, new e(ok));
          liveData = Transformations.distinctUntilChanged(tj.z0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(ok.f, new f(ok, tj));
          tj.u0().observe(ok.f, new g(ok, tj));
          liveData = Transformations.distinctUntilChanged(tj.x0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(ok.f, new h(ok, tj));
          tj.w0().observe(ok.f, new i(ok, tj));
       }
       return;
    }
    public void J2(){
       k b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "3")) {
          return;
       }
       b.P(n.a, "onDestroy");
       m tk = this.k;
       if (tk == null) {
          a.S("treasureBoxDataBinding");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, k.class, "7")) {
          tk.a = false;
          b = tk.b;
          if (b != null && !PatchProxy.applyVoid(objArray, b, LiveAudienceTreasureBoxWidgetView.class, "5")) {
             b.b();
          }
       }
       return;
    }
    public final SCLiveEncourageTreasureBoxWidget V2(){
       m obj = PatchProxy.apply(null, this, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("treasureBoxViewModel");
       }
       return obj.v0();
    }
}
