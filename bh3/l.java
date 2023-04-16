package bh3.l;
import bh3.f;
import oh3.a;
import hf3.a;
import lh3.b;
import ih3.b;
import androidx.collection.ArrayMap;
import bh3.l$a;
import java.lang.String;
import bh3.m;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.util.Map;
import bh3.s;
import bh3.s$d;
import bh3.s$c;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import oh3.f;
import zk.d;
import com.google.gson.Gson;
import bh3.b$b;
import java.util.List;
import java.util.Collections;
import bh3.b;
import brd.t;
import bh3.b$a;
import oh3.i;
import cjd.e;
import erd.o;
import bh3.p;
import bh3.o;
import erd.g;
import crd.b;
import crd.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import bh3.e;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import bh3.q;
import bh3.r;

public class l extends a implements f	// class@0003c4
{
    public final a b;
    public final b c;
    public final b d;
    public final Map e;
    public final s$c f;

    public void l(a p0,b p1,b p2){
       super();
       this.e = new ArrayMap();
       this.f = new l$a(this);
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public m A(int p0,String p1,String p2,int p3,String p4){
       Object[] objArray;
       s obj1;
       s$d uod;
       s os;
       t ot;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       l ol = l.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 1;
       if (PatchProxy.isSupport(ol)) {
          objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,Integer.valueOf(p3),oobject2};
          obj1 = PatchProxy.apply(objArray, obj, ol, "2");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = obj.e.get(oobject1);
       objArray = null;
       if (obj1 == null) {
          uod = PatchProxy.apply(objArray, objArray, s$d.class, "1");
          if (uod != patchProxyRe) {
          }else {
             uod = new s$d();
          }
          int i1 = uod;
          i1.a = p0;
          i1.d = oobject;
          i1.c = oobject1;
          i1.b = p3;
          i1.e = oobject2;
          os = new s(obj.d, i1, obj.b, obj.c, obj.f);
          obj.e.put(oobject1, uod);
       }
       m om = PatchProxy.apply(objArray, uod, s.class, "3");
       if (om != patchProxyRe) {
       }else {
          int i2 = uod.k + i;
          uod.k = i2;
          om = new m(uod.i, i2);
          String str = "invite";
          uod.e.b(str, c.k("mRefCount", Integer.valueOf(i2), "mParam", uod.d.toString()));
          if (om.b()) {
             s d = uod.d;
             s$d a = d.a;
             s$d d1 = d.d;
             d uod1 = new d();
             uod1.c();
             os = uod.d;
             String str1 = uod1.b().q(Collections.singletonList(new b$b(os.c, os.b)));
             s$d e = uod.d.e;
             if (PatchProxy.isSupport(b.class)) {
                ot = PatchProxy.applyFourRefs(Integer.valueOf(a), d1, str1, e, null, b.class, "2");
                if (ot != patchProxyRe) {
                label_0109 :
                   uod.c.c(uod.e.f(ot.map(new e()), str).subscribe(new p(uod), new o(uod)));
                   d = uod.f;
                   if (d != null) {
                      s d2 = uod.d;
                      d.b(d2.a, d2.c, uod.i);
                   }
                }
             }
             ot = b.a().a(i.a("n/live/interactiveChat/call", a), a, d1, str1, e);
             goto label_0109 ;
          }
       }
       return om;
    }
    public void S(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       s os = this.e.remove(p0);
       if (os != null) {
          os.b();
       }
       return;
    }
    public List f(){
       ArrayList obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.e.values().iterator();
       while (iterator.hasNext()) {
          s os = iterator.next();
          Objects.requireNonNull(os);
          e uoe = PatchProxy.apply(null, os, s.class, "8");
          if (uoe != PatchProxyResult.class) {
          }else {
             os = os.d;
             uoe = new e(os.a, os.b, os.c, os.d);
          }
          obj.add(uoe);
       }
       return obj;
    }
    public boolean l(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.e.isEmpty()) {
          return false;
       }
       return this.e.containsKey(p0);
    }
    public void o(String p0,String p1,boolean p2){
       t ot;
       Object obj = p0;
       boolean b = p2;
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, l.class, "3")) {
          return;
       }
       Object obj1 = this.e.get(obj);
       if (obj1 == null) {
          b.s(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveInteractInviteProcessor"), "invite transaction is not exist", c.j("targetUserId", obj));
          return;
       }else if(PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), obj1, s.class, "4")){
          s$d a = obj1.d.a;
          s j = obj1.j;
          List list = Collections.singletonList(p0);
          if (PatchProxy.isSupport(b.class)) {
             ot = PatchProxy.applyFourRefs(Integer.valueOf(a), j, list, p1, null, b.class, "3");
             if (ot != PatchProxyResult.class) {
             label_009b :
                obj1.c.c(obj1.e.f(ot.map(new e()), "cancelInvite").subscribe(new q(obj1, obj, b), new r(obj1, obj, b)));
             }
          }
          ot = b.a().b(i.a("n/live/interactiveChat/call/cancel", a), a, j, list, p1);
          goto label_009b ;
       }
       if (b) {
          this.S(p0);
       }
       return;
    }
}
