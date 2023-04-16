package com.kuaishou.merchant.home2.feed.model.BrandActivityCardFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;

public class BrandActivityCardFeed extends BaseFeed	// class@001794
{
    public int mHeight;
    public String mId;
    public String mJumpUrl;
    public String mPhotoUrl;
    public CDNUrl[] mPhotoUrls;
    public int mWidth;
    public static final long serialVersionUID = 0xf4727ce179dacfbe;

    public void BrandActivityCardFeed(){
       super();
    }
    public String getBiz(){
       return "CloudReplayActivityFeedLogger";
    }
    public String getId(){
       return this.mId;
    }
}
