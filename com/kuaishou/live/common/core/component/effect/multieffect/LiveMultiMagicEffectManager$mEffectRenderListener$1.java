package com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$mEffectRenderListener$1;
import zf1.d;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
import java.lang.Object;
import pz2.c;
import pz2.i;
import pz2.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import qrd.l1;
import java.util.Collection;
import xy2.a;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$a;
import zf1.c;
import java.lang.Boolean;
import java.lang.Integer;
import hz2.c;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import zf1.f;

public final class LiveMultiMagicEffectManager$mEffectRenderListener$1 implements d	// class@0010e3
{
    public final LiveMultiMagicEffectManager a;

    public void LiveMultiMagicEffectManager$mEffectRenderListener$1(LiveMultiMagicEffectManager p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       h.a(this, p0);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "5")) {
          return;
       }
       a.p(p0, "task");
       LiveMultiMagicEffectManager d = this.a.d;
       ArrayList uArrayList = new ArrayList(u.Y(d, 10));
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
          uArrayList.add(l1.a);
       }
       return;
    }
    public void c(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "6")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "failedReason");
       LiveMultiMagicEffectManager d = this.a.d;
       ArrayList uArrayList = new ArrayList(u.Y(d, 10));
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1);
          uArrayList.add(l1.a);
       }
       if (p0 instanceof a) {
          LiveMultiMagicEffectManager.k.a("[onResourceCheckFailed]taskId:"+p0.N()+",reason:"+p1);
       }else {
          LiveMultiMagicEffectManager.k.a("[onResourceCheckFailed]unknown task:"+p0+",reason:"+p1);
       }
       this.i();
       return;
    }
    public void d(c p0,boolean p1,String p2){
       c.a(this, p0, p1, p2);
    }
    public void e(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "1")) {
          return;
       }
       a.p(p0, "task");
       LiveMultiMagicEffectManager d = this.a.d;
       ArrayList uArrayList = new ArrayList(u.Y(d, 10));
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0);
          uArrayList.add(l1.a);
       }
       if (p0 instanceof a) {
          LiveMultiMagicEffectManager.k.b("[onEffectRenderStarted]taskId:"+p0.N());
       }else {
          LiveMultiMagicEffectManager.k.a("[onEffectRenderStarted]unknown task:"+p0);
       }
       return;
    }
    public void f(c p0,boolean p1,int p2,String p3){
       if (PatchProxy.isSupport(LiveMultiMagicEffectManager$mEffectRenderListener$1.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), p3, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "4")) {
          return;
       }
       a.p(p0, "task");
       LiveMultiMagicEffectManager d = this.a.d;
       ArrayList uArrayList = new ArrayList(u.Y(d, 10));
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0, p1, p2, p3);
          uArrayList.add(l1.a);
       }
       return;
    }
    public void g(c p0){
       c.e(this, p0);
    }
    public void h(c p0,boolean p1,String p2,c p3){
       if (PatchProxy.isSupport(LiveMultiMagicEffectManager$mEffectRenderListener$1.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "2")) {
          return;
       }
       a.p(p0, "task");
       LiveMultiMagicEffectManager d = this.a.d;
       ArrayList uArrayList = new ArrayList(u.Y(d, 10));
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().h(p0, p1, p2, p3);
          uArrayList.add(l1.a);
       }
       if (p0 instanceof a) {
          LiveMultiMagicEffectManager.k.b("[onEffectFinishRender]taskId:"+p0.N()+",success:"+p1+",reason:"+p2);
       }else {
          LiveMultiMagicEffectManager.k.a("[onEffectFinishRender]unknown task:"+p0+",success:"+p1+",reason:"+p2);
       }
       this.i();
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "7")) {
          return;
       }
       a.f(this.a.f, null, null, new LiveMultiMagicEffectManager$mEffectRenderListener$1$clearRender$1(this, null), 3, null);
       return;
    }
    public void onReceivedEffectEvent(c p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMultiMagicEffectManager$mEffectRenderListener$1.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "message");
       LiveMultiMagicEffectManager d = this.a.d;
       ArrayList uArrayList = new ArrayList(u.Y(d, 10));
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().onReceivedEffectEvent(p0, p1);
          uArrayList.add(l1.a);
       }
       return;
    }
}
