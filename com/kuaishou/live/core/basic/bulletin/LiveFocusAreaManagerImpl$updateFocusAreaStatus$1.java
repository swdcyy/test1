package com.kuaishou.live.core.basic.bulletin.LiveFocusAreaManagerImpl$updateFocusAreaStatus$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.basic.bulletin.LiveFocusAreaManagerImpl;
import java.lang.Object;
import android.graphics.Rect;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import i81.f$a$c;
import android.view.View;
import p02.x;
import mrd.a;

public final class LiveFocusAreaManagerImpl$updateFocusAreaStatus$1 extends Lambda implements l	// class@000827
{
    public final LiveFocusAreaManagerImpl this$0;

    public void LiveFocusAreaManagerImpl$updateFocusAreaStatus$1(LiveFocusAreaManagerImpl p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Rect p0){
       LiveFocusAreaManagerImpl a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFocusAreaManagerImpl$updateFocusAreaStatus$1.class, "1")) {
          return;
       }
       a.p(p0, "rect");
       LiveFocusAreaManagerImpl$updateFocusAreaStatus$1 tthis$0 = this.this$0;
       a = tthis$0.a;
       LiveFocusAreaManagerImpl b = tthis$0.b;
       if (b == null) {
          a.S("rootView");
       }
       a.onNext(new f$a$c(x.b(p0, b)));
       return;
    }
}
