package com.kwai.framework.util.gson.GsonLifeCycleEnabler;
import zk.j;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.framework.util.gson.GsonLifeCycleTypeAdapterWrapper;
import java.util.List;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkd.a;
import java.lang.reflect.Type;
import java.util.Iterator;
import com.kwai.framework.util.gson.GsonLifeCycleEnabler$a;

public class GsonLifeCycleEnabler implements j	// class@000ce4
{
    public List b;
    public List c;
    public List d;
    public static final GsonLifeCycleEnabler e;

    static {
       GsonLifeCycleEnabler.e = new GsonLifeCycleEnabler();
    }
    public void GsonLifeCycleEnabler(){
       super();
       this.b = new CopyOnWriteArrayList();
       this.c = new CopyOnWriteArrayList();
       this.d = new CopyOnWriteArrayList();
       this.c.add(GsonLifeCycleTypeAdapterWrapper.class);
    }
    public static GsonLifeCycleEnabler d(){
       return GsonLifeCycleEnabler.e;
    }
    public TypeAdapter a(Gson p0,a p1){
       TypeAdapter typeAdapter;
       Iterator obj = PatchProxy.applyTwoRefs(p0, p1, this, GsonLifeCycleEnabler.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.class.isAssignableFrom(p1.getRawType())) {
          return null;
       }
       if (this.b.contains(p1.getType())) {
          return null;
       }
       obj = this.d.iterator();
       while (true) {
          if (obj.hasNext()) {
             if (obj.next().a(p1.getType())) {
                return null;
             }
             continue ;
          }else {
             typeAdapter = p0.l(this, p1);
             Iterator iterator = this.c.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().isInstance(typeAdapter)) {
                      return null;
                   }
                   continue ;
                }else {
                }
             }
          }
       }
       return new GsonLifeCycleTypeAdapterWrapper(typeAdapter);
    }
    public void b(Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GsonLifeCycleEnabler.class, "1")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public void c(GsonLifeCycleEnabler$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GsonLifeCycleEnabler.class, "2")) {
          return;
       }
       if (this.d.contains(p0)) {
          return;
       }
       this.d.add(p0);
       return;
    }
}
