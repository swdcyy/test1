package com.kuaishou.live.core.show.subscribe.d$a;
import com.kuaishou.live.core.show.subscribe.d$b;
import com.kuaishou.live.core.show.subscribe.d;
import java.lang.Object;
import java.lang.String;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import ok2.i;
import com.kuaishou.live.core.show.subscribe.b;
import ps5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import pk2.c;
import pk2.b;
import brd.t;
import cjd.e;
import erd.o;
import gr8.b;
import brd.x;
import com.kuaishou.live.core.show.subscribe.c;
import com.kuaishou.live.core.show.subscribe.d$a$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e17.i$b;
import e17.i;

public class d$a implements d$b	// class@0010d7
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(String p0,int p1,RxFragmentActivity p2,i p3,b p4,b p5,String p6,boolean p7){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p5;
       object oobject3 = p6;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),p2,oobject1,p4,oobject2,oobject3,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "1")) {
             return;
          }
       }
       b.f0(LiveLogTag.LIVE_SUBSCRIBE, "subscribeLive", "subscribeId", p0, "source", Integer.valueOf(p1), "sourceAuthorId", p6, "isAnchor", Boolean.valueOf(p7));
       if (oobject1 != null) {
          p3.b();
       }
       c uoc = new c(this, p3, p5, p0, p2, p4, p7);
       obj.a.X7(b.b().A0(oobject, p1, oobject3).map(new e()).compose(p2.ge()).subscribe(v11, new d$a$a(obj, oobject1, oobject2)));
       return;
    }
    public final void b(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       i$b uob = i.m();
       uob.x(p0);
       uob.z(R.drawable.arg_RES_7f081411);
       i.z(uob);
       return;
    }
}
