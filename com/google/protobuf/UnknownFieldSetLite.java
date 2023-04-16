package com.google.protobuf.UnknownFieldSetLite;
import java.lang.Object;
import java.util.Arrays;
import java.lang.System;
import com.google.protobuf.Writer;
import com.google.protobuf.WireFormat;
import java.lang.Integer;
import java.lang.RuntimeException;
import com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import com.google.protobuf.InvalidProtocolBufferException;
import java.lang.Throwable;
import com.google.protobuf.Writer$FieldOrder;
import com.google.protobuf.ByteString;
import java.lang.Long;
import java.lang.UnsupportedOperationException;
import com.google.protobuf.CodedOutputStream;
import java.lang.IllegalStateException;
import com.google.protobuf.CodedInputStream;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.protobuf.MessageLiteToString;

public final class UnknownFieldSetLite	// class@0004df
{
    public int count;
    public boolean isMutable;
    public int memoizedSerializedSize;
    public Object[] objects;
    public int[] tags;
    public static final UnknownFieldSetLite DEFAULT_INSTANCE;

    static {
       int[] ointArray = new int[0];
       Object[] objArray = new Object[0];
       UnknownFieldSetLite.DEFAULT_INSTANCE = new UnknownFieldSetLite(0, ointArray, objArray, 0);
    }
    public void UnknownFieldSetLite(){
       int[] ointArray = new int[8];
       Object[] objArray = new Object[8];
       super(0, ointArray, objArray, true);
    }
    public void UnknownFieldSetLite(int p0,int[] p1,Object[] p2,boolean p3){
       super();
       this.memoizedSerializedSize = -1;
       this.count = p0;
       this.tags = p1;
       this.objects = p2;
       this.isMutable = p3;
    }
    public static boolean equals(int[] p0,int[] p1,int p2){
       int i = 0;
       while (true) {
          if (i >= p2) {
             return true;
          }
          if (p0[i] != p1[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean equals(Object[] p0,Object[] p1,int p2){
       int i = 0;
       while (true) {
          if (i >= p2) {
             return true;
          }
          if (!p0[i].equals(p1[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public static UnknownFieldSetLite getDefaultInstance(){
       return UnknownFieldSetLite.DEFAULT_INSTANCE;
    }
    public static int hashCode(int[] p0,int p1){
       int i = 17;
       for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
          i = i * 31;
          i = i + p0[i1];
       }
       return i;
    }
    public static int hashCode(Object[] p0,int p1){
       int i = 17;
       for (int i1 = 0; i1 < p1; i1 = i1 + 1) {
          i = i * 31;
          i = i + p0[i1].hashCode();
       }
       return i;
    }
    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite p0,UnknownFieldSetLite p1){
       int i = p0.count + p1.count;
       int[] ointArray = Arrays.copyOf(p0.tags, i);
       System.arraycopy(p1.tags, 0, ointArray, p0.count, p1.count);
       Object[] objArray = Arrays.copyOf(p0.objects, i);
       System.arraycopy(p1.objects, 0, objArray, p0.count, p1.count);
       return new UnknownFieldSetLite(i, ointArray, objArray, true);
    }
    public static UnknownFieldSetLite newInstance(){
       return new UnknownFieldSetLite();
    }
    public static void writeField(int p0,Object p1,Writer p2){
       int tagFieldNumb = WireFormat.getTagFieldNumber(p0);
       p0 = WireFormat.getTagWireType(p0);
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 == 5) {
                      p2.writeFixed32(tagFieldNumb, p1.intValue());
                   }else {
                      throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
                   }
                }else if(p2.fieldOrder() == Writer$FieldOrder.ASCENDING){
                   p2.writeStartGroup(tagFieldNumb);
                   p1.writeTo(p2);
                   p2.writeEndGroup(tagFieldNumb);
                }else {
                   p2.writeEndGroup(tagFieldNumb);
                   p1.writeTo(p2);
                   p2.writeStartGroup(tagFieldNumb);
                }
             }else {
                p2.writeBytes(tagFieldNumb, p1);
             }
          }else {
             p2.writeFixed64(tagFieldNumb, p1.longValue());
          }
       }else {
          p2.writeInt64(tagFieldNumb, p1.longValue());
       }
       return;
    }
    public void checkMutable(){
       if (this.isMutable != null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public final void ensureCapacity(){
       UnknownFieldSetLite tcount = this.count;
       UnknownFieldSetLite ttags = this.tags;
       if (tcount == ttags.length) {
          int i = (tcount < 4)? 8: tcount >> 1;
          int i1 = tcount + i;
          this.tags = Arrays.copyOf(ttags, i1);
          this.objects = Arrays.copyOf(this.objects, i1);
       }
       return;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof UnknownFieldSetLite) {
          return false;
       }
       UnknownFieldSetLite tcount = this.count;
       if (tcount == p0.count && (!UnknownFieldSetLite.equals(this.tags, p0.tags, tcount) || !UnknownFieldSetLite.equals(this.objects, p0.objects, this.count))) {
          return false;
       }
       return true;
    }
    public int getSerializedSize(){
       UnknownFieldSetLite tmemoizedSer = this.memoizedSerializedSize;
       if (tmemoizedSer != -1) {
          return tmemoizedSer;
       }
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < this.count) {
             int i2 = this.tags[i];
             int tagFieldNumb = WireFormat.getTagFieldNumber(i2);
             i2 = WireFormat.getTagWireType(i2);
             if (i2) {
                if (i2 != 1) {
                   if (i2 != 2) {
                      if (i2 != 3) {
                         if (i2 == 5) {
                            i2 = CodedOutputStream.computeFixed32Size(tagFieldNumb, this.objects[i].intValue());
                         }else {
                            break ;
                         }
                      }else {
                         i2 = CodedOutputStream.computeTagSize(tagFieldNumb) * 2;
                         i2 = i2 + this.objects[i].getSerializedSize();
                      }
                   }else {
                      i2 = CodedOutputStream.computeBytesSize(tagFieldNumb, this.objects[i]);
                   }
                }else {
                   i2 = CodedOutputStream.computeFixed64Size(tagFieldNumb, this.objects[i].longValue());
                }
             }else {
                i2 = CodedOutputStream.computeUInt64Size(tagFieldNumb, this.objects[i].longValue());
             }
             i1 = i1 + i2;
             i = i + 1;
          }else {
             this.memoizedSerializedSize = i1;
             return i1;
          }
       }
       throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
    }
    public int getSerializedSizeAsMessageSet(){
       UnknownFieldSetLite tmemoizedSer = this.memoizedSerializedSize;
       if (tmemoizedSer != -1) {
          return tmemoizedSer;
       }
       int i1 = 0;
       for (int i = 0; i < this.count; i = i + 1) {
          i1 = i1 + CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i]), this.objects[i]);
       }
       this.memoizedSerializedSize = i1;
       return i1;
    }
    public int hashCode(){
       UnknownFieldSetLite tcount = this.count;
       return (((((527 + tcount) * 31) + UnknownFieldSetLite.hashCode(this.tags, tcount)) * 31) + UnknownFieldSetLite.hashCode(this.objects, this.count));
    }
    public void makeImmutable(){
       this.isMutable = false;
    }
    public boolean mergeFieldFrom(int p0,CodedInputStream p1){
       this.checkMutable();
       int tagFieldNumb = WireFormat.getTagFieldNumber(p0);
       int tagWireType = WireFormat.getTagWireType(p0);
       if (tagWireType) {
          if (tagWireType != 1) {
             if (tagWireType != 2) {
                if (tagWireType != 3) {
                   if (tagWireType == 4) {
                      return false;
                   }
                   if (tagWireType != 5) {
                      throw InvalidProtocolBufferException.invalidWireType();
                   }
                   this.storeField(p0, Integer.valueOf(p1.readFixed32()));
                   return true;
                }else {
                   UnknownFieldSetLite unknownField = new UnknownFieldSetLite();
                   unknownField.mergeFrom(p1);
                   p1.checkLastTagWas(WireFormat.makeTag(tagFieldNumb, 4));
                   this.storeField(p0, unknownField);
                   return true;
                }
             }else {
                this.storeField(p0, p1.readBytes());
                return true;
             }
          }else {
             this.storeField(p0, Long.valueOf(p1.readFixed64()));
             return true;
          }
       }else {
          this.storeField(p0, Long.valueOf(p1.readInt64()));
          return true;
       }
    }
    public final UnknownFieldSetLite mergeFrom(CodedInputStream p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !this.mergeFieldFrom(i, p0));
       return this;
    }
    public UnknownFieldSetLite mergeLengthDelimitedField(int p0,ByteString p1){
       this.checkMutable();
       if (!p0) {
          throw new IllegalArgumentException("Zero is not a valid field number.");
       }
       this.storeField(WireFormat.makeTag(p0, 2), p1);
       return this;
    }
    public UnknownFieldSetLite mergeVarintField(int p0,int p1){
       this.checkMutable();
       if (!p0) {
          throw new IllegalArgumentException("Zero is not a valid field number.");
       }
       this.storeField(WireFormat.makeTag(p0, 0), Long.valueOf((long)p1));
       return this;
    }
    public final void printWithIndent(StringBuilder p0,int p1){
       for (int i = 0; i < this.count; i = i + 1) {
          MessageLiteToString.printField(p0, p1, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i])), this.objects[i]);
       }
       return;
    }
    public void storeField(int p0,Object p1){
       this.checkMutable();
       this.ensureCapacity();
       UnknownFieldSetLite tcount = this.count;
       this.tags[tcount] = p0;
       p0[tcount] = p1;
       this.count = tcount + 1;
    }
    public void writeAsMessageSetTo(CodedOutputStream p0){
       for (int i = 0; i < this.count; i = i + 1) {
          p0.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i]), this.objects[i]);
       }
       return;
    }
    public void writeAsMessageSetTo(Writer p0){
       int i;
       if (p0.fieldOrder() == Writer$FieldOrder.DESCENDING) {
          for (i = this.count - 1; i >= 0; i = i - 1) {
             p0.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i]), this.objects[i]);
          }
       }else {
          for (i = 0; i < this.count; i = i + 1) {
             p0.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i]), this.objects[i]);
          }
       }
       return;
    }
    public void writeTo(CodedOutputStream p0){
       int i = 0;
       while (true) {
          if (i >= this.count) {
             return;
          }
          int i1 = this.tags[i];
          int tagFieldNumb = WireFormat.getTagFieldNumber(i1);
          i1 = WireFormat.getTagWireType(i1);
          if (i1) {
             if (i1 != 1) {
                if (i1 != 2) {
                   int i2 = 3;
                   if (i1 != i2) {
                      if (i1 == 5) {
                         p0.writeFixed32(tagFieldNumb, this.objects[i].intValue());
                      }else {
                         break ;
                      }
                   }else {
                      p0.writeTag(tagFieldNumb, i2);
                      this.objects[i].writeTo(p0);
                      p0.writeTag(tagFieldNumb, 4);
                   }
                }else {
                   p0.writeBytes(tagFieldNumb, this.objects[i]);
                }
             }else {
                p0.writeFixed64(tagFieldNumb, this.objects[i].longValue());
             }
          }else {
             p0.writeUInt64(tagFieldNumb, this.objects[i].longValue());
          }
          i = i + 1;
       }
       throw InvalidProtocolBufferException.invalidWireType();
    }
    public void writeTo(Writer p0){
       int i;
       if (this.count == null) {
          return;
       }
       if (p0.fieldOrder() == Writer$FieldOrder.ASCENDING) {
          for (i = 0; i < this.count; i = i + 1) {
             UnknownFieldSetLite.writeField(this.tags[i], this.objects[i], p0);
          }
       }else {
          for (i = this.count - 1; i >= 0; i = i - 1) {
             UnknownFieldSetLite.writeField(this.tags[i], this.objects[i], p0);
          }
       }
       return;
    }
}
