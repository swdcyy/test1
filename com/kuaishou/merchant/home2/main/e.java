package com.kuaishou.merchant.home2.main.e;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kuaishou.merchant.home2.main.Prefetch;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import java.util.List;
import java.util.Collections;
import zw3.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class e implements Callable	// class@001811
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object call(){
       List list;
       if (!Prefetch.i()) {
          a.s(MerchantHomeLogBiz.MerchantCache, "Prefetch", "merchant cache switch not enable, return empty list");
          list = Collections.emptyList();
       }else {
          list = List.class;
          String str = b.a.getString(b.d("user")+"merchant_home_prefetch_params_cache", "null");
          list = (str == null || str == "")? null: b.a(str, list);
          if (list == null) {
             list = new ArrayList();
          }
       }
       return list;
    }
}
