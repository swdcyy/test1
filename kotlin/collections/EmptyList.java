package kotlin.collections.EmptyList;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import osd.a;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Void;
import java.util.Collection;
import kotlin.jvm.internal.a;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.util.Iterator;
import trd.c0;
import java.util.ListIterator;
import nsd.t;

public final class EmptyList implements List, Serializable, RandomAccess, a	// class@001c6d
{
    public static final EmptyList INSTANCE;
    public static final long serialVersionUID;

    static {
       EmptyList.INSTANCE = new EmptyList();
    }
    public void EmptyList(){
       super();
    }
    public void add(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public void add(int p0,Void p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean add(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean add(Void p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean addAll(int p0,Collection p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean addAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public void clear(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean contains(Object p0){
       if (p0 instanceof Void) {
          return this.contains(p0);
       }
       return false;
    }
    public boolean contains(Void p0){
       a.p(p0, "element");
       return false;
    }
    public boolean containsAll(Collection p0){
       a.p(p0, "elements");
       return p0.isEmpty();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof List && p0.isEmpty())? true: false;
       return b;
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public Void get(int p0){
       throw new IndexOutOfBoundsException("Empty list doesn\'t contain element at index "+p0+'.');
    }
    public int getSize(){
       return 0;
    }
    public int hashCode(){
       return 1;
    }
    public final int indexOf(Object p0){
       if (p0 instanceof Void) {
          return this.indexOf(p0);
       }
       return -1;
    }
    public int indexOf(Void p0){
       a.p(p0, "element");
       return -1;
    }
    public boolean isEmpty(){
       return true;
    }
    public Iterator iterator(){
       return c0.b;
    }
    public final int lastIndexOf(Object p0){
       if (p0 instanceof Void) {
          return this.lastIndexOf(p0);
       }
       return -1;
    }
    public int lastIndexOf(Void p0){
       a.p(p0, "element");
       return -1;
    }
    public ListIterator listIterator(){
       return c0.b;
    }
    public ListIterator listIterator(int p0){
       if (!p0) {
          return c0.b;
       }
       throw new IndexOutOfBoundsException("Index: "+p0);
    }
    public final Object readResolve(){
       return EmptyList.INSTANCE;
    }
    public Object remove(int p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public Void remove(int p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean remove(Object p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean removeAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public boolean retainAll(Collection p0){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public Object set(int p0,Object p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public Void set(int p0,Void p1){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final int size(){
       return this.getSize();
    }
    public List subList(int p0,int p1){
       if (!p0 && !p1) {
          return this;
       }
       throw new IndexOutOfBoundsException("fromIndex: "+p0+", toIndex: "+p1);
    }
    public Object[] toArray(){
       return t.a(this);
    }
    public Object[] toArray(Object[] p0){
       return t.b(this, p0);
    }
    public String toString(){
       return "[]";
    }
}
