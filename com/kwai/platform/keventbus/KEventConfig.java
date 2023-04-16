package com.kwai.platform.keventbus.KEventConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.platform.keventbus.KEventMap;

public class KEventConfig	// class@001288
{

    public void KEventConfig(){
       super();
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, KEventConfig.class, "1")) {
          return;
       }
       KEventMap c = KEventMap.c;
       c.putEventType("KSSocialNoticeBoxSettingNotification", "com.yxcorp.gifshow.notice.box.event.NoticeBoxSettingEvent");
       c.putEventType("UIApplicationUserDidTakeScreenshotNotification", "com.kwai.feature.component.screenshot.ScreenshotUserEvent");
       return;
    }
}
