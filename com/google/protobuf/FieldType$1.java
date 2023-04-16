package com.google.protobuf.FieldType$1;
import com.google.protobuf.JavaType;
import java.lang.Enum;
import com.google.protobuf.FieldType$Collection;

public class FieldType$1	// class@000428
{
    public static final int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
    public static final int[] $SwitchMap$com$google$protobuf$JavaType;

    static {
       int[] ointArray = new int[JavaType.values().length];
       FieldType$1.$SwitchMap$com$google$protobuf$JavaType = ointArray;
       try{
          int i = 1;
          ointArray[JavaType.BYTE_STRING.ordinal()] = i;
          int i1 = 2;
          try{
             FieldType$1.$SwitchMap$com$google$protobuf$JavaType[JavaType.MESSAGE.ordinal()] = i1;
             int i2 = 3;
             try{
                FieldType$1.$SwitchMap$com$google$protobuf$JavaType[JavaType.STRING.ordinal()] = i2;
                int[] ointArray1 = new int[FieldType$Collection.values().length];
                try{
                   FieldType$1.$SwitchMap$com$google$protobuf$FieldType$Collection = ointArray1;
                   ointArray1[FieldType$Collection.MAP.ordinal()] = i;
                   try{
                      FieldType$1.$SwitchMap$com$google$protobuf$FieldType$Collection[FieldType$Collection.VECTOR.ordinal()] = e0;
                      try{
                         FieldType$1.$SwitchMap$com$google$protobuf$FieldType$Collection[FieldType$Collection.SCALAR.ordinal()] = i2;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
