package com.kuaishou.krn.experiment.ExpConfigKt$captureViewConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import mi0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import com.kuaishou.krn.experiment.ExpConfigKt$captureViewConfig$2$a;
import java.lang.reflect.Type;
import el.a;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox;

public final class ExpConfigKt$captureViewConfig$2 extends Lambda implements a	// class@000875
{
    public static final ExpConfigKt$captureViewConfig$2 INSTANCE;

    static {
       ExpConfigKt$captureViewConfig$2.INSTANCE = new ExpConfigKt$captureViewConfig$2();
    }
    public void ExpConfigKt$captureViewConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       a value;
       d obj = PatchProxy.apply(null, this, ExpConfigKt$captureViewConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KrnInternalManager.c.a().c();
       if (obj != null) {
          value = obj.getValue("krnCVConfigOnTextCut", new ExpConfigKt$captureViewConfig$2$a().getType(), ScreenCaptureToolbox.g.b());
          if (value != null) {
          label_003c :
             return value;
          }
       }
       value = ScreenCaptureToolbox.g.b();
       goto label_003c ;
    }
}
