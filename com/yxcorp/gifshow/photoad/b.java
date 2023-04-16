package com.yxcorp.gifshow.photoad.b;
import erd.g;
import java.lang.Object;
import vq4.c;
import com.yxcorp.gifshow.photoad.AdAppendAdLogCommonParamsUtil;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;

public final class b implements g	// class@000f73
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AdAppendAdLogCommonParamsUtil.class, "6")) {
       }else if(p0.F == null){
          p0.F = new d();
       }
       p0.F.X0 = (int)((SystemUtil.s(a.B) / 1024) / 1024);
       p0.F.W0 = SystemUtil.f(a.B);
       p0.f1 = (int)((SystemUtil.u() / 1024) / 1024);
       return;
    }
}
