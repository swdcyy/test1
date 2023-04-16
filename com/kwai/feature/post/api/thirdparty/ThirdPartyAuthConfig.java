package com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig;
import java.lang.Object;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$IdIndexer;

public class ThirdPartyAuthConfig	// class@00144f
{
    public ThirdPartyAuthConfig$IdIndexer mIdIndexer;
    public ThirdPartyAuthConfig$Profile[] mProfiles;

    public void ThirdPartyAuthConfig(){
       super();
       this.mIdIndexer = new ThirdPartyAuthConfig$IdIndexer(this);
    }
}
