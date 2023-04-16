package com.yxcorp.gifshow.custom.CustomType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CustomType extends Enum	// class@00128d
{
    public static final CustomType[] $VALUES;
    public static final CustomType DividerLine;
    public static final CustomType DownloadDeny;
    public static final CustomType Emojis;
    public static final CustomType HdExport;
    public static final CustomType KuaishanTemplatePlc;
    public static final CustomType KuaiyingPlc;
    public static final CustomType Recreation;
    public static final CustomType SameFrame;
    public static final CustomType SaveAlbum;
    public static final CustomType ShieldLocal;
    public static final CustomType Visibility24Hours;
    public static final CustomType Watermark;

    static {
       CustomType[] uCustomTypeA = new CustomType[12];
       CustomType uCustomType = new CustomType("Emojis", 0);
       CustomType.Emojis = uCustomType;
       uCustomTypeA[0] = uCustomType;
       uCustomType = new CustomType("SameFrame", 1);
       CustomType.SameFrame = uCustomType;
       uCustomTypeA[1] = uCustomType;
       uCustomType = new CustomType("HdExport", 2);
       CustomType.HdExport = uCustomType;
       uCustomTypeA[2] = uCustomType;
       uCustomType = new CustomType("DownloadDeny", 3);
       CustomType.DownloadDeny = uCustomType;
       uCustomTypeA[3] = uCustomType;
       uCustomType = new CustomType("ShieldLocal", 4);
       CustomType.ShieldLocal = uCustomType;
       uCustomTypeA[4] = uCustomType;
       uCustomType = new CustomType("SaveAlbum", 5);
       CustomType.SaveAlbum = uCustomType;
       uCustomTypeA[5] = uCustomType;
       uCustomType = new CustomType("DividerLine", 6);
       CustomType.DividerLine = uCustomType;
       uCustomTypeA[6] = uCustomType;
       uCustomType = new CustomType("Recreation", 7);
       CustomType.Recreation = uCustomType;
       uCustomTypeA[7] = uCustomType;
       uCustomType = new CustomType("Watermark", 8);
       CustomType.Watermark = uCustomType;
       uCustomTypeA[8] = uCustomType;
       uCustomType = new CustomType("KuaiyingPlc", 9);
       CustomType.KuaiyingPlc = uCustomType;
       uCustomTypeA[9] = uCustomType;
       uCustomType = new CustomType("Visibility24Hours", 10);
       CustomType.Visibility24Hours = uCustomType;
       uCustomTypeA[10] = uCustomType;
       uCustomType = new CustomType("KuaishanTemplatePlc", 11);
       CustomType.KuaishanTemplatePlc = uCustomType;
       uCustomTypeA[11] = uCustomType;
       CustomType.$VALUES = uCustomTypeA;
    }
    public void CustomType(String p0,int p1){
       super(p0, p1);
    }
    public static CustomType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CustomType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CustomType.class, p0);
    }
    public static CustomType[] values(){
       Object obj = PatchProxy.apply(null, null, CustomType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CustomType.$VALUES.clone();
    }
}
