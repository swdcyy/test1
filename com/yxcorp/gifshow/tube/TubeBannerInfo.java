package com.yxcorp.gifshow.tube.TubeBannerInfo;
import java.io.Serializable;
import java.lang.Object;

public class TubeBannerInfo implements Serializable	// class@001dff
{
    public String actionUrl;
    public int bannerId;
    public boolean hadShowed;
    public ArrayList imageUrls;
    public static final long serialVersionUID = 0x6d52d83795fd0335;

    public void TubeBannerInfo(){
       super();
       this.bannerId = 0;
       this.hadShowed = false;
    }
}
