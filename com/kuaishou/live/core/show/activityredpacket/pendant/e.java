package com.kuaishou.live.core.show.activityredpacket.pendant.e;
import a51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import brd.x;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.activityredpacket.pendant.d;
import bp6.a;
import erd.g;
import crd.b;
import java.util.Iterator;
import com.kuaishou.live.core.show.activityredpacket.pendant.c;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import h62.c;
import h62.e;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import h62.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ng2.s;
import uw1.m;
import p91.m;

public class e extends c	// class@000974
{
    public m v;
    public LiveActivityRedPacketService w;
    public s x;
    public m y;
    public List z;
    public static final List A;
    public static String sLivePresenterClassName;

    static {
       e.A = a.a(LiveLogTag.ACTIVITY_LEEE, "PendantPresenter");
    }
    public void e(){
       super();
       this.z = new ArrayList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       super.E8();
       this.w.D3().compose(this.P8()).observeOn(d.a).subscribe(new d(this), new a());
       return;
    }
    public void J8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(objArray, this, uoe, "9")) {
          Iterator iterator = this.z.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          this.z.clear();
       }
       return;
    }
    public final void S8(LiveTreasureBoxMessage$LiveTreasureBoxShow p0,LiveRedPacketAction p1){
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, this, e.class, "10")) {
          return;
       }
       c uoc = new c(e.c(p0), LiveRedPacketStage.RED_PACKET_COUNTDOWN, p1, obj.treasureBoxId, RedPacketType.RED_PACKET_TYPE_ACTIVITY, -1, -1, FirstReportType.DEFAULT, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
       d.j(v1.e(obj.boxType));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.w = this.q8(LiveActivityRedPacketService.class);
       this.x = this.r8("LIVE_RED_PACKET_PENDANT_SERVICE");
       this.y = this.s8(m.class);
       this.v = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
