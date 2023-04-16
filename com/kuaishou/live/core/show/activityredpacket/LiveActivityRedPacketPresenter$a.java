package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$a;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o22.b;
import java.util.Map;
import java.lang.Boolean;
import n22.b;
import uw1.d;
import ekd.k1;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService$RemoveRedPacketActionSource;
import java.lang.Integer;
import java.util.Objects;
import h22.y;
import java.lang.Runnable;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import qk.m;
import java.util.ArrayList;

public class LiveActivityRedPacketPresenter$a implements LiveActivityRedPacketService	// class@000932
{
    public final LiveActivityRedPacketPresenter a;

    public void LiveActivityRedPacketPresenter$a(LiveActivityRedPacketPresenter p0){
       this.a = p0;
       super();
    }
    public t D3(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.v.hide();
    }
    public b Z2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketPresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.u.get(p0);
    }
    public boolean a(){
       LiveActivityRedPacketPresenter obj = PatchProxy.apply(null, this, LiveActivityRedPacketPresenter$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.s;
       boolean b = (obj != null && obj.b())? true: false;
       return b;
    }
    public void b(d p0){
       LiveActivityRedPacketPresenter$a ta = this.a;
       if (p0 == ta.A) {
          ta.A = null;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveActivityRedPacketPresenter$a.class, "6")) {
          return;
       }
       k1.n(LiveActivityRedPacketPresenter.K);
       return;
    }
    public void d(int p0,String p1,LiveActivityRedPacketService$RemoveRedPacketActionSource p2){
       if (PatchProxy.isSupport(LiveActivityRedPacketPresenter$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveActivityRedPacketPresenter$a.class, "4")) {
          return;
       }
       LiveActivityRedPacketPresenter$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LiveActivityRedPacketPresenter.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, ta, LiveActivityRedPacketPresenter.class, "8")) {
          k1.o(new y(ta, p1, p2, p0));
       }
       return;
    }
    public void e(d p0){
       this.a.A = p0;
    }
    public List v4(){
       Object obj = PatchProxy.apply(null, this, LiveActivityRedPacketPresenter$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       m.s(this.a.u.values()).n(uArrayList);
       return uArrayList;
    }
}
