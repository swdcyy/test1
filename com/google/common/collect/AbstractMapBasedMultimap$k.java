package com.google.common.collect.AbstractMapBasedMultimap$k;
import java.util.AbstractCollection;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap$k$a;
import java.util.ConcurrentModificationException;
import ok.n;
import java.lang.String;

public class AbstractMapBasedMultimap$k extends AbstractCollection	// class@00179a
{
    public final Object b;
    public Collection c;
    public final AbstractMapBasedMultimap$k d;
    public final Collection e;
    public final AbstractMapBasedMultimap f;

    public void AbstractMapBasedMultimap$k(AbstractMapBasedMultimap p0,Object p1,Collection p2,AbstractMapBasedMultimap$k p3){
       this.f = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
       Collection uCollection = (p3 == null)? null: p3.l();
       this.e = uCollection;
       return;
    }
    public boolean add(Object p0){
       this.m();
       boolean b = this.c.isEmpty();
       boolean b1 = this.c.add(p0);
       if (b1) {
          AbstractMapBasedMultimap$k tf = this.f;
          tf.totalSize = tf.totalSize + 1;
          if (b) {
             this.b();
          }
       }
       return b1;
    }
    public boolean addAll(Collection p0){
       if (p0.isEmpty()) {
          return false;
       }
       int i = this.size();
       boolean b = this.c.addAll(p0);
       if (b) {
          AbstractMapBasedMultimap$k tf = this.f;
          tf.totalSize = tf.totalSize + (this.c.size() - i);
          if (!i) {
             this.b();
          }
       }
       return b;
    }
    public void b(){
       AbstractMapBasedMultimap$k td = this.d;
       if (td != null) {
          td.b();
       }else {
          this.f.map.put(this.b, this.c);
       }
       return;
    }
    public void clear(){
       int i = this.size();
       if (!i) {
          return;
       }
       this.c.clear();
       AbstractMapBasedMultimap$k tf = this.f;
       tf.totalSize = tf.totalSize - i;
       this.n();
       return;
    }
    public boolean contains(Object p0){
       this.m();
       return this.c.contains(p0);
    }
    public boolean containsAll(Collection p0){
       this.m();
       return this.c.containsAll(p0);
    }
    public AbstractMapBasedMultimap$k d(){
       return this.d;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       this.m();
       return this.c.equals(p0);
    }
    public int hashCode(){
       this.m();
       return this.c.hashCode();
    }
    public Iterator iterator(){
       this.m();
       return new AbstractMapBasedMultimap$k$a(this);
    }
    public Collection l(){
       return this.c;
    }
    public void m(){
       AbstractMapBasedMultimap$k td = this.d;
       if (td != null) {
          td.m();
          if (this.d.l() != this.e) {
             throw new ConcurrentModificationException();
          }
       }else if(this.c.isEmpty()){
          Collection uCollection = this.f.map.get(this.b);
          if (uCollection != null) {
             this.c = uCollection;
          }
       }
       return;
    }
    public void n(){
       AbstractMapBasedMultimap$k td = this.d;
       if (td != null) {
          td.n();
       }else if(this.c.isEmpty()){
          this.f.map.remove(this.b);
       }
       return;
    }
    public boolean remove(Object p0){
       this.m();
       boolean b = this.c.remove(p0);
       if (b) {
          AbstractMapBasedMultimap$k tf = this.f;
          tf.totalSize = tf.totalSize - 1;
          this.n();
       }
       return b;
    }
    public boolean removeAll(Collection p0){
       if (p0.isEmpty()) {
          return false;
       }
       int i = this.size();
       boolean b = this.c.removeAll(p0);
       if (b) {
          AbstractMapBasedMultimap$k tf = this.f;
          tf.totalSize = tf.totalSize + (this.c.size() - i);
          this.n();
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       n.j(p0);
       int i = this.size();
       boolean b = this.c.retainAll(p0);
       if (b) {
          AbstractMapBasedMultimap$k tf = this.f;
          tf.totalSize = tf.totalSize + (this.c.size() - i);
          this.n();
       }
       return b;
    }
    public int size(){
       this.m();
       return this.c.size();
    }
    public String toString(){
       this.m();
       return this.c.toString();
    }
}
