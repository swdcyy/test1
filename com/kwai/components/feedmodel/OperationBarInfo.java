package com.kwai.components.feedmodel.OperationBarInfo;
import java.io.Serializable;
import java.lang.Object;

public class OperationBarInfo implements Serializable	// class@000c2c
{
    public String mDesc;
    public String mDescTextColor;
    public OperationBarInfo$GeneralInfo mGeneralInfo;
    public int mIconHeight;
    public CDNUrl[] mIconUrl;
    public int mIconWidth;
    public String mId;
    public boolean mIsExtraTrendingFeed;
    public String mLink;
    public List mRelatedPhotoList;
    public List mTopTrendingList;
    public String moreTrendingsLink;
    public static final long serialVersionUID = 0x5003f7f8bedaed0a;

    public void OperationBarInfo(){
       super();
    }
}
