package com.yxcorp.gifshow.detail.nonslide.presenter.share.FansMotivateShareGuideBasePresenter$GuideType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FansMotivateShareGuideBasePresenter$GuideType extends Enum	// class@0015d8
{
    public static final FansMotivateShareGuideBasePresenter$GuideType[] $VALUES;
    public static final FansMotivateShareGuideBasePresenter$GuideType BUBBLE_GUIDE;
    public static final FansMotivateShareGuideBasePresenter$GuideType NONE;
    public static final FansMotivateShareGuideBasePresenter$GuideType POPUP_GUIDE;

    static {
       FansMotivateShareGuideBasePresenter$GuideType guideType = new FansMotivateShareGuideBasePresenter$GuideType("NONE", 0);
       FansMotivateShareGuideBasePresenter$GuideType.NONE = guideType;
       FansMotivateShareGuideBasePresenter$GuideType guideType1 = new FansMotivateShareGuideBasePresenter$GuideType("POPUP_GUIDE", 1);
       FansMotivateShareGuideBasePresenter$GuideType.POPUP_GUIDE = guideType1;
       FansMotivateShareGuideBasePresenter$GuideType guideType2 = new FansMotivateShareGuideBasePresenter$GuideType("BUBBLE_GUIDE", 2);
       FansMotivateShareGuideBasePresenter$GuideType.BUBBLE_GUIDE = guideType2;
       FansMotivateShareGuideBasePresenter$GuideType[] guideTypeArr = new FansMotivateShareGuideBasePresenter$GuideType[]{guideType,guideType1,guideType2};
       FansMotivateShareGuideBasePresenter$GuideType.$VALUES = guideTypeArr;
    }
    public void FansMotivateShareGuideBasePresenter$GuideType(String p0,int p1){
       super(p0, p1);
    }
    public static FansMotivateShareGuideBasePresenter$GuideType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FansMotivateShareGuideBasePresenter$GuideType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FansMotivateShareGuideBasePresenter$GuideType.class, p0);
    }
    public static FansMotivateShareGuideBasePresenter$GuideType[] values(){
       Object obj = PatchProxy.apply(null, null, FansMotivateShareGuideBasePresenter$GuideType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FansMotivateShareGuideBasePresenter$GuideType.$VALUES.clone();
    }
}
