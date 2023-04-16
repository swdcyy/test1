package com.tachikoma.component.storage.LocalStorage$d;
import java.lang.Runnable;
import com.tachikoma.component.storage.LocalStorage;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.Throwable;
import wp8.a;

public class LocalStorage$d implements Runnable	// class@000d2b
{
    public final String b;
    public final LocalStorage c;

    public void LocalStorage$d(LocalStorage p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LocalStorage$d.class, "1")) {
          return;
       }
       g.b(this.c.getPreferences(this.b).edit().clear());
       return;
    }
}
