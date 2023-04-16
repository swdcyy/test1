package com.kwai.framework.logger.config.e;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.logger.config.d;
import ok.x;
import java.lang.Object;
import y96.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w96.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class e extends ConfigAutoParseJsonConsumer	// class@001663
{

    public void e(){
       super(d.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putBoolean("diable_log", p0.mClientProtoLogOff);
          g.a(uEditor);
       }
       return;
    }
}
