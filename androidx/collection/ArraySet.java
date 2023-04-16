package androidx.collection.ArraySet;
import java.util.Collection;
import java.util.Set;
import java.lang.Object;
import java.lang.System;
import java.util.Iterator;
import androidx.collection.MapCollections;
import androidx.collection.ArraySet$1;
import androidx.collection.ContainerHelpers;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.String;
import java.lang.StringBuilder;

public final class ArraySet implements Collection, Set	// class@00020f
{
    public Object[] mArray;
    public MapCollections mCollections;
    public int[] mHashes;
    public int mSize;
    public static final int[] INT;
    public static final Object[] OBJECT;
    public static Object[] sBaseCache;
    public static int sBaseCacheSize;
    public static Object[] sTwiceBaseCache;
    public static int sTwiceBaseCacheSize;

    static {
       int[] ointArray = new int[0];
       ArraySet.INT = ointArray;
       Object[] objArray = new Object[0];
       ArraySet.OBJECT = objArray;
    }
    public void ArraySet(){
       super(0);
    }
    public void ArraySet(int p0){
       super();
       if (!p0) {
          this.mHashes = ArraySet.INT;
          this.mArray = ArraySet.OBJECT;
       }else {
          this.allocArrays(p0);
       }
       this.mSize = 0;
       return;
    }
    public void ArraySet(ArraySet p0){
       super();
       if (p0 != null) {
          this.addAll(p0);
       }
       return;
    }
    public void ArraySet(Collection p0){
       super();
       if (p0 != null) {
          this.addAll(p0);
       }
       return;
    }
    public static void freeArrays(int[] p0,Object[] p1,int p2){
       Object[] objArray = 10;
       if (p0.length == 8) {
          _monitor_enter(ArraySet.class);
          if (ArraySet.sTwiceBaseCacheSize < objArray) {
             p1[0] = ArraySet.sTwiceBaseCache;
             p1[1] = p0;
             for (p2 = p2 - 1; p2 >= 2; p2--) {
                p1[p2] = null;
             }
             ArraySet.sTwiceBaseCache = p1;
             ArraySet.sTwiceBaseCacheSize = ArraySet.sTwiceBaseCacheSize + 1;
          }
          _monitor_exit(ArraySet.class);
       }else if(p0.length == 4){
          _monitor_enter(ArraySet.class);
          if (ArraySet.sBaseCacheSize < objArray) {
             p1[0] = ArraySet.sBaseCache;
             p1[1] = p0;
             for (p2 = p2 - 1; p2 >= 2; p2--) {
                p1[p2] = null;
             }
             ArraySet.sBaseCache = p1;
             ArraySet.sBaseCacheSize = ArraySet.sBaseCacheSize + 1;
          }
          _monitor_exit(ArraySet.class);
       }
       return;
    }
    public boolean add(Object p0){
       int i;
       int i1;
       boolean b = false;
       if (p0 == null) {
          i = this.indexOfNull();
          i1 = 0;
       }else {
          i = p0.hashCode();
          i1 = i;
          i = this.indexOf(p0, i);
       }
       if (i >= 0) {
          return b;
       }else {
          i = ~ i;
          ArraySet tmSize = this.mSize;
          ArraySet tmHashes = this.mHashes;
          if (tmSize >= tmHashes.length) {
             int i2 = 4;
             if (tmSize >= 8) {
                i2 = (tmSize >> 1) + tmSize;
             }else if(tmSize >= i2){
                i2 = 8;
             }
             tmSize = this.mArray;
             this.allocArrays(i2);
             ArraySet tmHashes1 = this.mHashes;
             if (tmHashes1.length > 0) {
                System.arraycopy(tmHashes, b, tmHashes1, b, tmHashes.length);
                System.arraycopy(tmSize, b, this.mArray, b, tmSize.length);
             }
             ArraySet.freeArrays(tmHashes, tmSize, this.mSize);
          }
          ArraySet tmSize1 = this.mSize;
          if (i < tmSize1) {
             int i3 = i + 1;
             System.arraycopy(this.mHashes, i, this.mHashes, i3, (tmSize1 - i));
             System.arraycopy(this.mArray, i, this.mArray, i3, (this.mSize - i));
          }
          this.mHashes[i] = i1;
          this.mArray[i] = p0;
          this.mSize = this.mSize + 1;
          return 1;
       }
    }
    public void addAll(ArraySet p0){
       ArraySet mSize = p0.mSize;
       this.ensureCapacity((this.mSize + mSize));
       int i = 0;
       if (this.mSize == null) {
          if (mSize > null) {
             System.arraycopy(p0.mHashes, i, this.mHashes, i, mSize);
             System.arraycopy(p0.mArray, i, this.mArray, i, mSize);
             this.mSize = mSize;
          }
       }else {
          for (; i < mSize; i = i + 1) {
             this.add(p0.valueAt(i));
          }
       }
       return;
    }
    public boolean addAll(Collection p0){
       this.ensureCapacity((this.mSize + p0.size()));
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i | this.add(iterator.next());
       }
       return i;
    }
    public final void allocArrays(int p0){
       Object[] sTwiceBaseCa;
       object oobject = null;
       if (p0 == 8) {
          _monitor_enter(ArraySet.class);
          sTwiceBaseCa = ArraySet.sTwiceBaseCache;
          if (sTwiceBaseCa != null) {
             this.mArray = sTwiceBaseCa;
             ArraySet.sTwiceBaseCache = sTwiceBaseCa[0];
             this.mHashes = sTwiceBaseCa[1];
             sTwiceBaseCa[1] = oobject;
             sTwiceBaseCa[0] = oobject;
             ArraySet.sTwiceBaseCacheSize = ArraySet.sTwiceBaseCacheSize - 1;
             _monitor_exit(ArraySet.class);
             return;
          }else {
             _monitor_exit(ArraySet.class);
          }
       }else if(p0 == 4){
          _monitor_enter(ArraySet.class);
          sTwiceBaseCa = ArraySet.sBaseCache;
          if (sTwiceBaseCa != null) {
             this.mArray = sTwiceBaseCa;
             ArraySet.sBaseCache = sTwiceBaseCa[0];
             this.mHashes = sTwiceBaseCa[1];
             sTwiceBaseCa[1] = oobject;
             sTwiceBaseCa[0] = oobject;
             ArraySet.sBaseCacheSize = ArraySet.sBaseCacheSize - 1;
             _monitor_exit(ArraySet.class);
             return;
          }else {
             _monitor_exit(ArraySet.class);
          }
       }
       int[] ointArray = new int[p0];
       this.mHashes = ointArray;
       Object[] objArray = new Object[p0];
       this.mArray = objArray;
       return;
    }
    public void clear(){
       ArraySet tmSize = this.mSize;
       if (tmSize != null) {
          ArraySet.freeArrays(this.mHashes, this.mArray, tmSize);
          this.mHashes = ArraySet.INT;
          this.mArray = ArraySet.OBJECT;
          this.mSize = 0;
       }
       return;
    }
    public boolean contains(Object p0){
       boolean b = (this.indexOf(p0) >= 0)? true: false;
       return b;
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
    public void ensureCapacity(int p0){
       ArraySet tmHashes = this.mHashes;
       if (tmHashes.length < p0) {
          ArraySet tmArray = this.mArray;
          this.allocArrays(p0);
          ArraySet tmSize = this.mSize;
          if (tmSize > null) {
             System.arraycopy(tmHashes, 0, this.mHashes, 0, tmSize);
             System.arraycopy(tmArray, 0, this.mArray, 0, this.mSize);
          }
          ArraySet.freeArrays(tmHashes, tmArray, this.mSize);
       }
       return;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Set) {
          return false;
       }
       if (this.size() != p0.size()) {
          return false;
       }
       int i = 0;
       try{
          while (true) {
             if (i >= this.mSize) {
                return true;
             }
             if (!p0.contains(this.valueAt(i))) {
                break ;
             }else {
                i = i + 1;
             }
          }
          return false;
       }catch(java.lang.NullPointerException e0){
       }catch(java.lang.ClassCastException e0){
       }
    }
    public final MapCollections getCollection(){
       if (this.mCollections == null) {
          this.mCollections = new ArraySet$1(this);
       }
       return this.mCollections;
    }
    public int hashCode(){
       ArraySet tmHashes = this.mHashes;
       ArraySet tmSize = this.mSize;
       int i1 = 0;
       for (int i = 0; i < tmSize; i = i + 1) {
          i1 = i1 + tmHashes[i];
       }
       return i1;
    }
    public int indexOf(Object p0){
       int i = (p0 == null)? this.indexOfNull(): this.indexOf(p0, p0.hashCode());
       return i;
    }
    public final int indexOf(Object p0,int p1){
       ArraySet tmSize = this.mSize;
       if (tmSize == null) {
          return -1;
       }
       int i = ContainerHelpers.binarySearch(this.mHashes, tmSize, p1);
       if (i < 0) {
          return i;
       }
       if (p0.equals(this.mArray[i])) {
          return i;
       }
       int i1 = i + 1;
       while (true) {
          if (i1 < tmSize && this.mHashes[i1] == p1) {
             if (p0.equals(this.mArray[i1])) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i = i - 1;
             while (true) {
                if (i < 0 || this.mHashes[i] != p1) {
                   return (~ i1);
                }
                if (p0.equals(this.mArray[i])) {
                   return i;
                }
                i = i - 1;
             }
          }
       }
       return i1;
    }
    public final int indexOfNull(){
       ArraySet tmSize = this.mSize;
       if (tmSize == null) {
          return -1;
       }
       int i = ContainerHelpers.binarySearch(this.mHashes, tmSize, 0);
       if (i < 0) {
          return i;
       }
       if (this.mArray[i] == null) {
          return i;
       }
       int i1 = i + 1;
       while (true) {
          if (i1 < tmSize && !this.mHashes[i1]) {
             if (this.mArray[i1] == null) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i = i - 1;
             while (true) {
                if (i < 0 || this.mHashes[i]) {
                   return (~ i1);
                }
                if (this.mArray[i] == null) {
                   return i;
                }
                i = i - 1;
             }
          }
       }
       return i1;
    }
    public boolean isEmpty(){
       boolean b = (this.mSize <= null)? true: false;
       return b;
    }
    public Iterator iterator(){
       return this.getCollection().getKeySet().iterator();
    }
    public boolean remove(Object p0){
       int i = this.indexOf(p0);
       if (i < 0) {
          return false;
       }
       this.removeAt(i);
       return true;
    }
    public boolean removeAll(ArraySet p0){
       ArraySet mSize = p0.mSize;
       ArraySet tmSize = this.mSize;
       boolean b = false;
       for (int i = 0; i < mSize; i = i + 1) {
          this.remove(p0.valueAt(i));
       }
       if (tmSize != this.mSize) {
          b = true;
       }
       return b;
    }
    public boolean removeAll(Collection p0){
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i | this.remove(iterator.next());
       }
       return i;
    }
    public Object removeAt(int p0){
       ArraySet tmArray = this.mArray;
       object oobject = tmArray[p0];
       ArraySet tmSize = this.mSize;
       int i = 0;
       int i1 = 1;
       if (tmSize <= i1) {
          ArraySet.freeArrays(this.mHashes, tmArray, tmSize);
          this.mHashes = ArraySet.INT;
          this.mArray = ArraySet.OBJECT;
          this.mSize = i;
       }else {
          ArraySet tmHashes = this.mHashes;
          int i2 = 8;
          if (tmHashes.length > i2 && tmSize < (tmHashes.length / 3)) {
             if (tmSize > i2) {
                i2 = tmSize + (tmSize >> 1);
             }
             this.allocArrays(i2);
             this.mSize = this.mSize - i1;
             if (p0 > 0) {
                System.arraycopy(tmHashes, i, this.mHashes, i, p0);
                System.arraycopy(tmArray, i, this.mArray, i, p0);
             }
             tmSize = this.mSize;
             if (p0 < tmSize) {
                i = p0 + 1;
                System.arraycopy(tmHashes, i, this.mHashes, p0, (tmSize - p0));
                System.arraycopy(tmArray, i, this.mArray, p0, (this.mSize - p0));
             }
          }else {
             int i3 = tmSize - i1;
             this.mSize = i3;
             if (p0 < i3) {
                int i4 = p0 + 1;
                System.arraycopy(tmHashes, i4, tmHashes, p0, (i3 - p0));
                System.arraycopy(this.mArray, i4, this.mArray, p0, (this.mSize - p0));
             }
             p0[this.mSize] = null;
          }
       }
       return oobject;
    }
    public boolean retainAll(Collection p0){
       int i = this.mSize - 1;
       boolean b = false;
       while (i >= 0) {
          if (!p0.contains(this.mArray[i])) {
             this.removeAt(i);
             b = true;
          }
          i = i - 1;
       }
       return b;
    }
    public int size(){
       return this.mSize;
    }
    public Object[] toArray(){
       ArraySet tmSize = this.mSize;
       Object[] objArray = new Object[tmSize];
       System.arraycopy(this.mArray, 0, objArray, 0, tmSize);
       return objArray;
    }
    public Object[] toArray(Object[] p0){
       if (p0.length < this.mSize) {
          p0 = Array.newInstance(p0.getClass().getComponentType(), this.mSize);
       }
       System.arraycopy(this.mArray, 0, p0, 0, this.mSize);
       ArraySet tmSize = this.mSize;
       if (p0.length > tmSize) {
          p0[tmSize] = null;
       }
       return p0;
    }
    public String toString(){
       if (this.isEmpty()) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.mSize * 14))+'{';
       int i = 0;
       while (i < this.mSize) {
          if (i > 0) {
             str = str+", ";
          }
          Object obj = this.valueAt(i);
          str = (obj != this)? str+obj: str+"\(this Set\)";
          i = i + 1;
       }
       return str+'}';
    }
    public Object valueAt(int p0){
       return this.mArray[p0];
    }
}
