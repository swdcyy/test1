package com.yxcorp.gifshow.HomeLoadInitModule$a;
import hg5.a;
import com.yxcorp.gifshow.HomeLoadInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;

public class HomeLoadInitModule$a implements a	// class@0012eb
{
    public final HomeLoadInitModule a;

    public void HomeLoadInitModule$a(HomeLoadInitModule p0){
       this.a = p0;
       super();
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, HomeLoadInitModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("home_realtime_tab_startup_timeout", 2000);
    }
}
