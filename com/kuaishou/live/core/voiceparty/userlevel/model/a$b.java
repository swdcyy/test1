package com.kuaishou.live.core.voiceparty.userlevel.model.a$b;
import lf3.g;
import com.kuaishou.live.core.voiceparty.userlevel.model.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.userlevel.model.MicSeatUserLevelUpService$2$1;
import msd.l;
import lf3.f;

public final class a$b implements g	// class@001acf
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          this.b.b(new MicSeatUserLevelUpService$2$1(p0));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
