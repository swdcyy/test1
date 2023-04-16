package com.yxcorp.gifshow.activity.share.player.PreviewPlayer$PhotoInfo;
import java.io.Serializable;
import java.util.List;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import java.lang.String;
import java.lang.Object;

public final class PreviewPlayer$PhotoInfo implements Serializable	// class@001397
{
    public final List mAudioInfoList;
    public final String mCoverThumbnail;
    public final InteractStickerInfo mInteractStickerInfo;
    public final String mOriginCoverPath;
    public final List mVideoInfoList;

    public void PreviewPlayer$PhotoInfo(List p0,List p1,InteractStickerInfo p2){
       super(p0, p1, p2, null, "");
    }
    public void PreviewPlayer$PhotoInfo(List p0,List p1,InteractStickerInfo p2,String p3,String p4){
       super();
       this.mVideoInfoList = p0;
       this.mAudioInfoList = p1;
       this.mInteractStickerInfo = p2;
       this.mCoverThumbnail = p3;
       this.mOriginCoverPath = p4;
    }
}
