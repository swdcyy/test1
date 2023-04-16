package com.yxcorp.gifshow.album.repo.AlbumAssetList;
import java.io.Serializable;
import com.yxcorp.gifshow.album.repo.AlbumAssetList$a;
import nsd.u;
import java.lang.Object;
import java.util.Collection;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.IndexOutOfBoundsException;
import java.lang.IllegalArgumentException;

public final class AlbumAssetList implements Serializable	// class@001a59
{
    public int count;
    public Object[] elementData;
    public int size;
    public static final AlbumAssetList$a Companion;

    static {
       AlbumAssetList.Companion = new AlbumAssetList$a(null);
    }
    public void AlbumAssetList(){
       super();
       Object[] objArray = new Object[0];
       this.elementData = objArray;
       this.clear();
    }
    public void AlbumAssetList(int p0){
       super();
       Object[] objArray = new Object[0];
       this.elementData = objArray;
       this.size = p0;
       Object[] objArray1 = new Object[p0];
       this.elementData = objArray1;
    }
    public void AlbumAssetList(Collection p0){
       a.q(p0, "collection");
       super();
       Object[] objArray = new Object[0];
       this.elementData = objArray;
       Object[] objArray1 = new Object[0];
       objArray1 = p0.toArray(objArray1);
       Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
       this.elementData = objArray1;
       this.size = objArray1.length;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          if (iterator.next() != null) {
             int i = this.count + 1;
             this.count = i;
          }
       }
       return;
    }
    public static String indexOutOfBoundsMsg$default(AlbumAssetList p0,int p1,String p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = null;
       }
       return p0.d(p1, p2);
    }
    public final boolean a(int p0){
       boolean b;
       AlbumAssetList tsize = this.size;
       if (p0 < 0) {
       }else if(tsize > p0){
          b = true;
       label_000a :
          return b;
       }
       b = false;
       goto label_000a ;
    }
    public final boolean b(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AlbumAssetList.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != p1 && (p0 == null || p0.equals(p1) != b)) {
          b = false;
       }
       return b;
    }
    public final void c(int p0){
       if (PatchProxy.isSupport(AlbumAssetList.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetList.class, "10")) {
          return;
       }
       if (this.elementData.length >= p0) {
          return;
       }
       if (!PatchProxy.isSupport(AlbumAssetList.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetList.class, "11")) {
          int len = this.elementData.length;
          int i = 8;
          if (len >= i) {
             i = len;
          }
          while (i < p0) {
             if (0x3fffffff <= i) {
                i = Integer.MAX_VALUE;
                break ;
             }
             i = i << 1;
          }
          if (i > len) {
             Object[] objArray = Arrays.copyOf(this.elementData, i);
             a.o(objArray, "java.util.Arrays.copyOf\(this, newSize\)");
             this.elementData = objArray;
          }
       }
       return;
    }
    public final void clear(){
       Object[] objArray = new Object[0];
       this.elementData = objArray;
       this.size = 0;
       this.count = 0;
    }
    public final String d(int p0,String p1){
       if (PatchProxy.isSupport(AlbumAssetList.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, AlbumAssetList.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p1+" Index: "+p0+", Size: "+this.size;
    }
    public final int getCount(){
       return this.count;
    }
    public final int getEmptyCount(){
       return (this.size - this.count);
    }
    public final int getSize(){
       return this.size;
    }
    public final void insert(int p0,Object p1){
       if (PatchProxy.isSupport(AlbumAssetList.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, AlbumAssetList.class, "2")) {
          return;
       }
       if (!this.a(p0)) {
          throw new IndexOutOfBoundsException(this.d(p0, "insert"));
       }
       this.c((this.size + 1));
       System.arraycopy(this.elementData, p0, this.elementData, (p0 + 1), (this.size - p0));
       this.elementData[p0] = p1;
       this.size = this.size + 1;
       this.count = this.count + 1;
       return;
    }
    public final void insert(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetList.class, "1")) {
          return;
       }
       this.c((this.size + 1));
       AlbumAssetList tsize = this.size;
       this.size = tsize + 1;
       this.elementData[tsize] = p0;
       this.count = this.count + 1;
       return;
    }
    public final boolean isListNonempty(){
       boolean b = (this.size == this.count)? true: false;
       return b;
    }
    public final Object query(int p0){
       if (PatchProxy.isSupport(AlbumAssetList.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, AlbumAssetList.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a(p0)) {
          return this.elementData[p0];
       }else {
          throw new IndexOutOfBoundsException(this.d(p0, "query"));
       }
    }
    public final Object[] query(int p0,int p1){
       Object[] obj;
       if (PatchProxy.isSupport(AlbumAssetList.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AlbumAssetList.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 <= p1) {
          if (this.a(p0)) {
             if (this.a(p1)) {
                p1 = (p1 - p0) + 1;
                obj = new Object[p1];
                System.arraycopy(this.elementData, p0, obj, 0, p1);
                return obj;
             }else {
                throw new IndexOutOfBoundsException(this.d(p0, "query end"));
             }
          }else {
             throw new IndexOutOfBoundsException(this.d(p0, "query start"));
          }
       }else {
          throw new IllegalArgumentException();
       }
    }
    public final void remove(int p0){
       if (PatchProxy.isSupport(AlbumAssetList.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetList.class, "3")) {
          return;
       }
       if (!this.a(p0)) {
          throw new IndexOutOfBoundsException(this.d(p0, "remove"));
       }
       int i = (this.size - p0) - 1;
       if (i > 0) {
          System.arraycopy(this.elementData, (p0 + 1), this.elementData, p0, i);
       }
       i = this.size - 1;
       this.size = i;
       p0[i] = null;
       this.count = this.count - 1;
       return;
    }
    public final void remove(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetList.class, "4")) {
          return;
       }
       AlbumAssetList telementData = this.elementData;
       int len = telementData.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          int i2 = i1 + 1;
          if (this.b(p0, telementData[i])) {
             break ;
          }else {
             i = i + 1;
             i1 = i2;
          }
       }
       this.remove(i1);
       return;
    }
    public final void resize(int p0){
       if (PatchProxy.isSupport(AlbumAssetList.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, AlbumAssetList.class, "9")) {
          return;
       }
       if (p0 == this.size) {
          return;
       }
       if (p0 < 0) {
          throw new IndexOutOfBoundsException("resized new size: "+p0);
       }
       this.c(p0);
       AlbumAssetList tsize = this.size;
       if (p0 < tsize) {
          for (int i = p0; i < tsize; i = i + 1) {
             this.elementData[i] = null;
          }
       }
       this.size = p0;
       return;
    }
    public final void update(int p0,Object p1){
       if (PatchProxy.isSupport(AlbumAssetList.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, AlbumAssetList.class, "5")) {
          return;
       }
       if (!this.a(p0)) {
          throw new IndexOutOfBoundsException(this.d(p0, "update"));
       }
       AlbumAssetList telementData = this.elementData;
       object oobject = telementData[p0];
       if (oobject == null && p1 != null) {
          this.count = this.count + 1;
       }
       if (oobject != null && p1 == null) {
          this.count = this.count - 1;
       }
       telementData[p0] = p1;
       return;
    }
    public final void update(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AlbumAssetList.class, "6")) {
          return;
       }
       AlbumAssetList telementData = this.elementData;
       int len = telementData.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          int i2 = i1 + 1;
          if (this.b(p0, telementData[i])) {
             break ;
          }else {
             i = i + 1;
             i1 = i2;
          }
       }
       this.update(i1, p1);
       return;
    }
}
