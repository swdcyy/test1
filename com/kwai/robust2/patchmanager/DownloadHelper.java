package com.kwai.robust2.patchmanager.DownloadHelper;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.kwai.middleware.azeroth.network.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import com.kwai.robust2.patchmanager.DownloadHelper$RetryInterceptor;
import okhttp3.OkHttpClient;
import java.lang.String;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qkd.b;
import com.kwai.robust2.patchmanager.b;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.d;
import okio.m;
import okio.l;
import okio.c;
import cud.j;
import okio.b;
import okio.n;
import java.lang.Throwable;
import java.io.IOException;
import java.lang.StringBuilder;
import pm7.h;
import com.kwai.robust2.patchmanager.model.PatchModel;
import com.kwai.robust.Patch;
import com.kwai.robust.PatchFile;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.Patch$Builder;
import com.kwai.robust.Robust;
import java.lang.Object;
import android.text.TextUtils;

public final class DownloadHelper	// class@001418
{
    public static final OkHttpClient a;

    static {
       TimeUnit sECONDS = TimeUnit.SECONDS;
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(10, sECONDS).readTimeout(10, sECONDS).writeTimeout(10, sECONDS);
       DownloadHelper.a = uBuilder.addInterceptor(new ConvertToIOExceptionInterceptor()).addInterceptor(new DownloadHelper$RetryInterceptor(3)).build();
    }
    public static boolean a(String p0,File p1){
       if (TextUtils.x(p0)) {
          throw new IOException("check downloadUrl or destFile");
       }
       b.q(p1);
       b.j(p1.getParentFile());
       Response response = DownloadHelper.a.newCall(new Request$Builder().url(p0).build()).execute();
       if (response.code() != 200 || response.body() == null) {
          throw new IOException("response code = "+response.code());
       }
       d uod = response.body().source();
       c uoc = l.c(l.f(p1));
       b uob = uoc.buffer();
       while (uod.read(uob, 0x4000) - -1) {
          uoc.emit();
       }
       uoc.flush();
       uoc.close();
       uod.close();
       return true;
    }
    public static Patch b(h p0,PatchModel p1,File p2){
       int i;
       String path;
       b.j(p2.getParentFile());
       DownloadHelper.a(p1.downloadUrl, p2);
       PatchFile orCreate = PatchFile.getOrCreate(p2.getPath());
       b.v(p0.b(), p1, p2, orCreate);
       try{
          i = 0;
          if (b.o(orCreate)) {
             path = b.g(p0.e(), p1.robustId, p1.patchId).getPath();
             orCreate.extractNativePatch(p0.b(), b.k(), new File(path));
             b.u(p0, p1, p2);
          }
          return Patch$Builder.patch(PatchModel.class).withId(p1.patchId).withMd5(p1.md5).withRobustId(Robust.get().getRobustId(p0.b())).withLocalPath(p2.getPath()).withExtra(p1).withFeatureName(p1.featureName).withFeatureVersion(p1.featureVersion).withNativeInstallPath(path).withApplyTime(orCreate.getApplyTime()).build();
       }catch(java.lang.Exception e5){
          if (!TextUtils.isEmpty(i)) {
             b.q(new File(i));
          }
          throw e5;
       }
    }
}
