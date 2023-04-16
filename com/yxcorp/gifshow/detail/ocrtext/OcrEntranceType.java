package com.yxcorp.gifshow.detail.ocrtext.OcrEntranceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class OcrEntranceType extends Enum	// class@0015fb
{
    public static final OcrEntranceType[] $VALUES;
    public static final OcrEntranceType CONDITION;
    public static final OcrEntranceType HIDE;
    public static final OcrEntranceType SHOW;

    static {
       OcrEntranceType ocrEntranceT1;
       OcrEntranceType[] ocrEntranceT = new OcrEntranceType[]{ocrEntranceT1,ocrEntranceT1,ocrEntranceT1};
       ocrEntranceT1 = new OcrEntranceType("HIDE", 0);
       OcrEntranceType.HIDE = ocrEntranceT1;
       ocrEntranceT1 = new OcrEntranceType("CONDITION", 1);
       OcrEntranceType.CONDITION = ocrEntranceT1;
       ocrEntranceT1 = new OcrEntranceType("SHOW", 2);
       OcrEntranceType.SHOW = ocrEntranceT1;
       OcrEntranceType.$VALUES = ocrEntranceT;
    }
    public void OcrEntranceType(String p0,int p1){
       super(p0, p1);
    }
    public static OcrEntranceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OcrEntranceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(OcrEntranceType.class, p0);
    }
    public static OcrEntranceType[] values(){
       Object obj = PatchProxy.apply(null, null, OcrEntranceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OcrEntranceType.$VALUES.clone();
    }
}
