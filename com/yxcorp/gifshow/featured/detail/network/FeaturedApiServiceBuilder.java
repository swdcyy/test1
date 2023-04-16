package com.yxcorp.gifshow.featured.detail.network.FeaturedApiServiceBuilder;
import com.smile.gifshow.annotation.plugin.Factory;
import gea.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import gea.a;
import com.yxcorp.retrofit.e;

public class FeaturedApiServiceBuilder extends Factory	// class@000f96
{

    public void FeaturedApiServiceBuilder(){
       super();
    }
    public static b getFeaturedSelectionApiService(){
       Object obj = PatchProxy.apply(null, null, FeaturedApiServiceBuilder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-560870569);
    }
    public Object newInstance(){
       a uoa = PatchProxy.apply(null, this, FeaturedApiServiceBuilder.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), a.class);
       }
       return uoa;
    }
}
