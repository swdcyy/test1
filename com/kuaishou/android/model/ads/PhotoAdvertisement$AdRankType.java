package com.kuaishou.android.model.ads.PhotoAdvertisement$AdRankType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoAdvertisement$AdRankType extends Enum	// class@0008ad
{
    public static final PhotoAdvertisement$AdRankType[] $VALUES;
    public static final PhotoAdvertisement$AdRankType AD_FIXED_POS;
    public static final PhotoAdvertisement$AdRankType AD_NO_NEED_RERANK;
    public static final PhotoAdvertisement$AdRankType AD_RERANK;
    public static final PhotoAdvertisement$AdRankType UNKNOWN;

    static {
       PhotoAdvertisement$AdRankType uAdRankType = new PhotoAdvertisement$AdRankType("UNKNOWN", 0);
       PhotoAdvertisement$AdRankType.UNKNOWN = uAdRankType;
       PhotoAdvertisement$AdRankType uAdRankType1 = new PhotoAdvertisement$AdRankType("AD_RERANK", 1);
       PhotoAdvertisement$AdRankType.AD_RERANK = uAdRankType1;
       PhotoAdvertisement$AdRankType uAdRankType2 = new PhotoAdvertisement$AdRankType("AD_FIXED_POS", 2);
       PhotoAdvertisement$AdRankType.AD_FIXED_POS = uAdRankType2;
       PhotoAdvertisement$AdRankType uAdRankType3 = new PhotoAdvertisement$AdRankType("AD_NO_NEED_RERANK", 3);
       PhotoAdvertisement$AdRankType.AD_NO_NEED_RERANK = uAdRankType3;
       PhotoAdvertisement$AdRankType[] uAdRankTypeA = new PhotoAdvertisement$AdRankType[]{uAdRankType,uAdRankType1,uAdRankType2,uAdRankType3};
       PhotoAdvertisement$AdRankType.$VALUES = uAdRankTypeA;
    }
    public void PhotoAdvertisement$AdRankType(String p0,int p1){
       super(p0, p1);
    }
    public static PhotoAdvertisement$AdRankType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PhotoAdvertisement$AdRankType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PhotoAdvertisement$AdRankType.class, p0);
    }
    public static PhotoAdvertisement$AdRankType[] values(){
       Object obj = PatchProxy.apply(null, null, PhotoAdvertisement$AdRankType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoAdvertisement$AdRankType.$VALUES.clone();
    }
}
