package com.kwai.chat.kwailink.client.f;
import o75.y;
import java.lang.Object;
import com.kwai.chat.kwailink.client.c0;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.client.n;
import java.lang.Runnable;
import java.util.Set;
import java.util.Iterator;

public final class f implements y	// class@000a2e
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final void a(){
       Set b;
       c0.c = true;
       c0.f = false;
       a.e("KwaiLinkClient", "kwailink service connected.");
       b.c().execute(n.b);
       b = c0.b;
       if (!b.isEmpty()) {
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
}
