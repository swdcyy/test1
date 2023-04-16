package com.kwai.sdk.eve.internal.common.scheduler.Schedulers$SequencedExecutorServices;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cn7.e;
import java.util.Set;
import kotlin.jvm.internal.a;
import java.util.Map;
import dn7.h;
import java.util.HashSet;
import java.util.Collection;
import java.lang.Number;
import java.util.ArrayList;

public final class Schedulers$SequencedExecutorServices extends HashMap	// class@001484
{

    public void Schedulers$SequencedExecutorServices(int p0){
       super(p0);
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public boolean containsValue(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof e) {
          return this.containsValue(p0);
       }
       return false;
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public final e forSeqId(String p0){
       h obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "seqId");
       _monitor_enter(this);
       obj = this.get(p0);
       if (obj == null) {
          obj = new h(p0);
          this.put(p0, obj);
       }
       _monitor_exit(this);
       return obj;
    }
    public e get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       _monitor_exit(this);
       return new HashSet(super.entrySet());
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       _monitor_exit(this);
       return new HashSet(super.keySet());
    }
    public e getOrDefault(String p0,e p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Schedulers$SequencedExecutorServices.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Schedulers$SequencedExecutorServices.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       _monitor_exit(this);
       return new ArrayList(super.values());
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public e remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Schedulers$SequencedExecutorServices.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public final boolean remove(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Schedulers$SequencedExecutorServices.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String && p1 instanceof e) {
          return this.remove(p0, p1);
       }
       return false;
    }
    public boolean remove(String p0,e p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Schedulers$SequencedExecutorServices.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, Schedulers$SequencedExecutorServices.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
