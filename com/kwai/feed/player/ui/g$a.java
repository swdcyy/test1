package com.kwai.feed.player.ui.g$a;
import com.kwai.feed.player.ui.e;
import com.kwai.feed.player.ui.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public class g$a extends e	// class@0014bf
{
    public final g d;

    public void g$a(g p0,View p1){
       this.d = p0;
       super(p1);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       Log.g("SpeedSwitchPanel", "on exit end");
       this.d.a.setVisibility(8);
       this.d.a();
       this.d.d();
       return;
    }
}
