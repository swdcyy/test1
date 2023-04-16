package com.kwai.live.gzone.guess.kshell.k;
import java.lang.String;
import hf3.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCBetChanged;
import p57.a;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCBetClosed;
import p57.b;

public class k	// class@000d4a
{
    public k$a a;
    public long b;

    public void k(String p0,a p1){
       k ok = k.class;
       super();
       this.b = -1;
       if (PatchProxy.applyVoidOneRefs(p1, this, ok, "1")) {
       }else {
          p1.u0(441, LiveStreamMessages$SCBetChanged.class, new a(this));
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, ok, "2")) {
          p1.u0(442, LiveStreamMessages$SCBetClosed.class, new b(this));
       }
       return;
    }
}
