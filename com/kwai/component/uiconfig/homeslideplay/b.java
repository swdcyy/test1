package com.kwai.component.uiconfig.homeslideplay.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.component.uiconfig.homeslideplay.a;
import ok.x;
import java.lang.Object;
import com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import th5.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@000beb
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putString("SlidePlayConfig", b.e(p0.mSlidePlayConfig));
          g.a(uEditor);
       }
       return;
    }
}
