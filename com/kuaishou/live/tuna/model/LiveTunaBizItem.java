package com.kuaishou.live.tuna.model.LiveTunaBizItem;
import java.io.Serializable;
import java.lang.Object;

public class LiveTunaBizItem implements Serializable	// class@000fb5
{
    public TunaButtonModel mActionUrl;
    public JsonElement mBizConfig;
    public int mBizId;
    public String mBizType;
    public String mButtonText;
    public boolean mChecked;
    public String mDesc;
    public CDNUrl[] mIcons;
    public int mItemStyle;
    public CDNUrl[] mSlideIcons;
    public String mSlideTitle;
    public String mTipContent;
    public String mTitle;
    public static final long serialVersionUID = 0xfbb95ba718e62b8;

    public void LiveTunaBizItem(){
       super();
    }
}
