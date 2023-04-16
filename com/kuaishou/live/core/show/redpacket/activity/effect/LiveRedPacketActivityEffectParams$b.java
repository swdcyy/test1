package com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams$b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.activity.effect.LiveRedPacketActivityEffectParams$a;

public class LiveRedPacketActivityEffectParams$b	// class@000e58
{
    public String a;
    public long b;
    public int c;
    public boolean d;
    public boolean e;
    public long f;

    public void LiveRedPacketActivityEffectParams$b(){
       super();
       this.e = true;
    }
    public void LiveRedPacketActivityEffectParams$b(String p0,long p1,int p2){
       super();
       this.e = true;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public LiveRedPacketActivityEffectParams a(){
       Object obj = PatchProxy.apply(null, this, LiveRedPacketActivityEffectParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveRedPacketActivityEffectParams(this, null);
    }
    public LiveRedPacketActivityEffectParams$b b(boolean p0){
       this.d = p0;
       return this;
    }
}
