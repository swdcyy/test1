package com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt$bind$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import lk2.c;
import fk2.b;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import n2.a;

public final class StickerhelperKt$bind$1 implements DefaultLifecycleObserver	// class@00189d
{
    public final c b;
    public final b c;

    public void StickerhelperKt$bind$1(c p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerhelperKt$bind$1.class, "1")) {
          return;
       }
       a.p(p0, "owner");
       this.b.d(this.c);
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerhelperKt$bind$1.class, "2")) {
          return;
       }
       a.p(p0, "owner");
       this.b.b(this.c);
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
