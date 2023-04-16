package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager$e;
import hga.a;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowManager;
import java.lang.String;
import hga.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;

public class LiveFloatingWindowManager$e extends a	// class@000b65
{
    public final LiveFloatingWindowManager b;

    public void LiveFloatingWindowManager$e(LiveFloatingWindowManager p0){
       this.b = p0;
       super();
    }
    public b a(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveFloatingWindowManager$e.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new b("LVIE", false, "");
    }
    public b b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFloatingWindowManager$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.equals("LVIE", p0)) {
          this.b.c(LiveFloatingWindowCloseType.EXTERNAL_CLOSE);
       }
       return new b("LVIE", false, "");
    }
    public int c(){
       return 0;
    }
}
