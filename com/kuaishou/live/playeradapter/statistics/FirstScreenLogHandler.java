package com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler;
import com.kwai.video.waynelive.LivePlayerController;
import tj3.s;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler$a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.playeradapter.statistics.FirstScreenLogHandler$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class FirstScreenLogHandler	// class@000d5b
{
    public final LivePlayerRenderListener a;
    public AtomicBoolean b;
    public final LivePlayerController c;
    public final s d;

    public void FirstScreenLogHandler(LivePlayerController p0,s p1,LifecycleOwner p2){
       a.p(p0, "playerController");
       a.p(p1, "logProxy");
       a.p(p2, "lifecycleOwner");
       super();
       this.c = p0;
       this.d = p1;
       FirstScreenLogHandler$a uoa = new FirstScreenLogHandler$a(this);
       this.a = uoa;
       p2.getLifecycle().addObserver(new FirstScreenLogHandler$1(this));
       p0.addRenderListener(uoa);
       this.b = new AtomicBoolean();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, FirstScreenLogHandler.class, "2")) {
          return;
       }
       if (this.b.get()) {
          return;
       }
       this.d.a();
       this.b.set(true);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, FirstScreenLogHandler.class, "1")) {
          return;
       }
       this.a();
       return;
    }
}
