package com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SplashInfo$PlayableLineInfo$TypeAdapter extends TypeAdapter	// class@000a93
{
    public final Gson a;
    public static final a b;

    static {
       SplashInfo$PlayableLineInfo$TypeAdapter.b = a.get(SplashInfo$PlayableLineInfo.class);
    }
    public void SplashInfo$PlayableLineInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SplashInfo$PlayableLineInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SplashInfo$PlayableLineInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SplashInfo$PlayableLineInfo playableLine = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return playableLine;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return playableLine;
       }else {
          p0.c();
          SplashInfo$PlayableLineInfo playableLine1 = new SplashInfo$PlayableLineInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("lineWidth")) {
                if (!str.equals("lineColorHex")) {
                   p0.Q();
                }else {
                   playableLine1.mLineColorHex = TypeAdapters.A.read(p0);
                }
             }else {
                playableLine1.mLineWidth = KnownTypeAdapters$k.a(p0, playableLine1.mLineWidth);
             }
          }
          p0.j();
          return playableLine1;
       }
    }
    public void b(b p0,SplashInfo$PlayableLineInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SplashInfo$PlayableLineInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("lineWidth");
          p0.K((long)p1.mLineWidth);
          if (p1.mLineColorHex != null) {
             p0.r("lineColorHex");
             TypeAdapters.A.write(p0, p1.mLineColorHex);
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
