package com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider$provider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider;
import hp2.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.SparseArray;

public final class CloseReasonProvider$provider$1 extends Lambda implements a	// class@0013d6
{
    public final c $defaultReason;
    public final int $index;
    public final CloseReasonProvider this$0;

    public void CloseReasonProvider$provider$1(CloseReasonProvider p0,int p1,c p2){
       this.this$0 = p0;
       this.$index = p1;
       this.$defaultReason = p2;
       super(0);
    }
    public final c invoke(){
       c obj = PatchProxy.apply(null, this, CloseReasonProvider$provider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.a.get(this.$index);
       if (obj == null) {
          CloseReasonProvider$provider$1 t$defaultRea = this.$defaultReason;
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
