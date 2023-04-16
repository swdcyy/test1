package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;
import java.lang.String;

public class PhotoAdvertisement$CoverStickerInfo implements Serializable	// class@000915
{
    public PhotoAdvertisement$CoverSticker mCoverSticker;
    public String mImageUrl;
    public String mStickerTitle;
    public static final long serialVersionUID = 0x8d2f6f0774479887;

    public void PhotoAdvertisement$CoverStickerInfo(){
       super();
    }
    public PhotoAdvertisement$CoverSticker getCoverSticker(){
       return this.mCoverSticker;
    }
    public String getImageUrl(){
       return this.mImageUrl;
    }
    public String getStickerTitle(){
       return this.mStickerTitle;
    }
}
