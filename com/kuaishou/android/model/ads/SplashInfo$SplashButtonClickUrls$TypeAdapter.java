package com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$SplashButtonClickUrls;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class SplashInfo$SplashButtonClickUrls$TypeAdapter extends TypeAdapter	// class@000aa7
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$SplashButtonClickUrls$TypeAdapter.b = a.get(SplashInfo$SplashButtonClickUrls.class);
    }
    public void SplashInfo$SplashButtonClickUrls$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$SplashButtonClickUrls a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$SplashButtonClickUrls$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$SplashButtonClickUrls splashButton = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return splashButton;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return splashButton;
       }else {
          p0.c();
          SplashInfo$SplashButtonClickUrls splashButton1 = new SplashInfo$SplashButtonClickUrls();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("applink")) {
                if (!str.equals("h5Url")) {
                   p0.Q();
                }else {
                   splashButton1.mH5Url = TypeAdapters.A.read(p0);
                }
             }else {
                splashButton1.mAppLink = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return splashButton1;
       }
    }
    public void b(b p0,SplashInfo$SplashButtonClickUrls p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$SplashButtonClickUrls$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAppLink != null) {
             p0.r("applink");
             TypeAdapters.A.write(p0, p1.mAppLink);
          }
          if (p1.mH5Url != null) {
             p0.r("h5Url");
             TypeAdapters.A.write(p0, p1.mH5Url);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
