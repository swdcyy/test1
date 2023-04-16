package com.kwai.framework.kgi.sdk.internal.store.EvictingQueue;
import java.io.Serializable;
import a86.a;
import qk.u;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue$a;
import nsd.u;
import java.lang.String;
import ok.n;
import java.util.ArrayDeque;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Queue;
import java.util.Collection;
import kotlin.jvm.internal.a;
import qk.p;
import java.lang.Iterable;
import qk.y;
import qk.y$d;
import java.util.Iterator;
import java.lang.Number;

public final class EvictingQueue extends u implements Serializable, a	// class@0015a2
{
    public final Queue delegate;
    public a mListener;
    public final int maxSize;
    public static final EvictingQueue$a Companion;
    public static final long serialVersionUID;

    static {
       EvictingQueue.Companion = new EvictingQueue$a(null);
    }
    public void EvictingQueue(int p0){
       super();
       boolean b = (p0 >= 0)? true: false;
       n.d(b, "maxSize \(%s\) must >= 0", p0);
       this.delegate = new ArrayDeque(p0);
       this.maxSize = p0;
       return;
    }
    public void EvictingQueue(int p0,u p1){
       super(p0);
    }
    public static final EvictingQueue create(int p0){
       if (PatchProxy.isSupport(EvictingQueue.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, EvictingQueue.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return EvictingQueue.Companion.a(p0);
    }
    public boolean add(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvictingQueue.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       n.j(p0);
       if (this.maxSize == null) {
          return true;
       }
       if (this.size() == this.maxSize) {
          this.entryRemoved(this.delegate.remove());
       }
       this.delegate.add(p0);
       return true;
    }
    public boolean addAll(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvictingQueue.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elements");
       int i = p0.size();
       if (i < this.maxSize) {
          return this.standardAddAll(p0);
       }
       this.clear();
       Iterator iterator = y.p(p0, (i - this.maxSize)).iterator();
       while (iterator.hasNext()) {
          this.entryRemoved(iterator.next());
       }
       return y.a(this, y.s(p0, (i - this.maxSize)));
    }
    public boolean contains(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvictingQueue.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       n.j(p0);
       return this.delegate().contains(p0);
    }
    public Object delegate(){
       return this.delegate();
    }
    public Collection delegate(){
       return this.delegate();
    }
    public Queue delegate(){
       return this.delegate;
    }
    public void entryRemoved(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvictingQueue.class, "8")) {
          return;
       }
       EvictingQueue tmListener = this.mListener;
       if (tmListener != null) {
          tmListener.entryRemoved(p0);
       }
       return;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, EvictingQueue.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public boolean offer(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvictingQueue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.add(p0);
    }
    public final int remainingCapacity(){
       Object obj = PatchProxy.apply(null, this, EvictingQueue.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.maxSize - this.size());
    }
    public boolean remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvictingQueue.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       n.j(p0);
       boolean b = this.delegate().remove(p0);
       if (b) {
          this.entryRemoved(p0);
       }
       return b;
    }
    public final void setListener(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvictingQueue.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       if (p0 != this) {
          this.mListener = p0;
       }
       return;
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, EvictingQueue.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
}
