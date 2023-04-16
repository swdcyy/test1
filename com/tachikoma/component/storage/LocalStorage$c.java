package com.tachikoma.component.storage.LocalStorage$c;
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

public class LocalStorage$c implements Runnable	// class@000d2a
{
    public final String b;
    public final String c;
    public final LocalStorage d;

    public void LocalStorage$c(LocalStorage p0,String p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LocalStorage$c.class, "1")) {
          return;
       }
       g.b(this.d.getPreferences(this.b).edit().remove(this.c));
       return;
    }
}
