package com.kwai.user.base.intimate.a;
import java.lang.Runnable;
import com.kwai.user.base.intimate.b;
import java.lang.Object;
import java.util.Objects;
import ql7.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import lnc.a1;
import android.content.res.AssetManager;
import java.io.InputStreamReader;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.Reader;
import qkd.c;
import fg6.a;
import com.yxcorp.gifshow.model.IntimateResponse;
import java.lang.Class;
import com.google.gson.Gson;
import yu7.b;
import ekd.k1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class a implements Runnable	// class@001990
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       try{
          Objects.requireNonNull(tb);
          String str = a.a.getString("intimate_meta_info", "");
          if (TextUtils.x(str)) {
             str = c.k(new InputStreamReader(SplitAssetHelper.open(a1.c().getAssets(), "intimate_relation_meta_info.json")));
          }
          k1.o(new b(tb, a.a.h(str, IntimateResponse.class)));
       }catch(java.lang.Exception e0){
          Log.d("IntimateRelationConfigManager", "getInfoList "+e0);
       }
       return;
    }
}
