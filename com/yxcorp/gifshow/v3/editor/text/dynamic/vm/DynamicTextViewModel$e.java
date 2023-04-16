package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$e;
import erd.g;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$a;
import kotlin.jvm.internal.a;

public final class DynamicTextViewModel$e implements g	// class@0013ee
{
    public final DynamicTextViewModel$a b;

    public void DynamicTextViewModel$e(DynamicTextViewModel$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTextViewModel$e.class, "1")) {
       }else {
          DynamicTextRepo.c.a(false);
          DynamicTextViewModel$e tb = this.b;
          if (tb != null) {
             a.o(p0, "t");
             tb.onError(p0);
          }
       }
       return;
    }
}
