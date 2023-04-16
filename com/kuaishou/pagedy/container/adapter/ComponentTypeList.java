package com.kuaishou.pagedy.container.adapter.ComponentTypeList;
import do4.i;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import do4.a;
import do4.b;
import do4.o;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.NoSuchElementException;
import java.lang.Number;
import android.view.ViewGroup;
import qrd.l1;
import com.kuaishou.pagedy.container.adapter.ComponentTypeList$unRegisterComponent$1;
import msd.l;
import trd.y;
import java.lang.Boolean;
import com.kuaishou.pagedy.container.adapter.ComponentTypeList$toString$1;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class ComponentTypeList implements i	// class@000a4a
{
    public final List a;
    public final int b;

    public void ComponentTypeList(){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       this.b = uArrayList.size();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ComponentTypeList.class, "2")) {
          return;
       }
       a.p(p0, "component");
       String componentNam = p0.getComponentName();
       a.o(componentNam, "component.componentName");
       this.a.add(new a(componentNam, p0, new b()));
       return;
    }
    public a b(int p0){
       ComponentTypeList uComponentTy = ComponentTypeList.class;
       if (PatchProxy.isSupport(uComponentTy)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uComponentTy, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a.get(p0);
    }
    public a c(String p0){
       a uoa;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, ComponentTypeList.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "typeName");
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             throw new NoSuchElementException("Collection contains no element matching the predicate.");
          }
          uoa = obj.next();
          if (a.g(uoa.c(), p0)) {
             break ;
          }
       }
       return uoa.a();
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ComponentTypeList.class, "1")) {
          return;
       }
       a.p(p0, "type");
       this.a.add(p0);
       return;
    }
    public int e(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, ComponentTypeList.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "typeName");
       int i = 0;
       obj = this.a.iterator();
       while (true) {
          if (obj.hasNext()) {
             if (a.g(obj.next().c(), p0)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public void f(ViewGroup p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ComponentTypeList.class, "3")) {
          return;
       }
       a.p(p1, "component");
       String componentNam = p1.getComponentName();
       a.o(componentNam, "component.componentName");
       b uob = new b();
       uob.a = p0;
       this.a.add(new a(componentNam, p1, uob));
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ComponentTypeList.class, "4")) {
          return;
       }
       a.p(p0, "typeName");
       y.K0(this.a, new ComponentTypeList$unRegisterComponent$1(p0));
       return;
    }
    public int getSize(){
       return this.b;
    }
    public a h(String p0){
       a uoa;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, ComponentTypeList.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "typeName");
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             throw new NoSuchElementException("Collection contains no element matching the predicate.");
          }
          uoa = obj.next();
          if (a.g(uoa.a().getComponentName(), p0)) {
             break ;
          }
       }
       return uoa;
    }
    public boolean i(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ComponentTypeList.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "component");
       boolean b = false;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          if (a.g(iterator.next().a().getComponentName(), p0.getComponentName())) {
             b = true;
          }
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ComponentTypeList.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CollectionsKt___CollectionsKt.V2(this.a, null, null, null, 0, null, ComponentTypeList$toString$1.INSTANCE, 31, null);
    }
}
