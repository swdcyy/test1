package com.kwai.framework.debuglog.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.debuglog.a;
import ok.x;
import java.lang.Object;
import f66.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.c;
import f66.g;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.framework.debuglog.DiagnosisClientLogLevel;

public class b extends ConfigAutoParseJsonConsumer	// class@001512
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, str)) {
       }else {
          b mDiagnosisCl = p0.mDiagnosisClientLogLevel;
          if (!PatchProxy.applyVoidOneRefs(mDiagnosisCl, null, c.class, str)) {
             str = "diagnosis_log_level";
             if (mDiagnosisCl == null) {
                g.a(g.a.edit().remove(str));
             }else {
                SharedPreferences$Editor uEditor1 = g.a.edit();
                uEditor1.putInt(str, mDiagnosisCl.getValue());
                g.a(uEditor1);
             }
          }
          SharedPreferences$Editor uEditor = g.a.edit();
          uEditor.putBoolean("enable_debug_log_of_event", p0.mEnableDebugLogOfEvent);
          g.a(uEditor);
       }
       return;
    }
}
