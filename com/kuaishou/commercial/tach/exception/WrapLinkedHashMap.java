package com.kuaishou.commercial.tach.exception.WrapLinkedHashMap;
import java.util.LinkedHashMap;
import com.kuaishou.commercial.tach.exception.WrapLinkedHashMap$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import a00.b;
import java.util.Set;
import java.lang.Number;
import java.util.Collection;
import java.util.Map$Entry;

public final class WrapLinkedHashMap extends LinkedHashMap	// class@001687
{
    public static final WrapLinkedHashMap$a Companion;

    static {
       WrapLinkedHashMap.Companion = new WrapLinkedHashMap$a(null);
    }
    public void WrapLinkedHashMap(){
       super();
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public boolean containsValue(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof b) {
          return this.containsValue(p0);
       }
       return false;
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public b get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public b getOrDefault(String p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrapLinkedHashMap.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrapLinkedHashMap.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public b remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public final boolean remove(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrapLinkedHashMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String && p1 instanceof b) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public boolean remove(String p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrapLinkedHashMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, WrapLinkedHashMap.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 3)? true: false;
       return b;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, WrapLinkedHashMap.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
