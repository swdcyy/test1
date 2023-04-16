package com.feature.post.bridge.util.UploadTokenHelper;
import java.lang.Object;
import com.feature.post.bridge.util.UploadTokenHelper$a;
import com.feature.post.bridge.util.UploadTokenHelper$ApplyTokenResponse;
import java.lang.String;
import okhttp3.HttpUrl;
import okhttp3.Request$Builder;
import java.net.URL;
import okhttp3.FormBody$Builder;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import java.io.File;
import ca7.m;
import xp6.j;
import java.lang.StringBuilder;
import j75.f;
import com.kwai.chat.components.utils.a;
import android.util.Base64;
import c97.d;
import kotlin.jvm.internal.a;
import h97.g;
import com.kwai.imsdk.m;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.Request;
import okhttp3.OkHttpClient$Builder;
import og.d1;
import okhttp3.CookieJar;
import java.util.concurrent.TimeUnit;
import com.kwai.imsdk.internal.util.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.lang.Class;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import org.json.JSONObject;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;

public final class UploadTokenHelper	// class@0014c8
{
    public static final UploadTokenHelper a;

    static {
       UploadTokenHelper.a = new UploadTokenHelper();
    }
    public void UploadTokenHelper(){
       super();
    }
    public final UploadTokenHelper$ApplyTokenResponse a(UploadTokenHelper$a p0){
       d uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       g og = uod.b();
       String str = "Azeroth.get\(\).commonParams";
       a.o(og, str);
       uod = d.a();
       a.o(uod, "Azeroth.get\(\)");
       og = uod.b();
       a.o(og, str);
       m om = m.F();
       a.o(om, "KwaiIMManager.getInstance\(\)");
       Objects.requireNonNull(om);
       Request$Builder uBuilder = new Request$Builder().url(HttpUrl.get(p0.d()).url()).post(new FormBody$Builder().build()).addHeader("target", p0.f).addHeader("chat-type", String.valueOf(p0.c())).addHeader("app-id", p0.b).addHeader("origin-name", m.a(p0.a().getName())).addHeader("download-verify-type", String.valueOf(j.c(p0.c(), p0.h))).addHeader("file-type", "."+f.b(p0.a().getName())).addHeader("file-len", String.valueOf(p0.a().length())).addHeader("Content-Md5", Base64.encodeToString(a.a(p0.a()), 2)).addHeader("appver", og.getAppVersion()).addHeader("sys", og.getSysRelease()).addHeader("imsdkver", "11.3.10.0");
       if (!TextUtils.isEmpty(p0.b())) {
          uBuilder.addHeader("sub-biz", p0.b());
       }
       Request request = uBuilder.build();
       TimeUnit sECONDS = TimeUnit.SECONDS;
       long l = 60;
       OkHttpClient okHttpClient = new OkHttpClient$Builder().cookieJar(new d1(p0.c, p0.e, p0.i)).connectTimeout(30, sECONDS).addInterceptor(new ConvertToIOExceptionInterceptor()).readTimeout(l, sECONDS).writeTimeout(l, sECONDS).build();
       a.o(okHttpClient, "builder.cookieJar\(object¡­SECONDS\)\n        .build\(\)");
       a.m(request);
       ResponseBody responseBody = okHttpClient.newCall(request).execute().body();
       a.m(responseBody);
       String str1 = responseBody.string();
       UploadTokenHelper$ApplyTokenResponse uApplyTokenR = GsonUtil.fromJson(str1, UploadTokenHelper$ApplyTokenResponse.class);
       if (uApplyTokenR.getMFileToken() != null) {
          return uApplyTokenR;
       }else {
          JSONObject jSONObject = new JSONObject(str1);
          int i = jSONObject.optInt("result", 0);
          String str2 = jSONObject.optString("error_msg", null);
          a uoa = new a(str1, i, str2, p0.d(), 0, 0);
          throw new KwaiException(v10);
       }
    }
}
