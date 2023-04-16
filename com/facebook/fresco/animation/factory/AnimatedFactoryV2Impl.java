package com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import pc.a;
import sc.d;
import vc.f;
import tc.l;
import java.lang.Object;
import android.content.Context;
import zc.a;
import ic.a;
import ya.c;
import java.util.concurrent.Executor;
import ic.b;
import ic.e;
import ic.c;
import ya.i;
import com.facebook.common.time.RealtimeSinceBootClock;
import qc.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ExecutorService;
import hb.b;
import ab.h;
import android.graphics.Bitmap$Config;
import yc.b;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b;
import rc.a;
import pc.d;
import ic.d;
import pc.e;

public class AnimatedFactoryV2Impl implements a	// class@000466
{
    public final d a;
    public final f b;
    public final l c;
    public final boolean d;
    public d e;
    public b f;
    public a g;
    public a h;

    public void AnimatedFactoryV2Impl(d p0,f p1,l p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public a a(Context p0){
       if (this.h == null) {
          a uoa = new a(this);
          c uoc = new c(this.b.h());
          b uob = new b(this);
          if (this.f == null) {
             this.f = new c(this);
          }
          e uoe = new e(this.f, i.d(), uoc, RealtimeSinceBootClock.get(), this.a, this.c, uoa, uob);
          this.h = this.b.h();
       }
       return this.h;
    }
    public b b(Bitmap$Config p0){
       return new AnimatedFactoryV2Impl$a(this, p0);
    }
    public b c(Bitmap$Config p0){
       return new AnimatedFactoryV2Impl$b(this, p0);
    }
    public a d(){
       if (this.g == null) {
          this.g = new a();
       }
       return this.g;
    }
    public d e(){
       if (this.e == null) {
          this.e = new e(new d(this), this.a);
       }
       return this.e;
    }
}
