package com.kuaishou.live.common.core.component.redpacket.model.LiveActivityRedPacketGrabResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveActivityRedPacketGrabResponse implements Serializable	// class@00175d
{
    public LiveActivityRedPacketGrabResponse$LiveActivityRedPacketGrabActionButtonInfo mActionButtonInfo;
    public List mBackgroundUrls;
    public List mGrabbedItemList;
    public boolean mIsGrabbed;
    public boolean mIsLuckyCharm;
    public int mLayoutType;
    public String mResultTips;
    public String mResultTipsIconColor;
    public CDNUrl[] mResultTipsIconUrl;
    public String mResultTipsLink;
    public static final long serialVersionUID = 0x64437ab032ecf7c8;

    public void LiveActivityRedPacketGrabResponse(){
       super();
    }
}
