package com.tachikoma.component.storage.LocalStorage$b;
import java.lang.Runnable;
import com.tachikoma.component.storage.LocalStorage;
import java.lang.String;
import com.tkruntime.v8.JsValueRef;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import ho8.a;
import java.util.Map;
import java.lang.Throwable;

public class LocalStorage$b implements Runnable	// class@000d29
{
    public final String b;
    public final String c;
    public final JsValueRef d;
    public final LocalStorage e;

    public void LocalStorage$b(LocalStorage p0,String p1,String p2,JsValueRef p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LocalStorage$b.class, "1")) {
          return;
       }
       SharedPreferences preferences = this.e.getPreferences(this.b);
       if (!preferences.contains(this.c)) {
          this.e.onFailure(true, this.d, "key: "+this.c+" is not exists");
          return;
       }else {
          String str = preferences.getString(this.c, "");
          if (!TextUtils.x(str)) {
             Map map = a.a().h(str, Map.class);
             if (map != null) {
                Object obj = map.get("data");
                if (obj != null) {
                   this.e.onGetSuccess(obj, this.d);
                }
             }
             return;
          }else {
             this.e.onFailure(true, this.d, "getItem result is null");
             return;
          }
       }
    }
}
