package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$BottomItemConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class LiveCommonConfigResponse$BottomItemConfig$TypeAdapter extends TypeAdapter	// class@000e7e
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveCommonConfigResponse$BottomItemConfig$TypeAdapter.c = a.get(LiveCommonConfigResponse$BottomItemConfig.class);
    }
    public void LiveCommonConfigResponse$BottomItemConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$BottomItemConfig$TypeAdapter.class, "2");
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
             obj = new LiveCommonConfigResponse$BottomItemConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xcc8bb2f6:
                      if (str.equals("buttonPriority")) {
                         i = 0;
                      }
                      break;
                    case 0x8916fa1:
                      if (str.equals("verticalMaxCount")) {
                         i = 1;
                      }
                      break;
                    case 0x2eaa064f:
                      if (str.equals("horizontalMaxCount")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPriorityList = this.b.read(p0);
                      break;
                    case 1:
                      obj.mPortraitMaxCount = KnownTypeAdapters$k.a(p0, obj.mPortraitMaxCount);
                      break;
                    case 2:
                      obj.mLandscapeMaxCount = KnownTypeAdapters$k.a(p0, obj.mLandscapeMaxCount);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$BottomItemConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPriorityList != null) {
             p0.r("buttonPriority");
             this.b.write(p0, p1.mPriorityList);
          }
          p0.r("horizontalMaxCount");
          p0.K((long)p1.mLandscapeMaxCount);
          p0.r("verticalMaxCount");
          p0.K((long)p1.mPortraitMaxCount);
          p0.j();
       }
       return;
    }
}
