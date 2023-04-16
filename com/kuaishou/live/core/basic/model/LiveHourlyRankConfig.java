package com.kuaishou.live.core.basic.model.LiveHourlyRankConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveHourlyRankConfig implements Serializable	// class@000874
{
    public QLivePlayConfig$NoticeContent mCommentMessage;
    public boolean mEnableAudienceContributionRank;
    public boolean mEnablePopularityRank;
    public String mHourlyRankNoticeContent;
    public boolean mIsBattlePopularityEnabled;
    public static final long serialVersionUID = 0xf8aa14dfe62e6fbe;

    public void LiveHourlyRankConfig(){
       super();
    }
}
