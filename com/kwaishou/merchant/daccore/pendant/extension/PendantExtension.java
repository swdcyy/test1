package com.kwaishou.merchant.daccore.pendant.extension.PendantExtension;
import e08.a;
import java.lang.Object;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension$dataMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwaishou.merchant.daccore.pendant.extension.PendantExtension$liveEventListeners$2;
import c08.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.gson.JsonObject;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import java.lang.String;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import brd.t;
import java.util.HashMap;
import n08.a;

public abstract class PendantExtension implements a	// class@001334
{
    public final p a;
    public final p b;
    public Class c;

    public void PendantExtension(){
       super();
       this.a = s.c(PendantExtension$dataMap$2.INSTANCE);
       this.b = s.c(PendantExtension$liveEventListeners$2.INSTANCE);
    }
    public void a(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().a(p0);
       }
       return;
    }
    public void b(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().b(p0);
       }
       return;
    }
    public void c(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().c(p0);
       }
       return;
    }
    public void d(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().d(p0);
       }
       return;
    }
    public void e(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().e(p0);
       }
       return;
    }
    public void f(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().f(p0);
       }
       return;
    }
    public void g(a p0){
       Iterator iterator = this.i().entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().g(p0);
       }
       return;
    }
    public void h(a p0,JsonObject p1,DataSource p2,String p3){
    }
    public final Map i(){
       return this.b.getValue();
    }
    public t j(a p0,String p1,DataSource p2,PendantMountInfo p3,JsonObject p4,String p5){
       return t.just(new HashMap());
    }
    public abstract t k(a p0,String p1,DataSource p2,JsonObject p3,String p4,a p5);
}
