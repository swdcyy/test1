package a32.e;
import im8.g;
import k51.c;
import java.util.HashSet;
import a32.e$a;
import a32.e$b;
import a32.e$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import t45.d;
import brd.z;
import a32.c;
import a32.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dt5.b;
import dt5.c;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import lnc.b5;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kwai.framework.model.user.User;
import p91.m;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.util.Set;
import a32.b;
import a32.i;
import java.util.Map;
import java.util.HashMap;

public class e extends c implements g	// class@000023
{
    public a0 p;
    public Set q;
    public boolean r;
    public boolean s;
    public j t;
    public b u;
    public final c v;
    public static String sLivePresenterClassName = "LiveAudienceMultiWindowAdapterPresenter";

    public void e(){
       super();
       this.q = new HashSet();
       this.s = true;
       this.t = new e$a(this);
       this.u = new e$b(this);
       this.v = new e$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.X7(this.p.s2.distinctUntilChanged().observeOn(d.a).subscribe(new c(this), d.b));
       a0 i1 = this.p.i1;
       if (i1 != null) {
          i1.e(this.u);
       }
       this.p.y2.P4(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       a0 i1 = this.p.i1;
       if (i1 != null) {
          i1.d(this.u);
       }
       this.p.y2.d5(this.v);
       this.s = true;
       this.r = false;
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b5.a(this.getActivity());
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       b.e0(LiveLogTag.MULTI_WINDOW, "recoverFromMultiWindowIfNecessary", "authorName", this.p.Z2.I().mName, "enableAdaptInMultiWindow", Boolean.valueOf(this.s), "IsInMultiWindowMode", Boolean.valueOf(this.P8()));
       this.r = false;
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       if (this.r != null) {
          return;
       }
       b.c0(LiveLogTag.MULTI_WINDOW, "switchToMultiWindow", "authorName", this.p.Z2.I().mName);
       this.r = true;
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new i());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       return;
    }
}
