package com.kwai.chat.kwailink.adapter.t;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.chat.kwailink.adapter.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.chat.kwailink.adapter.m;
import android.os.RemoteCallbackList;
import com.kwai.chat.kwailink.adapter.p$b;
import l75.c;
import com.kwai.chat.kwailink.adapter.p$a;
import com.kwai.chat.kwailink.adapter.k;
import com.kwai.chat.kwailink.adapter.d;
import com.kwai.chat.kwailink.adapter.l;
import com.kwai.chat.kwailink.adapter.e;
import com.kwai.chat.kwailink.adapter.i;
import com.kwai.chat.kwailink.adapter.b;

public final class t implements Runnable	// class@000a18
{
    public final int b;

    public void t(int p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       p op = p.class;
       if (tb != 1007) {
          if (tb != 1008) {
             if (tb != 1012) {
                if (tb == 1015 && (PatchProxy.isSupport(op) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(0), null, null, op, "10") && !p.a(p.a, new m(0, null))))) {
                   p.b(new c(0, null));
                }
             }else if(!PatchProxy.applyVoid(null, null, op, "8") && !p.a(p.a, new k())){
                p.b(d.a);
             }
          }else if(!PatchProxy.applyVoid(null, null, op, "9") && !p.a(p.a, new l())){
             p.b(e.a);
          }
       }else if(!PatchProxy.applyVoid(null, null, op, "6") && !p.a(p.a, new i())){
          p.b(b.a);
       }
       return;
    }
}
