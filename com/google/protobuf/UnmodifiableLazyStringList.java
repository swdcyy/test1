package com.google.protobuf.UnmodifiableLazyStringList;
import com.google.protobuf.LazyStringList;
import java.util.RandomAccess;
import java.util.AbstractList;
import com.google.protobuf.ByteString;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.ProtocolStringList;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import com.google.protobuf.UnmodifiableLazyStringList$2;
import java.util.ListIterator;
import com.google.protobuf.UnmodifiableLazyStringList$1;

public class UnmodifiableLazyStringList extends AbstractList implements LazyStringList, RandomAccess	// class@0004e3
{
    public final LazyStringList list;

    public void UnmodifiableLazyStringList(LazyStringList p0){
       super();
       this.list = p0;
    }
    public void add(ByteString p0){
       throw new UnsupportedOperationException();
    }
    public void add(byte[] p0){
       throw new UnsupportedOperationException();
    }
    public boolean addAllByteArray(Collection p0){
       throw new UnsupportedOperationException();
    }
    public boolean addAllByteString(Collection p0){
       throw new UnsupportedOperationException();
    }
    public List asByteArrayList(){
       return Collections.unmodifiableList(this.list.asByteArrayList());
    }
    public List asByteStringList(){
       return Collections.unmodifiableList(this.list.asByteStringList());
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public String get(int p0){
       return this.list.get(p0);
    }
    public byte[] getByteArray(int p0){
       return this.list.getByteArray(p0);
    }
    public ByteString getByteString(int p0){
       return this.list.getByteString(p0);
    }
    public Object getRaw(int p0){
       return this.list.getRaw(p0);
    }
    public List getUnderlyingElements(){
       return this.list.getUnderlyingElements();
    }
    public LazyStringList getUnmodifiableView(){
       return this;
    }
    public Iterator iterator(){
       return new UnmodifiableLazyStringList$2(this);
    }
    public ListIterator listIterator(int p0){
       return new UnmodifiableLazyStringList$1(this, p0);
    }
    public void mergeFrom(LazyStringList p0){
       throw new UnsupportedOperationException();
    }
    public void set(int p0,ByteString p1){
       throw new UnsupportedOperationException();
    }
    public void set(int p0,byte[] p1){
       throw new UnsupportedOperationException();
    }
    public int size(){
       return this.list.size();
    }
}
