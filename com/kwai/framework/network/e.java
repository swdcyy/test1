package com.kwai.framework.network.e;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.network.d;
import ok.x;
import java.lang.Object;
import ta6.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ta6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class e extends ConfigAutoParseJsonConsumer	// class@0017c6
{

    public void e(){
       super(d.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("UQaTag", p0.uQaTag);
          g.a(uEditor);
          PatchProxy.onMethodExit(e.class, "2");
       }
       return;
    }
}
