package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$b;
import kb7.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import jb7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.dynamic.util.DynamicTextEnv;
import java.util.Objects;
import qrd.p;

public final class DynamicTextRepo$b extends a	// class@0013de
{
    public final DynamicTextRepo b;

    public void DynamicTextRepo$b(DynamicTextRepo p0,a p1){
       a.p(p1, "bizConfig");
       this.b = p0;
       super(p1);
    }
    public File a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicTextEnv obj = PatchProxy.apply(null, this, DynamicTextRepo$b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = DynamicTextEnv.class;
       File uFile = PatchProxy.apply(null, null, obj, "4");
       if (uFile != patchProxyRe) {
       }else {
          DynamicTextEnv c = DynamicTextEnv.c;
          Objects.requireNonNull(c);
          Object obj1 = PatchProxy.apply(null, c, obj, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = DynamicTextEnv.b.getValue();
          }
          uFile = new File(obj1);
       }
       return uFile;
    }
}
