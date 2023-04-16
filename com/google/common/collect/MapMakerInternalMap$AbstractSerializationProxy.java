package com.google.common.collect.MapMakerInternalMap$AbstractSerializationProxy;
import java.io.Serializable;
import qk.q;
import com.google.common.collect.MapMakerInternalMap$Strength;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.Map;
import java.io.ObjectInputStream;
import com.google.common.collect.g;
import java.lang.String;
import ok.n;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public abstract class MapMakerInternalMap$AbstractSerializationProxy extends q implements Serializable	// class@001824
{
    public final int concurrencyLevel;
    public ConcurrentMap delegate;
    public final Equivalence keyEquivalence;
    public final MapMakerInternalMap$Strength keyStrength;
    public final Equivalence valueEquivalence;
    public final MapMakerInternalMap$Strength valueStrength;
    public static final long serialVersionUID = 0x3;

    public void MapMakerInternalMap$AbstractSerializationProxy(MapMakerInternalMap$Strength p0,MapMakerInternalMap$Strength p1,Equivalence p2,Equivalence p3,int p4,ConcurrentMap p5){
       super();
       this.keyStrength = p0;
       this.valueStrength = p1;
       this.keyEquivalence = p2;
       this.valueEquivalence = p3;
       this.concurrencyLevel = p4;
       this.delegate = p5;
    }
    public Object delegate(){
       return this.delegate();
    }
    public Map delegate(){
       return this.delegate();
    }
    public ConcurrentMap delegate(){
       return this.delegate;
    }
    public void readEntries(ObjectInputStream p0){
       Object obj = p0.readObject();
       while (obj != null) {
          this.delegate.put(obj, p0.readObject());
       }
       return;
    }
    public g readMapMaker(ObjectInputStream p0){
       int i = p0.readInt();
       g og = new g();
       g b = og.b;
       boolean i1 = -1;
       boolean b1 = false;
       boolean b2 = (b == i1)? true: false;
       n.p(b2, "initial capacity was already set to %s", b);
       boolean b3 = (i >= 0)? true: false;
       n.b(b3);
       og.b = i;
       MapMakerInternalMap$AbstractSerializationProxy tkeyStrength = this.keyStrength;
       b = og.d;
       b2 = (b == null)? true: false;
       n.r(b2, "Key strength was already set to %s", b);
       n.j(tkeyStrength);
       og.d = tkeyStrength;
       MapMakerInternalMap$Strength sTRONG = MapMakerInternalMap$Strength.STRONG;
       if (tkeyStrength != sTRONG) {
          og.a = true;
       }
       tkeyStrength = this.valueStrength;
       g e = og.e;
       boolean b4 = (e == null)? true: false;
       n.r(b4, "Value strength was already set to %s", e);
       n.j(tkeyStrength);
       og.e = tkeyStrength;
       if (tkeyStrength != sTRONG) {
          og.a = true;
       }
       tkeyStrength = this.keyEquivalence;
       b = og.f;
       b2 = (b == null)? true: false;
       n.r(b2, "key equivalence was already set to %s", b);
       n.j(tkeyStrength);
       og.f = tkeyStrength;
       og.a = true;
       tkeyStrength = this.concurrencyLevel;
       b = og.c;
       i1 = (b == i1)? true: false;
       n.p(i1, "concurrency level was already set to %s", b);
       if (tkeyStrength > null) {
          b1 = true;
       }
       n.b(b1);
       og.c = tkeyStrength;
       return og;
    }
    public void writeMapTo(ObjectOutputStream p0){
       p0.writeInt(this.delegate.size());
       Iterator iterator = this.delegate.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeObject(uEntry.getKey());
          p0.writeObject(uEntry.getValue());
       }
       p0.writeObject(null);
       return;
    }
}
