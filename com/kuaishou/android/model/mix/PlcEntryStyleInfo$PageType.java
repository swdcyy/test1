package com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlcEntryStyleInfo$PageType extends Enum	// class@000d8f
{
    public int pageType;
    public static final PlcEntryStyleInfo$PageType[] $VALUES;
    public static final PlcEntryStyleInfo$PageType ATTENTION_LIST;
    public static final PlcEntryStyleInfo$PageType COUPLE;
    public static final PlcEntryStyleInfo$PageType LONG_VIDEO_DETAIL;
    public static final PlcEntryStyleInfo$PageType SINGLE;
    public static final PlcEntryStyleInfo$PageType SINGLE_LANDSCAPE;
    public static final PlcEntryStyleInfo$PageType UNKNOWN;

    static {
       PlcEntryStyleInfo$PageType pageType = new PlcEntryStyleInfo$PageType("UNKNOWN", 0, -1);
       PlcEntryStyleInfo$PageType.UNKNOWN = pageType;
       PlcEntryStyleInfo$PageType pageType1 = new PlcEntryStyleInfo$PageType("SINGLE", 1, 0);
       PlcEntryStyleInfo$PageType.SINGLE = pageType1;
       PlcEntryStyleInfo$PageType pageType2 = new PlcEntryStyleInfo$PageType("COUPLE", 2, 1);
       PlcEntryStyleInfo$PageType.COUPLE = pageType2;
       PlcEntryStyleInfo$PageType pageType3 = new PlcEntryStyleInfo$PageType("LONG_VIDEO_DETAIL", 3, 2);
       PlcEntryStyleInfo$PageType.LONG_VIDEO_DETAIL = pageType3;
       PlcEntryStyleInfo$PageType pageType4 = new PlcEntryStyleInfo$PageType("SINGLE_LANDSCAPE", 4, 3);
       PlcEntryStyleInfo$PageType.SINGLE_LANDSCAPE = pageType4;
       PlcEntryStyleInfo$PageType pageType5 = new PlcEntryStyleInfo$PageType("ATTENTION_LIST", 5, 10);
       PlcEntryStyleInfo$PageType.ATTENTION_LIST = pageType5;
       PlcEntryStyleInfo$PageType[] pageTypeArra = new PlcEntryStyleInfo$PageType[]{pageType,pageType1,pageType2,pageType3,pageType4,pageType5};
       PlcEntryStyleInfo$PageType.$VALUES = pageTypeArra;
    }
    public void PlcEntryStyleInfo$PageType(String p0,int p1,int p2){
       super(p0, p1);
       this.pageType = p2;
    }
    public static PlcEntryStyleInfo$PageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcEntryStyleInfo$PageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlcEntryStyleInfo$PageType.class, p0);
    }
    public static PlcEntryStyleInfo$PageType[] values(){
       Object obj = PatchProxy.apply(null, null, PlcEntryStyleInfo$PageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlcEntryStyleInfo$PageType.$VALUES.clone();
    }
    public int getPageType(){
       return this.pageType;
    }
}
