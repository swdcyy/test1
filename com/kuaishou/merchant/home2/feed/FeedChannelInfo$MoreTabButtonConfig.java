package com.kuaishou.merchant.home2.feed.FeedChannelInfo$MoreTabButtonConfig;
import java.io.Serializable;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo$MoreTabButtonConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class FeedChannelInfo$MoreTabButtonConfig implements Serializable	// class@001781
{
    public String moreTabIcon;
    public String moreTabUrl;
    public static final FeedChannelInfo$MoreTabButtonConfig$a Companion;
    public static final long serialVersionUID;

    static {
       FeedChannelInfo$MoreTabButtonConfig.Companion = new FeedChannelInfo$MoreTabButtonConfig$a(null);
    }
    public void FeedChannelInfo$MoreTabButtonConfig(){
       super();
    }
    public final String getMoreTabIcon(){
       return this.moreTabIcon;
    }
    public final String getMoreTabUrl(){
       return this.moreTabUrl;
    }
    public final void setMoreTabIcon(String p0){
       this.moreTabIcon = p0;
    }
    public final void setMoreTabUrl(String p0){
       this.moreTabUrl = p0;
    }
}
