package com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType;
import java.lang.Enum;
import java.lang.String;

public final class HwAudioKit$FeatureType extends Enum	// class@0006cb
{
    public int b;
    public static final HwAudioKit$FeatureType a;
    public static final HwAudioKit$FeatureType[] c;

    static {
       HwAudioKit$FeatureType uFeatureType = new HwAudioKit$FeatureType("HWAUDIO_FEATURE_KARAOKE", 0, 1);
       HwAudioKit$FeatureType.a = uFeatureType;
       HwAudioKit$FeatureType[] uFeatureType1 = new HwAudioKit$FeatureType[]{uFeatureType};
       HwAudioKit$FeatureType.c = uFeatureType1;
    }
    public void HwAudioKit$FeatureType(String p0,int p1,int p2){
       super(p0, p1);
       this.b = p2;
    }
    public int a(){
       return this.b;
    }
}
