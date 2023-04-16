package com.yxcorp.gifshow.commontab.pagelist.b;
import yv8.a;
import java.lang.Object;
import com.yxcorp.gifshow.action.model.RealActionFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class b implements a	// class@0011bb
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(RealActionFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.x(p0.mSubBizTag);
    }
}
