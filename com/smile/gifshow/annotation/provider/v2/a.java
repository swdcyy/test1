package com.smile.gifshow.annotation.provider.v2.a;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import im8.f;
import com.google.common.base.Optional;
import mm8.c;
import ok.h;
import mm8.d;
import java.lang.Class;

public final class a	// class@000c4e
{
    public Map a;
    public Map b;

    public void a(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
    }
    public Accessor a(String p0){
       return this.a.get(p0);
    }
    public Set b(){
       return this.a.keySet();
    }
    public Set c(){
       HashSet hashSet = new HashSet();
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          Optional.fromNullable(iterator.next().get()).transform(new c(hashSet));
       }
       iterator = this.b.values().iterator();
       while (iterator.hasNext()) {
          Optional.fromNullable(iterator.next().get()).transform(new d(hashSet));
       }
       return hashSet;
    }
    public Set d(){
       return this.b.keySet();
    }
    public a e(a p0){
       this.a.putAll(p0.a);
       this.b.putAll(p0.b);
       return this;
    }
    public Object f(Class p0){
       Accessor uAccessor = this.b.get(p0);
       if (uAccessor == null) {
          return null;
       }
       return uAccessor.get();
    }
    public Object g(String p0){
       Accessor uAccessor = this.a.get(p0);
       if (uAccessor == null) {
          return null;
       }
       return uAccessor.get();
    }
    public a h(Class p0,Accessor p1){
       this.b.put(p0, p1);
       return this;
    }
    public a i(String p0,Accessor p1){
       this.a.put(p0, p1);
       return this;
    }
    public void j(Class p0,Object p1){
       Accessor uAccessor = this.b.get(p0);
       if (uAccessor == null) {
          return;
       }
       uAccessor.set(p1);
       return;
    }
    public void k(String p0,Object p1){
       Accessor uAccessor = this.a.get(p0);
       if (uAccessor == null) {
          return;
       }
       uAccessor.set(p1);
       return;
    }
}
