package com.google.protobuf.ListFieldSchema$ListFieldSchemaFull;
import com.google.protobuf.ListFieldSchema;
import java.util.List;
import java.util.Collections;
import java.lang.Class;
import java.lang.Object;
import com.google.protobuf.ListFieldSchema$1;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import com.google.protobuf.Internal$ProtobufList;
import java.util.ArrayList;
import java.util.Collection;
import com.google.protobuf.UnmodifiableLazyStringList;

public final class ListFieldSchema$ListFieldSchemaFull extends ListFieldSchema	// class@000466
{
    public static final Class UNMODIFIABLE_LIST_CLASS;

    static {
       ListFieldSchema$ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    public void ListFieldSchema$ListFieldSchemaFull(){
       super(null);
    }
    public void ListFieldSchema$ListFieldSchemaFull(ListFieldSchema$1 p0){
       super();
    }
    public static List getList(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1);
    }
    public static List mutableListAt(Object p0,long p1,int p2){
       ArrayList uArrayList;
       List list = ListFieldSchema$ListFieldSchemaFull.getList(p0, p1);
       if (list.isEmpty()) {
          if (list instanceof LazyStringList) {
             list = new LazyStringArrayList(p2);
          }else if(list instanceof PrimitiveNonBoxingCollection && list instanceof Internal$ProtobufList){
             list = list.mutableCopyWithCapacity(p2);
          }else {
             list = new ArrayList(p2);
          }
          UnsafeUtil.putObject(p0, p1, list);
       }else if(ListFieldSchema$ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())){
          uArrayList = new ArrayList((list.size() + p2));
          uArrayList.addAll(list);
          UnsafeUtil.putObject(p0, p1, uArrayList);
       }else if(list instanceof UnmodifiableLazyStringList){
          uArrayList = new LazyStringArrayList((list.size() + p2));
          uArrayList.addAll(list);
          UnsafeUtil.putObject(p0, p1, uArrayList);
       }else if(list instanceof PrimitiveNonBoxingCollection && list instanceof Internal$ProtobufList){
          List list1 = list;
          if (!list1.isModifiable()) {
             list = list1.mutableCopyWithCapacity((list.size() + p2));
             UnsafeUtil.putObject(p0, p1, list);
          }
       }
       list = uArrayList;
    label_007f :
       return list;
    }
    public void makeImmutableListAt(Object p0,long p1){
       LazyStringList unmodifiable;
       List object = UnsafeUtil.getObject(p0, p1);
       if (object instanceof LazyStringList) {
          unmodifiable = object.getUnmodifiableView();
       }else if(ListFieldSchema$ListFieldSchemaFull.UNMODIFIABLE_LIST_CLASS.isAssignableFrom(object.getClass())){
          return;
       }else if(object instanceof PrimitiveNonBoxingCollection && object instanceof Internal$ProtobufList){
          if (object.isModifiable()) {
             object.makeImmutable();
          }
          return;
       }else {
          unmodifiable = Collections.unmodifiableList(object);
       }
       UnsafeUtil.putObject(p0, p1, unmodifiable);
       return;
    }
    public void mergeListsAt(Object p0,Object p1,long p2){
       p1 = ListFieldSchema$ListFieldSchemaFull.getList(p1, p2);
       List list = ListFieldSchema$ListFieldSchemaFull.mutableListAt(p0, p2, p1.size());
       int i = list.size();
       int i1 = p1.size();
       if (i > 0 && i1 > 0) {
          list.addAll(p1);
       }
       if (i > 0) {
          p1 = list;
       }
       UnsafeUtil.putObject(p0, p2, p1);
       return;
    }
    public List mutableListAt(Object p0,long p1){
       return ListFieldSchema$ListFieldSchemaFull.mutableListAt(p0, p1, 10);
    }
}
