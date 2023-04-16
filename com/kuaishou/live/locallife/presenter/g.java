package com.kuaishou.live.locallife.presenter.g;
import im8.g;
import c12.f;
import mrd.a;
import p87.a;
import com.kuaishou.live.locallife.presenter.g$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.lang.Throwable;
import com.kuaishou.locallife.log.biz.LocalLifeLiveLogBiz;
import mr3.b;
import lr3.d;
import lp3.e;
import p91.m;
import t91.a;
import lp3.c;
import com.kwai.robust.PatchProxyResult;
import ff3.g0;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a87.c;
import com.google.common.collect.ImmutableMap;
import lr3.b;
import java.lang.System;
import java.lang.Integer;
import com.google.gson.JsonObject;
import java.lang.Number;
import xe3.b;
import xe3.a;
import com.google.gson.JsonElement;
import brd.t;
import ff3.b0;
import erd.g;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import ff3.a0;
import erd.a;
import ff3.d0;
import ff3.c0;
import crd.b;

public class g extends f implements g	// class@000c52
{
    public final a K;
    public final a L;
    public final a M;
    public m N;
    public a0 O;
    public a P;
    public boolean Q;
    public c R;
    public static String sLivePresenterClassName = "LocalLifePreRequestPresenter";

    public void g(){
       super();
       this.K = a.g();
       this.L = a.g();
       this.M = a.g();
       this.P = new a();
       this.Q = false;
       this.R = new g$a(this);
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, g.class, "3")) {
          return;
       }
       if (this.Q != null) {
          this.b9(false);
       }
       return;
    }
    public final void a9(String p0,Map p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g.class, "6")) {
          return;
       }
       d.a("LOCAL_LIFE_LOG_STAT_EVENT", LocalLifeLiveLogBiz.LIVE_ROOM, "LocalLifePreRequestPresenter", p0, p1, p2, false, 2);
       return;
    }
    public final void b9(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "5")) {
          return;
       }
       og = this.N;
       if (og != null) {
          a uoa = og.t5().a(a.class);
          if (p0) {
             uoa.Oe("isLocalLifeLive", Boolean.TRUE);
          }else {
             uoa.Ki("isLocalLifeLive");
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new g0());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.N = this.r8("LIVE_BASIC_CONTEXT");
       this.O = this.q8(a0.class);
       return;
    }
    public void x(boolean p0){
       LiveStreamFeedWrapper mEntity;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "2")) {
          return;
       }
       g tO = this.O;
       Map map = null;
       if (tO != null) {
          a0 c = tO.c;
          if (c != null) {
             mEntity = c.mEntity;
          label_0022 :
             mEntity = c.b(mEntity);
             this.Q = mEntity;
             b.d(LocalLifeLiveLogBiz.LIVE_ROOM, "LocalLifePreRequestPresenter", "live room isLocalLifeProductLive", ImmutableMap.of("isLocalLifeProductLive", Boolean.valueOf(mEntity)));
             if (this.Q != null) {
                tO = this.P;
                int i = 39;
                tO.a = i;
                tO.b = System.currentTimeMillis();
                this.b9(true);
                if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, og, "4")) {
                   try{
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("liveStreamId", this.N.getLiveStreamId());
                      jsonObject.a0("typeView", Integer.valueOf(i));
                      this.a9("AudienceResourceRequest", map, map);
                      a.a().g(jsonObject.toString()).doOnSubscribe(new b0(this)).subscribeOn(d.b).map(new e()).doFinally(new a0(this)).subscribe(new d0(this), new c0(this));
                   }catch(java.lang.Exception e0){
                   }
                }
             }
             return;
          }
       }
       mEntity = map;
       goto label_0022 ;
    }
}
