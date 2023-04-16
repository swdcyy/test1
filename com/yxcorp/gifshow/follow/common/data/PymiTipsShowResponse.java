package com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import java.io.Serializable;
import java.lang.Object;

public class PymiTipsShowResponse implements Serializable	// class@001026
{
    public boolean mCollapse;
    public int mFrequentUserContentType;
    public boolean mIsNormalFrequentUser;
    public String mLlsid;
    public String mMoreFrequentUserLinkUrl;
    public PymiTipsShowResponse$PymiTipModel mPymiUserBar;
    public boolean mShowFrequentUserManagementEntrance;
    public boolean mShowFriendEntry;
    public int mShowStyle;
    public String mSubTitle;
    public static final long serialVersionUID = 0x385f1c12f2b8ab3c;

    public void PymiTipsShowResponse(){
       super();
       this.mShowStyle = 0;
    }
}
