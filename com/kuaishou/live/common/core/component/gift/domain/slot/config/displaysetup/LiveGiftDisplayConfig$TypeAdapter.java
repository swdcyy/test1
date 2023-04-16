package com.kuaishou.live.common.core.component.gift.domain.slot.config.displaysetup.LiveGiftDisplayConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.displaysetup.LiveGiftDisplayConfig;
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
import com.vimeo.stag.KnownTypeAdapters$l;
import com.google.gson.stream.b;

public final class LiveGiftDisplayConfig$TypeAdapter extends TypeAdapter	// class@00125c
{
    public final Gson a;
    public static final a b;

    static {
       LiveGiftDisplayConfig$TypeAdapter.b = a.get(LiveGiftDisplayConfig.class);
    }
    public void LiveGiftDisplayConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveGiftDisplayConfig$TypeAdapter.class, "2");
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
             obj = new LiveGiftDisplayConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf87a83be:
                      if (str.equals("giftDisplaySecondsForBatch")) {
                         i = 0;
                      }
                      break;
                    case 0x34466844:
                      if (str.equals("giftDisplaySecondsForSingle")) {
                         i = 1;
                      }
                      break;
                    case 0x43cbc91b:
                      if (str.equals("giftStyleThresholdForBatch")) {
                         i = 2;
                      }
                      break;
                    case 0x531dce87:
                      if (str.equals("giftStyleThresholdForSingle")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mGiftDisplaySecondsForBatch = KnownTypeAdapters$l.a(p0);
                      break;
                    case 1:
                      obj.mGiftDisplaySecondsForSingle = KnownTypeAdapters$l.a(p0);
                      break;
                    case 2:
                      obj.mGiftStyleThresholdForBatch = KnownTypeAdapters$l.a(p0);
                      break;
                    case 3:
                      obj.mGiftStyleThresholdForSingle = KnownTypeAdapters$l.a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftDisplayConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mGiftStyleThresholdForBatch != null) {
             p0.r("giftStyleThresholdForBatch");
             KnownTypeAdapters$l.b(p0, p1.mGiftStyleThresholdForBatch);
          }
          if (p1.mGiftStyleThresholdForSingle != null) {
             p0.r("giftStyleThresholdForSingle");
             KnownTypeAdapters$l.b(p0, p1.mGiftStyleThresholdForSingle);
          }
          if (p1.mGiftDisplaySecondsForBatch != null) {
             p0.r("giftDisplaySecondsForBatch");
             KnownTypeAdapters$l.b(p0, p1.mGiftDisplaySecondsForBatch);
          }
          if (p1.mGiftDisplaySecondsForSingle != null) {
             p0.r("giftDisplaySecondsForSingle");
             KnownTypeAdapters$l.b(p0, p1.mGiftDisplaySecondsForSingle);
          }
          p0.j();
       }
       return;
    }
}
