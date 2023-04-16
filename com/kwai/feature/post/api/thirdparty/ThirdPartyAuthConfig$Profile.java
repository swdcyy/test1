package com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$Profile;
import java.lang.Object;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$PicEditPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$PicSharePage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoPreClipPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoAICutPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoEditPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoSharePage;

public class ThirdPartyAuthConfig$Profile	// class@00144a
{
    public boolean mAllowExtraInfo;
    public boolean mAllowSoundTrack;
    public boolean mAllowTag;
    public int mId;
    public ThirdPartyAuthConfig$PicEditPage mPicEditPage;
    public ThirdPartyAuthConfig$PicSharePage mPicSharePage;
    public ThirdPartyAuthConfig$VideoAICutPage mVideoAICut;
    public ThirdPartyAuthConfig$VideoEditPage mVideoEdit;
    public ThirdPartyAuthConfig$VideoPreClipPage mVideoPreClip;
    public ThirdPartyAuthConfig$VideoSharePage mVideoShare;

    public void ThirdPartyAuthConfig$Profile(){
       super();
       this.mPicEditPage = new ThirdPartyAuthConfig$PicEditPage();
       this.mPicSharePage = new ThirdPartyAuthConfig$PicSharePage();
       this.mVideoPreClip = new ThirdPartyAuthConfig$VideoPreClipPage();
       this.mVideoAICut = new ThirdPartyAuthConfig$VideoAICutPage();
       this.mVideoEdit = new ThirdPartyAuthConfig$VideoEditPage();
       this.mVideoShare = new ThirdPartyAuthConfig$VideoSharePage();
    }
}
