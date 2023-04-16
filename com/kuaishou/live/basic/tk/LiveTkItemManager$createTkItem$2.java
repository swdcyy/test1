package com.kuaishou.live.basic.tk.LiveTkItemManager$createTkItem$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveTkItemManager$createTkItem$2 extends Lambda implements l	// class@000d20
{
    public final l $onFailure;
    public final LiveTkItemManager this$0;

    public void LiveTkItemManager$createTkItem$2(LiveTkItemManager p0,l p1){
       this.this$0 = p0;
       this.$onFailure = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkItemManager$createTkItem$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (this.this$0.a == null) {
          this.$onFailure.invoke(p0);
       }
       return;
    }
}
