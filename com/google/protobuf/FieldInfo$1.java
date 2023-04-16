package com.google.protobuf.FieldInfo$1;
import com.google.protobuf.FieldType;
import java.lang.Enum;

public class FieldInfo$1	// class@00041b
{
    public static final int[] $SwitchMap$com$google$protobuf$FieldType;

    static {
       int[] ointArray = new int[FieldType.values().length];
       try{
          FieldInfo$1.$SwitchMap$com$google$protobuf$FieldType = ointArray;
          ointArray[FieldType.MESSAGE.ordinal()] = 1;
          try{
             FieldInfo$1.$SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP.ordinal()] = 2;
             try{
                FieldInfo$1.$SwitchMap$com$google$protobuf$FieldType[FieldType.MESSAGE_LIST.ordinal()] = 3;
                try{
                   FieldInfo$1.$SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP_LIST.ordinal()] = 4;
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
