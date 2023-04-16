package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$g;
import lt.b;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lt.a;
import java.lang.StringBuilder;
import java.util.ArrayList;

public final class VodTheaterPlayer$g implements b	// class@0019cc
{
    public final VodTheaterPlayer a;

    public void VodTheaterPlayer$g(VodTheaterPlayer p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VodTheaterPlayer$g.class, "2")) {
          return;
       }
       a.c(this, p0, p1);
       this.a.v(true, "on error "+p1);
       return;
    }
    public void b(String p0){
       a.f(this, p0);
    }
    public void c(String p0){
       a.d(this, p0);
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer$g.class, "1")) {
          return;
       }
       this.a.v(false, "onFinishPlay");
       return;
    }
    public void e(String p0){
    }
    public void f(int p0){
       a.a(this, p0);
    }
    public void g(int p0){
       a.g(this, p0);
    }
    public void h(ArrayList p0,float p1,float p2){
       a.e(this, p0, p1, p2);
    }
    public void i(String p0){
    }
    public void j(int p0){
       a.b(this, p0);
    }
}
