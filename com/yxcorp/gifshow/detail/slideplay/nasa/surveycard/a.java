package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.GrootSurveyCardDetailFragment$a;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;

public class a extends Accessor	// class@0017bc
{
    public final GrootSurveyCardDetailFragment$a c;
    public final c d;

    public void a(c p0,GrootSurveyCardDetailFragment$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
