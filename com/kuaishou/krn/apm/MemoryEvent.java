package com.kuaishou.krn.apm.MemoryEvent;
import java.lang.Cloneable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import hi0.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class MemoryEvent implements Cloneable	// class@0007b1
{
    public Object b;
    public String bundleId;
    public Object c;
    public CoreMemoryInfo coreMemoryInfo;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public boolean hasRSSAndVSS;
    public Object i;
    public final boolean j;
    public long maxJvmHeapSize;
    public long maxRamSize;
    public long overheadTime;
    public Object rssStat;
    public Object totalPssStat;
    public int vssStat;

    public void MemoryEvent(String p0,boolean p1){
       g og;
       a.p(p0, "bundleId");
       super();
       this.bundleId = p0;
       this.j = p1;
       Integer integer = Integer.valueOf(0);
       Integer integer1 = (p1)? integer: new g();
       this.b = integer1;
       integer1 = (p1)? integer: new g();
       this.c = integer1;
       integer1 = (p1)? integer: new g();
       this.d = integer1;
       integer1 = (p1)? integer: new g();
       this.e = integer1;
       integer1 = (p1)? integer: new g();
       this.f = integer1;
       integer1 = (p1)? integer: new g();
       this.g = integer1;
       integer1 = (p1)? integer: new g();
       this.h = integer1;
       integer1 = (p1)? integer: new g();
       this.totalPssStat = integer1;
       integer1 = (p1)? integer: new g();
       this.rssStat = integer1;
       this.hasRSSAndVSS = true;
       if (!p1) {
          integer = new g();
       }
       this.i = integer;
       return;
    }
    public final Object a(){
       return this.d;
    }
    public final Object b(){
       return this.f;
    }
    public final boolean c(){
       return this.hasRSSAndVSS;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, MemoryEvent.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public final Object d(){
       return this.b;
    }
    public final Object e(){
       return this.c;
    }
    public final Object f(){
       return this.g;
    }
    public final Object g(){
       return this.rssStat;
    }
    public final Object h(){
       return this.e;
    }
    public final Object i(){
       return this.h;
    }
    public final Object j(){
       return this.totalPssStat;
    }
    public final Object k(){
       return this.i;
    }
    public final int l(){
       return this.vssStat;
    }
    public final boolean m(){
       return this.j;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.bundleId = p0;
       return;
    }
    public final void o(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.d = p0;
       return;
    }
    public final void p(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.f = p0;
       return;
    }
    public final void q(boolean p0){
       this.hasRSSAndVSS = p0;
    }
    public final void r(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void s(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void t(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.g = p0;
       return;
    }
    public final void u(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.rssStat = p0;
       return;
    }
    public final void v(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.e = p0;
       return;
    }
    public final void w(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.h = p0;
       return;
    }
    public final void x(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.totalPssStat = p0;
       return;
    }
    public final void y(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEvent.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.i = p0;
       return;
    }
    public final void z(int p0){
       this.vssStat = p0;
    }
}
