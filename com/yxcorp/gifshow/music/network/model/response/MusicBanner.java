package com.yxcorp.gifshow.music.network.model.response.MusicBanner;
import java.io.Serializable;
import java.lang.Object;

public class MusicBanner implements Serializable	// class@002061
{
    public String mBannerJumpUrl;
    public CDNUrl[] mCDNUrl;

    public void MusicBanner(){
       super();
    }
    public boolean isValid(){
       MusicBanner tmCDNUrl = this.mCDNUrl;
       boolean b = (tmCDNUrl != null && (tmCDNUrl.length > 0 && this.mBannerJumpUrl != null))? true: false;
       return b;
    }
}
