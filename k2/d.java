package k2.d;
import androidx.lifecycle.ViewModel;
import k2.d$a;
import java.util.HashSet;
import java.util.HashMap;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Class;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManagerImpl;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Collection;
import k2.c;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Map;
import java.lang.System;
import java.lang.Integer;

public class d extends ViewModel	// class@00245a
{
    public final HashSet a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public static final ViewModelProvider$Factory g;

    static {
       d.g = new d$a();
    }
    public void d(boolean p0){
       super();
       this.a = new HashSet();
       this.b = new HashMap();
       this.c = new HashMap();
       this.e = false;
       this.f = false;
       this.d = p0;
    }
    public static d r0(ViewModelStore p0){
       return new ViewModelProvider(p0, d.g).get(d.class);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || d.class != p0.getClass()) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || !this.c.equals(p0.c))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode());
    }
    public boolean o0(Fragment p0){
       return this.a.add(p0);
    }
    public void onCleared(){
       if (FragmentManagerImpl.DEBUG) {
          StringBuilder str = "onCleared called for "+this;
       }
       this.e = true;
       return;
    }
    public void p0(Fragment p0){
       if (FragmentManagerImpl.DEBUG) {
          p0.toString();
       }
       d uod = this.b.get(p0.mWho);
       if (uod != null) {
          uod.onCleared();
          this.b.remove(p0.mWho);
       }
       ViewModelStore viewModelSto = this.c.get(p0.mWho);
       if (viewModelSto != null) {
          viewModelSto.clear();
          this.c.remove(p0.mWho);
       }
       return;
    }
    public d q0(Fragment p0){
       d uod = this.b.get(p0.mWho);
       if (uod == null) {
          uod = new d(this.d);
          this.b.put(p0.mWho, uod);
       }
       return uod;
    }
    public Collection s0(){
       return this.a;
    }
    public c t0(){
       c uoc = null;
       if (this.a.isEmpty() && (this.b.isEmpty() && this.c.isEmpty())) {
          return uoc;
       }
       HashMap hashMap = new HashMap();
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          c uoc1 = uEntry.getValue().t0();
          if (uoc1 != null) {
             hashMap.put(uEntry.getKey(), uoc1);
          }
       }
       this.f = true;
       if (this.a.isEmpty() && (hashMap.isEmpty() && this.c.isEmpty())) {
          return uoc;
       }
       return new c(new ArrayList(this.a), hashMap, new HashMap(this.c));
    }
    public String toString(){
       StringBuilder str = "FragmentManagerViewModel{"+Integer.toHexString(System.identityHashCode(this))+"} Fragments \(";
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next();
          if (iterator.hasNext()) {
             str = str+", ";
          }
       }
       str = str+"\) Child Non Config \(";
       iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next();
          if (iterator.hasNext()) {
             str = str+", ";
          }
       }
       str = str+"\) ViewModelStores \(";
       iterator = this.c.keySet().iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next();
          if (iterator.hasNext()) {
             str = str+", ";
          }
       }
       return str+')';
    }
    public ViewModelStore u0(Fragment p0){
       ViewModelStore viewModelSto = this.c.get(p0.mWho);
       if (viewModelSto == null) {
          viewModelSto = new ViewModelStore();
          this.c.put(p0.mWho, viewModelSto);
       }
       return viewModelSto;
    }
    public boolean v0(){
       return this.e;
    }
    public boolean w0(Fragment p0){
       return this.a.remove(p0);
    }
    public void x0(c p0){
       this.a.clear();
       this.b.clear();
       this.c.clear();
       if (p0 != null) {
          Collection uCollection = p0.b();
          if (uCollection != null) {
             this.a.addAll(uCollection);
          }
          Map map = p0.a();
          if (map != null) {
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                d uod = new d(this.d);
                uod.x0(uEntry.getValue());
                this.b.put(uEntry.getKey(), uod);
             }
          }
          Map map1 = p0.c();
          if (map1 != null) {
             this.c.putAll(map1);
          }
       }
       this.f = false;
       return;
    }
    public boolean y0(Fragment p0){
       if (!this.a.contains(p0)) {
          return true;
       }
       if (this.d != null) {
          return this.e;
       }
       return (this.f ^ true);
    }
}
