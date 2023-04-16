package bt2.e;
import bt2.c;
import co2.f2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bt2.e$b;
import java.util.ArrayList;
import bt2.e$c;
import bt2.e$h;
import mrd.a;
import bt2.e$d;
import erd.r;
import brd.t;
import bt2.e$e;
import erd.o;
import bt2.e$f;
import bt2.e$g;
import wa1.i;
import bt2.e$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import java.util.Iterator;
import java.util.Collection;
import at2.c;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import at2.b;
import java.util.List;
import bt2.f;
import java.util.Comparator;
import trd.x;
import bt2.a;
import ekd.k1;
import java.lang.Iterable;
import bt2.d;
import com.kwai.robust.PatchProxyResult;
import java.util.ListIterator;
import java.lang.Enum;
import java.lang.Boolean;
import bt2.b;
import java.util.Objects;
import java.util.HashMap;

public final class e implements c	// class@00044f
{
    public final c a;
    public final List b;
    public final List c;
    public final List d;
    public final Runnable e;
    public final long f;
    public String g;
    public final e$h h;
    public final a i;
    public final t j;
    public final t k;
    public final t l;
    public final i m;
    public final f2 n;

    public void e(f2 p0){
       a.p(p0, "voicePartyContext");
       super();
       this.n = p0;
       this.a = e$b.b;
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.d = new ArrayList();
       this.e = new e$c(this);
       this.f = 3000;
       this.g = "";
       this.h = new e$h(this);
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<MicSeatGuideModel>\(\)");
       this.i = uoa;
       this.j = uoa;
       t ot = uoa.filter(e$d.b).map(e$e.b);
       a.o(ot, "_micSeatsGuideObservable…el.MicSeatFollowModel\n  }");
       this.k = ot;
       t ot1 = uoa.filter(e$f.b).map(e$g.b);
       a.o(ot1, "_micSeatsGuideObservable….MicSeatFollowModelV2\n  }");
       this.l = ot1;
       i oi = new i();
       this.m = oi;
       e$a uoa1 = new e$a(this);
       if (PatchProxy.applyVoidOneRefs(uoa1, this, e.class, "8")) {
       }else {
          a.p(uoa1, "disPatcher");
          oi.add(uoa1);
       }
       return;
    }
    public void a(String p0,GuideStructBizRelations p1){
       c uoc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       a.p(p0, "userId");
       a.p(p1, "biz");
       Iterator iterator = this.d.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          uoc = iterator.next();
          if (!a.g(uoc.g(), p0) || uoc.e() != p1) {
             i = 0;
          }
          if (i) {
             iterator.remove();
          }
       }
       iterator = this.c.iterator();
       while (iterator.hasNext()) {
          uoc = iterator.next();
          boolean b = (a.g(uoc.g(), p0) && uoc.e() == p1)? true: false;
          if (b) {
             iterator.remove();
          }
       }
       return;
    }
    public void b(c p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "3")) {
          return;
       }
       a.p(p0, "message");
       b.Z(this.a, "addMessage : "+p0);
       p0.a(this.h);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoe, "4")) {
          this.c.add(p0);
          x.p0(this.c, new f());
       }
       this.i();
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       a.p(p0, "trigger");
       this.b.add(p0);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       a.p(p0, "trigger");
       this.b.remove(p0);
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.c.clear();
       this.d.clear();
       this.m.clear();
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
          iterator.remove();
       }
       k1.n(this);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          Iterator iterator1 = this.m.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().a(uoc);
          }
       }
       return;
    }
    public final t g(){
       return this.j;
    }
    public final f2 h(){
       return this.n;
    }
    public final void i(){
       Object[] objArray1;
       GuideStructBizRelations obj;
       Iterator iterator1;
       Object[] objArray2;
       Object[] objArray3;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "10")) {
          return;
       }
       b.Z(this.a, "waitingList: "+this.c);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList uArrayList = PatchProxy.apply(objArray, this, uoe, "12");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          ListIterator listIterator = this.c.listIterator();
          while (listIterator.hasNext()) {
             c uoc = listIterator.next();
             Iterator iterator = this.d.iterator();
             while (true) {
                StringBuilder str = null;
                if (iterator.hasNext()) {
                   objArray1 = iterator.next();
                   obj = (uoc.e() == objArray1.e())? 1: null;
                   if (!obj) {
                      continue ;
                   }
                }else {
                   objArray1 = objArray;
                }
                String str1 = " is ";
                if (objArray1 != null) {
                   b.Z(this.a, "get Message Show fail: Because 业务 "+uoc.e().name()+str1+"Showing");
                }else {
                   GuideStructBizRelations guideStructB = uoc.e();
                   obj = PatchProxy.applyOneRefs(guideStructB, this, uoe, "13");
                   if (obj != patchProxyRe) {
                      str = obj.booleanValue();
                   }else {
                      Objects.requireNonNull(b.b);
                      List list = b.a.get(guideStructB);
                      if (list != null) {
                         iterator1 = list.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               obj = iterator1.next();
                               Iterator iterator2 = this.d.iterator();
                               while (true) {
                                  if (iterator2.hasNext()) {
                                     objArray3 = iterator2.next();
                                     Object obj1 = (obj == objArray3.e())? 1: null;
                                     if (!obj1) {
                                        continue ;
                                     }
                                  }else {
                                     objArray3 = objArray;
                                  }
                                  if (objArray3 == null) {
                                     continue ;
                                  }
                               }
                            }
                         }
                      }
                      str = true;
                   }
                   if (!str) {
                      b.Z(this.a, "get Message Show fail: Because "+uoc.e().name()+str1+"业务互斥");
                      continue ;
                   }else {
                      iterator1 = this.d.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            objArray2 = iterator1.next();
                            if (!a.g(uoc.g(), objArray2.g())) {
                               continue ;
                            }
                         }else {
                            objArray2 = objArray;
                         }
                         if (objArray2 != null) {
                            b.Z(this.a, "get Message Show fail: Because 用户"+uoc.g()+str1+"showing");
                            continue ;
                         }else if(a.g(this.g, uoc.g())){
                            b.Z(this.a, "delay handle Message with same userId");
                            continue ;
                         }else {
                            uArrayList.add(uoc);
                            this.d.add(uoc);
                            listIterator.remove();
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       this.f(uArrayList);
       b.Z(this.a, "handleMessage canShowList: "+uArrayList);
       return;
    }
}
