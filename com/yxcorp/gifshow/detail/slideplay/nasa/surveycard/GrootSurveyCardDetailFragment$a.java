package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.GrootSurveyCardDetailFragment$a;
import im8.g;
import java.lang.Object;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.c;
import java.util.Map;
import java.util.HashMap;

public class GrootSurveyCardDetailFragment$a implements g	// class@0017ba
{
    public ObservableList b;

    public void GrootSurveyCardDetailFragment$a(){
       super();
       this.b = new ObservableList(new ArrayList());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, GrootSurveyCardDetailFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          PatchProxy.onMethodExit(GrootSurveyCardDetailFragment$a.class, "1");
          return new c();
       }else {
          PatchProxy.onMethodExit(GrootSurveyCardDetailFragment$a.class, "1");
          return null;
       }
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, GrootSurveyCardDetailFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(GrootSurveyCardDetailFragment$a.class, new c());
       }else {
          obj.put(GrootSurveyCardDetailFragment$a.class, null);
       }
       PatchProxy.onMethodExit(GrootSurveyCardDetailFragment$a.class, "2");
       return obj;
    }
}
