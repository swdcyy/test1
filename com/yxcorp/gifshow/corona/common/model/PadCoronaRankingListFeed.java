package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoronaInfo;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import jq9.v0;
import java.util.Map;

public class PadCoronaRankingListFeed extends BaseFeed	// class@001236
{
    public CommonMeta commonMeta;
    public CoronaInfo coronaInfo;
    public PadCoronaRankingListMeta rankingListMeta;
    public static final long serialVersionUID = 0xc946283e0c553fbe;

    public void PadCoronaRankingListFeed(){
       super();
       this.coronaInfo = new CoronaInfo(51, 0);
    }
    public ArrayList getHotTabList(){
       PadCoronaRankingListFeed obj = PatchProxy.apply(null, this, PadCoronaRankingListFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.rankingListMeta;
       if (obj != null) {
          return obj.hotTabList;
       }
       return new ArrayList();
    }
    public String getId(){
       PadCoronaRankingListFeed obj = PatchProxy.apply(null, this, PadCoronaRankingListFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.rankingListMeta;
       if (obj != null) {
          return String.valueOf(obj.coronaZoneId);
       }
       return "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(PadCoronaRankingListFeed.class, new v0());
       }else {
          obj.put(PadCoronaRankingListFeed.class, null);
       }
       return obj;
    }
    public String getRightZoneText(){
       PadCoronaRankingListFeed trankingList = this.rankingListMeta;
       if (trankingList != null) {
          return trankingList.rightZoneText;
       }
       return "";
    }
    public String getTitle(){
       PadCoronaRankingListFeed trankingList = this.rankingListMeta;
       if (trankingList != null) {
          return trankingList.title;
       }
       return "";
    }
}
