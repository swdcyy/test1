package com.kwai.player.KwaiRepresentation;
import java.lang.Object;

public class KwaiRepresentation	// class@0012d6
{
    public int avgBitreate;
    public boolean defaultSelect;
    public boolean enableAdaptive;
    public int hdrType;
    public int height;
    public int id;
    public int maxBitrate;
    public boolean multiAudioFromOneFile;
    public String qualityLabel;
    public String qualityType;
    public String url;
    public String videoCodec;
    public int width;
    public static int AUTO_ID = 156;
    public static String AUTO_TYPE = "auto";
    public static final int HDRType_Dolby = 3;
    public static final int HDRType_HDR10 = 1;
    public static final int HDRType_HDR10Plus = 2;
    public static final int HDRType_HLG = 4;
    public static final int HDRType_NONE = 0;
    public static final int HDRType_SDRPlus = 5;

    public void KwaiRepresentation(){
       super();
    }
    public boolean isHdr(){
       KwaiRepresentation thdrType = this.hdrType;
       boolean b = true;
       if (thdrType == b || (thdrType == 2 || (thdrType != 3 && thdrType != 4))) {
          b = false;
       }
    label_0010 :
       return b;
    }
}
