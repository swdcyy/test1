package com.google.protobuf.ListFieldSchema$ListFieldSchemaLite;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.ListFieldSchema$1;
import java.lang.Object;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.UnsafeUtil;
import java.util.List;
import java.util.Collection;

public final class ListFieldSchema$ListFieldSchemaLite extends ListFieldSchema	// class@000467
{

    public void ListFieldSchema$ListFieldSchemaLite(){
       super(null);
    }
    public void ListFieldSchema$ListFieldSchemaLite(ListFieldSchema$1 p0){
       super();
    }
    public static Internal$ProtobufList getProtobufList(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1);
    }
    public void makeImmutableListAt(Object p0,long p1){
       ListFieldSchema$ListFieldSchemaLite.getProtobufList(p0, p1).makeImmutable();
    }
    public void mergeListsAt(Object p0,Object p1,long p2){
       Internal$ProtobufList protobufList = ListFieldSchema$ListFieldSchemaLite.getProtobufList(p0, p2);
       p1 = ListFieldSchema$ListFieldSchemaLite.getProtobufList(p1, p2);
       int i = protobufList.size();
       int i1 = p1.size();
       if (i > 0 && i1 > 0) {
          if (!protobufList.isModifiable()) {
             protobufList = protobufList.mutableCopyWithCapacity((i1 + i));
          }
          protobufList.addAll(p1);
       }
       if (i > 0) {
          p1 = protobufList;
       }
       UnsafeUtil.putObject(p0, p2, p1);
       return;
    }
    public List mutableListAt(Object p0,long p1){
       Internal$ProtobufList protobufList = ListFieldSchema$ListFieldSchemaLite.getProtobufList(p0, p1);
       if (!protobufList.isModifiable()) {
          int i = protobufList.size();
          i = (!i)? 10: i * 2;
          protobufList = protobufList.mutableCopyWithCapacity(i);
          UnsafeUtil.putObject(p0, p1, protobufList);
       }
       return protobufList;
    }
}
