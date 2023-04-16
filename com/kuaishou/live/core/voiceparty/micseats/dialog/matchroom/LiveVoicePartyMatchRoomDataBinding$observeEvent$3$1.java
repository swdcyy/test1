package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.LiveVoicePartyMatchRoomDataBinding$observeEvent$3$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import zs2.k;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import zs2.x;
import java.lang.Integer;

public final class LiveVoicePartyMatchRoomDataBinding$observeEvent$3$1 extends Lambda implements a	// class@0015a6
{
    public final k this$0;

    public void LiveVoicePartyMatchRoomDataBinding$observeEvent$3$1(k p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Integer obj = PatchProxy.apply(null, this, LiveVoicePartyMatchRoomDataBinding$observeEvent$3$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.c.v0().getValue();
       boolean b = (obj != null && !obj.intValue())? true: false;
       return b;
    }
}
