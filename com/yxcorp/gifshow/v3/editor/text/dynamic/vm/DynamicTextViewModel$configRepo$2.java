package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$configRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicTextViewModel$configRepo$2 extends Lambda implements a	// class@0013ea
{
    public static final DynamicTextViewModel$configRepo$2 INSTANCE;

    static {
       DynamicTextViewModel$configRepo$2.INSTANCE = new DynamicTextViewModel$configRepo$2();
    }
    public void DynamicTextViewModel$configRepo$2(){
       super(0);
    }
    public final DynamicTextRepo invoke(){
       Object obj = PatchProxy.apply(null, this, DynamicTextViewModel$configRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DynamicTextRepo();
    }
    public Object invoke(){
       return this.invoke();
    }
}
