package com.kuaishou.android.model.mix.SameFrameInfo;
import java.io.Serializable;
import java.lang.Object;

public class SameFrameInfo implements Serializable	// class@000deb
{
    public boolean mAllowSameFrame;
    public int mAvailableDepth;
    public int mCurrentDepth;
    public List mLrcUrls;
    public String mOriginPhotoId;
    public SameFrameModel mSameFrameModel;
    public boolean mShowSameFrameCurrentTag;
    public String mUserName;
    public static final long serialVersionUID = 0xb12985d6541c85f;

    public void SameFrameInfo(){
       super();
    }
}
