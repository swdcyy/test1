package com.kuaishou.commercial.search.feed.AdSearchDoubleFeedClickRecommendPresenter$reportItemKeyWordsClick$$inlined$let$lambda$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import vq4.d;

public final class AdSearchDoubleFeedClickRecommendPresenter$reportItemKeyWordsClick$$inlined$let$lambda$1 implements AdDataWrapper$AdLogParamAppender	// class@001559
{
    public final int $index$inlined;
    public final String $keyWord$inlined;

    public void AdSearchDoubleFeedClickRecommendPresenter$reportItemKeyWordsClick$$inlined$let$lambda$1(String p0,int p1){
       this.$keyWord$inlined = p0;
       this.$index$inlined = p1;
       super();
    }
    public final void appendAdLogParam(c p0){
       p0 = p0.F;
       p0.C = 14;
       p0.X2 = 12;
       p0.L3 = this.$keyWord$inlined;
       p0.s3 = this.$index$inlined;
    }
}
