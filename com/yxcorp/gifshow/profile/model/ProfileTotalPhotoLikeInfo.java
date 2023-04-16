package com.yxcorp.gifshow.profile.model.ProfileTotalPhotoLikeInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class ProfileTotalPhotoLikeInfo implements Serializable	// class@0013b4
{
    public CDNUrl[] mIconUrl;
    public List mLikeTexts;
    public String mLinkUrl;
    public static final long serialVersionUID = 0x5c27c09b4644bd84;

    public void ProfileTotalPhotoLikeInfo(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mIconUrl = uCDNUrlArray;
    }
}
