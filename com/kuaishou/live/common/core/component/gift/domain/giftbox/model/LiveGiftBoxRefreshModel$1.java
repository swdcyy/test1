package com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.model.LiveGiftBoxRefreshModel;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import java.lang.Integer;
import lj1.d;
import lj1.b;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ni1.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class LiveGiftBoxRefreshModel$1 implements Model$a	// class@001204
{
    public final LiveGiftBoxRefreshModel b;

    public void LiveGiftBoxRefreshModel$1(LiveGiftBoxRefreshModel p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxRefreshModel$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxRefreshModel$1.class, "1")) {
       }else {
          a.p(p0, "source");
          p0 = null;
          p1 = (p2 != null)? Integer.valueOf(p2.b()): p0;
          String str = 901;
          if (p1 == null || p1.intValue() != str) {
             str = 907;
             if (p1 == null || p1.intValue() != str) {
                str = 908;
                if (p1 == null || p1.intValue() != str) {
                   str = 0x14849;
                   if (p1 == null || p1.intValue() != str) {
                      str = 0x1484a;
                      if (p1 == null || p1.intValue() != str) {
                         str = 0x1484b;
                         if (p1 == null || p1.intValue() != str) {
                         label_00a7 :
                            return;
                         }
                      }
                   }
                }
             }
          }
          p1 = p2.c();
          if (p1 != null) {
             p1 = p1.b();
             if (p1 != null) {
                p0 = p1.g();
             }
          }
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftRefreshModel][giftSendModel]refresh:"+p0);
          if (p0 != null) {
             this.b.d("[LiveGiftRefreshModel][giftSendModel]", new b(p0, true));
             goto label_00a7 ;
          }else {
             goto label_00a7 ;
          }
       }
    }
}
