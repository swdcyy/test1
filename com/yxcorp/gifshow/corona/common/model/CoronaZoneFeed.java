package com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneCommon;
import jq9.q0;
import java.util.Map;

public class CoronaZoneFeed extends BaseFeed	// class@00122f
{
    public CommonMeta mCommonMeta;
    public CoronaZoneContent mContent;
    public CoronaInfo mCoronaInfo;
    public CoronaZoneCommon mCoronaZoneCommon;
    public CoverMeta mCoverMeta;
    public static final long serialVersionUID = 0x4c98dd69c3ae883a;

    public void CoronaZoneFeed(){
       super();
       this.mCoronaInfo = new CoronaInfo(5, 1);
    }
    public String getId(){
       CoronaZoneFeed obj = PatchProxy.apply(null, this, CoronaZoneFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCoronaZoneCommon;
       CoronaZoneCommon mCoronaZoneI = (obj != null)? obj.mCoronaZoneId: 0;
       return String.valueOf(mCoronaZoneI);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaZoneFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CoronaZoneFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CoronaZoneFeed.class, new q0());
       }else {
          obj.put(CoronaZoneFeed.class, null);
       }
       return obj;
    }
}
