package com.kuaishou.live.lite.luckystar.a;
import com.kuaishou.live.viewcontroller.ViewController;
import v51.a;
import qd3.r;
import e93.b;
import n91.f;
import xp5.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.luckystar.b;
import bc3.b;
import bc3.c;
import z1.k;
import com.kuaishou.live.lite.luckystar.d;
import bc3.a;
import bc3.d;
import bc3.e;
import bc3.f;
import bc3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarStarted;
import bc3.j;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveLuckyStarMessages$SCLuckyStarAbnormalEnd;
import bc3.i;
import com.kuaishou.live.lite.luckystar.b$a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;

public class a extends ViewController	// class@000a31
{
    public LiveStreamFeed j;
    public a k;
    public f l;
    public i m;
    public r n;
    public b o;
    public final b p;
    public final d q;

    public void a(a p0,r p1,b p2,f p3,i p4,LiveStreamFeed p5){
       super();
       b uob = new b(new b(this), new c(this));
       this.p = uob;
       d uod = new d(new a(this), uob, new d(this), new e(this), new f(this), new g(this));
       this.q = v7;
       this.k = p0;
       this.n = p1;
       this.o = p2;
       this.l = p3;
       this.m = p4;
       this.j = p5;
    }
    public void F2(){
       d b;
       b uob = b.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       a tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, uob, str)) {
          if (!PatchProxy.applyVoid(objArray, tp, uob, "5")) {
             tp.a.get().u().u0(652, LiveLuckyStarMessages$SCLuckyStarStarted.class, new j(tp));
             tp.a.get().u().u0(654, LiveLuckyStarMessages$SCLuckyStarAbnormalEnd.class, new i(tp));
          }
          tp.c.setValue(b$a.a());
       }
       tp = this.q;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(objArray, tp, d.class, str)) {
          b = tp.b;
          d j = tp.j;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(j, b, uob, "3")) {
             b.c.observeForever(j);
          }
       }
       return;
    }
    public void J2(){
       d b;
       b uob = b.class;
       String str = "2";
       if (PatchProxy.applyVoid(null, this, a.class, str)) {
          return;
       }
       a tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(null, tp, uob, str)) {
          if (!PatchProxy.applyVoid(null, tp, uob, "6")) {
             tp.a.get().u().o(652, new j(tp));
             tp.a.get().u().o(654, new i(tp));
          }
          tp.d();
          tp.c();
       }
       tp = this.q;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(null, tp, d.class, str)) {
          b = tp.b;
          d j = tp.j;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(j, b, uob, "4")) {
             b.c.removeObserver(j);
          }
          tp.i = null;
          tp.h = null;
       }
       return;
    }
}
