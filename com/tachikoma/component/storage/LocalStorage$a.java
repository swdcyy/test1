package com.tachikoma.component.storage.LocalStorage$a;
import java.lang.Runnable;
import com.tachikoma.component.storage.LocalStorage;
import java.lang.String;
import java.lang.Object;
import com.tkruntime.v8.JsValueRef;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.HashMap;
import com.google.gson.Gson;
import ho8.a;
import oe6.g;
import java.lang.Integer;
import java.util.Map;
import java.lang.Throwable;

public class LocalStorage$a implements Runnable	// class@000d28
{
    public final String b;
    public final Object c;
    public final String d;
    public final JsValueRef e;
    public final LocalStorage f;

    public void LocalStorage$a(LocalStorage p0,String p1,Object p2,String p3,JsValueRef p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LocalStorage$a.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = this.f.getPreferences(this.b).edit();
       HashMap hashMap = new HashMap();
       hashMap.put("data", this.c);
       uEditor.putString(this.d, a.a().q(hashMap));
       if (g.b(uEditor)) {
          HashMap hashMap1 = new HashMap();
          hashMap1.put("code", Integer.valueOf(1));
          hashMap1.put("message", "success");
          this.f.callback(false, this.e, objArray, hashMap1);
       }else {
          this.f.onFailure(false, this.e, "setItem commit failure");
       }
       return;
    }
}
