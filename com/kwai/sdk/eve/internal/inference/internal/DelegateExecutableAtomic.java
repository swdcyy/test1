package com.kwai.sdk.eve.internal.inference.internal.DelegateExecutableAtomic;
import com.kwai.sdk.eve.internal.inference.EveExecutableAtomic;
import zn7.a;
import com.kwai.sdk.eve.internal.inference.a;
import sm7.h;
import com.kuaishou.eve.packageinfo.model.TypedExecutable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.inference.internal.DelegateExecutableAtomic$callback$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.inference.ExecutableAtomicType;
import q50.h;
import ml5.a;
import sm7.k;
import ym7.e;
import ln7.g;
import java.util.Objects;
import ln7.i;
import com.kuaishou.eve.packageinfo.model.InPackExecutableInfo;
import sm7.i;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import com.kuaishou.eve.packageinfo.model.ExecutableInfo;
import com.kuaishou.eve.packageinfo.model.ModelExecutableInfo;

public final class DelegateExecutableAtomic extends EveExecutableAtomic	// class@00156b
{
    public final p d;
    public final a e;
    public final a f;
    public final h g;

    public void DelegateExecutableAtomic(a p0,a p1,h p2,TypedExecutable p3){
       a.p(p0, "task");
       a.p(p1, "inference");
       a.p(p2, "executable");
       a.p(p3, "info");
       super(p3);
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.d = s.c(DelegateExecutableAtomic$callback$2.INSTANCE);
    }
    public List H(){
       Object obj = PatchProxy.apply(null, this, DelegateExecutableAtomic.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public ExecutableAtomicType c(){
       ExecutableAtomicType obj = PatchProxy.apply(null, this, DelegateExecutableAtomic.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.a() instanceof h)? ExecutableAtomicType.Pipeline: ExecutableAtomicType.Processor;
       return obj;
    }
    public a d(a p0,k p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyTwoRefs(p0, p1, this, DelegateExecutableAtomic.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "data");
       a.p(p1, "context");
       this.e.r("EveProcessor");
       if (this.g instanceof e) {
          obj = this.e.i();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.sdk.eve.internal.lua.StatefulLuaVm");
          obj.f("inferenceId", new a(this.f.h()));
          obj = this.e.i();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kwai.sdk.eve.internal.lua.StatefulLuaVm");
          DelegateExecutableAtomic tg = this.g;
          Objects.requireNonNull(tg);
          String str = PatchProxy.apply(null, tg, e.class, "2");
          if (str != patchProxyRe) {
          }else {
             str = tg.c.h();
          }
          obj.f("resourceId", new a(str));
       }
       this.e.q("EveProcessor");
       return this.g.a(p0, p1);
    }
    public ResourceType getResource(){
       ResourceType resourceType;
       TypedExecutable obj = PatchProxy.apply(null, this, DelegateExecutableAtomic.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (obj instanceof ExecutableInfo) {
          resourceType = this.a().f();
       }else if(obj instanceof ModelExecutableInfo){
          resourceType = ResourceType.GPU;
       }else {
          resourceType = ResourceType.CPU;
       }
       return resourceType;
    }
    public String m(){
       Object obj = PatchProxy.apply(null, this, DelegateExecutableAtomic.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.f();
    }
    public String q(){
       return null;
    }
}
