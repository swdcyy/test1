package com.kwai.feature.component.photofeatures.collect.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.feature.component.photofeatures.collect.config.a;
import ok.x;
import java.lang.Object;
import yy5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wy5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001222
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("buttonGuidanceSetting", b.e(p0.mStartUpCollectConfig));
          g.a(uEditor);
       }
       return;
    }
}
