package com.kuaishou.live.basic.tk.LiveTkItemManager$createTkItem$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import z51.c;
import java.lang.Object;
import tx4.w;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveTkItemManager$createTkItem$1 extends Lambda implements l	// class@000d1f
{
    public final c $liveTkItem;
    public final l $onSuccess;
    public final LiveTkItemManager this$0;

    public void LiveTkItemManager$createTkItem$1(LiveTkItemManager p0,l p1,c p2){
       this.this$0 = p0;
       this.$onSuccess = p1;
       this.$liveTkItem = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkItemManager$createTkItem$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (this.this$0.a == null) {
          this.$onSuccess.invoke(this.$liveTkItem);
       }
       return;
    }
}
