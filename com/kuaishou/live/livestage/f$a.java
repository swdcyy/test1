package com.kuaishou.live.livestage.f$a;
import java.lang.Object;
import com.kuaishou.live.livestage.VideoRenderMode;
import ee3.d;
import java.util.ArrayList;
import ee3.h0;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ge3.i;
import fe3.b;
import com.kuaishou.live.livestage.f;
import je3.b;
import msd.a;
import je3.c;
import ke3.c;
import ke3.d;
import ee3.a0;
import re3.c;
import je3.i;
import java.util.List;
import ee3.d0;
import java.util.Collection;

public abstract class f$a	// class@000bea
{
    public b a;
    public VideoRenderMode b;
    public c c;
    public d d;
    public b e;
    public d f;
    public c g;
    public a h;
    public a0 i;
    public List j;
    public h0 k;
    public i l;
    public c m;
    public final ArrayList n;

    public void f$a(){
       super();
       this.b = VideoRenderMode.ALWAYS;
       this.d = d.a;
       this.j = new ArrayList();
       this.k = h0.a;
       this.n = new ArrayList();
    }
    public void f$a(u p0){
       super();
       this.b = VideoRenderMode.ALWAYS;
       this.d = d.a;
       this.j = new ArrayList();
       this.k = h0.a;
       this.n = new ArrayList();
    }
    public final f$a A(VideoRenderMode p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "videoRenderMode");
       this.b = p0;
       return this;
    }
    public final f$a B(h0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "videoScaleModeHandler");
       this.k = p0;
       return this;
    }
    public final f$a a(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "handler");
       this.n.add(p0);
       return this;
    }
    public final f$a b(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "biz");
       this.a = p0;
       return this;
    }
    public abstract f c();
    public final f$a d(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "cameraParam");
       this.e = p0;
       return this;
    }
    public final a e(){
       return this.h;
    }
    public final c f(){
       return this.m;
    }
    public final ArrayList g(){
       return this.n;
    }
    public final b h(){
       return this.e;
    }
    public final d i(){
       return this.d;
    }
    public final c j(){
       return this.g;
    }
    public final d k(){
       return this.f;
    }
    public final b l(){
       return this.a;
    }
    public final a0 m(){
       return this.i;
    }
    public final c n(){
       return this.c;
    }
    public final i o(){
       return this.l;
    }
    public final List p(){
       return this.j;
    }
    public final VideoRenderMode q(){
       return this.b;
    }
    public final h0 r(){
       return this.k;
    }
    public final f$a s(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "interceptor");
       this.d = p0;
       return this;
    }
    public final f$a t(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "messageDelegate");
       this.g = p0;
       return this;
    }
    public final f$a u(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "messageDelegate");
       this.f = p0;
       return this;
    }
    public final f$a v(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "provider");
       this.i = p0;
       return this;
    }
    public final f$a w(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "renderArea");
       this.c = p0;
       return this;
    }
    public final f$a x(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "rtcClient");
       this.l = p0;
       return this;
    }
    public final f$a y(d0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "observer");
       this.j.add(p0);
       return this;
    }
    public final f$a z(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "observers");
       this.j.addAll(p0);
       return this;
    }
}
