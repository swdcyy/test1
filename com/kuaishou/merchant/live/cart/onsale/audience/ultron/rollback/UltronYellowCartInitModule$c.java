package com.kuaishou.merchant.live.cart.onsale.audience.ultron.rollback.UltronYellowCartInitModule$c;
import j85.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yk0.b;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import wkd.b;
import b24.a;
import java.lang.Boolean;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;

public final class UltronYellowCartInitModule$c implements e	// class@00199c
{
    public static final UltronYellowCartInitModule$c a;

    static {
       UltronYellowCartInitModule$c.a = new UltronYellowCartInitModule$c();
    }
    public void UltronYellowCartInitModule$c(){
       super();
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       b a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UltronYellowCartInitModule$c.class, "1")) {
          return;
       }
       try{
          a = MessageNano.mergeFrom(new b(), p2).a;
          if (a != null) {
             a = a.get("enableMerchantYellowCarUltron");
             if (a != null) {
                b.a(-337650694).c(Boolean.parseBoolean(a));
             }
          }
       }catch(java.lang.Exception e7){
          a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "UltronYellowCartInitModule", "get rollback signal error", e7);
       }
       return;
    }
}
