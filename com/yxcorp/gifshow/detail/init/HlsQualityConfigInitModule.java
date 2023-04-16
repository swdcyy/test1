package com.yxcorp.gifshow.detail.init.HlsQualityConfigInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import com.yxcorp.gifshow.detail.config.MultiRateConfig;
import java.lang.reflect.Type;
import p7c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.config.MultiRateConfig$QualityList;
import com.kwai.video.wayne.player.config.ks_sub.QualityRateModel;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import kotlin.jvm.internal.a;
import java.util.List;

public final class HlsQualityConfigInitModule extends TTIInitModule	// class@001570
{

    public void HlsQualityConfigInitModule(){
       super();
    }
    public int f0(){
       return 28;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HlsQualityConfigInitModule.class, "1")) {
          return;
       }
       if (!d.i) {
          return;
       }
       MultiRateConfig multiRateCon = a.a(MultiRateConfig.class);
       multiRateCon = (multiRateCon != null)? multiRateCon.mQualityList: null;
       if (multiRateCon != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = multiRateCon.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new QualityRateModel(iterator.next().mQualityShow));
          }
          KSConfigGetInterface configGet = WaynePlayerConfigImpl.getConfigGet();
          a.o(configGet, "WaynePlayerConfigImpl.getConfigGet\(\)");
          configGet.setQualityList(uArrayList);
       }
       return;
    }
}
