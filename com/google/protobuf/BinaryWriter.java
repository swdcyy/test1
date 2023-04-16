package com.google.protobuf.BinaryWriter;
import com.google.protobuf.Writer;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.BufferAllocator;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import java.lang.IllegalArgumentException;
import com.google.protobuf.BinaryWriter$1;
import com.google.protobuf.BinaryWriter$UnsafeDirectWriter;
import com.google.protobuf.BinaryWriter$UnsafeHeapWriter;
import com.google.protobuf.BinaryWriter$SafeDirectWriter;
import com.google.protobuf.BinaryWriter$SafeHeapWriter;
import java.lang.UnsupportedOperationException;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.Enum;
import java.lang.StringBuilder;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Integer;
import com.google.protobuf.ByteString;
import java.lang.Double;
import java.lang.Float;
import java.lang.Long;
import java.lang.Boolean;
import java.util.Queue;
import com.google.protobuf.Writer$FieldOrder;
import com.google.protobuf.AllocatedBuffer;
import java.lang.Math;
import java.util.List;
import com.google.protobuf.BooleanArrayList;
import com.google.protobuf.DoubleArrayList;
import com.google.protobuf.IntArrayList;
import com.google.protobuf.LongArrayList;
import com.google.protobuf.FloatArrayList;
import com.google.protobuf.Schema;
import com.google.protobuf.MapEntryLite$Metadata;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.protobuf.LazyStringList;

public abstract class BinaryWriter extends ByteOutput implements Writer	// class@0003c0
{
    public final BufferAllocator alloc;
    public final ArrayDeque buffers;
    public final int chunkSize;
    public int totalDoneBytes;

    public void BinaryWriter(BufferAllocator p0,int p1){
       super();
       this.buffers = new ArrayDeque(4);
       if (p1 <= 0) {
          throw new IllegalArgumentException("chunkSize must be > 0");
       }
       this.alloc = Internal.checkNotNull(p0, "alloc");
       this.chunkSize = p1;
       return;
    }
    public void BinaryWriter(BufferAllocator p0,int p1,BinaryWriter$1 p2){
       super(p0, p1);
    }
    public static byte computeUInt64SizeNoTag(long p0){
       byte b;
       if (!(-128 & p0)) {
          return 1;
       }
       if (p0 < 0) {
          return 10;
       }
       if (0xfffffff800000000 & p0) {
          b = (byte)6;
          p0 = p0 >> 28;
       }else {
          b = 2;
       }
       if (-2097152 & p0) {
          b = (byte)(b + 2);
          p0 = p0 >> 14;
       }
       if (p0 & -16384) {
          b = (byte)(b + 1);
       }
       return b;
    }
    public static boolean isUnsafeDirectSupported(){
       return BinaryWriter$UnsafeDirectWriter.isSupported();
    }
    public static boolean isUnsafeHeapSupported(){
       return BinaryWriter$UnsafeHeapWriter.isSupported();
    }
    public static BinaryWriter newDirectInstance(BufferAllocator p0){
       return BinaryWriter.newDirectInstance(p0, 4096);
    }
    public static BinaryWriter newDirectInstance(BufferAllocator p0,int p1){
       BinaryWriter uBinaryWrite = (BinaryWriter.isUnsafeDirectSupported())? BinaryWriter.newUnsafeDirectInstance(p0, p1): BinaryWriter.newSafeDirectInstance(p0, p1);
       return uBinaryWrite;
    }
    public static BinaryWriter newHeapInstance(BufferAllocator p0){
       return BinaryWriter.newHeapInstance(p0, 4096);
    }
    public static BinaryWriter newHeapInstance(BufferAllocator p0,int p1){
       BinaryWriter uBinaryWrite = (BinaryWriter.isUnsafeHeapSupported())? BinaryWriter.newUnsafeHeapInstance(p0, p1): BinaryWriter.newSafeHeapInstance(p0, p1);
       return uBinaryWrite;
    }
    public static BinaryWriter newSafeDirectInstance(BufferAllocator p0,int p1){
       return new BinaryWriter$SafeDirectWriter(p0, p1);
    }
    public static BinaryWriter newSafeHeapInstance(BufferAllocator p0,int p1){
       return new BinaryWriter$SafeHeapWriter(p0, p1);
    }
    public static BinaryWriter newUnsafeDirectInstance(BufferAllocator p0,int p1){
       if (BinaryWriter.isUnsafeDirectSupported()) {
          return new BinaryWriter$UnsafeDirectWriter(p0, p1);
       }
       throw new UnsupportedOperationException("Unsafe operations not supported");
    }
    public static BinaryWriter newUnsafeHeapInstance(BufferAllocator p0,int p1){
       if (BinaryWriter.isUnsafeHeapSupported()) {
          return new BinaryWriter$UnsafeHeapWriter(p0, p1);
       }
       throw new UnsupportedOperationException("Unsafe operations not supported");
    }
    public static final void writeMapEntryField(Writer p0,int p1,WireFormat$FieldType p2,Object p3){
       switch (BinaryWriter$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p2.ordinal()]){
           case 1:
             p0.writeBool(p1, p3.booleanValue());
             break;
           case 2:
             p0.writeFixed32(p1, p3.intValue());
             break;
           case 3:
             p0.writeFixed64(p1, p3.longValue());
             break;
           case 4:
             p0.writeInt32(p1, p3.intValue());
             break;
           case 5:
             p0.writeInt64(p1, p3.longValue());
             break;
           case 6:
             p0.writeSFixed32(p1, p3.intValue());
             break;
           case 7:
             p0.writeSFixed64(p1, p3.longValue());
             break;
           case 8:
             p0.writeSInt32(p1, p3.intValue());
             break;
           case 9:
             p0.writeSInt64(p1, p3.longValue());
             break;
           case 10:
             p0.writeString(p1, p3);
             break;
           case 11:
             p0.writeUInt32(p1, p3.intValue());
             break;
           case 12:
             p0.writeUInt64(p1, p3.longValue());
             break;
           case 13:
             p0.writeFloat(p1, p3.floatValue());
             break;
           case 14:
             p0.writeDouble(p1, p3.doubleValue());
             break;
           case 15:
             p0.writeMessage(p1, p3);
             break;
           case 16:
             p0.writeBytes(p1, p3);
             break;
           case 17:
             if (p3 instanceof Internal$EnumLite) {
                p0.writeEnum(p1, p3.getNumber());
             }else if(p3 instanceof Integer){
                p0.writeEnum(p1, p3.intValue());
             }else {
                throw new IllegalArgumentException("Unexpected type for enum in map.");
             }
             break;
           default:
             throw new IllegalArgumentException("Unsupported map value type for: "+p2);
       }
       return;
    }
    public final Queue complete(){
       this.finishCurrentBuffer();
       return this.buffers;
    }
    public final Writer$FieldOrder fieldOrder(){
       return Writer$FieldOrder.DESCENDING;
    }
    public abstract void finishCurrentBuffer();
    public abstract int getTotalBytesWritten();
    public final AllocatedBuffer newDirectBuffer(){
       return this.alloc.allocateDirectBuffer(this.chunkSize);
    }
    public final AllocatedBuffer newDirectBuffer(int p0){
       return this.alloc.allocateDirectBuffer(Math.max(p0, this.chunkSize));
    }
    public final AllocatedBuffer newHeapBuffer(){
       return this.alloc.allocateHeapBuffer(this.chunkSize);
    }
    public final AllocatedBuffer newHeapBuffer(int p0){
       return this.alloc.allocateHeapBuffer(Math.max(p0, this.chunkSize));
    }
    public abstract void requireSpace(int p0);
    public abstract void writeBool(boolean p0);
    public final void writeBoolList(int p0,List p1,boolean p2){
       if (p1 instanceof BooleanArrayList) {
          this.writeBoolList_Internal(p0, p1, p2);
       }else {
          this.writeBoolList_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeBoolList_Internal(int p0,BooleanArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace((p1.size() + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeBool(p1.getBoolean(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeBool(p0, p1.getBoolean(totalBytesWr));
          }
       }
       return;
    }
    public final void writeBoolList_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace((p1.size() + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeBool(p1.get(i).booleanValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeBool(p0, p1.get(totalBytesWr).booleanValue());
          }
       }
       return;
    }
    public final void writeBytesList(int p0,List p1){
       for (int i = p1.size() - 1; i >= 0; i = i - 1) {
          this.writeBytes(p0, p1.get(i));
       }
       return;
    }
    public final void writeDouble(int p0,double p1){
       this.writeFixed64(p0, Double.doubleToRawLongBits(p1));
    }
    public final void writeDoubleList(int p0,List p1,boolean p2){
       if (p1 instanceof DoubleArrayList) {
          this.writeDoubleList_Internal(p0, p1, p2);
       }else {
          this.writeDoubleList_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeDoubleList_Internal(int p0,DoubleArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 8) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed64(Double.doubleToRawLongBits(p1.getDouble(i)));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeDouble(p0, p1.getDouble(totalBytesWr));
          }
       }
       return;
    }
    public final void writeDoubleList_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 8) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed64(Double.doubleToRawLongBits(p1.get(i).doubleValue()));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeDouble(p0, p1.get(totalBytesWr).doubleValue());
          }
       }
       return;
    }
    public final void writeEnum(int p0,int p1){
       this.writeInt32(p0, p1);
    }
    public final void writeEnumList(int p0,List p1,boolean p2){
       this.writeInt32List(p0, p1, p2);
    }
    public abstract void writeFixed32(int p0);
    public final void writeFixed32List(int p0,List p1,boolean p2){
       if (p1 instanceof IntArrayList) {
          this.writeFixed32List_Internal(p0, p1, p2);
       }else {
          this.writeFixed32List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeFixed32List_Internal(int p0,IntArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 4) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed32(p1.getInt(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeFixed32(p0, p1.getInt(totalBytesWr));
          }
       }
       return;
    }
    public final void writeFixed32List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 4) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed32(p1.get(i).intValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeFixed32(p0, p1.get(totalBytesWr).intValue());
          }
       }
       return;
    }
    public abstract void writeFixed64(long p0);
    public final void writeFixed64List(int p0,List p1,boolean p2){
       if (p1 instanceof LongArrayList) {
          this.writeFixed64List_Internal(p0, p1, p2);
       }else {
          this.writeFixed64List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeFixed64List_Internal(int p0,LongArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 8) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed64(p1.getLong(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeFixed64(p0, p1.getLong(totalBytesWr));
          }
       }
       return;
    }
    public final void writeFixed64List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 8) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed64(p1.get(i).longValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeFixed64(p0, p1.get(totalBytesWr).longValue());
          }
       }
       return;
    }
    public final void writeFloat(int p0,float p1){
       this.writeFixed32(p0, Float.floatToRawIntBits(p1));
    }
    public final void writeFloatList(int p0,List p1,boolean p2){
       if (p1 instanceof FloatArrayList) {
          this.writeFloatList_Internal(p0, p1, p2);
       }else {
          this.writeFloatList_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeFloatList_Internal(int p0,FloatArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 4) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed32(Float.floatToRawIntBits(p1.getFloat(i)));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeFloat(p0, p1.getFloat(totalBytesWr));
          }
       }
       return;
    }
    public final void writeFloatList_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 4) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeFixed32(Float.floatToRawIntBits(p1.get(i).floatValue()));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeFloat(p0, p1.get(totalBytesWr).floatValue());
          }
       }
       return;
    }
    public final void writeGroupList(int p0,List p1){
       for (int i = p1.size() - 1; i >= 0; i = i - 1) {
          this.writeGroup(p0, p1.get(i));
       }
       return;
    }
    public final void writeGroupList(int p0,List p1,Schema p2){
       for (int i = p1.size() - 1; i >= 0; i = i - 1) {
          this.writeGroup(p0, p1.get(i), p2);
       }
       return;
    }
    public abstract void writeInt32(int p0);
    public final void writeInt32List(int p0,List p1,boolean p2){
       if (p1 instanceof IntArrayList) {
          this.writeInt32List_Internal(p0, p1, p2);
       }else {
          this.writeInt32List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeInt32List_Internal(int p0,IntArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 10) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeInt32(p1.getInt(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeInt32(p0, p1.getInt(totalBytesWr));
          }
       }
       return;
    }
    public final void writeInt32List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 10) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeInt32(p1.get(i).intValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeInt32(p0, p1.get(totalBytesWr).intValue());
          }
       }
       return;
    }
    public final void writeInt64(int p0,long p1){
       this.writeUInt64(p0, p1);
    }
    public final void writeInt64List(int p0,List p1,boolean p2){
       this.writeUInt64List(p0, p1, p2);
    }
    public final void writeLazyString(int p0,Object p1){
       if (p1 instanceof String) {
          this.writeString(p0, p1);
       }else {
          this.writeBytes(p0, p1);
       }
       return;
    }
    public void writeMap(int p0,MapEntryLite$Metadata p1,Map p2){
       Iterator iterator = p2.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          BinaryWriter.writeMapEntryField(this, 2, p1.valueType, uEntry.getValue());
          BinaryWriter.writeMapEntryField(this, 1, p1.keyType, uEntry.getKey());
          int i = this.getTotalBytesWritten() - this.getTotalBytesWritten();
          this.writeVarint32(i);
          this.writeTag(p0, 2);
       }
       return;
    }
    public final void writeMessageList(int p0,List p1){
       for (int i = p1.size() - 1; i >= 0; i = i - 1) {
          this.writeMessage(p0, p1.get(i));
       }
       return;
    }
    public final void writeMessageList(int p0,List p1,Schema p2){
       for (int i = p1.size() - 1; i >= 0; i = i - 1) {
          this.writeMessage(p0, p1.get(i), p2);
       }
       return;
    }
    public final void writeMessageSetItem(int p0,Object p1){
       this.writeTag(1, 4);
       if (p1 instanceof ByteString) {
          this.writeBytes(3, p1);
       }else {
          this.writeMessage(3, p1);
       }
       this.writeUInt32(2, p0);
       this.writeTag(1, 3);
       return;
    }
    public final void writeSFixed32(int p0,int p1){
       this.writeFixed32(p0, p1);
    }
    public final void writeSFixed32List(int p0,List p1,boolean p2){
       this.writeFixed32List(p0, p1, p2);
    }
    public final void writeSFixed64(int p0,long p1){
       this.writeFixed64(p0, p1);
    }
    public final void writeSFixed64List(int p0,List p1,boolean p2){
       this.writeFixed64List(p0, p1, p2);
    }
    public abstract void writeSInt32(int p0);
    public final void writeSInt32List(int p0,List p1,boolean p2){
       if (p1 instanceof IntArrayList) {
          this.writeSInt32List_Internal(p0, p1, p2);
       }else {
          this.writeSInt32List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeSInt32List_Internal(int p0,IntArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 5) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeSInt32(p1.getInt(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeSInt32(p0, p1.getInt(totalBytesWr));
          }
       }
       return;
    }
    public final void writeSInt32List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 5) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeSInt32(p1.get(i).intValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeSInt32(p0, p1.get(totalBytesWr).intValue());
          }
       }
       return;
    }
    public abstract void writeSInt64(long p0);
    public final void writeSInt64List(int p0,List p1,boolean p2){
       if (p1 instanceof LongArrayList) {
          this.writeSInt64List_Internal(p0, p1, p2);
       }else {
          this.writeSInt64List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeSInt64List_Internal(int p0,LongArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 10) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeSInt64(p1.getLong(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeSInt64(p0, p1.getLong(totalBytesWr));
          }
       }
       return;
    }
    public final void writeSInt64List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 10) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeSInt64(p1.get(i).longValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeSInt64(p0, p1.get(totalBytesWr).longValue());
          }
       }
       return;
    }
    public abstract void writeString(String p0);
    public final void writeStringList(int p0,List p1){
       if (p1 instanceof LazyStringList) {
          LazyStringList lazyStringLi = p1;
          for (int i = p1.size() - 1; i >= 0; i--) {
             this.writeLazyString(p0, lazyStringLi.getRaw(i));
          }
       }else {
          for (int i1 = p1.size() - 1; i1 >= 0; i1 = i1 - 1) {
             this.writeString(p0, p1.get(i1));
          }
       }
       return;
    }
    public abstract void writeTag(int p0,int p1);
    public final void writeUInt32List(int p0,List p1,boolean p2){
       if (p1 instanceof IntArrayList) {
          this.writeUInt32List_Internal(p0, p1, p2);
       }else {
          this.writeUInt32List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeUInt32List_Internal(int p0,IntArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 5) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeVarint32(p1.getInt(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeUInt32(p0, p1.getInt(totalBytesWr));
          }
       }
       return;
    }
    public final void writeUInt32List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 5) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeVarint32(p1.get(i).intValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeUInt32(p0, p1.get(totalBytesWr).intValue());
          }
       }
       return;
    }
    public final void writeUInt64List(int p0,List p1,boolean p2){
       if (p1 instanceof LongArrayList) {
          this.writeUInt64List_Internal(p0, p1, p2);
       }else {
          this.writeUInt64List_Internal(p0, p1, p2);
       }
       return;
    }
    public final void writeUInt64List_Internal(int p0,LongArrayList p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 10) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeVarint64(p1.getLong(i));
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeUInt64(p0, p1.getLong(totalBytesWr));
          }
       }
       return;
    }
    public final void writeUInt64List_Internal(int p0,List p1,boolean p2){
       int totalBytesWr;
       if (p2) {
          this.requireSpace(((p1.size() * 10) + 10));
          totalBytesWr = this.getTotalBytesWritten();
          for (int i = p1.size() - 1; i >= 0; i = i - 1) {
             this.writeVarint64(p1.get(i).longValue());
          }
          this.writeVarint32((this.getTotalBytesWritten() - totalBytesWr));
          this.writeTag(p0, 2);
       }else {
          for (totalBytesWr = p1.size() - 1; totalBytesWr >= 0; totalBytesWr--) {
             this.writeUInt64(p0, p1.get(totalBytesWr).longValue());
          }
       }
       return;
    }
    public abstract void writeVarint32(int p0);
    public abstract void writeVarint64(long p0);
}
