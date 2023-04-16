package com.google.protobuf.FieldSet$Builder;
import com.google.protobuf.SmallSortedMap;
import com.google.protobuf.FieldSet$1;
import java.lang.Object;
import com.google.protobuf.FieldSet;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.MessageLite;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.WireFormat$JavaType;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import java.util.Map$Entry;
import java.lang.Iterable;
import java.util.Iterator;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.IllegalArgumentException;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Collections;
import com.google.protobuf.LazyField;
import java.lang.IndexOutOfBoundsException;

public final class FieldSet$Builder	// class@000425
{
    public SmallSortedMap fields;
    public boolean hasLazyField;
    public boolean hasNestedBuilders;
    public boolean isMutable;

    public void FieldSet$Builder(){
       super(SmallSortedMap.newFieldMap(16));
    }
    public void FieldSet$Builder(FieldSet$1 p0){
       super();
    }
    public void FieldSet$Builder(SmallSortedMap p0){
       super();
       this.fields = p0;
       this.isMutable = true;
    }
    public static FieldSet$Builder fromFieldSet(FieldSet p0){
       FieldSet$Builder uBuilder = new FieldSet$Builder(FieldSet.cloneAllFieldsMap(p0.fields, true));
       uBuilder.hasLazyField = p0.hasLazyField;
       return uBuilder;
    }
    public static Object replaceBuilder(Object p0){
       if (p0 instanceof MessageLite$Builder) {
          p0 = p0.build();
       }
       return p0;
    }
    public static Object replaceBuilders(FieldSet$FieldDescriptorLite p0,Object p1){
       if (p1 == null) {
          return p1;
       }
       if (p0.getLiteJavaType() != WireFormat$JavaType.MESSAGE) {
          return p1;
       }
       if (!p0.isRepeated()) {
          return FieldSet$Builder.replaceBuilder(p1);
       }
       if (!p1 instanceof List) {
          throw new IllegalStateException("Repeated field should contains a List but actually contains type: "+p1.getClass());
       }
       List list = p1;
       int i = 0;
       while (i < list.size()) {
          Object obj = list.get(i);
          Object obj1 = FieldSet$Builder.replaceBuilder(obj);
          if (obj1 != obj) {
             if (list == p1) {
                list = new ArrayList(list);
             }
             list.set(i, obj1);
          }
          i = i + 1;
       }
       return list;
    }
    public static void replaceBuilders(SmallSortedMap p0){
       for (int i = 0; i < p0.getNumArrayEntries(); i = i + 1) {
          FieldSet$Builder.replaceBuilders(p0.getArrayEntryAt(i));
       }
       Iterator iterator = p0.getOverflowEntries().iterator();
       while (iterator.hasNext()) {
          FieldSet$Builder.replaceBuilders(iterator.next());
       }
       return;
    }
    public static void replaceBuilders(Map$Entry p0){
       p0.setValue(FieldSet$Builder.replaceBuilders(p0.getKey(), p0.getValue()));
    }
    public static void verifyType(WireFormat$FieldType p0,Object p1){
       if (FieldSet.isValidType(p0, p1)) {
          return;
       }
       if (p0.getJavaType() == WireFormat$JavaType.MESSAGE && p1 instanceof MessageLite$Builder) {
          return;
       }
       throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    public void addRepeatedField(FieldSet$FieldDescriptorLite p0,Object p1){
       this.ensureIsMutable();
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("addRepeatedField\(\) can only be called on repeated fields.");
       }
       boolean b = (this.hasNestedBuilders != null || p1 instanceof MessageLite$Builder)? true: false;
       this.hasNestedBuilders = b;
       FieldSet$Builder.verifyType(p0.getLiteType(), p1);
       ArrayList field = this.getField(p0);
       if (field == null) {
          field = new ArrayList();
          this.fields.put(p0, field);
       }else {
       }
       field.add(p1);
       return;
    }
    public FieldSet build(){
       if (this.fields.isEmpty()) {
          return FieldSet.emptySet();
       }
       boolean b = false;
       this.isMutable = b;
       FieldSet$Builder tfields = this.fields;
       if (this.hasNestedBuilders != null) {
          tfields = FieldSet.cloneAllFieldsMap(tfields, b);
          FieldSet$Builder.replaceBuilders(tfields);
       }
       FieldSet uFieldSet = new FieldSet(tfields, null);
       uFieldSet.hasLazyField = this.hasLazyField;
       return uFieldSet;
    }
    public void clearField(FieldSet$FieldDescriptorLite p0){
       this.ensureIsMutable();
       this.fields.remove(p0);
       if (this.fields.isEmpty()) {
          this.hasLazyField = false;
       }
       return;
    }
    public final void ensureIsMutable(){
       if (this.isMutable == null) {
          this.fields = FieldSet.cloneAllFieldsMap(this.fields, true);
          this.isMutable = true;
       }
       return;
    }
    public Map getAllFields(){
       FieldSet$Builder tfields;
       if (this.hasLazyField != null) {
          SmallSortedMap smallSortedM = FieldSet.cloneAllFieldsMap(this.fields, false);
          if (this.fields.isImmutable()) {
             smallSortedM.makeImmutable();
          }else {
             FieldSet$Builder.replaceBuilders(smallSortedM);
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
       return FieldSet$Builder.replaceBuilders(p0, this.getFieldAllowBuilders(p0));
    }
    public Object getFieldAllowBuilders(FieldSet$FieldDescriptorLite p0){
       MessageLite messageLite = this.fields.get(p0);
       if (messageLite instanceof LazyField) {
          messageLite = messageLite.getValue();
       }
       return messageLite;
    }
    public Object getRepeatedField(FieldSet$FieldDescriptorLite p0,int p1){
       if (this.hasNestedBuilders != null) {
          this.ensureIsMutable();
       }
       return FieldSet$Builder.replaceBuilder(this.getRepeatedFieldAllowBuilders(p0, p1));
    }
    public Object getRepeatedFieldAllowBuilders(FieldSet$FieldDescriptorLite p0,int p1){
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("getRepeatedField\(\) can only be called on repeated fields.");
       }
       p0 = this.getFieldAllowBuilders(p0);
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
    public boolean hasField(FieldSet$FieldDescriptorLite p0){
       if (p0.isRepeated()) {
          throw new IllegalArgumentException("hasField\(\) can only be called on non-repeated fields.");
       }
       boolean b = (this.fields.get(p0) != null)? true: false;
       return b;
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
    public void mergeFrom(FieldSet p0){
       this.ensureIsMutable();
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
          }else if(field1 instanceof MessageLite$Builder){
             key.internalMergeFrom(field1, value);
          }else {
             this.fields.put(key, key.internalMergeFrom(field1.toBuilder(), value).build());
          }
       }else {
          this.fields.put(key, FieldSet.cloneIfMutable(value));
       }
       return;
    }
    public void setField(FieldSet$FieldDescriptorLite p0,Object p1){
       this.ensureIsMutable();
       boolean b = false;
       if (p0.isRepeated()) {
          if (p1 instanceof List) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(p1);
             p1 = uArrayList.iterator();
             while (p1.hasNext()) {
                Object obj = p1.next();
                FieldSet$Builder.verifyType(p0.getLiteType(), obj);
                boolean b1 = (this.hasNestedBuilders != null || obj instanceof MessageLite$Builder)? true: false;
                this.hasNestedBuilders = b1;
             }
             p1 = uArrayList;
          }else {
             throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
          }
       }else {
          FieldSet$Builder.verifyType(p0.getLiteType(), p1);
       }
       if (p1 instanceof LazyField) {
          this.hasLazyField = true;
       }
       if (this.hasNestedBuilders != null || p1 instanceof MessageLite$Builder) {
          b = true;
       }
       this.hasNestedBuilders = b;
       this.fields.put(p0, p1);
       return;
    }
    public void setRepeatedField(FieldSet$FieldDescriptorLite p0,int p1,Object p2){
       this.ensureIsMutable();
       if (!p0.isRepeated()) {
          throw new IllegalArgumentException("getRepeatedField\(\) can only be called on repeated fields.");
       }
       boolean b = (this.hasNestedBuilders != null || p2 instanceof MessageLite$Builder)? true: false;
       this.hasNestedBuilders = b;
       Object field = this.getField(p0);
       if (field != null) {
          FieldSet$Builder.verifyType(p0.getLiteType(), p2);
          field.set(p1, p2);
          return;
       }else {
          throw new IndexOutOfBoundsException();
       }
    }
}
