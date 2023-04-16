package com.google.protobuf.FieldType;
import java.lang.Enum;
import com.google.protobuf.FieldType$Collection;
import com.google.protobuf.JavaType;
import java.lang.String;
import java.lang.reflect.Type;
import com.google.protobuf.FieldType$1;
import java.lang.Class;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.lang.reflect.TypeVariable;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.reflect.Field;

public final class FieldType extends Enum	// class@00042a
{
    public final FieldType$Collection collection;
    public final Class elementType;
    public final int id;
    public final JavaType javaType;
    public final boolean primitiveScalar;
    public static final FieldType[] $VALUES;
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    public static final Type[] EMPTY_TYPES;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;
    public static final FieldType[] VALUES;

    static {
       JavaType dOUBLE = JavaType.DOUBLE;
       FieldType$Collection uCollection = FieldType$Collection.SCALAR;
       FieldType uFieldType = new FieldType("DOUBLE", 0, 0, uCollection, dOUBLE);
       FieldType.DOUBLE = v6;
       JavaType fLOAT = JavaType.FLOAT;
       uFieldType = new FieldType("FLOAT", 1, 1, uCollection, fLOAT);
       FieldType.FLOAT = v9;
       JavaType lONG = JavaType.LONG;
       JavaType javaType = lONG;
       uFieldType = new FieldType("INT64", 2, 2, uCollection, javaType);
       FieldType.INT64 = v11;
       uFieldType = new FieldType("UINT64", 3, 3, uCollection, javaType);
       FieldType.UINT64 = v13;
       JavaType iNT = JavaType.INT;
       uFieldType = new FieldType("INT32", 4, 4, uCollection, iNT);
       FieldType.INT32 = v14;
       uFieldType = new FieldType("FIXED64", 5, 5, uCollection, lONG);
       FieldType.FIXED64 = v16;
       uFieldType = new FieldType("FIXED32", 6, 6, uCollection, iNT);
       FieldType.FIXED32 = v17;
       JavaType bOOLEAN = JavaType.BOOLEAN;
       uFieldType = new FieldType("BOOL", 7, 7, uCollection, bOOLEAN);
       FieldType.BOOL = v18;
       JavaType sTRING = JavaType.STRING;
       uFieldType = new FieldType("STRING", 8, 8, uCollection, sTRING);
       FieldType.STRING = v20;
       JavaType mESSAGE = JavaType.MESSAGE;
       uFieldType = new FieldType("MESSAGE", 9, 9, uCollection, mESSAGE);
       FieldType.MESSAGE = v22;
       JavaType bYTE_STRING = JavaType.BYTE_STRING;
       uFieldType = new FieldType("BYTES", 10, 10, uCollection, bYTE_STRING);
       FieldType.BYTES = v24;
       uFieldType = new FieldType("UINT32", 11, 11, uCollection, iNT);
       FieldType.UINT32 = v26;
       JavaType eNUM = JavaType.ENUM;
       uFieldType = new FieldType("ENUM", 12, 12, uCollection, eNUM);
       FieldType.ENUM = v27;
       uFieldType = new FieldType("SFIXED32", 13, 13, uCollection, iNT);
       FieldType.SFIXED32 = v29;
       uFieldType = new FieldType("SFIXED64", 14, 14, uCollection, lONG);
       FieldType.SFIXED64 = v30;
       uFieldType = new FieldType("SINT32", 15, 15, uCollection, iNT);
       FieldType.SINT32 = v31;
       uFieldType = new FieldType("SINT64", 16, 16, uCollection, lONG);
       FieldType.SINT64 = v32;
       uFieldType = new FieldType("GROUP", 17, 17, uCollection, mESSAGE);
       FieldType.GROUP = v33;
       FieldType$Collection vECTOR = FieldType$Collection.VECTOR;
       uCollection = vECTOR;
       uFieldType = new FieldType("DOUBLE_LIST", 18, 18, uCollection, dOUBLE);
       FieldType.DOUBLE_LIST = v7;
       uFieldType = new FieldType("FLOAT_LIST", 19, 19, uCollection, fLOAT);
       FieldType.FLOAT_LIST = v35;
       javaType = lONG;
       uFieldType = new FieldType("INT64_LIST", 20, 20, uCollection, javaType);
       FieldType.INT64_LIST = v36;
       uFieldType = new FieldType("UINT64_LIST", 21, 21, uCollection, javaType);
       FieldType.UINT64_LIST = v37;
       uFieldType = new FieldType("INT32_LIST", 22, 22, uCollection, iNT);
       FieldType.INT32_LIST = v38;
       uFieldType = new FieldType("FIXED64_LIST", 23, 23, uCollection, lONG);
       FieldType.FIXED64_LIST = v39;
       uFieldType = new FieldType("FIXED32_LIST", 24, 24, uCollection, iNT);
       FieldType.FIXED32_LIST = v40;
       uFieldType = new FieldType("BOOL_LIST", 25, 25, uCollection, bOOLEAN);
       FieldType.BOOL_LIST = v41;
       uFieldType = new FieldType("STRING_LIST", 26, 26, uCollection, sTRING);
       FieldType.STRING_LIST = v42;
       uFieldType = new FieldType("MESSAGE_LIST", 27, 27, uCollection, mESSAGE);
       FieldType.MESSAGE_LIST = sTRING;
       uFieldType = new FieldType("BYTES_LIST", 28, 28, uCollection, bYTE_STRING);
       FieldType.BYTES_LIST = v43;
       uFieldType = new FieldType("UINT32_LIST", 29, 29, uCollection, iNT);
       FieldType.UINT32_LIST = bYTE_STRING;
       uFieldType = new FieldType("ENUM_LIST", 30, 30, uCollection, eNUM);
       FieldType.ENUM_LIST = v44;
       uFieldType = new FieldType("SFIXED32_LIST", 31, 31, uCollection, iNT);
       FieldType.SFIXED32_LIST = v45;
       uFieldType = new FieldType("SFIXED64_LIST", 32, 32, uCollection, lONG);
       FieldType.SFIXED64_LIST = v46;
       uFieldType = new FieldType("SINT32_LIST", 33, 33, uCollection, iNT);
       FieldType.SINT32_LIST = v47;
       uFieldType = new FieldType("SINT64_LIST", 34, 34, uCollection, lONG);
       FieldType.SINT64_LIST = v48;
       uCollection = FieldType$Collection.PACKED_VECTOR;
       uFieldType = new FieldType("DOUBLE_LIST_PACKED", 35, 35, uCollection, dOUBLE);
       FieldType.DOUBLE_LIST_PACKED = v49;
       uFieldType = new FieldType("FLOAT_LIST_PACKED", 36, 36, uCollection, fLOAT);
       FieldType.FLOAT_LIST_PACKED = dOUBLE;
       javaType = lONG;
       uFieldType = new FieldType("INT64_LIST_PACKED", 37, 37, uCollection, javaType);
       FieldType.INT64_LIST_PACKED = fLOAT;
       uFieldType = new FieldType("UINT64_LIST_PACKED", 38, 38, uCollection, javaType);
       FieldType.UINT64_LIST_PACKED = v51;
       uFieldType = new FieldType("INT32_LIST_PACKED", 39, 39, uCollection, iNT);
       FieldType.INT32_LIST_PACKED = v52;
       uFieldType = new FieldType("FIXED64_LIST_PACKED", 40, 40, uCollection, lONG);
       FieldType.FIXED64_LIST_PACKED = v53;
       uFieldType = new FieldType("FIXED32_LIST_PACKED", 41, 41, uCollection, iNT);
       FieldType.FIXED32_LIST_PACKED = v54;
       uFieldType = new FieldType("BOOL_LIST_PACKED", 42, 42, uCollection, bOOLEAN);
       FieldType.BOOL_LIST_PACKED = v55;
       uFieldType = new FieldType("UINT32_LIST_PACKED", 43, 43, uCollection, iNT);
       FieldType.UINT32_LIST_PACKED = bOOLEAN;
       uFieldType = new FieldType("ENUM_LIST_PACKED", 44, 44, uCollection, eNUM);
       FieldType.ENUM_LIST_PACKED = v56;
       uFieldType = new FieldType("SFIXED32_LIST_PACKED", 45, 45, uCollection, iNT);
       FieldType.SFIXED32_LIST_PACKED = eNUM;
       uFieldType = new FieldType("SFIXED64_LIST_PACKED", 46, 46, uCollection, lONG);
       FieldType.SFIXED64_LIST_PACKED = v57;
       uFieldType = new FieldType("SINT32_LIST_PACKED", 47, 47, uCollection, iNT);
       FieldType.SINT32_LIST_PACKED = v58;
       uFieldType = new FieldType("SINT64_LIST_PACKED", 48, 48, uCollection, lONG);
       FieldType.SINT64_LIST_PACKED = iNT;
       uFieldType = new FieldType("GROUP_LIST", 49, 49, vECTOR, mESSAGE);
       FieldType.GROUP_LIST = lONG;
       FieldType uFieldType1 = new FieldType("MAP", 50, 50, FieldType$Collection.MAP, JavaType.VOID);
       FieldType.MAP = uFieldType;
       FieldType[] uFieldTypeAr = new FieldType[51];
       int i = 0;
       uFieldTypeAr[i] = v6;
       uFieldTypeAr[1] = v9;
       uFieldTypeAr[2] = v11;
       uFieldTypeAr[3] = v13;
       uFieldTypeAr[4] = v14;
       uFieldTypeAr[5] = v16;
       uFieldTypeAr[6] = v17;
       uFieldTypeAr[7] = v18;
       uFieldTypeAr[8] = v20;
       uFieldTypeAr[9] = v22;
       uFieldTypeAr[10] = v24;
       uFieldTypeAr[11] = v26;
       uFieldTypeAr[12] = v27;
       uFieldTypeAr[13] = v29;
       uFieldTypeAr[14] = v30;
       uFieldTypeAr[15] = v31;
       uFieldTypeAr[16] = v32;
       uFieldTypeAr[17] = v33;
       uFieldTypeAr[18] = v7;
       uFieldTypeAr[19] = v35;
       uFieldTypeAr[20] = v36;
       uFieldTypeAr[21] = v37;
       uFieldTypeAr[22] = v38;
       uFieldTypeAr[23] = v39;
       uFieldTypeAr[24] = v40;
       uFieldTypeAr[25] = v41;
       uFieldTypeAr[26] = v42;
       uFieldTypeAr[27] = sTRING;
       uFieldTypeAr[28] = v43;
       uFieldTypeAr[29] = bYTE_STRING;
       uFieldTypeAr[30] = v44;
       uFieldTypeAr[31] = v45;
       uFieldTypeAr[32] = v46;
       uFieldTypeAr[33] = v47;
       uFieldTypeAr[34] = v48;
       uFieldTypeAr[35] = v49;
       uFieldTypeAr[36] = dOUBLE;
       uFieldTypeAr[37] = fLOAT;
       uFieldTypeAr[38] = v51;
       uFieldTypeAr[39] = v52;
       uFieldTypeAr[40] = v53;
       uFieldTypeAr[41] = v54;
       uFieldTypeAr[42] = v55;
       uFieldTypeAr[43] = bOOLEAN;
       uFieldTypeAr[44] = v56;
       uFieldTypeAr[45] = eNUM;
       uFieldTypeAr[46] = v57;
       uFieldTypeAr[47] = v58;
       uFieldTypeAr[48] = iNT;
       uFieldTypeAr[49] = lONG;
       uFieldTypeAr[50] = uFieldType;
       FieldType.$VALUES = uFieldTypeAr;
       Type[] typeArray = new Type[i];
       FieldType.EMPTY_TYPES = typeArray;
       FieldType[] uFieldTypeAr1 = FieldType.values();
       uFieldTypeAr = new FieldType[uFieldTypeAr1.length];
       FieldType.VALUES = uFieldTypeAr;
       int len = uFieldTypeAr1.length;
       for (; i < len; i = i + 1) {
          object oobject = uFieldTypeAr1[i];
          FieldType.VALUES[oobject.id] = oobject;
       }
    }
    public void FieldType(String p0,int p1,int p2,FieldType$Collection p3,JavaType p4){
       super(p0, p1);
       this.id = p2;
       this.collection = p3;
       this.javaType = p4;
       int i = FieldType$1.$SwitchMap$com$google$protobuf$FieldType$Collection[p3.ordinal()];
       p1 = 2;
       boolean b = true;
       if (i != b) {
          this.elementType = (i != p1)? null: p4.getBoxedType();
       }else {
          this.elementType = p4.getBoxedType();
       }
       if (p3 == FieldType$Collection.SCALAR) {
          int i1 = FieldType$1.$SwitchMap$com$google$protobuf$JavaType[p4.ordinal()];
          if (i1 != b && (i1 != p1 && i1 != 3)) {
          label_003e :
             this.primitiveScalar = b;
             return;
          }
       }
       b = false;
       goto label_003e ;
    }
    public static FieldType forId(int p0){
       if (p0 >= 0) {
          FieldType[] vALUES = FieldType.VALUES;
          if (p0 < vALUES.length) {
             return vALUES[p0];
          }
       }
       return null;
    }
    public static Type getGenericSuperList(Class p0){
       object oobject;
       Type[] genericInter = p0.getGenericInterfaces();
       int len = genericInter.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = genericInter[i];
             if (oobject instanceof ParameterizedType && List.class.isAssignableFrom(oobject.getRawType())) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             Type genericSuper = p0.getGenericSuperclass();
             if (genericSuper instanceof ParameterizedType && List.class.isAssignableFrom(genericSuper.getRawType())) {
                return genericSuper;
             }
             return null;
          }
       }
       return oobject;
    }
    public static Type getListParameter(Class p0,Type[] p1){
       while (true) {
          int i = 0;
          int i1 = 1;
          if (p0 != List.class) {
             Type genericSuper = FieldType.getGenericSuperList(p0);
             if (genericSuper instanceof ParameterizedType) {
                Type[] actualTypeAr = genericSuper.getActualTypeArguments();
                int i2 = 0;
                while (true) {
                   if (i2 < actualTypeAr.length) {
                      object oobject = actualTypeAr[i2];
                      if (oobject instanceof TypeVariable) {
                         TypeVariable[] typeParamete = p0.getTypeParameters();
                         if (p1.length == typeParamete.length) {
                            int i3 = 0;
                            while (true) {
                               if (i3 < typeParamete.length) {
                                  if (oobject == typeParamete[i3]) {
                                     actualTypeAr[i2] = p1[i3];
                                     typeParamete = 1;
                                  label_0038 :
                                     if (!typeParamete) {
                                        break ;
                                     }
                                  }else {
                                     i3 = i3 + 1;
                                  }
                               }else {
                                  typeParamete = 0;
                                  goto label_0038 ;
                               }
                            }
                            throw new RuntimeException("Unable to find replacement for "+oobject);
                         }else {
                            throw new RuntimeException("Type array mismatch");
                         }
                      }
                      i2 = i2 + 1;
                   }else {
                      p0 = genericSuper.getRawType();
                      p1 = actualTypeAr;
                   }
                }
             }else {
                p1 = FieldType.EMPTY_TYPES;
                Class[] interfaces = p0.getInterfaces();
                i1 = interfaces.length;
                while (true) {
                   if (i < i1) {
                      object oobject1 = interfaces[i];
                      if (List.class.isAssignableFrom(oobject1)) {
                         object oobject2 = oobject1;
                      }else {
                         i = i + 1;
                      }
                   }else {
                      p0 = p0.getSuperclass();
                      continue ;
                   }
                }
             }
          }else if(p1.length == i1){
             return p1[i];
          }else {
             throw new RuntimeException("Unable to identify parameter type for List<T>");
          }
       }
    }
    public static FieldType valueOf(String p0){
       return Enum.valueOf(FieldType.class, p0);
    }
    public static FieldType[] values(){
       return FieldType.$VALUES.clone();
    }
    public JavaType getJavaType(){
       return this.javaType;
    }
    public int id(){
       return this.id;
    }
    public boolean isList(){
       return this.collection.isList();
    }
    public boolean isMap(){
       boolean b = (this.collection == FieldType$Collection.MAP)? true: false;
       return b;
    }
    public boolean isPacked(){
       return FieldType$Collection.PACKED_VECTOR.equals(this.collection);
    }
    public boolean isPrimitiveScalar(){
       return this.primitiveScalar;
    }
    public boolean isScalar(){
       boolean b = (this.collection == FieldType$Collection.SCALAR)? true: false;
       return b;
    }
    public boolean isValidForField(Field p0){
       if (FieldType$Collection.VECTOR.equals(this.collection)) {
          return this.isValidForList(p0);
       }
       return this.javaType.getType().isAssignableFrom(p0.getType());
    }
    public final boolean isValidForList(Field p0){
       Class type = p0.getType();
       if (!this.javaType.getType().isAssignableFrom(type)) {
          return false;
       }
       Type[] eMPTY_TYPES = FieldType.EMPTY_TYPES;
       if (p0.getGenericType() instanceof ParameterizedType) {
          eMPTY_TYPES = p0.getGenericType().getActualTypeArguments();
       }
       Type listParamete = FieldType.getListParameter(type, eMPTY_TYPES);
       if (!listParamete instanceof Class) {
          return true;
       }else {
          return this.elementType.isAssignableFrom(listParamete);
       }
    }
}
