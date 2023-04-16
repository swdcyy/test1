package com.kuaishou.live.core.show.activityredpacket.i;
import uw1.c;
import com.kuaishou.live.core.show.activityredpacket.h;
import o22.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import ia1.b;
import i22.a;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import h22.g;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment;
import t02.a0;
import uw1.f;
import uw1.e;
import java.util.Map;

public class i implements c	// class@000954
{
    public final b a;
    public final h b;

    public void i(h p0,b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c.getValue().treasureBoxId;
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.a.c.getValue() != null) {
          return this.a.c.getValue().showDeadline;
       }
       return 0;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.d.getValue() != null)? true: false;
       return b;
    }
    public boolean d(){
       LiveTreasureBoxMessage$LiveTreasureBoxShow obj = PatchProxy.apply(null, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.c.getValue();
       if (obj != null) {
          obj = obj.skinTheme;
          if (obj != null) {
             return obj.needBookReservation;
          }
       }
       return false;
    }
    public b e(){
       Object obj = PatchProxy.apply(null, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(this.a.c.getValue());
    }
    public LiveRedPacketContainerItemBaseFragment f(String p0){
       LiveActivityRedPacketFragment liveActivity;
       i obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       i tb = this.b;
       h l = tb.L;
       h m = tb.M;
       h p = tb.P;
       g og = new g(this);
       if (PatchProxy.isSupport(LiveActivityRedPacketFragment.class)) {
          Object[] objArray = new Object[]{obj,l,m,p0,p,og};
          liveActivity = PatchProxy.apply(objArray, null, LiveActivityRedPacketFragment.class, "11");
          if (liveActivity != PatchProxyResult.class) {
          label_005e :
             return liveActivity;
          }
       }
       liveActivity = new LiveActivityRedPacketFragment(p0);
       liveActivity.m = l.Z2;
       liveActivity.o = l;
       liveActivity.q = m;
       liveActivity.t = obj;
       liveActivity.r = p;
       liveActivity.s = og;
       goto label_005e ;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.c.getValue().boxType;
    }
    public long getOpenTime(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.c.getValue().grabTime;
    }
    public int getPriority(){
       return e.c(this);
    }
    public String h(){
       LiveTreasureBoxMessage$LiveTreasureBoxShow obj = PatchProxy.apply(null, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.c.getValue();
       if (obj != null) {
          obj = obj.skinTheme;
          if (obj != null) {
             return obj.reservationId;
          }
       }
       return null;
    }
    public Map i(){
       Object obj = PatchProxy.apply(null, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.c.getValue() != null) {
          return this.a.c.getValue().extraMessage;
       }
       return null;
    }
}
