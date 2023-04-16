package com.yxcorp.gifshow.album.vm.viewdata.DataType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DataType extends Enum	// class@001b01
{
    public static final DataType[] $VALUES;
    public static final DataType CUSTOM;
    public static final DataType IMAGE;
    public static final DataType VIDEO;

    static {
       DataType uDataType;
       DataType[] uDataTypeArr = new DataType[]{uDataType,uDataType,uDataType};
       uDataType = new DataType("IMAGE", 0);
       DataType.IMAGE = uDataType;
       uDataType = new DataType("VIDEO", 1);
       DataType.VIDEO = uDataType;
       uDataType = new DataType("CUSTOM", 2);
       DataType.CUSTOM = uDataType;
       DataType.$VALUES = uDataTypeArr;
    }
    public void DataType(String p0,int p1){
       super(p0, p1);
    }
    public static DataType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DataType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DataType.class, p0);
    }
    public static DataType[] values(){
       Object obj = PatchProxy.apply(null, null, DataType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DataType.$VALUES.clone();
    }
}
