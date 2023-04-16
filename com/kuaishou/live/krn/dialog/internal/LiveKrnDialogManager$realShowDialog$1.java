package com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$realShowDialog$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager;
import android.net.Uri;
import o63.d;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.WeakHashMap;

public final class LiveKrnDialogManager$realShowDialog$1 implements DefaultLifecycleObserver	// class@001d5b
{
    public final LiveKrnDialogManager b;
    public final Uri c;
    public final d d;

    public void LiveKrnDialogManager$realShowDialog$1(LiveKrnDialogManager p0,Uri p1,d p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnDialogManager$realShowDialog$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       LiveKrnDialogManager.G(this.b, "dialog.onDestroy", this.c, null, 4, null);
       this.b.c.remove(this.d);
       this.b.y0();
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
