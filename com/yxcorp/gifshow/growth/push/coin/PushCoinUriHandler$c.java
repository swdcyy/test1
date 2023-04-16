package com.yxcorp.gifshow.growth.push.coin.PushCoinUriHandler$c;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.push.coin.PushCoinResponse;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.growth.push.coin.PushCoinResponse$Companion$Data;
import java.lang.CharSequence;
import zsd.u;
import e17.i$b;
import e17.i;
import com.yxcorp.gifshow.growth.push.coin.a;
import e17.i$e;

public final class PushCoinUriHandler$c implements g	// class@001499
{
    public static final PushCoinUriHandler$c b;

    static {
       PushCoinUriHandler$c.b = new PushCoinUriHandler$c();
    }
    public void PushCoinUriHandler$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushCoinUriHandler$c.class, "1")) {
       }else if(p0 != null){
          p0 = p0.a();
          if (p0 != null) {
             Object[] objArray = new Object[0];
             w.C().y("PushCoinUriHandler", "#handleInternal : response = "+p0, objArray);
             p0 = p0.data;
             if (p0 != null) {
                PushCoinResponse$Companion$Data showIcon = p0.showIcon;
                p0 = p0.toast;
                if (!(u.S1(p0) ^ 0x01)) {
                   p0 = null;
                }
                if (p0 != null) {
                   if (showIcon != null) {
                      i$b uob = i.m();
                      uob.s(R.layout.arg_RES_7f0d0565);
                      uob.A(a.a);
                      uob.y(p0);
                      i.z(uob);
                   }else {
                      i.d(R.style.arg_RES_7f11066a, p0);
                   }
                }
             }
          }
       }
       return;
    }
}
