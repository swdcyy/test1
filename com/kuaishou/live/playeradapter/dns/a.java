package com.kuaishou.live.playeradapter.dns.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.live.playeradapter.dns.RavenInitModule;
import com.kuaishou.live.playeradapter.dns.RavenManager;

public final class a implements Runnable	// class@000d52
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       RavenManager.a();
    }
}
