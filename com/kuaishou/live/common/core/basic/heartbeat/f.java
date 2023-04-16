package com.kuaishou.live.common.core.basic.heartbeat.f;
import com.kuaishou.live.common.core.basic.heartbeat.b;
import lp3.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import x91.b;
import erd.o;
import cjd.e;
import x91.a;
import com.kuaishou.live.common.core.basic.heartbeat.e;
import erd.g;
import zk.d;
import com.google.gson.Gson;
import java.util.Collection;
import java.util.Map;
import com.kuaishou.live.common.core.basic.heartbeat.b$a;
import com.kuaishou.live.common.core.basic.heartbeat.f$a;
import lp3.e;
import xp5.g;
import lp3.c;
import com.kuaishou.live.common.core.basic.heartbeat.a$a;
import com.kuaishou.live.common.core.basic.heartbeat.a;
import x91.c;
import com.kuaishou.live.common.core.basic.heartbeat.c;
import com.kuaishou.live.common.core.basic.heartbeat.d;

public class f extends a implements b	// class@000eab
{
    public int d;
    public b e;
    public b f;
    public final Map g;
    public String h;

    public void f(){
       super();
       this.d = 2000;
       this.g = new HashMap();
    }
    public void Qo(){
       PatchProxy.applyVoid(null, this, f.class, "1");
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.nd();
       return;
    }
    public final void So(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "7")) {
          return;
       }
       b9.a(this.f);
       this.f = t.interval((long)p0, (long)this.d, TimeUnit.MILLISECONDS).flatMap(new b(this)).map(new e()).subscribe(new a(this), e.b);
       return;
    }
    public final void To(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       d uod = new d();
       uod.c();
       this.h = uod.b().q(this.g.values());
       return;
    }
    public void Wb(b$a p0,int p1,String p2,String p3,String p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof, "5")) {
             return;
          }
       }
       f$a uoa = new f$a(p1, p2, p3, p4, p0);
       this.g.put(Integer.valueOf(p1), v9);
       this.To();
       this.So(0);
       return;
    }
    public void bc(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "8")) {
          return;
       }
       this.g.remove(Integer.valueOf(p0));
       if (this.g.size() > 0) {
          this.To();
          this.So(0);
       }else {
          b9.a(this.f);
       }
       return;
    }
    public void nd(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       b9.a(this.e);
       return;
    }
    public void re(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.nd();
       g og = this.Po().a(g.class);
       int i = 2;
       t ot = (og.e())? a.a().h(og.getLiveStreamId(), i): a.a().j(og.getLiveStreamId(), i);
       this.e = t.interval(0, 2, TimeUnit.SECONDS).flatMap(new c(ot)).subscribe(c.b, d.b);
       return;
    }
}
