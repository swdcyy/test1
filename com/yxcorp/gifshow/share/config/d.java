package com.yxcorp.gifshow.share.config.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.share.config.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.share.config.SharePageConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n80.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.share.config.SharePageConfigPojo;
import km8.b;
import java.lang.StringBuilder;

public class d extends ConfigAutoParseJsonConsumer	// class@001b7c
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else if(p0 != null){
          SharedPreferences a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean("EnableScreenshotFeedback", p0.mEnableScreenshotFeedback);
          g.a(uEditor);
          p0 = p0.mSharePageConfigPojo;
          if (p0 != null) {
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putBoolean("enableSnapshotShare", p0.mEnableSnapshotShare);
             uEditor1.putBoolean("enableWechatWow", p0.mEnableWechatWow);
             uEditor1.putString("PhotoShareGuideConfig", b.e(p0.mPhotoShareGuideConfig));
             uEditor1.putInt("ScreenShotShareDays", p0.mScreenShotShareDays);
             uEditor1.putInt("ScreenShotShareShowSeconds", p0.mScreenShotShareShowSeconds);
             uEditor1.putInt("ScreenShotShareTimes", p0.mScreenShotShareTimes);
             uEditor1.putBoolean(b.d("user")+"supportImGroupOnShare", p0.mSupportImGroupOnShare);
             g.a(uEditor1);
          }
       }
       return;
    }
}
