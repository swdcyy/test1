package com.yxcorp.gifshow.commercial.common.model.AdUnionFollowInfo$LiveInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class AdUnionFollowInfo$LiveInfo implements Serializable	// class@001134
{
    public boolean mIsLiving;
    public String mLiveStreamId;
    public String mLiveTitle;
    public static final long serialVersionUID = 0x7a3f3e066cbda6d3;

    public void AdUnionFollowInfo$LiveInfo(){
       super();
    }
    public boolean isLiving(){
       Object obj = PatchProxy.apply(null, this, AdUnionFollowInfo$LiveInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIsLiving != null && !TextUtils.isEmpty(this.mLiveStreamId))? true: false;
       return b;
    }
}
