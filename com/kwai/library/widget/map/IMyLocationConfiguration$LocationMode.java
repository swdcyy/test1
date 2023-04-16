package com.kwai.library.widget.map.IMyLocationConfiguration$LocationMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IMyLocationConfiguration$LocationMode extends Enum	// class@000963
{
    public static final IMyLocationConfiguration$LocationMode[] $VALUES;
    public static final IMyLocationConfiguration$LocationMode COMPASS;
    public static final IMyLocationConfiguration$LocationMode FOLLOWING;
    public static final IMyLocationConfiguration$LocationMode NORMAL;

    static {
       IMyLocationConfiguration$LocationMode locationMode = new IMyLocationConfiguration$LocationMode("NORMAL", 0);
       IMyLocationConfiguration$LocationMode.NORMAL = locationMode;
       IMyLocationConfiguration$LocationMode locationMode1 = new IMyLocationConfiguration$LocationMode("FOLLOWING", 1);
       IMyLocationConfiguration$LocationMode.FOLLOWING = locationMode1;
       IMyLocationConfiguration$LocationMode locationMode2 = new IMyLocationConfiguration$LocationMode("COMPASS", 2);
       IMyLocationConfiguration$LocationMode.COMPASS = locationMode2;
       IMyLocationConfiguration$LocationMode[] locationMode3 = new IMyLocationConfiguration$LocationMode[]{locationMode,locationMode1,locationMode2};
       IMyLocationConfiguration$LocationMode.$VALUES = locationMode3;
    }
    public void IMyLocationConfiguration$LocationMode(String p0,int p1){
       super(p0, p1);
    }
    public static IMyLocationConfiguration$LocationMode valueOf(String p0){
       return Enum.valueOf(IMyLocationConfiguration$LocationMode.class, p0);
    }
    public static IMyLocationConfiguration$LocationMode[] values(){
       return IMyLocationConfiguration$LocationMode.$VALUES.clone();
    }
}
