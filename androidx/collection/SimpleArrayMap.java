package androidx.collection.SimpleArrayMap;
import java.lang.Object;
import androidx.collection.ContainerHelpers;
import java.util.ConcurrentModificationException;
import java.lang.System;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;

public class SimpleArrayMap	// class@000662
{
    public Object[] mArray;
    public int[] mHashes;
    public int mSize;
    public static Object[] mBaseCache;
    public static int mBaseCacheSize;
    public static Object[] mTwiceBaseCache;
    public static int mTwiceBaseCacheSize;

    public void SimpleArrayMap(){
       super();
       this.mHashes = ContainerHelpers.EMPTY_INTS;
       this.mArray = ContainerHelpers.EMPTY_OBJECTS;
       this.mSize = 0;
    }
    public void SimpleArrayMap(int p0){
       super();
       if (!p0) {
          this.mHashes = ContainerHelpers.EMPTY_INTS;
          this.mArray = ContainerHelpers.EMPTY_OBJECTS;
       }else {
          this.allocArrays(p0);
       }
       this.mSize = 0;
       return;
    }
    public void SimpleArrayMap(SimpleArrayMap p0){
       super();
       if (p0 != null) {
          this.putAll(p0);
       }
       return;
    }
    private void allocArrays(int p0){
       Object[] mTwiceBaseCa;
       SimpleArrayMap simpleArrayM = SimpleArrayMap.class;
       if (p0 == 8) {
          _monitor_enter(simpleArrayM);
          mTwiceBaseCa = SimpleArrayMap.mTwiceBaseCache;
          if (mTwiceBaseCa != null) {
             this.mArray = mTwiceBaseCa;
             SimpleArrayMap.mTwiceBaseCache = mTwiceBaseCa[0];
             this.mHashes = mTwiceBaseCa[1];
             mTwiceBaseCa[1] = null;
             mTwiceBaseCa[0] = null;
             SimpleArrayMap.mTwiceBaseCacheSize = SimpleArrayMap.mTwiceBaseCacheSize - 1;
             _monitor_exit(simpleArrayM);
             return;
          }else {
             _monitor_exit(simpleArrayM);
          }
       }else if(p0 == 4){
          _monitor_enter(simpleArrayM);
          mTwiceBaseCa = SimpleArrayMap.mBaseCache;
          if (mTwiceBaseCa != null) {
             this.mArray = mTwiceBaseCa;
             SimpleArrayMap.mBaseCache = mTwiceBaseCa[0];
             this.mHashes = mTwiceBaseCa[1];
             mTwiceBaseCa[1] = null;
             mTwiceBaseCa[0] = null;
             SimpleArrayMap.mBaseCacheSize = SimpleArrayMap.mBaseCacheSize - 1;
             _monitor_exit(simpleArrayM);
             return;
          }else {
             _monitor_exit(simpleArrayM);
          }
       }
       int[] ointArray = new int[p0];
       this.mHashes = ointArray;
       Object[] objArray = new Object[(p0 << 1)];
       this.mArray = objArray;
       return;
    }
    public static int binarySearchHashes(int[] p0,int p1,int p2){
       try{
          return ContainerHelpers.binarySearch(p0, p1, p2);
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
          throw new ConcurrentModificationException();
       }
    }
    public static void freeArrays(int[] p0,Object[] p1,int p2){
       int i;
       if (p0.length == 8) {
          _monitor_enter(SimpleArrayMap.class);
          if (SimpleArrayMap.mTwiceBaseCacheSize < 10) {
             p1[0] = SimpleArrayMap.mTwiceBaseCache;
             p1[1] = p0;
             for (i = (p2 << 1) - 1; i >= 2; i--) {
                p1[i] = null;
             }
             SimpleArrayMap.mTwiceBaseCache = p1;
             SimpleArrayMap.mTwiceBaseCacheSize = SimpleArrayMap.mTwiceBaseCacheSize + 1;
          }
          _monitor_exit(SimpleArrayMap.class);
       }else if(p0.length == 4){
          _monitor_enter(SimpleArrayMap.class);
          if (SimpleArrayMap.mBaseCacheSize < 10) {
             p1[0] = SimpleArrayMap.mBaseCache;
             p1[1] = p0;
             for (i = (p2 << 1) - 1; i >= 2; i--) {
                p1[i] = null;
             }
             SimpleArrayMap.mBaseCache = p1;
             SimpleArrayMap.mBaseCacheSize = SimpleArrayMap.mBaseCacheSize + 1;
          }
          _monitor_exit(SimpleArrayMap.class);
       }
       return;
    }
    public void clear(){
       SimpleArrayMap tmSize = this.mSize;
       if (tmSize > null) {
          SimpleArrayMap tmHashes = this.mHashes;
          SimpleArrayMap tmArray = this.mArray;
          this.mHashes = ContainerHelpers.EMPTY_INTS;
          this.mArray = ContainerHelpers.EMPTY_OBJECTS;
          this.mSize = 0;
          SimpleArrayMap.freeArrays(tmHashes, tmArray, tmSize);
       }
       if (this.mSize <= null) {
          return;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public boolean containsKey(Object p0){
       boolean b = (this.indexOfKey(p0) >= 0)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       boolean b = (this.indexOfValue(p0) >= 0)? true: false;
       return b;
    }
    public void ensureCapacity(int p0){
       SimpleArrayMap tmSize = this.mSize;
       SimpleArrayMap tmHashes = this.mHashes;
       if (tmHashes.length < p0) {
          SimpleArrayMap tmArray = this.mArray;
          this.allocArrays(p0);
          if (this.mSize > null) {
             System.arraycopy(tmHashes, 0, this.mHashes, 0, tmSize);
             System.arraycopy(tmArray, 0, this.mArray, 0, (tmSize << 1));
          }
          SimpleArrayMap.freeArrays(tmHashes, tmArray, tmSize);
       }
       if (this.mSize == tmSize) {
          return;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public boolean equals(Object p0){
       int i;
       Object obj;
       Object obj1;
       Object obj2;
       if (this == p0) {
          return true;
       }
       if (p0 instanceof SimpleArrayMap) {
          if (this.size() != p0.size()) {
             return false;
          }else {
             i = 0;
             try{
                while (true) {
                   if (i >= this.mSize) {
                      return true;
                   }
                   obj = this.keyAt(i);
                   obj1 = this.valueAt(i);
                   obj2 = p0.get(obj);
                   if (obj1 == null) {
                      if (obj2 != null || !p0.containsKey(obj)) {
                         break ;
                      }
                   }else if(!obj1.equals(obj2)){
                      return false;
                   }
                   i = i + 1;
                }
                return false;
             }catch(java.lang.NullPointerException e0){
                return false;
             }catch(java.lang.ClassCastException e0){
             }
          }
       }else if(p0 instanceof Map){
          if (this.size() != p0.size()) {
             return false;
          }
          i = 0;
          try{
             while (true) {
                if (i >= this.mSize) {
                   return true;
                }
                obj = this.keyAt(i);
                obj1 = this.valueAt(i);
                obj2 = p0.get(obj);
                if (obj1 == null) {
                   if (obj2 != null || !p0.containsKey(obj)) {
                      break ;
                   }
                }else if(!obj1.equals(obj2)){
                   return false;
                }
                i = i + 1;
             }
             return false;
          }catch(java.lang.NullPointerException e0){
             return false;
          }catch(java.lang.ClassCastException e0){
          }
       }else {
          goto label_0076 ;
       }
    }
    public Object get(Object p0){
       return this.getOrDefault(p0, null);
    }
    public Object getOrDefault(Object p0,Object p1){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          p1 = this.mArray[((i << 1) + 1)];
       }
       return p1;
    }
    public int hashCode(){
       SimpleArrayMap tmHashes = this.mHashes;
       SimpleArrayMap tmArray = this.mArray;
       SimpleArrayMap tmSize = this.mSize;
       int i = 1;
       int i1 = 0;
       int i2 = 0;
       while (i1 < tmSize) {
          object oobject = tmArray[i];
          int i3 = tmHashes[i1];
          int i4 = (oobject == null)? 0: oobject.hashCode();
          i4 = i4 ^ i3;
          i2 = i2 + i4;
          i1 = i1 + 1;
          i = i + 2;
       }
       return i2;
    }
    public int indexOf(Object p0,int p1){
       SimpleArrayMap tmSize = this.mSize;
       if (tmSize == null) {
          return -1;
       }
       int i = SimpleArrayMap.binarySearchHashes(this.mHashes, tmSize, p1);
       if (i < 0) {
          return i;
       }
       if (p0.equals(this.mArray[(i << 1)])) {
          return i;
       }
       int i1 = i + 1;
       while (true) {
          if (i1 < tmSize && this.mHashes[i1] == p1) {
             int i2 = i1 << 1;
             if (p0.equals(this.mArray[i2])) {
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
                int i3 = i << 1;
                if (p0.equals(this.mArray[i3])) {
                   return i;
                }
                i = i - 1;
             }
          }
       }
       return i1;
    }
    public int indexOfKey(Object p0){
       int i = (p0 == null)? this.indexOfNull(): this.indexOf(p0, p0.hashCode());
       return i;
    }
    public int indexOfNull(){
       SimpleArrayMap tmSize = this.mSize;
       if (tmSize == null) {
          return -1;
       }
       int i = SimpleArrayMap.binarySearchHashes(this.mHashes, tmSize, 0);
       if (i < 0) {
          return i;
       }
       if (this.mArray[(i << 1)] == null) {
          return i;
       }
       int i1 = i + 1;
       while (true) {
          if (i1 < tmSize && !this.mHashes[i1]) {
             int i2 = i1 << 1;
             if (this.mArray[i2] == null) {
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
                int i3 = i << 1;
                if (this.mArray[i3] == null) {
                   return i;
                }
                i = i - 1;
             }
          }
       }
       return i1;
    }
    public int indexOfValue(Object p0){
       int i = this.mSize * 2;
       SimpleArrayMap tmArray = this.mArray;
       if (p0 == null) {
          int i1 = 1;
          while (i1 < i) {
             if (tmArray[i1] == null) {
                return (i1 >> 1);
             }
             i1 = i1 + 2;
          }
       }else {
          int i2 = 1;
          while (i2 < i) {
             if (p0.equals(tmArray[i2])) {
                return (i2 >> 1);
             }
             i2 = i2 + 2;
          }
       }
       return -1;
    }
    public boolean isEmpty(){
       boolean b = (this.mSize <= null)? true: false;
       return b;
    }
    public Object keyAt(int p0){
       return this.mArray[(p0 << 1)];
    }
    public Object put(Object p0,Object p1){
       int i;
       int i1;
       SimpleArrayMap tmSize = this.mSize;
       object oobject = null;
       if (p0 == null) {
          i = this.indexOfNull();
          i1 = 0;
       }else {
          i = p0.hashCode();
          i1 = i;
          i = this.indexOf(p0, i);
       }
       if (i >= 0) {
          int i2 = (i << 1) + 1;
          tmSize = this.mArray;
          oobject = tmSize[i2];
          tmSize[i2] = p1;
          return oobject;
       }else {
          i = ~ i;
          SimpleArrayMap tmHashes = this.mHashes;
          if (tmSize >= tmHashes.length) {
             int i3 = 4;
             if (tmSize >= 8) {
                i3 = (tmSize >> 1) + tmSize;
             }else if(tmSize >= i3){
                i3 = 8;
             }
             SimpleArrayMap tmArray = this.mArray;
             this.allocArrays(i3);
             if (tmSize == this.mSize) {
                SimpleArrayMap tmHashes1 = this.mHashes;
                if (tmHashes1.length > 0) {
                   System.arraycopy(tmHashes, oobject, tmHashes1, oobject, tmHashes.length);
                   System.arraycopy(tmArray, oobject, this.mArray, oobject, tmArray.length);
                }
                SimpleArrayMap.freeArrays(tmHashes, tmArray, tmSize);
             }else {
                throw new ConcurrentModificationException();
             }
          }
          if (i < tmSize) {
             int i4 = i + 1;
             System.arraycopy(this.mHashes, i, this.mHashes, i4, (tmSize - i));
             System.arraycopy(this.mArray, (i << 1), this.mArray, (i4 << 1), ((this.mSize - i) << 1));
          }
          SimpleArrayMap tmSize1 = this.mSize;
          if (tmSize == tmSize1) {
             tmSize = this.mHashes;
             if (i < tmSize.length) {
                tmSize[i] = i1;
                tmSize = this.mArray;
                i = i << 1;
                tmSize[i] = p0;
                tmSize[(i + 1)] = p1;
                this.mSize = tmSize1 + 1;
                return null;
             }
          }
          throw new ConcurrentModificationException();
       }
    }
    public void putAll(SimpleArrayMap p0){
       SimpleArrayMap mSize = p0.mSize;
       this.ensureCapacity((this.mSize + mSize));
       int i = 0;
       if (this.mSize == null) {
          if (mSize > null) {
             System.arraycopy(p0.mHashes, i, this.mHashes, i, mSize);
             System.arraycopy(p0.mArray, i, this.mArray, i, (mSize << 1));
             this.mSize = mSize;
          }
       }else {
          for (; i < mSize; i = i + 1) {
             this.put(p0.keyAt(i), p0.valueAt(i));
          }
       }
       return;
    }
    public Object putIfAbsent(Object p0,Object p1){
       Object obj = this.get(p0);
       if (obj == null) {
          obj = this.put(p0, p1);
       }
       return obj;
    }
    public Object remove(Object p0){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          return this.removeAt(i);
       }
       return null;
    }
    public boolean remove(Object p0,Object p1){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          Object obj = this.valueAt(i);
          if (p1 == obj || (p1 != null && p1.equals(obj))) {
             this.removeAt(i);
             return true;
          }
       }
       return false;
    }
    public Object removeAt(int p0){
       int i5;
       SimpleArrayMap tmArray = this.mArray;
       int i = p0 << 1;
       object oobject = tmArray[(i + 1)];
       SimpleArrayMap tmSize = this.mSize;
       int i1 = 0;
       int i2 = 1;
       if (tmSize <= i2) {
          SimpleArrayMap.freeArrays(this.mHashes, tmArray, tmSize);
          this.mHashes = ContainerHelpers.EMPTY_INTS;
          this.mArray = ContainerHelpers.EMPTY_OBJECTS;
       }else {
          int i3 = tmSize - 1;
          SimpleArrayMap tmHashes = this.mHashes;
          int i4 = 8;
          if (tmHashes.length > i4 && tmSize < (tmHashes.length / 3)) {
             if (tmSize > i4) {
                i4 = tmSize + (tmSize >> 1);
             }
             this.allocArrays(i4);
             if (tmSize == this.mSize) {
                if (p0 > 0) {
                   System.arraycopy(tmHashes, i1, this.mHashes, i1, p0);
                   System.arraycopy(tmArray, i1, this.mArray, i1, i);
                }
                if (p0 < i3) {
                   i1 = p0 + 1;
                   i4 = i3 - p0;
                   System.arraycopy(tmHashes, i1, this.mHashes, p0, i4);
                   p0 = i1 << 1;
                   System.arraycopy(tmArray, p0, this.mArray, i, (i4 << 1));
                }
             }else {
                throw new ConcurrentModificationException();
             }
          }else if(p0 < i3){
             i5 = p0 + 1;
             i1 = i3 - p0;
             System.arraycopy(tmHashes, i5, tmHashes, p0, i1);
             System.arraycopy(this.mArray, (i5 << i2), this.mArray, i, (i1 << i2));
          }
          SimpleArrayMap tmArray1 = this.mArray;
          i5 = i3 << 1;
          tmArray1[i5] = null;
          tmArray1[(i5 + i2)] = null;
          i1 = i3;
       }
       if (tmSize == this.mSize) {
          this.mSize = i1;
          return oobject;
       }else {
          throw new ConcurrentModificationException();
       }
    }
    public Object replace(Object p0,Object p1){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          return this.setValueAt(i, p1);
       }
       return null;
    }
    public boolean replace(Object p0,Object p1,Object p2){
       int i = this.indexOfKey(p0);
       if (i >= 0) {
          Object obj = this.valueAt(i);
          if (obj == p1 || (p1 != null && p1.equals(obj))) {
             this.setValueAt(i, p2);
             return true;
          }
       }
       return false;
    }
    public Object setValueAt(int p0,Object p1){
       p0 = (p0 << 1) + 1;
       SimpleArrayMap tmArray = this.mArray;
       object oobject = tmArray[p0];
       tmArray[p0] = p1;
       return oobject;
    }
    public int size(){
       return this.mSize;
    }
    public String toString(){
       if (this.isEmpty()) {
          return "{}";
       }
       StringBuilder str = new StringBuilder((this.mSize * 28))+'{';
       int i = 0;
       while (i < this.mSize) {
          if (i > 0) {
             str = str+", ";
          }
          Object obj = this.keyAt(i);
          str = (obj != this)? str+obj: str+"\(this Map\)";
          str = str+'=';
          obj = this.valueAt(i);
          str = (obj != this)? str+obj: str+"\(this Map\)";
          i = i + 1;
       }
       return str+'}';
    }
    public Object valueAt(int p0){
       return this.mArray[((p0 << 1) + 1)];
    }
}
