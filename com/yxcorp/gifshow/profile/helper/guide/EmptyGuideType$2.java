package com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$2;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType;
import java.lang.String;
import java.lang.Class;
import com.yxcorp.gifshow.profile.helper.guide.EmptyGuideType$1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import m3c.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m3c.c;
import fx5.b;

public final class EmptyGuideType$2 extends EmptyGuideType	// class@001339
{

    public void EmptyGuideType$2(String p0,int p1,Class p2){
       super(p0, p1, p2, null);
    }
    public a createProcessor(BaseFragment p0,RecyclerFragment p1,ProfileParam p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EmptyGuideType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(b.class, p0, p1, p2);
    }
}
