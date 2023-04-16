package com.kuaishou.live.core.show.announcement.model.LiveSubscribeBriefInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveSubscribeBriefInfo implements Serializable	// class@0009b8
{
    public LiveSubscribeBookStatus mBookStatus;
    public String mLiveSubscribeId;
    public String mLiveSubscribeTitle;
    public static final long serialVersionUID = 0xc7d4e1c98a33c82b;

    public void LiveSubscribeBriefInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSubscribeBriefInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof LiveSubscribeBriefInfo) {
          return TextUtils.n(p0.mLiveSubscribeId, this.mLiveSubscribeId);
       }
       return false;
    }
}
