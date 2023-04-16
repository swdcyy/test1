package com.kwai.slide.play.detail.base.PageType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PageType extends Enum	// class@00179e
{
    public static final PageType[] $VALUES;
    public static final PageType ATLAS;
    public static final PageType LONG_PIC;
    public static final PageType VIDEO;

    static {
       PageType pageType;
       PageType[] pageTypeArra = new PageType[]{pageType,pageType,pageType};
       pageType = new PageType("VIDEO", 0);
       PageType.VIDEO = pageType;
       pageType = new PageType("ATLAS", 1);
       PageType.ATLAS = pageType;
       pageType = new PageType("LONG_PIC", 2);
       PageType.LONG_PIC = pageType;
       PageType.$VALUES = pageTypeArra;
    }
    public void PageType(String p0,int p1){
       super(p0, p1);
    }
    public static PageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PageType.class, p0);
    }
    public static PageType[] values(){
       Object obj = PatchProxy.apply(null, null, PageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PageType.$VALUES.clone();
    }
}
