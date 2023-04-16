package com.yxcorp.gifshow.autoplay.state.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.util.ArrayList;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.autoplay.state.a;
import erd.o;
import com.yxcorp.gifshow.autoplay.state.c;
import erd.r;
import y99.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.autoplay.state.b;
import com.yxcorp.gifshow.autoplay.state.d;
import y99.g;
import s99.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import lnc.b9;

public final class e	// class@001c3c
{
    public final BaseFragment a;
    public final b b;
    public final b c;
    public List d;

    public void e(BaseFragment p0){
       super();
       this.d = new ArrayList(20);
       this.a = p0;
       this.c = p0.m().map(a.b).distinctUntilChanged().filter(c.b).subscribe(new f(this));
       this.b = p0.m().map(b.b).filter(d.b).subscribe(new g(this));
    }
    public void a(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       b9.a(this.b);
       b9.a(this.c);
       this.d.clear();
       return;
    }
    public void c(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
}
