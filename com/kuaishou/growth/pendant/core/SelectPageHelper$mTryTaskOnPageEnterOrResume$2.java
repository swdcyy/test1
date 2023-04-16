package com.kuaishou.growth.pendant.core.SelectPageHelper$mTryTaskOnPageEnterOrResume$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class SelectPageHelper$mTryTaskOnPageEnterOrResume$2 extends Lambda implements a	// class@00062f
{
    public static final SelectPageHelper$mTryTaskOnPageEnterOrResume$2 INSTANCE;

    static {
       SelectPageHelper$mTryTaskOnPageEnterOrResume$2.INSTANCE = new SelectPageHelper$mTryTaskOnPageEnterOrResume$2();
    }
    public void SelectPageHelper$mTryTaskOnPageEnterOrResume$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, SelectPageHelper$mTryTaskOnPageEnterOrResume$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("tryTaskOnPageEnterOrResume", false);
    }
}
