package com.google.protobuf.LazyStringArrayList$ByteStringListView;
import java.util.RandomAccess;
import java.util.AbstractList;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.ByteString;
import java.lang.Object;
import java.lang.String;

public class LazyStringArrayList$ByteStringListView extends AbstractList implements RandomAccess	// class@000462
{
    public final LazyStringArrayList list;

    public void LazyStringArrayList$ByteStringListView(LazyStringArrayList p0){
       super();
       this.list = p0;
    }
    public void add(int p0,ByteString p1){
       this.list.add(p0, p1);
       this.modCount = this.modCount + 1;
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public ByteString get(int p0){
       return this.list.getByteString(p0);
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public ByteString remove(int p0){
       this.modCount = this.modCount + 1;
       return LazyStringArrayList.asByteString(this.list.remove(p0));
    }
    public Object remove(int p0){
       return this.remove(p0);
    }
    public ByteString set(int p0,ByteString p1){
       this.modCount = this.modCount + 1;
       return LazyStringArrayList.asByteString(this.list.setAndReturn(p0, p1));
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public int size(){
       return this.list.size();
    }
}
