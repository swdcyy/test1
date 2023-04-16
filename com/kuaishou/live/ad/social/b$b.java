package com.kuaishou.live.ad.social.b$b;
import mxb.i;
import com.kuaishou.live.ad.social.b;
import zl0.a1;
import java.lang.Object;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;

public class b$b implements i	// class@000a09
{
    public final a1 a;
    public final b b;

    public void b$b(b p0,a1 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return true;
    }
    public AdDataWrapper$AdLogParamAppender getAdLogParamAppender(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.a(this.a);
    }
}
