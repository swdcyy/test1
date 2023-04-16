package com.kuaishou.live.basic.tk.LiveTkBridge$b;
import o63.j$a;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import msd.a;
import java.lang.Boolean;
import o63.q;
import crd.b;
import crd.a;
import androidx.fragment.app.Fragment;
import o63.i;
import o63.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.Integer;
import o63.j$a$a;

public final class LiveTkBridge$b implements j$a	// class@000d13
{
    public final WeakReference a;

    public void LiveTkBridge$b(LiveTkBridge p0){
       a.p(p0, "tkBridge");
       super();
       this.a = new WeakReference(p0);
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveTkBridge$b.class, "1")) {
          return;
       }
       LiveTkBridge liveTkBridge = this.a.get();
       if (liveTkBridge != null) {
          liveTkBridge = liveTkBridge.h;
          if (liveTkBridge != null) {
             liveTkBridge.invoke();
          }
       }
       return;
    }
    public q a(){
       return q.d;
    }
    public void a5(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkBridge$b.class, "2")) {
          return;
       }
       a.p(p0, "disposable");
       LiveTkBridge liveTkBridge = this.a.get();
       if (liveTkBridge != null) {
          liveTkBridge = liveTkBridge.c;
          if (liveTkBridge != null) {
             liveTkBridge.c(p0);
          }
       }
       return;
    }
    public boolean b1(Fragment p0,String p1){
       return i.c(this, p0, p1);
    }
    public e c1(){
       return i.b(this);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTkBridge$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof LiveTkBridge$b && a.g(p0.a.get(), this.a.get()))? true: false;
       return b;
    }
    public int hashCode(){
       LiveTkBridge obj = PatchProxy.apply(null, this, LiveTkBridge$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.get();
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public void l0(boolean p0){
       i.a(this, p0);
    }
    public void n0(){
       PatchProxy.applyVoid(null, this, LiveTkBridge$b.class, "6");
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, LiveTkBridge$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "TkJsPage{tkBridge=";
       LiveTkBridge liveTkBridge = this.a.get();
       if (liveTkBridge != null) {
          objArray = Integer.valueOf(liveTkBridge.hashCode());
       }
       return obj+objArray+'}';
    }
    public boolean v0(Fragment p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTkBridge$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "fragment");
       return j$a$a.a(this, p0, p1);
    }
}
