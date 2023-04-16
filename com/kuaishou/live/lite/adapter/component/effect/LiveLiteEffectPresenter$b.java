package com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$b;
import ny2.a;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter;
import java.lang.Object;
import lz2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pz2.c;
import h03.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Long;
import py2.a;

public final class LiveLiteEffectPresenter$b implements a	// class@001d80
{
    public final LiveLiteEffectPresenter b;

    public void LiveLiteEffectPresenter$b(LiveLiteEffectPresenter p0){
       this.b = p0;
       super();
    }
    public void B0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$b.class, "7")) {
          return;
       }
       a.p(p0, "listener");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.B0(p0);
       }
       return;
    }
    public void C0(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteEffectPresenter$b.class, "9")) {
          return;
       }
       a.p(p0, "effectTask");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.C0(p0, p1);
       }
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEffectPresenter$b.class, "3")) {
          return;
       }
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.D();
       }
       return;
    }
    public c H(){
       Object[] objArray = null;
       LiveLiteEffectPresenter obj = PatchProxy.apply(objArray, this, LiveLiteEffectPresenter$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.G;
       if (obj != null) {
          objArray = obj.H();
       }
       return objArray;
    }
    public void H0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "taskList");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.H0(p0);
       }
       return;
    }
    public void S0(long p0){
       LiveLiteEffectPresenter$b uob = LiveLiteEffectPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "5")) {
          return;
       }
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.S0(p0);
       }
       return;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$b.class, "10")) {
          return;
       }
       a.p(p0, "consumer");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.a(p0);
       }
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$b.class, "11")) {
          return;
       }
       a.p(p0, "consumer");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.b(p0);
       }
       return;
    }
    public void g1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$b.class, "8")) {
          return;
       }
       a.p(p0, "listener");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.g1(p0);
       }
       return;
    }
    public void j1(long p0){
       LiveLiteEffectPresenter$b uob = LiveLiteEffectPresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "6")) {
          return;
       }
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.j1(p0);
       }
       return;
    }
    public void o1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEffectPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "task");
       LiveLiteEffectPresenter g = this.b.G;
       if (g != null) {
          g.o1(p0);
       }
       return;
    }
}
