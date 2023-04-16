package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$resourceManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import java.lang.Object;
import jb7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jb7.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicParamsExt;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$b;
import kb7.a;

public final class DynamicTextRepo$resourceManager$2 extends Lambda implements a	// class@0013e0
{
    public final DynamicTextRepo this$0;

    public void DynamicTextRepo$resourceManager$2(DynamicTextRepo p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       a obj = PatchProxy.apply(null, this, DynamicTextRepo$resourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a("COVER_PLUGIN", 3, DynamicParamsExt.class);
       return ResourceSdk.f.c(obj, new DynamicTextRepo$b(this.this$0, obj));
    }
}
