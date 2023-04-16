package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.c;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.GrootSurveyCardDetailFragment$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.b;
import java.lang.Class;
import mm8.a;

public final class c implements b	// class@0017be
{

    public void c(){
       super();
    }
    public void a(a p0,Object p1){
       a uoa = new a(this, p1);
       String str = "SELECTED_SURVEY";
       try{
          p0.i(str, uoa);
          p0.h(GrootSurveyCardDetailFragment$a.class, new b(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
