package com.kuaishou.live.core.show.floatingwindow.c;
import im8.g;
import c12.f;
import s82.a;
import com.kuaishou.live.core.show.floatingwindow.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.floatingwindow.c$c;
import java.util.Objects;
import x61.c;
import lp3.c;
import lp3.e;
import m91.b;
import t02.a0;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.floatingwindow.a;
import android.view.View$OnClickListener;
import s82.f;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.show.floatingwindow.e$h;
import nl8.o;
import nl8.n;
import com.kuaishou.live.core.show.floatingwindow.z;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import xa2.k;
import ie2.j;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.util.rx.RxBus;
import s82.x;
import brd.t;
import t45.d;
import brd.z;
import s82.b;
import erd.g;
import crd.b;

public class c extends f implements g	// class@000b79
{
    public boolean K;
    public a0 L;
    public LiveBizParam M;
    public e$h N;
    public c$c O;
    public final b P;
    public c$b Q;
    public static String sLivePresenterClassName = "LiveAudienceBottomBarFloatingWindowPresenter";

    public void c(){
       super();
       this.P = new a(this);
       this.Q = new c$a(this);
    }
    public void Q(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       c$c uoc1 = this.a9();
       Objects.requireNonNull(uoc1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, uoc1, c$c.class, "5")) {
          uoc1.a.a(c.class).O0(1022);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
          this.L.N().G5(this.P, uoaArray);
       }
       return;
    }
    public final c$c a9(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.O == null) {
          this.O = new c$c(new a(this));
       }
       return this.O;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.a9().setVisible(false);
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.a9().setVisible(true);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.q8(a0.class);
       this.M = this.q8(LiveBizParam.class);
       this.N = this.r8("LIVE_AUDIENCE_FLOATING_WINDOW_SERVICE");
       this.a9().i(n.a(this));
       return;
    }
    public void x(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (!z.e()) {
          return;
       }
       if (k.c(this.L.c)) {
          return;
       }
       if (j.a(this.M)) {
          return;
       }
       c$c uoc1 = this.a9();
       Objects.requireNonNull(uoc1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, uoc1, c$c.class, "4")) {
          uoc1.c.setValue(uoc1.b);
          uoc1.a.a(c.class).v1(uoc1.c);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
          this.L.N().u5(this.P, uoaArray);
       }
       if (this.L.N().r2(AudienceBizRelation.VOICE_PARTY)) {
          this.b9();
       }else {
          this.c9();
       }
       this.X7(RxBus.f.f(x.class).observeOn(d.a).subscribe(new b(this)));
       this.K = false;
       return;
    }
}
