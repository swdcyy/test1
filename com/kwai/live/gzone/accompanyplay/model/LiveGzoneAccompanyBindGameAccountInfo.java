package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyBindGameAccountInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyJsonInfoItem;

public class LiveGzoneAccompanyBindGameAccountInfo implements Serializable, a	// class@000c27
{
    public String mGameAccountDesc;
    public String mGameUid;
    public List mInfoList;

    public void LiveGzoneAccompanyBindGameAccountInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyBindGameAccountInfo.class, "1")) {
          return;
       }
       LiveGzoneAccompanyBindGameAccountInfo tmGameAccoun = this.mGameAccountDesc;
       if (tmGameAccoun != null) {
          this.mInfoList = LiveGzoneAccompanyJsonInfoItem.fromJsonString(tmGameAccoun);
       }
       return;
    }
}
