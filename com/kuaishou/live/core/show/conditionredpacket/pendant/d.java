package com.kuaishou.live.core.show.conditionredpacket.pendant.d;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.conditionredpacket.pendant.b;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e$a;

public final class d implements g	// class@000ac0
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "7")) {
       }else {
          tb.V8(p0, new b(tb));
       }
       return;
    }
}
