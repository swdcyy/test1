package com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class HotSpotModel implements Serializable	// class@001ef7
{
    public boolean isFoldButtonShowed;
    public boolean isOpenAllButtonShowed;
    public boolean isUnFoldButtonShowed;
    public String mHotBoardLinkUrl;
    public String mHotBoardName;
    public List mHotSpotItems;
    public boolean mState;
    public String mTitleIcon;
    public String mTitleIconDarkUrl;
    public String mTitleName;
    public int mViewState;
    public static final long serialVersionUID = 0x53a241f025f77fc;

    public void HotSpotModel(){
       super();
       this.mHotSpotItems = new ArrayList();
    }
}
