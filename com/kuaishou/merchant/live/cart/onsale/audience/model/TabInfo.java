package com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo;
import java.io.Serializable;
import java.lang.Object;

public class TabInfo implements Serializable	// class@00195c
{
    public boolean mCurrent;
    public TabInfo$Icon mIcon;
    public boolean mIsDummy;
    public String mMarkImg;
    public String mTabDesc;
    public String mTabId;
    public int mTabType;
    public static final long serialVersionUID = 0xe615b3ecc434f6c9;

    public void TabInfo(){
       super();
       this.mTabDesc = "";
    }
}
