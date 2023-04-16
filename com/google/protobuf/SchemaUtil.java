package com.google.protobuf.SchemaUtil;
import java.lang.Class;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.UnknownFieldSetLiteSchema;
import java.lang.Object;
import java.util.List;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import com.google.protobuf.IntArrayList;
import java.lang.Integer;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Schema;
import com.google.protobuf.LongArrayList;
import java.lang.Long;
import com.google.protobuf.LazyFieldLite;
import com.google.protobuf.LazyStringList;
import java.lang.String;
import com.google.protobuf.Internal$EnumLiteMap;
import java.util.RandomAccess;
import com.google.protobuf.Internal$EnumLite;
import java.util.Iterator;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.StringBuilder;
import java.lang.reflect.Field;
import com.google.protobuf.UnsafeUtil;
import java.lang.IllegalStateException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.FieldSet;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.IllegalArgumentException;
import com.google.protobuf.FieldInfo;
import com.google.protobuf.Writer;
import java.lang.Double;
import java.lang.Float;

public final class SchemaUtil	// class@0004a8
{
    public static final Class GENERATED_MESSAGE_CLASS;
    public static final UnknownFieldSchema PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    public static final UnknownFieldSchema PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    public static final UnknownFieldSchema UNKNOWN_FIELD_SET_LITE_SCHEMA;

    static {
       SchemaUtil.GENERATED_MESSAGE_CLASS = SchemaUtil.getGeneratedMessageClass();
       SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA = SchemaUtil.getUnknownFieldSetSchema(false);
       SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA = SchemaUtil.getUnknownFieldSetSchema(true);
       SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();
    }
    public void SchemaUtil(){
       super();
    }
    public static int computeSizeBoolList(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i));
       }
       return (i * CodedOutputStream.computeBoolSize(p0, true));
    }
    public static int computeSizeBoolListNoTag(List p0){
       return p0.size();
    }
    public static int computeSizeByteStringList(int p0,List p1){
       int i = p1.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       i = i * CodedOutputStream.computeTagSize(p0);
       for (; i1 < p1.size(); i1 = i1 + 1) {
          i = i + CodedOutputStream.computeBytesSizeNoTag(p1.get(i1));
       }
       return i;
    }
    public static int computeSizeEnumList(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       int i1 = SchemaUtil.computeSizeEnumListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i1));
       }
       return (i1 + (i * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeEnumListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof IntArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeEnumSizeNoTag(p0.getInt(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeEnumSizeNoTag(p0.get(i1).intValue());
          }
       }
       return i2;
    }
    public static int computeSizeFixed32List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize((i * 4)));
       }
       return (i * CodedOutputStream.computeFixed32Size(p0, 0));
    }
    public static int computeSizeFixed32ListNoTag(List p0){
       return (p0.size() * 4);
    }
    public static int computeSizeFixed64List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize((i * 8)));
       }
       return (i * CodedOutputStream.computeFixed64Size(p0, 0));
    }
    public static int computeSizeFixed64ListNoTag(List p0){
       return (p0.size() * 8);
    }
    public static int computeSizeGroupList(int p0,List p1){
       int i = p1.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       int i2 = 0;
       for (; i1 < i; i1 = i1 + 1) {
          i2 = i2 + CodedOutputStream.computeGroupSize(p0, p1.get(i1));
       }
       return i2;
    }
    public static int computeSizeGroupList(int p0,List p1,Schema p2){
       int i = p1.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       int i2 = 0;
       for (; i1 < i; i1 = i1 + 1) {
          i2 = i2 + CodedOutputStream.computeGroupSize(p0, p1.get(i1), p2);
       }
       return i2;
    }
    public static int computeSizeInt32List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       int i1 = SchemaUtil.computeSizeInt32ListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i1));
       }
       return (i1 + (i * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeInt32ListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof IntArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeInt32SizeNoTag(p0.getInt(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeInt32SizeNoTag(p0.get(i1).intValue());
          }
       }
       return i2;
    }
    public static int computeSizeInt64List(int p0,List p1,boolean p2){
       if (!p1.size()) {
          return 0;
       }
       int i = SchemaUtil.computeSizeInt64ListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i));
       }
       return (i + (p1.size() * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeInt64ListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof LongArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeInt64SizeNoTag(p0.getLong(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeInt64SizeNoTag(p0.get(i1).longValue());
          }
       }
       return i2;
    }
    public static int computeSizeMessage(int p0,Object p1,Schema p2){
       if (p1 instanceof LazyFieldLite) {
          return CodedOutputStream.computeLazyFieldSize(p0, p1);
       }
       return CodedOutputStream.computeMessageSize(p0, p1, p2);
    }
    public static int computeSizeMessageList(int p0,List p1){
       int i = p1.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       p0 = CodedOutputStream.computeTagSize(p0) * i;
       for (; i1 < i; i1 = i1 + 1) {
          Object obj = p1.get(i1);
          int i2 = (obj instanceof LazyFieldLite)? CodedOutputStream.computeLazyFieldSizeNoTag(obj): CodedOutputStream.computeMessageSizeNoTag(obj);
          p0 = p0 + i2;
       }
       return p0;
    }
    public static int computeSizeMessageList(int p0,List p1,Schema p2){
       int i = p1.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       p0 = CodedOutputStream.computeTagSize(p0) * i;
       for (; i1 < i; i1 = i1 + 1) {
          Object obj = p1.get(i1);
          int i2 = (obj instanceof LazyFieldLite)? CodedOutputStream.computeLazyFieldSizeNoTag(obj): CodedOutputStream.computeMessageSizeNoTag(obj, p2);
          p0 = p0 + i2;
       }
       return p0;
    }
    public static int computeSizeSInt32List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       int i1 = SchemaUtil.computeSizeSInt32ListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i1));
       }
       return (i1 + (i * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeSInt32ListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof IntArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeSInt32SizeNoTag(p0.getInt(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeSInt32SizeNoTag(p0.get(i1).intValue());
          }
       }
       return i2;
    }
    public static int computeSizeSInt64List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       int i1 = SchemaUtil.computeSizeSInt64ListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i1));
       }
       return (i1 + (i * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeSInt64ListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof LongArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeSInt64SizeNoTag(p0.getLong(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeSInt64SizeNoTag(p0.get(i1).longValue());
          }
       }
       return i2;
    }
    public static int computeSizeStringList(int p0,List p1){
       Object raw;
       int i2;
       int i = p1.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       p0 = CodedOutputStream.computeTagSize(p0) * i;
       if (p1 instanceof LazyStringList) {
          for (; i1 < i; p0 = p0 + i2) {
             raw = p1.getRaw(i1);
             i2 = (raw instanceof ByteString)? CodedOutputStream.computeBytesSizeNoTag(raw): CodedOutputStream.computeStringSizeNoTag(raw);
          }
       }else {
          for (i1 = i1 + 1; i1 < i; i1 = i1 + 1) {
             raw = p1.get(i1);
             i2 = (raw instanceof ByteString)? CodedOutputStream.computeBytesSizeNoTag(raw): CodedOutputStream.computeStringSizeNoTag(raw);
             p0 = p0 + i2;
          }
       }
       return p0;
    }
    public static int computeSizeUInt32List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       int i1 = SchemaUtil.computeSizeUInt32ListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i1));
       }
       return (i1 + (i * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeUInt32ListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof IntArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeUInt32SizeNoTag(p0.getInt(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeUInt32SizeNoTag(p0.get(i1).intValue());
          }
       }
       return i2;
    }
    public static int computeSizeUInt64List(int p0,List p1,boolean p2){
       int i = p1.size();
       if (!i) {
          return 0;
       }
       int i1 = SchemaUtil.computeSizeUInt64ListNoTag(p1);
       if (p2) {
          return (CodedOutputStream.computeTagSize(p0) + CodedOutputStream.computeLengthDelimitedFieldSize(i1));
       }
       return (i1 + (i * CodedOutputStream.computeTagSize(p0)));
    }
    public static int computeSizeUInt64ListNoTag(List p0){
       int i2;
       int i = p0.size();
       int i1 = 0;
       if (!i) {
          return i1;
       }
       if (p0 instanceof LongArrayList) {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeUInt64SizeNoTag(p0.getLong(i1));
          }
       }else {
          i2 = 0;
          for (; i1 < i; i1 = i1 + 1) {
             i2 = i2 + CodedOutputStream.computeUInt64SizeNoTag(p0.get(i1).longValue());
          }
       }
       return i2;
    }
    public static Object filterUnknownEnumList(int p0,List p1,Internal$EnumLiteMap p2,Object p3,UnknownFieldSchema p4){
       int i;
       if (p2 == null) {
          return p3;
       }
       if (p1 instanceof RandomAccess) {
          i = p1.size();
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             int i3 = p1.get(i1).intValue();
             if (p2.findValueByNumber(i3) != null) {
                if (i1 != i2) {
                   p1.set(i2, Integer.valueOf(i3));
                }
                i2 = i2 + 1;
             }else {
                p3 = SchemaUtil.storeUnknownEnum(p0, i3, p3, p4);
             }
             i1 = i1 + 1;
          }
          if (i2 != i) {
             p1.subList(i2, i).clear();
          }
       }else {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             i = iterator.next().intValue();
             if (p2.findValueByNumber(i) == null) {
                p3 = SchemaUtil.storeUnknownEnum(p0, i, p3, p4);
                iterator.remove();
             }
          }
       }
       return p3;
    }
    public static Object filterUnknownEnumList(int p0,List p1,Internal$EnumVerifier p2,Object p3,UnknownFieldSchema p4){
       int i;
       if (p2 == null) {
          return p3;
       }
       if (p1 instanceof RandomAccess) {
          i = p1.size();
          int i1 = 0;
          int i2 = 0;
          while (i1 < i) {
             int i3 = p1.get(i1).intValue();
             if (p2.isInRange(i3)) {
                if (i1 != i2) {
                   p1.set(i2, Integer.valueOf(i3));
                }
                i2 = i2 + 1;
             }else {
                p3 = SchemaUtil.storeUnknownEnum(p0, i3, p3, p4);
             }
             i1 = i1 + 1;
          }
          if (i2 != i) {
             p1.subList(i2, i).clear();
          }
       }else {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             i = iterator.next().intValue();
             if (!p2.isInRange(i)) {
                p3 = SchemaUtil.storeUnknownEnum(p0, i, p3, p4);
                iterator.remove();
             }
          }
       }
       return p3;
    }
    public static Class getGeneratedMessageClass(){
       return Class.forName("com.google.protobuf.GeneratedMessageV3");
    }
    public static Object getMapDefaultEntry(Class p0,String p1){
       boolean b = true;
       Field[] declaredFiel = Class.forName(p0.getName()+"$"+SchemaUtil.toCamelCase(p1, b)+"DefaultEntryHolder").getDeclaredFields();
       if (declaredFiel.length == b) {
          return UnsafeUtil.getStaticObject(declaredFiel[0]);
       }
       throw new IllegalStateException("Unable to look up map field default entry holder class for "+p1+" in "+p0.getName());
    }
    public static UnknownFieldSchema getUnknownFieldSetSchema(boolean p0){
       Class unknownField = SchemaUtil.getUnknownFieldSetSchemaClass();
       if (unknownField == null) {
          return null;
       }
       Class[] uClassArray = new Class[]{Boolean.TYPE};
       Object[] objArray = new Object[]{Boolean.valueOf(p0)};
       return unknownField.getConstructor(uClassArray).newInstance(objArray);
    }
    public static Class getUnknownFieldSetSchemaClass(){
       return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
    }
    public static void mergeExtensions(ExtensionSchema p0,Object p1,Object p2){
       p2 = p0.getExtensions(p2);
       if (!p2.isEmpty()) {
          p0.getMutableExtensions(p1).mergeFrom(p2);
       }
       return;
    }
    public static void mergeMap(MapFieldSchema p0,Object p1,Object p2,long p3){
       UnsafeUtil.putObject(p1, p3, p0.mergeFrom(UnsafeUtil.getObject(p1, p3), UnsafeUtil.getObject(p2, p3)));
    }
    public static void mergeUnknownFields(UnknownFieldSchema p0,Object p1,Object p2){
       p0.setToMessage(p1, p0.merge(p0.getFromMessage(p1), p0.getFromMessage(p2)));
    }
    public static UnknownFieldSchema proto2UnknownFieldSetSchema(){
       return SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }
    public static UnknownFieldSchema proto3UnknownFieldSetSchema(){
       return SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }
    public static void requireGeneratedMessage(Class p0){
       if (!GeneratedMessageLite.class.isAssignableFrom(p0)) {
          Class gENERATED_ME = SchemaUtil.GENERATED_MESSAGE_CLASS;
          if (gENERATED_ME != null && !gENERATED_ME.isAssignableFrom(p0)) {
             throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
          }
       }
       return;
    }
    public static boolean safeEquals(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static boolean shouldUseTableSwitch(int p0,int p1,int p2){
       boolean b = true;
       if (p1 < 40) {
          return b;
       }
       long l = (long)p2;
       if (((((long)p1 - (long)p0) + 1) + 9) - (((2 * l) + 3) + ((l + 3) * 3)) > 0) {
          b = false;
       }
       return b;
    }
    public static boolean shouldUseTableSwitch(FieldInfo[] p0){
       boolean b = false;
       if (!p0.length) {
          return b;
       }
       return SchemaUtil.shouldUseTableSwitch(p0[b].getFieldNumber(), p0[(p0.length - 1)].getFieldNumber(), p0.length);
    }
    public static Object storeUnknownEnum(int p0,int p1,Object p2,UnknownFieldSchema p3){
       if (p2 == null) {
          p2 = p3.newBuilder();
       }
       p3.addVarint(p2, p0, (long)p1);
       return p2;
    }
    public static String toCamelCase(String p0,boolean p1){
       int i1;
       StringBuilder str = "";
       int i = 0;
       while (i < p0.length()) {
          char c = p0.charAt(i);
          if (97 <= c && c <= 'z') {
             if (p1) {
                i1 = c - 32;
                str = str+(char)i1;
             }else {
                str = str+c;
             }
          }else if(65 <= c && c <= 'Z'){
             if (!i && !p1) {
                i1 = c + 32;
                str = str+(char)i1;
             }else {
                str = str+c;
             }
          }else if(48 <= c && c <= '9'){
             str = str+c;
          }
          p1 = true;
       label_004b :
          i = i + 1;
          p1 = false;
          goto label_004b ;
       }
       return str;
    }
    public static UnknownFieldSchema unknownFieldSetLiteSchema(){
       return SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }
    public static void writeBool(int p0,boolean p1,Writer p2){
       if (p1) {
          p2.writeBool(p0, true);
       }
       return;
    }
    public static void writeBoolList(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeBoolList(p0, p1, p3);
       }
       return;
    }
    public static void writeBytes(int p0,ByteString p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeBytes(p0, p1);
       }
       return;
    }
    public static void writeBytesList(int p0,List p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeBytesList(p0, p1);
       }
       return;
    }
    public static void writeDouble(int p0,double p1,Writer p2){
       if (Double.compare(p1, 0)) {
          p2.writeDouble(p0, p1);
       }
       return;
    }
    public static void writeDoubleList(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeDoubleList(p0, p1, p3);
       }
       return;
    }
    public static void writeEnum(int p0,int p1,Writer p2){
       if (p1) {
          p2.writeEnum(p0, p1);
       }
       return;
    }
    public static void writeEnumList(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeEnumList(p0, p1, p3);
       }
       return;
    }
    public static void writeFixed32(int p0,int p1,Writer p2){
       if (p1) {
          p2.writeFixed32(p0, p1);
       }
       return;
    }
    public static void writeFixed32List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeFixed32List(p0, p1, p3);
       }
       return;
    }
    public static void writeFixed64(int p0,long p1,Writer p2){
       if (p1) {
          p2.writeFixed64(p0, p1);
       }
       return;
    }
    public static void writeFixed64List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeFixed64List(p0, p1, p3);
       }
       return;
    }
    public static void writeFloat(int p0,float p1,Writer p2){
       if (Float.compare(p1, 0)) {
          p2.writeFloat(p0, p1);
       }
       return;
    }
    public static void writeFloatList(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeFloatList(p0, p1, p3);
       }
       return;
    }
    public static void writeGroupList(int p0,List p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeGroupList(p0, p1);
       }
       return;
    }
    public static void writeGroupList(int p0,List p1,Writer p2,Schema p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeGroupList(p0, p1, p3);
       }
       return;
    }
    public static void writeInt32(int p0,int p1,Writer p2){
       if (p1) {
          p2.writeInt32(p0, p1);
       }
       return;
    }
    public static void writeInt32List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeInt32List(p0, p1, p3);
       }
       return;
    }
    public static void writeInt64(int p0,long p1,Writer p2){
       if (p1) {
          p2.writeInt64(p0, p1);
       }
       return;
    }
    public static void writeInt64List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeInt64List(p0, p1, p3);
       }
       return;
    }
    public static void writeLazyFieldList(int p0,List p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             iterator.next().writeTo(p2, p0);
          }
       }
       return;
    }
    public static void writeMessage(int p0,Object p1,Writer p2){
       if (p1 != null) {
          p2.writeMessage(p0, p1);
       }
       return;
    }
    public static void writeMessageList(int p0,List p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeMessageList(p0, p1);
       }
       return;
    }
    public static void writeMessageList(int p0,List p1,Writer p2,Schema p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeMessageList(p0, p1, p3);
       }
       return;
    }
    public static void writeSFixed32(int p0,int p1,Writer p2){
       if (p1) {
          p2.writeSFixed32(p0, p1);
       }
       return;
    }
    public static void writeSFixed32List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeSFixed32List(p0, p1, p3);
       }
       return;
    }
    public static void writeSFixed64(int p0,long p1,Writer p2){
       if (p1) {
          p2.writeSFixed64(p0, p1);
       }
       return;
    }
    public static void writeSFixed64List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeSFixed64List(p0, p1, p3);
       }
       return;
    }
    public static void writeSInt32(int p0,int p1,Writer p2){
       if (p1) {
          p2.writeSInt32(p0, p1);
       }
       return;
    }
    public static void writeSInt32List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeSInt32List(p0, p1, p3);
       }
       return;
    }
    public static void writeSInt64(int p0,long p1,Writer p2){
       if (p1) {
          p2.writeSInt64(p0, p1);
       }
       return;
    }
    public static void writeSInt64List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeSInt64List(p0, p1, p3);
       }
       return;
    }
    public static void writeString(int p0,Object p1,Writer p2){
       if (p1 instanceof String) {
          SchemaUtil.writeStringInternal(p0, p1, p2);
       }else {
          SchemaUtil.writeBytes(p0, p1, p2);
       }
       return;
    }
    public static void writeStringInternal(int p0,String p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeString(p0, p1);
       }
       return;
    }
    public static void writeStringList(int p0,List p1,Writer p2){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeStringList(p0, p1);
       }
       return;
    }
    public static void writeUInt32(int p0,int p1,Writer p2){
       if (p1) {
          p2.writeUInt32(p0, p1);
       }
       return;
    }
    public static void writeUInt32List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeUInt32List(p0, p1, p3);
       }
       return;
    }
    public static void writeUInt64(int p0,long p1,Writer p2){
       if (p1) {
          p2.writeUInt64(p0, p1);
       }
       return;
    }
    public static void writeUInt64List(int p0,List p1,Writer p2,boolean p3){
       if (p1 != null && !p1.isEmpty()) {
          p2.writeUInt64List(p0, p1, p3);
       }
       return;
    }
}
