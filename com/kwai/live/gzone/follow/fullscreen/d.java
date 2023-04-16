package com.kwai.live.gzone.follow.fullscreen.d;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g57.n;
import g57.j;
import g57.k;
import g57.h;
import g57.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h47.b;
import j47.d;
import com.kwai.live.gzone.follow.fullscreen.c;
import java.lang.Runnable;
import ekd.k1;
import oq5.c;
import oq5.a;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import f37.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import fq5.b;
import com.kwai.live.gzone.bean.LiveGzoneFollowTipConfig;
import h57.r$c;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import com.kwai.live.gzone.follow.fullscreen.f;
import java.util.Map;
import java.util.HashMap;

public class d extends PresenterV2 implements g	// class@000cfd
{
    public LinkedHashMap A;
    public Runnable B;
    public c C;
    public b D;
    public long p;
    public List q;
    public ViewStub r;
    public a s;
    public b t;
    public d u;
    public r$c v;
    public View w;
    public n x;
    public d$a y;
    public LiveGzoneFollowTipConfig z;

    public void d(){
       super();
       this.x = new n();
       this.y = new j(this);
       this.B = new k(this);
       this.C = new h(this);
       this.D = new i(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       d tu = this.u;
       if (tu != null) {
          tu.Q1(this.D);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       this.U7(new c());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       k1.m(this.B);
       this.s.Q0(this.C);
       d tu = this.u;
       if (tu != null) {
          tu.H8(this.D);
       }
       tu = this.A;
       if (tu != null) {
          tu.clear();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       ArrayList uArrayList = ArrayList.class;
       String str = a.a.getString(b.d("user")+"follow_tip_displayed_live_rooms", "");
       Object[] objArray = (str == null || str == "")? null: b.a(str, uArrayList);
       this.q = objArray;
       if (objArray != null) {
          Iterator iterator = objArray.iterator();
          while (iterator.hasNext()) {
             this.A.put(iterator.next(), null);
          }
       }
       return;
    }
    public final void R8(){
       boolean b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "8")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uod, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.t.I().isFollowingOrFollowRequesting() || this.A.containsKey(this.t.d())){
          uod = this.v;
          if (uod != null && (this.z.mStrategyMutuallyExclusive == null || !uod.a())) {
             b = true;
          }
       }
       b = false;
       if (b) {
          k1.m(this.B);
          k1.r(this.B, this.z.mUserFullScreenWatchTimeMs);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a1ef6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new f());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_CONFIGURATION_SERVICE");
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.s8(d.class);
       this.v = this.s8(r$c.class);
       return;
    }
}
