package com.kuaishou.live.core.voiceparty.util.ReleasableKt;
import yx2.i;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.util.ReleasableKt$bindLifecycle$1;
import msd.a;
import u63.a;

public final class ReleasableKt	// class@001ad3
{

    public static final i a(i p0,LifecycleOwner p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReleasableKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$bindLifecycle");
       a.p(p1, "lifecycleOwner");
       a.a(p1, new ReleasableKt$bindLifecycle$1(p0));
       return p0;
    }
}
