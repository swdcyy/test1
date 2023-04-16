package com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv$resSavePath$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import kotlin.jvm.internal.a;

public final class DynamicTextEnv$resSavePath$2 extends Lambda implements a	// class@0013e3
{
    public static final DynamicTextEnv$resSavePath$2 INSTANCE;

    static {
       DynamicTextEnv$resSavePath$2.INSTANCE = new DynamicTextEnv$resSavePath$2();
    }
    public void DynamicTextEnv$resSavePath$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       File obj = PatchProxy.apply(null, this, DynamicTextEnv$resSavePath$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PostUtils.r(".texts");
       a.o(obj, "PostUtils.getSubPrivateCacheDir\(SAVE_DIR\)");
       return obj.getAbsolutePath();
    }
}
