package com.kwai.chat.kwailink.adapter.s;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.chat.kwailink.adapter.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.chat.kwailink.adapter.g;
import android.os.RemoteCallbackList;
import com.kwai.chat.kwailink.adapter.p$b;
import l75.a;
import com.kwai.chat.kwailink.adapter.p$a;

public final class s implements Runnable	// class@000a17
{
    public final int b;

    public void s(int p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       p op = p.class;
       if (PatchProxy.isSupport(op) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(tb), null, op, "4") && !p.a(p.a, new g(tb)))) {
          p.b(new a(tb));
       }
       return;
    }
}
