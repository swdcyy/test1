package com.kwai.sdk.eve.internal.nn.api.DataType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import nn7.a;
import kotlin.NoWhenBranchMatchedException;

public final class DataType extends Enum	// class@00157a
{
    public final int value;
    public static final DataType[] $VALUES;
    public static final DataType BOOL;
    public static final DataType FLOAT32;
    public static final DataType INT32;
    public static final DataType INT64;
    public static final DataType INT8;
    public static final DataType STRING;
    public static final DataType UINT8;

    static {
       DataType uDataType;
       DataType[] uDataTypeArr = new DataType[]{uDataType,uDataType,uDataType,uDataType,uDataType,uDataType,uDataType};
       uDataType = new DataType("FLOAT32", 0, 1);
       DataType.FLOAT32 = uDataType;
       uDataType = new DataType("INT32", 1, 2);
       DataType.INT32 = uDataType;
       uDataType = new DataType("UINT8", 2, 3);
       DataType.UINT8 = uDataType;
       uDataType = new DataType("INT64", 3, 4);
       DataType.INT64 = uDataType;
       uDataType = new DataType("STRING", 4, 5);
       DataType.STRING = uDataType;
       uDataType = new DataType("BOOL", 5, 6);
       DataType.BOOL = uDataType;
       uDataType = new DataType("INT8", 6, 9);
       DataType.INT8 = uDataType;
       DataType.$VALUES = uDataTypeArr;
    }
    public void DataType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static DataType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DataType.class, p0);
    }
    public static DataType[] values(){
       Object obj = PatchProxy.apply(null, null, DataType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataType.$VALUES.clone();
    }
    public final int byteSize(){
       Object obj = PatchProxy.apply(null, this, DataType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       switch (a.a[this.ordinal()]){
           case 1:
           case 2:
             i = 4;
             break;
           case 3:
           case 4:
             i = 1;
             break;
           case 5:
             i = 8;
             break;
           case 6:
           case 7:
           default:
             throw new NoWhenBranchMatchedException();
       }
       return i;
    }
    public final int getValue(){
       return this.value;
    }
}
