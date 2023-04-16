package com.kuaishou.live.core.voiceparty.model.VoicePartyBackground;
import java.io.Serializable;
import java.lang.Object;

public class VoicePartyBackground implements Serializable	// class@0017ae
{
    public QMedia mBackgroundImage;
    public String mDynamicBackgroundResMd5;
    public int mDynamicBackgroundResType;
    public int mId;
    public int mPicType;
    public List mThumbnailList;
    public List mUrlList;
    public static final long serialVersionUID = 0x18c11e296f543899;

    public void VoicePartyBackground(){
       super();
    }
    public boolean isAlbumImage(){
       boolean b = (this.mPicType == 2)? true: false;
       return b;
    }
}
