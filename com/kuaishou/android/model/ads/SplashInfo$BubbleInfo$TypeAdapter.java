package com.kuaishou.android.model.ads.SplashInfo$BubbleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$BubbleInfo;
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

public final class SplashInfo$BubbleInfo$TypeAdapter extends TypeAdapter	// class@000a85
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$BubbleInfo$TypeAdapter.b = a.get(SplashInfo$BubbleInfo.class);
    }
    public void SplashInfo$BubbleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$BubbleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$BubbleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$BubbleInfo uBubbleInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uBubbleInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uBubbleInfo;
       }else {
          p0.c();
          SplashInfo$BubbleInfo uBubbleInfo1 = new SplashInfo$BubbleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("title")) {
                p0.Q();
             }else {
                uBubbleInfo1.mTitle = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uBubbleInfo1;
       }
    }
    public void b(b p0,SplashInfo$BubbleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$BubbleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
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
