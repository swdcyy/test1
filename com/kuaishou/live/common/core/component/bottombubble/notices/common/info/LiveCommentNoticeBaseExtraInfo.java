package com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.RuntimeException;

public class LiveCommentNoticeBaseExtraInfo implements Serializable	// class@000f95
{
    public long mDelayDisplayTimeMs;
    public static final long serialVersionUID = 0xc3a4380c05d45779;

    public void LiveCommentNoticeBaseExtraInfo(){
       super();
    }
    public static Object parseExtraInfo(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveCommentNoticeBaseExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       try{
          return new Gson().h(p0, p1);
       }catch(com.google.gson.JsonParseException e3){
          e3.printStackTrace();
          return v1;
       }
    }
}
