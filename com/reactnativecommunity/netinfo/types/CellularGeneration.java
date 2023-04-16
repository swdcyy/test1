package com.reactnativecommunity.netinfo.types.CellularGeneration;
import java.lang.Enum;
import java.lang.String;
import android.net.NetworkInfo;
import java.lang.Class;
import java.lang.Object;

public final class CellularGeneration extends Enum	// class@000b67
{
    public final String label;
    public static final CellularGeneration[] $VALUES;
    public static final CellularGeneration CG_2G;
    public static final CellularGeneration CG_3G;
    public static final CellularGeneration CG_4G;
    public static final CellularGeneration CG_5G;

    static {
       CellularGeneration uCellularGen = new CellularGeneration("CG_2G", 0, "2g");
       CellularGeneration.CG_2G = uCellularGen;
       CellularGeneration uCellularGen1 = new CellularGeneration("CG_3G", 1, "3g");
       CellularGeneration.CG_3G = uCellularGen1;
       CellularGeneration uCellularGen2 = new CellularGeneration("CG_4G", 2, "4g");
       CellularGeneration.CG_4G = uCellularGen2;
       CellularGeneration uCellularGen3 = new CellularGeneration("CG_5G", 3, "5g");
       CellularGeneration.CG_5G = uCellularGen3;
       CellularGeneration[] uCellularGen4 = new CellularGeneration[]{uCellularGen,uCellularGen1,uCellularGen2,uCellularGen3};
       CellularGeneration.$VALUES = uCellularGen4;
    }
    public void CellularGeneration(String p0,int p1,String p2){
       super(p0, p1);
       this.label = p2;
    }
    public static CellularGeneration fromNetworkInfo(NetworkInfo p0){
       if (p0 == null) {
          return null;
       }
       switch (p0.getSubtype()){
           case 1:
           case 4:
           case 7:
           case 11:
           case 16:
           case 2:
             return CellularGeneration.CG_2G;
           case 3:
           case 6:
           case 8:
           case 9:
           case 10:
           case 12:
           case 14:
           case 15:
           case 17:
           case 5:
             return CellularGeneration.CG_3G;
           case 13:
           case 19:
           case 18:
             return CellularGeneration.CG_4G;
           case 20:
             return CellularGeneration.CG_5G;
           default:
             return null;
       }
    }
    public static CellularGeneration valueOf(String p0){
       return Enum.valueOf(CellularGeneration.class, p0);
    }
    public static CellularGeneration[] values(){
       return CellularGeneration.$VALUES.clone();
    }
}
