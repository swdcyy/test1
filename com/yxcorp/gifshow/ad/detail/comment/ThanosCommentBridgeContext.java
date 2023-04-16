package com.yxcorp.gifshow.ad.detail.comment.ThanosCommentBridgeContext;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uy8.e;
import java.util.Map;
import java.util.HashMap;

public class ThanosCommentBridgeContext implements Serializable, g	// class@001546
{
    public PhotoDetailParam mDetailParam;
    public y mUpdateAtButtonAlphaObserver;
    public static final long serialVersionUID = 0x9e5d18e748e51197;

    public void ThanosCommentBridgeContext(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ThanosCommentBridgeContext.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ThanosCommentBridgeContext.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ThanosCommentBridgeContext.class, new e());
       }else {
          obj.put(ThanosCommentBridgeContext.class, null);
       }
       return obj;
    }
}
