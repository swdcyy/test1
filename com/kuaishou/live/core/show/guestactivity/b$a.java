package com.kuaishou.live.core.show.guestactivity.b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.guestactivity.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kwai.framework.model.user.UserInfo;
import n92.c;
import n92.j;
import com.kuaishou.live.core.show.guestactivity.b$b;

public class b$a extends m	// class@000bcf
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       c.c(this.c.r.Z2.a(), null, "MORE_ANCHORS");
       b$a tc = this.c;
       b s = tc.s;
       if (s != null) {
          s.a(tc.q.a);
       }
       return;
    }
}
