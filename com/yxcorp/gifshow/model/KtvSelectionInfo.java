package com.yxcorp.gifshow.model.KtvSelectionInfo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KtvSelectionInfo extends Enum	// class@001e3c
{
    public String mMvParamTextId;
    public int mPhotoMetaId;
    public static final KtvSelectionInfo[] $VALUES;
    public static final KtvSelectionInfo CHORUS;
    public static final KtvSelectionInfo FREE;
    public static final KtvSelectionInfo FULL;
    public static final KtvSelectionInfo HOT;

    static {
       KtvSelectionInfo ktvSelection = new KtvSelectionInfo("FULL", 0, "complete", 2);
       KtvSelectionInfo.FULL = ktvSelection;
       KtvSelectionInfo ktvSelection1 = new KtvSelectionInfo("FREE", 1, "freeCut", 1);
       KtvSelectionInfo.FREE = ktvSelection1;
       KtvSelectionInfo ktvSelection2 = new KtvSelectionInfo("CHORUS", 2, "duet", 4);
       KtvSelectionInfo.CHORUS = ktvSelection2;
       KtvSelectionInfo ktvSelection3 = new KtvSelectionInfo("HOT", 3, "hot", 3);
       KtvSelectionInfo.HOT = ktvSelection3;
       KtvSelectionInfo[] ktvSelection4 = new KtvSelectionInfo[]{ktvSelection,ktvSelection1,ktvSelection2,ktvSelection3};
       KtvSelectionInfo.$VALUES = ktvSelection4;
    }
    public void KtvSelectionInfo(String p0,int p1,String p2,int p3){
       super(p0, p1);
       this.mMvParamTextId = p2;
       this.mPhotoMetaId = p3;
    }
    public static KtvSelectionInfo fromMvParam(String p0){
       object oobject;
       KtvSelectionInfo[] obj = PatchProxy.applyOneRefs(p0, null, KtvSelectionInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KtvSelectionInfo.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return KtvSelectionInfo.HOT;
          }
          oobject = obj[i];
          if ((oobject.mMvParamTextId).equals(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static KtvSelectionInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KtvSelectionInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KtvSelectionInfo.class, p0);
    }
    public static KtvSelectionInfo[] values(){
       Object obj = PatchProxy.apply(null, null, KtvSelectionInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KtvSelectionInfo.$VALUES.clone();
    }
}
