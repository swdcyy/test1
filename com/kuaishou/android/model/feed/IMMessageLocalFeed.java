package com.kuaishou.android.model.feed.IMMessageLocalFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yp.t;
import java.util.Map;

public class IMMessageLocalFeed extends BaseFeed	// class@000aee
{
    public CommonMeta mCommonMeta;
    public int mMsgFeedType;

    public void IMMessageLocalFeed(){
       super();
       this.mMsgFeedType = 0;
       this.mCommonMeta = new CommonMeta();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, IMMessageLocalFeed.class, "2")) {
          return;
       }
       super.afterDeserialize();
       if (this.mCommonMeta == null) {
          this.mCommonMeta = new CommonMeta();
       }
       return;
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, IMMessageLocalFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mCommonMeta.mSharedMsgSeq);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMMessageLocalFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, IMMessageLocalFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(IMMessageLocalFeed.class, new t());
       }else {
          obj.put(IMMessageLocalFeed.class, null);
       }
       return obj;
    }
    public boolean isMessageImageType(){
       boolean b = true;
       if (this.mMsgFeedType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isMessageVideoType(){
       boolean b = (this.mMsgFeedType == 2)? true: false;
       return b;
    }
}
