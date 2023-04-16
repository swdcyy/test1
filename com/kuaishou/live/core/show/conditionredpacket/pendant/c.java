package com.kuaishou.live.core.show.conditionredpacket.pendant.c;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l62.h;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e$a;

public final class c implements g	// class@000abf
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "6")) {
       }else {
          tb.V8(p0, new h(tb, p0));
       }
       return;
    }
}
