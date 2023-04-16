package com.kuaishou.live.lite.bottombar.i$a$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.bottombar.i$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.bottombar.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.g;

public class i$a$a extends m	// class@001ed3
{
    public final i$a c;

    public void i$a$a(i$a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a$a.class, "1")) {
          return;
       }
       this.c.b.onClick(p0);
       i$a$a tc = this.c;
       g.a(tc, tc.c.m.a(), this.c.c.m.c0());
       return;
    }
}
