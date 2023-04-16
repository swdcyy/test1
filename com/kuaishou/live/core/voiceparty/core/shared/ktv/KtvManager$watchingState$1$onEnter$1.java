package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$watchingState$1$onEnter$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$q;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchComplete;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;

public final class KtvManager$watchingState$1$onEnter$1 extends Lambda implements l	// class@001440
{
    public final KtvManager$q this$0;

    public void KtvManager$watchingState$1$onEnter$1(KtvManager$q p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(KtvManager$watchingState$1$onEnter$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KtvManager$watchingState$1$onEnter$1.class, "1")) {
          return;
       }
       this.this$0.g.r(new KtvManager$KtvWatchComplete());
       return;
    }
}
