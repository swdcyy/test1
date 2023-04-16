package com.kuaishou.live.ad.social.o;
import lf3.g;
import com.kuaishou.live.ad.social.r;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zl0.s0;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonActionSignal;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import cm0.e;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionFeed;
import zl0.h0;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import z1.a;
import km9.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class o implements g	// class@000a1b
{
    public final r b;

    public void o(r p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       SCActionSignal commerceComm = p0.commerceCommonFeed;
       if (commerceComm != null && commerceComm.length > 0) {
          int len = commerceComm.length;
          int i = 0;
          while (i < len) {
             object oobject = commerceComm[i];
             if (!PatchProxy.applyVoidOneRefs(oobject, tb, r.class, "15") && tb.g.G2()) {
                LiveExtraMessages$LiveCommonActionSignal action = oobject.action;
                if (action != null) {
                   String str = "COMMERCE_LiveAdSocialConversionFeed";
                   if (str.equals(action.payloadType)) {
                      LiveAdSocialMessages$LiveAdSocialConversionFeed liveAdSocial = e.b(str, oobject.action);
                      LiveAdSocialMessages$LiveAdSocialConversionFeed conversionTa = liveAdSocial.conversionTask;
                      boolean b = true;
                      if (conversionTa == null || liveAdSocial.normalMsg == null) {
                         LiveLogTag aD = LiveLogTag.AD;
                         boolean b1 = (conversionTa == null)? true: false;
                         Boolean uBoolean = Boolean.valueOf(b1);
                         if (liveAdSocial.normalMsg != null) {
                            b = false;
                         }
                         b.J(aD, "LiveAdSocialConversionFeed is invalidate", ImmutableMap.of("taskIsNull", uBoolean, "normalMsgIsNull", Boolean.valueOf(b)));
                      }else {
                         tb.i.um(conversionTa, b, b, new h0(tb, conversionTa, liveAdSocial));
                      }
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
