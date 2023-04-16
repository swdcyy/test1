package com.kuaishou.merchant.home2.feed.stream.banner.model.BannerFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;

public class BannerFeed extends BaseFeed	// class@0017cf
{
    public List mBannerModels;
    public int mCardType;
    public String mId;

    public void BannerFeed(){
       super();
    }
    public String getBiz(){
       return "BannerFeedLogger";
    }
    public String getId(){
       return this.mId;
    }
}
