package com.kwai.slide.play.detail.biz.ElementCategoryLayoutInfo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ElementCategoryLayoutInfo extends Enum	// class@00179f
{
    public final int bottomMargin;
    public final float widthRatio;
    public static final ElementCategoryLayoutInfo[] $VALUES;
    public static final ElementCategoryLayoutInfo BOTTOM_FUNCTION_AREA;
    public static final ElementCategoryLayoutInfo CAPTION;
    public static final ElementCategoryLayoutInfo COMMENT_MARQUEE;
    public static final ElementCategoryLayoutInfo CO_CREATOR_AUTHORS;
    public static final ElementCategoryLayoutInfo CREATE_TIME;
    public static final ElementCategoryLayoutInfo DOUBLE_RECO_LABEL;
    public static final ElementCategoryLayoutInfo FUNCTION_LABEL;
    public static final ElementCategoryLayoutInfo ILLEGAL;
    public static final ElementCategoryLayoutInfo INTENSIFY_FOLLOW;
    public static final ElementCategoryLayoutInfo MUSIC_MARQUEE;
    public static final ElementCategoryLayoutInfo MUSIC_PLACE_HOLDER;
    public static final ElementCategoryLayoutInfo NONE;
    public static final ElementCategoryLayoutInfo PLC_WEAK_LABEL;
    public static final ElementCategoryLayoutInfo POI_COLLECT;
    public static final ElementCategoryLayoutInfo RECO_LABEL;
    public static final ElementCategoryLayoutInfo STRONG_COLLECT;

    static {
       ElementCategoryLayoutInfo[] uElementCate = new ElementCategoryLayoutInfo[16];
       ElementCategoryLayoutInfo uElementCate1 = new ElementCategoryLayoutInfo("DOUBLE_RECO_LABEL", 0, 10, 0x3f666666);
       ElementCategoryLayoutInfo.DOUBLE_RECO_LABEL = uElementCate1;
       uElementCate[0] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("RECO_LABEL", 1, 10, 0x3f19999a);
       ElementCategoryLayoutInfo.RECO_LABEL = uElementCate1;
       uElementCate[1] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("CO_CREATOR_AUTHORS", 2, 10, 0x3f800000);
       ElementCategoryLayoutInfo.CO_CREATOR_AUTHORS = uElementCate1;
       uElementCate[2] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("CAPTION", 3, 8, 0x3f800000);
       ElementCategoryLayoutInfo.CAPTION = uElementCate1;
       uElementCate[3] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("CREATE_TIME", 4, 6, 0x3f800000);
       ElementCategoryLayoutInfo.CREATE_TIME = uElementCate1;
       uElementCate[4] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("MUSIC_MARQUEE", 5, 12, 0x3f800000);
       ElementCategoryLayoutInfo.MUSIC_MARQUEE = uElementCate1;
       uElementCate[5] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("MUSIC_PLACE_HOLDER", 6, 0, 0x3f800000);
       ElementCategoryLayoutInfo.MUSIC_PLACE_HOLDER = uElementCate1;
       uElementCate[6] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("COMMENT_MARQUEE", 7, 12, 0x3f2e147b);
       ElementCategoryLayoutInfo.COMMENT_MARQUEE = uElementCate1;
       uElementCate[7] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("FUNCTION_LABEL", 8, 8, 0x3f51eb85);
       ElementCategoryLayoutInfo.FUNCTION_LABEL = uElementCate1;
       uElementCate[8] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("PLC_WEAK_LABEL", 9, 8, 0x3f800000);
       ElementCategoryLayoutInfo.PLC_WEAK_LABEL = uElementCate1;
       uElementCate[9] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("BOTTOM_FUNCTION_AREA", 10, 14, 0x3f800000);
       ElementCategoryLayoutInfo.BOTTOM_FUNCTION_AREA = uElementCate1;
       uElementCate[10] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("INTENSIFY_FOLLOW", 11, 0, 0x3f800000);
       ElementCategoryLayoutInfo.INTENSIFY_FOLLOW = uElementCate1;
       uElementCate[11] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("NONE", 12, 0, 0);
       ElementCategoryLayoutInfo.NONE = uElementCate1;
       uElementCate[12] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("ILLEGAL", 13, -1, 0xbf800000);
       ElementCategoryLayoutInfo.ILLEGAL = uElementCate1;
       uElementCate[13] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("STRONG_COLLECT", 14, 0, 0x3f800000);
       ElementCategoryLayoutInfo.STRONG_COLLECT = uElementCate1;
       uElementCate[14] = uElementCate1;
       uElementCate1 = new ElementCategoryLayoutInfo("POI_COLLECT", 15, 0, 0x3f800000);
       ElementCategoryLayoutInfo.POI_COLLECT = uElementCate1;
       uElementCate[15] = uElementCate1;
       ElementCategoryLayoutInfo.$VALUES = uElementCate;
    }
    public void ElementCategoryLayoutInfo(String p0,int p1,int p2,float p3){
       super(p0, p1);
       this.bottomMargin = p2;
       this.widthRatio = p3;
    }
    public static ElementCategoryLayoutInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ElementCategoryLayoutInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ElementCategoryLayoutInfo.class, p0);
    }
    public static ElementCategoryLayoutInfo[] values(){
       Object obj = PatchProxy.apply(null, null, ElementCategoryLayoutInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ElementCategoryLayoutInfo.$VALUES.clone();
    }
    public final int getBottomMargin(){
       return this.bottomMargin;
    }
    public final float getWidthRatio(){
       return this.widthRatio;
    }
}
