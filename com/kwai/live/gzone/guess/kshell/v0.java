package com.kwai.live.gzone.guess.kshell.v0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kwai.live.gzone.guess.kshell.m$b;
import com.kwai.live.gzone.guess.kshell.q0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j47.c;
import com.kwai.live.gzone.guess.kshell.r0;
import java.lang.Class;
import com.kwai.live.gzone.guess.kshell.s0;
import com.kwai.live.gzone.guess.kshell.t0;
import com.kwai.live.gzone.guess.kshell.u0;
import mm8.a;

public final class v0 implements b	// class@000d6d
{

    public void v0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_BASIC_CONTEXT", new q0(this, p1));
       p0.h(c.class, new r0(this, p1));
       p0.i("questionListener", new s0(this, p1));
       t0 ot0 = new t0(this, p1);
       String str = "guessUserBets";
       try{
          p0.i(str, ot0);
          p0.h(m$b.class, new u0(this, p1));
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
