package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentDynamicCommonContainerFragment$a;
import im8.g;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentDynamicCommonContainerFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.c;
import java.util.Map;
import java.util.HashMap;

public class CommentDynamicCommonContainerFragment$a implements g	// class@001387
{
    public final CommentDynamicCommonContainerFragment b;

    public void CommentDynamicCommonContainerFragment$a(CommentDynamicCommonContainerFragment p0){
       super();
       this.b = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentDynamicCommonContainerFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CommentDynamicCommonContainerFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CommentDynamicCommonContainerFragment$a.class, new c());
       }else {
          obj.put(CommentDynamicCommonContainerFragment$a.class, null);
       }
       return obj;
    }
}
