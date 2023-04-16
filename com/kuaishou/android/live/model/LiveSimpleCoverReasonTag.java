package com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;

public class LiveSimpleCoverReasonTag implements Serializable	// class@000800
{
    public String[] mBackgroundColor;
    public int mBackgroundGradientAngle;
    public String mExtraInfo;
    public LiveSimpleCoverReasonTag$IconInfo mIconInfo;
    public LiveSimpleCoverReasonTag$IconInfo mRightIconInfo;
    public String mTagPattern;
    public int mTagType;
    public LiveSimpleCoverReasonTag$TextInfo mTextInfo;
    public static final long serialVersionUID = 0xbfcb56216a52fe41;

    public void LiveSimpleCoverReasonTag(){
       super();
    }
    public String getHyperTagRecoLogInfo(){
       String obj = PatchProxy.apply(null, this, LiveSimpleCoverReasonTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mExtraInfo)) {
          return null;
       }
       try{
          obj = new JSONObject(this.mExtraInfo).optString("eventTrackInfo");
          if (!TextUtils.isEmpty(obj)) {
             return new JSONObject(obj).optString("reco_log_info");
          }
          return null;
       }catch(org.json.JSONException e0){
       }
    }
}
