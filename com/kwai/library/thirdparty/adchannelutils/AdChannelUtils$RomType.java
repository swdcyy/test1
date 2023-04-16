package com.kwai.library.thirdparty.adchannelutils.AdChannelUtils$RomType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AdChannelUtils$RomType extends Enum	// class@000902
{
    public int mType;
    public static final AdChannelUtils$RomType[] $VALUES;
    public static final AdChannelUtils$RomType HUAWEI;
    public static final AdChannelUtils$RomType OPPO;
    public static final AdChannelUtils$RomType UNKNOWN;
    public static final AdChannelUtils$RomType VIVO;

    static {
       AdChannelUtils$RomType romType = new AdChannelUtils$RomType("UNKNOWN", 0, 0);
       AdChannelUtils$RomType.UNKNOWN = romType;
       AdChannelUtils$RomType romType1 = new AdChannelUtils$RomType("VIVO", 1, 1);
       AdChannelUtils$RomType.VIVO = romType1;
       AdChannelUtils$RomType romType2 = new AdChannelUtils$RomType("HUAWEI", 2, 2);
       AdChannelUtils$RomType.HUAWEI = romType2;
       AdChannelUtils$RomType romType3 = new AdChannelUtils$RomType("OPPO", 3, 3);
       AdChannelUtils$RomType.OPPO = romType3;
       AdChannelUtils$RomType[] romTypeArray = new AdChannelUtils$RomType[]{romType,romType1,romType2,romType3};
       AdChannelUtils$RomType.$VALUES = romTypeArray;
    }
    public void AdChannelUtils$RomType(String p0,int p1,int p2){
       super(p0, p1);
       this.mType = p2;
    }
    public static AdChannelUtils$RomType valueOf(String p0){
       return Enum.valueOf(AdChannelUtils$RomType.class, p0);
    }
    public static AdChannelUtils$RomType[] values(){
       return AdChannelUtils$RomType.$VALUES.clone();
    }
    public int getType(){
       return this.mType;
    }
}
