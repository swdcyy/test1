package com.kuaishou.live.redpacket.core.ui.vm.RedPacketPendantBaseViewModel$a;
import eo3.n;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketPendantBaseViewModel;
import java.lang.Object;
import eo3.g;
import eo3.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.os.Looper;
import oo3.a;
import java.lang.Runnable;
import android.view.View;
import java.lang.Throwable;

public class RedPacketPendantBaseViewModel$a implements n	// class@000f3e
{
    public final RedPacketPendantBaseViewModel a;

    public void RedPacketPendantBaseViewModel$a(RedPacketPendantBaseViewModel p0){
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
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPendantBaseViewModel$a.class, "2")) {
          return;
       }
       new Handler(Looper.getMainLooper()).post(new a(this));
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
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketPendantBaseViewModel$a.class, "1")) {
          return;
       }
       this.a.A0();
       return;
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
