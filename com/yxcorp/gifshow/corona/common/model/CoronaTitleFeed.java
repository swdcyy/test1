package com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import rkd.b;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jq9.a0;
import java.util.Map;

public class CoronaTitleFeed extends BaseFeed	// class@001222
{
    public CommonMeta mCommonMeta;
    public CoronaInfo mCoronaInfo;
    public CoronaTitleContent mTitleMeta;
    public static final long serialVersionUID = 0x4c98dd69c3ae883a;

    public void CoronaTitleFeed(){
       super();
       int i = (b.g())? 14: 0;
       this.mCoronaInfo = new CoronaInfo(i, 0);
       return;
    }
    public String getId(){
       CoronaTitleFeed tmTitleMeta = this.mTitleMeta;
       if (tmTitleMeta != null) {
          CoronaTitleContent mId = tmTitleMeta.mId;
          if (mId != null) {
             return mId;
          }
       }
       return "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaTitleFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CoronaTitleFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CoronaTitleFeed.class, new a0());
       }else {
          obj.put(CoronaTitleFeed.class, null);
       }
       return obj;
    }
}
