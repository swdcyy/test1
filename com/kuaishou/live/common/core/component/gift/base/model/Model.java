package com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.util.concurrent.ConcurrentHashMap;
import ah1.d;
import com.kuaishou.live.common.core.component.gift.base.model.Model$c;
import androidx.lifecycle.MutableLiveData;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.base.model.Model$b;
import java.util.Map;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.common.core.component.gift.base.model.Model$observer$1;
import androidx.lifecycle.LifecycleObserver;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import qrd.l1;
import java.util.Collection;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public class Model	// class@00114b
{
    public final List b;
    public final ConcurrentHashMap c;
    public final MutableLiveData d;
    public final String e;
    public final Object f;
    public final boolean g;
    public final boolean h;

    public void Model(String p0,Object p1,boolean p2,boolean p3){
       d uod1;
       a.p(p0, "name");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.b = LiveLogTag.GIFT.appendTag("Model");
       this.c = new ConcurrentHashMap();
       d uod = null;
       if (p2) {
          if (p1 == null) {
             uod = new d();
          }else {
             uod1 = new d(new Model$c("[Model][init]", uod, p1));
          label_004b :
             uod = uod1;
          }
       }else if(p1 == null){
          MutableLiveData mutableLiveD = new MutableLiveData();
       }else {
          uod1 = new MutableLiveData(new Model$c("[Model][init]", uod, p1));
          goto label_004b ;
       }
       this.d = uod;
       return;
    }
    public void Model(String p0,Object p1,boolean p2,boolean p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, null, p2, p3);
       return;
    }
    public final Object a(){
       Object[] objArray = null;
       Model$c obj = PatchProxy.apply(objArray, this, Model.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.getValue();
       if (obj != null) {
          objArray = obj.a();
       }
       return objArray;
    }
    public final void b(LifecycleOwner p0,Model$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Model.class, "1")) {
          return;
       }
       a.p(p0, "lifecycleOwner");
       a.p(p1, "observer");
       if (this.c.containsKey(p1)) {
          return;
       }
       Model$d uod = new Model$d(p1);
       this.d.observe(p0, uod);
       this.c.put(p1, new Model$b(p0, uod));
       p0.getLifecycle().addObserver(new Model$observer$1(this, p1));
       return;
    }
    public final void c(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Model.class, "6")) {
          return;
       }
       a.p(p0, "owner");
       this.d.removeObservers(p0);
       Model tc = this.c;
       ArrayList uArrayList = new ArrayList(tc.size());
       Iterator iterator = tc.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (a.g(uEntry.getValue().a, p0)) {
             this.c.remove(uEntry.getKey());
          }
          uArrayList.add(l1.a);
       }
       return;
    }
    public final void d(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Model.class, "3")) {
          return;
       }
       a.p(p0, "source");
       Model$c value = this.d.getValue();
       Object obj = (value != null)? value.a(): null;
       if (this.h != null) {
          b.P(this.b, "name:"+this.e+",source:"+p0+",old:"+obj+",new:"+p1);
       }
       this.d.setValue(new Model$c(p0, obj, p1));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, Model.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.d.getValue());
    }
}
