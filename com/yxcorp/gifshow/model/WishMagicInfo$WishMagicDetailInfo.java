package com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Random;
import java.util.List;

public class WishMagicInfo$WishMagicDetailInfo implements Serializable, Cloneable	// class@001ea7
{
    public List mCandidateWords;
    public String mContent;
    public String mFontPath;
    public int mIndex;
    public String mInputHint;
    public boolean mIsManual;
    public int mMaxInputLength;
    public String mTextColor;
    public String mTitle;
    public String mTitleBg;
    public static final long serialVersionUID = 0x68a2c23981747b8d;

    public void WishMagicInfo$WishMagicDetailInfo(){
       super();
       this.mCandidateWords = new ArrayList();
    }
    public WishMagicInfo$WishMagicDetailInfo clone(){
       Object obj = PatchProxy.apply(null, this, WishMagicInfo$WishMagicDetailInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public String generateContent(){
       String obj = PatchProxy.apply(null, this, WishMagicInfo$WishMagicDetailInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCandidateWords.get(new Random().nextInt(this.mCandidateWords.size()));
       this.mContent = obj;
       this.mIsManual = false;
       return obj;
    }
}
