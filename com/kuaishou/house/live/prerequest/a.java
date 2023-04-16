package com.kuaishou.house.live.prerequest.a;
import im8.g;
import h41.a;
import mrd.a;
import com.kuaishou.house.live.prerequest.a$b;
import com.kuaishou.house.live.prerequest.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import fq5.b;
import java.lang.Number;
import oy.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.google.gson.JsonElement;
import java.lang.System;
import ng0.c;
import ng0.b;
import brd.t;
import eh0.b;
import erd.g;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import eh0.a;
import erd.a;
import eh0.d;
import eh0.c;
import crd.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import eh0.g;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sr5.a;
import kotlin.Pair;
import og0.b;

public class a extends a implements g	// class@000793
{
    public final a s;
    public final a t;
    public b u;
    public a v;
    public a$b w;
    public b x;

    public void a(){
       super();
       this.s = a.g();
       this.t = a.g();
       this.w = new a$b();
       this.x = new a$a(this);
    }
    public final void P8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       try{
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("liveStreamId", this.u.getLiveStreamId());
          jsonObject.a0("typeView", Integer.valueOf(p0));
          jsonObject.a0("liveType", Integer.valueOf(0));
          a uoa1 = a.f();
          uoa1.R(this.u.getLiveStreamId());
          uoa1.c0("audience");
          uoa1.S(this.u.r5().mEntity.mTypeViewList);
          uoa1.T("bottomIcon");
          uoa1.z("/rest/fang/live/audience/resource");
          uoa1.U(jsonObject.toString());
          long l = System.currentTimeMillis();
          this.X7(b.b().c(jsonObject.toString()).doOnSubscribe(new b(this)).subscribeOn(d.b).map(new e()).doFinally(new a(this)).subscribe(new d(this, uoa1, l), new c(this, uoa1, l)));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       super.Q(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new g());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.r8("LIVE_BASIC_CONTEXT");
       this.v = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       return;
    }
    public void x(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a uoa1 = null;
       uoa = this.v;
       if (uoa != null && uoa.j0() != null) {
          uoa1 = this.v.j0().mEntity;
       }
       Pair pair = b.c(uoa1);
       if (pair.getFirst().booleanValue()) {
          this.w.a = pair.getSecond().intValue();
          this.w.b = System.currentTimeMillis();
          this.P8(pair.getSecond().intValue());
       }
       return;
    }
}
