package com.kuaishou.krn.context.KrnViewTagManager;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lj0.c;
import java.util.Set;
import java.lang.Number;
import lj0.e;
import com.kuaishou.krn.context.KrnWeakViewTagManager;
import java.util.Collection;
import kotlin.jvm.internal.a;

public final class KrnViewTagManager extends ConcurrentHashMap	// class@000852
{
    public static final KrnViewTagManager INSTANCE;

    static {
       KrnViewTagManager.INSTANCE = new KrnViewTagManager();
    }
    public void KrnViewTagManager(){
       super();
    }
    public boolean containsKey(Integer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnViewTagManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnViewTagManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof Integer) {
          return this.containsKey(p0);
       }
       return false;
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnViewTagManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof c) {
          return this.containsValue(p0);
       }
       return false;
    }
    public boolean containsValue(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnViewTagManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnViewTagManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Integer) {
          return this.get(p0.intValue());
       }
       return null;
    }
    public c get(int p0){
       if (PatchProxy.isSupport(KrnViewTagManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KrnViewTagManager.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (e.a()) {
          return KrnWeakViewTagManager.INSTANCE.getWeak(p0);
       }else {
          return super.get(Integer.valueOf(p0));
       }
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnViewTagManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Integer) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public c getOrDefault(Integer p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnViewTagManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public Object put(Object p0,Object p1){
       return this.put(p0.intValue(), p1);
    }
    public c put(int p0,c p1){
       if (PatchProxy.isSupport(KrnViewTagManager.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KrnViewTagManager.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "value");
       if (e.a()) {
          return KrnWeakViewTagManager.INSTANCE.putWeak(p0, p1);
       }else {
          return super.put(Integer.valueOf(p0), p1);
       }
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnViewTagManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Integer) {
          return this.remove(p0.intValue());
       }
       return null;
    }
    public c remove(int p0){
       if (PatchProxy.isSupport(KrnViewTagManager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KrnViewTagManager.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (e.a()) {
          return KrnWeakViewTagManager.INSTANCE.removeWeak(p0);
       }else {
          return super.remove(Integer.valueOf(p0));
       }
    }
    public boolean remove(Integer p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnViewTagManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public final boolean remove(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnViewTagManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof Integer && p1 instanceof c) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, KrnViewTagManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
