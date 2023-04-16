package bad.d;
import x9d.b;
import nfd.e;
import bad.d$a;
import lkd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import cdd.g;
import com.yxcorp.plugin.search.entity.SearchItem;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import g9c.a;
import joc.d;
import joc.c;
import gbd.h;
import com.kwai.robust.PatchProxyResult;
import t2b.b$e;
import gbd.g;
import java.util.Objects;
import bad.c;
import y8c.g;
import t2b.b$c;
import t2b.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import nfd.t0;
import androidx.recyclerview.widget.RecyclerView$n;
import nfd.o3;
import bad.b;
import t2b.a$a;
import android.view.View;
import ekd.m1;

public class d extends b	// class@0003cf
{
    public RecyclerView s;
    public g t;
    public b u;
    public c v;
    public e w;

    public void d(){
       super();
       this.w = new e(new d$a(this));
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       super.E8();
       if (PatchProxy.applyVoid(objArray, this, uod, "5") || (this.r.mKBoxTabFeeds != null && this.s != null)) {
          g og1 = new g(this.q);
          this.t = og1;
          this.s.setAdapter(og1);
          this.t.W0(this.r.mKBoxTabFeeds);
          this.t.k0();
       }
    label_003f :
       uod = this.v;
       if (uod != null) {
          uod.k(this.w);
       }
       uod = this.u;
       d ts = this.s;
       g og = PatchProxy.apply(objArray, objArray, h.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          og = g.a;
       }
       d tt = this.t;
       Objects.requireNonNull(tt);
       uod.d(ts, og, new c(tt));
       this.u.b();
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
       linearLayout.setOrientation(0);
       this.s.setLayoutManager(linearLayout);
       this.s.addItemDecoration(o3.U(t0.i, 0, 0));
       this.u = new b(new b(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d tt = this.t;
       if (tt != null) {
          tt.Z0();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a36cb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       super.j8();
       this.v = this.t8("SEARCH_SWIPE_DETECTOR");
       return;
    }
}
