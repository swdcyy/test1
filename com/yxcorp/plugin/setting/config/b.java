package com.yxcorp.plugin.setting.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.plugin.setting.config.a;
import ok.x;
import java.lang.Object;
import hgd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yfd.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@000840
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("EnableReleaseShake", p0.mEnableReleaseShake);
          g.a(uEditor);
       }
       return;
    }
}