package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$ShopConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveCommonConfigResponse$ShopConfig$TypeAdapter extends TypeAdapter	// class@000e8e
{
    public final Gson a;
    public static final a b;

    static {
       LiveCommonConfigResponse$ShopConfig$TypeAdapter.b = a.get(LiveCommonConfigResponse$ShopConfig.class);
    }
    public void LiveCommonConfigResponse$ShopConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$ShopConfig$TypeAdapter.class, "2");
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
             obj = new LiveCommonConfigResponse$ShopConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("popDisplayTime")) {
                   p0.Q();
                }else {
                   obj.mLiveShopBubbleDisplayTime = KnownTypeAdapters$n.a(p0, obj.mLiveShopBubbleDisplayTime);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$ShopConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("popDisplayTime");
          p0.K(p1.mLiveShopBubbleDisplayTime);
          p0.j();
       }
       return;
    }
}
