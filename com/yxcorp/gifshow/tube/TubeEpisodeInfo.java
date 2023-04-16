package com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import java.io.Serializable;
import java.lang.Object;

public class TubeEpisodeInfo implements Serializable	// class@001e14
{
    public boolean isShowed;
    public long lastSeenTime;
    public CDNUrl[] mCoverUrls;
    public String mEpisodeActionUrl;
    public String mEpisodeName;
    public long mEpisodeNumber;
    public TubeContentTag mEpisodeTag;
    public String mKoi;
    public CDNUrl[] mOverrideCoverUrls;
    public String mPhotoId;
    public int status;
    public static final long serialVersionUID = 0x3dbb50f07c6943ff;

    public void TubeEpisodeInfo(){
       super();
    }
    public boolean isOffline(){
       boolean b = (this.status == 2)? true: false;
       return b;
    }
    public boolean isOnLine(){
       boolean b = true;
       if (this.status == b) {
       }else {
          b = false;
       }
       return b;
    }
}
