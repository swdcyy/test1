package com.yxcorp.gifshow.homepage.activity.NewActivityTabDataManagerImpl;
import hsa.g;
import java.lang.Object;
import java.util.ArrayList;
import hsa.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.homepage.activity.NewActivityTabDataManagerImpl$removeActivityTabStatusChangeListener$1;
import java.util.List;
import msd.l;
import trd.y;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import cta.e;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import cta.b;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import java.util.Collection;
import java.lang.ref.WeakReference;
import java.lang.Boolean;

public class NewActivityTabDataManagerImpl implements g	// class@0016a3
{
    public final List a;

    public void NewActivityTabDataManagerImpl(){
       super();
       this.a = new ArrayList();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewActivityTabDataManagerImpl.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       y.K0(this.a, new NewActivityTabDataManagerImpl$removeActivityTabStatusChangeListener$1(p0));
       return;
    }
    public List b(){
       List obj = PatchProxy.apply(null, this, NewActivityTabDataManagerImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-920422449).c();
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().b());
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          Object obj1 = iterator1.next();
          Object obj2 = obj1;
          obj2 = (a.g(obj2.mType, "ato_operate") && obj2.mActivityTabConfig != null)? 1: null;
          if (obj2) {
             uArrayList1.add(obj1);
          }
       }
       return uArrayList1;
    }
    public void c(b p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, NewActivityTabDataManagerImpl.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!a.g(obj.get(), p0)) {
                continue ;
             }
          }else {
             obj = null;
          }
          if (obj == null) {
             this.a.add(new WeakReference(p0));
             break ;
          }
          break ;
       }
       return;
    }
    public void d(boolean p0){
       NewActivityTabDataManagerImpl newActivityT = NewActivityTabDataManagerImpl.class;
       if (PatchProxy.isSupport(newActivityT) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, newActivityT, "4")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next().get();
          if (uob != null) {
             uob.a(p0);
          }
       }
       return;
    }
}
