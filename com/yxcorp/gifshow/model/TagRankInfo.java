package com.yxcorp.gifshow.model.TagRankInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class TagRankInfo implements Serializable	// class@001e9a
{
    public String mButtonScheme;
    public String mIconUrl;
    public int mRank;
    public String mRankText;
    public int mScore;
    public boolean mShown;
    public String mTagId;
    public String mTagName;
    public String mTagScheme;
    public int mTagType;
    public List mTopUsers;
    public int mTotalRankNum;
    public static final long serialVersionUID = 0x6054cded0d6b1fb8;

    public void TagRankInfo(){
       super();
       this.mTopUsers = new ArrayList();
       this.mTotalRankNum = Integer.MAX_VALUE;
    }
}
