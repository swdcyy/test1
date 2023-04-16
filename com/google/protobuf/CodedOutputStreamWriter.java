package com.google.protobuf.CodedOutputStreamWriter;
import com.google.protobuf.Writer;
import com.google.protobuf.CodedOutputStream;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.Writer$FieldOrder;
import java.util.List;
import java.lang.Boolean;
import com.google.protobuf.ByteString;
import com.google.protobuf.MapEntryLite$Metadata;
import com.google.protobuf.MapEntryLite;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.Long;
import com.google.protobuf.CodedOutputStreamWriter$1;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Double;
import java.lang.Float;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import java.util.Map$Entry;
import com.google.protobuf.LazyStringList;

public final class CodedOutputStreamWriter implements Writer	// class@0003f0
{
    public final CodedOutputStream output;

    public void CodedOutputStreamWriter(CodedOutputStream p0){
       super();
       p0 = Internal.checkNotNull(p0, "output");
       this.output = p0;
       p0.wrapper = this;
    }
    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream p0){
       CodedOutputStream wrapper = p0.wrapper;
       if (wrapper != null) {
          return wrapper;
       }
       return new CodedOutputStreamWriter(p0);
    }
    public Writer$FieldOrder fieldOrder(){
       return Writer$FieldOrder.ASCENDING;
    }
    public int getTotalBytesWritten(){
       return this.output.getTotalBytesWritten();
    }
    public void writeBool(int p0,boolean p1){
       this.output.writeBool(p0, p1);
    }
    public void writeBoolList(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeBoolSizeNoTag(p1.get(p0).booleanValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeBoolNoTag(p1.get(i).booleanValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeBool(p0, p1.get(i).booleanValue());
          }
       }
       return;
    }
    public void writeBytes(int p0,ByteString p1){
       this.output.writeBytes(p0, p1);
    }
    public void writeBytesList(int p0,List p1){
       for (int i = 0; i < p1.size(); i = i + 1) {
          this.output.writeBytes(p0, p1.get(i));
       }
       return;
    }
    public final void writeDeterministicBooleanMapEntry(int p0,boolean p1,Object p2,MapEntryLite$Metadata p3){
       this.output.writeTag(p0, 2);
       this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(p3, Boolean.valueOf(p1), p2));
       MapEntryLite.writeTo(this.output, p3, Boolean.valueOf(p1), p2);
    }
    public final void writeDeterministicIntegerMap(int p0,MapEntryLite$Metadata p1,Map p2){
       int i = p2.size();
       int[] ointArray = new int[i];
       Iterator iterator = p2.keySet().iterator();
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          int i3 = i2 + 1;
          ointArray[i2] = iterator.next().intValue();
          i2 = i3;
       }
       Arrays.sort(ointArray);
       for (; i1 < i; i1 = i1 + 1) {
          int i4 = ointArray[i1];
          Object obj = p2.get(Integer.valueOf(i4));
          this.output.writeTag(p0, 2);
          this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(p1, Integer.valueOf(i4), obj));
          MapEntryLite.writeTo(this.output, p1, Integer.valueOf(i4), obj);
       }
       return;
    }
    public final void writeDeterministicLongMap(int p0,MapEntryLite$Metadata p1,Map p2){
       int i = p2.size();
       long[] olongArray = new long[i];
       Iterator iterator = p2.keySet().iterator();
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          int i3 = i2 + 1;
          olongArray[i2] = iterator.next().longValue();
          i2 = i3;
       }
       Arrays.sort(olongArray);
       for (; i1 < i; i1 = i1 + 1) {
          long l = olongArray[i1];
          Object obj = p2.get(Long.valueOf(l));
          this.output.writeTag(p0, 2);
          this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(p1, Long.valueOf(l), obj));
          MapEntryLite.writeTo(this.output, p1, Long.valueOf(l), obj);
       }
       return;
    }
    public final void writeDeterministicMap(int p0,MapEntryLite$Metadata p1,Map p2){
       switch (CodedOutputStreamWriter$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p1.keyType.ordinal()]){
           case 1:
             Object obj = p2.get(Boolean.FALSE);
             if (obj != null) {
                this.writeDeterministicBooleanMapEntry(p0, false, obj, p1);
             }
             p2 = p2.get(Boolean.TRUE);
             if (p2 != null) {
                this.writeDeterministicBooleanMapEntry(p0, true, p2, p1);
             }
             break;
           case 2:
           case 4:
           case 5:
           case 6:
           case 3:
             this.writeDeterministicIntegerMap(p0, p1, p2);
             break;
           case 7:
           case 9:
           case 10:
           case 11:
           case 8:
             this.writeDeterministicLongMap(p0, p1, p2);
             break;
           case 12:
             this.writeDeterministicStringMap(p0, p1, p2);
             break;
           default:
             throw new IllegalArgumentException("does not support key type: "+p1.keyType);
       }
       return;
    }
    public final void writeDeterministicStringMap(int p0,MapEntryLite$Metadata p1,Map p2){
       int i = p2.size();
       String[] stringArray = new String[i];
       Iterator iterator = p2.keySet().iterator();
       int i1 = 0;
       int i2 = 0;
       while (iterator.hasNext()) {
          int i3 = i2 + 1;
          stringArray[i2] = iterator.next();
          i2 = i3;
       }
       Arrays.sort(stringArray);
       for (; i1 < i; i1 = i1 + 1) {
          object oobject = stringArray[i1];
          Object obj = p2.get(oobject);
          this.output.writeTag(p0, 2);
          this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(p1, oobject, obj));
          MapEntryLite.writeTo(this.output, p1, oobject, obj);
       }
       return;
    }
    public void writeDouble(int p0,double p1){
       this.output.writeDouble(p0, p1);
    }
    public void writeDoubleList(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeDoubleSizeNoTag(p1.get(p0).doubleValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeDoubleNoTag(p1.get(i).doubleValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeDouble(p0, p1.get(i).doubleValue());
          }
       }
       return;
    }
    public void writeEndGroup(int p0){
       this.output.writeTag(p0, 4);
    }
    public void writeEnum(int p0,int p1){
       this.output.writeEnum(p0, p1);
    }
    public void writeEnumList(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeEnumSizeNoTag(p1.get(p0).intValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeEnumNoTag(p1.get(i).intValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeEnum(p0, p1.get(i).intValue());
          }
       }
       return;
    }
    public void writeFixed32(int p0,int p1){
       this.output.writeFixed32(p0, p1);
    }
    public void writeFixed32List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeFixed32SizeNoTag(p1.get(p0).intValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeFixed32NoTag(p1.get(i).intValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeFixed32(p0, p1.get(i).intValue());
          }
       }
       return;
    }
    public void writeFixed64(int p0,long p1){
       this.output.writeFixed64(p0, p1);
    }
    public void writeFixed64List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeFixed64SizeNoTag(p1.get(p0).longValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeFixed64NoTag(p1.get(i).longValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeFixed64(p0, p1.get(i).longValue());
          }
       }
       return;
    }
    public void writeFloat(int p0,float p1){
       this.output.writeFloat(p0, p1);
    }
    public void writeFloatList(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeFloatSizeNoTag(p1.get(p0).floatValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeFloatNoTag(p1.get(i).floatValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeFloat(p0, p1.get(i).floatValue());
          }
       }
       return;
    }
    public void writeGroup(int p0,Object p1){
       this.output.writeGroup(p0, p1);
    }
    public void writeGroup(int p0,Object p1,Schema p2){
       this.output.writeGroup(p0, p1, p2);
    }
    public void writeGroupList(int p0,List p1){
       for (int i = 0; i < p1.size(); i = i + 1) {
          this.writeGroup(p0, p1.get(i));
       }
       return;
    }
    public void writeGroupList(int p0,List p1,Schema p2){
       for (int i = 0; i < p1.size(); i = i + 1) {
          this.writeGroup(p0, p1.get(i), p2);
       }
       return;
    }
    public void writeInt32(int p0,int p1){
       this.output.writeInt32(p0, p1);
    }
    public void writeInt32List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeInt32SizeNoTag(p1.get(p0).intValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeInt32NoTag(p1.get(i).intValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeInt32(p0, p1.get(i).intValue());
          }
       }
       return;
    }
    public void writeInt64(int p0,long p1){
       this.output.writeInt64(p0, p1);
    }
    public void writeInt64List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeInt64SizeNoTag(p1.get(p0).longValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeInt64NoTag(p1.get(i).longValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeInt64(p0, p1.get(i).longValue());
          }
       }
       return;
    }
    public final void writeLazyString(int p0,Object p1){
       if (p1 instanceof String) {
          this.output.writeString(p0, p1);
       }else {
          this.output.writeBytes(p0, p1);
       }
       return;
    }
    public void writeMap(int p0,MapEntryLite$Metadata p1,Map p2){
       if (this.output.isSerializationDeterministic()) {
          this.writeDeterministicMap(p0, p1, p2);
          return;
       }else {
          Iterator iterator = p2.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             this.output.writeTag(p0, 2);
             this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(p1, uEntry.getKey(), uEntry.getValue()));
             Object key = uEntry.getKey();
             MapEntryLite.writeTo(this.output, p1, key, uEntry.getValue());
          }
          return;
       }
    }
    public void writeMessage(int p0,Object p1){
       this.output.writeMessage(p0, p1);
    }
    public void writeMessage(int p0,Object p1,Schema p2){
       this.output.writeMessage(p0, p1, p2);
    }
    public void writeMessageList(int p0,List p1){
       for (int i = 0; i < p1.size(); i = i + 1) {
          this.writeMessage(p0, p1.get(i));
       }
       return;
    }
    public void writeMessageList(int p0,List p1,Schema p2){
       for (int i = 0; i < p1.size(); i = i + 1) {
          this.writeMessage(p0, p1.get(i), p2);
       }
       return;
    }
    public final void writeMessageSetItem(int p0,Object p1){
       if (p1 instanceof ByteString) {
          this.output.writeRawMessageSetExtension(p0, p1);
       }else {
          this.output.writeMessageSetExtension(p0, p1);
       }
       return;
    }
    public void writeSFixed32(int p0,int p1){
       this.output.writeSFixed32(p0, p1);
    }
    public void writeSFixed32List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeSFixed32SizeNoTag(p1.get(p0).intValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeSFixed32NoTag(p1.get(i).intValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeSFixed32(p0, p1.get(i).intValue());
          }
       }
       return;
    }
    public void writeSFixed64(int p0,long p1){
       this.output.writeSFixed64(p0, p1);
    }
    public void writeSFixed64List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeSFixed64SizeNoTag(p1.get(p0).longValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeSFixed64NoTag(p1.get(i).longValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeSFixed64(p0, p1.get(i).longValue());
          }
       }
       return;
    }
    public void writeSInt32(int p0,int p1){
       this.output.writeSInt32(p0, p1);
    }
    public void writeSInt32List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeSInt32SizeNoTag(p1.get(p0).intValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeSInt32NoTag(p1.get(i).intValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeSInt32(p0, p1.get(i).intValue());
          }
       }
       return;
    }
    public void writeSInt64(int p0,long p1){
       this.output.writeSInt64(p0, p1);
    }
    public void writeSInt64List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeSInt64SizeNoTag(p1.get(p0).longValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeSInt64NoTag(p1.get(i).longValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeSInt64(p0, p1.get(i).longValue());
          }
       }
       return;
    }
    public void writeStartGroup(int p0){
       this.output.writeTag(p0, 3);
    }
    public void writeString(int p0,String p1){
       this.output.writeString(p0, p1);
    }
    public void writeStringList(int p0,List p1){
       int i = 0;
       if (p1 instanceof LazyStringList) {
          LazyStringList lazyStringLi = p1;
          for (; i < p1.size(); this.writeLazyString(p0, lazyStringLi.getRaw(i))) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeString(p0, p1.get(i));
          }
       }
       return;
    }
    public void writeUInt32(int p0,int p1){
       this.output.writeUInt32(p0, p1);
    }
    public void writeUInt32List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeUInt32SizeNoTag(p1.get(p0).intValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeUInt32NoTag(p1.get(i).intValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeUInt32(p0, p1.get(i).intValue());
          }
       }
       return;
    }
    public void writeUInt64(int p0,long p1){
       this.output.writeUInt64(p0, p1);
    }
    public void writeUInt64List(int p0,List p1,boolean p2){
       int i = 0;
       if (p2) {
          this.output.writeTag(p0, 2);
          int i1 = 0;
          for (p0 = 0; p0 < p1.size(); p0++) {
             i1 = i1 + CodedOutputStream.computeUInt64SizeNoTag(p1.get(p0).longValue());
          }
          this.output.writeUInt32NoTag(i1);
          for (; i < p1.size(); this.output.writeUInt64NoTag(p1.get(i).longValue())) {
          }
       }else {
          for (i = i + 1; i < p1.size(); i = i + 1) {
             this.output.writeUInt64(p0, p1.get(i).longValue());
          }
       }
       return;
    }
}
