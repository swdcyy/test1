package com.yxcorp.image.memory.RecycledBitmapExceptionTracker$subscriberMap$1;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.lang.Number;
import java.util.Collection;
import java.util.Map$Entry;
import e0d.h;
import e0d.d;

public final class RecycledBitmapExceptionTracker$subscriberMap$1 extends LinkedHashMap	// class@001a15
{

    public void RecycledBitmapExceptionTracker$subscriberMap$1(){
       super();
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof HashSet) {
          return this.containsValue(p0);
       }
       return false;
    }
    public boolean containsValue(HashSet p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public HashSet get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public HashSet getOrDefault(String p0,HashSet p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public HashSet remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public final boolean remove(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String && p1 instanceof HashSet) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public boolean remove(String p0,HashSet p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean i = this.size();
       d a = h.a;
       a = (a != null)? a.E: 256;
       i = (i > a)? true: false;
       return i;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, RecycledBitmapExceptionTracker$subscriberMap$1.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
