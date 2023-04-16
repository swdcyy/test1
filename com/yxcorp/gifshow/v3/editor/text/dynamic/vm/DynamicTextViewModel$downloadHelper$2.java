package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$downloadHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$downloadHelper$2$a;
import hqc.i;

public final class DynamicTextViewModel$downloadHelper$2 extends Lambda implements a	// class@0013ed
{
    public static final DynamicTextViewModel$downloadHelper$2 INSTANCE;

    static {
       DynamicTextViewModel$downloadHelper$2.INSTANCE = new DynamicTextViewModel$downloadHelper$2();
    }
    public void DynamicTextViewModel$downloadHelper$2(){
       super(0);
    }
    public final DynamicTextDownloadHelper invoke(){
       Object obj = PatchProxy.apply(null, this, DynamicTextViewModel$downloadHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DynamicTextDownloadHelper("COVER_PLUGIN", new DynamicTextViewModel$downloadHelper$2$a());
    }
    public Object invoke(){
       return this.invoke();
    }
}
