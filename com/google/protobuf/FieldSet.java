package com.google.protobuf.FieldSet;
import java.lang.Object;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.FieldSet$1;
import java.util.Map$Entry;
import java.util.Map;
import java.lang.Iterable;
import java.util.Iterator;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.System;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.CodedOutputStream;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.String;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Integer;
import java.lang.Long;
import com.google.protobuf.ByteString;
import com.google.protobuf.LazyFieldLite;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.IllegalArgumentException;
import com.google.protobuf.Internal;
import com.google.protobuf.FieldSet$Builder;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.WireFormat$Utf8Validation;
import com.google.protobuf.WireFormat;
import java.lang.Comparable;
import java.util.AbstractMap;
import com.google.protobuf.LazyField$LazyIterator;
import java.util.Set;
import java.util.Collections;
import java.lang.IndexOutOfBoundsException;
import com.google.protobuf.MessageLite$Builder;

public final class FieldSet	// class@000427
{
    public final SmallSortedMap fields;
    public boolean hasLazyField;
    public boolean isImmutable;
    public static final FieldSet DEFAULT_INSTANCE;

    static {
       FieldSet.DEFAULT_INSTANCE = new FieldSet(true);
    }
    public void FieldSet(){
       super();
       this.fields = SmallSortedMap.newFieldMap(16);
    }
    public void FieldSet(SmallSortedMap p0){
       super();
       this.fields = p0;
       this.makeImmutable();
    }
    public void FieldSet(SmallSortedMap p0,FieldSet$1 p1){
       super(p0);
    }
    public void FieldSet(boolean p0){
       super(SmallSortedMap.newFieldMap(0));
       this.makeImmutable();
    }
    public static SmallSortedMap cloneAllFieldsMap(SmallSortedMap p0,boolean p1){
       SmallSortedMap smallSortedM = SmallSortedMap.newFieldMap(16);
       for (int i = 0; i < p0.getNumArrayEntries(); i = i + 1) {
          FieldSet.cloneFieldEntry(smallSortedM, p0.getArrayEntryAt(i), p1);
       }
       Iterator iterator = p0.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          FieldSet.cloneFieldEntry(smallSortedM, iterator.next(), p1);
       }
       return smallSortedM;
    }
    public static void cloneFieldEntry(Map p0,Map$Entry p1,boolean p2){
       FieldSet$FieldDescriptorLite key = p1.getKey();
       p1 = p1.getValue();
       if (p1 instanceof LazyField) {
          p0.put(key, p1.getValue());
       }else if(p2 && p1 instanceof List){
          p0.put(key, new ArrayList(p1));
       }else {
          p0.put(key, p1);
       }
       return;
    }
    public static Object cloneIfMutable(Object p0){
       if (!p0 instanceof byte[]) {
          return p0;
       }
       byte[] uobyteArray = new byte[p0.length];
       System.arraycopy(p0, 0, uobyteArray, 0, p0.length);
       return uobyteArray;
    }
    public static int computeElementSize(WireFormat$FieldType p0,int p1,Object p2){
       p1 = CodedOutputStream.computeTagSize(p1);
       if (p0 == WireFormat$FieldType.GROUP) {
          p1 = p1 * 2;
       }
       return (p1 + FieldSet.computeElementSizeNoTag(p0, p2));
    }
    public static int computeElementSizeNoTag(WireFormat$FieldType p0,Object p1){
       switch (FieldSet$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p0.ordinal()]){
           case 1:
             return CodedOutputStream.computeDoubleSizeNoTag(p1.doubleValue());
           case 2:
             return CodedOutputStream.computeFloatSizeNoTag(p1.floatValue());
           case 3:
             return CodedOutputStream.computeInt64SizeNoTag(p1.longValue());
           case 4:
             return CodedOutputStream.computeUInt64SizeNoTag(p1.longValue());
           case 5:
             return CodedOutputStream.computeInt32SizeNoTag(p1.intValue());
           case 6:
             return CodedOutputStream.computeFixed64SizeNoTag(p1.longValue());
           case 7:
             return CodedOutputStream.computeFixed32SizeNoTag(p1.intValue());
           case 8:
             return CodedOutputStream.computeBoolSizeNoTag(p1.booleanValue());
           case 9:
             return CodedOutputStream.computeGroupSizeNoTag(p1);
           case 10:
             if (p1 instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldSizeNoTag(p1);
             }
             return CodedOutputStream.computeMessageSizeNoTag(p1);
             break;
           case 11:
             if (p1 instanceof ByteString) {
                return CodedOutputStream.computeBytesSizeNoTag(p1);
             }
             return CodedOutputStream.computeStringSizeNoTag(p1);
             break;
           case 12:
             if (p1 instanceof ByteString) {
                return CodedOutputStream.computeBytesSizeNoTag(p1);
             }
             return CodedOutputStream.computeByteArraySizeNoTag(p1);
             break;
           case 13:
             return CodedOutputStream.computeUInt32SizeNoTag(p1.intValue());
           case 14:
             return CodedOutputStream.computeSFixed32SizeNoTag(p1.intValue());
           case 15:
             return CodedOutputStream.computeSFixed64SizeNoTag(p1.longValue());
           case 16:
             return CodedOutputStream.computeSInt32SizeNoTag(p1.intValue());
           case 17:
             return CodedOutputStream.computeSInt64SizeNoTag(p1.longValue());
           case 18:
             if (p1 instanceof Internal$EnumLite) {
                return CodedOutputStream.computeEnumSizeNoTag(p1.getNumber());
             }
             return CodedOutputStream.computeEnumSizeNoTag(p1.intValue());
             break;
           default:
             throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
       }
    }
    public static int computeFieldSize(FieldSet$FieldDescriptorLite p0,Object p1){
       Iterator iterator;
       WireFormat$FieldType liteType = p0.getLiteType();
       int number = p0.getNumber();
       if (!p0.isRepeated()) {
          return FieldSet.computeElementSize(liteType, number, p1);
       }
       int i = 0;
       if (p0.isPacked()) {
          iterator = p1.iterator();
          while (iterator.hasNext()) {
             i = i + FieldSet.computeElementSizeNoTag(liteType, iterator.next());
          }
          return ((CodedOutputStream.computeTagSize(number) + i) + CodedOutputStream.computeRawVarint32Size(i));
       }else {
          iterator = p1.iterator();
          while (iterator.hasNext()) {
             i = i + FieldSet.computeElementSize(liteType, number, iterator.next());
          }
          return i;
       }
    }
    public static FieldSet emptySet(){
       return FieldSet.DEFAULT_INSTANCE;
    }
    public static int getWireFormatForFieldType(WireFormat$FieldType p0,boolean p1){
       if (p1) {
          return 2;
       }
       return p0.getWireType();
    }
    public static boolean isInitialized(Map$Entry p0){
       FieldSet$FieldDescriptorLite key = p0.getKey();
       if (key.getLiteJavaType() == WireFormat$JavaType.MESSAGE) {
          if (key.isRepeated()) {
             Iterator iterator = p0.getValue().iterator();
             while (iterator.hasNext()) {
                if (!iterator.next().isInitialized()) {
                   return false;
                }
             }
          }else {
             p0 = p0.getValue();
             if (p0 instanceof MessageLite) {
                if (!p0.isInitialized()) {
                   return false;
                }
             }else if(p0 instanceof LazyField){
                return true;
             }else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
             }
          }
       }
       return true;
    }
    public static boolean isValidType(WireFormat$FieldType p0,Object p1){
       Internal.checkNotNull(p1);
       boolean b = true;
       switch (FieldSet$1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[p0.getJavaType().ordinal()]){
           case 1:
             return p1 instanceof Integer;
           case 2:
             return p1 instanceof Long;
           case 3:
             return p1 instanceof Float;
           case 4:
             return p1 instanceof Double;
           case 5:
             return p1 instanceof Boolean;
           case 6:
             return p1 instanceof String;
           case 7:
             if (!p1 instanceof ByteString && !p1 instanceof byte[]) {
                b = false;
             }
             return b;
             break;
           case 8:
             if (!p1 instanceof Integer && !p1 instanceof Internal$EnumLite) {
                b = false;
             }
             return b;
             break;
           case 9:
             if (!p1 instanceof MessageLite && !p1 instanceof LazyField) {
                b = false;
             }
             return b;
             break;
           default:
             return false;
       }
    }
    public static FieldSet$Builder newBuilder(){
       return new FieldSet$Builder(null);
    }
    public static FieldSet newFieldSet(){
       return new FieldSet();
    }
    public static Object readPrimitiveField(CodedInputStream p0,WireFormat$FieldType p1,boolean p2){
       if (p2) {
          return WireFormat.readPrimitiveField(p0, p1, WireFormat$Utf8Validation.STRICT);
       }
       return WireFormat.readPrimitiveField(p0, p1, WireFormat$Utf8Validation.LOOSE);
    }
    public static void writeElement(CodedOutputStream p0,WireFormat$FieldType p1,int p2,Object p3){
       if (p1 == WireFormat$FieldType.GROUP) {
          p0.writeGroup(p2, p3);
       }else {
          p0.writeTag(p2, FieldSet.getWireFormatForFieldType(p1, false));
          FieldSet.writeElementNoTag(p0, p1, p3);
       }
       return;
    }
    public static void writeElementNoTag(CodedOutputStream p0,WireFormat$FieldType p1,Object p2){
       switch (FieldSet$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p1.ordinal()]){
           case 1:
             p0.writeDoubleNoTag(p2.doubleValue());
             break;
           case 2:
             p0.writeFloatNoTag(p2.floatValue());
             break;
           case 3:
             p0.writeInt64NoTag(p2.longValue());
             break;
           case 4:
             p0.writeUInt64NoTag(p2.longValue());
             break;
           case 5:
             p0.writeInt32NoTag(p2.intValue());
             break;
           case 6:
             p0.writeFixed64NoTag(p2.longValue());
             break;
           case 7:
             p0.writeFixed32NoTag(p2.intValue());
             break;
           case 8:
             p0.writeBoolNoTag(p2.booleanValue());
             break;
           case 9:
             p0.writeGroupNoTag(p2);
             break;
           case 10:
             p0.writeMessageNoTag(p2);
             break;
           case 11:
             if (p2 instanceof ByteString) {
                p0.writeBytesNoTag(p2);
             }else {
                p0.writeStringNoTag(p2);
             }
             break;
           case 12:
             if (p2 instanceof ByteString) {
                p0.writeBytesNoTag(p2);
             }else {
                p0.writeByteArrayNoTag(p2);
             }
             break;
           case 13:
             p0.writeUInt32NoTag(p2.intValue());
             break;
           case 14:
             p0.writeSFixed32NoTag(p2.intValue());
             break;
           case 15:
             p0.writeSFixed64NoTag(p2.longValue());
             break;
           case 16:
             p0.writeSInt32NoTag(p2.intValue());
             break;
           case 17:
             p0.writeSInt64NoTag(p2.longValue());
             break;
           case 18:
             if (p2 instanceof Internal$EnumLite) {
                p0.writeEnumNoTag(p2.getNumber());
             }else {
                p0.writeEnumNoTag(p2.intValue());
             }
             break;
           default:
       }
       return;
    }
    public static void writeField(FieldSet$FieldDescriptorLite p0,Object p1,CodedOutputStream p2){
       Iterator iterator1;
       WireFormat$FieldType liteType = p0.getLiteType();
       int number = p0.getNumber();
       if (p0.isRepeated()) {
          if (p0.isPacked()) {
             p2.writeTag(number, 2);
             int i = 0;
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                i = i + FieldSet.computeElementSizeNoTag(liteType, iterator.next());
             }
             p2.writeRawVarint32(i);
             iterator1 = p1.iterator();
             while (iterator1.hasNext()) {
                FieldSet.writeElementNoTag(p2, liteType, iterator1.next());
             }
          }else {
             iterator1 = p1.iterator();
             while (iterator1.hasNext()) {
                FieldSet.writeElement(p2, liteType, number, iterator1.next());
             }
          }
       }else if(p1 instanceof LazyField){
          FieldSet.writeElement(p2, liteType, number, p1.getValue());
       }else {
          FieldSet.writeElement(p2, liteType, number, p1);
       }
       return;
    }
    public void addRepeatedField(FieldSet$FieldDescriptorLite p0,Object p1){
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("addRepeatedField\(\) can only be called on repeated fields.");
       }
       this.verifyType(p0.getLiteType(), p1);
       ArrayList field = this.getField(p0);
       if (field == null) {
          field = new ArrayList();
          this.fields.put(p0, field);
       }else {
       }
       field.add(p1);
       return;
    }
    public void clear(){
       this.fields.clear();
       this.hasLazyField = false;
    }
    public void clearField(FieldSet$FieldDescriptorLite p0){
       this.fields.remove(p0);
       if (this.fields.isEmpty()) {
          this.hasLazyField = false;
       }
       return;
    }
    public FieldSet clone(){
       Map$Entry arrayEntryAt;
       FieldSet$FieldDescriptorLite key;
       FieldSet uFieldSet = FieldSet.newFieldSet();
       for (int i = 0; i < this.fields.getNumArrayEntries(); i = i + 1) {
          arrayEntryAt = this.fields.getArrayEntryAt(i);
          key = arrayEntryAt.getKey();
          uFieldSet.setField(key, arrayEntryAt.getValue());
       }
       Iterator iterator = this.fields.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          arrayEntryAt = iterator.next();
          key = arrayEntryAt.getKey();
          uFieldSet.setField(key, arrayEntryAt.getValue());
       }
       uFieldSet.hasLazyField = this.hasLazyField;
       return uFieldSet;
    }
    public Object clone(){
       return this.clone();
    }
    public Iterator descendingIterator(){
       if (this.hasLazyField != null) {
          return new LazyField$LazyIterator(this.fields.descendingEntrySet().iterator());
       }
       return this.fields.descendingEntrySet().iterator();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof FieldSet) {
          return false;
       }
       return this.fields.equals(p0.fields);
    }
    public Map getAllFields(){
       FieldSet tfields;
       if (this.hasLazyField != null) {
          SmallSortedMap smallSortedM = FieldSet.cloneAllFieldsMap(this.fields, false);
          if (this.fields.isImmutable()) {
             smallSortedM.makeImmutable();
          }
          return smallSortedM;
       }else if(this.fields.isImmutable()){
          tfields = this.fields;
       }else {
          tfields = Collections.unmodifiableMap(this.fields);
       }
       return tfields;
    }
    public Object getField(FieldSet$FieldDescriptorLite p0){
       MessageLite messageLite = this.fields.get(p0);
       if (messageLite instanceof LazyField) {
          messageLite = messageLite.getValue();
       }
       return messageLite;
    }
    public int getMessageSetSerializedSize(){
       int i1 = 0;
       for (int i = 0; i < this.fields.getNumArrayEntries(); i = i + 1) {
          i1 = i1 + this.getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
       }
       Iterator iterator = this.fields.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          i1 = i1 + this.getMessageSetSerializedSize(iterator.next());
       }
       return i1;
    }
    public final int getMessageSetSerializedSize(Map$Entry p0){
       FieldSet$FieldDescriptorLite key = p0.getKey();
       Object value = p0.getValue();
       if (key.getLiteJavaType() != WireFormat$JavaType.MESSAGE || (key.isRepeated() || key.isPacked())) {
          return FieldSet.computeFieldSize(key, value);
       }
       if (value instanceof LazyField) {
          return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(p0.getKey().getNumber(), value);
       }
       return CodedOutputStream.computeMessageSetExtensionSize(p0.getKey().getNumber(), value);
    }
    public Object getRepeatedField(FieldSet$FieldDescriptorLite p0,int p1){
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("getRepeatedField\(\) can only be called on repeated fields.");
       }
       p0 = this.getField(p0);
       if (p0 != null) {
          return p0.get(p1);
       }
       throw new IndexOutOfBoundsException();
    }
    public int getRepeatedFieldCount(FieldSet$FieldDescriptorLite p0){
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("getRepeatedField\(\) can only be called on repeated fields.");
       }
       p0 = this.getField(p0);
       if (p0 == null) {
          return 0;
       }
       return p0.size();
    }
    public int getSerializedSize(){
       Map$Entry arrayEntryAt;
       FieldSet$FieldDescriptorLite key;
       int i1 = 0;
       for (int i = 0; i < this.fields.getNumArrayEntries(); i = i + 1) {
          arrayEntryAt = this.fields.getArrayEntryAt(i);
          key = arrayEntryAt.getKey();
          i1 = i1 + FieldSet.computeFieldSize(key, arrayEntryAt.getValue());
       }
       Iterator iterator = this.fields.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          arrayEntryAt = iterator.next();
          key = arrayEntryAt.getKey();
          i1 = i1 + FieldSet.computeFieldSize(key, arrayEntryAt.getValue());
       }
       return i1;
    }
    public boolean hasField(FieldSet$FieldDescriptorLite p0){
       if (p0.isRepeated()) {
          throw new IllegalArgumentException("hasField\(\) can only be called on non-repeated fields.");
       }
       boolean b = (this.fields.get(p0) != null)? true: false;
       return b;
    }
    public int hashCode(){
       return this.fields.hashCode();
    }
    public boolean isEmpty(){
       return this.fields.isEmpty();
    }
    public boolean isImmutable(){
       return this.isImmutable;
    }
    public boolean isInitialized(){
       boolean b = false;
       int i = 0;
       while (true) {
          if (i < this.fields.getNumArrayEntries()) {
             if (!FieldSet.isInitialized(this.fields.getArrayEntryAt(i))) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             Iterator iterator = this.fields.getOverflowEntries().iterator();
             while (true) {
                if (!iterator.hasNext()) {
                   return true;
                }
                if (!FieldSet.isInitialized(iterator.next())) {
                   return b;
                }
                continue ;
             }
          }
       }
       return b;
    }
    public Iterator iterator(){
       if (this.hasLazyField != null) {
          return new LazyField$LazyIterator(this.fields.entrySet().iterator());
       }
       return this.fields.entrySet().iterator();
    }
    public void makeImmutable(){
       if (this.isImmutable != null) {
          return;
       }
       this.fields.makeImmutable();
       this.isImmutable = true;
       return;
    }
    public void mergeFrom(FieldSet p0){
       for (int i = 0; i < p0.fields.getNumArrayEntries(); i = i + 1) {
          this.mergeFromField(p0.fields.getArrayEntryAt(i));
       }
       Iterator iterator = p0.fields.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          this.mergeFromField(iterator.next());
       }
       return;
    }
    public final void mergeFromField(Map$Entry p0){
       FieldSet$FieldDescriptorLite key = p0.getKey();
       MessageLite value = p0.getValue();
       if (value instanceof LazyField) {
          value = value.getValue();
       }
       if (key.isRepeated()) {
          ArrayList field = this.getField(key);
          if (field == null) {
             field = new ArrayList();
          }
          Iterator iterator = value.iterator();
          while (iterator.hasNext()) {
             field.add(FieldSet.cloneIfMutable(iterator.next()));
          }
          this.fields.put(key, field);
       }else if(key.getLiteJavaType() == WireFormat$JavaType.MESSAGE){
          Object field1 = this.getField(key);
          if (field1 == null) {
             this.fields.put(key, FieldSet.cloneIfMutable(value));
          }else {
             this.fields.put(key, key.internalMergeFrom(field1.toBuilder(), value).build());
          }
       }else {
          this.fields.put(key, FieldSet.cloneIfMutable(value));
       }
       return;
    }
    public void setField(FieldSet$FieldDescriptorLite p0,Object p1){
       if (p0.isRepeated()) {
          if (p1 instanceof List) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(p1);
             p1 = uArrayList.iterator();
             while (p1.hasNext()) {
                this.verifyType(p0.getLiteType(), p1.next());
             }
             p1 = uArrayList;
          }else {
             throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
          }
       }else {
          this.verifyType(p0.getLiteType(), p1);
       }
       if (p1 instanceof LazyField) {
          this.hasLazyField = true;
       }
       this.fields.put(p0, p1);
       return;
    }
    public void setRepeatedField(FieldSet$FieldDescriptorLite p0,int p1,Object p2){
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("getRepeatedField\(\) can only be called on repeated fields.");
       }
       Object field = this.getField(p0);
       if (field == null) {
          throw new IndexOutOfBoundsException();
       }
       this.verifyType(p0.getLiteType(), p2);
       field.set(p1, p2);
       return;
    }
    public final void verifyType(WireFormat$FieldType p0,Object p1){
       if (FieldSet.isValidType(p0, p1)) {
          return;
       }
       throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    public void writeMessageSetTo(CodedOutputStream p0){
       for (int i = 0; i < this.fields.getNumArrayEntries(); i = i + 1) {
          this.writeMessageSetTo(this.fields.getArrayEntryAt(i), p0);
       }
       Iterator iterator = this.fields.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          this.writeMessageSetTo(iterator.next(), p0);
       }
       return;
    }
    public final void writeMessageSetTo(Map$Entry p0,CodedOutputStream p1){
       FieldSet$FieldDescriptorLite key = p0.getKey();
       if (key.getLiteJavaType() == WireFormat$JavaType.MESSAGE && (!key.isRepeated() && !key.isPacked())) {
          MessageLite value = p0.getValue();
          if (value instanceof LazyField) {
             value = value.getValue();
          }
          p1.writeMessageSetExtension(p0.getKey().getNumber(), value);
       }else {
          FieldSet.writeField(key, p0.getValue(), p1);
       }
       return;
    }
    public void writeTo(CodedOutputStream p0){
       Map$Entry arrayEntryAt;
       FieldSet$FieldDescriptorLite key;
       for (int i = 0; i < this.fields.getNumArrayEntries(); i = i + 1) {
          arrayEntryAt = this.fields.getArrayEntryAt(i);
          key = arrayEntryAt.getKey();
          FieldSet.writeField(key, arrayEntryAt.getValue(), p0);
       }
       Iterator iterator = this.fields.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          arrayEntryAt = iterator.next();
          key = arrayEntryAt.getKey();
          FieldSet.writeField(key, arrayEntryAt.getValue(), p0);
       }
       return;
    }
}
