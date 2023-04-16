package com.yxcorp.gifshow.model.d;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.model.c;
import tl8.d;
import ok.h;
import tl8.e;
import elb.i;
import tl8.g;

public class d	// class@001ee7
{

    public void d(){
       super();
    }
    public static HotSurveyActionDetailSurvey a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e.h(p0, PhotoMeta.class, c.b);
    }
    public static void b(BaseFeed p0,HotSurveyActionDetailSurvey p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "2")) {
          return;
       }
       e.g(p0, PhotoMeta.class, new i(p1));
       return;
    }
}
