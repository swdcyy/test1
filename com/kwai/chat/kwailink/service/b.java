package com.kwai.chat.kwailink.service.b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import com.kwai.chat.kwailink.log.a;
import v75.d;

public final class b implements Runnable	// class@000a6c
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       a.g("KwaiLinkServiceInternal", "KwaiLinkService onBind");
       d.b();
    }
}
