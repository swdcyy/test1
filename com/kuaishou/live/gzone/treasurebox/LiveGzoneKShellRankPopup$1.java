package com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankPopup$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankPopup;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGzoneKShellRankPopup$1 implements DefaultLifecycleObserver	// class@001c50
{
    public final LiveGzoneKShellRankPopup b;

    public void LiveGzoneKShellRankPopup$1(LiveGzoneKShellRankPopup p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKShellRankPopup$1.class, "1")) {
          return;
       }
       this.b.l0();
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
