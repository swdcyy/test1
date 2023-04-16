package com.amap.api.location.CoordinateConverter$CoordType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoordinateConverter$CoordType extends Enum	// class@000ed5
{
    public static final CoordinateConverter$CoordType ALIYUN;
    public static final CoordinateConverter$CoordType BAIDU;
    public static final CoordinateConverter$CoordType GOOGLE;
    public static final CoordinateConverter$CoordType GPS;
    public static final CoordinateConverter$CoordType MAPABC;
    public static final CoordinateConverter$CoordType MAPBAR;
    public static final CoordinateConverter$CoordType SOSOMAP;
    public static final CoordinateConverter$CoordType[] a;

    static {
       CoordinateConverter$CoordType uCoordType = new CoordinateConverter$CoordType("BAIDU", 0);
       CoordinateConverter$CoordType.BAIDU = uCoordType;
       CoordinateConverter$CoordType uCoordType1 = new CoordinateConverter$CoordType("MAPBAR", 1);
       CoordinateConverter$CoordType.MAPBAR = uCoordType1;
       CoordinateConverter$CoordType uCoordType2 = new CoordinateConverter$CoordType("MAPABC", 2);
       CoordinateConverter$CoordType.MAPABC = uCoordType2;
       CoordinateConverter$CoordType uCoordType3 = new CoordinateConverter$CoordType("SOSOMAP", 3);
       CoordinateConverter$CoordType.SOSOMAP = uCoordType3;
       CoordinateConverter$CoordType uCoordType4 = new CoordinateConverter$CoordType("ALIYUN", 4);
       CoordinateConverter$CoordType.ALIYUN = uCoordType4;
       CoordinateConverter$CoordType uCoordType5 = new CoordinateConverter$CoordType("GOOGLE", 5);
       CoordinateConverter$CoordType.GOOGLE = uCoordType5;
       CoordinateConverter$CoordType uCoordType6 = new CoordinateConverter$CoordType("GPS", 6);
       CoordinateConverter$CoordType.GPS = uCoordType6;
       CoordinateConverter$CoordType[] uCoordTypeAr = new CoordinateConverter$CoordType[]{uCoordType,uCoordType1,uCoordType2,uCoordType3,uCoordType4,uCoordType5,uCoordType6};
       CoordinateConverter$CoordType.a = uCoordTypeAr;
    }
    public void CoordinateConverter$CoordType(String p0,int p1){
       super(p0, p1);
    }
    public static CoordinateConverter$CoordType valueOf(String p0){
       return Enum.valueOf(CoordinateConverter$CoordType.class, p0);
    }
    public static CoordinateConverter$CoordType[] values(){
       return CoordinateConverter$CoordType.a.clone();
    }
}
