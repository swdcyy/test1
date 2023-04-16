package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter$b;
import uw1.n;
import com.kuaishou.live.common.core.component.redpacket.container.LiveRedPacketContainerItemBaseFragment;
import rg2.g0;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import h62.c;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import com.kuaishou.live.redpacket.core.condition.view.LiveRedPacketContainerItemBaseFragmentV2;
import java.lang.Number;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter$a;
import java.lang.Enum;
import h62.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.Map;
import pp.c;
import com.kuaishou.android.live.log.b;
import h62.d;
import java.lang.Integer;

public class LiveRedPacketContainerPagerAdapter$b implements n	// class@000e69
{
    public final LiveRedPacketContainerItemBaseFragment a;
    public final g0 b;
    public boolean c;

    public void LiveRedPacketContainerPagerAdapter$b(LiveRedPacketContainerItemBaseFragment p0,g0 p1){
       super();
       this.c = true;
       this.a = p0;
       this.b = p1;
    }
    public void a(){
       int i;
       boolean b = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveRedPacketContainerPagerAdapter$b uob = LiveRedPacketContainerPagerAdapter$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uob, "1")) {
          return;
       }
       if (b.c == null) {
          return;
       }
       b.c = false;
       long l = b.a.kh();
       LiveRedPacketStage rED_PACKET_C = LiveRedPacketStage.RED_PACKET_COUNTDOWN;
       LiveRedPacketAction rED_PACK_POP = LiveRedPacketAction.RED_PACK_POPUP_CONTAINER_DISPLAY;
       String str = b.a.hh();
       RedPacketType redPacketTyp = b.b(b.a.jh());
       long l1 = (System.nanoTime() - b.b.a) / 0xf4240;
       FirstReportType dEFAULT = FirstReportType.DEFAULT;
       ActionType dEFAULT1 = ActionType.DEFAULT;
       ActionStatus sUCCESS = ActionStatus.SUCCESS;
       Class class = b.a.getClass();
       String str1 = PatchProxy.applyOneRefs(class, b, uob, "2");
       if (str1 != patchProxyRe) {
       }else if(class.equals(LiveRedPacketContainerItemBaseFragmentV2.class)){
          str1 = "2.0";
       }else {
          str1 = "1.0";
       }
       Object obj = str1;
       c uoc = v14;
       c uoc1 = new c(l, rED_PACKET_C, rED_PACK_POP, str, redPacketTyp, -1, l1, dEFAULT, dEFAULT1, sUCCESS, obj);
       Object obj1 = PatchProxy.apply(objArray, b, uob, "4");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          i = LiveRedPacketContainerPagerAdapter$a.a[b.b(b.a.jh()).ordinal()];
          if (i != 1) {
             i = (i != 2)? 0: a.a(b.a.jh());
          }else {
             i = b.a.ch();
          }
       }
       c uoc2 = uoc.e(i);
       b.h0(LiveLogTag.RED_PACKET, "LiveRedPacketContainerPagerAdapter", uoc2.f());
       d.j(uoc2);
       return;
    }
    public final RedPacketType b(int p0){
       LiveRedPacketContainerPagerAdapter$b uob = LiveRedPacketContainerPagerAdapter$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 13) {
          return RedPacketType.RED_PACKET_TYPE_ACTIVITY;
       }else if(p0 == 12){
          return RedPacketType.RED_PACKET_TYPE_AUDIENCE_GIFT;
       }else if(a.a(p0)){
          return RedPacketType.RED_PACKET_TYPE_CONDITION;
       }else {
          return RedPacketType.RED_PACKET_TYPE_UNKNOWN;
       }
    }
}
