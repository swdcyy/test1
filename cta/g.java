package cta.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cta.g$a;
import nsd.u;
import wq6.f;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cta.g$c;
import cta.g$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fr6.b;
import fr6.d;
import wkd.b;
import cta.e;
import brd.t;
import cta.g$b;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import wq6.l;
import java.lang.System;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import java.util.ArrayList;
import wq6.h;
import wq6.g;
import com.kwai.kcube.TabIdentifier;
import zr6.g;
import java.util.Collection;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import cta.b;
import xn5.a;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import hsa.g;

public final class g extends PresenterV2	// class@0023ba
{
    public boolean p;
    public List q;
    public List r;
    public boolean s;
    public final Runnable t;
    public final d u;
    public final f v;
    public final d w;
    public static final g$a x;

    static {
       g.x = new g$a(null);
    }
    public void g(f p0,d p1){
       a.p(p0, "controller");
       a.p(p1, "fragment");
       super();
       this.v = p0;
       this.w = p1;
       this.t = new g$c(this);
       this.u = new g$d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.v.b0().a(this.u);
       this.X7(b.a(-920422449).k().subscribe(new g$b(this), Functions.e));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       b.a(-920422449).clear();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.v.b0().j(this.u);
       return;
    }
    public final boolean P8(){
       d obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.a(this.w.g());
       a.o(obj, "IKCubeHomeTabDataStore.get\(fragment.activity\)");
       l ol = obj.d();
       if (ol != null) {
          return ol.d("ato_operate");
       }
       return false;
    }
    public final void a(){
       boolean b;
       Iterator iterator;
       Iterator iterator1;
       b uob;
       long l1;
       StringBuilder str;
       Iterator iterator2;
       Object obj2;
       Iterator iterator5;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, og, "4")) {
          return;
       }
       long l = System.currentTimeMillis();
       if (obj.s == null) {
          return;
       }
       boolean i = 0;
       if (obj.p != null) {
          objArray = new Object[i];
          b.C().w("KCubeDynamicTabUpdatePresenter", "return scrollState: "+obj.p, objArray);
          return;
       }else {
          FragmentActivity uFragmentAct = obj.w.g();
          if (uFragmentAct != null) {
             ArrayList uArrayList = PatchProxy.apply(objArray, obj, og, "7");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                h oh = obj.v.j();
                uArrayList.add(oh.M2());
                while (oh.l()) {
                   oh = oh.a().j();
                   uArrayList.add(oh.M2());
                }
             }
             Object[] objArray1 = new Object[i];
             b.C().w("KCubeDynamicTabUpdatePresenter", "primaryTabList: "+uArrayList, objArray1);
             g og1 = c.a(uFragmentAct).a();
             if (og1 == null) {
                Object[] objArray2 = new Object[i];
                b.C().w("KCubeDynamicTabUpdatePresenter", "tabParamBuilder is null", objArray2);
                return;
             }else {
                b = this.P8();
                ArrayList uArrayList1 = new ArrayList();
                ArrayList uArrayList2 = new ArrayList();
                uArrayList2.addAll(b.a(-920422449).c());
                g q = obj.q;
                int i1 = 10;
                if (q != null) {
                   ArrayList uArrayList3 = new ArrayList(u.Y(q, i1));
                   iterator = q.iterator();
                   while (iterator.hasNext()) {
                      uArrayList3.add(new b(iterator.next(), og1));
                      iterator1 = 10;
                   }
                   iterator1 = uArrayList3.iterator();
                   while (iterator1.hasNext()) {
                      uob = iterator1.next();
                      if (uob.a()) {
                         uArrayList1.add(uob);
                      }
                   }
                }
                a.c.c();
                ArrayList uArrayList4 = PatchProxy.applyTwoRefs(uArrayList1, uArrayList2, obj, og, "6");
                if (uArrayList4 != patchProxyRe) {
                   l1 = l;
                   str = 1;
                }else {
                   uArrayList4 = new ArrayList();
                   Iterator iterator3 = uArrayList1.iterator();
                   while (iterator3.hasNext()) {
                      b uob1 = iterator3.next();
                      Iterator iterator4 = uArrayList2.iterator();
                      while (true) {
                         if (iterator4.hasNext()) {
                            obj2 = iterator4.next();
                            Object obj3 = obj2;
                            iterator5 = iterator3;
                            Object obj4 = (a.g(uob1.b().mType, obj3.b().mType) && a.g(uob1.b().mId, obj3.b().mId))? 1: null;
                            if (obj4) {
                            label_0178 :
                               obj4 = obj2;
                               if (obj4 == null) {
                                  uArrayList4.add(uob1);
                                  uob1.b().mStatus = DynamicTabConfig$Status.ADD;
                                  l1 = l;
                                  str = 1;
                               }else {
                                  l1 = l;
                                  int i2 = a.g(uob1.b(), obj4.b()) ^ 1;
                                  if (i2) {
                                     uArrayList4.add(uob1);
                                     uob1.b().mStatus = DynamicTabConfig$Status.CHANGE;
                                  }else {
                                     uob1.b().mStatus = DynamicTabConfig$Status.UNCHANGED;
                                  }
                               }
                               if (obj4 != null) {
                                  uArrayList2.remove(obj4);
                               }
                               l = l1;
                               iterator3 = iterator5;
                            }else {
                               iterator3 = iterator5;
                            }
                         }else {
                            iterator5 = iterator3;
                            obj2 = false;
                            goto label_0178 ;
                         }
                      }
                   }
                   l1 = l;
                   iterator2 = uArrayList2.iterator();
                   while (iterator2.hasNext()) {
                      uob = iterator2.next();
                      uArrayList4.add(uob);
                      uob.b().mStatus = DynamicTabConfig$Status.REMOVE;
                   }
                }
                iterator2 = uArrayList4.iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      uob = iterator2.next();
                      TabIdentifier obj1 = PatchProxy.applyTwoRefs(uArrayList, uob, obj, og, "8");
                      if (obj1 != patchProxyRe) {
                         i = obj1.booleanValue();
                      }else {
                         iterator = uob.b.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               obj1 = iterator.next();
                               if (uArrayList.contains(obj1)) {
                                  Object[] objArray3 = new Object[0];
                                  b.C().w("KCubeDynamicTabUpdatePresenter", "primary tab change: "+obj1, objArray3);
                                  i = true;
                               }
                            }else {
                               i = false;
                            }
                         }
                      }
                      if (i) {
                         return;
                      }
                      continue ;
                   }else {
                      b.a(-920422449).m(uArrayList1);
                      c.a(uFragmentAct).g(og1);
                      boolean b1 = this.P8();
                      Object[] objArray4 = new Object[0];
                      b.C().w("KCubeDynamicTabUpdatePresenter", "oldHasActivityTab "+b+", newHasActivityTab "+b1, objArray4);
                      if (b != b1) {
                         b.a(0x430040f9).d(b1);
                      }
                      if (!PatchProxy.applyVoidOneRefs(uArrayList4, obj, og, "5")) {
                         e uoe = b.a(-920422449);
                         ArrayList uArrayList5 = new ArrayList(u.Y(uArrayList4, 10));
                         iterator1 = uArrayList4.iterator();
                         while (iterator1.hasNext()) {
                            uArrayList5.add(iterator1.next().b());
                         }
                         uoe.f(uArrayList5);
                      }
                      obj.s = false;
                      Object[] objArray5 = new Object[false];
                      b.C().w("KCubeDynamicTabUpdatePresenter", "refresh cost "+(System.currentTimeMillis() - l1), objArray5);
                      break ;
                   }
                }
             }
          }
          return;
       }
    }
}
