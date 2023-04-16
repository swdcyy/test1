package com.kuaishou.krn.context.KrnWeakViewTagManager;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.lang.Number;
import java.util.Collection;
import lj0.c;
import kotlin.jvm.internal.a;

public final class KrnWeakViewTagManager extends ConcurrentHashMap	// class@000853
{
    public static final KrnWeakViewTagManager INSTANCE;

    static {
       KrnWeakViewTagManager.INSTANCE = new KrnWeakViewTagManager();
    }
    public void KrnWeakViewTagManager(){
       super();
    }
    public boolean containsKey(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof Integer) {
          return this.containsKey(p0);
       }
       return false;
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof WeakReference) {
          return this.containsValue(p0);
       }
       return false;
    }
    public boolean containsValue(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Integer) {
          return this.get(p0);
       }
       return null;
    }
    public WeakReference get(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnWeakViewTagManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Integer) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public WeakReference getOrDefault(Integer p0,WeakReference p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnWeakViewTagManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final c getWeak(int p0){
       if (PatchProxy.isSupport(KrnWeakViewTagManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KrnWeakViewTagManager.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       WeakReference weakReferenc = super.get(Integer.valueOf(p0));
       c uoc = (weakReferenc != null)? weakReferenc.get(): null;
       return uoc;
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public final c putWeak(int p0,c p1){
       if (PatchProxy.isSupport(KrnWeakViewTagManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KrnWeakViewTagManager.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "value");
       this.put(Integer.valueOf(p0), new WeakReference(p1));
       return p1;
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Integer) {
          return this.remove(p0);
       }
       return null;
    }
    public WeakReference remove(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnWeakViewTagManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public boolean remove(Integer p0,WeakReference p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnWeakViewTagManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public final boolean remove(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnWeakViewTagManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof Integer && p1 instanceof WeakReference) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public final c removeWeak(int p0){
       if (PatchProxy.isSupport(KrnWeakViewTagManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KrnWeakViewTagManager.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       WeakReference weakReferenc = super.remove(Integer.valueOf(p0));
       c uoc = (weakReferenc != null)? weakReferenc.get(): null;
       return uoc;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, KrnWeakViewTagManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
