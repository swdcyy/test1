package com.kuaishou.live.liteend.baseinfo.g;
import yh3.a;
import com.kwai.framework.model.user.User;
import z1.a;
import java.lang.Runnable;
import androidx.lifecycle.MutableLiveData;
import zh3.c;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import brd.t;
import ae3.h;
import erd.o;
import ae3.g;
import com.kuaishou.live.liteend.baseinfo.f;
import com.kuaishou.live.liteend.baseinfo.e;
import erd.g;
import erd.a;
import crd.b;
import androidx.lifecycle.ViewModel;
import lnc.b9;

public class g extends a	// class@000bc2
{
    public final MutableLiveData a;
    public final c b;
    public final a c;
    public final Runnable d;
    public b e;

    public void g(User p0,long p1,a p2,Runnable p3){
       g og = this;
       long l = p1;
       super();
       MutableLiveData mutableLiveD = new MutableLiveData();
       og.a = mutableLiveD;
       c uoc = new c();
       og.b = uoc;
       og.c = p2;
       og.d = p3;
       mutableLiveD.setValue(p0);
       uoc.q(Long.valueOf(p1));
       g og1 = g.class;
       if (!PatchProxy.isSupport(og1) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(p1), this, og1, "3") && og.e == null)) {
          og.e = t.intervalRange(0, (1 + l), 0, 1, TimeUnit.SECONDS, d.c).map(new h(l)).observeOn(d.a).subscribe(new g(uoc), f.b, new e(this));
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.onCleared();
       b9.a(this.e);
       return;
    }
}
