package p80.h;
import com.kuaishou.webkit.extension.KsCorePerformanceListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import zsd.u;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import java.util.Objects;
import java.lang.System;
import com.yxcorp.utility.Log;
import k2b.u1;

public final class h implements KsCorePerformanceListener	// class@0028d0
{
    public long a;
    public long b;

    public void h(){
       super();
    }
    public void onPerformanceTiming(boolean p0,String p1,String p2,long p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, Long.valueOf(p3), this, h.class, "1")) {
          return;
       }
       if (u.J1(p1, "create_webview_factory_provider_begin", false, 2, null)) {
          this.a = p3;
       }else if(u.J1(p1, "create_webview_factory_provider_end", false, 2, null)){
          this.b = p3;
          Objects.requireNonNull(KsWebViewInitModule.A);
          String str = "begin:"+this.a+"|end:"+this.b+"|initbegin:"+KsWebViewInitModule.u+"|tag:"+p2+"|ts:"+System.currentTimeMillis()+"|tag:"+p2;
          Log.b("AJJJJWV", str);
          u1.R("CNYPreInitWebview", str, 19);
       }
       return;
    }
}
