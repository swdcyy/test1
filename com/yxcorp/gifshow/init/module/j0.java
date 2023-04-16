package com.yxcorp.gifshow.init.module.j0;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.MiniMediaPlayerInitModule;
import x98.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences;
import vid.b;
import java.lang.StringBuilder;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class j0 implements x	// class@0019c6
{
    public static final j0 b;

    static {
       j0.b = new j0();
    }
    public void j0(){
       super();
    }
    public final Object get(){
       a uoa = a.b();
       Objects.requireNonNull(uoa);
       String obj = PatchProxy.apply(null, uoa, a.class, "4");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = SystemUtil.r(a.B);
          if (!TextUtils.isEmpty(obj) && obj.contains(":mini")) {
             SharedPreferences sharedPrefer = b.c(a.B, "mini_preferences_multiprocess_data.dat", 4);
             obj = "mini_preload_ts_"+obj.charAt((obj.length() - b));
             long longx = sharedPrefer.getLong(obj, 0);
             g.a(sharedPrefer.edit().remove(obj));
             if (longx <= 0) {
             }
          }else {
          }
       }
       return Boolean.valueOf(b);
    }
}
