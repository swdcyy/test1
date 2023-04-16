package com.kwai.feature.post.api.mediascene.MediaSceneInitParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.feature.post.api.mediascene.MediaSceneServerParams;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;

public class MediaSceneInitParams implements Serializable	// class@001403
{
    public String mCityName;
    public MediaSceneLaunchParams mLaunchParams;
    public String mProfileImage;
    public MediaSceneServerParams mServerParams;
    public static final long serialVersionUID = 0x318088c158a77495;

    public void MediaSceneInitParams(){
       super();
       this.mCityName = "";
       this.mProfileImage = "";
       this.mServerParams = new MediaSceneServerParams();
       this.mLaunchParams = new MediaSceneLaunchParams();
    }
}
