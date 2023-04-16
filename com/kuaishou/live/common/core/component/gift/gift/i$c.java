package com.kuaishou.live.common.core.component.gift.gift.i$c;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftTitleChangeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bm1.b;
import lf3.f;

public class i$c implements g	// class@0012a6
{
    public final i b;

    public void i$c(i p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$c.class, "1")) {
       }else {
          this.b.D.e(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
