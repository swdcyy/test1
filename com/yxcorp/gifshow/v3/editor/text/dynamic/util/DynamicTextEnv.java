package com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv$resSavePath$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv$configSavePath$2;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class DynamicTextEnv	// class@0013e4
{
    public static final p a;
    public static final p b;
    public static final DynamicTextEnv c;

    static {
       DynamicTextEnv.c = new DynamicTextEnv();
       DynamicTextEnv.a = s.c(DynamicTextEnv$resSavePath$2.INSTANCE);
       DynamicTextEnv.b = s.c(DynamicTextEnv$configSavePath$2.INSTANCE);
    }
    public void DynamicTextEnv(){
       super();
    }
    public static final File a(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicTextEnv uDynamicText = DynamicTextEnv.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, uDynamicText, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "textId");
       a.p(p1, "resMd5");
       Object obj1 = PatchProxy.apply(null, null, uDynamicText, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = DynamicTextEnv.a.getValue();
       }
       return new File(obj1, p0+'_'+p1);
    }
}
