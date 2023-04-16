package com.kuaishou.live.core.show.conditionredpacket.grab.share.a$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u52.t;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import j62.a;
import z52.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import u52.u;

public class a$a extends m	// class@000aa2
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tc = this.c;
       tc.q.b.d(tc.r, tc.n6());
       u.f(this.c.q.a.a(), 0, "", "SHARE", this.c.r.a);
       return;
    }
}
