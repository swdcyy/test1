package com.facebook.react.modules.image.ImageLoaderModule$$MethodInfoProvider;
import ge.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.module.model.MethodDescriptor;

public final class ImageLoaderModule$$MethodInfoProvider extends a	// class@0012ba
{

    public void ImageLoaderModule$$MethodInfoProvider(){
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, ImageLoaderModule$$MethodInfoProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new MethodDescriptor("getSize", 1, 7, "\(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;\)V"));
       obj.add(new MethodDescriptor("abortRequest", 1, 0, "\(D\)V"));
       obj.add(new MethodDescriptor("prefetchImage", 2, 7, "\(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;\)V"));
       obj.add(new MethodDescriptor("queryCache", 1, 7, "\(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;\)V"));
       obj.add(new MethodDescriptor("getSizeWithHeaders", 2, 7, "\(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;\)V"));
       return obj;
    }
}
