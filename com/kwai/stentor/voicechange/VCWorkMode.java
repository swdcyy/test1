package com.kwai.stentor.voicechange.VCWorkMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class VCWorkMode extends Enum	// class@00190e
{
    public int value;
    public static final VCWorkMode[] $VALUES;
    public static final VCWorkMode VCWorkModeClean;
    public static final VCWorkMode VCWorkModeModify;
    public static final VCWorkMode VCWorkModeNormal;
    public static final VCWorkMode VCWorkModeUnknown;

    static {
       VCWorkMode vCWorkMode = new VCWorkMode("VCWorkModeNormal", 0, 0);
       VCWorkMode.VCWorkModeNormal = vCWorkMode;
       VCWorkMode vCWorkMode1 = new VCWorkMode("VCWorkModeClean", 1, 1);
       VCWorkMode.VCWorkModeClean = vCWorkMode1;
       VCWorkMode vCWorkMode2 = new VCWorkMode("VCWorkModeModify", 2, 2);
       VCWorkMode.VCWorkModeModify = vCWorkMode2;
       VCWorkMode vCWorkMode3 = new VCWorkMode("VCWorkModeUnknown", 3, -1);
       VCWorkMode.VCWorkModeUnknown = vCWorkMode3;
       VCWorkMode[] vCWorkModeAr = new VCWorkMode[]{vCWorkMode,vCWorkMode1,vCWorkMode2,vCWorkMode3};
       VCWorkMode.$VALUES = vCWorkModeAr;
    }
    public void VCWorkMode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static VCWorkMode valueOf(String p0){
       return Enum.valueOf(VCWorkMode.class, p0);
    }
    public static VCWorkMode[] values(){
       return VCWorkMode.$VALUES.clone();
    }
    public VCWorkMode fromValue(int p0){
       if (!p0) {
          return VCWorkMode.VCWorkModeNormal;
       }
       if (p0 == 1) {
          return VCWorkMode.VCWorkModeClean;
       }
       if (p0 != 2) {
          return VCWorkMode.VCWorkModeUnknown;
       }
       return VCWorkMode.VCWorkModeModify;
    }
    public int value(){
       return this.value;
    }
}
