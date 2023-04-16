package com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.render.LiveMultiPkRenderController;
import java.lang.Object;
import eu1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import zs1.b;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import eu1.a;

public final class LiveMultiPkRenderController$a implements Observer	// class@00166c
{
    public final LiveMultiPkRenderController b;

    public void LiveMultiPkRenderController$a(LiveMultiPkRenderController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkRenderController$a.class, "1")) {
       }else {
          LiveMultiPkRenderController$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiPkRenderController.class, "10")) {
             b.c0(LiveCommonLogTag.MULTI_PK, "render style change "+p0, "logParam", tb.r.p());
             LiveMultiPkRenderController l = tb.l;
             if (l == null) {
                a.S("layoutDataModel");
             }
             l.e = p0;
             tb.X2();
          }
       }
       return;
    }
}
