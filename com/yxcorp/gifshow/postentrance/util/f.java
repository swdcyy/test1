package com.yxcorp.gifshow.postentrance.util.f;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.postentrance.util.e;
import ok.x;
import java.lang.Object;
import a0c.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ezb.k;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class f extends ConfigAutoParseJsonConsumer	// class@001095
{

    public void f(){
       super(e.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = k.a.edit();
          uEditor.putString("localBubbleFrequency", b.e(p0.mHomePostLocalBubbleFrequencyMap));
          uEditor.putString("posterShowStartConfig", b.e(p0.mPostShowStartUpInfo));
          uEditor.putString("publishGuide", b.e(p0.mPublishGuideInfo));
          uEditor.putString("publishGuides", b.e(p0.mPublishGuidesInfo));
          g.a(uEditor);
       }
       return;
    }
}
