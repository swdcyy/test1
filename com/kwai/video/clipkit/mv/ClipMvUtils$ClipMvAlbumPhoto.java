package com.kwai.video.clipkit.mv.ClipMvUtils$ClipMvAlbumPhoto;
import com.kwai.video.clipkit.mv.ClipMvUtils$ClipMvAlbumPhoto$Builder;
import java.lang.Object;
import com.kwai.video.clipkit.mv.ClipMvUtils$1;

public final class ClipMvUtils$ClipMvAlbumPhoto	// class@001aa4
{
    public String mAssetTag;
    public String mCustomImagePath;
    public double mDuration;
    public int mGroupId;
    public ArrayList mPaths;
    public String mTextMarker;

    public void ClipMvUtils$ClipMvAlbumPhoto(ClipMvUtils$ClipMvAlbumPhoto$Builder p0){
       super();
       this.mPaths = p0.paths;
       this.mDuration = p0.duration;
       this.mAssetTag = p0.assetTag;
       this.mTextMarker = p0.textMarker;
       this.mCustomImagePath = p0.customImagePath;
       this.mGroupId = p0.groupId;
    }
    public void ClipMvUtils$ClipMvAlbumPhoto(ClipMvUtils$ClipMvAlbumPhoto$Builder p0,ClipMvUtils$1 p1){
       super(p0);
    }
}
