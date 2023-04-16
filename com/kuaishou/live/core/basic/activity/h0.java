package com.kuaishou.live.core.basic.activity.h0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import xs5.a;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import im8.a;
import java.lang.Object;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.core.basic.activity.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemClock;
import wj3.d;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import en8.a;
import aa1.d;
import tkd.b;
import tkd.d;
import g02.a;
import wj3.a;
import android.view.View;
import m02.r1;
import wj3.a$a;
import java.lang.System;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$d;
import com.kuaishou.live.core.basic.activity.LivePlayStage;
import java.lang.Long;
import java.util.Map;

public final class h0 implements Runnable	// class@00183b
{
    public final LivePlayLoader b;
    public final a c;
    public final boolean d;
    public final LivePlayLoader$e e;
    public final a f;
    public final Object[] g;

    public void h0(LivePlayLoader p0,a p1,boolean p2,LivePlayLoader$e p3,a p4,Object[] p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       h0 oh0 = this;
       h0 b = oh0.b;
       h0 c = oh0.c;
       h0 d = oh0.d;
       h0 e = oh0.e;
       h0 f = oh0.f;
       h0 g = oh0.g;
       b.c0(b.a, "loadPreCreateComponent", "liveStreamId", b.j);
       LivePlayLoader c1 = b.c;
       LivePlayLoader b1 = b.b;
       Objects.requireNonNull(c1);
       m0 om0 = m0.class;
       int i = 0;
       if (PatchProxy.isSupport(om0)) {
          Object[] objArray = new Object[]{b1,c,Boolean.valueOf(d),e,f,g};
          Object obj = PatchProxy.apply(objArray, c1, om0, "2");
          if (obj != PatchProxyResult.class) {
             i = obj.booleanValue();
          }else if(c1.b == null){
             b.c0(m0.l, "loadPresenter fail, because view is null", "liveStreamId", c1.j);
          }else if(c1.i != null){
             b.c0(m0.l, "loadPresenter fail, because presenter is not null", "liveStreamId", c1.j);
          }else {
             long l = SystemClock.elapsedRealtime();
             if (c1.k != null) {
                a[] uoaArray = new a[]{f};
                c1.i = new d(b1, LivePlayLoader$Stage.PRE_CREATE.getName(), uoaArray);
             }else {
                a[] uoaArray1 = new a[]{f};
                c1.i = new d(uoaArray1);
             }
             d.a(-1995989111).P60(c1.i, c);
             c1.i.f(c1.b);
             c1.i.K7(new r1(e, d), g);
             b.c0(m0.l, "loadPresenter success", "liveStreamId", c1.j);
             c1.h = System.currentTimeMillis();
             c1.g = SystemClock.elapsedRealtime() - l;
             i = true;
          }
       }else {
          goto label_0053 ;
       }
       if (i) {
          LivePlayLoader f1 = b.f;
          LivePlayLoader c2 = b.c;
          f1.c = c2.g;
          f1.a.put(LivePlayStage.BASIC_COMPONENT_LOADED, Long.valueOf(c2.h));
       }
       b.o = true;
       return;
    }
}
