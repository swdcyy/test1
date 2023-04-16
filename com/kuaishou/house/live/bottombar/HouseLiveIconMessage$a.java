package com.kuaishou.house.live.bottombar.HouseLiveIconMessage$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState;
import com.kuaishou.house.live.bottombar.HouseLiveIconMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.house.live.bottombar.MessageButton;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import qrd.l1;

public final class HouseLiveIconMessage$a	// class@000762
{

    public void HouseLiveIconMessage$a(){
       super();
    }
    public void HouseLiveIconMessage$a(u p0){
       super();
    }
    public final HouseLiveIconMessage a(LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState p0){
       HouseLiveIconMessage obj = PatchProxy.applyOneRefs(p0, this, HouseLiveIconMessage$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "message");
       obj = new HouseLiveIconMessage();
       if (p0.activeButton != null) {
          MessageButton messageButto = new MessageButton();
          messageButto.setButtonType(p0.activeButton.buttonType);
          LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button name = p0.activeButton.name;
          a.o(name, "message.activeButton.name");
          messageButto.setName(name);
          name = p0.activeButton.link;
          a.o(name, "message.activeButton.link");
          messageButto.setLink(name);
          name = p0.activeButton.desc;
          a.o(name, "message.activeButton.desc");
          messageButto.setDesc(name);
          HouseLiveIconMessage$a companion = HouseLiveIconMessage.Companion;
          messageButto.setIcon(companion.b(p0.activeButton.icon));
          messageButto.setIconV2(companion.b(p0.activeButton.iconV2));
          obj.setActiveButton(messageButto);
       }
       obj.setSignalType(p0.signalType);
       obj.setLiteSignalType(p0.liteSignalType);
       LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState ksOrderId = p0.ksOrderId;
       a.o(ksOrderId, "message.ksOrderId");
       obj.setKsOrderId(ksOrderId);
       ksOrderId = p0.actionUrl;
       a.o(ksOrderId, "message.actionUrl");
       obj.setActionUrl(ksOrderId);
       obj.setSupportType(p0.supportType);
       ksOrderId = p0.statisticsInfo;
       a.o(ksOrderId, "message.statisticsInfo");
       obj.setStatisticsInfo(ksOrderId);
       obj.setDynamicIcon(p0.isDynamicIcon);
       obj.setLoopCount(p0.loopCount);
       ksOrderId = p0.lottieUrl;
       a.o(ksOrderId, "message.lottieUrl");
       obj.setLottieUrl(ksOrderId);
       obj.setServerTime(p0.serverTime);
       obj.setMInfoSource(0);
       return obj;
    }
    public final CDNUrl[] b(UserInfos$PicUrl[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HouseLiveIconMessage$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 != null) {
          int i1 = 0;
          int i2 = 1;
          int i3 = (!p0.length)? 1: 0;
          if (!(i3 ^ i2)) {
             int i4 = i;
          }
          if (p0) {
             i = p0.length;
             CDNUrl[] uCDNUrlArray = new CDNUrl[i];
             for (i2 = 0; i2 < i; i2 = i2 + 1) {
                uCDNUrlArray[i2] = new CDNUrl();
             }
             i = p0.length;
             for (; i1 < i; i1 = i1 + 1) {
                object oobject = p0[i1];
                uCDNUrlArray[i1] = new CDNUrl(oobject.cdn, oobject.url, oobject.ip, oobject.urlPattern);
             }
             return uCDNUrlArray;
          }
       }
       return i;
    }
}
