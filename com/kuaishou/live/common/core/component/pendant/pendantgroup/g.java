package com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import cw1.d0;
import java.lang.Object;
import java.util.ArrayList;
import cw1.e0;
import cw1.f0;
import cw1.g0;
import cw1.h0;
import cw1.i0;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.f;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g$a;
import java.lang.Enum;
import java.lang.Boolean;

public abstract class g	// class@00171d
{
    public List a;
    public d0 b;
    public b c;
    public b d;
    public b e;
    public b f;
    public b g;
    public b h;

    public void g(d0 p0){
       super();
       this.a = new ArrayList();
       this.c = new e0(this);
       this.d = new f0(this);
       this.e = new g0(this);
       this.f = new h0(this);
       this.g = new i0(this);
       this.h = new f(this);
       this.b = p0;
    }
    public abstract void A();
    public abstract void B();
    public abstract void C();
    public void D(){
    }
    public abstract void E();
    public abstract void F();
    public abstract void G();
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LivePendantContainerScene livePendantC = iterator.next();
          if (!this.a.contains(livePendantC)) {
             this.a.add(livePendantC);
             switch (g$a.a[livePendantC.ordinal()]){
                 case 1:
                   this.n();
                   break;
                 case 2:
                   this.j();
                   break;
                 case 3:
                   this.k();
                   break;
                 case 4:
                   this.l();
                   break;
                 case 5:
                 case 6:
                   this.r();
                   break;
                 case 7:
                 case 9:
                 case 10:
                 case 11:
                 case 12:
                 case 8:
                   this.s();
                   break;
                 case 13:
                   this.o();
                   break;
                 case 14:
                   this.q();
                   break;
                 case 15:
                 case 17:
                 case 18:
                 case 16:
                   this.g();
                   break;
                 case 19:
                   this.e();
                   break;
                 case 20:
                   this.m();
                   break;
                 case 21:
                   this.i();
                   break;
                 case 22:
                 case 23:
                   this.p();
                   break;
                 case 24:
                   this.h();
                   break;
                 case 25:
                   this.f();
                   break;
                 default:
             }
          }
       }
       return;
    }
    public void b(LivePendantContainerScene p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, og, "4")) {
          return;
       }
       this.b.d(p0, p1);
       return;
    }
    public void c(LivePendantContainerScene p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       this.b.d(p0, false);
       return;
    }
    public void d(LivePendantContainerScene p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.b.d(p0, true);
       return;
    }
    public void e(){
    }
    public void f(){
    }
    public abstract void g();
    public void h(){
    }
    public void i(){
    }
    public abstract void j();
    public abstract void k();
    public abstract void l();
    public abstract void m();
    public abstract void n();
    public abstract void o();
    public void p(){
    }
    public abstract void q();
    public abstract void r();
    public abstract void s();
    public void t(){
    }
    public void u(){
    }
    public abstract void v();
    public void w(){
    }
    public void x(){
    }
    public abstract void y();
    public abstract void z();
}
