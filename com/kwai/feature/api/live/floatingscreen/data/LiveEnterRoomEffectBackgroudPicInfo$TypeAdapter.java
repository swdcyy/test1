package com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.api.live.floatingscreen.data.LiveEnterRoomEffectBackgroudPicInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import cr5.c;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import cr5.b;

public final class LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter extends TypeAdapter	// class@000fb4
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter.c = a.get(LiveEnterRoomEffectBackgroudPicInfo.class);
    }
    public void LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter.class, "2");
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
             obj = new LiveEnterRoomEffectBackgroudPicInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc514b785:
                      if (str.equals("picUrl")) {
                         i = 0;
                      }
                      break;
                    case 0x19351c54:
                      if (str.equals("insetBottomDp")) {
                         i = 1;
                      }
                      break;
                    case 0x1aefdfeb:
                      if (str.equals("insetRightDp")) {
                         i = 2;
                      }
                      break;
                    case 0x1fb30670:
                      if (str.equals("insetLeftDp")) {
                         i = 3;
                      }
                      break;
                    case 0x3b49a1a4:
                      if (str.equals("insetTopDp")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPicUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new c(this)).a(p0);
                      break;
                    case 1:
                      obj.mInsetBottomDp = KnownTypeAdapters$k.a(p0, obj.mInsetBottomDp);
                      break;
                    case 2:
                      obj.mInsetRightDp = KnownTypeAdapters$k.a(p0, obj.mInsetRightDp);
                      break;
                    case 3:
                      obj.mInsetLeftDp = KnownTypeAdapters$k.a(p0, obj.mInsetLeftDp);
                      break;
                    case 4:
                      obj.mInsetTopDp = KnownTypeAdapters$k.a(p0, obj.mInsetTopDp);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEnterRoomEffectBackgroudPicInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPicUrls != null) {
             p0.r("picUrl");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new b(this)).b(p0, p1.mPicUrls);
          }
          p0.r("insetLeftDp");
          p0.K((long)p1.mInsetLeftDp);
          p0.r("insetRightDp");
          p0.K((long)p1.mInsetRightDp);
          p0.r("insetTopDp");
          p0.K((long)p1.mInsetTopDp);
          p0.r("insetBottomDp");
          p0.K((long)p1.mInsetBottomDp);
          p0.j();
       }
       return;
    }
}
