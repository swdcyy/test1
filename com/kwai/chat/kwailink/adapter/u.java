package com.kwai.chat.kwailink.adapter.u;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.chat.kwailink.adapter.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.chat.kwailink.adapter.o;
import android.os.RemoteCallbackList;
import com.kwai.chat.kwailink.adapter.p$b;
import l75.d;
import com.kwai.chat.kwailink.adapter.p$a;

public final class u implements Runnable	// class@000a19
{
    public final long b;

    public void u(long p0){
       this.b = p0;
    }
    public final void run(){
       u tb = this.b;
       p op = p.class;
       if (PatchProxy.isSupport(op) && (!PatchProxy.applyVoidOneRefs(Long.valueOf(tb), null, op, "12") && !p.a(p.b, new o(tb)))) {
          p.b(new d(tb));
       }
       return;
    }
}
