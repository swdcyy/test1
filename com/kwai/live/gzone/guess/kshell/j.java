package com.kwai.live.gzone.guess.kshell.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.guess.kshell.f0$c;
import com.kwai.live.gzone.guess.kshell.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import n57.b;
import com.kwai.live.gzone.guess.kshell.b;
import java.lang.Class;
import c77.a;
import com.kwai.live.gzone.guess.kshell.c;
import y43.a;
import com.kwai.live.gzone.guess.kshell.d;
import j47.c;
import com.kwai.live.gzone.guess.kshell.e;
import com.kwai.live.gzone.guess.kshell.f;
import com.kwai.live.gzone.guess.kshell.g;
import com.kwai.live.gzone.guess.kshell.h;
import com.kwai.live.gzone.guess.kshell.i;
import mm8.a;

public final class j implements b	// class@000d47
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_BASIC_CONTEXT", new a(this, p1));
       p0.h(b.class, new b(this, p1));
       p0.h(a.class, new c(this, p1));
       p0.h(a.class, new d(this, p1));
       p0.h(c.class, new e(this, p1));
       p0.i("LIVE_GUESS_INNER_SERVICE", new f(this, p1));
       p0.i("KEY_LIVE_GZONE_SERVICE_MANAGER", new g(this, p1));
       h oh = new h(this, p1);
       String str = "LIVE_GZONE_TAB";
       try{
          p0.i(str, oh);
          p0.h(f0$c.class, new i(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
