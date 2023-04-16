package com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yp.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon;
import jq9.g;
import java.util.Map;

public class CoronaBannerFeed extends BaseFeed	// class@0011fc
{
    public CommonMeta mCommonMeta;
    public CoronaBannerCommon mCoronaBannerCommon;
    public CoronaBannerContent mCoronaBannerContent;
    public CoronaInfo mCoronaInfo;
    public CoverMeta mCoverMeta;
    public static final long serialVersionUID = 0x4c98dd69c3ae883a;

    public void CoronaBannerFeed(){
       super();
       this.mCoronaInfo = new CoronaInfo(7, 0);
    }
    public static void registerFeedCheckerClass(){
       if (PatchProxy.applyVoid(null, null, CoronaBannerFeed.class, "1")) {
          return;
       }
       q.d(CoronaBannerFeed.class);
       return;
    }
    public String getId(){
       CoronaBannerFeed obj = PatchProxy.apply(null, this, CoronaBannerFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoronaBannerCommon;
       if (obj == null) {
          return "";
       }
       return String.valueOf(obj.mBannerFeedId);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaBannerFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CoronaBannerFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CoronaBannerFeed.class, new g());
       }else {
          obj.put(CoronaBannerFeed.class, null);
       }
       return obj;
    }
}
