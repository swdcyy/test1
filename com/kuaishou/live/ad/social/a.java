package com.kuaishou.live.ad.social.a;
import lf3.g;
import com.kuaishou.live.ad.social.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$SCLiveCommonStateSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import cm0.e;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import zl0.c;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import z1.a;
import km9.a;
import lf3.f;

public final class a implements g	// class@000a07
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       LiveExtraMessages$SCLiveCommonStateSignal state = p0.state;
       if (state == null) {
       }else if(PatchProxy.applyVoidOneRefs(state, tb, b.class, "8")){
          String str = "COMMERCE_LiveAdSocialConversionState";
          if (str.equals(state.payloadType)) {
             tb.v.um(e.b(str, state).conversionTask, false, true, new c(tb));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
