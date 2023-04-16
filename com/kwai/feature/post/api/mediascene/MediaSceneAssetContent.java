package com.kwai.feature.post.api.mediascene.MediaSceneAssetContent;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class MediaSceneAssetContent implements Serializable	// class@001400
{
    public int mAssetType;
    public List mAttrInfo;
    public String mContent;
    public int mEllipsis;
    public boolean mIsFakeBold;
    public int mMaxLines;
    public static final long serialVersionUID = 0x47aeac21ea4b824c;

    public void MediaSceneAssetContent(){
       super();
       this.mMaxLines = 1;
       this.mIsFakeBold = false;
       this.mAttrInfo = new ArrayList();
    }
}
