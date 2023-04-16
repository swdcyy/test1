package com.kwai.chat.kwailink.adapter.w;
import java.lang.Runnable;
import com.kwai.chat.kwailink.adapter.KlinkAdapter;
import java.lang.Object;
import com.kwai.chat.kwailink.adapter.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.chat.kwailink.adapter.h;
import android.os.RemoteCallbackList;
import com.kwai.chat.kwailink.adapter.p$b;
import l75.b;
import com.kwai.chat.kwailink.adapter.p$a;

public final class w implements Runnable	// class@000a1b
{
    public final KlinkAdapter b;
    public final int c;

    public void w(KlinkAdapter p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       w tc = this.c;
       KlinkAdapter g = this.b.g;
       p op = p.class;
       if (PatchProxy.isSupport(op) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(tc), Integer.valueOf(g), null, op, "5") && !p.a(p.a, new h(tc, g)))) {
          p.b(new b(tc, g));
       }
       return;
    }
}
