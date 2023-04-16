package com.kuaishou.android.model.mix.BannerMeta;
import java.io.Serializable;
import zp.i;
import java.lang.Object;

public class BannerMeta implements Serializable, i	// class@000bcd
{
    public int mBannerType;
    public String mContent;
    public static final long serialVersionUID = 0x1b6d6840736c88ec;

    public void BannerMeta(){
       super();
    }
    public void updateWithServer(BannerMeta p0){
       this.mBannerType = p0.mBannerType;
       this.mContent = p0.mContent;
    }
    public void updateWithServer(Object p0){
       this.updateWithServer(p0);
    }
}
