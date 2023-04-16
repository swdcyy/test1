package com.google.protobuf.FieldInfo;
import java.lang.Comparable;
import java.lang.reflect.Field;
import com.google.protobuf.FieldType;
import java.lang.Class;
import com.google.protobuf.OneofInfo;
import java.lang.Object;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.protobuf.Internal;
import java.lang.IllegalStateException;
import com.google.protobuf.FieldInfo$Builder;
import com.google.protobuf.FieldInfo$1;
import java.lang.Enum;

public final class FieldInfo implements Comparable	// class@00041d
{
    public final Field cachedSizeField;
    public final boolean enforceUtf8;
    public final Internal$EnumVerifier enumVerifier;
    public final Field field;
    public final int fieldNumber;
    public final Object mapDefaultEntry;
    public final Class messageClass;
    public final OneofInfo oneof;
    public final Class oneofStoredType;
    public final Field presenceField;
    public final int presenceMask;
    public final boolean required;
    public final FieldType type;

    public void FieldInfo(Field p0,int p1,FieldType p2,Class p3,Field p4,int p5,boolean p6,boolean p7,OneofInfo p8,Class p9,Object p10,Internal$EnumVerifier p11,Field p12){
       super();
       this.field = p0;
       this.type = p2;
       this.messageClass = p3;
       this.fieldNumber = p1;
       this.presenceField = p4;
       this.presenceMask = p5;
       this.required = p6;
       this.enforceUtf8 = p7;
       this.oneof = p8;
       this.oneofStoredType = p9;
       this.mapDefaultEntry = p10;
       this.enumVerifier = p11;
       this.cachedSizeField = p12;
    }
    public static void checkFieldNumber(int p0){
       if (p0 > 0) {
          return;
       }
       throw new IllegalArgumentException("fieldNumber must be positive: "+p0);
    }
    public static FieldInfo forField(Field p0,int p1,FieldType p2,boolean p3){
       Object obj = p2;
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       Internal.checkNotNull(obj, "fieldType");
       if (obj == FieldType.MESSAGE_LIST || obj == FieldType.GROUP_LIST) {
          throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
       }
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, p2, null, null, 0, false, p3, null, null, null, null, null);
       return v14;
    }
    public static FieldInfo forFieldWithEnumVerifier(Field p0,int p1,FieldType p2,Internal$EnumVerifier p3){
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, p2, null, null, 0, false, false, null, null, null, p3, null);
       return v0;
    }
    public static FieldInfo forMapField(Field p0,int p1,Object p2,Internal$EnumVerifier p3){
       Object obj = p2;
       Internal.checkNotNull(obj, "mapDefaultEntry");
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, FieldType.MAP, null, null, 0, false, true, null, null, obj, p3, null);
       return v0;
    }
    public static FieldInfo forOneofMemberField(int p0,FieldType p1,OneofInfo p2,Class p3,boolean p4,Internal$EnumVerifier p5){
       Object obj = p1;
       FieldInfo.checkFieldNumber(p0);
       Internal.checkNotNull(obj, "fieldType");
       Internal.checkNotNull(p2, "oneof");
       Internal.checkNotNull(p3, "oneofStoredType");
       if (!p1.isScalar()) {
          throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field "+p0+" is of type "+obj);
       }
       FieldInfo uFieldInfo = new FieldInfo(null, p0, p1, null, null, 0, false, p4, p2, p3, null, p5, null);
       return v14;
    }
    public static FieldInfo forPackedField(Field p0,int p1,FieldType p2,Field p3){
       Object obj = p2;
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       Internal.checkNotNull(obj, "fieldType");
       if (obj == FieldType.MESSAGE_LIST || obj == FieldType.GROUP_LIST) {
          throw new IllegalStateException("Shouldn\'t be called for repeated message fields.");
       }
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, p2, null, null, 0, false, false, null, null, null, null, p3);
       return v14;
    }
    public static FieldInfo forPackedFieldWithEnumVerifier(Field p0,int p1,FieldType p2,Internal$EnumVerifier p3,Field p4){
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, p2, null, null, 0, false, false, null, null, null, p3, p4);
       return v0;
    }
    public static FieldInfo forProto2OptionalField(Field p0,int p1,FieldType p2,Field p3,int p4,boolean p5,Internal$EnumVerifier p6){
       Object obj = p3;
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       Internal.checkNotNull(p2, "fieldType");
       Internal.checkNotNull(obj, "presenceField");
       if (obj != null && !FieldInfo.isExactlyOneBitSet(p4)) {
          throw new IllegalArgumentException("presenceMask must have exactly one bit set: "+p4);
       }
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, p2, null, p3, p4, false, p5, null, null, null, p6, null);
       return v14;
    }
    public static FieldInfo forProto2RequiredField(Field p0,int p1,FieldType p2,Field p3,int p4,boolean p5,Internal$EnumVerifier p6){
       Object obj = p3;
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       Internal.checkNotNull(p2, "fieldType");
       Internal.checkNotNull(obj, "presenceField");
       if (obj != null && !FieldInfo.isExactlyOneBitSet(p4)) {
          throw new IllegalArgumentException("presenceMask must have exactly one bit set: "+p4);
       }
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, p2, null, p3, p4, true, p5, null, null, null, p6, null);
       return v14;
    }
    public static FieldInfo forRepeatedMessageField(Field p0,int p1,FieldType p2,Class p3){
       FieldInfo.checkFieldNumber(p1);
       Internal.checkNotNull(p0, "field");
       Object obj = p2;
       Internal.checkNotNull(obj, "fieldType");
       Object obj1 = p3;
       Internal.checkNotNull(obj1, "messageClass");
       FieldInfo uFieldInfo = new FieldInfo(p0, p1, obj, obj1, null, 0, false, false, null, null, null, null, null);
       return v0;
    }
    public static boolean isExactlyOneBitSet(int p0){
       boolean b = (p0 && !(p0 & (p0 - 1)))? true: false;
       return b;
    }
    public static FieldInfo$Builder newBuilder(){
       return new FieldInfo$Builder(null);
    }
    public int compareTo(FieldInfo p0){
       return (this.fieldNumber - p0.fieldNumber);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public Field getCachedSizeField(){
       return this.cachedSizeField;
    }
    public Internal$EnumVerifier getEnumVerifier(){
       return this.enumVerifier;
    }
    public Field getField(){
       return this.field;
    }
    public int getFieldNumber(){
       return this.fieldNumber;
    }
    public Class getListElementType(){
       return this.messageClass;
    }
    public Object getMapDefaultEntry(){
       return this.mapDefaultEntry;
    }
    public Class getMessageFieldClass(){
       int i = FieldInfo$1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3 && i != 4) {
             return null;
          }else {
             return this.messageClass;
          }
       }else {
          FieldInfo tfield = this.field;
          Class type = (tfield != null)? tfield.getType(): this.oneofStoredType;
          return type;
       }
    }
    public OneofInfo getOneof(){
       return this.oneof;
    }
    public Class getOneofStoredType(){
       return this.oneofStoredType;
    }
    public Field getPresenceField(){
       return this.presenceField;
    }
    public int getPresenceMask(){
       return this.presenceMask;
    }
    public FieldType getType(){
       return this.type;
    }
    public boolean isEnforceUtf8(){
       return this.enforceUtf8;
    }
    public boolean isRequired(){
       return this.required;
    }
}
