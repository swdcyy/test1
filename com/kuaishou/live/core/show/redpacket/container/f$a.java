package com.kuaishou.live.core.show.redpacket.container.f$a;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$e;
import com.kuaishou.live.core.show.redpacket.container.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;

public class f$a implements LiveRedPacketContainerDialogFragment$e	// class@000e73
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.a.r.contains(p0) ^ 0x01);
    }
}
