package com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter$RankTab;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class LiveGzoneAudienceRankTabPresenter$RankTab extends Enum	// class@000e1e
{
    public String mRouterId;
    public String mTabId;
    public static final LiveGzoneAudienceRankTabPresenter$RankTab[] $VALUES;
    public static final LiveGzoneAudienceRankTabPresenter$RankTab FANS_GROUP_RANK;
    public static final LiveGzoneAudienceRankTabPresenter$RankTab WEEKLY_RANK;

    static {
       LiveGzoneAudienceRankTabPresenter$RankTab rankTab = new LiveGzoneAudienceRankTabPresenter$RankTab("WEEKLY_RANK", 0, "weekly_rank", "-2");
       LiveGzoneAudienceRankTabPresenter$RankTab.WEEKLY_RANK = rankTab;
       LiveGzoneAudienceRankTabPresenter$RankTab rankTab1 = new LiveGzoneAudienceRankTabPresenter$RankTab("FANS_GROUP_RANK", 1, "fans_group_rank", "-1");
       LiveGzoneAudienceRankTabPresenter$RankTab.FANS_GROUP_RANK = rankTab1;
       LiveGzoneAudienceRankTabPresenter$RankTab[] rankTabArray = new LiveGzoneAudienceRankTabPresenter$RankTab[]{rankTab,rankTab1};
       LiveGzoneAudienceRankTabPresenter$RankTab.$VALUES = rankTabArray;
    }
    public void LiveGzoneAudienceRankTabPresenter$RankTab(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.mTabId = p2;
       this.mRouterId = p3;
    }
    public static LiveGzoneAudienceRankTabPresenter$RankTab fromRouterId(String p0){
       object oobject;
       LiveGzoneAudienceRankTabPresenter$RankTab[] obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAudienceRankTabPresenter$RankTab.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveGzoneAudienceRankTabPresenter$RankTab.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = obj[i];
          if (TextUtils.equals(oobject.mRouterId, p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static LiveGzoneAudienceRankTabPresenter$RankTab valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveGzoneAudienceRankTabPresenter$RankTab.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveGzoneAudienceRankTabPresenter$RankTab.class, p0);
    }
    public static LiveGzoneAudienceRankTabPresenter$RankTab[] values(){
       Object obj = PatchProxy.apply(null, null, LiveGzoneAudienceRankTabPresenter$RankTab.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveGzoneAudienceRankTabPresenter$RankTab.$VALUES.clone();
    }
}
