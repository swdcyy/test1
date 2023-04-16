package com.google.protobuf.AbstractProtobufList;
import com.google.protobuf.Internal$ProtobufList;
import java.util.AbstractList;
import java.lang.Object;
import java.util.Collection;
import java.util.AbstractCollection;
import java.lang.UnsupportedOperationException;
import java.util.List;
import java.util.RandomAccess;

public abstract class AbstractProtobufList extends AbstractList implements Internal$ProtobufList	// class@0003a6
{
    public boolean isMutable;

    public void AbstractProtobufList(){
       super();
       this.isMutable = true;
    }
    public void add(int p0,Object p1){
       this.ensureIsMutable();
       super.add(p0, p1);
    }
    public boolean add(Object p0){
       this.ensureIsMutable();
       return super.add(p0);
    }
    public boolean addAll(int p0,Collection p1){
       this.ensureIsMutable();
       return super.addAll(p0, p1);
    }
    public boolean addAll(Collection p0){
       this.ensureIsMutable();
       return super.addAll(p0);
    }
    public void clear(){
       this.ensureIsMutable();
       super.clear();
    }
    public void ensureIsMutable(){
       if (this.isMutable != null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof List) {
          return false;
       }
       if (!p0 instanceof RandomAccess) {
          return super.equals(p0);
       }
       int i = this.size();
       if (i != p0.size()) {
          return false;
       }
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          if (!this.get(i1).equals(p0.get(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public int hashCode(){
       int i = this.size();
       int i1 = 1;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          i1 = i1 * 31;
          i1 = i1 + this.get(i2).hashCode();
       }
       return i1;
    }
    public boolean isModifiable(){
       return this.isMutable;
    }
    public final void makeImmutable(){
       this.isMutable = false;
    }
    public Object remove(int p0){
       this.ensureIsMutable();
       return super.remove(p0);
    }
    public boolean remove(Object p0){
       this.ensureIsMutable();
       return super.remove(p0);
    }
    public boolean removeAll(Collection p0){
       this.ensureIsMutable();
       return super.removeAll(p0);
    }
    public boolean retainAll(Collection p0){
       this.ensureIsMutable();
       return super.retainAll(p0);
    }
    public Object set(int p0,Object p1){
       this.ensureIsMutable();
       return super.set(p0, p1);
    }
}
