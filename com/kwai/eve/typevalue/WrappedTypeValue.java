package com.kwai.eve.typevalue.WrappedTypeValue;
import ml5.c;
import java.util.HashMap;
import ml5.a;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import kotlin.jvm.internal.a;
import trd.t0;
import java.lang.Number;
import java.util.Collection;
import rsd.f;
import com.kwai.eve.typevalue.WrappedTypeValue$a;
import vsd.n;
import vsd.c;
import java.util.Objects;

public class WrappedTypeValue extends HashMap implements c	// class@000dd6
{
    public a wrapped;

    public void WrappedTypeValue(){
       super();
       this.wrapped = new a(this);
    }
    public a asTypeValue(){
       return this.wrapped;
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrappedTypeValue.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrappedTypeValue.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public void fromTypeValue(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WrappedTypeValue.class, "1")) {
          return;
       }
       a.p(p0, "typeValue");
       this.clear();
       Map map = p0.d();
       if (map == null) {
          map = t0.z();
       }
       this.putAll(map);
       this.wrapped = p0;
       return;
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrappedTypeValue.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public Object get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrappedTypeValue.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrappedTypeValue.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public Object getOrDefault(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrappedTypeValue.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public final f property(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WrappedTypeValue$a();
    }
    public final f property(Object p0,n p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrappedTypeValue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "property");
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Any");
       this.put(p1.getName(), p0);
       return new WrappedTypeValue$a();
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrappedTypeValue.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public Object remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WrappedTypeValue.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public final boolean remove(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrappedTypeValue.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String && p1 != null) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public boolean remove(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrappedTypeValue.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, WrappedTypeValue.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
