package com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a2a.c;
import java.util.Map;
import java.util.HashMap;

public class CommentLimitInfo implements Serializable, g	// class@0015b7
{
    public int mCurrentFriendsVisible;
    public int mFriendsVisible;
    public QPhoto mPhoto;
    public static final long serialVersionUID = 0x78c2d03d4ce52837;

    public void CommentLimitInfo(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentLimitInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CommentLimitInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CommentLimitInfo.class, new c());
       }else {
          obj.put(CommentLimitInfo.class, null);
       }
       return obj;
    }
}
