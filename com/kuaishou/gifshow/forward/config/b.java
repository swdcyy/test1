package com.kuaishou.gifshow.forward.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kuaishou.gifshow.forward.config.a;
import ok.x;
import java.lang.Object;
import o80.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n80.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kuaishou.gifshow.forward.config.ShareConfigPojo;

public class b extends ConfigAutoParseJsonConsumer	// class@0019cc
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences a = a.a;
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean("EnableForeignAppShare", p0.mEnableForeignAppShare);
          uEditor.putString("forwardPanelConfig", b.e(p0.mForwardPanelConfig));
          uEditor.putString("ForwardPanelConfigV2", b.e(p0.mForwardPanelConfigV2));
          uEditor.putString("SharePanelInitInfo", p0.mSharePanelInitInfo);
          uEditor.putString("ShareStyleMap", b.e(p0.mShareStyleMap));
          g.a(uEditor);
          p0 = p0.mShareConfigPojo;
          if (p0 != null) {
             SharedPreferences$Editor uEditor1 = a.edit();
             uEditor1.putString("CopylinkSuccessToast", p0.mCopylinkSuccessToast);
             g.a(uEditor1);
          }
       }
       return;
    }
}
