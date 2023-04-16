package com.kwai.framework.logger.config.g;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.logger.config.f;
import ok.x;
import java.lang.Object;
import y96.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w96.m;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class g extends ConfigAutoParseJsonConsumer	// class@001665
{

    public void g(){
       super(f.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = m.a.edit();
          uEditor.putBoolean(b.d("user")+"EnableReleaseShake", p0.mEnableReleaseShake);
          g.a(uEditor);
       }
       return;
    }
}
