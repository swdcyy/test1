package com.yxcorp.gifshow.reddot.RedDotConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.common.collect.Range;
import java.lang.Comparable;
import java.util.TreeSet;
import k2b.f2;
import java.util.HashMap;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import com.yxcorp.gifshow.reddot.model.RedDotRange;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import lnc.q8;
import qk.k0;
import com.google.common.collect.TreeRangeSet;
import java.lang.StringBuilder;
import java.lang.Iterable;
import qk.y;
import ekd.s0;

public class RedDotConfig implements Serializable	// class@0017c0
{
    public boolean b;
    public final Map c;
    public Map d;
    public final Map e;
    public final Set f;
    public List mEnableRedDotRanges;
    public List mEnableRedDotRangesBubble;
    public List mEnableRedDotTypes;
    public static final long serialVersionUID = 0xcaa73e36f077711d;

    public void RedDotConfig(){
       super();
       this.mEnableRedDotTypes = Collections.emptyList();
       this.mEnableRedDotRanges = Collections.emptyList();
       this.mEnableRedDotRangesBubble = Collections.emptyList();
       this.c = Maps.q();
       this.d = Collections.emptyMap();
       this.e = Maps.q();
       this.f = o.g();
    }
    public final Set a(int p0){
       Set obj;
       TreeSet treeSet;
       if (PatchProxy.isSupport(RedDotConfig.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RedDotConfig.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.e.get(Integer.valueOf(p0));
       if (obj == null) {
          Iterator iterator = this.d.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             Iterator iterator1 = uEntry.getValue().iterator();
             while (iterator1.hasNext()) {
                Range range = iterator1.next();
                if (range.contains(Integer.valueOf(p0))) {
                   if (obj == null) {
                      treeSet = new TreeSet();
                      this.e.put(Integer.valueOf(p0), treeSet);
                   }
                   treeSet.add(uEntry.getKey());
                }
             }
          }
          if (obj == null) {
             treeSet = Collections.emptySet();
             this.e.put(Integer.valueOf(p0), treeSet);
          }
          Object[] objArray = new Object[]{treeSet,Integer.valueOf(p0)};
          f2.b("RedDotConfig", "getRangeTypes ranges:= %1$s; type=%2$s ", objArray);
       }
       return treeSet;
    }
    public final void b(){
       Object[] objArray1;
       RedDotConfig tmEnableRedD;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RedDotConfig.class, "8")) {
          return;
       }
       HashMap hashMap = Maps.s();
       if (!q.f(this.mEnableRedDotTypes)) {
          Iterator iterator = this.mEnableRedDotTypes.iterator();
          while (iterator.hasNext()) {
             this.c.put(iterator.next(), Boolean.TRUE);
          }
       }
       int i = 1;
       if (q.f(this.mEnableRedDotRanges)) {
          objArray1 = new Object[0];
          f2.b("RedDotConfig", "Ranges V1 enabled, but not download, load local default", objArray1);
          ArrayList uArrayList = PatchProxy.apply(objArray, objArray, RedDotConfig.class, "10");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             RedDotRange[] redDotRangeA = new RedDotRange[i];
             redDotRangeA[0] = RedDotRange.of("notify", 100, 1000);
             uArrayList = Lists.e(redDotRangeA);
          }
          this.c(hashMap, uArrayList, objArray);
       }else {
          objArray1 = new Object[0];
          f2.b("RedDotConfig", "Ranges V1 enabled, load download data", objArray1);
          tmEnableRedD = this.mEnableRedDotRanges;
          Object[] objArray2 = (q8.a().booleanValue())? objArray: this.f;
          this.c(hashMap, tmEnableRedD, objArray2);
       }
       if (q.f(this.mEnableRedDotRangesBubble)) {
          objArray = new Object[0];
          f2.b("RedDotConfig", "Ranges V2 enabled, but not download, load local data", objArray);
       }else {
          objArray1 = new Object[0];
          f2.b("RedDotConfig", "Ranges V2 enabled, load download data", objArray1);
          tmEnableRedD = this.mEnableRedDotRangesBubble;
          if (!q8.a().booleanValue()) {
             objArray = this.f;
          }
          this.c(hashMap, tmEnableRedD, objArray);
       }
       objArray = new Object[]{this.c,hashMap};
       f2.b("RedDotConfig", "Final Config info types := %1$s; Ranges=%2$s", objArray);
       if (hashMap.isEmpty()) {
          this.d = Collections.emptyMap();
       }else {
          this.d = Maps.q();
          Iterator iterator1 = hashMap.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry = iterator1.next();
             String key = uEntry.getKey();
             this.d.put(key, uEntry.getValue().asRanges());
          }
       }
       return;
    }
    public final void c(Map p0,List p1,Set p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RedDotConfig.class, "9")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          RedDotRange redDotRange = iterator.next();
          RedDotRange mRangeType = redDotRange.mRangeType;
          if (p2 != null && !p2.contains(mRangeType)) {
             continue ;
          }else {
             k0 ok0 = p0.get(mRangeType);
             if (ok0 == null) {
                ok0 = TreeRangeSet.create();
                p0.put(mRangeType, ok0);
             }
             if (!q.f(redDotRange.mValues)) {
                Iterator iterator1 = redDotRange.mValues.iterator();
                while (iterator1.hasNext()) {
                   Integer integer = iterator1.next();
                   if (integer == null) {
                      continue ;
                   }
                   this.c.put(integer, Boolean.TRUE);
                   ok0.add(Range.singleton(integer));
                }
             }else {
                mRangeType = redDotRange.mStart;
                if (mRangeType == redDotRange.mEnd) {
                   this.c.put(Integer.valueOf(mRangeType), Boolean.TRUE);
                }
                ok0.add(Range.closed(Integer.valueOf(redDotRange.mStart), Integer.valueOf(redDotRange.mEnd)));
             }
          }
       }
       return;
    }
    public boolean checkEnabled(int p0){
       Boolean obj;
       if (PatchProxy.isSupport(RedDotConfig.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RedDotConfig.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.c.get(Integer.valueOf(p0));
       if (obj == null) {
          obj = Boolean.valueOf((this.a(p0).isEmpty() ^ 0x01));
          this.c.put(Integer.valueOf(p0), obj);
       }
       return obj.booleanValue();
    }
    public boolean checkEnabled(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.containsKey(p0);
    }
    public boolean checkEnabled(String p0,int p1){
       Set obj;
       if (PatchProxy.isSupport(RedDotConfig.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, RedDotConfig.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.e.get(Integer.valueOf(p1));
       if (obj != null) {
          return obj.contains(p0);
       }else {
          Object[] objArray = new Object[0];
          f2.b("RedDotConfig", "first checkEnabled false£¬ rangeType "+p0+" type "+p1+" enableLoadAllRedType "+q8.a(), objArray);
          if (q8.a().booleanValue()) {
             return this.a(p1).contains(p0);
          }else if(!this.checkEnabled(p0)){
             this.e.put(Integer.valueOf(p1), Collections.emptySet());
             Object[] objArray1 = new Object[0];
             f2.b("RedDotConfig", "checkEnabled false£¬ rangeType "+p0+" type "+p1, objArray1);
             return 0;
          }else {
             return (this.a(p1).contains(p0) ^ 0x01);
          }
       }
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof RedDotConfig) {
          return false;
       }
       if (!y.g(this.mEnableRedDotTypes, p0.mEnableRedDotTypes) || (!y.g(this.mEnableRedDotRanges, p0.mEnableRedDotRanges) || !y.g(this.mEnableRedDotRangesBubble, p0.mEnableRedDotRangesBubble))) {
          b = false;
       }
       return b;
    }
    public Set getRedDotRanges(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedDotConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.get(p0);
    }
    public synchronized boolean updateRedDotConfigs(Set p0){
       RedDotConfig obj = PatchProxy.applyOneRefs(p0, this, RedDotConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.add("notify");
       obj = null;
       boolean b = true;
       if (this.b == null) {
          this.b = b;
          obj = 1;
       }
       if (!s0.a(p0, this.f)) {
          this.f.clear();
          this.f.addAll(p0);
       }else {
          b = obj;
       }
       if (b != null) {
          this.c.clear();
          this.e.clear();
          this.d.clear();
          this.b();
       }
       return b;
    }
}
