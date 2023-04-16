package com.yxcorp.gifshow.camera.record.assistant.viewmodel.StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ec9.j1;
import ud9.a;
import cc9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1 extends Lambda implements l	// class@001d28
{
    public final a $it$inlined;
    public final j1 this$0;

    public void StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1(j1 p0,a p1){
       this.this$0 = p0;
       this.$it$inlined = p1;
       super(1);
    }
    public final g invoke(g p0){
       StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "oldDiscernState");
       obj = this.$it$inlined;
       a mTitle = obj.mTitle;
       a uoa = (mTitle != null)? mTitle: "";
       a mDesc = obj.mDesc;
       a uoa1 = (mDesc != null)? mDesc: "";
       a uoa2 = (mTitle != null)? mTitle: "";
       PatchProxy.onMethodExit(StartDiscernDelegate$run$2$$special$$inlined$let$lambda$1.class, "1");
       return p0.a(uoa, uoa1, null, true, uoa2);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
