package com.kwai.chat.kwailink.client.g;
import o75.z;
import java.lang.Object;
import com.kwai.chat.kwailink.client.c0;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.client.d0;
import java.util.Set;
import java.util.Iterator;
import java.lang.StringBuilder;

public final class g implements z	// class@000a2f
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void a(){
       c0.c = false;
       c0.f = true;
       a.e("KwaiLinkClient", "kwailink service died.");
       d0.b(-1, false);
       int i = c0.g + true;
       c0.g = i;
       boolean b = 10;
       if (i <= b) {
          Set e = c0.e;
          if (!e.isEmpty()) {
             Iterator iterator = e.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
          }
       }else {
          a.e("KwaiLinkClient", "binderDied, but binderDiedTimes\("+c0.g+"\) > MAX_BINDER_DIED_TIMES\("+b+"\), so cancel callback");
       }
       return;
    }
}
