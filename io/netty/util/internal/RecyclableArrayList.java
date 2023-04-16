package io.netty.util.internal.RecyclableArrayList;
import java.util.ArrayList;
import io.netty.util.internal.RecyclableArrayList$a;
import io.netty.util.Recycler$e;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Iterator;
import io.netty.util.Recycler;
import java.util.Objects;

public final class RecyclableArrayList extends ArrayList	// class@00111e
{
    public final Recycler$e handle;
    public boolean insertSinceRecycled;
    public static final Recycler b;
    public static final long serialVersionUID;

    static {
       RecyclableArrayList.b = new RecyclableArrayList$a();
    }
    public void RecyclableArrayList(Recycler$e p0){
       super(8);
       this.handle = p0;
    }
    public void RecyclableArrayList(Recycler$e p0,RecyclableArrayList$a p1){
       super(p0);
    }
    public static void b(Collection p0){
       if (p0 instanceof RandomAccess && p0 instanceof List) {
          int i = p0.size();
          int i1 = 0;
          while (i1 < i) {
             if (p0.get(i1) != null) {
                i1 = i1 + 1;
             }else {
                throw new IllegalArgumentException("c contains null values");
             }
          }
       }else {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (iterator.next() != null) {
             }else {
                throw new IllegalArgumentException("c contains null values");
             }
          }
       }
       return;
    }
    public static RecyclableArrayList newInstance(){
       return RecyclableArrayList.newInstance(8);
    }
    public static RecyclableArrayList newInstance(int p0){
       RecyclableArrayList recyclableAr = RecyclableArrayList.b.a();
       recyclableAr.ensureCapacity(p0);
       return recyclableAr;
    }
    public void add(int p0,Object p1){
       Objects.requireNonNull(p1, "element");
       super.add(p0, p1);
       this.insertSinceRecycled = true;
    }
    public boolean add(Object p0){
       Objects.requireNonNull(p0, "element");
       if (!super.add(p0)) {
          return false;
       }
       this.insertSinceRecycled = true;
       return true;
    }
    public boolean addAll(int p0,Collection p1){
       RecyclableArrayList.b(p1);
       if (!super.addAll(p0, p1)) {
          return false;
       }
       this.insertSinceRecycled = true;
       return true;
    }
    public boolean addAll(Collection p0){
       RecyclableArrayList.b(p0);
       if (!super.addAll(p0)) {
          return false;
       }
       this.insertSinceRecycled = true;
       return true;
    }
    public boolean insertSinceRecycled(){
       return this.insertSinceRecycled;
    }
    public boolean recycle(){
       this.clear();
       this.insertSinceRecycled = false;
       return RecyclableArrayList.b.c(this, this.handle);
    }
    public Object set(int p0,Object p1){
       Objects.requireNonNull(p1, "element");
       this.insertSinceRecycled = true;
       return super.set(p0, p1);
    }
}
