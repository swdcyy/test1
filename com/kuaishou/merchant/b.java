package com.kuaishou.merchant.b;
import yxc.a;
import java.lang.Object;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.basic.util.f;
import android.content.ComponentName;
import java.lang.Class;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Exception;
import p74.a;
import java.lang.Throwable;
import o74.a;
import ji7.a;
import java.lang.ClassLoader;

public final class b implements a	// class@00157d
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(Context p0,Intent p1,String p2){
       boolean b;
       try{
          b = false;
          if (p0 != null && (p1 == null || (TextUtils.isEmpty(p2) || (!f.a(p2) || MerchantYodaWebViewActivity.class.isAssignableFrom(Class.forName(p1.getComponent().getClassName())))))) {
          label_0058 :
             return b;
          }
       }catch(java.lang.Exception e9){
          MerchantCommonLogBiz kERNELS = MerchantCommonLogBiz.KERNELS;
          String message = e9.getMessage();
          try{
             a.l(kERNELS, "MerchantPluginImpl", message, e9);
             if (MerchantYodaWebViewActivity.class.isAssignableFrom(Class.forName(p1.getComponent().getClassName(), 1, a.b))) {
                goto label_0058 ;
             }
          }catch(java.lang.Exception e1){
             a.l(MerchantCommonLogBiz.KERNELS, "MerchantPluginImpl", MerchantYodaWebViewActivity.class.isAssignableFrom(Class.forName(p1.getComponent().getClassName(), 1, a.b)).getMessage(), e1);
          }
       }
       p1.setClass(p0, MerchantYodaWebViewActivity.class);
       b = true;
       goto label_0058 ;
    }
}
