package com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt;
import lk2.c;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt$a;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.StickerhelperKt$bind$1;
import fk2.b;
import androidx.lifecycle.LifecycleObserver;

public final class StickerhelperKt	// class@00189e
{

    public static final void a(c p0,View p1,LifecycleOwner p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, StickerhelperKt.class, "1")) {
          return;
       }
       a.p(p0, "$this$bind");
       a.p(p1, "view");
       a.p(p2, "lifecycleOwner");
       p2.getLifecycle().addObserver(new StickerhelperKt$bind$1(p0, new StickerhelperKt$a(p1)));
       return;
    }
}
