package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.d$a;
import qw6.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class d$a implements a	// class@0017bf
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void H2(){
    }
    public void N2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(objArray, tb, d.class, "7")) {
          d r = tb.r;
          if (r != null) {
             d s = tb.s;
             if (s != null && s.mIsSubmit != null) {
                r.G(tb.p, "SurveyCardClickPresenter");
             }
          }
          PatchProxy.onMethodExit(d.class, "7");
       }
       PatchProxy.onMethodExit(d$a.class, "1");
       return;
    }
    public void Q0(){
    }
    public void Q1(){
    }
}
