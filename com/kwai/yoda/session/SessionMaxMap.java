package com.kwai.yoda.session.SessionMaxMap;
import java.util.LinkedHashMap;
import com.kwai.yoda.session.SessionMaxMap$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import mz7.a;
import java.util.Set;
import java.lang.Number;
import java.util.Collection;
import java.util.Map$Entry;

public final class SessionMaxMap extends LinkedHashMap	// class@0012d1
{
    public static final SessionMaxMap$a Companion;

    static {
       SessionMaxMap.Companion = new SessionMaxMap$a(null);
    }
    public void SessionMaxMap(){
       super();
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof a) {
          return this.containsValue(p0);
       }
       return false;
    }
    public boolean containsValue(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public a get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SessionMaxMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public a getOrDefault(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SessionMaxMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public a remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public final boolean remove(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SessionMaxMap.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = 1;
       v1 = (p0 != null)? p0 instanceof String: 1;
       if (v1) {
          if (p1 != null) {
             v0 = p1 instanceof a;
          }
          if (obj) {
             return this.remove(p0, p1);
          }
       }
       return false;
    }
    public boolean remove(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SessionMaxMap.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, SessionMaxMap.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 10)? true: false;
       return b;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, SessionMaxMap.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
