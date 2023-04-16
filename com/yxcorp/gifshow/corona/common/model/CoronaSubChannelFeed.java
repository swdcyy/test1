package com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yp.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon;
import jq9.v;
import java.util.Map;

public class CoronaSubChannelFeed extends BaseFeed	// class@001219
{
    public CommonMeta mCommonMeta;
    public CoronaInfo mCoronaInfo;
    public CoronaSubChannelCommon mCoronaSubChannelCommon;
    public CoronaSubChannelContent mCoronaSubChannelContent;
    public CoverMeta mCoverMeta;
    public static final long serialVersionUID = 0x4c98dd69c3ae883a;

    public void CoronaSubChannelFeed(){
       super();
       this.mCoronaInfo = new CoronaInfo(8, 0);
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, CoronaSubChannelFeed.class, "1")) {
          return;
       }
       q.d(CoronaSubChannelFeed.class);
       return;
    }
    public String getId(){
       CoronaSubChannelFeed obj = PatchProxy.apply(null, this, CoronaSubChannelFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoronaSubChannelCommon;
       if (obj == null) {
          return "";
       }
       return String.valueOf(obj.mSubTabFeedId);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaSubChannelFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CoronaSubChannelFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CoronaSubChannelFeed.class, new v());
       }else {
          obj.put(CoronaSubChannelFeed.class, null);
       }
       return obj;
    }
}
