package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class PhotoAdvertisement$CoverSticker implements Serializable	// class@000911
{
    public int mStickerLocation;
    public String mStickerStyle;
    public static final long serialVersionUID = 0x671d7e1702c18d88;

    public void PhotoAdvertisement$CoverSticker(){
       super();
    }
    public int getStickerLocation(){
       return this.mStickerLocation;
    }
    public String getStickerStyle(){
       return this.mStickerStyle;
    }
}
