package com.kuaishou.merchant.home2.feed.model.BrandInfo;
import java.io.Serializable;
import java.lang.Object;

public class BrandInfo implements Serializable	// class@001795
{
    public CDNUrl[] mBrandImgCdnUrls;
    public String mBrandImgUrl;
    public String mBrandTitle;
    public String mBrandTitleColor;
    public static final BrandInfo EMPTY;
    public static final long serialVersionUID;

    static {
       BrandInfo.EMPTY = new BrandInfo();
    }
    public void BrandInfo(){
       super();
    }
}
