package com.kwai.nearby.model.NearbySecondaryFeedResponse$HeadMessage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.nearby.model.NearbyCommonTag;
import java.lang.CharSequence;
import android.text.TextUtils;

public class NearbySecondaryFeedResponse$HeadMessage implements Serializable	// class@001012
{
    public DarkLightModel mBgImgUrl;
    public List mButtons;
    public String mCoverUrl;
    public String mSubtitle;
    public NearbyCommonTag mTag;
    public String mTitle;
    public static final long serialVersionUID = 0x84c59addc91c8c55;

    public void NearbySecondaryFeedResponse$HeadMessage(){
       super();
    }
    public boolean hasValidTag(){
       NearbySecondaryFeedResponse$HeadMessage obj = PatchProxy.apply(null, this, NearbySecondaryFeedResponse$HeadMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mTag;
       boolean b = (obj != null && (!TextUtils.isEmpty(obj.mText) || this.mTag.mTag != null))? true: false;
       return b;
    }
}
