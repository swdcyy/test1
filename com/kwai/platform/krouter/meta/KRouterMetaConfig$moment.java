package com.kwai.platform.krouter.meta.KRouterMetaConfig$moment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh7.d;
import java.util.ArrayList;
import java.util.List;
import rh7.a;
import wh7.c;

public class KRouterMetaConfig$moment	// class@0012b7
{

    public void KRouterMetaConfig$moment(){
       super();
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, KRouterMetaConfig$moment.class, "1")) {
          return;
       }
       d uod = new d("moment/momentDetail", "com.yxcorp.gifshow.moment.detail.MomentDetailHandlerV2", new ArrayList(), null, "moment");
       c.d(v0);
       d uod1 = new d("moment/detail.*", "com.yxcorp.gifshow.moment.detail.MomentDetailHandler", new ArrayList(), null, "moment");
       c.d(v0);
       return;
    }
}
