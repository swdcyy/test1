package com.yxcorp.gifshow.model.MagicFaceExtraParams;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import lnc.f4;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.CloneNotSupportedException;
import com.yxcorp.gifshow.model.MagicFaceExtraParams$TopicsWithLang;

public class MagicFaceExtraParams implements Serializable, Cloneable	// class@001e54
{
    public String mActivityCountKey;
    public String mActivityId;
    public MagicFaceAuthor mAuthor;
    public CanaryFeature mCanaryFeature;
    public List mExternalResourceDependentKeys;
    public String mExtractType;
    public int[] mFaceIndexList;
    public boolean mIsImmerseMode;
    public String mJumpUrl;
    public String mPlatformMusicId;
    public String mPlatformMusicType;
    public String mPrivacyPolicyTitle;
    public String mPrivacyPolicyUrl;
    public int mRecordId;
    public RuntimeData mRunTimeData;
    public MagicFaceExtraParams$TopicsWithLang mStickerTopic;
    public MagicFaceExtraParams$TopicsWithLang mTopics;
    public VoteConfig mVoteConfig;
    public static final long serialVersionUID = 0x40dac4e2c983ecd1;

    public void MagicFaceExtraParams(){
       super();
    }
    public static String getLanguage(){
       String obj = PatchProxy.apply(null, null, MagicFaceExtraParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f4.a().getLanguage();
       if (TextUtils.isEmpty(obj)) {
          return "en";
       }
       if (obj.startsWith("zh")) {
          return "zh";
       }
       return "en";
    }
    public MagicFaceExtraParams clone(){
       Object obj = PatchProxy.apply(null, this, MagicFaceExtraParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public String getStickerTopic(){
       MagicFaceExtraParams obj = PatchProxy.apply(null, this, MagicFaceExtraParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStickerTopic;
       String str = (obj == null)? "": obj.getTopic(MagicFaceExtraParams.getLanguage());
       return str;
    }
    public String getTopic(){
       MagicFaceExtraParams obj = PatchProxy.apply(null, this, MagicFaceExtraParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mTopics;
       String str = (obj == null)? "": obj.getTopic(MagicFaceExtraParams.getLanguage());
       return str;
    }
}
