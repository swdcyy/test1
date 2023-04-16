package com.kuaishou.live.playeradapter.statistics.ClickPreCreatePlayerOptFirstScreenLogHandler;
import com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler;
import com.kwai.video.waynelive.LivePlayerController;
import tj3.s;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.playeradapter.statistics.ClickPreCreatePlayerOptFirstScreenLogHandler$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class ClickPreCreatePlayerOptFirstScreenLogHandler extends FirstScreenLogHandler	// class@000d58
{
    public boolean e;
    public boolean f;

    public void ClickPreCreatePlayerOptFirstScreenLogHandler(LivePlayerController p0,s p1,LifecycleOwner p2){
       a.p(p0, "playerController");
       a.p(p1, "logProxy");
       a.p(p2, "lifecycleOwner");
       super(p0, p1, p2);
       p2.getLifecycle().addObserver(new ClickPreCreatePlayerOptFirstScreenLogHandler$1(this));
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, ClickPreCreatePlayerOptFirstScreenLogHandler.class, "1")) {
          return;
       }
       this.f = true;
       this.c();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, ClickPreCreatePlayerOptFirstScreenLogHandler.class, "2")) {
          return;
       }
       if (this.e != null && this.f != null) {
          this.a();
       }
       return;
    }
}
