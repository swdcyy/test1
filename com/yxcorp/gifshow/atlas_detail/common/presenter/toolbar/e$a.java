package com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e$a;
import vd5.d;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import g99.w;
import com.kwai.robust.PatchProxyResult;

public class e$a implements d	// class@001baa
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.w.t0(p0);
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.w.q0();
    }
}
