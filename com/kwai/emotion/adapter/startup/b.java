package com.kwai.emotion.adapter.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.emotion.adapter.startup.a;
import ok.x;
import java.lang.Object;
import com.kwai.emotion.adapter.startup.EmotionStartupConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w3d.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import ak5.j;
import java.util.Objects;

public class b extends ConfigAutoParseJsonConsumer	// class@000d73
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt(b.d("user")+"im_emotion_latest_version", p0.mEmotionLatestVersion);
          uEditor.putString(b.d("user")+"emotion_sdk_config", b.e(p0.mKsEmotionSDKConfig));
          g.a(uEditor);
          p0 = j.o();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, j.class, "30")) {
             p0.x(false);
          }
       }
       return;
    }
}
