package com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider;
import java.lang.Object;
import android.util.SparseArray;
import hp2.c;
import msd.a;
import hp2.c$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.CloseReasonProvider$provider$1;

public final class CloseReasonProvider	// class@0013d7
{
    public final SparseArray a;

    public void CloseReasonProvider(){
       super();
       this.a = new SparseArray();
    }
    public static a b(CloseReasonProvider p0,int p1,c p2,int p3,Object p4){
       c$c d = (p3 & 0x02)? c$c.d: null;
       return p0.a(p1, d);
    }
    public final a a(int p0,c p1){
       CloseReasonProvider uCloseReason = CloseReasonProvider.class;
       if (PatchProxy.isSupport(uCloseReason)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uCloseReason, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "defaultReason");
       return new CloseReasonProvider$provider$1(this, p0, p1);
    }
    public final void c(int p0,c p1,a p2){
       if (PatchProxy.isSupport(CloseReasonProvider.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, CloseReasonProvider.class, "1")) {
          return;
       }
       a.p(p1, "reason");
       a.p(p2, "action");
       this.a.put(p0, p1);
       p2.invoke();
       this.a.remove(p0);
       return;
    }
}
