package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$onNonActionbarClick$appender$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import vq4.a;
import java.lang.Object;
import vq4.c;
import vq4.d;

public final class ThanosAdMutableLabelPresenter$onNonActionbarClick$appender$1 implements AdDataWrapper$AdLogParamAppender	// class@0015c1
{
    public final a $adLabelInfo;

    public void ThanosAdMutableLabelPresenter$onNonActionbarClick$appender$1(a p0){
       this.$adLabelInfo = p0;
       super();
    }
    public final void appendAdLogParam(c p0){
       p0 = p0.F;
       p0.b = 79;
       p0.h1 = 1;
       a[] uoaArray = new a[]{this.$adLabelInfo};
       p0.g1 = uoaArray;
    }
}
