package com.kuaishou.live.lite.util.viewupdater.b;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.a$c;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.lite.util.viewupdater.c;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;

public final class b implements Runnable	// class@000ba7
{
    public final a$c b;
    public final String c;
    public final Runnable d;

    public void b(a$c p0,String p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       b tc = this.c;
       this.b.a.ll(tc, new c(tc, this.d));
    }
}
