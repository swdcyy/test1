package com.google.common.collect.LinkedListMultimap;
import qk.e0;
import java.io.Serializable;
import com.google.common.collect.a;
import java.util.Map;
import qk.j0;
import qk.g0;
import java.util.Set;
import java.lang.Object;
import java.util.NoSuchElementException;
import com.google.common.collect.LinkedListMultimap$g;
import com.google.common.collect.LinkedListMultimap$f;
import java.util.List;
import com.google.common.collect.LinkedListMultimap$i;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collections;
import com.google.common.collect.Multimaps$a;
import java.util.Collection;
import com.google.common.collect.LinkedListMultimap$b;
import com.google.common.collect.LinkedListMultimap$c;
import com.google.common.collect.k;
import com.google.common.collect.Multimaps$c;
import com.google.common.collect.LinkedListMultimap$d;
import java.lang.AssertionError;
import com.google.common.collect.LinkedListMultimap$a;
import java.lang.Iterable;
import java.io.ObjectInputStream;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.Iterators;
import java.lang.String;
import java.io.ObjectOutputStream;
import java.util.Map$Entry;

public class LinkedListMultimap extends a implements e0, Serializable	// class@0004ef
{
    public LinkedListMultimap$g head;
    public Map keyToKeyList;
    public int modCount;
    public int size;
    public LinkedListMultimap$g tail;
    public static final long serialVersionUID;

    public void LinkedListMultimap(){
       super(12);
    }
    public void LinkedListMultimap(int p0){
       super();
       this.keyToKeyList = j0.a(p0);
    }
    public void LinkedListMultimap(g0 p0){
       super(p0.keySet().size());
       this.putAll(p0);
    }
    public static void checkElement(Object p0){
       if (p0 != null) {
          return;
       }
       throw new NoSuchElementException();
    }
    public static LinkedListMultimap create(){
       return new LinkedListMultimap();
    }
    public static LinkedListMultimap create(int p0){
       return new LinkedListMultimap(p0);
    }
    public static LinkedListMultimap create(g0 p0){
       return new LinkedListMultimap(p0);
    }
    public LinkedListMultimap$g addNode(Object p0,Object p1,LinkedListMultimap$g p2){
       LinkedListMultimap$g og = new LinkedListMultimap$g(p0, p1);
       if (this.head == null) {
          this.tail = og;
          this.head = og;
          this.keyToKeyList.put(p0, new LinkedListMultimap$f(og));
          this.modCount = this.modCount + 1;
       }else if(p2 == null){
          p1 = this.tail;
          p1.d = og;
          og.e = p1;
          this.tail = og;
          p1 = this.keyToKeyList.get(p0);
          if (p1 == null) {
             this.keyToKeyList.put(p0, new LinkedListMultimap$f(og));
             this.modCount = this.modCount + 1;
          }else {
             p1.c = p1.c + 1;
             p0 = p1.b;
             p0.f = og;
             og.g = p0;
             p1.b = og;
          }
       }else {
          p1 = this.keyToKeyList.get(p0);
          p1.c = p1.c + 1;
          og.e = p2.e;
          og.g = p2.g;
          og.d = p2;
          og.f = p2;
          p1 = p2.g;
          if (p1 == null) {
             p0.a = og;
          }else {
             p1.f = og;
          }
          p0 = p2.e;
          if (p0 == null) {
             this.head = og;
          }else {
             p0.d = og;
          }
          p2.e = og;
          p2.g = og;
       }
       this.size = this.size + 1;
       return og;
    }
    public Map asMap(){
       return super.asMap();
    }
    public final List c(Object p0){
       return Collections.unmodifiableList(Lists.d(new LinkedListMultimap$i(this, p0)));
    }
    public void clear(){
       this.head = null;
       this.tail = null;
       this.keyToKeyList.clear();
       this.size = 0;
       this.modCount = this.modCount + 1;
    }
    public boolean containsEntry(Object p0,Object p1){
       return super.containsEntry(p0, p1);
    }
    public boolean containsKey(Object p0){
       return this.keyToKeyList.containsKey(p0);
    }
    public boolean containsValue(Object p0){
       return this.values().contains(p0);
    }
    public Map createAsMap(){
       return new Multimaps$a(this);
    }
    public Collection createEntries(){
       return this.createEntries();
    }
    public List createEntries(){
       return new LinkedListMultimap$b(this);
    }
    public Set createKeySet(){
       return new LinkedListMultimap$c(this);
    }
    public k createKeys(){
       return new Multimaps$c(this);
    }
    public Collection createValues(){
       return this.createValues();
    }
    public List createValues(){
       return new LinkedListMultimap$d(this);
    }
    public Collection entries(){
       return this.entries();
    }
    public List entries(){
       return super.entries();
    }
    public Iterator entryIterator(){
       throw new AssertionError("should never be called");
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public Collection get(Object p0){
       return this.get(p0);
    }
    public List get(Object p0){
       return new LinkedListMultimap$a(this, p0);
    }
    public int hashCode(){
       return super.hashCode();
    }
    public boolean isEmpty(){
       boolean b = (this.head == null)? true: false;
       return b;
    }
    public Set keySet(){
       return super.keySet();
    }
    public k keys(){
       return super.keys();
    }
    public boolean put(Object p0,Object p1){
       this.addNode(p0, p1, null);
       return true;
    }
    public boolean putAll(Object p0,Iterable p1){
       return super.putAll(p0, p1);
    }
    public boolean putAll(g0 p0){
       return super.putAll(p0);
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.keyToKeyList = CompactLinkedHashMap.create();
       int i = p0.readInt();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.put(p0.readObject(), p0.readObject());
       }
       return;
    }
    public boolean remove(Object p0,Object p1){
       return super.remove(p0, p1);
    }
    public Collection removeAll(Object p0){
       return this.removeAll(p0);
    }
    public List removeAll(Object p0){
       this.removeAllNodes(p0);
       return this.c(p0);
    }
    public void removeAllNodes(Object p0){
       Iterators.d(new LinkedListMultimap$i(this, p0));
    }
    public void removeNode(LinkedListMultimap$g p0){
       LinkedListMultimap$g e = p0.e;
       if (e != null) {
          e.d = p0.d;
       }else {
          this.head = p0.d;
       }
       LinkedListMultimap$g d = p0.d;
       if (d != null) {
          d.e = e;
       }else {
          this.tail = e;
       }
       if (p0.g == null && p0.f == null) {
          p0.c = 0;
          this.modCount = this.modCount + 1;
       }else {
          LinkedListMultimap$f uof = this.keyToKeyList.get(p0.b);
          uof.c = uof.c - 1;
          d = p0.g;
          if (d == null) {
             uof.a = p0.f;
          }else {
             d.f = p0.f;
          }
          p0 = p0.f;
          if (p0 == null) {
             uof.b = d;
          }else {
             p0.g = d;
          }
       }
       this.size = this.size - 1;
       return;
    }
    public Collection replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public List replaceValues(Object p0,Iterable p1){
       List list = this.c(p0);
       LinkedListMultimap$i oi = new LinkedListMultimap$i(this, p0);
       p0 = p1.iterator();
       while (oi.hasNext() && p0.hasNext()) {
          oi.next();
          oi.set(p0.next());
       }
       while (oi.hasNext()) {
          oi.next();
          oi.remove();
       }
       while (p0.hasNext()) {
          oi.add(p0.next());
       }
       return list;
    }
    public int size(){
       return this.size;
    }
    public String toString(){
       return super.toString();
    }
    public Collection values(){
       return this.values();
    }
    public List values(){
       return super.values();
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeInt(this.size());
       Iterator iterator = this.entries().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeObject(uEntry.getKey());
          p0.writeObject(uEntry.getValue());
       }
       return;
    }
}
