package com.kuaishou.live.common.core.component.specialtag.LiveSpecialTagController$addItem$2$item$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vx1.f;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import vx1.c;
import android.app.Application;
import o56.a;
import android.content.Context;
import vq5.d;

public final class LiveSpecialTagController$addItem$2$item$1 extends Lambda implements l	// class@001778
{
    public final f this$0;

    public void LiveSpecialTagController$addItem$2$item$1(f p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSpecialTagController$addItem$2$item$1.class, "1")) {
          return;
       }
       a.p(p0, "router");
       if (!TextUtils.isEmpty(p0)) {
          c h = this.this$0.b.h;
          if (h != null) {
             h.r4(p0, a.b());
          }
       }
       return;
    }
}
