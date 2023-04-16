package com.kwai.framework.network.a;
import erd.g;
import retrofit2.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import ta6.c;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import zb6.a;
import okhttp3.Request;
import okhttp3.HttpUrl;
import com.yxcorp.retrofit.model.KwaiException;
import okhttp3.Response;
import njd.a;
import retrofit2.HttpException;
import retrofit2.p;
import com.yxcorp.retrofit.model.RetrofitException;
import java.lang.StringBuilder;
import java.net.URL;

public class a implements g	// class@00178e
{
    public final a b;

    public void a(a p0){
       super();
       this.b = p0;
    }
    public void accept(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          int i = 0;
          if (!p0.C(a.a().a())) {
             Object[] objArray = new Object[i];
             c.C().t("Network error", "Network not connect", objArray);
          }else if(!a.t().d("kswitch_key_elastic_task_opt_enable", i)){
             str = a.d(p0);
          }else {
             str = "";
          }
          String str1 = a.c(p0);
          HttpUrl httpUrl = this.b.request().url();
          if (p0 instanceof KwaiException) {
             httpUrl = p0.mResponse.n().request().url();
          }else if(p0 instanceof HttpException){
             httpUrl = p0.response().g().request().url();
          }else if(p0 instanceof RetrofitException){
             httpUrl = p0.mRequest.url();
             p0 = p0.getCause();
          }
          c.C().e("Network error", str+" "+str1+" "+httpUrl.url().getPath(), p0);
       }
       return;
    }
}
