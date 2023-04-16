package com.yxcorp.gifshow.notice.box.event.NoticeBoxSettingEvent;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;

public class NoticeBoxSettingEvent	// class@002182
{
    public final int mIsMute;
    public final String mNoticeBoxId;
    public final int mPlateId;

    public void NoticeBoxSettingEvent(String p0,int p1,int p2){
       super();
       this.mNoticeBoxId = p0;
       this.mPlateId = p1;
       this.mIsMute = p2;
    }
    public static NoticeBoxSettingEvent ofMute(String p0,int p1,int p2){
       if (PatchProxy.isSupport(NoticeBoxSettingEvent.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, NoticeBoxSettingEvent.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new NoticeBoxSettingEvent(p0, p1, p2);
    }
}
