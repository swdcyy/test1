package com.kuaishou.live.core.voiceparty.userlevel.model.a$a;
import lf3.g;
import com.kuaishou.live.core.voiceparty.userlevel.model.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveVoicePartyMicSeatUserLevelUpNotice;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.userlevel.model.MicSeatUserLevelUpService$1$1;
import msd.l;
import lf3.f;

public final class a$a implements g	// class@001ace
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          this.b.b(new MicSeatUserLevelUpService$1$1(p0));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
