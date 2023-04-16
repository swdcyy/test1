package com.kuaishou.live.livestage.f;
import com.kuaishou.live.livestage.f$b;
import nsd.u;
import fe3.b;
import re3.c;
import com.kuaishou.live.livestage.VideoRenderMode;
import ee3.e;
import ee3.d;
import ee3.h0;
import ke3.d;
import ke3.c;
import ke3.e;
import msd.a;
import ee3.a0;
import java.util.List;
import je3.i;
import je3.c;
import je3.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import kotlin.text.StringsKt__IndentKt;

public final class f	// class@000bec
{
    public i a;
    public final b b;
    public c c;
    public final VideoRenderMode d;
    public final e e;
    public final d f;
    public final h0 g;
    public final d h;
    public final c i;
    public final e j;
    public final a k;
    public final a l;
    public final a0 m;
    public final List n;
    public final i o;
    public final c p;
    public final b q;
    public final List r;
    public static final f$b s;

    static {
       f.s = new f$b(null);
    }
    public void f(b p0,c p1,VideoRenderMode p2,e p3,d p4,h0 p5,d p6,c p7,e p8,a p9,a p10,a0 p11,List p12,i p13,c p14,b p15,List p16,u p17){
       int i = this;
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = p3;
       i.f = p4;
       i.g = p5;
       i.h = p6;
       i.i = p7;
       i.j = p8;
       i.k = p9;
       i.l = p10;
       i.m = p11;
       i.n = p12;
       i.o = p13;
       i.p = p14;
       i.q = p15;
       i.r = p16;
    }
    public final b a(){
       return this.b;
    }
    public final d b(){
       return this.f;
    }
    public final c c(){
       return this.i;
    }
    public final c d(){
       return this.c;
    }
    public final i e(){
       return this.o;
    }
    public final h0 f(){
       return this.g;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StringsKt__IndentKt.r("\n      |LiveStage\(\n      |  biz="+this.b+",\n      |  renderArea="+this.d()+",\n      |  videoRenderStrategy="+this.d+",\n      |  layoutConfigStrategy="+this.e+",\n      |  layoutConfigInterceptor="+this.f+",\n      |  cameraParamFactory="+this.q+",\n      |  legacyLayoutConfigDelegate="+this.h+",\n      |  defaultImageFactory="+this.k+",\n      |  backgroundImageFactory="+this.l+",\n      |  stageStatusCallback="+this.n+",\n      |  videoScaleModeStrategy="+this.g+"\n      |\)\n      |", null, 1, null);
    }
}
