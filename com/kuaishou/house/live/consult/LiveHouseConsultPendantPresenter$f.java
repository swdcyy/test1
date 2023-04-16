package com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter$f;
import lf3.g;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.nearby.locallife.live.nano.LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.house.live.stat.HouseStatLogger$MessageData;
import java.util.Objects;
import com.kuaishou.house.live.stat.HouseStatLogger;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import oy.a;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage;
import com.kuaishou.house.live.consult.HouseConsultPendantMessage$a;
import lf3.f;

public final class LiveHouseConsultPendantPresenter$f implements g	// class@000771
{
    public final LiveHouseConsultPendantPresenter b;

    public void LiveHouseConsultPendantPresenter$f(LiveHouseConsultPendantPresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       String str1;
       LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo show;
       LiveHouseConsultPendantPresenter liveHouseCon = LiveHouseConsultPendantPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHouseConsultPendantPresenter$f.class, "1")) {
       }else {
          HouseStatLogger$MessageData messageData = new HouseStatLogger$MessageData();
          LiveHouseConsultPendantPresenter$f tb = this.b;
          Objects.requireNonNull(tb);
          String str = "show";
          if (!PatchProxy.applyVoidTwoRefs(p0, messageData, tb, liveHouseCon, "6")) {
             messageData.receiveTimePeriod = tb.D.calculatePeriodTime();
             if (p0 != null) {
                messageData.signalType = (p0.show == true)? str: "hide";
                try{
                   messageData.messageContent = a.a.q(p0);
                }catch(java.lang.Exception e3){
                   e3.printStackTrace();
                }
             }
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          SignalMessageData signalMessag = PatchProxy.applyOneRefs(p0, tb, liveHouseCon, "5");
          if (signalMessag != PatchProxyResult.class) {
          }else {
             signalMessag = new SignalMessageData();
             signalMessag.mReceiveTimePeriod = tb.E.b();
             if (p0 != null) {
                show = p0.show;
                if (show != true) {
                   str = "hide";
                }
                signalMessag.mSignalType = str;
                int i = (show != true)? 2: 1;
                signalMessag.mWidgetDataType = i;
                try{
                   str1 = a.a.q(p0);
                }catch(java.lang.Exception e0){
                   str1 = "";
                }
                signalMessag.mMessageContent = str1;
             }
          }
          this.b.E.a(signalMessag);
          str1 = "dropByData";
          if (p0 == null) {
             signalMessag.mCompleteActionTimePeriod = this.b.E.b();
             signalMessag.mActionResult = str1;
          }else {
             HouseConsultPendantMessage houseConsult = HouseConsultPendantMessage.Companion.a(p0);
             if (houseConsult != null) {
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(houseConsult, tb, liveHouseCon, "4")) {
                   HouseConsultPendantMessage houseConsult1 = tb.R8();
                   if (houseConsult1 != null) {
                      houseConsult.setMSubtitleDisplayType(houseConsult1.getMSubtitleDisplayType());
                      houseConsult.setMUnreservedSpecialText(houseConsult1.getMUnreservedSpecialText());
                      houseConsult.setMReservedSpecialText(houseConsult1.getMReservedSpecialText());
                      houseConsult.setMTextType(houseConsult1.getMTextType());
                   }
                   tb.a9(houseConsult);
                }
                houseConsult = this.b.R8();
                if (houseConsult != null) {
                   houseConsult.setMReservedStatus(this.b.v);
                   LiveHouseConsultPendantPresenter$f tb1 = this.b;
                   if (tb1.z == null && tb1.y == null) {
                      tb1.Z8();
                   }else {
                      tb1.P8();
                   }
                   tb1 = this.b;
                   tb1.z = true;
                   messageData.completeActionTimePeriod = tb1.D.calculatePeriodTime();
                   signalMessag.mCompleteActionTimePeriod = this.b.E.b();
                   signalMessag.mActionResult = "doAction";
                }
             }else {
                signalMessag.mCompleteActionTimePeriod = this.b.E.b();
                signalMessag.mActionResult = str1;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
