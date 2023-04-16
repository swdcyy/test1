package com.google.protobuf.UnknownFieldSetLiteSchema;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLite;
import com.google.protobuf.WireFormat;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Long;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Reader;
import com.google.protobuf.Writer;

public class UnknownFieldSetLiteSchema extends UnknownFieldSchema	// class@0004e0
{

    public void UnknownFieldSetLiteSchema(){
       super();
    }
    public void addFixed32(UnknownFieldSetLite p0,int p1,int p2){
       p0.storeField(WireFormat.makeTag(p1, 5), Integer.valueOf(p2));
    }
    public void addFixed32(Object p0,int p1,int p2){
       this.addFixed32(p0, p1, p2);
    }
    public void addFixed64(UnknownFieldSetLite p0,int p1,long p2){
       p0.storeField(WireFormat.makeTag(p1, 1), Long.valueOf(p2));
    }
    public void addFixed64(Object p0,int p1,long p2){
       this.addFixed64(p0, p1, p2);
    }
    public void addGroup(UnknownFieldSetLite p0,int p1,UnknownFieldSetLite p2){
       p0.storeField(WireFormat.makeTag(p1, 3), p2);
    }
    public void addGroup(Object p0,int p1,Object p2){
       this.addGroup(p0, p1, p2);
    }
    public void addLengthDelimited(UnknownFieldSetLite p0,int p1,ByteString p2){
       p0.storeField(WireFormat.makeTag(p1, 2), p2);
    }
    public void addLengthDelimited(Object p0,int p1,ByteString p2){
       this.addLengthDelimited(p0, p1, p2);
    }
    public void addVarint(UnknownFieldSetLite p0,int p1,long p2){
       p0.storeField(WireFormat.makeTag(p1, 0), Long.valueOf(p2));
    }
    public void addVarint(Object p0,int p1,long p2){
       this.addVarint(p0, p1, p2);
    }
    public UnknownFieldSetLite getBuilderFromMessage(Object p0){
       UnknownFieldSetLite fromMessage = this.getFromMessage(p0);
       if (fromMessage == UnknownFieldSetLite.getDefaultInstance()) {
          fromMessage = UnknownFieldSetLite.newInstance();
          this.setToMessage(p0, fromMessage);
       }
       return fromMessage;
    }
    public Object getBuilderFromMessage(Object p0){
       return this.getBuilderFromMessage(p0);
    }
    public UnknownFieldSetLite getFromMessage(Object p0){
       return p0.unknownFields;
    }
    public Object getFromMessage(Object p0){
       return this.getFromMessage(p0);
    }
    public int getSerializedSize(UnknownFieldSetLite p0){
       return p0.getSerializedSize();
    }
    public int getSerializedSize(Object p0){
       return this.getSerializedSize(p0);
    }
    public int getSerializedSizeAsMessageSet(UnknownFieldSetLite p0){
       return p0.getSerializedSizeAsMessageSet();
    }
    public int getSerializedSizeAsMessageSet(Object p0){
       return this.getSerializedSizeAsMessageSet(p0);
    }
    public void makeImmutable(Object p0){
       this.getFromMessage(p0).makeImmutable();
    }
    public UnknownFieldSetLite merge(UnknownFieldSetLite p0,UnknownFieldSetLite p1){
       if (p1.equals(UnknownFieldSetLite.getDefaultInstance())) {
       }else {
          p0 = UnknownFieldSetLite.mutableCopyOf(p0, p1);
       }
       return p0;
    }
    public Object merge(Object p0,Object p1){
       return this.merge(p0, p1);
    }
    public UnknownFieldSetLite newBuilder(){
       return UnknownFieldSetLite.newInstance();
    }
    public Object newBuilder(){
       return this.newBuilder();
    }
    public void setBuilderToMessage(Object p0,UnknownFieldSetLite p1){
       this.setToMessage(p0, p1);
    }
    public void setBuilderToMessage(Object p0,Object p1){
       this.setBuilderToMessage(p0, p1);
    }
    public void setToMessage(Object p0,UnknownFieldSetLite p1){
       p0.unknownFields = p1;
    }
    public void setToMessage(Object p0,Object p1){
       this.setToMessage(p0, p1);
    }
    public boolean shouldDiscardUnknownFields(Reader p0){
       return false;
    }
    public UnknownFieldSetLite toImmutable(UnknownFieldSetLite p0){
       p0.makeImmutable();
       return p0;
    }
    public Object toImmutable(Object p0){
       return this.toImmutable(p0);
    }
    public void writeAsMessageSetTo(UnknownFieldSetLite p0,Writer p1){
       p0.writeAsMessageSetTo(p1);
    }
    public void writeAsMessageSetTo(Object p0,Writer p1){
       this.writeAsMessageSetTo(p0, p1);
    }
    public void writeTo(UnknownFieldSetLite p0,Writer p1){
       p0.writeTo(p1);
    }
    public void writeTo(Object p0,Writer p1){
       this.writeTo(p0, p1);
    }
}
