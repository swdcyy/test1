package com.kwai.live.gzone.turntable.presenters.j;
import sfc.a;
import com.kwai.live.gzone.turntable.presenters.f;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.util.Log;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;

public class j extends a	// class@000e6b
{
    public final f c;

    public void j(f p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.b(p0);
       j tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, f.class, "16")) {
          String[] stringArray = new String[]{"throwable",Log.getStackTraceString(p0)};
          LiveGzoneTurntableLogger.f("onPrizeLoadFailed", stringArray);
       }
       return;
    }
}
