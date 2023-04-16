package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
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

public final class LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter extends TypeAdapter	// class@00104e
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveLiteRecoGuideConfig.class);
    }
    public void LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveConfigStartupResponse$LiveLiteRecoGuideConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("subBizType")) {
                   if (!str1.equals("link")) {
                      p0.Q();
                   }else {
                      obj.mClickJumpLink = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mSubBizType = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveLiteRecoGuideConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mClickJumpLink != null) {
             p0.r("link");
             TypeAdapters.A.write(p0, p1.mClickJumpLink);
          }
          if (p1.mSubBizType != null) {
             p0.r("subBizType");
             TypeAdapters.A.write(p0, p1.mSubBizType);
          }
          p0.j();
       }
       return;
    }
}
