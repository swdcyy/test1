package com.kwai.video.krtccatelyn.HttpClientManager$1;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtccatelyn.HttpClientManager;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Set;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.util.Objects;

public final class HttpClientManager$1 implements Callback	// class@0008cf
{
    public final int a;
    public final OkHttpClient b;
    public final int c;

    public void HttpClientManager$1(int p0,OkHttpClient p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpClientManager$1.class, "1")) {
          return;
       }
       HttpClientManager httpClientMa = HttpClientManager.class;
       _monitor_enter(httpClientMa);
       if (HttpClientManager.httpClientMap.containsKey(Integer.valueOf(this.a))) {
          HttpClientManager.httpClientMap.get(Integer.valueOf(this.a)).remove(this.b);
       }
       HttpClientManager.close(this.b);
       _monitor_exit(httpClientMa);
       HttpClientManager.onResponseNative(this.a, this.c, 0, p1.getMessage());
       return;
    }
    public void onResponse(Call p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HttpClientManager$1.class, "2")) {
          return;
       }
       HttpClientManager httpClientMa = HttpClientManager.class;
       _monitor_enter(httpClientMa);
       if (HttpClientManager.httpClientMap.containsKey(Integer.valueOf(this.a))) {
          HttpClientManager.httpClientMap.get(Integer.valueOf(this.a)).remove(this.b);
       }
       HttpClientManager.close(this.b);
       _monitor_exit(httpClientMa);
       ResponseBody responseBody = p1.body();
       Objects.requireNonNull(responseBody);
       HttpClientManager.onResponseNative(this.a, this.c, p1.code(), responseBody.string());
       return;
    }
}
