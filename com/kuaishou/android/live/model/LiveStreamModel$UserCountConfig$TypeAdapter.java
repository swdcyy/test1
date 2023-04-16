package com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveStreamModel$UserCountConfig$TypeAdapter extends TypeAdapter	// class@00081b
{
    public final Gson a;
    public static final a b;

    static {
       LiveStreamModel$UserCountConfig$TypeAdapter.b = a.get(LiveStreamModel$UserCountConfig.class);
    }
    public void LiveStreamModel$UserCountConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public LiveStreamModel$UserCountConfig a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamModel$UserCountConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamModel$UserCountConfig userCountCon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return userCountCon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return userCountCon;
       }else {
          p0.c();
          LiveStreamModel$UserCountConfig userCountCon1 = new LiveStreamModel$UserCountConfig();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("supportClick")) {
                if (!str.equals("type")) {
                   p0.Q();
                }else {
                   userCountCon1.mType = KnownTypeAdapters$k.a(p0, userCountCon1.mType);
                }
             }else {
                userCountCon1.mIsSupportClick = KnownTypeAdapters$g.a(p0, userCountCon1.mIsSupportClick);
             }
          }
          p0.j();
          return userCountCon1;
       }
    }
    public void b(b p0,LiveStreamModel$UserCountConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamModel$UserCountConfig$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("supportClick");
          p0.P(p1.mIsSupportClick);
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
