package com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager$giftSendObserver$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import lj1.d;
import lj1.b;
import lj1.c;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import z1.k;
import ad5.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import zg1.g;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import xp5.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import sj1.b;
import jm1.a;
import java.util.Objects;
import java.lang.Long;
import rw1.i$a;
import java.util.Map;
import rw1.i;
import android.app.Activity;
import rw1.a;
import com.kuaishou.live.common.core.component.recharge.d;
import lnc.a1;
import rm1.l;
import java.lang.CharSequence;
import e17.i;

public final class LiveGiftRechargeManager$giftSendObserver$1 implements Model$a	// class@001258
{
    public final LiveGiftRechargeManager b;

    public void LiveGiftRechargeManager$giftSendObserver$1(LiveGiftRechargeManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftRechargeManager$giftSendObserver$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       int i;
       int this;
       int i1;
       LiveGiftRechargeManager$giftSendObserver$1 b;
       i$a uoa;
       i oi;
       String str1;
       LiveGiftRechargeManager$giftSendObserver$1 ogiftSendObs = this;
       f uof = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, uof, this, LiveGiftRechargeManager$giftSendObserver$1.class, "1")) {
       }else {
          a.p(p0, "source");
          if (uof && uof.b() == 0x1870a) {
             d uod = uof.c();
             if (uod != null) {
                b uob = uod.b();
                if (uob != null) {
                   i = uob.a();
                label_0042 :
                   d uod1 = uof.c();
                   this = 0;
                   if (uod1 != null) {
                      b uob1 = uod1.b();
                      if (uob1 != null) {
                         c uoc = uob1.i();
                         if (uoc != null) {
                            List list = uoc.b();
                            if (list != null) {
                               i1 = list.size();
                            label_0063 :
                               int i2 = i * i1;
                               d uod2 = uof.c();
                               if (uod2 != null) {
                                  b uob2 = uod2.b();
                                  if (uob2 != null) {
                                     Gift gift = uob2.d();
                                     if (gift != null) {
                                        gift = gift.mPrice;
                                     label_007d :
                                        FragmentActivity obj = ogiftSendObs.b.f.get();
                                        a.o(obj, "paymentManager.get\(\)");
                                        long l = (long)(i2 * gift) - obj.q();
                                        if (l - null <= 0) {
                                           b.e0(LiveGiftTag.RECHARGE, "参数值不合法", "batchCount", Integer.valueOf(i), "receiverCount", Integer.valueOf(i1), "giftPrice", Integer.valueOf(gift));
                                        }else {
                                           b = ogiftSendObs.b;
                                           uod1 = uof.c();
                                           if (uod1 != null) {
                                              uob1 = uod1.b();
                                              if (uob1 != null) {
                                                 uob1 = uob1.j;
                                                 if (uob1 != null) {
                                                 label_00cc :
                                                    obj = ogiftSendObs.b.d.a().getActivity();
                                                    String liveStreamId = ogiftSendObs.b.c.getLiveStreamId();
                                                    String str = ogiftSendObs.b.c.d();
                                                    String expTag = ogiftSendObs.b.c.getExpTag();
                                                    ClientContent$LiveStreamPackage liveStreamPa = ogiftSendObs.b.b.a();
                                                    a.o(liveStreamPa, "logPackageProvider.liveStreamPackage");
                                                    b uob3 = new b(uof, ogiftSendObs.b.e);
                                                    Objects.requireNonNull(b);
                                                    if (PatchProxy.isSupport(LiveGiftRechargeManager.class)) {
                                                       Object[] objArray = new Object[9];
                                                       objArray[this] = Integer.valueOf(this);
                                                       objArray[1] = uob1;
                                                       objArray[2] = Long.valueOf(l);
                                                       objArray[3] = obj;
                                                       objArray[4] = liveStreamId;
                                                       objArray[5] = str;
                                                       objArray[6] = expTag;
                                                       objArray[7] = liveStreamPa;
                                                       objArray[8] = uob3;
                                                       if (!PatchProxy.applyVoid(objArray, b, LiveGiftRechargeManager.class, "2")) {
                                                       }
                                                    }else {
                                                    }
                                                 }
                                              }
                                           }
                                           String str2 = "";
                                           goto label_00cc ;
                                        }
                                     }
                                  }
                               }
                               int i3 = 0;
                               goto label_007d ;
                            }
                         }
                      }
                   }
                   i1 = 0;
                   goto label_0063 ;
                }
             }
             i = 1;
             goto label_0042 ;
          }
       }
    label_018c :
       return;
    }
}
