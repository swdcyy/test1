package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarItemConfig;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$l;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter extends TypeAdapter	// class@001020
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter.d = a.get(LiveConfigStartupResponse$LiteBottomBarConfig.class);
    }
    public void LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(LiveConfigStartupResponse$LiteBottomBarItemConfig.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiteBottomBarConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x5fde7c0:
                      if (str.equals("items")) {
                         i = 0;
                      }
                      break;
                    case 0x6875635:
                      if (str.equals("slots")) {
                         i = 1;
                      }
                      break;
                    case 0x66b233de:
                      if (str.equals("shopLiveItems")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mItems = this.c.read(p0);
                      break;
                    case 1:
                      obj.mSlots = KnownTypeAdapters$l.a(p0);
                      break;
                    case 2:
                      obj.mShopLiveItems = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiteBottomBarConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSlots != null) {
             p0.r("slots");
             KnownTypeAdapters$l.b(p0, p1.mSlots);
          }
          if (p1.mItems != null) {
             p0.r("items");
             this.c.write(p0, p1.mItems);
          }
          if (p1.mShopLiveItems != null) {
             p0.r("shopLiveItems");
             this.c.write(p0, p1.mShopLiveItems);
          }
          p0.j();
       }
       return;
    }
}
