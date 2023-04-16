package com.yxcorp.gifshow.follow.init.FollowInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zjc.a;
import java.util.Objects;
import zjc.d;
import zjc.d$b;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import zjc.l;
import erd.g;
import crd.b;
import eda.n;
import zjc.m;
import wkd.b;
import mu7.e;
import zjc.e;
import mu7.e$a;
import wca.n;
import zjc.g;
import mac.l;
import zjc.i;
import wca.q;
import zjc.k;

public final class FollowInitModule extends TTIInitModule	// class@0010b7
{

    public void FollowInitModule(){
       super();
    }
    public int f0(){
       return 13;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowInitModule.class, "1")) {
          return;
       }
       Objects.requireNonNull(a.c);
       d$b i = d.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(null, i, d$b.class, "5")) {
          i.e();
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(l.class, mAIN).subscribe(l.b);
          f.g(n.class, mAIN).subscribe(m.b);
          b.a(-1878684066).e(e.a);
          f.g(n.class, mAIN).subscribe(g.b);
          f.g(l.class, mAIN).subscribe(i.b);
          f.g(q.class, mAIN).subscribe(k.b);
       }
       return;
    }
}
