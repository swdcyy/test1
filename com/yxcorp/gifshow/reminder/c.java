package com.yxcorp.gifshow.reminder.c;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.reminder.b;
import ok.x;
import java.lang.Object;
import pt7.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mw4.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class c extends ConfigAutoParseJsonConsumer	// class@001a67
{

    public void c(){
       super(b.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt("EnableSystemPushBannerPeriod", p0.mEnableSystemPushBannerPeriod);
          uEditor.putString(b.d("user")+"friendTab", b.e(p0.mFriendTabConfig));
          uEditor.putString(b.d("user")+"notifyMixConfig", b.e(p0.mMixConfig));
          uEditor.putString(b.d("user")+"newsSlideConfig", b.e(p0.mNewsSlideConfig));
          g.a(uEditor);
       }
       return;
    }
}
