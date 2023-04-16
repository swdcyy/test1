package com.kwai.feature.api.feed.home.bubble.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.feature.api.feed.home.bubble.a;
import ok.x;
import java.lang.Object;
import com.kwai.feature.api.feed.home.bubble.HomeBubbleStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kn5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@000ef3
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("bubbleThresholdConfig", b.e(p0.mBubbleThresholdConfig));
          g.a(uEditor);
       }
       return;
    }
}
