package com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import java.util.RandomAccess;
import com.google.protobuf.AbstractProtobufList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.ByteString;
import java.util.AbstractList;
import com.google.protobuf.LazyStringArrayList$ByteArrayListView;
import com.google.protobuf.LazyStringArrayList$ByteStringListView;
import java.util.Collections;
import com.google.protobuf.UnmodifiableLazyStringList;
import java.util.Iterator;
import java.util.Arrays;
import com.google.protobuf.Internal$ProtobufList;
import java.lang.IllegalArgumentException;

public class LazyStringArrayList extends AbstractProtobufList implements LazyStringList, RandomAccess	// class@000463
{
    public final List list;
    public static final LazyStringList EMPTY;
    public static final LazyStringArrayList EMPTY_LIST;

    static {
       LazyStringArrayList lazyStringAr = new LazyStringArrayList();
       LazyStringArrayList.EMPTY_LIST = lazyStringAr;
       lazyStringAr.makeImmutable();
       LazyStringArrayList.EMPTY = lazyStringAr;
    }
    public void LazyStringArrayList(){
       super(10);
    }
    public void LazyStringArrayList(int p0){
       super(new ArrayList(p0));
    }
    public void LazyStringArrayList(LazyStringList p0){
       super();
       this.list = new ArrayList(p0.size());
       this.addAll(p0);
    }
    public void LazyStringArrayList(ArrayList p0){
       super();
       this.list = p0;
    }
    public void LazyStringArrayList(List p0){
       super(new ArrayList(p0));
    }
    public static byte[] asByteArray(Object p0){
       if (p0 instanceof byte[]) {
          return p0;
       }
       if (p0 instanceof String) {
          return Internal.toByteArray(p0);
       }
       return p0.toByteArray();
    }
    public static ByteString asByteString(Object p0){
       if (p0 instanceof ByteString) {
          return p0;
       }
       if (p0 instanceof String) {
          return ByteString.copyFromUtf8(p0);
       }
       return ByteString.copyFrom(p0);
    }
    public static String asString(Object p0){
       if (p0 instanceof String) {
          return p0;
       }
       if (p0 instanceof ByteString) {
          return p0.toStringUtf8();
       }
       return Internal.toStringUtf8(p0);
    }
    public static LazyStringArrayList emptyList(){
       return LazyStringArrayList.EMPTY_LIST;
    }
    public void add(int p0,ByteString p1){
       this.ensureIsMutable();
       this.list.add(p0, p1);
       this.modCount = this.modCount + 1;
    }
    public void add(int p0,Object p1){
       this.add(p0, p1);
    }
    public void add(int p0,String p1){
       this.ensureIsMutable();
       this.list.add(p0, p1);
       this.modCount = this.modCount + 1;
    }
    public void add(int p0,byte[] p1){
       this.ensureIsMutable();
       this.list.add(p0, p1);
       this.modCount = this.modCount + 1;
    }
    public void add(ByteString p0){
       this.ensureIsMutable();
       this.list.add(p0);
       this.modCount = this.modCount + 1;
    }
    public void add(byte[] p0){
       this.ensureIsMutable();
       this.list.add(p0);
       this.modCount = this.modCount + 1;
    }
    public boolean addAll(int p0,Collection p1){
       List underlyingEl;
       this.ensureIsMutable();
       if (p1 instanceof LazyStringList) {
          underlyingEl = p1.getUnderlyingElements();
       }
       this.modCount = this.modCount + 1;
       return this.list.addAll(p0, underlyingEl);
    }
    public boolean addAll(Collection p0){
       return this.addAll(this.size(), p0);
    }
    public boolean addAllByteArray(Collection p0){
       this.ensureIsMutable();
       this.modCount = this.modCount + 1;
       return this.list.addAll(p0);
    }
    public boolean addAllByteString(Collection p0){
       this.ensureIsMutable();
       this.modCount = this.modCount + 1;
       return this.list.addAll(p0);
    }
    public List asByteArrayList(){
       return new LazyStringArrayList$ByteArrayListView(this);
    }
    public List asByteStringList(){
       return new LazyStringArrayList$ByteStringListView(this);
    }
    public void clear(){
       this.ensureIsMutable();
       this.list.clear();
       this.modCount = this.modCount + 1;
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public Object get(int p0){
       return this.get(p0);
    }
    public String get(int p0){
       String str;
       Object obj = this.list.get(p0);
       if (obj instanceof String) {
          return obj;
       }
       if (obj instanceof ByteString) {
          str = obj.toStringUtf8();
          if (obj.isValidUtf8()) {
             this.list.set(p0, str);
          }
          return str;
       }else {
          str = Internal.toStringUtf8(obj);
          if (Internal.isValidUtf8(obj)) {
             this.list.set(p0, str);
          }
          return str;
       }
    }
    public byte[] getByteArray(int p0){
       Object obj = this.list.get(p0);
       byte[] uobyteArray = LazyStringArrayList.asByteArray(obj);
       if (uobyteArray != obj) {
          this.list.set(p0, uobyteArray);
       }
       return uobyteArray;
    }
    public ByteString getByteString(int p0){
       Object obj = this.list.get(p0);
       ByteString uByteString = LazyStringArrayList.asByteString(obj);
       if (uByteString != obj) {
          this.list.set(p0, uByteString);
       }
       return uByteString;
    }
    public Object getRaw(int p0){
       return this.list.get(p0);
    }
    public List getUnderlyingElements(){
       return Collections.unmodifiableList(this.list);
    }
    public LazyStringList getUnmodifiableView(){
       if (this.isModifiable()) {
          return new UnmodifiableLazyStringList(this);
       }
       return this;
    }
    public int hashCode(){
       return super.hashCode();
    }
    public boolean isModifiable(){
       return super.isModifiable();
    }
    public void mergeFrom(LazyStringList p0){
       this.ensureIsMutable();
       Iterator iterator = p0.getUnderlyingElements().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj instanceof byte[]) {
             this.list.add(Arrays.copyOf(obj, obj.length));
          }else {
             this.list.add(obj);
          }
       }
       return;
    }
    public Internal$ProtobufList mutableCopyWithCapacity(int p0){
       return this.mutableCopyWithCapacity(p0);
    }
    public LazyStringArrayList mutableCopyWithCapacity(int p0){
       if (p0 < this.size()) {
          throw new IllegalArgumentException();
       }
       ArrayList uArrayList = new ArrayList(p0);
       uArrayList.addAll(this.list);
       return new LazyStringArrayList(uArrayList);
    }
    public Object remove(int p0){
       return this.remove(p0);
    }
    public String remove(int p0){
       this.ensureIsMutable();
       this.modCount = this.modCount + 1;
       return LazyStringArrayList.asString(this.list.remove(p0));
    }
    public boolean remove(Object p0){
       return super.remove(p0);
    }
    public boolean removeAll(Collection p0){
       return super.removeAll(p0);
    }
    public boolean retainAll(Collection p0){
       return super.retainAll(p0);
    }
    public Object set(int p0,Object p1){
       return this.set(p0, p1);
    }
    public String set(int p0,String p1){
       this.ensureIsMutable();
       return LazyStringArrayList.asString(this.list.set(p0, p1));
    }
    public void set(int p0,ByteString p1){
       this.setAndReturn(p0, p1);
    }
    public void set(int p0,byte[] p1){
       this.setAndReturn(p0, p1);
    }
    public Object setAndReturn(int p0,ByteString p1){
       this.ensureIsMutable();
       return this.list.set(p0, p1);
    }
    public Object setAndReturn(int p0,byte[] p1){
       this.ensureIsMutable();
       return this.list.set(p0, p1);
    }
    public int size(){
       return this.list.size();
    }
}
