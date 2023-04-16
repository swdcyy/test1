package com.google.protobuf.MessageSchema;
import com.google.protobuf.Schema;
import sun.misc.Unsafe;
import com.google.protobuf.UnsafeUtil;
import java.lang.Object;
import com.google.protobuf.MessageLite;
import com.google.protobuf.NewInstanceSchema;
import com.google.protobuf.ListFieldSchema;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.ExtensionSchema;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UnknownFieldSetLite;
import java.util.List;
import java.lang.Class;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.RawMessageInfo;
import com.google.protobuf.StructuralMessageInfo;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.FieldInfo;
import com.google.protobuf.FieldType;
import java.lang.reflect.Field;
import java.lang.System;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.Arrays;
import com.google.protobuf.OneofInfo;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.MapEntryLite$Metadata;
import java.util.Map;
import com.google.protobuf.ArrayDecoders$Registers;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageSchema$1;
import java.lang.Enum;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Protobuf;
import com.google.protobuf.FieldSet;
import com.google.protobuf.SchemaUtil;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.ByteString$CodedBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import java.lang.Throwable;
import com.google.protobuf.Internal;
import java.lang.IllegalArgumentException;
import com.google.protobuf.WireFormat$JavaType;
import java.util.Collection;
import com.google.protobuf.Reader;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Objects;
import com.google.protobuf.Utf8;
import java.nio.charset.Charset;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Writer;
import com.google.protobuf.Writer$FieldOrder;

public final class MessageSchema implements Schema	// class@00047f
{
    public final int[] buffer;
    public final int checkInitializedCount;
    public final MessageLite defaultInstance;
    public final ExtensionSchema extensionSchema;
    public final boolean hasExtensions;
    public final int[] intArray;
    public final ListFieldSchema listFieldSchema;
    public final boolean lite;
    public final MapFieldSchema mapFieldSchema;
    public final int maxFieldNumber;
    public final int minFieldNumber;
    public final NewInstanceSchema newInstanceSchema;
    public final Object[] objects;
    public final boolean proto3;
    public final int repeatedFieldOffsetStart;
    public final UnknownFieldSchema unknownFieldSchema;
    public final boolean useCachedSizeField;
    public static final int[] EMPTY_INT_ARRAY;
    public static final Unsafe UNSAFE;

    static {
       int[] ointArray = new int[0];
       MessageSchema.EMPTY_INT_ARRAY = ointArray;
       MessageSchema.UNSAFE = UnsafeUtil.getUnsafe();
    }
    public void MessageSchema(int[] p0,Object[] p1,int p2,int p3,MessageLite p4,boolean p5,boolean p6,int[] p7,int p8,int p9,NewInstanceSchema p10,ListFieldSchema p11,UnknownFieldSchema p12,ExtensionSchema p13,MapFieldSchema p14){
       super();
       this.buffer = p0;
       this.objects = p1;
       this.minFieldNumber = p2;
       this.maxFieldNumber = p3;
       this.lite = p4 instanceof GeneratedMessageLite;
       this.proto3 = p5;
       boolean b = (p13 != null && p13.hasExtensions(p4))? true: false;
       this.hasExtensions = b;
       this.useCachedSizeField = p6;
       this.intArray = p7;
       this.checkInitializedCount = p8;
       this.repeatedFieldOffsetStart = p9;
       this.newInstanceSchema = p10;
       this.listFieldSchema = p11;
       this.unknownFieldSchema = p12;
       this.extensionSchema = p13;
       this.defaultInstance = p4;
       this.mapFieldSchema = p14;
       return;
    }
    public static boolean booleanAt(Object p0,long p1){
       return UnsafeUtil.getBoolean(p0, p1);
    }
    public static double doubleAt(Object p0,long p1){
       return UnsafeUtil.getDouble(p0, p1);
    }
    public static float floatAt(Object p0,long p1){
       return UnsafeUtil.getFloat(p0, p1);
    }
    public static UnknownFieldSetLite getMutableUnknownFields(Object p0){
       GeneratedMessageLite unknownField = p0.unknownFields;
       if (unknownField == UnknownFieldSetLite.getDefaultInstance()) {
          unknownField = UnknownFieldSetLite.newInstance();
          p0.unknownFields = unknownField;
       }
       return unknownField;
    }
    public static int intAt(Object p0,long p1){
       return UnsafeUtil.getInt(p0, p1);
    }
    public static boolean isEnforceUtf8(int p0){
       boolean b = (p0 & 0x20000000)? true: false;
       return b;
    }
    public static boolean isInitialized(Object p0,int p1,Schema p2){
       return p2.isInitialized(UnsafeUtil.getObject(p0, MessageSchema.offset(p1)));
    }
    public static boolean isRequired(int p0){
       boolean b = (p0 & 0x10000000)? true: false;
       return b;
    }
    public static List listAt(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1);
    }
    public static long longAt(Object p0,long p1){
       return UnsafeUtil.getLong(p0, p1);
    }
    public static MessageSchema newSchema(Class p0,MessageInfo p1,NewInstanceSchema p2,ListFieldSchema p3,UnknownFieldSchema p4,ExtensionSchema p5,MapFieldSchema p6){
       if (p1 instanceof RawMessageInfo) {
          return MessageSchema.newSchemaForRawMessageInfo(p1, p2, p3, p4, p5, p6);
       }
       return MessageSchema.newSchemaForMessageInfo(p1, p2, p3, p4, p5, p6);
    }
    public static MessageSchema newSchemaForMessageInfo(StructuralMessageInfo p0,NewInstanceSchema p1,ListFieldSchema p2,UnknownFieldSchema p3,ExtensionSchema p4,MapFieldSchema p5){
       int i2;
       int i10;
       int i = 1;
       int i1 = 0;
       boolean b = (p0.getSyntax() == ProtoSyntax.PROTO3)? true: false;
       FieldInfo[] fields = p0.getFields();
       if (!fields.length) {
          i2 = 0;
       }else {
          int i12 = fields[i1].getFieldNumber();
          i2 = fields[(fields.length - i)].getFieldNumber();
       }
       int len = fields.length;
       int[] ointArray = new int[(len * 3)];
       Object[] objArray = new Object[(len * 2)];
       len = fields.length;
       i = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 49;
       FieldType uFieldType = 18;
       while (i < len) {
          object oobject = fields[i];
          if (oobject.getType() == FieldType.MAP) {
             i3 = i3 + 1;
          }else if(oobject.getType().id() >= uFieldType && oobject.getType().id() <= i5){
             i4 = i4 + 1;
          }
          i = i + 1;
       }
       int[] ointArray1 = null;
       int[] ointArray2 = (i3 > 0)? new int[i3]: ointArray1;
       if (i4 > 0) {
          ointArray1 = new int[i4];
       }
       int[] checkInitial = p0.getCheckInitialized();
       if (checkInitial == null) {
          checkInitial = MessageSchema.EMPTY_INT_ARRAY;
       }
       i4 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0;
       while (i4 < fields.length) {
          object oobject1 = fields[i4];
          i5 = oobject1.getFieldNumber();
          MessageSchema.storeFieldData(oobject1, ointArray, i6, b, objArray);
          if (i7 < checkInitial.length && checkInitial[i7] == i5) {
             i5 = i7 + 1;
             checkInitial[i7] = i6;
             i7 = i5;
          }
          if (oobject1.getType() == FieldType.MAP) {
             i1 = i8 + 1;
             ointArray2[i8] = i6;
             i8 = i1;
          }else if(oobject1.getType().id() >= 18 && oobject1.getType().id() <= 49){
             i5 = i9 + 1;
             i10 = i6;
             ointArray1[i9] = (int)UnsafeUtil.objectFieldOffset(oobject1.getField());
             i9 = i5;
          label_00ca :
             i4 = i4 + 1;
             i6 = i10 + 3;
             int i11 = 18;
          }
          i10 = i6;
          goto label_00ca ;
       }
       if (ointArray2 == null) {
          ointArray2 = MessageSchema.EMPTY_INT_ARRAY;
       }
       if (ointArray1 == null) {
          ointArray1 = MessageSchema.EMPTY_INT_ARRAY;
       }
       int[] ointArray3 = new int[((checkInitial.length + ointArray2.length) + ointArray1.length)];
       System.arraycopy(checkInitial, 0, ointArray3, 0, checkInitial.length);
       System.arraycopy(ointArray2, 0, ointArray3, checkInitial.length, ointArray2.length);
       System.arraycopy(ointArray1, 0, ointArray3, (checkInitial.length + ointArray2.length), ointArray1.length);
       MessageSchema messageSchem = new MessageSchema(ointArray, objArray, 0, i2, p0.getDefaultInstance(), b, true, ointArray3, checkInitial.length, (checkInitial.length + ointArray2.length), p1, p2, p3, p4, p5);
       return fields;
    }
    public static MessageSchema newSchemaForRawMessageInfo(RawMessageInfo p0,NewInstanceSchema p1,ListFieldSchema p2,UnknownFieldSchema p3,ExtensionSchema p4,MapFieldSchema p5){
       int i4;
       int i5;
       int i6;
       int i7;
       char c1;
       int i8;
       int[] ointArray;
       int i9;
       int i10;
       int i11;
       int i18;
       char c3;
       int i19;
       char c4;
       int i20;
       int i22;
       char c6;
       int[] ointArray2;
       char c7;
       String str;
       Class uClass;
       char c8;
       int i24;
       int i26;
       int i27;
       char c10;
       int i28;
       char c11;
       int i29;
       char c12;
       char c13;
       int i30;
       char c14;
       int i = 0;
       int i1 = (p0.getSyntax() == ProtoSyntax.PROTO3)? 1: 0;
       String stringInfo = p0.getStringInfo();
       int i2 = stringInfo.length();
       char c = stringInfo.charAt(i);
       int i3 = 0xd800;
       if (c >= i3) {
          i4 = c & 0x1fff;
          i5 = 1;
          i6 = 13;
          i7 = i5 + 1;
          c1 = stringInfo.charAt(i5);
          while (c1 >= i3) {
             i5 = c1 & 0x1fff;
             i5 = i5 << i6;
             i4 = i4 | i5;
             i6 = i6 + 13;
             i5 = i7;
          }
          i4 = i4 | (c1 << i6);
       }else {
          i7 = 1;
       }
       i5 = i7 + 1;
       char c2 = stringInfo.charAt(i7);
       if (c2 >= i3) {
          i6 = c2 & 0x1fff;
          i7 = 13;
          i8 = i5 + 1;
          c1 = stringInfo.charAt(i5);
          while (c1 >= i3) {
             i5 = c1 & 0x1fff;
             i5 = i5 << i7;
             i6 = i6 | i5;
             i7 = i7 + 13;
             i5 = i8;
          }
          c2 = i6 | (c1 << i7);
          i5 = i8;
       }
       if (!c2) {
          ointArray = MessageSchema.EMPTY_INT_ARRAY;
          i6 = 0;
          i7 = 0;
          i8 = 0;
          i9 = 0;
          i10 = 0;
          i11 = 0;
       }else {
          i6 = i5 + 1;
          c1 = stringInfo.charAt(i5);
          if (c1 >= i3) {
             i5 = c1 & 0x1fff;
             i7 = 13;
             i8 = i6 + 1;
             c2 = stringInfo.charAt(i6);
             while (c2 >= i3) {
                i6 = c2 & 0x1fff;
                i6 = i6 << i7;
                i5 = i5 | i6;
                i7 = i7 + 13;
                i6 = i8;
             }
             i5 = i5 | (c2 << i7);
             i6 = i8;
          }
          i7 = i6 + 1;
          c2 = stringInfo.charAt(i6);
          if (c2 >= i3) {
             i6 = c2 & 0x1fff;
             i8 = 13;
             i9 = i7 + 1;
             c11 = stringInfo.charAt(i7);
             while (c11 >= i3) {
                i7 = c11 & 0x1fff;
                i7 = i7 << i8;
                i6 = i6 | i7;
                i8 = i8 + 13;
                i7 = i9;
             }
             i6 = i6 | (c11 << i8);
             i7 = i9;
          }
          i8 = i7 + 1;
          c11 = stringInfo.charAt(i7);
          if (c11 >= i3) {
             i7 = c11 & 0x1fff;
             i9 = 13;
             i29 = i8 + 1;
             c6 = stringInfo.charAt(i8);
             while (c6 >= i3) {
                i8 = c6 & 0x1fff;
                i8 = i8 << i9;
                i7 = i7 | i8;
                i9 = i9 + 13;
                i8 = i29;
             }
             i7 = i7 | (c6 << i9);
             i8 = i29;
          }
          i9 = i8 + 1;
          c6 = stringInfo.charAt(i8);
          if (c6 >= i3) {
             i8 = c6 & 0x1fff;
             i29 = 13;
             i10 = i9 + 1;
             c12 = stringInfo.charAt(i9);
             while (c12 >= i3) {
                i9 = c12 & 0x1fff;
                i9 = i9 << i29;
                i8 = i8 | i9;
                i29 = i29 + 13;
                i9 = i10;
             }
             i8 = i8 | (c12 << i29);
             i9 = i10;
          }
          i29 = i9 + 1;
          c12 = stringInfo.charAt(i9);
          if (c12 >= i3) {
             i9 = c12 & 0x1fff;
             i10 = 13;
             i11 = i29 + 1;
             c13 = stringInfo.charAt(i29);
             while (c13 >= i3) {
                i29 = c13 & 0x1fff;
                i29 = i29 << i10;
                i9 = i9 | i29;
                i10 = i10 + 13;
                i29 = i11;
             }
             i9 = i9 | (c13 << i10);
             i29 = i11;
          }
          i10 = i29 + 1;
          c13 = stringInfo.charAt(i29);
          if (c13 >= i3) {
             i29 = c13 & 0x1fff;
             i11 = 13;
             i30 = i10 + 1;
             c10 = stringInfo.charAt(i10);
             while (c10 >= i3) {
                i10 = c10 & 0x1fff;
                i10 = i10 << i11;
                i29 = i29 | i10;
                i11 = i11 + 13;
                i10 = i30;
             }
             i29 = i29 | (c10 << i11);
             i10 = i30;
          }
          i11 = i10 + 1;
          c10 = stringInfo.charAt(i10);
          if (c10 >= i3) {
             i10 = c10 & 0x1fff;
             i30 = 13;
             int i31 = i11 + 1;
             c4 = stringInfo.charAt(i11);
             while (c4 >= i3) {
                i11 = c4 & 0x1fff;
                i11 = i11 << i30;
                i10 = i10 | i11;
                i30 = i30 + 13;
                i11 = i31;
             }
             i10 = i10 | (c4 << i30);
             i11 = i31;
          }
          i30 = i11 + 1;
          c4 = stringInfo.charAt(i11);
          if (c4 >= i3) {
             i11 = c4 & 0x1fff;
             i = i30;
             i30 = 13;
             int i32 = i + 1;
             c14 = stringInfo.charAt(i);
             while (c14 >= i3) {
                i = c14 & 0x1fff;
                i = i << i30;
                i11 = i11 | i;
                i30 = i30 + 13;
                i = i32;
             }
             i11 = i11 | (c14 << i30);
             i30 = i32;
          }
          int[] ointArray3 = new int[((i11 + i29) + i10)];
          i10 = (i5 * 2) + i6;
          c2 = i5;
          i5 = i30;
          ointArray = ointArray3;
          c14 = i7;
          c11 = i29;
       }
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       Object[] objects = p0.getObjects();
       Class class = p0.getDefaultInstance().getClass();
       int[] ointArray1 = new int[(i9 * 3)];
       Object[] objArray = new Object[(i9 * 2)];
       int i12 = i11 + i7;
       int i13 = i11;
       int i14 = i12;
       i7 = 0;
       int i15 = 0;
       while (i5 < i2) {
          int i16 = i5 + 1;
          c1 = stringInfo.charAt(i5);
          int i17 = i2;
          if (c1 >= 0xd800) {
             i5 = c1 & 0x1fff;
             i2 = i16;
             i16 = 13;
             i18 = i2 + 1;
             c3 = stringInfo.charAt(i2);
             i19 = i11;
             while (c3 >= 0xd800) {
                i2 = c3 & 0x1fff;
                i2 = i2 << i16;
                i5 = i5 | i2;
                i16 = i16 + 13;
                i2 = i18;
                i11 = i19;
             }
             i2 = c3 << i16;
             i5 = i5 | i2;
             i2 = i18;
          }else {
             i19 = i11;
             i2 = i16;
          }
          i11 = i2 + 1;
          c3 = stringInfo.charAt(i2);
          i16 = i11;
          if (c3 >= 0xd800) {
             i2 = c3 & 0x1fff;
             i11 = i16;
             i16 = 13;
             i18 = i11 + 1;
             c4 = stringInfo.charAt(i11);
             i20 = i1;
             while (c4 >= 0xd800) {
                i1 = c4 & 0x1fff;
                i1 = i1 << i16;
                i2 = i2 | i1;
                i16 = i16 + 13;
                i11 = i18;
                i1 = i20;
             }
             i1 = c4 << i16;
             i2 = i2 | i1;
             i11 = i18;
          }else {
             i20 = i1;
             i11 = i16;
          }
          i1 = i2 & 0x00ff;
          char c5 = i8;
          i8 = i2 & 0x0400;
          if (i8) {
             i8 = i7 + 1;
             ointArray[i7] = i15;
             i7 = i8;
          }
          int i21 = i7;
          if (i1 >= 51) {
             i8 = i11 + 1;
             c4 = stringInfo.charAt(i11);
             i7 = 0xd800;
             if (c4 >= i7) {
                i11 = c4 & 0x1fff;
                i22 = 13;
                int i23 = i8 + 1;
                c6 = stringInfo.charAt(i8);
                while (c6 >= i7) {
                   i7 = c6 & 0x1fff;
                   i7 = i7 << i22;
                   i11 = i11 | i7;
                   i22 = i22 + 13;
                   i8 = i23;
                   i7 = 0xd800;
                }
                i7 = c6 << i22;
                i11 = i11 | i7;
                i8 = i23;
             }
             i7 = i1 - 51;
             i22 = i8;
             if (i7 == 9 || i7 == 17) {
                i7 = i15 / 3;
                i7 = i7 * 2;
                i7 = i7 + 1;
                i8 = i10 + 1;
                objArray[i7] = objects[i10];
             label_026e :
                i10 = i8;
             }else if(i7 == 12){
                i7 = i4 & 0x01;
                i8 = 1;
                if (i7 == i8) {
                   i7 = i15 / 3;
                   i7 = i7 * 2;
                   i7 = i7 + i8;
                   i8 = i10 + 1;
                   objArray[i7] = objects[i10];
                   goto label_026e ;
                }
             }
             i11 = i11 * 2;
             object oobject = objects[i11];
             if (oobject instanceof Field) {
             }else {
                oobject = MessageSchema.reflectField(class, oobject);
                objects[i11] = oobject;
             }
             ointArray2 = ointArray1;
             c7 = i5;
             i5 = (int)uNSAFE.objectFieldOffset(oobject);
             i11 = i11 + 1;
             object oobject1 = objects[i11];
             if (oobject1 instanceof Field) {
             }else {
                oobject1 = MessageSchema.reflectField(class, oobject1);
                objects[i11] = oobject1;
             }
             str = stringInfo;
             uClass = class;
             c8 = i4;
             i4 = (int)uNSAFE.objectFieldOffset(oobject1);
             i5 = i5;
             i7 = i1;
             i3 = i10;
             i10 = i22;
             i11 = 0;
          }else {
             ointArray2 = ointArray1;
             c7 = i5;
             i3 = i10 + 1;
             Field uField = MessageSchema.reflectField(class, objects[i10]);
             long l = 49;
             if (i1 == 9 || i1 == 17) {
                i10 = i15 / 3;
                i10 = i10 * 2;
                i10 = i10 + 1;
                objArray[i10] = uField.getType();
             }else if(i1 == 27 || i1 == l){
                i10 = i15 / 3;
                i10 = i10 * 2;
                i10 = i10 + 1;
                i28 = i3 + 1;
                objArray[i10] = objects[i3];
             }else if(i1 != 12 && (i1 == 30 || i1 == 44)){
                i10 = i4 & 0x01;
                i7 = 1;
                if (i10 == i7) {
                   i10 = i15 / 3;
                   i10 = i10 * 2;
                   i10 = i10 + i7;
                   i28 = i3 + 1;
                   objArray[i10] = objects[i3];
                }
             }else if(i1 == 50){
                i10 = i13 + 1;
                ointArray[i13] = i15;
                i13 = i15 / 3;
                i13 = i13 * 2;
                i18 = i3 + 1;
                objArray[i13] = objects[i3];
                i3 = i2 & 0x0800;
                if (i3) {
                   i13 = i13 + 1;
                   i3 = i18 + 1;
                   objArray[i13] = objects[i18];
                   i13 = i10;
                }else {
                   i13 = i10;
                   i3 = i18;
                }
             }else {
                l = 1;
             }
             i10 = i1;
             i3 = i28;
          label_0333 :
             i5 = (int)uNSAFE.objectFieldOffset(uField);
             i7 = i4 & 0x01;
             if (i7 == 1) {
                i7 = i10;
                if (i7 <= 17) {
                   i10 = i11 + 1;
                   c4 = stringInfo.charAt(i11);
                   object oobject2 = 0xd800;
                   if (c4 >= oobject2) {
                      i11 = c4 & 0x1fff;
                      i26 = 13;
                      i27 = i10 + 1;
                      c10 = stringInfo.charAt(i10);
                      while (c10 >= oobject2) {
                         i10 = c10 & 0x1fff;
                         i10 = i10 << i26;
                         i11 = i11 | i10;
                         i26 = i26 + 13;
                         i10 = i27;
                      }
                      i10 = c10 << i26;
                      i11 = i11 | i10;
                      i10 = i27;
                   }
                   i26 = i6 * 2;
                   i27 = i11 / 32;
                   i26 = i26 + i27;
                   oobject2 = objects[i26];
                   str = stringInfo;
                   if (oobject2 instanceof Field) {
                   }else {
                      Field uField1 = MessageSchema.reflectField(class, oobject2);
                      objects[i26] = uField1;
                   }
                   uClass = class;
                   c8 = i4;
                   i4 = (int)uNSAFE.objectFieldOffset(oobject2);
                   i11 = i11 % 32;
                label_039b :
                   if (i7 >= 18 && i7 <= 49) {
                      i24 = i14 + 1;
                      ointArray[i14] = i5;
                      i14 = i24;
                   }
                }else {
                   str = stringInfo;
                   uClass = class;
                   c8 = i4;
                }
             }else {
                str = stringInfo;
                uClass = class;
                c8 = i4;
                i7 = i10;
             }
             i10 = i11;
             i4 = 0;
             i11 = 0;
             goto label_039b ;
             i10 = i1;
             goto label_0333 ;
          }
          i24 = i15 + 1;
          ointArray2[i15] = c7;
          i1 = i24 + 1;
          char c9 = c8;
          int i25 = i2 & 0x0200;
          i25 = (i25)? 0x20000000: 0;
          i2 = i2 & 0x0100;
          i2 = (i2)? 0x10000000: 0;
          i25 = i25 | i2;
          i2 = i7 << 20;
          i25 = i25 | i2;
          i25 = i25 | i5;
          ointArray2[i24] = i25;
          i25 = i1 + 1;
          i2 = i11 << 20;
          i2 = i2 | i4;
          ointArray2[i1] = i2;
          i5 = i10;
          class = uClass;
          c = c9;
          i2 = i17;
          i11 = i19;
          i1 = i20;
          i7 = i21;
          i15 = i25;
          i10 = i3;
          ointArray1 = ointArray2;
          c6 = c5;
          stringInfo = str;
       }
       MessageSchema messageSchem = new MessageSchema(ointArray1, objArray, i, i8, p0.getDefaultInstance(), i1, 0, ointArray, i11, i12, p1, p2, p3, p4, p5);
       return stringInfo;
    }
    public static long offset(int p0){
       return (long)(p0 & 0xfffff);
    }
    public static boolean oneofBooleanAt(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1).booleanValue();
    }
    public static double oneofDoubleAt(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1).doubleValue();
    }
    public static float oneofFloatAt(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1).floatValue();
    }
    public static int oneofIntAt(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1).intValue();
    }
    public static long oneofLongAt(Object p0,long p1){
       return UnsafeUtil.getObject(p0, p1).longValue();
    }
    public static Field reflectField(Class p0,String p1){
       try{
          return p0.getDeclaredField(p1);
       }catch(java.lang.NoSuchFieldException e0){
          Field[] declaredFiel = p0.getDeclaredFields();
          int len = declaredFiel.length;
          int i = 0;
       label_000b :
          if (i >= len) {
             throw new RuntimeException("Field "+p1+" for "+p0.getName()+" not found. Known fields are "+Arrays.toString(declaredFiel));
          }
          object oobject = declaredFiel[i];
          if (p1.equals(oobject.getName())) {
             return oobject;
          }
          i = i + 1;
          goto label_000b ;
       }
    }
    public static void storeFieldData(FieldInfo p0,int[] p1,int p2,boolean p3,Object[] p4){
       int i1;
       int i2;
       int i3;
       int i4;
       OneofInfo oneof = p0.getOneof();
       int i = 0;
       if (oneof != null) {
          i1 = p0.getType().id() + 51;
          i2 = (int)UnsafeUtil.objectFieldOffset(oneof.getValueField());
          i3 = (int)UnsafeUtil.objectFieldOffset(oneof.getCaseField());
       label_0023 :
          i4 = i3;
          i3 = 0;
       }else {
          FieldType type = p0.getType();
          i2 = (int)UnsafeUtil.objectFieldOffset(p0.getField());
          i4 = type.id();
          if (!p3 && (!type.isList() && !type.isMap())) {
             i3 = Integer.numberOfTrailingZeros(p0.getPresenceMask());
             i1 = i4;
             i4 = (int)UnsafeUtil.objectFieldOffset(p0.getPresenceField());
          }else if(p0.getCachedSizeField() == null){
             i1 = i4;
             i3 = 0;
             i4 = 0;
          }else {
             i3 = (int)UnsafeUtil.objectFieldOffset(p0.getCachedSizeField());
             i1 = i4;
             goto label_0023 ;
          }
       }
       p1[p2] = p0.getFieldNumber();
       int i5 = p2 + 1;
       int i6 = (p0.isEnforceUtf8())? 0x20000000: 0;
       if (p0.isRequired()) {
          i = 0x10000000;
       }
       p1[i5] = ((i1 << 20) | (i | i6)) | i2;
       p1[(p2 + 2)] = (i3 << 20) | i4;
       Class messageField = p0.getMessageFieldClass();
       if (p0.getMapDefaultEntry() != null) {
          p2 = (p2 / 3) * 2;
          p4[p2] = p0.getMapDefaultEntry();
          if (messageField != null) {
             p2++;
             p4[p2] = messageField;
          }else if(p0.getEnumVerifier() != null){
             p2++;
             p4[p2] = p0.getEnumVerifier();
          }
       }else if(messageField != null){
          p4[(((p2 / 3) * 2) + 1)] = messageField;
       }else if(p0.getEnumVerifier() != null){
          p4[(((p2 / 3) * 2) + 1)] = p0.getEnumVerifier();
       }
       return;
    }
    public static int type(int p0){
       return ((p0 & 0xff00000) >> 20);
    }
    public final boolean arePresentForEquals(Object p0,Object p1,int p2){
       boolean b = (this.isFieldPresent(p0, p2) == this.isFieldPresent(p1, p2))? true: false;
       return b;
    }
    public final int decodeMapEntry(byte[] p0,int p1,int p2,MapEntryLite$Metadata p3,Map p4,ArrayDecoders$Registers p5){
       int i5;
       ArrayDecoders$Registers registers1;
       int i = p0;
       int i1 = p2;
       MapEntryLite$Metadata metadata = p3;
       ArrayDecoders$Registers registers = p5;
       byte i2 = ArrayDecoders.decodeVarint32(p0, p1, registers);
       ArrayDecoders$Registers int1 = registers.int1;
       if (int1 < null || int1 > (i1 - i2)) {
          throw InvalidProtocolBufferException.truncatedMessage();
       }
       int i3 = i2 + int1;
       MapEntryLite$Metadata metadata1 = metadata.defaultKey;
       MapEntryLite$Metadata metadata2 = metadata.defaultValue;
       while (i2 < i3) {
          int i4 = i2 + 1;
          i2 = i[i2];
          if (i2 < 0) {
             i5 = ArrayDecoders.decodeVarint32(i2, p0, i4, registers);
             registers1 = registers.int1;
          }else {
             i5 = i4;
          }
          i4 = registers1 >> 3;
          int i6 = registers1 & 0x07;
          if (i4 != 1) {
             if (i4 == 2 && i6 == metadata.valueType.getWireType()) {
                i2 = this.decodeMapEntryValue(p0, i5, p2, metadata.valueType, metadata.defaultValue.getClass(), p5);
                metadata2 = registers.object1;
             }
          }else if(i6 == metadata.keyType.getWireType()){
             i2 = this.decodeMapEntryValue(p0, i5, p2, metadata.keyType, null, p5);
             metadata1 = registers.object1;
          }
          i2 = ArrayDecoders.skipField(registers1, p0, i5, i1, registers);
       }
       if (i2 != i3) {
          throw InvalidProtocolBufferException.parseFailure();
       }
       p4.put(metadata1, metadata2);
       return i3;
    }
    public final int decodeMapEntryValue(byte[] p0,int p1,int p2,WireFormat$FieldType p3,Class p4,ArrayDecoders$Registers p5){
       int i;
       switch (MessageSchema$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p3.ordinal()]){
           case 1:
             i = ArrayDecoders.decodeVarint64(p0, p1, p5);
             boolean b = (p5.long1)? true: false;
             p5.object1 = Boolean.valueOf(b);
             break;
           case 2:
             i = ArrayDecoders.decodeBytes(p0, p1, p5);
             break;
           case 3:
             p5.object1 = Double.valueOf(ArrayDecoders.decodeDouble(p0, p1));
          label_0091 :
             i = p1 + 8;
             break;
           case 4:
           case 5:
             p5.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(p0, p1));
          label_0084 :
             i = p1 + 4;
             break;
           case 6:
           case 7:
             p5.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(p0, p1));
             goto label_0091 ;
             break;
           case 8:
             p5.object1 = Float.valueOf(ArrayDecoders.decodeFloat(p0, p1));
             goto label_0084 ;
             break;
           case 9:
           case 11:
           case 10:
             i = ArrayDecoders.decodeVarint32(p0, p1, p5);
             p5.object1 = Integer.valueOf(p5.int1);
             break;
           case 12:
           case 13:
             i = ArrayDecoders.decodeVarint64(p0, p1, p5);
             p5.object1 = Long.valueOf(p5.long1);
             break;
           case 14:
             i = ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor(p4), p0, p1, p2, p5);
             break;
           case 15:
             i = ArrayDecoders.decodeVarint32(p0, p1, p5);
             p5.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(p5.int1));
             break;
           case 16:
             i = ArrayDecoders.decodeVarint64(p0, p1, p5);
             p5.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(p5.long1));
             break;
           case 17:
             i = ArrayDecoders.decodeStringRequireUtf8(p0, p1, p5);
             break;
           default:
             throw new RuntimeException("unsupported field type.");
       }
       return i;
    }
    public boolean equals(Object p0,Object p1){
       int len = this.buffer.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (!this.equals(p0, p1, i)) {
                break ;
             }else {
                i = i + 3;
             }
          }else if(!this.unknownFieldSchema.getFromMessage(p0).equals(this.unknownFieldSchema.getFromMessage(p1))){
             return false;
          }else if(this.hasExtensions != null){
             return this.extensionSchema.getExtensions(p0).equals(this.extensionSchema.getExtensions(p1));
          }else {
             return true;
          }
       }
       return false;
    }
    public final boolean equals(Object p0,Object p1,int p2){
       int i = this.typeAndOffsetAt(p2);
       long l = MessageSchema.offset(i);
       boolean b = false;
       switch (MessageSchema.type(i)){
           case 0:
             if (this.arePresentForEquals(p0, p1, p2) && !Double.doubleToLongBits(UnsafeUtil.getDouble(p0, l)) - Double.doubleToLongBits(UnsafeUtil.getDouble(p1, l))) {
                b = true;
             }
             return b;
             break;
           case 1:
             if (this.arePresentForEquals(p0, p1, p2) && Float.floatToIntBits(UnsafeUtil.getFloat(p0, l)) == Float.floatToIntBits(UnsafeUtil.getFloat(p1, l))) {
                b = true;
             }
             return b;
             break;
           case 2:
             if (this.arePresentForEquals(p0, p1, p2) && !UnsafeUtil.getLong(p0, l) - UnsafeUtil.getLong(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 3:
             if (this.arePresentForEquals(p0, p1, p2) && !UnsafeUtil.getLong(p0, l) - UnsafeUtil.getLong(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 4:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 5:
             if (this.arePresentForEquals(p0, p1, p2) && !UnsafeUtil.getLong(p0, l) - UnsafeUtil.getLong(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 6:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 7:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getBoolean(p0, l) == UnsafeUtil.getBoolean(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 8:
             if (this.arePresentForEquals(p0, p1, p2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l))) {
                b = true;
             }
             return b;
             break;
           case 9:
             if (this.arePresentForEquals(p0, p1, p2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l))) {
                b = true;
             }
             return b;
             break;
           case 10:
             if (this.arePresentForEquals(p0, p1, p2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l))) {
                b = true;
             }
             return b;
             break;
           case 11:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 12:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 13:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 14:
             if (this.arePresentForEquals(p0, p1, p2) && !UnsafeUtil.getLong(p0, l) - UnsafeUtil.getLong(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 15:
             if (this.arePresentForEquals(p0, p1, p2) && UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 16:
             if (this.arePresentForEquals(p0, p1, p2) && !UnsafeUtil.getLong(p0, l) - UnsafeUtil.getLong(p1, l)) {
                b = true;
             }
             return b;
             break;
           case 17:
             if (this.arePresentForEquals(p0, p1, p2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l))) {
                b = true;
             }
             return b;
             break;
           case 18:
           case 20:
           case 21:
           case 22:
           case 23:
           case 24:
           case 25:
           case 26:
           case 27:
           case 28:
           case 29:
           case 30:
           case 31:
           case 32:
           case '!':
           case '"':
           case '#':
           case '$':
           case '%':
           case '&':
           case 39:
           case '(':
           case ')':
           case '*':
           case '+':
           case ',':
           case '-':
           case '.':
           case '/':
           case '0':
           case '1':
           case 19:
             return SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l));
           case '2':
             return SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l));
           case '3':
           case '5':
           case '6':
           case '7':
           case '8':
           case '9':
           case ':':
           case ';':
           case '<':
           case '=':
           case '>':
           case '?':
           case '@':
           case 'A':
           case 'B':
           case 'C':
           case 'D':
           case '4':
             if (this.isOneofCaseEqual(p0, p1, p2) && SchemaUtil.safeEquals(UnsafeUtil.getObject(p0, l), UnsafeUtil.getObject(p1, l))) {
                b = true;
             }
             return b;
             break;
           default:
             return true;
       }
    }
    public final Object filterMapUnknownEnumValues(Object p0,int p1,Object p2,UnknownFieldSchema p3){
       int i = this.numberAt(p1);
       p0 = UnsafeUtil.getObject(p0, MessageSchema.offset(this.typeAndOffsetAt(p1)));
       if (p0 == null) {
          return p2;
       }
       Internal$EnumVerifier enumFieldVer = this.getEnumFieldVerifier(p1);
       if (enumFieldVer == null) {
          return p2;
       }
       return this.filterUnknownEnumMap(p1, i, this.mapFieldSchema.forMutableMapData(p0), enumFieldVer, p2, p3);
    }
    public final Object filterUnknownEnumMap(int p0,int p1,Map p2,Internal$EnumVerifier p3,Object p4,UnknownFieldSchema p5){
       MapEntryLite$Metadata metadata = this.mapFieldSchema.forMapMetadata(this.getMapFieldDefaultEntry(p0));
       Iterator iterator = p2.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!p3.isInRange(uEntry.getValue().intValue())) {
             if (p4 == null) {
                p4 = p5.newBuilder();
             }
             ByteString$CodedBuilder uCodedBuilde = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, uEntry.getKey(), uEntry.getValue()));
             CodedOutputStream codedOutput = uCodedBuilde.getCodedOutput();
             try{
                MapEntryLite.writeTo(codedOutput, metadata, uEntry.getKey(), uEntry.getValue());
                p5.addLengthDelimited(p4, p1, uCodedBuilde.build());
                iterator.remove();
             }catch(java.io.IOException e5){
                throw new RuntimeException(e5);
             }
          }
       }
       return p4;
    }
    public final Internal$EnumVerifier getEnumFieldVerifier(int p0){
       return this.objects[(((p0 / 3) * 2) + 1)];
    }
    public final Object getMapFieldDefaultEntry(int p0){
       return this.objects[((p0 / 3) * 2)];
    }
    public final Schema getMessageFieldSchema(int p0){
       p0 = (p0 / 3) * 2;
       object oobject = this.objects[p0];
       if (oobject != null) {
          return oobject;
       }
       Schema schema = Protobuf.getInstance().schemaFor(this.objects[(p0 + 1)]);
       this.objects[p0] = schema;
       return schema;
    }
    public int getSchemaSize(){
       return (this.buffer.length * 3);
    }
    public int getSerializedSize(Object p0){
       int serializedSi = (this.proto3 != null)? this.getSerializedSizeProto3(p0): this.getSerializedSizeProto2(p0);
       return serializedSi;
    }
    public final int getSerializedSizeProto2(Object p0){
       int i8;
       int i9;
       Object object;
       int i13;
       MessageSchema messageSchem = this;
       Object obj = p0;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       Schema schema = -1;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < messageSchem.buffer.length) {
          int i3 = messageSchem.typeAndOffsetAt(i);
          int i4 = messageSchem.numberAt(i);
          int i5 = MessageSchema.type(i3);
          int i6 = 0xfffff;
          int i7 = 1;
          if (i5 <= 17) {
             i8 = i + 2;
             i9 = messageSchem.buffer[i8];
             i6 = i6 & i9;
             i8 = i9 >> 20;
             i8 = i7 << i8;
             int i10 = i8;
             if (i6 != schema) {
                i2 = uNSAFE.getInt(obj, (long)i6);
                schema = i6;
             }
             i8 = i10;
          }else if(messageSchem.useCachedSizeField != null && (i5 >= FieldType.DOUBLE_LIST_PACKED.id() && i5 <= FieldType.SINT64_LIST_PACKED.id())){
             i7 = i + 2;
             i9 = messageSchem.buffer[i7] & i6;
          }else {
             i9 = null;
          }
          i8 = 0;
          long l = MessageSchema.offset(i3);
          MessageSchema messageSchem1 = null;
          int i11 = schema;
          int i12 = 0;
          switch (i5){
              case 0:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeDoubleSize(i4, 0);
                label_0517 :
                   i1 = i1 + i12;
                }
                break;
              case 1:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeFloatSize(i4, messageSchem1);
                   goto label_0517 ;
                }
                break;
              case 2:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeInt64Size(i4, uNSAFE.getLong(obj, l));
                   goto label_0517 ;
                }
                break;
              case 3:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeUInt64Size(i4, uNSAFE.getLong(obj, l));
                   goto label_0517 ;
                }
                break;
              case 4:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeInt32Size(i4, uNSAFE.getInt(obj, l));
                   goto label_0517 ;
                }
                break;
              case 5:
                i3 = i2 & i8;
                if (i3) {
                   i12 = CodedOutputStream.computeFixed64Size(i4, i12);
                   goto label_0517 ;
                }
                break;
              case 6:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeFixed32Size(i4, 0);
                   goto label_0517 ;
                }else {
                label_041f :
                   i5 = 0;
                }
                break;
              case 7:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeBoolSize(i4, true);
                label_041e :
                   i1 = i1 + i12;
                   goto label_041f ;
                }else {
                   goto label_041f ;
                }
                break;
              case 8:
                i12 = i2 & i8;
                if (i12) {
                   object = uNSAFE.getObject(obj, l);
                   if (object instanceof ByteString) {
                      i12 = CodedOutputStream.computeBytesSize(i4, object);
                      goto label_041e ;
                   }else {
                      i12 = CodedOutputStream.computeStringSize(i4, object);
                      goto label_041e ;
                   }
                }else {
                   goto label_041f ;
                }
                break;
              case 9:
                i12 = i2 & i8;
                if (i12) {
                   i12 = SchemaUtil.computeSizeMessage(i4, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 10:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeBytesSize(i4, uNSAFE.getObject(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 11:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeUInt32Size(i4, uNSAFE.getInt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 12:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeEnumSize(i4, uNSAFE.getInt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 13:
                i12 = i2 & i8;
                if (i12) {
                   i13 = CodedOutputStream.computeSFixed32Size(i4, 0);
                label_0461 :
                   i1 = i1 + i13;
                   goto label_041f ;
                }else {
                   goto label_041f ;
                }
                break;
              case 14:
                i3 = i2 & i8;
                if (i3) {
                   i12 = CodedOutputStream.computeSFixed64Size(i4, i12);
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 15:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeSInt32Size(i4, uNSAFE.getInt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 16:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeSInt64Size(i4, uNSAFE.getLong(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 17:
                i12 = i2 & i8;
                if (i12) {
                   i12 = CodedOutputStream.computeGroupSize(i4, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 18:
                i12 = SchemaUtil.computeSizeFixed64List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 19:
                i12 = SchemaUtil.computeSizeFixed32List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 20:
                i12 = SchemaUtil.computeSizeInt64List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 21:
                i12 = SchemaUtil.computeSizeUInt64List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 22:
                i12 = SchemaUtil.computeSizeInt32List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 23:
                i12 = SchemaUtil.computeSizeFixed64List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 24:
                i12 = SchemaUtil.computeSizeFixed32List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 25:
                i12 = SchemaUtil.computeSizeBoolList(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 26:
                i12 = SchemaUtil.computeSizeStringList(i4, uNSAFE.getObject(obj, l));
                goto label_041e ;
                break;
              case 27:
                i12 = SchemaUtil.computeSizeMessageList(i4, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                goto label_041e ;
                break;
              case 28:
                i12 = SchemaUtil.computeSizeByteStringList(i4, uNSAFE.getObject(obj, l));
                goto label_041e ;
                break;
              case 29:
                i12 = SchemaUtil.computeSizeUInt32List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 30:
                i12 = SchemaUtil.computeSizeEnumList(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 31:
                i12 = SchemaUtil.computeSizeFixed32List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case 32:
                i12 = SchemaUtil.computeSizeFixed64List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case '!':
                i12 = SchemaUtil.computeSizeSInt32List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case '"':
                i12 = SchemaUtil.computeSizeSInt64List(i4, uNSAFE.getObject(obj, l), false);
                goto label_041e ;
                break;
              case '#':
                i12 = SchemaUtil.computeSizeFixed64ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                label_0347 :
                   i13 = i13 + i3;
                   i13 = i13 + i12;
                   goto label_0461 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '$':
                i12 = SchemaUtil.computeSizeFixed32ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '%':
                i12 = SchemaUtil.computeSizeInt64ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '&':
                i12 = SchemaUtil.computeSizeUInt64ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case 39:
                i12 = SchemaUtil.computeSizeInt32ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '(':
                i12 = SchemaUtil.computeSizeFixed64ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case ')':
                i12 = SchemaUtil.computeSizeFixed32ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '*':
                i12 = SchemaUtil.computeSizeBoolListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '+':
                i12 = SchemaUtil.computeSizeUInt32ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case ',':
                i12 = SchemaUtil.computeSizeEnumListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '-':
                i12 = SchemaUtil.computeSizeFixed32ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '.':
                i12 = SchemaUtil.computeSizeFixed64ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '/':
                i12 = SchemaUtil.computeSizeSInt32ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '0':
                i12 = SchemaUtil.computeSizeSInt64ListNoTag(uNSAFE.getObject(obj, l));
                if (i12 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i9, i12);
                   }
                   i13 = CodedOutputStream.computeTagSize(i4);
                   i3 = CodedOutputStream.computeUInt32SizeNoTag(i12);
                   goto label_0347 ;
                }else {
                   goto label_041f ;
                }
                break;
              case '1':
                i12 = SchemaUtil.computeSizeGroupList(i4, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                goto label_041e ;
                break;
              case '2':
                i12 = messageSchem.mapFieldSchema.getSerializedSize(i4, uNSAFE.getObject(obj, l), messageSchem.getMapFieldDefaultEntry(i));
                goto label_041e ;
                break;
              case '3':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeDoubleSize(i4, 0);
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '4':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeFloatSize(i4, messageSchem1);
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '5':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeInt64Size(i4, MessageSchema.oneofLongAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '6':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeUInt64Size(i4, MessageSchema.oneofLongAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '7':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeInt32Size(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '8':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeFixed64Size(i4, i12);
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '9':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i13 = CodedOutputStream.computeFixed32Size(i4, 0);
                   goto label_0461 ;
                }else {
                   goto label_041f ;
                }
                break;
              case ':':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeBoolSize(i4, true);
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case ';':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   object = uNSAFE.getObject(obj, l);
                   if (object instanceof ByteString) {
                      i12 = CodedOutputStream.computeBytesSize(i4, object);
                      goto label_041e ;
                   }else {
                      i12 = CodedOutputStream.computeStringSize(i4, object);
                      goto label_041e ;
                   }
                }else {
                   goto label_041f ;
                }
                break;
              case '<':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = SchemaUtil.computeSizeMessage(i4, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '=':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeBytesSize(i4, uNSAFE.getObject(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '>':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeUInt32Size(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '?':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeEnumSize(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case '@':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i13 = CodedOutputStream.computeSFixed32Size(i4, 0);
                   goto label_0461 ;
                }else {
                   goto label_041f ;
                }
                break;
              case 'A':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeSFixed64Size(i4, i12);
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 'B':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeSInt32Size(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 'C':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeSInt64Size(i4, MessageSchema.oneofLongAt(obj, l));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              case 'D':
                if (messageSchem.isOneofPresent(obj, i4, i)) {
                   i12 = CodedOutputStream.computeGroupSize(i4, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                   goto label_041e ;
                }else {
                   goto label_041f ;
                }
                break;
              default:
                goto label_041f ;
          }
       label_0518 :
          i = i + 3;
          schema = i11;
       }
       i1 = i1 + messageSchem.getUnknownFieldsSerializedSize(messageSchem.unknownFieldSchema, obj);
       if (messageSchem.hasExtensions != null) {
          i1 = i1 + messageSchem.extensionSchema.getExtensions(obj).getSerializedSize();
       }
       return i1;
    }
    public final int getSerializedSizeProto3(Object p0){
       int i5;
       Object object;
       MessageSchema messageSchem = this;
       Object obj = p0;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       int i = 0;
       int i1 = 0;
       while (i < messageSchem.buffer.length) {
          boolean i2 = this.typeAndOffsetAt(i);
          int i3 = MessageSchema.type(i2);
          int i4 = this.numberAt(i);
          long l = MessageSchema.offset(i2);
          if (i3 >= FieldType.DOUBLE_LIST_PACKED.id() && i3 <= FieldType.SINT64_LIST_PACKED.id()) {
             i5 = i + 2;
             i2 = messageSchem.buffer[i5] & 0xfffff;
          }else {
             i2 = false;
          }
          i5 = 1;
          switch (i3){
              case 0:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeDoubleSize(i4, 0);
                label_03c4 :
                   i1 = i1 + i2;
                }
                break;
              case 1:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeFloatSize(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 2:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeInt64Size(i4, UnsafeUtil.getLong(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 3:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeUInt64Size(i4, UnsafeUtil.getLong(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 4:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeInt32Size(i4, UnsafeUtil.getInt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 5:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeFixed64Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 6:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeFixed32Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 7:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeBoolSize(i4, i5);
                   goto label_03c4 ;
                }
                break;
              case 8:
                if (this.isFieldPresent(obj, i)) {
                   object = UnsafeUtil.getObject(obj, l);
                   if (object instanceof ByteString) {
                      i2 = CodedOutputStream.computeBytesSize(i4, object);
                      goto label_03c4 ;
                   }else {
                      i2 = CodedOutputStream.computeStringSize(i4, object);
                      goto label_03c4 ;
                   }
                }
                break;
              case 9:
                if (this.isFieldPresent(obj, i)) {
                   i2 = SchemaUtil.computeSizeMessage(i4, UnsafeUtil.getObject(obj, l), this.getMessageFieldSchema(i));
                   goto label_03c4 ;
                }
                break;
              case 10:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeBytesSize(i4, UnsafeUtil.getObject(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 11:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeUInt32Size(i4, UnsafeUtil.getInt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 12:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeEnumSize(i4, UnsafeUtil.getInt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 13:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeSFixed32Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 14:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeSFixed64Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 15:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeSInt32Size(i4, UnsafeUtil.getInt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 16:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeSInt64Size(i4, UnsafeUtil.getLong(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 17:
                if (this.isFieldPresent(obj, i)) {
                   i2 = CodedOutputStream.computeGroupSize(i4, UnsafeUtil.getObject(obj, l), this.getMessageFieldSchema(i));
                   goto label_03c4 ;
                }
                break;
              case 18:
                i2 = SchemaUtil.computeSizeFixed64List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 19:
                i2 = SchemaUtil.computeSizeFixed32List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 20:
                i2 = SchemaUtil.computeSizeInt64List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 21:
                i2 = SchemaUtil.computeSizeUInt64List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 22:
                i2 = SchemaUtil.computeSizeInt32List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 23:
                i2 = SchemaUtil.computeSizeFixed64List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 24:
                i2 = SchemaUtil.computeSizeFixed32List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 25:
                i2 = SchemaUtil.computeSizeBoolList(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 26:
                i2 = SchemaUtil.computeSizeStringList(i4, MessageSchema.listAt(obj, l));
                goto label_03c4 ;
                break;
              case 27:
                i2 = SchemaUtil.computeSizeMessageList(i4, MessageSchema.listAt(obj, l), this.getMessageFieldSchema(i));
                goto label_03c4 ;
                break;
              case 28:
                i2 = SchemaUtil.computeSizeByteStringList(i4, MessageSchema.listAt(obj, l));
                goto label_03c4 ;
                break;
              case 29:
                i2 = SchemaUtil.computeSizeUInt32List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 30:
                i2 = SchemaUtil.computeSizeEnumList(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 31:
                i2 = SchemaUtil.computeSizeFixed32List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case 32:
                i2 = SchemaUtil.computeSizeFixed64List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case '!':
                i2 = SchemaUtil.computeSizeSInt32List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case '"':
                i2 = SchemaUtil.computeSizeSInt64List(i4, MessageSchema.listAt(obj, l), 0);
                goto label_03c4 ;
                break;
              case '#':
                i3 = SchemaUtil.computeSizeFixed64ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                label_031f :
                   i2 = i2 + i4;
                   i2 = i2 + i3;
                   goto label_03c4 ;
                }
                break;
              case '$':
                i3 = SchemaUtil.computeSizeFixed32ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '%':
                i3 = SchemaUtil.computeSizeInt64ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '&':
                i3 = SchemaUtil.computeSizeUInt64ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case 39:
                i3 = SchemaUtil.computeSizeInt32ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '(':
                i3 = SchemaUtil.computeSizeFixed64ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case ')':
                i3 = SchemaUtil.computeSizeFixed32ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '*':
                i3 = SchemaUtil.computeSizeBoolListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '+':
                i3 = SchemaUtil.computeSizeUInt32ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case ',':
                i3 = SchemaUtil.computeSizeEnumListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '-':
                i3 = SchemaUtil.computeSizeFixed32ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '.':
                i3 = SchemaUtil.computeSizeFixed64ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '/':
                i3 = SchemaUtil.computeSizeSInt32ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '0':
                i3 = SchemaUtil.computeSizeSInt64ListNoTag(uNSAFE.getObject(obj, l));
                if (i3 > 0) {
                   if (messageSchem.useCachedSizeField != null) {
                      uNSAFE.putInt(obj, (long)i2, i3);
                   }
                   i2 = CodedOutputStream.computeTagSize(i4);
                   i4 = CodedOutputStream.computeUInt32SizeNoTag(i3);
                   goto label_031f ;
                }
                break;
              case '1':
                i2 = SchemaUtil.computeSizeGroupList(i4, MessageSchema.listAt(obj, l), this.getMessageFieldSchema(i));
                goto label_03c4 ;
                break;
              case '2':
                i2 = messageSchem.mapFieldSchema.getSerializedSize(i4, UnsafeUtil.getObject(obj, l), this.getMapFieldDefaultEntry(i));
                goto label_03c4 ;
                break;
              case '3':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeDoubleSize(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case '4':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeFloatSize(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case '5':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeInt64Size(i4, MessageSchema.oneofLongAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case '6':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeUInt64Size(i4, MessageSchema.oneofLongAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case '7':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeInt32Size(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case '8':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeFixed64Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case '9':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeFixed32Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case ':':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeBoolSize(i4, i5);
                   goto label_03c4 ;
                }
                break;
              case ';':
                if (this.isOneofPresent(obj, i4, i)) {
                   object = UnsafeUtil.getObject(obj, l);
                   if (object instanceof ByteString) {
                      i2 = CodedOutputStream.computeBytesSize(i4, object);
                      goto label_03c4 ;
                   }else {
                      i2 = CodedOutputStream.computeStringSize(i4, object);
                      goto label_03c4 ;
                   }
                }
                break;
              case '<':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = SchemaUtil.computeSizeMessage(i4, UnsafeUtil.getObject(obj, l), this.getMessageFieldSchema(i));
                   goto label_03c4 ;
                }
                break;
              case '=':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeBytesSize(i4, UnsafeUtil.getObject(obj, l));
                   goto label_03c4 ;
                }
                break;
              case '>':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeUInt32Size(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case '?':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeEnumSize(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case '@':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeSFixed32Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 'A':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeSFixed64Size(i4, 0);
                   goto label_03c4 ;
                }
                break;
              case 'B':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeSInt32Size(i4, MessageSchema.oneofIntAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 'C':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeSInt64Size(i4, MessageSchema.oneofLongAt(obj, l));
                   goto label_03c4 ;
                }
                break;
              case 'D':
                if (this.isOneofPresent(obj, i4, i)) {
                   i2 = CodedOutputStream.computeGroupSize(i4, UnsafeUtil.getObject(obj, l), this.getMessageFieldSchema(i));
                   goto label_03c4 ;
                }
                break;
              default:
          }
       label_04df :
          i = i + 3;
       }
       return (i1 + this.getUnknownFieldsSerializedSize(messageSchem.unknownFieldSchema, obj));
    }
    public final int getUnknownFieldsSerializedSize(UnknownFieldSchema p0,Object p1){
       return p0.getSerializedSize(p0.getFromMessage(p1));
    }
    public int hashCode(Object p0){
       Object object;
       int len = this.buffer.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          int i2 = this.typeAndOffsetAt(i);
          int i3 = this.numberAt(i);
          long l = MessageSchema.offset(i2);
          int i4 = 37;
          switch (MessageSchema.type(i2)){
              case 0:
                i1 = i1 * 53;
                i2 = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(p0, l)));
             label_0225 :
                i1 = i1 + i2;
                break;
              case 1:
                i1 = i1 * 53;
                i2 = Float.floatToIntBits(UnsafeUtil.getFloat(p0, l));
                goto label_0225 ;
                break;
              case 2:
                i1 = i1 * 53;
                i2 = Internal.hashLong(UnsafeUtil.getLong(p0, l));
                goto label_0225 ;
                break;
              case 3:
                i1 = i1 * 53;
                i2 = Internal.hashLong(UnsafeUtil.getLong(p0, l));
                goto label_0225 ;
                break;
              case 4:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getInt(p0, l);
                goto label_0225 ;
                break;
              case 5:
                i1 = i1 * 53;
                i2 = Internal.hashLong(UnsafeUtil.getLong(p0, l));
                goto label_0225 ;
                break;
              case 6:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getInt(p0, l);
                goto label_0225 ;
                break;
              case 7:
                i1 = i1 * 53;
                i2 = Internal.hashBoolean(UnsafeUtil.getBoolean(p0, l));
                goto label_0225 ;
                break;
              case 8:
                i1 = i1 * 53;
                i2 = (UnsafeUtil.getObject(p0, l)).hashCode();
                goto label_0225 ;
                break;
              case 9:
                object = UnsafeUtil.getObject(p0, l);
                if (object != null) {
                   i4 = object.hashCode();
                label_01c1 :
                   i1 = i1 * 53;
                   i1 = i1 + i4;
                }else {
                   goto label_01c1 ;
                }
                break;
              case 10:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getObject(p0, l).hashCode();
                goto label_0225 ;
                break;
              case 11:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getInt(p0, l);
                goto label_0225 ;
                break;
              case 12:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getInt(p0, l);
                goto label_0225 ;
                break;
              case 13:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getInt(p0, l);
                goto label_0225 ;
                break;
              case 14:
                i1 = i1 * 53;
                i2 = Internal.hashLong(UnsafeUtil.getLong(p0, l));
                goto label_0225 ;
                break;
              case 15:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getInt(p0, l);
                goto label_0225 ;
                break;
              case 16:
                i1 = i1 * 53;
                i2 = Internal.hashLong(UnsafeUtil.getLong(p0, l));
                goto label_0225 ;
                break;
              case 17:
                object = UnsafeUtil.getObject(p0, l);
                if (object != null) {
                   i4 = object.hashCode();
                   goto label_01c1 ;
                }else {
                   goto label_01c1 ;
                }
                break;
              case 18:
              case 20:
              case 21:
              case 22:
              case 23:
              case 24:
              case 25:
              case 26:
              case 27:
              case 28:
              case 29:
              case 30:
              case 31:
              case 32:
              case '!':
              case '"':
              case '#':
              case '$':
              case '%':
              case '&':
              case 39:
              case '(':
              case ')':
              case '*':
              case '+':
              case ',':
              case '-':
              case '.':
              case '/':
              case '0':
              case '1':
              case 19:
                i1 = i1 * 53;
                i2 = UnsafeUtil.getObject(p0, l).hashCode();
                goto label_0225 ;
                break;
              case '2':
                i1 = i1 * 53;
                i2 = UnsafeUtil.getObject(p0, l).hashCode();
                goto label_0225 ;
                break;
              case '3':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashLong(Double.doubleToLongBits(MessageSchema.oneofDoubleAt(p0, l)));
                   goto label_0225 ;
                }
                break;
              case '4':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Float.floatToIntBits(MessageSchema.oneofFloatAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case '5':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashLong(MessageSchema.oneofLongAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case '6':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashLong(MessageSchema.oneofLongAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case '7':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = MessageSchema.oneofIntAt(p0, l);
                   goto label_0225 ;
                }
                break;
              case '8':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashLong(MessageSchema.oneofLongAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case '9':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = MessageSchema.oneofIntAt(p0, l);
                   goto label_0225 ;
                }
                break;
              case ':':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashBoolean(MessageSchema.oneofBooleanAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case ';':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = (UnsafeUtil.getObject(p0, l)).hashCode();
                   goto label_0225 ;
                }
                break;
              case '<':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = UnsafeUtil.getObject(p0, l).hashCode();
                   goto label_0225 ;
                }
                break;
              case '=':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = UnsafeUtil.getObject(p0, l).hashCode();
                   goto label_0225 ;
                }
                break;
              case '>':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = MessageSchema.oneofIntAt(p0, l);
                   goto label_0225 ;
                }
                break;
              case '?':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = MessageSchema.oneofIntAt(p0, l);
                   goto label_0225 ;
                }
                break;
              case '@':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = MessageSchema.oneofIntAt(p0, l);
                   goto label_0225 ;
                }
                break;
              case 'A':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashLong(MessageSchema.oneofLongAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case 'B':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = MessageSchema.oneofIntAt(p0, l);
                   goto label_0225 ;
                }
                break;
              case 'C':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = Internal.hashLong(MessageSchema.oneofLongAt(p0, l));
                   goto label_0225 ;
                }
                break;
              case 'D':
                if (this.isOneofPresent(p0, i3, i)) {
                   i1 = i1 * 53;
                   i2 = UnsafeUtil.getObject(p0, l).hashCode();
                   goto label_0225 ;
                }
                break;
              default:
          }
       label_0226 :
          i = i + 3;
       }
       i1 = (i1 * 53) + this.unknownFieldSchema.getFromMessage(p0).hashCode();
       if (this.hasExtensions != null) {
          i1 = (i1 * 53) + this.extensionSchema.getExtensions(p0).hashCode();
       }
       return i1;
    }
    public final boolean isFieldPresent(Object p0,int p1){
       boolean b = false;
       if (this.proto3 != null) {
          p1 = this.typeAndOffsetAt(p1);
          long l = MessageSchema.offset(p1);
          switch (MessageSchema.type(p1)){
              case 0:
                if (UnsafeUtil.getDouble(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 1:
                if (UnsafeUtil.getFloat(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 2:
                if (UnsafeUtil.getLong(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 3:
                if (UnsafeUtil.getLong(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 4:
                if (UnsafeUtil.getInt(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 5:
                if (UnsafeUtil.getLong(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 6:
                if (UnsafeUtil.getInt(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 7:
                return UnsafeUtil.getBoolean(p0, l);
              case 8:
                p0 = UnsafeUtil.getObject(p0, l);
                if (p0 instanceof String) {
                   return (p0.isEmpty() ^ 1);
                }else if(p0 instanceof ByteString){
                   return (ByteString.EMPTY.equals(p0) ^ 1);
                }else {
                   throw new IllegalArgumentException();
                }
                break;
              case 9:
                if (UnsafeUtil.getObject(p0, l) != null) {
                   b = true;
                }
                return b;
                break;
              case 10:
                return (ByteString.EMPTY.equals(UnsafeUtil.getObject(p0, l)) ^ 1);
              case 11:
                if (UnsafeUtil.getInt(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 12:
                if (UnsafeUtil.getInt(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 13:
                if (UnsafeUtil.getInt(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 14:
                if (UnsafeUtil.getLong(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 15:
                if (UnsafeUtil.getInt(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 16:
                if (UnsafeUtil.getLong(p0, l)) {
                   b = true;
                }
                return b;
                break;
              case 17:
                if (UnsafeUtil.getObject(p0, l) != null) {
                   b = true;
                }
                return b;
                break;
              default:
                throw new IllegalArgumentException();
          }
       }else {
          p1 = this.presenceMaskAndOffsetAt(p1);
          if (UnsafeUtil.getInt(p0, (long)(p1 & 0xfffff)) & (1 << (p1 >> 20))) {
             b = true;
          }
          return b;
       }
    }
    public final boolean isFieldPresent(Object p0,int p1,int p2,int p3){
       if (this.proto3 != null) {
          return this.isFieldPresent(p0, p1);
       }
       boolean b = (p2 & p3)? true: false;
       return b;
    }
    public final boolean isInitialized(Object p0){
       int i7;
       Unsafe unsafe = -1;
       int i = 0;
       int i1 = 0;
       while (true) {
          int i2 = 1;
          if (i < this.checkInitializedCount) {
             int i3 = this.intArray[i];
             int i4 = this.numberAt(i3);
             int i5 = this.typeAndOffsetAt(i3);
             if (this.proto3 == null) {
                int i6 = i3 + 2;
                i7 = this.buffer[i6];
                i6 = 0xfffff & i7;
                i7 = i7 >> 20;
                i2 = i2 << i7;
                if (i6 != unsafe) {
                   i1 = MessageSchema.UNSAFE.getInt(p0, (long)i6);
                   unsafe = i6;
                }
             }else {
                i2 = 0;
             }
             if (MessageSchema.isRequired(i5) && !this.isFieldPresent(p0, i3, i1, i2)) {
                break ;
             }else {
                i7 = MessageSchema.type(i5);
                if (i7 != 9 && i7 != 17) {
                   if (i7 != 27) {
                      if (i7 != 60 && i7 != 68) {
                         if (i7 != 49) {
                            if (i7 == 50 && !this.isMapInitialized(p0, i5, i3)) {
                               return false;
                            }
                         }
                      }else if(this.isOneofPresent(p0, i4, i3) && !MessageSchema.isInitialized(p0, i5, this.getMessageFieldSchema(i3))){
                         return false;
                      }
                   }
                   if (!this.isListInitialized(p0, i5, i3)) {
                      return false;
                   }
                }else if(this.isFieldPresent(p0, i3, i1, i2) && !MessageSchema.isInitialized(p0, i5, this.getMessageFieldSchema(i3))){
                   return false;
                }
             label_0090 :
                i = i + 1;
             }
          }else if(this.hasExtensions != null && !this.extensionSchema.getExtensions(p0).isInitialized()){
             return false;
          }else {
             return i2;
          }
       }
       return false;
    }
    public final boolean isListInitialized(Object p0,int p1,int p2){
       p0 = UnsafeUtil.getObject(p0, MessageSchema.offset(p1));
       if (p0.isEmpty()) {
          return true;
       }
       Schema messageField = this.getMessageFieldSchema(p2);
       int i = 0;
       while (true) {
          if (i >= p0.size()) {
             return true;
          }
          if (!messageField.isInitialized(p0.get(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean isMapInitialized(Object p0,int p1,int p2){
       p0 = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(p0, MessageSchema.offset(p1)));
       if (p0.isEmpty()) {
          return true;
       }
       if (this.mapFieldSchema.forMapMetadata(this.getMapFieldDefaultEntry(p2)).valueType.getJavaType() != WireFormat$JavaType.MESSAGE) {
          return true;
       }
       Protobuf protobuf = null;
       p0 = p0.values().iterator();
       while (true) {
          if (!p0.hasNext()) {
             return true;
          }
          Object obj = p0.next();
          if (protobuf == null) {
             protobuf = Protobuf.getInstance().schemaFor(obj.getClass());
          }
          if (!protobuf.isInitialized(obj)) {
             break ;
          }
       }
       return false;
    }
    public final boolean isOneofCaseEqual(Object p0,Object p1,int p2){
       long l = (long)(this.presenceMaskAndOffsetAt(p2) & 0xfffff);
       boolean b = (UnsafeUtil.getInt(p0, l) == UnsafeUtil.getInt(p1, l))? true: false;
       return b;
    }
    public final boolean isOneofPresent(Object p0,int p1,int p2){
       boolean b = (UnsafeUtil.getInt(p0, (long)(this.presenceMaskAndOffsetAt(p2) & 0xfffff)) == p1)? true: false;
       return b;
    }
    public void makeImmutable(Object p0){
       MessageSchema tcheckInitia = this.checkInitializedCount;
       MessageSchema trepeatedFie = this.repeatedFieldOffsetStart;
       while (tcheckInitia < trepeatedFie) {
          long l = MessageSchema.offset(this.typeAndOffsetAt(this.intArray[tcheckInitia]));
          Object object = UnsafeUtil.getObject(p0, l);
          if (object != null) {
             UnsafeUtil.putObject(p0, l, this.mapFieldSchema.toImmutable(object));
          }
          tcheckInitia = tcheckInitia + 1;
       }
       int len = this.intArray.length;
       for (; trepeatedFie < len; trepeatedFie = trepeatedFie + 1) {
          this.listFieldSchema.makeImmutableListAt(p0, (long)this.intArray[trepeatedFie]);
       }
       this.unknownFieldSchema.makeImmutable(p0);
       if (this.hasExtensions != null) {
          this.extensionSchema.makeImmutable(p0);
       }
       return;
    }
    public void mergeFrom(Object p0,Reader p1,ExtensionRegistryLite p2){
       Objects.requireNonNull(p2);
       this.mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, p0, p1, p2);
    }
    public void mergeFrom(Object p0,Object p1){
       Objects.requireNonNull(p1);
       for (int i = 0; i < this.buffer.length; i = i + 3) {
          this.mergeSingleField(p0, p1, i);
       }
       SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, p0, p1);
       if (this.hasExtensions != null) {
          SchemaUtil.mergeExtensions(this.extensionSchema, p0, p1);
       }
       return;
    }
    public void mergeFrom(Object p0,byte[] p1,int p2,int p3,ArrayDecoders$Registers p4){
       if (this.proto3 != null) {
          this.parseProto3Message(p0, p1, p2, p3, p4);
       }else {
          this.parseProto2Message(p0, p1, p2, p3, 0, p4);
       }
       return;
    }
    public final void mergeFromHelper(UnknownFieldSchema p0,ExtensionSchema p1,Object p2,Reader p3,ExtensionRegistryLite p4){
       MessageSchema checkInitial;
       Object obj2;
       int i2;
       int i4;
       Internal$EnumVerifier enumFieldVer;
       List list;
       MessageSchema messageSchem = this;
       UnknownFieldSchema unknownField = p0;
       Object obj = p2;
       Reader reader = p3;
       ExtensionRegistryLite uExtensionRe = p4;
       Object obj1 = null;
       int i = obj1;
       while (true) {
          int fieldNumber = p3.getFieldNumber();
          int i1 = messageSchem.positionForFieldNumber(fieldNumber);
          if (i1 < 0) {
             if (fieldNumber == Integer.MAX_VALUE) {
                for (checkInitial = messageSchem.checkInitializedCount; checkInitial < messageSchem.repeatedFieldOffsetStart; checkInitial = checkInitial + 1) {
                   obj1 = messageSchem.filterMapUnknownEnumValues(obj, messageSchem.intArray[checkInitial], obj1, unknownField);
                }
                if (obj1 != null) {
                   unknownField.setBuilderToMessage(obj, obj1);
                }
             }else if(messageSchem.hasExtensions == null){
                obj2 = null;
             }else {
                obj2 = p1.findExtensionByNumber(uExtensionRe, messageSchem.defaultInstance, fieldNumber);
             }
             if (obj2 != null) {
                if (i == null) {
                   i = p1.getMutableExtensions(p2);
                }
                obj1 = p1.parseExtension(p3, obj2, p4, i, obj1, p0);
             }else if(unknownField.shouldDiscardUnknownFields(reader)){
                if (p3.skipField()) {
                   continue ;
                }
             }else if(obj1 == null){
                obj1 = unknownField.getBuilderFromMessage(obj);
             }
             if (unknownField.mergeOneFieldFrom(obj1, reader)) {
                continue ;
             }
             for (checkInitial = messageSchem.checkInitializedCount; checkInitial < messageSchem.repeatedFieldOffsetStart; i2 = checkInitial + 1) {
                obj1 = messageSchem.filterMapUnknownEnumValues(obj, messageSchem.intArray[checkInitial], obj1, unknownField);
             }
             if (obj1 != null) {
                unknownField.setBuilderToMessage(obj, obj1);
             }
             return;
          }else {
             int i3 = messageSchem.typeAndOffsetAt(i1);
             try{
                switch (MessageSchema.type(i3)){
                    case 0:
                      UnsafeUtil.putDouble(obj, MessageSchema.offset(i3), p3.readDouble());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 1:
                      UnsafeUtil.putFloat(obj, MessageSchema.offset(i3), p3.readFloat());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 2:
                      UnsafeUtil.putLong(obj, MessageSchema.offset(i3), p3.readInt64());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 3:
                      UnsafeUtil.putLong(obj, MessageSchema.offset(i3), p3.readUInt64());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 4:
                      UnsafeUtil.putInt(obj, MessageSchema.offset(i3), p3.readInt32());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 5:
                      UnsafeUtil.putLong(obj, MessageSchema.offset(i3), p3.readFixed64());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 6:
                      UnsafeUtil.putInt(obj, MessageSchema.offset(i3), p3.readFixed32());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 7:
                      UnsafeUtil.putBoolean(obj, MessageSchema.offset(i3), p3.readBool());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 8:
                      messageSchem.readString(obj, i3, reader);
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 9:
                      if (messageSchem.isFieldPresent(obj, i1)) {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Internal.mergeMessage(UnsafeUtil.getObject(obj, MessageSchema.offset(i3)), reader.readMessageBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe)));
                      }else {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), reader.readMessageBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe));
                         messageSchem.setFieldPresent(obj, i1);
                      }
                      break;
                    case 10:
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), p3.readBytes());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 11:
                      UnsafeUtil.putInt(obj, MessageSchema.offset(i3), p3.readUInt32());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 12:
                      i4 = p3.readEnum();
                      enumFieldVer = messageSchem.getEnumFieldVerifier(i1);
                      if (enumFieldVer == null || enumFieldVer.isInRange(i4)) {
                         UnsafeUtil.putInt(obj, MessageSchema.offset(i3), i4);
                         messageSchem.setFieldPresent(obj, i1);
                      }else {
                         obj1 = SchemaUtil.storeUnknownEnum(fieldNumber, i4, obj1, unknownField);
                      }
                      break;
                    case 13:
                      UnsafeUtil.putInt(obj, MessageSchema.offset(i3), p3.readSFixed32());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 14:
                      UnsafeUtil.putLong(obj, MessageSchema.offset(i3), p3.readSFixed64());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 15:
                      UnsafeUtil.putInt(obj, MessageSchema.offset(i3), p3.readSInt32());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 16:
                      UnsafeUtil.putLong(obj, MessageSchema.offset(i3), p3.readSInt64());
                      messageSchem.setFieldPresent(obj, i1);
                      break;
                    case 17:
                      if (messageSchem.isFieldPresent(obj, i1)) {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Internal.mergeMessage(UnsafeUtil.getObject(obj, MessageSchema.offset(i3)), reader.readGroupBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe)));
                      }else {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), reader.readGroupBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe));
                         messageSchem.setFieldPresent(obj, i1);
                      }
                      break;
                    case 18:
                      reader.readDoubleList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 19:
                      reader.readFloatList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 20:
                      reader.readInt64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 21:
                      reader.readUInt64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 22:
                      reader.readInt32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 23:
                      reader.readFixed64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 24:
                      reader.readFixed32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 25:
                      reader.readBoolList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 26:
                      messageSchem.readStringList(obj, i3, reader);
                      break;
                    case 27:
                      this.readMessageList(p2, i3, p3, messageSchem.getMessageFieldSchema(i1), p4);
                      break;
                    case 28:
                      reader.readBytesList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 29:
                      reader.readUInt32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 30:
                      list = messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3));
                      reader.readEnumList(list);
                      obj1 = SchemaUtil.filterUnknownEnumList(fieldNumber, list, messageSchem.getEnumFieldVerifier(i1), obj1, unknownField);
                      break;
                    case 31:
                      reader.readSFixed32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 32:
                      reader.readSFixed64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '!':
                      reader.readSInt32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '"':
                      reader.readSInt64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '#':
                      reader.readDoubleList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '$':
                      reader.readFloatList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '%':
                      reader.readInt64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '&':
                      reader.readUInt64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case 39:
                      reader.readInt32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '(':
                      reader.readFixed64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case ')':
                      reader.readFixed32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '*':
                      reader.readBoolList(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '+':
                      reader.readUInt32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case ',':
                      list = messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3));
                      reader.readEnumList(list);
                      obj1 = SchemaUtil.filterUnknownEnumList(fieldNumber, list, messageSchem.getEnumFieldVerifier(i1), obj1, unknownField);
                      break;
                    case '-':
                      reader.readSFixed32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '.':
                      reader.readSFixed64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '/':
                      reader.readSInt32List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '0':
                      reader.readSInt64List(messageSchem.listFieldSchema.mutableListAt(obj, MessageSchema.offset(i3)));
                      break;
                    case '1':
                      this.readGroupList(p2, MessageSchema.offset(i3), p3, messageSchem.getMessageFieldSchema(i1), p4);
                      break;
                    case '2':
                      this.mergeMap(p2, i1, messageSchem.getMapFieldDefaultEntry(i1), p4, p3);
                      break;
                    case '3':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Double.valueOf(p3.readDouble()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '4':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Float.valueOf(p3.readFloat()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '5':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Long.valueOf(p3.readInt64()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '6':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Long.valueOf(p3.readUInt64()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '7':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Integer.valueOf(p3.readInt32()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '8':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Long.valueOf(p3.readFixed64()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '9':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Integer.valueOf(p3.readFixed32()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case ':':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Boolean.valueOf(p3.readBool()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case ';':
                      messageSchem.readString(obj, i3, reader);
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '<':
                      if (messageSchem.isOneofPresent(obj, fieldNumber, i1)) {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Internal.mergeMessage(UnsafeUtil.getObject(obj, MessageSchema.offset(i3)), reader.readMessageBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe)));
                      }else {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), reader.readMessageBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe));
                         messageSchem.setFieldPresent(obj, i1);
                      }
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '=':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), p3.readBytes());
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '>':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Integer.valueOf(p3.readUInt32()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case '?':
                      i4 = p3.readEnum();
                      enumFieldVer = messageSchem.getEnumFieldVerifier(i1);
                      if (enumFieldVer == null || enumFieldVer.isInRange(i4)) {
                         UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Integer.valueOf(i4));
                         messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      }else {
                         obj1 = SchemaUtil.storeUnknownEnum(fieldNumber, i4, obj1, unknownField);
                      }
                      break;
                    case '@':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Integer.valueOf(p3.readSFixed32()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case 'A':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Long.valueOf(p3.readSFixed64()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case 'B':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Integer.valueOf(p3.readSInt32()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case 'C':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), Long.valueOf(p3.readSInt64()));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    case 'D':
                      UnsafeUtil.putObject(obj, MessageSchema.offset(i3), reader.readGroupBySchemaWithCheck(messageSchem.getMessageFieldSchema(i1), uExtensionRe));
                      messageSchem.setOneofPresent(obj, fieldNumber, i1);
                      break;
                    default:
                      if (obj1 == null) {
                         Object obj3 = p0.newBuilder();
                         obj1 = obj3;
                      }
                      if (!unknownField.mergeOneFieldFrom(obj1, reader)) {
                         for (checkInitial = messageSchem.checkInitializedCount; checkInitial < messageSchem.repeatedFieldOffsetStart; i2 = checkInitial + 1) {
                            obj1 = messageSchem.filterMapUnknownEnumValues(obj, messageSchem.intArray[checkInitial], obj1, unknownField);
                         }
                         if (obj1 != null) {
                            unknownField.setBuilderToMessage(obj, obj1);
                         }
                         return;
                      }
                }
             }catch(com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException e0){
                if (unknownField.shouldDiscardUnknownFields(e0)) {
                   if (!p3.skipField()) {
                      checkInitial = messageSchem.checkInitializedCount;
                   label_05d9 :
                      if (checkInitial < messageSchem.repeatedFieldOffsetStart) {
                         obj1 = messageSchem.filterMapUnknownEnumValues(obj, messageSchem.intArray[checkInitial], obj1, unknownField);
                         i2 = checkInitial + 1;
                         goto label_05d9 ;
                      }else if(obj1 != null){
                         unknownField.setBuilderToMessage(obj, obj1);
                      }
                      return;
                   }else {
                      goto label_000d ;
                   }
                }else if(!obj1){
                   obj1 = unknownField.getBuilderFromMessage(obj);
                }
                if (!unknownField.mergeOneFieldFrom(obj1, e0)) {
                   checkInitial = messageSchem.checkInitializedCount;
                label_05fd :
                   if (checkInitial < messageSchem.repeatedFieldOffsetStart) {
                      obj1 = messageSchem.filterMapUnknownEnumValues(obj, messageSchem.intArray[checkInitial], obj1, unknownField);
                      i2 = checkInitial + 1;
                      goto label_05fd ;
                   }else if(obj1 != null){
                      unknownField.setBuilderToMessage(obj, obj1);
                   }
                   return;
                }else {
                   goto label_000d ;
                }
             }
          }
       }
       return;
    }
    public final void mergeMap(Object p0,int p1,Object p2,ExtensionRegistryLite p3,Reader p4){
       long l = MessageSchema.offset(this.typeAndOffsetAt(p1));
       Object object = UnsafeUtil.getObject(p0, l);
       if (object == null) {
          object = this.mapFieldSchema.newMapField(p2);
          UnsafeUtil.putObject(p0, l, object);
       }else if(this.mapFieldSchema.isImmutable(object)){
          Object obj = this.mapFieldSchema.newMapField(p2);
          this.mapFieldSchema.mergeFrom(obj, object);
          UnsafeUtil.putObject(p0, l, obj);
          object = obj;
       }
       p4.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(p2), p3);
       return;
    }
    public final void mergeMessage(Object p0,Object p1,int p2){
       long l = MessageSchema.offset(this.typeAndOffsetAt(p2));
       if (!this.isFieldPresent(p1, p2)) {
          return;
       }
       Object object = UnsafeUtil.getObject(p0, l);
       p1 = UnsafeUtil.getObject(p1, l);
       if (object != null && p1 != null) {
          UnsafeUtil.putObject(p0, l, Internal.mergeMessage(object, p1));
          this.setFieldPresent(p0, p2);
       }else if(p1 != null){
          UnsafeUtil.putObject(p0, l, p1);
          this.setFieldPresent(p0, p2);
       }
       return;
    }
    public final void mergeOneofMessage(Object p0,Object p1,int p2){
       int i = this.numberAt(p2);
       long l = MessageSchema.offset(this.typeAndOffsetAt(p2));
       if (!this.isOneofPresent(p1, i, p2)) {
          return;
       }
       Object object = UnsafeUtil.getObject(p0, l);
       p1 = UnsafeUtil.getObject(p1, l);
       if (object != null && p1 != null) {
          UnsafeUtil.putObject(p0, l, Internal.mergeMessage(object, p1));
          this.setOneofPresent(p0, i, p2);
       }else if(p1 != null){
          UnsafeUtil.putObject(p0, l, p1);
          this.setOneofPresent(p0, i, p2);
       }
       return;
    }
    public final void mergeSingleField(Object p0,Object p1,int p2){
       int i = this.typeAndOffsetAt(p2);
       long l = MessageSchema.offset(i);
       int i1 = this.numberAt(p2);
       switch (MessageSchema.type(i)){
           case 0:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putDouble(p0, l, UnsafeUtil.getDouble(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 1:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putFloat(p0, l, UnsafeUtil.getFloat(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 2:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putLong(p0, l, UnsafeUtil.getLong(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 3:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putLong(p0, l, UnsafeUtil.getLong(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 4:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putInt(p0, l, UnsafeUtil.getInt(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 5:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putLong(p0, l, UnsafeUtil.getLong(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 6:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putInt(p0, l, UnsafeUtil.getInt(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 7:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putBoolean(p0, l, UnsafeUtil.getBoolean(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 8:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putObject(p0, l, UnsafeUtil.getObject(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 9:
             this.mergeMessage(p0, p1, p2);
             break;
           case 10:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putObject(p0, l, UnsafeUtil.getObject(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 11:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putInt(p0, l, UnsafeUtil.getInt(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 12:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putInt(p0, l, UnsafeUtil.getInt(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 13:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putInt(p0, l, UnsafeUtil.getInt(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 14:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putLong(p0, l, UnsafeUtil.getLong(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 15:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putInt(p0, l, UnsafeUtil.getInt(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 16:
             if (this.isFieldPresent(p1, p2)) {
                UnsafeUtil.putLong(p0, l, UnsafeUtil.getLong(p1, l));
                this.setFieldPresent(p0, p2);
             }
             break;
           case 17:
             this.mergeMessage(p0, p1, p2);
             break;
           case 18:
           case 20:
           case 21:
           case 22:
           case 23:
           case 24:
           case 25:
           case 26:
           case 27:
           case 28:
           case 29:
           case 30:
           case 31:
           case 32:
           case '!':
           case '"':
           case '#':
           case '$':
           case '%':
           case '&':
           case 39:
           case '(':
           case ')':
           case '*':
           case '+':
           case ',':
           case '-':
           case '.':
           case '/':
           case '0':
           case '1':
           case 19:
             this.listFieldSchema.mergeListsAt(p0, p1, l);
             break;
           case '2':
             SchemaUtil.mergeMap(this.mapFieldSchema, p0, p1, l);
             break;
           case '3':
           case '5':
           case '6':
           case '7':
           case '8':
           case '9':
           case ':':
           case ';':
           case '4':
             if (this.isOneofPresent(p1, i1, p2)) {
                UnsafeUtil.putObject(p0, l, UnsafeUtil.getObject(p1, l));
                this.setOneofPresent(p0, i1, p2);
             }
             break;
           case '<':
             this.mergeOneofMessage(p0, p1, p2);
             break;
           case '=':
           case '?':
           case '@':
           case 'A':
           case 'B':
           case 'C':
           case '>':
             if (this.isOneofPresent(p1, i1, p2)) {
                UnsafeUtil.putObject(p0, l, UnsafeUtil.getObject(p1, l));
                this.setOneofPresent(p0, i1, p2);
             }
             break;
           case 'D':
             this.mergeOneofMessage(p0, p1, p2);
             break;
           default:
       }
    label_0173 :
       return;
    }
    public Object newInstance(){
       return this.newInstanceSchema.newInstance(this.defaultInstance);
    }
    public final int numberAt(int p0){
       return this.buffer[p0];
    }
    public final int parseMapField(Object p0,byte[] p1,int p2,int p3,int p4,long p5,ArrayDecoders$Registers p6){
       MessageSchema messageSchem = this;
       long l = p5;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       Object mapFieldDefa = this.getMapFieldDefaultEntry(p4);
       Object object = uNSAFE.getObject(p0, l);
       if (messageSchem.mapFieldSchema.isImmutable(object)) {
          Object obj = messageSchem.mapFieldSchema.newMapField(mapFieldDefa);
          messageSchem.mapFieldSchema.mergeFrom(obj, object);
          uNSAFE.putObject(p0, l, obj);
          object = obj;
       }
       return this.decodeMapEntry(p1, p2, p3, messageSchem.mapFieldSchema.forMapMetadata(mapFieldDefa), messageSchem.mapFieldSchema.forMutableMapData(object), p6);
    }
    public final int parseOneofField(Object p0,byte[] p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8,long p9,int p10,ArrayDecoders$Registers p11){
       ArrayDecoders$Registers int1;
       MessageSchema messageSchem = this;
       Object obj = p0;
       byte[] uobyteArray = p1;
       int i = p2;
       int i1 = p4;
       int i2 = p5;
       int i3 = p6;
       long l = p9;
       int i4 = p10;
       ArrayDecoders$Registers registers = p11;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       long l1 = (long)(messageSchem.buffer[(i4 + 2)] & 0xfffff);
       int i5 = 5;
       Object obj1 = 2;
       switch (p8){
           case '3':
             if (i3 == Double.MIN_VALUE) {
                uNSAFE.putObject(obj, l, Double.valueOf(ArrayDecoders.decodeDouble(p1, p2)));
                i1 = i + 8;
                uNSAFE.putInt(obj, l1, i2);
             }else {
             label_01c4 :
                i1 = i;
             }
             break;
           case '4':
             if (i3 == i5) {
                uNSAFE.putObject(obj, l, Float.valueOf(ArrayDecoders.decodeFloat(p1, p2)));
                i1 = i + 4;
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '5':
           case '6':
             if (!i3) {
                i1 = ArrayDecoders.decodeVarint64(uobyteArray, i, registers);
                uNSAFE.putObject(obj, l, Long.valueOf(registers.long1));
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '7':
           case '>':
             if (!i3) {
                i1 = ArrayDecoders.decodeVarint32(uobyteArray, i, registers);
                uNSAFE.putObject(obj, l, Integer.valueOf(registers.int1));
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '8':
           case 'A':
             if (i3 == 1) {
                uNSAFE.putObject(obj, l, Long.valueOf(ArrayDecoders.decodeFixed64(p1, p2)));
                i1 = i + 8;
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '9':
           case '@':
             if (i3 == i5) {
                uNSAFE.putObject(obj, l, Integer.valueOf(ArrayDecoders.decodeFixed32(p1, p2)));
                i1 = i + 4;
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case ':':
             if (!i3) {
                i1 = ArrayDecoders.decodeVarint64(uobyteArray, i, registers);
                boolean b = (registers.long1)? true: false;
                uNSAFE.putObject(obj, l, Boolean.valueOf(b));
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case ';':
             if (i3 == obj1) {
                i1 = ArrayDecoders.decodeVarint32(uobyteArray, i, registers);
                int1 = registers.int1;
                if (int1 == null) {
                   uNSAFE.putObject(obj, l, "");
                }else if(!(p7 & 0x20000000) || Utf8.isValidUtf8(uobyteArray, i1, (i1 + int1))){
                   uNSAFE.putObject(obj, l, new String(uobyteArray, i1, int1, Internal.UTF_8));
                   i1 = i1 + int1;
                }else {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '<':
             if (i3 == obj1) {
                i1 = ArrayDecoders.decodeMessageField(messageSchem.getMessageFieldSchema(i4), uobyteArray, i, p3, registers);
                obj1 = (uNSAFE.getInt(obj, l1) == i2)? uNSAFE.getObject(obj, l): null;
                if (obj1 == null) {
                   uNSAFE.putObject(obj, l, registers.object1);
                }else {
                   uNSAFE.putObject(obj, l, Internal.mergeMessage(obj1, registers.object1));
                }
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '=':
             if (i3 == obj1) {
                i1 = ArrayDecoders.decodeBytes(uobyteArray, i, registers);
                uNSAFE.putObject(obj, l, registers.object1);
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case '?':
             if (!i3) {
                int i6 = ArrayDecoders.decodeVarint32(uobyteArray, i, registers);
                int1 = registers.int1;
                Internal$EnumVerifier enumFieldVer = messageSchem.getEnumFieldVerifier(i4);
                if (enumFieldVer == null || enumFieldVer.isInRange(int1)) {
                   uNSAFE.putObject(obj, l, Integer.valueOf(int1));
                   uNSAFE.putInt(obj, l1, i2);
                }else {
                   MessageSchema.getMutableUnknownFields(p0).storeField(i1, Long.valueOf((long)int1));
                }
                i1 = i6;
             }else {
                goto label_01c4 ;
             }
             break;
           case 'B':
             if (!i3) {
                i1 = ArrayDecoders.decodeVarint32(uobyteArray, i, registers);
                uNSAFE.putObject(obj, l, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case 'C':
             if (!i3) {
                i1 = ArrayDecoders.decodeVarint64(uobyteArray, i, registers);
                uNSAFE.putObject(obj, l, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           case 'D':
             if (i3 == 3) {
                i1 = ArrayDecoders.decodeGroupField(messageSchem.getMessageFieldSchema(i4), p1, p2, p3, ((i1 & 0xf8) | 0x04), p11);
                obj1 = (uNSAFE.getInt(obj, l1) == i2)? uNSAFE.getObject(obj, l): null;
                if (obj1 == null) {
                   uNSAFE.putObject(obj, l, registers.object1);
                }else {
                   uNSAFE.putObject(obj, l, Internal.mergeMessage(obj1, registers.object1));
                }
                uNSAFE.putInt(obj, l1, i2);
             }else {
                goto label_01c4 ;
             }
             break;
           default:
             goto label_01c4 ;
       }
       return i1;
    }
    public int parseProto2Message(Object p0,byte[] p1,int p2,int p3,int p4,ArrayDecoders$Registers p5){
       int i7;
       ArrayDecoders$Registers registers1;
       int i9;
       ArrayDecoders$Registers registers2;
       int i10;
       int i11;
       Unsafe unsafe;
       int i12;
       MessageSchema messageSchem2;
       int i13;
       Internal$EnumVerifier obj1;
       byte i15;
       ArrayDecoders$Registers registers5;
       long l1;
       int i17;
       MessageSchema messageSchem = this;
       Object obj = p0;
       byte[] uobyteArray = p1;
       int i = p3;
       int i1 = p4;
       ArrayDecoders$Registers registers = p5;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       int i2 = p2;
       int i3 = -1;
       int i4 = 0;
       int i5 = 0;
       MessageSchema messageSchem1 = null;
       int i6 = -1;
       while (true) {
          if (i2 < i) {
             i5 = i2 + 1;
             i2 = uobyteArray[i2];
             if (i2 < 0) {
                i7 = ArrayDecoders.decodeVarint32(i2, uobyteArray, i5, registers);
                registers1 = registers.int1;
             }else {
                i15 = i2;
                i7 = i5;
             }
             i5 = registers1 >> 3;
             i2 = registers1 & 0x07;
             int i8 = 3;
             if (i5 > i3) {
                i4 = i4 / i8;
                i3 = messageSchem.positionForFieldNumber(i5, i4);
             }else {
                i3 = messageSchem.positionForFieldNumber(i5);
             }
             i4 = i3;
             if (i4 == -1) {
                i9 = i5;
                i4 = i7;
                registers2 = registers1;
                i10 = messageSchem1;
                i11 = i6;
                unsafe = uNSAFE;
                i2 = i1;
                i12 = 0;
             }else {
                int i14 = i4 + 1;
                i3 = messageSchem.buffer[i14];
                i8 = MessageSchema.type(i3);
                long l = MessageSchema.offset(i3);
                ArrayDecoders$Registers registers4 = registers1;
                i11 = i3;
                if (i8 <= 17) {
                   i12 = i4 + 2;
                   i15 = messageSchem.buffer[i12];
                   i12 = i15 >> 20;
                   i12 = 1 << i12;
                   i15 = i15 & 0xfffff;
                   if (i15 != i6) {
                      i9 = i4;
                      if (i6 != -1) {
                         uNSAFE.putInt(obj, (long)i6, messageSchem1);
                      }
                      messageSchem1 = uNSAFE.getInt(obj, (long)i15);
                      i6 = i15;
                   }else {
                      i9 = i4;
                      registers5 = -1;
                   }
                   ExtensionRegistryLite uExtensionRe = 5;
                   switch (i8){
                       case 0:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = i7;
                         if (i2 == 1) {
                            UnsafeUtil.putDouble(obj, l1, ArrayDecoders.decodeDouble(uobyteArray, i1));
                         label_0294 :
                            i2 = i1 + 8;
                         label_0296 :
                            messageSchem1 = messageSchem1 | i12;
                         label_0298 :
                            i1 = p4;
                            i4 = i8;
                            i5 = registers5;
                            i3 = i9;
                         }else {
                         label_02a0 :
                            i2 = p4;
                            i10 = messageSchem1;
                            i11 = i6;
                            i12 = i8;
                            unsafe = uNSAFE;
                            i4 = i1;
                            registers2 = registers5;
                         }
                         break;
                       case 1:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = i7;
                         if (i2 == uExtensionRe) {
                            UnsafeUtil.putFloat(obj, l1, ArrayDecoders.decodeFloat(uobyteArray, i1));
                            i2 = i1 + 4;
                            goto label_0296 ;
                         }else {
                            goto label_02a0 ;
                         }
                         break;
                       case 2:
                       case 3:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = i7;
                         if (!i2) {
                            i1 = ArrayDecoders.decodeVarint64(uobyteArray, i1, registers);
                            uNSAFE.putLong(p0, l1, registers.long1);
                         label_0259 :
                            messageSchem1 = messageSchem1 | i12;
                            i4 = i8;
                            i2 = i1;
                            i5 = registers5;
                            i3 = i9;
                            i = p3;
                         label_0262 :
                            i1 = p4;
                         }else {
                            goto label_02a0 ;
                         }
                         break;
                       case 4:
                       case 11:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = i7;
                         if (!i2) {
                            i2 = ArrayDecoders.decodeVarint32(uobyteArray, i1, registers);
                            uNSAFE.putInt(obj, l1, registers.int1);
                            goto label_0296 ;
                         }else {
                            goto label_02a0 ;
                         }
                         break;
                       case 5:
                       case 14:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         if (i2 == 1) {
                            i1 = i7;
                            uNSAFE.putLong(p0, l1, ArrayDecoders.decodeFixed64(uobyteArray, i7));
                            goto label_0294 ;
                         }else {
                         label_0223 :
                            i1 = i7;
                            goto label_02a0 ;
                         }
                         break;
                       case 6:
                       case 13:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = p3;
                         if (i2 == uExtensionRe) {
                            uNSAFE.putInt(obj, l1, ArrayDecoders.decodeFixed32(uobyteArray, i7));
                            i2 = i7 + 4;
                         label_01fb :
                            messageSchem1 = messageSchem1 | i12;
                            i4 = i8;
                            i5 = registers5;
                            i3 = i9;
                            i = i1;
                            goto label_0262 ;
                         }else {
                            goto label_0223 ;
                         }
                         break;
                       case 7:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = p3;
                         if (!i2) {
                            i2 = ArrayDecoders.decodeVarint64(uobyteArray, i7, registers);
                            i3 = (registers.long1)? true: false;
                            UnsafeUtil.putBoolean(obj, l1, i3);
                            goto label_01fb ;
                         }else {
                            goto label_0223 ;
                         }
                         break;
                       case 8:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         i1 = p3;
                         if (i2 == 2) {
                            i2 = i11 & 0x20000000;
                            i2 = (!i2)? ArrayDecoders.decodeString(uobyteArray, i7, registers): ArrayDecoders.decodeStringRequireUtf8(uobyteArray, i7, registers);
                            uNSAFE.putObject(obj, l1, registers.object1);
                            goto label_01fb ;
                         }else {
                            goto label_0223 ;
                         }
                         break;
                       case 9:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         if (i2 == 2) {
                            i1 = p3;
                            i2 = ArrayDecoders.decodeMessageField(messageSchem.getMessageFieldSchema(i8), uobyteArray, i7, i1, registers);
                            i3 = messageSchem1 & i12;
                            if (!i3) {
                               uNSAFE.putObject(obj, l1, registers.object1);
                               goto label_01fb ;
                            }else {
                               uNSAFE.putObject(obj, l1, Internal.mergeMessage(uNSAFE.getObject(obj, l1), registers.object1));
                               goto label_01fb ;
                            }
                         }else {
                            i14 = -1;
                            goto label_0223 ;
                         }
                         break;
                       case 10:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         if (i2 == 2) {
                            i2 = ArrayDecoders.decodeBytes(uobyteArray, i7, registers);
                            uNSAFE.putObject(obj, l1, registers.object1);
                            goto label_0296 ;
                         }else {
                         label_015f :
                            i1 = i7;
                            i14 = -1;
                            goto label_02a0 ;
                         }
                         break;
                       case 12:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         if (!i2) {
                            i2 = ArrayDecoders.decodeVarint32(uobyteArray, i7, registers);
                            ArrayDecoders$Registers int1 = registers.int1;
                            obj1 = messageSchem.getEnumFieldVerifier(i8);
                            if (obj1 == null || obj1.isInRange(int1)) {
                               uNSAFE.putInt(obj, l1, int1);
                               goto label_0296 ;
                            }else {
                               MessageSchema.getMutableUnknownFields(p0).storeField(registers5, Long.valueOf((long)int1));
                               goto label_0298 ;
                            }
                         }else {
                            goto label_015f ;
                         }
                         break;
                       case 15:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         l1 = l;
                         uobyteArray = p1;
                         if (!i2) {
                            i2 = ArrayDecoders.decodeVarint32(uobyteArray, i7, registers);
                            uNSAFE.putInt(obj, l1, CodedInputStream.decodeZigZag32(registers.int1));
                            goto label_0296 ;
                         }else {
                            goto label_015f ;
                         }
                         break;
                       case 16:
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         if (!i2) {
                            uobyteArray = p1;
                            i1 = ArrayDecoders.decodeVarint64(uobyteArray, i7, registers);
                            uNSAFE.putLong(p0, l, CodedInputStream.decodeZigZag64(registers.long1));
                            goto label_0259 ;
                         }else {
                         label_00f9 :
                            int i16 = p1;
                            goto label_015f ;
                         }
                         break;
                       case 17:
                         if (i2 == 3) {
                            i2 = i5 << 3;
                            i15 = i2 | 0x04;
                            i4 = i9;
                            Schema messageField = messageSchem.getMessageFieldSchema(i4);
                            i8 = i4;
                            i9 = i5;
                            i7 = i15;
                            registers5 = registers4;
                            i2 = ArrayDecoders.decodeGroupField(messageField, p1, i7, p3, i7, p5);
                            i3 = messageSchem1 & i12;
                            if (!i3) {
                               uNSAFE.putObject(obj, l, registers.object1);
                            }else {
                               uNSAFE.putObject(obj, l, Internal.mergeMessage(uNSAFE.getObject(obj, l), registers.object1));
                            }
                            messageSchem1 = messageSchem1 | i12;
                            uobyteArray = p1;
                            goto label_0298 ;
                         }else {
                            i8 = i9;
                            registers5 = registers4;
                            i9 = i5;
                            goto label_00f9 ;
                         }
                         break;
                       default:
                         i1 = i7;
                         i8 = i9;
                         registers5 = registers4;
                         i9 = i5;
                         goto label_02a0 ;
                   }
                }else {
                   i15 = i4;
                   i9 = i5;
                   l1 = l;
                   registers5 = registers4;
                   uobyteArray = p1;
                   i1 = i7;
                   if (i8 == 27) {
                      if (i2 == 2) {
                         Internal$ProtobufList object = uNSAFE.getObject(obj, l1);
                         if (!object.isModifiable()) {
                            i3 = object.size();
                            i3 = (!i3)? 10: i3 * 2;
                            object = object.mutableCopyWithCapacity(i3);
                            uNSAFE.putObject(obj, l1, object);
                         }
                         i2 = ArrayDecoders.decodeMessageList(messageSchem.getMessageFieldSchema(i15), registers5, p1, i1, p3, object, p5);
                         i1 = p4;
                         i5 = registers5;
                         i3 = i9;
                         i4 = i15;
                         messageSchem1 = messageSchem1;
                      }else {
                         i12 = i15;
                         i10 = messageSchem1;
                         i11 = i6;
                         unsafe = uNSAFE;
                         i17 = i1;
                         registers4 = registers5;
                      }
                   }else {
                      i12 = i15;
                      i10 = messageSchem1;
                      if (i8 <= 49) {
                         i11 = i6;
                         unsafe = uNSAFE;
                         registers4 = registers5;
                         i2 = this.parseRepeatedField(p0, p1, i1, p3, registers5, i9, i2, i12, (long)i11, i8, l1, p5);
                         if (i2 != i1) {
                         label_0347 :
                            messageSchem = this;
                            obj = p0;
                            uobyteArray = p1;
                            i = p3;
                            i1 = p4;
                            registers = p5;
                            i3 = i9;
                            i5 = registers4;
                            i6 = i11;
                            i4 = i12;
                            messageSchem1 = i10;
                         label_035d :
                            uNSAFE = unsafe;
                         }
                      }else {
                         p2 = i2;
                         long l2 = l1;
                         unsafe = uNSAFE;
                         i17 = i1;
                         registers4 = registers5;
                         i3 = i11;
                         i11 = i6;
                         int i18 = i8;
                         if (i18 == 50) {
                            if (p2 == 2) {
                               i2 = this.parseMapField(p0, p1, i17, p3, i12, l2, p5);
                               if (i2 != i17) {
                                  goto label_0347 ;
                               }
                            }
                         }else {
                            i2 = this.parseOneofField(p0, p1, i17, p3, registers4, i9, p2, i3, i18, l2, i12, p5);
                            if (i2 != i17) {
                               goto label_0347 ;
                            }
                         }
                      }
                      i4 = i2;
                      registers2 = registers4;
                      i2 = p4;
                   }
                   i2 = p4;
                   i4 = i17;
                   registers2 = registers4;
                }
                i = p3;
             }
             if (registers2 == i2 && i2) {
                messageSchem2 = this;
                i13 = i2;
                i2 = i4;
                i5 = registers2;
                i6 = i11;
                messageSchem1 = i10;
             label_0415 :
                if (i6 != -1) {
                   obj1 = p0;
                   unsafe.putInt(obj1, (long)i6, messageSchem1);
                }else {
                   obj1 = p0;
                }
                UnknownFieldSetLite unknownField = null;
                for (MessageSchema checkInitial = messageSchem2.checkInitializedCount; checkInitial < messageSchem2.repeatedFieldOffsetStart; checkInitial = checkInitial + 1) {
                   unknownField = messageSchem2.filterMapUnknownEnumValues(obj1, messageSchem2.intArray[checkInitial], unknownField, messageSchem2.unknownFieldSchema);
                }
                if (unknownField != null) {
                   messageSchem2.unknownFieldSchema.setBuilderToMessage(obj1, unknownField);
                }
                if (!i13) {
                   if (i2 != p3) {
                      throw InvalidProtocolBufferException.parseFailure();
                   }
                }else if(i2 <= p3 && i5 == i13){
                   throw InvalidProtocolBufferException.parseFailure();
                }
             }else {
                messageSchem2 = this;
                i13 = i2;
                ArrayDecoders$Registers registers3 = p5;
                i2 = (messageSchem2.hasExtensions != null && registers3.extensionRegistry != ExtensionRegistryLite.getEmptyRegistry())? ArrayDecoders.decodeExtensionOrUnknownField(registers2, p1, i4, p3, p0, messageSchem2.defaultInstance, messageSchem2.unknownFieldSchema, p5): ArrayDecoders.decodeUnknownField(registers2, p1, i4, p3, MessageSchema.getMutableUnknownFields(p0), p5);
                obj = p0;
                uobyteArray = p1;
                i = p3;
                i5 = registers2;
                messageSchem = messageSchem2;
                registers = registers3;
                i3 = i9;
                i6 = i11;
                i4 = i12;
                messageSchem1 = i10;
                i1 = i13;
                goto label_035d ;
             }
          }else {
             unsafe = uNSAFE;
             i13 = i1;
             messageSchem2 = messageSchem;
             goto label_0415 ;
          }
       }
       return i2;
    }
    public final int parseProto3Message(Object p0,byte[] p1,int p2,int p3,ArrayDecoders$Registers p4){
       int i6;
       ArrayDecoders$Registers registers1;
       int i10;
       Unsafe unsafe;
       int i11;
       int i12;
       long l1;
       int i14;
       MessageSchema messageSchem = this;
       Object obj = p0;
       byte[] uobyteArray = p1;
       int i = p3;
       ArrayDecoders$Registers registers = p4;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       int i1 = -1;
       int i2 = p2;
       int i3 = -1;
       int i4 = 0;
       while (i2 < i) {
          int i5 = i2 + 1;
          i2 = uobyteArray[i2];
          if (i2 < 0) {
             i6 = ArrayDecoders.decodeVarint32(i2, uobyteArray, i5, registers);
             registers1 = registers.int1;
          }else {
             registers1 = i2;
             i6 = i5;
          }
          int i7 = registers1 >> 3;
          int i8 = registers1 & 0x07;
          if (i7 > i3) {
             i4 = i4 / 3;
             i2 = messageSchem.positionForFieldNumber(i7, i4);
          }else {
             i2 = messageSchem.positionForFieldNumber(i7);
          }
          int i9 = i2;
          if (i9 == i1) {
             i10 = i7;
             i4 = i6;
             unsafe = uNSAFE;
             i11 = 0;
             i12 = -1;
          label_022d :
             i2 = ArrayDecoders.decodeUnknownField(registers1, p1, i4, p3, MessageSchema.getMutableUnknownFields(p0), p4);
          }else {
             i3 = i9 + 1;
             int i13 = messageSchem.buffer[i3];
             i5 = MessageSchema.type(i13);
             long l = MessageSchema.offset(i13);
             i1 = 2;
             if (i5 <= 17) {
                double d = Double.MIN_VALUE;
                switch (i5){
                    case 0:
                      l1 = l;
                      i1 = i9;
                      if (i8 == d) {
                         UnsafeUtil.putDouble(obj, l1, ArrayDecoders.decodeDouble(uobyteArray, i6));
                      label_0153 :
                         i2 = i6 + 8;
                      label_0155 :
                         i3 = i7;
                         i4 = i1;
                      label_024d :
                         i1 = -1;
                      }else {
                      label_0159 :
                         i10 = i7;
                         i14 = i6;
                         unsafe = uNSAFE;
                         i11 = i1;
                      label_01a5 :
                         i12 = -1;
                      label_020d :
                         i4 = i14;
                         goto label_022d ;
                      }
                      break;
                    case 1:
                      l1 = l;
                      i1 = i9;
                      if (i8 == 0.00f) {
                         UnsafeUtil.putFloat(obj, l1, ArrayDecoders.decodeFloat(uobyteArray, i6));
                         i2 = i6 + 4;
                         goto label_0155 ;
                      }else {
                         goto label_0159 ;
                      }
                      break;
                    case 2:
                    case 3:
                      l1 = l;
                      i1 = i9;
                      if (!i8) {
                         i8 = ArrayDecoders.decodeVarint64(uobyteArray, i6, registers);
                         uNSAFE.putLong(p0, l1, registers.long1);
                      label_0137 :
                         i2 = i8;
                         goto label_0155 ;
                      }else {
                         goto label_0159 ;
                      }
                      break;
                    case 4:
                    case 11:
                      l1 = l;
                      i1 = i9;
                      if (!i8) {
                         i2 = ArrayDecoders.decodeVarint32(uobyteArray, i6, registers);
                         uNSAFE.putInt(obj, l1, registers.int1);
                         goto label_0155 ;
                      }else {
                         goto label_0159 ;
                      }
                      break;
                    case 5:
                    case 14:
                      l1 = l;
                      if (i8 == d) {
                         i1 = i9;
                         uNSAFE.putLong(p0, l1, ArrayDecoders.decodeFixed64(uobyteArray, i6));
                         goto label_0153 ;
                      }
                      break;
                    case 6:
                    case 13:
                      l1 = l;
                      if (i8 == 5) {
                         uNSAFE.putInt(obj, l1, ArrayDecoders.decodeFixed32(uobyteArray, i6));
                         i2 = i6 + 4;
                      label_0105 :
                         i4 = i9;
                         i3 = i7;
                         goto label_024d ;
                      }
                      break;
                    case 7:
                      l1 = l;
                      if (!i8) {
                         i3 = ArrayDecoders.decodeVarint64(uobyteArray, i6, registers);
                         if (!registers.long1) {
                            d = false;
                         }
                         UnsafeUtil.putBoolean(obj, l1, d);
                         i2 = i3;
                         goto label_0105 ;
                      }
                      break;
                    case 8:
                      l1 = l;
                      if (i8 == i1) {
                         i2 = 0x20000000 & i13;
                         i2 = (!i2)? ArrayDecoders.decodeString(uobyteArray, i6, registers): ArrayDecoders.decodeStringRequireUtf8(uobyteArray, i6, registers);
                         uNSAFE.putObject(obj, l1, registers.object1);
                         goto label_0105 ;
                      }
                      break;
                    case 9:
                      l1 = l;
                      if (i8 == i1) {
                         i2 = ArrayDecoders.decodeMessageField(messageSchem.getMessageFieldSchema(i9), uobyteArray, i6, i, registers);
                         Object object = uNSAFE.getObject(obj, l1);
                         if (object == null) {
                            uNSAFE.putObject(obj, l1, registers.object1);
                            goto label_0105 ;
                         }else {
                            uNSAFE.putObject(obj, l1, Internal.mergeMessage(object, registers.object1));
                            goto label_0105 ;
                         }
                      }
                      break;
                    case 10:
                      l1 = l;
                      if (i8 == i1) {
                         i2 = ArrayDecoders.decodeBytes(uobyteArray, i6, registers);
                         uNSAFE.putObject(obj, l1, registers.object1);
                         goto label_0105 ;
                      }
                      break;
                    case 12:
                      l1 = l;
                      i1 = i9;
                      if (!i8) {
                         i2 = ArrayDecoders.decodeVarint32(uobyteArray, i6, registers);
                         uNSAFE.putInt(obj, l1, registers.int1);
                         goto label_0155 ;
                      }else {
                         goto label_0159 ;
                      }
                      break;
                    case 15:
                      l1 = l;
                      i1 = i9;
                      if (!i8) {
                         i2 = ArrayDecoders.decodeVarint32(uobyteArray, i6, registers);
                         uNSAFE.putInt(obj, l1, CodedInputStream.decodeZigZag32(registers.int1));
                         goto label_0155 ;
                      }else {
                         goto label_0159 ;
                      }
                      break;
                    case 16:
                      if (!i8) {
                         i8 = ArrayDecoders.decodeVarint64(uobyteArray, i6, registers);
                         i1 = i9;
                         uNSAFE.putLong(p0, l, CodedInputStream.decodeZigZag64(registers.long1));
                         goto label_0137 ;
                      }
                      break;
                    default:
                }
             }else if(i5 == 27){
                if (i8 == i1) {
                   Internal$ProtobufList object1 = uNSAFE.getObject(obj, l);
                   if (!object1.isModifiable()) {
                      i5 = object1.size();
                      i5 = (!i5)? 10: i5 * 2;
                      object1 = object1.mutableCopyWithCapacity(i5);
                      uNSAFE.putObject(obj, l, object1);
                   }
                   i2 = ArrayDecoders.decodeMessageList(messageSchem.getMessageFieldSchema(i9), registers1, p1, i6, p3, object1, p4);
                   i3 = i7;
                   i4 = i9;
                   goto label_024d ;
                }
             }else {
                i11 = i9;
                if (i5 <= 49) {
                   i10 = i7;
                   unsafe = uNSAFE;
                   i2 = this.parseRepeatedField(p0, p1, i6, p3, registers1, i7, i8, i11, (long)i13, i5, l, p4);
                   if (i2 == i6) {
                   }
                }else {
                   long l2 = l;
                   p2 = i8;
                   i10 = i7;
                   i14 = i6;
                   unsafe = uNSAFE;
                   int i15 = i5;
                   if (i15 == 50) {
                      if (p2 == i1) {
                         i2 = this.parseMapField(p0, p1, i14, p3, i11, l2, p4);
                         if (i2 == i14) {
                         }
                      }else {
                         goto label_020d ;
                      }
                   }else {
                      i2 = this.parseOneofField(p0, p1, i14, p3, registers1, i10, p2, i13, i15, l2, i11, p4);
                      if (i2 == i14) {
                      }
                   }
                }
             }
          label_019e :
             i11 = i9;
             i10 = i7;
             i14 = i6;
             unsafe = uNSAFE;
             goto label_01a5 ;
          }
       label_023d :
          messageSchem = this;
          obj = p0;
          uobyteArray = p1;
          i = p3;
          registers = p4;
          uNSAFE = unsafe;
          i4 = i11;
          i3 = i10;
          goto label_024d ;
       }
       if (i2 == i) {
          return i2;
       }
       throw InvalidProtocolBufferException.parseFailure();
    }
    public final int parseRepeatedField(Object p0,byte[] p1,int p2,int p3,int p4,int p5,int p6,int p7,long p8,int p9,long p10,ArrayDecoders$Registers p11){
       int i4;
       MessageSchema messageSchem = this;
       GeneratedMessageLite generatedMes = p0;
       int i = p2;
       int i1 = p6;
       int i2 = p7;
       long l = p10;
       ArrayDecoders$Registers registers = p11;
       Unsafe uNSAFE = MessageSchema.UNSAFE;
       Internal$ProtobufList object = uNSAFE.getObject(p0, l);
       if (!object.isModifiable()) {
          int i3 = object.size();
          i3 = (!i3)? 10: i3 * 2;
          object = object.mutableCopyWithCapacity(i3);
          uNSAFE.putObject(p0, l, object);
       }
       MessageSchema messageSchem1 = 5;
       Internal$ProtobufList protobufList = 1;
       switch (p9){
           case 18:
           case '#':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedDoubleList(p1, i, object, registers);
             }else if(i1 == protobufList){
                i4 = ArrayDecoders.decodeDoubleList(p4, p1, p2, p3, object, p11);
             }else {
             label_01c3 :
                i4 = i;
             }
             break;
           case 19:
           case '$':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedFloatList(p1, i, object, registers);
             }else if(i1 == messageSchem1){
                i4 = ArrayDecoders.decodeFloatList(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 20:
           case '%':
           case '&':
           case 21:
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedVarint64List(p1, i, object, registers);
             }else if(!i1){
                i4 = ArrayDecoders.decodeVarint64List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 22:
           case 29:
           case 39:
           case '+':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedVarint32List(p1, i, object, registers);
             }else if(!i1){
                i4 = ArrayDecoders.decodeVarint32List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 23:
           case 32:
           case '(':
           case '.':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedFixed64List(p1, i, object, registers);
             }else if(i1 == protobufList){
                i4 = ArrayDecoders.decodeFixed64List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 24:
           case 31:
           case ')':
           case '-':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedFixed32List(p1, i, object, registers);
             }else if(i1 == messageSchem1){
                i4 = ArrayDecoders.decodeFixed32List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 25:
           case '*':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedBoolList(p1, i, object, registers);
             }else if(!i1){
                i4 = ArrayDecoders.decodeBoolList(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 26:
             if (i1 == 2) {
                if (!(p8 & 0x20000000)) {
                   i4 = ArrayDecoders.decodeStringList(p4, p1, p2, p3, object, p11);
                }else {
                   i4 = ArrayDecoders.decodeStringListRequireUtf8(p4, p1, p2, p3, object, p11);
                }
             }else {
                goto label_01c3 ;
             }
             break;
           case 27:
             if (i1 == 2) {
                i4 = ArrayDecoders.decodeMessageList(this.getMessageFieldSchema(i2), p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 28:
             if (i1 == 2) {
                i4 = ArrayDecoders.decodeBytesList(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case 30:
           case ',':
             if (i1 == 2) {
                i1 = ArrayDecoders.decodePackedVarint32List(p1, i, object, registers);
             }else if(!i1){
                GeneratedMessageLite generatedMes1 = ArrayDecoders.decodeVarint32List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             GeneratedMessageLite unknownField = generatedMes.unknownFields;
             if (unknownField == UnknownFieldSetLite.getDefaultInstance()) {
                unknownField = null;
             }
             UnknownFieldSetLite unknownField1 = SchemaUtil.filterUnknownEnumList(p5, object, this.getEnumFieldVerifier(i2), unknownField, messageSchem.unknownFieldSchema);
             if (unknownField1 != null) {
                generatedMes.unknownFields = unknownField1;
             }
             i4 = i1;
             break;
           case '!':
           case '/':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedSInt32List(p1, i, object, registers);
             }else if(!i1){
                i4 = ArrayDecoders.decodeSInt32List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case '"':
           case '0':
             if (i1 == 2) {
                i4 = ArrayDecoders.decodePackedSInt64List(p1, i, object, registers);
             }else if(!i1){
                i4 = ArrayDecoders.decodeSInt64List(p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           case '1':
             if (i1 == 3) {
                i4 = ArrayDecoders.decodeGroupList(this.getMessageFieldSchema(i2), p4, p1, p2, p3, object, p11);
             }else {
                goto label_01c3 ;
             }
             break;
           default:
             goto label_01c3 ;
       }
       return i4;
    }
    public final int positionForFieldNumber(int p0){
       if (p0 >= this.minFieldNumber && p0 <= this.maxFieldNumber) {
          return this.slowPositionForFieldNumber(p0, 0);
       }
       return -1;
    }
    public final int positionForFieldNumber(int p0,int p1){
       if (p0 >= this.minFieldNumber && p0 <= this.maxFieldNumber) {
          return this.slowPositionForFieldNumber(p0, p1);
       }
       return -1;
    }
    public final int presenceMaskAndOffsetAt(int p0){
       return this.buffer[(p0 + 2)];
    }
    public final void readGroupList(Object p0,long p1,Reader p2,Schema p3,ExtensionRegistryLite p4){
       p2.readGroupList(this.listFieldSchema.mutableListAt(p0, p1), p3, p4);
    }
    public final void readMessageList(Object p0,int p1,Reader p2,Schema p3,ExtensionRegistryLite p4){
       p2.readMessageList(this.listFieldSchema.mutableListAt(p0, MessageSchema.offset(p1)), p3, p4);
    }
    public final void readString(Object p0,int p1,Reader p2){
       if (MessageSchema.isEnforceUtf8(p1)) {
          UnsafeUtil.putObject(p0, MessageSchema.offset(p1), p2.readStringRequireUtf8());
       }else if(this.lite != null){
          UnsafeUtil.putObject(p0, MessageSchema.offset(p1), p2.readString());
       }else {
          UnsafeUtil.putObject(p0, MessageSchema.offset(p1), p2.readBytes());
       }
       return;
    }
    public final void readStringList(Object p0,int p1,Reader p2){
       if (MessageSchema.isEnforceUtf8(p1)) {
          p2.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(p0, MessageSchema.offset(p1)));
       }else {
          p2.readStringList(this.listFieldSchema.mutableListAt(p0, MessageSchema.offset(p1)));
       }
       return;
    }
    public final void setFieldPresent(Object p0,int p1){
       if (this.proto3 != null) {
          return;
       }
       p1 = this.presenceMaskAndOffsetAt(p1);
       long l = (long)(p1 & 0xfffff);
       UnsafeUtil.putInt(p0, l, (UnsafeUtil.getInt(p0, l) | (1 << (p1 >> 20))));
       return;
    }
    public final void setOneofPresent(Object p0,int p1,int p2){
       UnsafeUtil.putInt(p0, (long)(this.presenceMaskAndOffsetAt(p2) & 0xfffff), p1);
    }
    public final int slowPositionForFieldNumber(int p0,int p1){
       int i2;
       int i = (this.buffer.length / 3) - 1;
       while (true) {
          if (p1 > i) {
             return -1;
          }
          int i1 = i + p1;
          i1 = i1 >> 1;
          i2 = i1 * 3;
          int i3 = this.numberAt(i2);
          if (p0 == i3) {
             break ;
          }else if(p0 < i3){
             i1 = i1 - 1;
             i = i1;
          }else {
             i1 = i1 + 1;
             p1 = i1;
          }
       }
       return i2;
    }
    public final int typeAndOffsetAt(int p0){
       p0++;
       return this.buffer[p0];
    }
    public final void writeFieldsInAscendingOrderProto2(Object p0,Writer p1){
       Iterator iterator;
       Map$Entry uEntry;
       int i7;
       Map$Entry uEntry1;
       int i8;
       MessageSchema messageSchem = this;
       Object obj = p0;
       Writer writer = p1;
       if (messageSchem.hasExtensions != null) {
          FieldSet extensions = messageSchem.extensionSchema.getExtensions(obj);
          if (!extensions.isEmpty()) {
             iterator = extensions.iterator();
             uEntry = iterator.next();
          label_0023 :
             Schema schema = -1;
             int len = messageSchem.buffer.length;
             Unsafe uNSAFE = MessageSchema.UNSAFE;
             int i = 0;
             int i1 = 0;
             while (i < len) {
                int i2 = messageSchem.typeAndOffsetAt(i);
                int i3 = messageSchem.numberAt(i);
                int i4 = MessageSchema.type(i2);
                if (messageSchem.proto3 == null && i4 <= 17) {
                   int i5 = i + 2;
                   int i6 = messageSchem.buffer[i5];
                   i7 = i6 & 0xfffff;
                   uEntry1 = uEntry;
                   if (i7 != schema) {
                      i1 = uNSAFE.getInt(obj, (long)i7);
                      schema = i7;
                   }
                   i8 = i6 >> 20;
                   i8 = 1 << i8;
                   uEntry = uEntry1;
                }else {
                   uEntry = uEntry;
                   i8 = 0;
                }
                while (uEntry != null && messageSchem.extensionSchema.extensionNumber(uEntry) <= i3) {
                   messageSchem.extensionSchema.serializeExtension(writer, uEntry);
                   if (iterator.hasNext()) {
                      uEntry = iterator.next();
                   }else {
                      uEntry = null;
                   }
                }
                Map$Entry uEntry2 = uEntry;
                i7 = schema;
                long l = MessageSchema.offset(i2);
                switch (i4){
                    case 0:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeDouble(i3, MessageSchema.doubleAt(obj, l));
                      }
                      break;
                    case 1:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeFloat(i3, MessageSchema.floatAt(obj, l));
                      }
                      break;
                    case 2:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeInt64(i3, uNSAFE.getLong(obj, l));
                      }
                      break;
                    case 3:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeUInt64(i3, uNSAFE.getLong(obj, l));
                      }
                      break;
                    case 4:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeInt32(i3, uNSAFE.getInt(obj, l));
                      }
                      break;
                    case 5:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeFixed64(i3, uNSAFE.getLong(obj, l));
                      }
                      break;
                    case 6:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeFixed32(i3, uNSAFE.getInt(obj, l));
                      }
                      break;
                    case 7:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeBool(i3, MessageSchema.booleanAt(obj, l));
                      }
                      break;
                    case 8:
                      i8 = i8 & i1;
                      if (i8) {
                         messageSchem.writeString(i3, uNSAFE.getObject(obj, l), writer);
                      }
                      break;
                    case 9:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeMessage(i3, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                      }
                      break;
                    case 10:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeBytes(i3, uNSAFE.getObject(obj, l));
                      }
                      break;
                    case 11:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeUInt32(i3, uNSAFE.getInt(obj, l));
                      }
                      break;
                    case 12:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeEnum(i3, uNSAFE.getInt(obj, l));
                      }
                      break;
                    case 13:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeSFixed32(i3, uNSAFE.getInt(obj, l));
                      }
                      break;
                    case 14:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeSFixed64(i3, uNSAFE.getLong(obj, l));
                      }
                      break;
                    case 15:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeSInt32(i3, uNSAFE.getInt(obj, l));
                      }
                      break;
                    case 16:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeSInt64(i3, uNSAFE.getLong(obj, l));
                      }
                      break;
                    case 17:
                      i8 = i8 & i1;
                      if (i8) {
                         writer.writeGroup(i3, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                      }
                      break;
                    case 18:
                      SchemaUtil.writeDoubleList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 19:
                      SchemaUtil.writeFloatList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 20:
                      SchemaUtil.writeInt64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 21:
                      SchemaUtil.writeUInt64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 22:
                      SchemaUtil.writeInt32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 23:
                      SchemaUtil.writeFixed64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 24:
                      SchemaUtil.writeFixed32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 25:
                      SchemaUtil.writeBoolList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 26:
                      SchemaUtil.writeStringList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer);
                      break;
                    case 27:
                      SchemaUtil.writeMessageList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, messageSchem.getMessageFieldSchema(i));
                      break;
                    case 28:
                      SchemaUtil.writeBytesList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer);
                      break;
                    case 29:
                      SchemaUtil.writeUInt32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 30:
                      SchemaUtil.writeEnumList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 31:
                      SchemaUtil.writeSFixed32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case 32:
                      SchemaUtil.writeSFixed64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case '!':
                      SchemaUtil.writeSInt32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case '"':
                      SchemaUtil.writeSInt64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, false);
                      break;
                    case '#':
                      SchemaUtil.writeDoubleList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '$':
                      SchemaUtil.writeFloatList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '%':
                      SchemaUtil.writeInt64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '&':
                      SchemaUtil.writeUInt64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case 39:
                      SchemaUtil.writeInt32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '(':
                      SchemaUtil.writeFixed64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case ')':
                      SchemaUtil.writeFixed32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '*':
                      SchemaUtil.writeBoolList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '+':
                      SchemaUtil.writeUInt32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case ',':
                      SchemaUtil.writeEnumList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '-':
                      SchemaUtil.writeSFixed32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '.':
                      SchemaUtil.writeSFixed64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '/':
                      SchemaUtil.writeSInt32List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '0':
                      SchemaUtil.writeSInt64List(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, true);
                      break;
                    case '1':
                      SchemaUtil.writeGroupList(messageSchem.numberAt(i), uNSAFE.getObject(obj, l), writer, messageSchem.getMessageFieldSchema(i));
                      break;
                    case '2':
                      messageSchem.writeMapHelper(writer, i3, uNSAFE.getObject(obj, l), i);
                      break;
                    case '3':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeDouble(i3, MessageSchema.oneofDoubleAt(obj, l));
                      }else {
                      }
                      break;
                    case '4':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeFloat(i3, MessageSchema.oneofFloatAt(obj, l));
                      }else {
                      }
                      break;
                    case '5':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeInt64(i3, MessageSchema.oneofLongAt(obj, l));
                      }else {
                      }
                      break;
                    case '6':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeUInt64(i3, MessageSchema.oneofLongAt(obj, l));
                      }else {
                      }
                      break;
                    case '7':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeInt32(i3, MessageSchema.oneofIntAt(obj, l));
                      }else {
                      }
                      break;
                    case '8':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeFixed64(i3, MessageSchema.oneofLongAt(obj, l));
                      }else {
                      }
                      break;
                    case '9':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeFixed32(i3, MessageSchema.oneofIntAt(obj, l));
                      }else {
                      }
                      break;
                    case ':':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeBool(i3, MessageSchema.oneofBooleanAt(obj, l));
                      }else {
                      }
                      break;
                    case ';':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         messageSchem.writeString(i3, uNSAFE.getObject(obj, l), writer);
                      }else {
                      }
                      break;
                    case '<':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeMessage(i3, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                      }else {
                      }
                      break;
                    case '=':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeBytes(i3, uNSAFE.getObject(obj, l));
                      }else {
                      }
                      break;
                    case '>':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeUInt32(i3, MessageSchema.oneofIntAt(obj, l));
                      }else {
                      }
                      break;
                    case '?':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeEnum(i3, MessageSchema.oneofIntAt(obj, l));
                      }else {
                      }
                      break;
                    case '@':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeSFixed32(i3, MessageSchema.oneofIntAt(obj, l));
                      }else {
                      }
                      break;
                    case 'A':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeSFixed64(i3, MessageSchema.oneofLongAt(obj, l));
                      }else {
                      }
                      break;
                    case 'B':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeSInt32(i3, MessageSchema.oneofIntAt(obj, l));
                      }else {
                      }
                      break;
                    case 'C':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeSInt64(i3, MessageSchema.oneofLongAt(obj, l));
                      }else {
                      }
                      break;
                    case 'D':
                      if (messageSchem.isOneofPresent(obj, i3, i)) {
                         writer.writeGroup(i3, uNSAFE.getObject(obj, l), messageSchem.getMessageFieldSchema(i));
                      }else {
                      }
                      break;
                    default:
                      i2 = 0;
                }
             label_0494 :
                i = i + 3;
                schema = i7;
                uEntry = uEntry2;
             }
             uEntry1 = uEntry;
             while (uEntry != null) {
                messageSchem.extensionSchema.serializeExtension(writer, uEntry);
                if (iterator.hasNext()) {
                   uEntry = iterator.next();
                }else {
                   uEntry = null;
                }
             }
             messageSchem.writeUnknownInMessageTo(messageSchem.unknownFieldSchema, obj, writer);
             return;
          }
       }
       iterator = null;
       uEntry = null;
       goto label_0023 ;
    }
    public final void writeFieldsInAscendingOrderProto3(Object p0,Writer p1){
       Iterator iterator;
       Map$Entry uEntry;
       if (this.hasExtensions != null) {
          FieldSet extensions = this.extensionSchema.getExtensions(p0);
          if (!extensions.isEmpty()) {
             iterator = extensions.iterator();
             uEntry = iterator.next();
          label_001e :
             int len = this.buffer.length;
             int i = 0;
             while (i < len) {
                int i1 = this.typeAndOffsetAt(i);
                int i2 = this.numberAt(i);
                while (uEntry != null && this.extensionSchema.extensionNumber(uEntry) <= i2) {
                   this.extensionSchema.serializeExtension(p1, uEntry);
                   if (iterator.hasNext()) {
                      uEntry = iterator.next();
                   }else {
                      uEntry = null;
                   }
                }
                switch (MessageSchema.type(i1)){
                    case 0:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeDouble(i2, MessageSchema.doubleAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 1:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeFloat(i2, MessageSchema.floatAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 2:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeInt64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 3:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeUInt64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 4:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeInt32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 5:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeFixed64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 6:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeFixed32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 7:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeBool(i2, MessageSchema.booleanAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 8:
                      if (this.isFieldPresent(p0, i)) {
                         this.writeString(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      }
                      break;
                    case 9:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeMessage(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    case 10:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeBytes(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 11:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeUInt32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 12:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeEnum(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 13:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSFixed32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 14:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSFixed64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 15:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSInt32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 16:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSInt64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 17:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeGroup(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    case 18:
                      SchemaUtil.writeDoubleList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 19:
                      SchemaUtil.writeFloatList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 20:
                      SchemaUtil.writeInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 21:
                      SchemaUtil.writeUInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 22:
                      SchemaUtil.writeInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 23:
                      SchemaUtil.writeFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 24:
                      SchemaUtil.writeFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 25:
                      SchemaUtil.writeBoolList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 26:
                      SchemaUtil.writeStringList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      break;
                    case 27:
                      SchemaUtil.writeMessageList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, this.getMessageFieldSchema(i));
                      break;
                    case 28:
                      SchemaUtil.writeBytesList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      break;
                    case 29:
                      SchemaUtil.writeUInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 30:
                      SchemaUtil.writeEnumList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 31:
                      SchemaUtil.writeSFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case 32:
                      SchemaUtil.writeSFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case '!':
                      SchemaUtil.writeSInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case '"':
                      SchemaUtil.writeSInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, false);
                      break;
                    case '#':
                      SchemaUtil.writeDoubleList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '$':
                      SchemaUtil.writeFloatList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '%':
                      SchemaUtil.writeInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '&':
                      SchemaUtil.writeUInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case 39:
                      SchemaUtil.writeInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '(':
                      SchemaUtil.writeFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case ')':
                      SchemaUtil.writeFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '*':
                      SchemaUtil.writeBoolList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '+':
                      SchemaUtil.writeUInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case ',':
                      SchemaUtil.writeEnumList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '-':
                      SchemaUtil.writeSFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '.':
                      SchemaUtil.writeSFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '/':
                      SchemaUtil.writeSInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '0':
                      SchemaUtil.writeSInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '1':
                      SchemaUtil.writeGroupList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, this.getMessageFieldSchema(i));
                      break;
                    case '2':
                      this.writeMapHelper(p1, i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), i);
                      break;
                    case '3':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeDouble(i2, MessageSchema.oneofDoubleAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '4':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeFloat(i2, MessageSchema.oneofFloatAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '5':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeInt64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '6':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeUInt64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '7':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeInt32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '8':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeFixed64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '9':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeFixed32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case ':':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeBool(i2, MessageSchema.oneofBooleanAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case ';':
                      if (this.isOneofPresent(p0, i2, i)) {
                         this.writeString(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      }
                      break;
                    case '<':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeMessage(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    case '=':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeBytes(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '>':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeUInt32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '?':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeEnum(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '@':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSFixed32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'A':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSFixed64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'B':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSInt32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'C':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSInt64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'D':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeGroup(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    default:
                }
             label_0582 :
                i = i + 3;
             }
             while (uEntry != null) {
                this.extensionSchema.serializeExtension(p1, uEntry);
                if (iterator.hasNext()) {
                   uEntry = iterator.next();
                }else {
                   uEntry = null;
                }
             }
             this.writeUnknownInMessageTo(this.unknownFieldSchema, p0, p1);
             return;
          }
       }
       iterator = null;
       uEntry = iterator;
       goto label_001e ;
    }
    public final void writeFieldsInDescendingOrder(Object p0,Writer p1){
       Iterator iterator;
       Map$Entry uEntry;
       this.writeUnknownInMessageTo(this.unknownFieldSchema, p0, p1);
       if (this.hasExtensions != null) {
          FieldSet extensions = this.extensionSchema.getExtensions(p0);
          if (!extensions.isEmpty()) {
             iterator = extensions.descendingIterator();
             uEntry = iterator.next();
          label_0023 :
             int i = this.buffer.length - 3;
             while (i >= 0) {
                int i1 = this.typeAndOffsetAt(i);
                int i2 = this.numberAt(i);
                while (uEntry != null && this.extensionSchema.extensionNumber(uEntry) > i2) {
                   this.extensionSchema.serializeExtension(p1, uEntry);
                   if (iterator.hasNext()) {
                      uEntry = iterator.next();
                   }else {
                      uEntry = null;
                   }
                }
                boolean b = false;
                switch (MessageSchema.type(i1)){
                    case 0:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeDouble(i2, MessageSchema.doubleAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 1:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeFloat(i2, MessageSchema.floatAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 2:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeInt64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 3:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeUInt64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 4:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeInt32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 5:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeFixed64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 6:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeFixed32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 7:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeBool(i2, MessageSchema.booleanAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 8:
                      if (this.isFieldPresent(p0, i)) {
                         this.writeString(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      }
                      break;
                    case 9:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeMessage(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    case 10:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeBytes(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 11:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeUInt32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 12:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeEnum(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 13:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSFixed32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 14:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSFixed64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 15:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSInt32(i2, MessageSchema.intAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 16:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeSInt64(i2, MessageSchema.longAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 17:
                      if (this.isFieldPresent(p0, i)) {
                         p1.writeGroup(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    case 18:
                      SchemaUtil.writeDoubleList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 19:
                      SchemaUtil.writeFloatList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 20:
                      SchemaUtil.writeInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 21:
                      SchemaUtil.writeUInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 22:
                      SchemaUtil.writeInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 23:
                      SchemaUtil.writeFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 24:
                      SchemaUtil.writeFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 25:
                      SchemaUtil.writeBoolList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 26:
                      SchemaUtil.writeStringList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      break;
                    case 27:
                      SchemaUtil.writeMessageList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, this.getMessageFieldSchema(i));
                      break;
                    case 28:
                      SchemaUtil.writeBytesList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      break;
                    case 29:
                      SchemaUtil.writeUInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 30:
                      SchemaUtil.writeEnumList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 31:
                      SchemaUtil.writeSFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case 32:
                      SchemaUtil.writeSFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case '!':
                      SchemaUtil.writeSInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case '"':
                      SchemaUtil.writeSInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, b);
                      break;
                    case '#':
                      SchemaUtil.writeDoubleList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '$':
                      SchemaUtil.writeFloatList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '%':
                      SchemaUtil.writeInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '&':
                      SchemaUtil.writeUInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case 39:
                      SchemaUtil.writeInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '(':
                      SchemaUtil.writeFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case ')':
                      SchemaUtil.writeFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '*':
                      SchemaUtil.writeBoolList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '+':
                      SchemaUtil.writeUInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case ',':
                      SchemaUtil.writeEnumList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '-':
                      SchemaUtil.writeSFixed32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '.':
                      SchemaUtil.writeSFixed64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '/':
                      SchemaUtil.writeSInt32List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '0':
                      SchemaUtil.writeSInt64List(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, true);
                      break;
                    case '1':
                      SchemaUtil.writeGroupList(this.numberAt(i), UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1, this.getMessageFieldSchema(i));
                      break;
                    case '2':
                      this.writeMapHelper(p1, i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), i);
                      break;
                    case '3':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeDouble(i2, MessageSchema.oneofDoubleAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '4':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeFloat(i2, MessageSchema.oneofFloatAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '5':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeInt64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '6':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeUInt64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '7':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeInt32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '8':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeFixed64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '9':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeFixed32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case ':':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeBool(i2, MessageSchema.oneofBooleanAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case ';':
                      if (this.isOneofPresent(p0, i2, i)) {
                         this.writeString(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), p1);
                      }
                      break;
                    case '<':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeMessage(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    case '=':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeBytes(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '>':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeUInt32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '?':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeEnum(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case '@':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSFixed32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'A':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSFixed64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'B':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSInt32(i2, MessageSchema.oneofIntAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'C':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeSInt64(i2, MessageSchema.oneofLongAt(p0, MessageSchema.offset(i1)));
                      }
                      break;
                    case 'D':
                      if (this.isOneofPresent(p0, i2, i)) {
                         p1.writeGroup(i2, UnsafeUtil.getObject(p0, MessageSchema.offset(i1)), this.getMessageFieldSchema(i));
                      }
                      break;
                    default:
                }
             label_0588 :
                i = i - 3;
             }
             while (uEntry != null) {
                this.extensionSchema.serializeExtension(p1, uEntry);
                if (iterator.hasNext()) {
                   uEntry = iterator.next();
                }else {
                   uEntry = null;
                }
             }
             return;
          }
       }
       iterator = null;
       uEntry = iterator;
       goto label_0023 ;
    }
    public final void writeMapHelper(Writer p0,int p1,Object p2,int p3){
       if (p2 != null) {
          p0.writeMap(p1, this.mapFieldSchema.forMapMetadata(this.getMapFieldDefaultEntry(p3)), this.mapFieldSchema.forMapData(p2));
       }
       return;
    }
    public final void writeString(int p0,Object p1,Writer p2){
       if (p1 instanceof String) {
          p2.writeString(p0, p1);
       }else {
          p2.writeBytes(p0, p1);
       }
       return;
    }
    public void writeTo(Object p0,Writer p1){
       if (p1.fieldOrder() == Writer$FieldOrder.DESCENDING) {
          this.writeFieldsInDescendingOrder(p0, p1);
       }else if(this.proto3 != null){
          this.writeFieldsInAscendingOrderProto3(p0, p1);
       }else {
          this.writeFieldsInAscendingOrderProto2(p0, p1);
       }
       return;
    }
    public final void writeUnknownInMessageTo(UnknownFieldSchema p0,Object p1,Writer p2){
       p0.writeTo(p0.getFromMessage(p1), p2);
    }
}
