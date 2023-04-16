package com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel$a;
import eo3.n;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import java.lang.Object;
import eo3.g;
import eo3.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.Throwable;

public class RedPacketBaseViewModel$a implements n	// class@000f37
{
    public final RedPacketBaseViewModel a;

    public void RedPacketBaseViewModel$a(RedPacketBaseViewModel p0){
       this.a = p0;
       super();
    }
    public void a(g p0,Object p1){
       m.b(this, p0, p1);
    }
    public void b(g p0){
       m.j(this, p0);
    }
    public void c(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketBaseViewModel$a.class, "1")) {
          return;
       }
       this.a.z0();
       return;
    }
    public void d(g p0,View p1,int p2){
       m.i(this, p0, p1, p2);
    }
    public void e(g p0,View p1){
       m.h(this, p0, p1);
    }
    public void f(g p0,View p1){
       m.g(this, p0, p1);
    }
    public void g(g p0,View p1){
       m.f(this, p0, p1);
    }
    public void h(g p0){
       m.d(this, p0);
    }
    public void i(g p0){
       m.k(this, p0);
    }
    public void j(g p0){
       m.e(this, p0);
    }
    public void k(g p0,String p1,Throwable p2){
       m.a(this, p0, p1, p2);
    }
    public void l(g p0){
       m.l(this, p0);
    }
    public void m(g p0,long p1,long p2){
       m.c(this, p0, p1, p2);
    }
}
