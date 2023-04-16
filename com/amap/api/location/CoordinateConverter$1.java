package com.amap.api.location.CoordinateConverter$1;
import com.amap.api.location.CoordinateConverter$CoordType;
import java.lang.Enum;

public final class CoordinateConverter$1	// class@000ed4
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CoordinateConverter$CoordType.values().length];
       try{
          CoordinateConverter$1.a = ointArray;
          ointArray[CoordinateConverter$CoordType.BAIDU.ordinal()] = 1;
          try{
             CoordinateConverter$1.a[CoordinateConverter$CoordType.MAPBAR.ordinal()] = 2;
             try{
                CoordinateConverter$1.a[CoordinateConverter$CoordType.MAPABC.ordinal()] = 3;
                try{
                   CoordinateConverter$1.a[CoordinateConverter$CoordType.SOSOMAP.ordinal()] = 4;
                   try{
                      CoordinateConverter$1.a[CoordinateConverter$CoordType.ALIYUN.ordinal()] = 5;
                      try{
                         CoordinateConverter$1.a[CoordinateConverter$CoordType.GOOGLE.ordinal()] = 6;
                         try{
                            CoordinateConverter$1.a[CoordinateConverter$CoordType.GPS.ordinal()] = 7;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
