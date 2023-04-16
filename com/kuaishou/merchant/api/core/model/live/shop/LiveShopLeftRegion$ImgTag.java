package com.kuaishou.merchant.api.core.model.live.shop.LiveShopLeftRegion$ImgTag;
import java.io.Serializable;
import java.lang.Object;

public class LiveShopLeftRegion$ImgTag implements Serializable	// class@001547
{
    public int mPosition;
    public Commodity$IconLabel mTag;
    public static final long serialVersionUID = 0x56b8e49ddde10806;

    public void LiveShopLeftRegion$ImgTag(){
       super();
    }
    public boolean isValid(){
       boolean b = (this.mTag != null)? true: false;
       return b;
    }
}
