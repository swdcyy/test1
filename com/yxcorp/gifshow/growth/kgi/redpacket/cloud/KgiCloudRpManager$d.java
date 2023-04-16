package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$d;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb6.d;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$requestDialog$1$1$2;
import java.util.Objects;
import java.lang.StringBuilder;
import y76.b;
import msd.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfig;
import moa.c;
import xma.a;
import xma.h;
import loa.h;

public final class KgiCloudRpManager$d implements g	// class@0013ed
{
    public final long b;
    public final int c;

    public void KgiCloudRpManager$d(long p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       KgiCloudRpManager$d uod;
       KgiCloudRpManager$d b;
       KgiRedPacketServerResponse kgiRedPacket1;
       String id;
       KgiCloudRpConfig launchPopupM;
       Object obj = this;
       KgiRedPacketServerResponse obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, KgiCloudRpManager$d.class, "1")) {
       }else {
          long l = d.a();
          if (obj1 != null) {
             KgiRedPacketServerResponse kgiRedPacket = obj1.a();
             if (kgiRedPacket != null) {
                kgiRedPacket = kgiRedPacket.dialog;
                if (kgiRedPacket != null) {
                   kgiRedPacket.timeReturnTrue = obj.b;
                   kgiRedPacket.timeRequestComplete = l;
                   kgiRedPacket.requestEventType = obj.c;
                   Integer integer = Integer.valueOf(kgiRedPacket.remainTimeOfSeconds);
                   uod = null;
                   String str = 1;
                   KgiCloudRpManager$requestDialog$1$1$2 orequestDial = (integer.intValue() >= 0)? 1: null;
                   if (!orequestDial) {
                      integer = null;
                   }
                   int i = (integer != null)? integer.intValue(): 5;
                   kgiRedPacket.remainTimeOfSeconds = i;
                   KgiCloudRpManager k = KgiCloudRpManager.k;
                   orequestDial = KgiCloudRpManager$requestDialog$1$1$2.INSTANCE;
                   Objects.requireNonNull(k);
                   if (!PatchProxy.applyVoidTwoRefs(kgiRedPacket, orequestDial, k, KgiCloudRpManager.class, "19")) {
                      if (KgiCloudRpManager.g) {
                         b.e("KgiCloudRp#tryShowWindow: TRIGGER_FAIL mIsDialogShowing = "+KgiCloudRpManager.g, uod, 2, null);
                         orequestDial.invoke();
                      }else {
                         QCurrentUser mE = QCurrentUser.ME;
                         if (mE != null) {
                            id = mE.getId();
                            if (id != null) {
                            label_008e :
                               KgiCloudRpConfig kgiCloudRpCo = KgiCloudRpManager.c.get(id);
                               KgiCloudRpConfig popupInterva = (kgiCloudRpCo != null)? kgiCloudRpCo.popupIntervalSeconds: 60;
                               long l1 = (long)popupInterva * 1000;
                               if ((k.e() - KgiCloudRpManager.h) - l1 < 0) {
                                  b.e("KgiCloudRp#tryShowWindow: TRIGGER_FAIL interval < "+l1+" ms", uod, 2, null);
                                  orequestDial.invoke();
                               }else if(kgiCloudRpCo != null){
                                  launchPopupM = kgiCloudRpCo.launchPopupMaxTimes;
                               }else {
                                  launchPopupM = 1;
                               }
                               if (KgiCloudRpManager.f >= launchPopupM) {
                                  b.e("KgiCloudRp#tryShowWindow: TRIGGER_FAIL showTimes\("+KgiCloudRpManager.f+"\) >= maxTimes\("+launchPopupM+')', uod, 2, null);
                                  orequestDial.invoke();
                               }else {
                                  b.e("KgiCloudRp#tryShowWindow: --> ", uod, 2, null);
                                  KgiCloudRpManager.g = str;
                                  h.c(kgiRedPacket, new c(orequestDial, kgiRedPacket, id));
                               }
                            }
                         }
                         id = "";
                         goto label_008e ;
                      }
                   }
                }
             }
          }
          b = obj.b;
          uod = obj.c;
          if (obj1 != null) {
             obj1 = obj1.a();
             if (obj1 != null) {
                kgiRedPacket1 = obj1.dialog;
             label_011f :
                h.e(true, b, l, uod, kgiRedPacket1);
             }
          }
          kgiRedPacket1 = null;
          goto label_011f ;
       }
       return;
    }
}
