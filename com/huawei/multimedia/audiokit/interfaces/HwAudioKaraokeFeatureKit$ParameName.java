package com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName;
import java.lang.Enum;
import java.lang.String;

public final class HwAudioKaraokeFeatureKit$ParameName extends Enum	// class@0006c7
{
    public String d;
    public static final HwAudioKaraokeFeatureKit$ParameName a;
    public static final HwAudioKaraokeFeatureKit$ParameName b;
    public static final HwAudioKaraokeFeatureKit$ParameName c;
    public static final HwAudioKaraokeFeatureKit$ParameName[] e;

    static {
       HwAudioKaraokeFeatureKit$ParameName parameName = new HwAudioKaraokeFeatureKit$ParameName("CMD_SET_AUDIO_EFFECT_MODE_BASE", 0, "Karaoke_reverb_mode=");
       HwAudioKaraokeFeatureKit$ParameName.a = parameName;
       HwAudioKaraokeFeatureKit$ParameName parameName1 = new HwAudioKaraokeFeatureKit$ParameName("CMD_SET_VOCAL_VOLUME_BASE", 1, "Karaoke_volume=");
       HwAudioKaraokeFeatureKit$ParameName.b = parameName1;
       HwAudioKaraokeFeatureKit$ParameName parameName2 = new HwAudioKaraokeFeatureKit$ParameName("CMD_SET_VOCAL_EQUALIZER_MODE", 2, "Karaoke_eq_mode=");
       HwAudioKaraokeFeatureKit$ParameName.c = parameName2;
       HwAudioKaraokeFeatureKit$ParameName[] parameNameAr = new HwAudioKaraokeFeatureKit$ParameName[]{parameName,parameName1,parameName2};
       HwAudioKaraokeFeatureKit$ParameName.e = parameNameAr;
    }
    public void HwAudioKaraokeFeatureKit$ParameName(String p0,int p1,String p2){
       super(p0, p1);
       this.d = p2;
    }
    public String a(){
       return this.d;
    }
}
