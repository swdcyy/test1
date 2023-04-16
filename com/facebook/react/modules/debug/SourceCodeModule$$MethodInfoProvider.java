package com.facebook.react.modules.debug.SourceCodeModule$$MethodInfoProvider;
import ge.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.module.model.MethodDescriptor;

public final class SourceCodeModule$$MethodInfoProvider extends a	// class@0012a6
{

    public void SourceCodeModule$$MethodInfoProvider(){
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, SourceCodeModule$$MethodInfoProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new MethodDescriptor("getSourceUrl", 0, 3, "\(\)Ljava/lang/String;"));
       return obj;
    }
}
