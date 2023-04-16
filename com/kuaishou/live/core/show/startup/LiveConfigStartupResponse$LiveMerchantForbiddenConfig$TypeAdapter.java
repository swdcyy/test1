package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter extends TypeAdapter	// class@001055
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveMerchantForbiddenConfig.class);
    }
    public void LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveConfigStartupResponse$LiveMerchantForbiddenConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x901a33ff:
                      if (str.equals("disableNewVersionMirror")) {
                         i = 0;
                      }
                      break;
                    case 0xd0817d3c:
                      if (str.equals("disableAuthorChatShopCartControl")) {
                         i = 1;
                      }
                      break;
                    case 0x765213c4:
                      if (str.equals("disablePkShopCartControl")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDisableNewVersionMirror = KnownTypeAdapters$g.a(p0, obj.mDisableNewVersionMirror);
                      break;
                    case 1:
                      obj.mDisableMerchantForbiddenWhenChat = KnownTypeAdapters$g.a(p0, obj.mDisableMerchantForbiddenWhenChat);
                      break;
                    case 2:
                      obj.mDisableMerchantForbiddenWhenPk = KnownTypeAdapters$g.a(p0, obj.mDisableMerchantForbiddenWhenPk);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveMerchantForbiddenConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disablePkShopCartControl");
          p0.P(p1.mDisableMerchantForbiddenWhenPk);
          p0.r("disableAuthorChatShopCartControl");
          p0.P(p1.mDisableMerchantForbiddenWhenChat);
          p0.r("disableNewVersionMirror");
          p0.P(p1.mDisableNewVersionMirror);
          p0.j();
       }
       return;
    }
}
