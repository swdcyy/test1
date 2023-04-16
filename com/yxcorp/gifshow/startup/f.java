package com.yxcorp.gifshow.startup.f;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.startup.e;
import ok.x;
import java.lang.Object;
import yjc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkc.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class f extends ConfigAutoParseJsonConsumer	// class@001d87
{

    public void f(){
       super(e.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("enableRelatedHotspot", p0.mEnableRelatedHotspot);
          g.a(uEditor);
       }
       return;
    }
}
