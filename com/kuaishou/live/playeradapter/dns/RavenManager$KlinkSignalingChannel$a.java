package com.kuaishou.live.playeradapter.dns.RavenManager$KlinkSignalingChannel$a;
import j85.e;
import com.kuaishou.live.playeradapter.dns.RavenManager$KlinkSignalingChannel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.raven.c$a;

public class RavenManager$KlinkSignalingChannel$a implements e	// class@000d49
{
    public final RavenManager$KlinkSignalingChannel a;

    public void RavenManager$KlinkSignalingChannel$a(RavenManager$KlinkSignalingChannel p0){
       this.a = p0;
       super();
    }
    public void onSignalReceive(String p0,String p1,byte[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RavenManager$KlinkSignalingChannel$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2.length)};
       String.format("onSignalReceive: %s, %s, %d", objArray);
       RavenManager$KlinkSignalingChannel c = this.a.c;
       if (c != null) {
          c.a(p2);
       }
       return;
    }
}
