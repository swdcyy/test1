package com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$f;
import lf3.g;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import oy.a;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.house.live.stat.HouseStatLogger$MessageData;
import com.kuaishou.house.live.stat.HouseStatLogger;
import java.lang.Exception;
import com.kuaishou.live.house.model.HouseLiveExplainMessage;
import com.kuaishou.live.house.model.HouseLiveExplainMessage$a;
import java.util.concurrent.atomic.AtomicReference;
import yg0.a;
import tkd.b;
import tkd.d;
import ju5.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import vg0.b;
import kotlin.jvm.internal.a;
import qrd.p;
import com.kuaishou.house.live.explain.BaseLiveHouseExplainPresenter$mHouseLiveExplainListener$2$a;
import fq5.b;
import vg0.c$a;
import vg0.c;
import lf3.f;

public final class BaseLiveHouseExplainPresenter$f implements g	// class@000780
{
    public final BaseLiveHouseExplainPresenter b;

    public void BaseLiveHouseExplainPresenter$f(BaseLiveHouseExplainPresenter p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       String str3;
       BaseLiveHouseExplainPresenter obj2;
       SCLiveLocalLifeExplainCardSignal signalType;
       String str5;
       Object obj = this;
       HouseLiveExplainMessage obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, BaseLiveHouseExplainPresenter$f.class, "1")) {
       }else {
          BaseLiveHouseExplainPresenter$f b = obj.b;
          Objects.requireNonNull(b);
          SignalMessageData signalMessag = PatchProxy.applyOneRefs(obj1, b, BaseLiveHouseExplainPresenter.class, "29");
          String str = "hide";
          String str1 = "empty";
          String str2 = "show";
          boolean b1 = 2;
          if (signalMessag != PatchProxyResult.class) {
          }else {
             signalMessag = new SignalMessageData();
             signalMessag.mReceiveTimePeriod = b.P.b();
             if (obj1 != null) {
                signalType = obj1.signalType;
                if (signalType != true) {
                   str5 = (signalType != b1)? str: str1;
                }else {
                   str5 = str2;
                }
                signalMessag.mSignalType = str5;
                int i = (signalType != true)? 2: 1;
                signalMessag.mWidgetDataType = i;
                try{
                   str3 = a.a.q(obj1);
                }catch(java.lang.Exception e0){
                   str3 = "";
                }
                signalMessag.mMessageContent = str3;
             }
          }
          obj.b.P.a(signalMessag);
          HouseStatLogger$MessageData messageData = new HouseStatLogger$MessageData();
          BaseLiveHouseExplainPresenter$f b2 = obj.b;
          Objects.requireNonNull(b2);
          if (!PatchProxy.applyVoidTwoRefs(obj1, messageData, b2, BaseLiveHouseExplainPresenter.class, "30")) {
             messageData.receiveTimePeriod = b2.O.calculatePeriodTime();
             if (obj1 != null) {
                signalType = obj1.signalType;
                if (signalType == true) {
                   messageData.signalType = str2;
                }else if(signalType == b1){
                   messageData.signalType = str1;
                }else {
                   messageData.signalType = str;
                }
                try{
                   messageData.messageContent = a.a.q(obj1);
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
             }
          }
          str3 = "dropByData";
          if (obj1 == null || !obj.b.S8()) {
             signalMessag.mActionResult = str3;
          }else {
             obj1 = HouseLiveExplainMessage.Companion.a(obj1);
             if (obj1 != null) {
                if (obj.b.b9(obj1)) {
                   messageData.completeActionTimePeriod = obj.b.O.calculatePeriodTime();
                   signalMessag.mCompleteActionTimePeriod = obj.b.P.b();
                   signalMessag.mActionResult = str3;
                }else {
                   b = obj.b;
                   Objects.requireNonNull(b);
                   if (!PatchProxy.applyVoidOneRefs(obj1, b, BaseLiveHouseExplainPresenter.class, "4")) {
                      b.K.set(obj1);
                   }
                   HouseLiveExplainMessage houseLiveExp = obj.b.V8();
                   if (houseLiveExp != null) {
                      BaseLiveHouseExplainPresenter$f b3 = obj.b;
                      b3.R = true;
                      String str4 = b3.h9(houseLiveExp);
                      str2 = 0;
                      if (!PatchProxy.applyVoidOneRefs(str4, null, a.class, "2") && str4 != null) {
                         str = (str4.length() > 0)? 1: 0;
                         if (!str) {
                            str4 = null;
                         }
                         if (str4 != null) {
                            g og = d.a(0x6ea0c3d0);
                            if (og != null && og.rM(str4)) {
                               og.t9(str4, "TunaButton");
                            }
                         }
                      }
                   label_012d :
                      if (!a.c(houseLiveExp)) {
                         obj.b.W8(houseLiveExp.getMProductId());
                      }
                      b = obj.b;
                      Objects.requireNonNull(b);
                      if (!PatchProxy.applyVoid(null, b, BaseLiveHouseExplainPresenter.class, "21")) {
                         if (b.v != null && a1.i(b.getActivity())) {
                            str2 = 1;
                         }
                         if (str2) {
                            HouseLiveExplainMessage houseLiveExp1 = b.V8();
                            if (houseLiveExp1 != null) {
                               if (a.c(houseLiveExp1)) {
                                  b.Z8();
                               }else if(b.J == null){
                                  b.P.K(true);
                                  b.P.L();
                                  b uob = new b();
                                  b.Q = uob;
                                  BaseLiveHouseExplainPresenter v = b.v;
                                  a.m(v);
                                  Activity activity = b.getActivity();
                                  a.m(activity);
                                  a.o(activity, "activity!!");
                                  obj2 = PatchProxy.apply(null, b, BaseLiveHouseExplainPresenter.class, "5");
                                  if (obj2 == PatchProxyResult.class) {
                                     obj2 = b.T.getValue();
                                  }
                                  uob.d(v, houseLiveExp1, activity, obj2, b.B);
                               }else {
                                  obj2 = b.Q;
                                  if (obj2 != null) {
                                     obj2.c(houseLiveExp1);
                                  }
                               }
                               b.P.I();
                            }
                         }
                      }
                   }
                label_01ba :
                   messageData.completeActionTimePeriod = obj.b.O.calculatePeriodTime();
                   signalMessag.mActionResult = "doAction";
                   signalMessag.mCompleteActionTimePeriod = obj.b.P.b();
                }
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
