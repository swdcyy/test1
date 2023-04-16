package com.kwai.component.newuseraction.NewUserActionManagerImpl$FixSizeLinkedList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.component.newuseraction.NewUserActionManagerImpl$FixSizeLinkedList$a;
import java.util.Set;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map$Entry;
import java.lang.Boolean;

public class NewUserActionManagerImpl$FixSizeLinkedList extends LinkedHashMap	// class@0009e8
{
    public Lock mReadLock;
    public ReadWriteLock mReadWriteLock;
    public Lock mWriteLock;

    public void NewUserActionManagerImpl$FixSizeLinkedList(){
       super(10, 0x3f400000, false);
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.mReadWriteLock = reentrantRea;
       this.mReadLock = reentrantRea.readLock();
       this.mWriteLock = this.mReadWriteLock.writeLock();
    }
    public void add(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "4")) {
          return;
       }
       this.mWriteLock.lock();
       this.put(p0, null);
       this.mWriteLock.unlock();
       return;
    }
    public void addAll(Collection p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "5")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.mWriteLock.lock();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.put(iterator.next(), null);
       }
       this.mWriteLock.unlock();
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "2")) {
          return;
       }
       this.mWriteLock.lock();
       super.clear();
       this.mWriteLock.unlock();
       return;
    }
    public void forEach(NewUserActionManagerImpl$FixSizeLinkedList$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mReadLock.lock();
       Set set = this.keySet();
       if (q.f(set)) {
          this.mReadLock.unlock();
          return;
       }else {
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             p0.a(iterator.next());
          }
          this.mReadLock.unlock();
          return;
       }
    }
    public String join(CharSequence p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mReadLock.lock();
       this.mReadLock.unlock();
       return TextUtils.join(p0, this.keySet());
    }
    public Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mWriteLock.lock();
       this.mWriteLock.unlock();
       return super.remove(p0);
    }
    public boolean removeEldestEntry(Map$Entry p0){
       p0 = PatchProxy.applyOneRefs(p0, this, NewUserActionManagerImpl$FixSizeLinkedList.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.size() > 10)? true: false;
       return b;
    }
}
