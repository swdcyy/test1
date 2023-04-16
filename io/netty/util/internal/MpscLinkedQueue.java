package io.netty.util.internal.MpscLinkedQueue;
import java.util.Queue;
import io.netty.util.internal.MpscLinkedQueueTailRef;
import io.netty.util.internal.MpscLinkedQueue$a;
import java.lang.Object;
import zqd.l;
import io.netty.util.internal.MpscLinkedQueueHeadRef;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Collection;
import java.util.Objects;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import zqd.u;
import java.io.ObjectInputStream;
import java.lang.UnsupportedOperationException;
import java.io.ObjectOutputStream;

public final class MpscLinkedQueue extends MpscLinkedQueueTailRef implements Queue	// class@001116
{
    public long p00;
    public long p01;
    public long p02;
    public long p03;
    public long p04;
    public long p05;
    public long p06;
    public long p07;
    public long p30;
    public long p31;
    public long p32;
    public long p33;
    public long p34;
    public long p35;
    public long p36;
    public long p37;
    public static final long serialVersionUID = 0xe5ee92d4b6ab73ef;

    public void MpscLinkedQueue(){
       super();
       MpscLinkedQueue$a uoa = new MpscLinkedQueue$a(null);
       this.setHeadRef(uoa);
       this.setTailRef(uoa);
    }
    public boolean add(Object p0){
       if (this.offer(p0)) {
          return true;
       }
       throw new IllegalStateException("queue full");
    }
    public boolean addAll(Collection p0){
       Objects.requireNonNull(p0, "c");
       if (p0 == this) {
          throw new IllegalArgumentException("c == this");
       }
       boolean b = false;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.add(iterator.next());
          b = true;
       }
       return b;
    }
    public final l b(){
       l ol = this.headRef();
       l ol1 = ol.b();
       if (ol1 == null && ol != this.tailRef()) {
          do {
             ol1 = ol.b();
          } while (ol1 != null);
       }
       return ol1;
    }
    public void clear(){
       do {
       } while (this.poll() != null);
       return;
    }
    public boolean contains(Object p0){
       l ol = this.b();
       while (ol != null) {
          l obj = ol.e();
          if (obj == null) {
             return false;
          }
          if (obj == p0) {
             return true;
          }
          obj = ol.b();
          if (ol == obj) {
             break ;
          }else {
             ol = obj;
          }
       }
       return false;
    }
    public boolean containsAll(Collection p0){
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!this.contains(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public final List d(){
       ArrayList uArrayList = new ArrayList();
       this.l(uArrayList);
       return uArrayList;
    }
    public Object element(){
       Object obj = this.peek();
       if (obj != null) {
          return obj;
       }
       throw new NoSuchElementException();
    }
    public boolean isEmpty(){
       boolean b = (this.headRef() == this.tailRef())? true: false;
       return b;
    }
    public Iterator iterator(){
       return new u(this.d().iterator());
    }
    public final List l(List p0){
       l ol = this.b();
       while (ol != null) {
          l obj = ol.e();
          if (obj == null || !p0.add(obj)) {
             break ;
          }else {
             obj = ol.b();
             if (ol == obj) {
                break ;
             }else {
                ol = obj;
             }
          }
       }
       return p0;
    }
    public boolean offer(Object p0){
       Objects.requireNonNull(p0, "value");
       if (p0 instanceof l) {
          p0.c(null);
       }else {
          p0 = new MpscLinkedQueue$a(p0);
       }
       this.getAndSetTailRef(p0).c(p0);
       return true;
    }
    public Object peek(){
       l ol = this.b();
       if (ol == null) {
          return null;
       }
       return ol.e();
    }
    public Object poll(){
       l ol = this.b();
       if (ol == null) {
          return null;
       }
       this.lazySetHeadRef(ol);
       this.headRef().d();
       return ol.a();
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       MpscLinkedQueue$a uoa = new MpscLinkedQueue$a(null);
       this.setHeadRef(uoa);
       this.setTailRef(uoa);
       Object obj = p0.readObject();
       while (obj != null) {
          this.add(obj);
       }
       return;
    }
    public Object remove(){
       Object obj = this.poll();
       if (obj != null) {
          return obj;
       }
       throw new NoSuchElementException();
    }
    public boolean remove(Object p0){
       throw new UnsupportedOperationException();
    }
    public boolean removeAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public boolean retainAll(Collection p0){
       throw new UnsupportedOperationException();
    }
    public int size(){
       l ol = this.b();
       int i = 0;
       while (ol != null && ol.e() != null) {
          l ol1 = ol.b();
          if (ol == ol1) {
             break ;
          }else {
             i = i + 1;
             if (i == Integer.MAX_VALUE) {
                break ;
             }else {
                ol = ol1;
             }
          }
       }
       return i;
    }
    public Object[] toArray(){
       return this.d().toArray();
    }
    public Object[] toArray(Object[] p0){
       ArrayList uArrayList = new ArrayList(p0.length);
       this.l(uArrayList);
       return uArrayList.toArray(p0);
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       Iterator iterator = this.iterator();
       while (iterator.hasNext()) {
          p0.writeObject(iterator.next());
       }
       p0.writeObject(null);
       return;
    }
}
