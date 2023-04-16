package com.kuaishou.merchant.live.cart.basic.model.ItemCard;
import java.io.Serializable;
import java.lang.Object;

public class ItemCard implements Serializable	// class@0018fd
{
    public BannerInfo mBannerInfo;
    public Commodity mCommodity;
    public SectionsTitleInfo mSectionsTitleInfo;
    public String mSimpleText;
    public int mType;
    public static final long serialVersionUID = 0xd39d41fcf99df19d;

    public void ItemCard(){
       super();
    }
    public boolean isCommodity(){
       boolean b = true;
       if (this.mType != b || this.mCommodity == null) {
          b = false;
       }
       return b;
    }
}
