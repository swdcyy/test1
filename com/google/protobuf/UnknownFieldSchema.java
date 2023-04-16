package com.google.protobuf.UnknownFieldSchema;
import java.lang.Object;
import com.google.protobuf.ByteString;
import com.google.protobuf.Reader;
import com.google.protobuf.WireFormat;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Writer;

public abstract class UnknownFieldSchema	// class@0004de
{

    public void UnknownFieldSchema(){
       super();
    }
    public abstract void addFixed32(Object p0,int p1,int p2);
    public abstract void addFixed64(Object p0,int p1,long p2);
    public abstract void addGroup(Object p0,int p1,Object p2);
    public abstract void addLengthDelimited(Object p0,int p1,ByteString p2);
    public abstract void addVarint(Object p0,int p1,long p2);
    public abstract Object getBuilderFromMessage(Object p0);
    public abstract Object getFromMessage(Object p0);
    public abstract int getSerializedSize(Object p0);
    public abstract int getSerializedSizeAsMessageSet(Object p0);
    public abstract void makeImmutable(Object p0);
    public abstract Object merge(Object p0,Object p1);
    public final void mergeFrom(Object p0,Reader p1){
       do {
       } while (p1.getFieldNumber() == Integer.MAX_VALUE || !this.mergeOneFieldFrom(p0, p1));
       return;
    }
    public final boolean mergeOneFieldFrom(Object p0,Reader p1){
       int tag = p1.getTag();
       int tagFieldNumb = WireFormat.getTagFieldNumber(tag);
       tag = WireFormat.getTagWireType(tag);
       if (tag) {
          if (tag != 1) {
             if (tag != 2) {
                if (tag != 3) {
                   if (tag == 4) {
                      return false;
                   }
                   if (tag != 5) {
                      throw InvalidProtocolBufferException.invalidWireType();
                   }
                   this.addFixed32(p0, tagFieldNumb, p1.readFixed32());
                   return true;
                }else {
                   Object obj = this.newBuilder();
                   this.mergeFrom(obj, p1);
                   if (WireFormat.makeTag(tagFieldNumb, 4) != p1.getTag()) {
                      throw InvalidProtocolBufferException.invalidEndTag();
                   }
                   this.addGroup(p0, tagFieldNumb, this.toImmutable(obj));
                   return true;
                }
             }else {
                this.addLengthDelimited(p0, tagFieldNumb, p1.readBytes());
                return true;
             }
          }else {
             this.addFixed64(p0, tagFieldNumb, p1.readFixed64());
             return true;
          }
       }else {
          this.addVarint(p0, tagFieldNumb, p1.readInt64());
          return true;
       }
    }
    public abstract Object newBuilder();
    public abstract void setBuilderToMessage(Object p0,Object p1);
    public abstract void setToMessage(Object p0,Object p1);
    public abstract boolean shouldDiscardUnknownFields(Reader p0);
    public abstract Object toImmutable(Object p0);
    public abstract void writeAsMessageSetTo(Object p0,Writer p1);
    public abstract void writeTo(Object p0,Writer p1);
}
