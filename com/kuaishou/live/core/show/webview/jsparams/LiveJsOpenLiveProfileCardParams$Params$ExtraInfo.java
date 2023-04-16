package com.kuaishou.live.core.show.webview.jsparams.LiveJsOpenLiveProfileCardParams$Params$ExtraInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;

public class LiveJsOpenLiveProfileCardParams$Params$ExtraInfo implements Serializable	// class@00128a
{
    public int mFollowSource;
    public CDNUrl[] mHeadUrls;
    public LiveFollowExtParams mLiveFollowExtParams;
    public String mName;
    public int mProfileOriginSource;
    public List mRoleInfos;
    public static final long serialVersionUID = 0xf4fa66691ce9faf8;

    public void LiveJsOpenLiveProfileCardParams$Params$ExtraInfo(){
       super();
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
    }
}
