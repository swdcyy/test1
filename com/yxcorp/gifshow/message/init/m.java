package com.yxcorp.gifshow.message.init.m;
import java.lang.Runnable;
import com.yxcorp.gifshow.message.init.s;
import ob6.h;
import java.lang.Object;
import java.util.Objects;
import com.kwai.imsdk.m;
import up6.f;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.kwailink.client.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.client.h;

public final class m implements Runnable	// class@001d5e
{
    public final s b;
    public final h c;

    public void m(s p0,h p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m tb = this.b;
       Objects.requireNonNull(tb);
       int i = tb.d(this.c);
       Objects.requireNonNull(m.F());
       Objects.requireNonNull(f.e());
       c0 uoc0 = f.e().g();
       Objects.requireNonNull(uoc0);
       c0 uoc01 = c0.class;
       if (!PatchProxy.isSupport(uoc01) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoc0, uoc01, "67")) {
          b.c().execute(new h(i));
       }
       return;
    }
}
