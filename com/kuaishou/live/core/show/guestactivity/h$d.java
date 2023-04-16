package com.kuaishou.live.core.show.guestactivity.h$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.guestactivity.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import n92.c;

public class h$d extends m	// class@000bda
{
    public final h c;

    public void h$d(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       c.d(this.c.T.Z2.a(), false, false);
       this.c.c9();
       return;
    }
}
