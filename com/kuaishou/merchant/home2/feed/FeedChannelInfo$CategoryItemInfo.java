package com.kuaishou.merchant.home2.feed.FeedChannelInfo$CategoryItemInfo;
import java.io.Serializable;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo$CategoryItemInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class FeedChannelInfo$CategoryItemInfo implements Serializable	// class@00177f
{
    public int categoryTabId;
    public String categoryTabName;
    public int categoryTabType;
    public static final FeedChannelInfo$CategoryItemInfo$a Companion;
    public static final long serialVersionUID;

    static {
       FeedChannelInfo$CategoryItemInfo.Companion = new FeedChannelInfo$CategoryItemInfo$a(null);
    }
    public void FeedChannelInfo$CategoryItemInfo(){
       super();
       this.categoryTabName = "";
    }
    public final int getCategoryTabId(){
       return this.categoryTabId;
    }
    public final String getCategoryTabName(){
       return this.categoryTabName;
    }
    public final int getCategoryTabType(){
       return this.categoryTabType;
    }
    public final void setCategoryTabId(int p0){
       this.categoryTabId = p0;
    }
    public final void setCategoryTabName(String p0){
       this.categoryTabName = p0;
    }
    public final void setCategoryTabType(int p0){
       this.categoryTabType = p0;
    }
}
