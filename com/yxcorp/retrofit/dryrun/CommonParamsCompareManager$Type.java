package com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CommonParamsCompareManager$Type extends Enum	// class@000961
{
    public static final CommonParamsCompareManager$Type[] $VALUES;
    public static final CommonParamsCompareManager$Type REQUEST_HEADERS;
    public static final CommonParamsCompareManager$Type REQUEST_PARAMS;

    static {
       CommonParamsCompareManager$Type type = new CommonParamsCompareManager$Type("REQUEST_PARAMS", 0);
       CommonParamsCompareManager$Type.REQUEST_PARAMS = type;
       CommonParamsCompareManager$Type type1 = new CommonParamsCompareManager$Type("REQUEST_HEADERS", 1);
       CommonParamsCompareManager$Type.REQUEST_HEADERS = type1;
       CommonParamsCompareManager$Type[] typeArray = new CommonParamsCompareManager$Type[]{type,type1};
       CommonParamsCompareManager$Type.$VALUES = typeArray;
    }
    public void CommonParamsCompareManager$Type(String p0,int p1){
       super(p0, p1);
    }
    public static CommonParamsCompareManager$Type valueOf(String p0){
       return Enum.valueOf(CommonParamsCompareManager$Type.class, p0);
    }
    public static CommonParamsCompareManager$Type[] values(){
       return CommonParamsCompareManager$Type.$VALUES.clone();
    }
}
