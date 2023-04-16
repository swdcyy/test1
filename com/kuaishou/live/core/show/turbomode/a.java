package com.kuaishou.live.core.show.turbomode.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl;

public final class a implements Runnable	// class@001229
{
    public final LiveTurboModeServiceImpl$b b;

    public void a(LiveTurboModeServiceImpl$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.a.Uo();
       return;
    }
}
