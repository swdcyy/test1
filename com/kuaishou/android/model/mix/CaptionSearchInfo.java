package com.kuaishou.android.model.mix.CaptionSearchInfo;
import java.io.Serializable;
import java.lang.Object;

public class CaptionSearchInfo implements Serializable	// class@000bd5
{
    public ArrayList mActionUrlList;
    public int mCaptionSearchType;
    public ArrayList mOffsetList;
    public ArrayList mQueryIdList;
    public boolean mSearchShowed;
    public boolean mSearchShowedInComment;
    public ArrayList mSearchWordList;
    public String mSessionId;

    public void CaptionSearchInfo(){
       super();
    }
}
