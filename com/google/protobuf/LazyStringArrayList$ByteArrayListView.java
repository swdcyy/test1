package com.google.protobuf.LazyStringArrayList$ByteArrayListView;
import java.util.RandomAccess;
import java.util.AbstractList;
import com.google.protobuf.LazyStringArrayList;
import java.lang.Object;
import java.lang.String;

public class LazyStringArrayList$ByteArrayListView extends AbstractList implements RandomAccess	// class@000461
{
    public final LazyStringArrayList list;

    public void LazyStringArrayList$ByteArrayListView(LazyStringArrayList p0){
       super();
       this.list = p0;
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public void add(int p0,byte[] p1){
       this.list.add(p0, p1);
       this.modCount = this.modCount + 1;
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public byte[] get(int p0){
       return this.list.getByteArray(p0);
    }
    public Object remove(int p0){
       return this.remove(p0);
    }
    public byte[] remove(int p0){
       this.modCount = this.modCount + 1;
       return LazyStringArrayList.asByteArray(this.list.remove(p0));
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public byte[] set(int p0,byte[] p1){
       this.modCount = this.modCount + 1;
       return LazyStringArrayList.asByteArray(this.list.setAndReturn(p0, p1));
    }
    public int size(){
       return this.list.size();
    }
}
