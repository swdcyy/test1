package com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import ekd.t0;
import java.lang.Long;

public class LiveActivityTaskInfo implements Serializable	// class@000f78
{
    public long mSubBizId;
    public String mTaskBackUrl;
    public long mTaskId;
    public String mTaskToken;
    public static final long serialVersionUID = 0xaca3f789c61b0334;

    public void LiveActivityTaskInfo(){
       super();
    }
    public static LiveActivityTaskInfo parseFromSourceUrl(String p0){
       LiveActivityTaskInfo liveActivity = null;
       Object obj = PatchProxy.applyOneRefs(p0, liveActivity, LiveActivityTaskInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0)) {
          liveActivity = LiveActivityTaskInfo.parseFromUri(Uri.parse(p0));
       }
       return liveActivity;
    }
    public static LiveActivityTaskInfo parseFromUri(Uri p0){
       LiveActivityTaskInfo obj = PatchProxy.applyOneRefs(p0, null, LiveActivityTaskInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveActivityTaskInfo();
       if (("kwai").equals(p0.getScheme())) {
          String str = x0.a(p0, "taskId");
          String str1 = x0.a(p0, "taskToken");
          String str2 = x0.a(p0, "subBizId");
          String str3 = x0.a(p0, "taskBackUrl");
          if (!TextUtils.x(str) && t0.a(str)) {
             obj.mTaskId = Long.parseLong(str);
          }
          if (!TextUtils.x(str1)) {
             obj.mTaskToken = str1;
          }
          if (!TextUtils.x(str2) && t0.a(str2)) {
             obj.mSubBizId = Long.parseLong(str2);
          }
          if (!TextUtils.x(str3)) {
             obj.mTaskBackUrl = str3;
          }
       }
       return obj;
    }
}
