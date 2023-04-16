package com.kwai.feature.post.api.feature.kuaishan.model.KuaiShanAssetTag;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KuaiShanAssetTag extends Enum	// class@0013a4
{
    public final String assetTag;
    public static final KuaiShanAssetTag[] $VALUES;
    public static final KuaiShanAssetTag BACKGROUND;
    public static final KuaiShanAssetTag DATE_DAY;
    public static final KuaiShanAssetTag DATE_MONTH;
    public static final KuaiShanAssetTag DATE_YEAR;
    public static final KuaiShanAssetTag ENDING;
    public static final KuaiShanAssetTag LOCATION;
    public static final KuaiShanAssetTag OPENING;
    public static final KuaiShanAssetTag PRIMARY_IMAGE;
    public static final KuaiShanAssetTag TITLE;
    public static final KuaiShanAssetTag TOPIC_STICKER;

    static {
       KuaiShanAssetTag[] kuaiShanAsse = new KuaiShanAssetTag[10];
       KuaiShanAssetTag kuaiShanAsse1 = new KuaiShanAssetTag("LOCATION", 0, "ms_location");
       KuaiShanAssetTag.LOCATION = kuaiShanAsse1;
       kuaiShanAsse[0] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("TOPIC_STICKER", 1, "ms_topic");
       KuaiShanAssetTag.TOPIC_STICKER = kuaiShanAsse1;
       kuaiShanAsse[1] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("BACKGROUND", 2, "ms_background");
       KuaiShanAssetTag.BACKGROUND = kuaiShanAsse1;
       kuaiShanAsse[2] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("PRIMARY_IMAGE", 3, "ms_import");
       KuaiShanAssetTag.PRIMARY_IMAGE = kuaiShanAsse1;
       kuaiShanAsse[3] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("DATE_YEAR", 4, "ms_date_year");
       KuaiShanAssetTag.DATE_YEAR = kuaiShanAsse1;
       kuaiShanAsse[4] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("DATE_MONTH", 5, "ms_date_month");
       KuaiShanAssetTag.DATE_MONTH = kuaiShanAsse1;
       kuaiShanAsse[5] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("DATE_DAY", 6, "ms_date_day");
       KuaiShanAssetTag.DATE_DAY = kuaiShanAsse1;
       kuaiShanAsse[6] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("OPENING", 7, "ks_opening");
       KuaiShanAssetTag.OPENING = kuaiShanAsse1;
       kuaiShanAsse[7] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("ENDING", 8, "ks_ending");
       KuaiShanAssetTag.ENDING = kuaiShanAsse1;
       kuaiShanAsse[8] = kuaiShanAsse1;
       kuaiShanAsse1 = new KuaiShanAssetTag("TITLE", 9, "ms_title");
       KuaiShanAssetTag.TITLE = kuaiShanAsse1;
       kuaiShanAsse[9] = kuaiShanAsse1;
       KuaiShanAssetTag.$VALUES = kuaiShanAsse;
    }
    public void KuaiShanAssetTag(String p0,int p1,String p2){
       super(p0, p1);
       this.assetTag = p2;
    }
    public static KuaiShanAssetTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KuaiShanAssetTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KuaiShanAssetTag.class, p0);
    }
    public static KuaiShanAssetTag[] values(){
       Object obj = PatchProxy.apply(null, null, KuaiShanAssetTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KuaiShanAssetTag.$VALUES.clone();
    }
    public final String getAssetTag(){
       return this.assetTag;
    }
}
