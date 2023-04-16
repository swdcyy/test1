package n21.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import xp5.a;
import u53.b;
import n21.d;
import hf3.a;
import n21.h;
import n21.n;
import n21.o$a;
import n21.s;
import n21.f;
import n21.h$b;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.lang.Iterable;
import com.google.common.collect.e;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Iterator;
import java.util.Map$Entry;
import n21.h$c;
import n21.f$a;
import n21.e;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import n21.k;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import p91.m;
import vq5.d;

public class o extends PresenterV2	// class@003297
{
    public LiveTopPendantTempPlayService p;
    public a q;
    public m r;
    public d s;
    public final Map t;
    public h u;
    public f v;
    public static String sLivePresenterClassName = "LiveAudienceCommonActivityPendantPresenter";

    public void o(){
       super();
       this.t = new HashMap();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "2")) {
          return;
       }
       if (b.c(this.r).d()) {
          return;
       }
       d uod = new d(this.q);
       this.v = uod;
       this.u = new h(new n(this), uod, new o$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       o tu = this.u;
       if (tu != null) {
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(null, tu, h.class, "5")) {
             Set set = tu.d.entrySet();
             Collection uCollection = (set instanceof Collection)? e.a(set): Lists.c(set);
             Iterator iterator = new CopyOnWriteArraySet(uCollection).iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                uEntry.getValue().a();
                tu.a.c(uEntry.getValue().b());
             }
             tu.d.clear();
             h c = tu.c;
             if (c != null) {
                c.b(tu.e);
             }
          }
       }
       this.u = null;
       tu = this.v;
       if (tu != null) {
          tu.release();
       }
       this.v = null;
       return;
    }
    public final View$OnClickListener P8(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.p = this.q8(LiveTopPendantTempPlayService.class);
       this.q = this.r8("LIVE_LONG_CONNECTION");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
