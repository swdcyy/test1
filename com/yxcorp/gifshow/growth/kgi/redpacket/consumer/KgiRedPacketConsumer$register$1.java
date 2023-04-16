package com.yxcorp.gifshow.growth.kgi.redpacket.consumer.KgiRedPacketConsumer$register$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ooa.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import p76.g;
import java.lang.Boolean;
import y76.b;
import loa.b;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfig;
import java.util.ArrayList;
import p76.a;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import noa.a;
import yb6.d;
import com.yxcorp.gifshow.growth.kgi.redpacket.consumer.KgiRedPacketConsumer$register$1$a;
import xma.a;
import xma.h;
import java.lang.StringBuilder;

public final class KgiRedPacketConsumer$register$1 extends Lambda implements l	// class@0013f6
{
    public static final KgiRedPacketConsumer$register$1 INSTANCE;

    static {
       KgiRedPacketConsumer$register$1.INSTANCE = new KgiRedPacketConsumer$register$1();
    }
    public void KgiRedPacketConsumer$register$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       int b;
       String id;
       if (PatchProxy.applyVoidOneRefs(p0, this, KgiRedPacketConsumer$register$1.class, "1")) {
          return;
       }
       a.p(p0, "event");
       p0.b("trigger");
       String str = "trigger_fail";
       if (!p0.c.booleanValue()) {
          b.e("Consumer#showKgiRedPacketDialog: TRIGGER_FAIL engineResult = false", false, 2, null);
          p0.b(str);
          return;
       }else if(b.c()){
          b.e("Consumer#showKgiRedPacketDialog: TRIGGER_FAIL is collect data", false, 2, null);
          return;
       }else {
          a obj = PatchProxy.apply(null, null, KgiCloudRpManager.class, "2");
          String str1 = 1;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             ConcurrentHashMap c1 = KgiCloudRpManager.c;
             QCurrentUser mE = QCurrentUser.ME;
             if (mE != null) {
                id = mE.getId();
                if (id != null) {
                label_005e :
                   KgiCloudRpConfig kgiCloudRpCo = c1.get(id);
                   if (kgiCloudRpCo != null) {
                      kgiCloudRpCo = kgiCloudRpCo.popupItems;
                      if (kgiCloudRpCo != null) {
                         b = kgiCloudRpCo.size();
                      label_0070 :
                         if (b > 0) {
                            b = true;
                         }else {
                            b = false;
                         }
                      }
                   }
                   b = 0;
                   goto label_0070 ;
                }
             }
             id = "";
             goto label_005e ;
          }
          if (b) {
             b.e("Consumer#showKgiRedPacketDialog: TRIGGER_FAIL is cloud model", false, 2, null);
             return;
          }else {
             obj = p0.d;
             if (obj == null) {
                b.e("Consumer#showKgiRedPacketDialog: TRIGGER_FAIL response = null", false, 2, null);
                p0.b(str);
                return;
             }else {
                a c = a.c;
                if (a.a(c) || (d.a() - a.b) - 0xea60 < 0) {
                   b.e("Consumer#showKgiRedPacketDialog: TRIGGER_FAIL mIsDialogShowing = "+a.a(c)+" or interval < 60s", false, 2, null);
                   p0.b(str);
                   return;
                }else {
                   b.e("Consumer#showKgiRedPacketDialog: --> ", false, 2, null);
                   a.b(c, str1);
                   h.c(obj, new KgiRedPacketConsumer$register$1$a(p0, obj));
                   return;
                }
             }
          }
       }
    }
}
