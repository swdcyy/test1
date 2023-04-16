package com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitFragment$b;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.comment.limitcomment.c;
import java.util.Map;
import java.util.HashMap;

public class ProductCommentLimitFragment$b implements g	// class@001372
{
    public d b;

    public void ProductCommentLimitFragment$b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProductCommentLimitFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProductCommentLimitFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ProductCommentLimitFragment$b.class, new c());
       }else {
          obj.put(ProductCommentLimitFragment$b.class, null);
       }
       return obj;
    }
}
