package com.kwai.component.menudot.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.component.menudot.startup.a;
import ok.x;
import java.lang.Object;
import com.kwai.component.menudot.startup.MenuRedDotStartupPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nc5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@0009c4
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt("AutoEliminateRedDotLevel", p0.mAutoEliminateRedDotLevel);
          g.a(uEditor);
       }
       return;
    }
}
