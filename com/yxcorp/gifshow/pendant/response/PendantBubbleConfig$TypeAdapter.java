package com.yxcorp.gifshow.pendant.response.PendantBubbleConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.response.PendantBubbleConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PendantBubbleConfig$TypeAdapter extends TypeAdapter	// class@001275
{
    public final Gson a;
    public static final a b;

    static {
       PendantBubbleConfig$TypeAdapter.b = a.get(PendantBubbleConfig.class);
    }
    public void PendantBubbleConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PendantBubbleConfig$TypeAdapter.class, "2");
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
             obj = new PendantBubbleConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8c8d7bc3:
                      if (str.equals("popupCount")) {
                         i = 0;
                      }
                      break;
                    case 0xf8b40a33:
                      if (str.equals("popupPeriodMillis")) {
                         i = 1;
                      }
                      break;
                    case 0xfdb1d1a9:
                      if (str.equals("delayMillis")) {
                         i = 2;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 3;
                      }
                      break;
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 4;
                      }
                      break;
                    case 0x16e8b09b:
                      if (str.equals("periodType")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPopupCount = KnownTypeAdapters$k.a(p0, obj.mPopupCount);
                      break;
                    case 1:
                      obj.mPopupPeriodMillis = KnownTypeAdapters$n.a(p0, obj.mPopupPeriodMillis);
                      break;
                    case 2:
                      obj.mDelayMillis = KnownTypeAdapters$n.a(p0, obj.mDelayMillis);
                      break;
                    case 3:
                      obj.mId = KnownTypeAdapters$k.a(p0, obj.mId);
                      break;
                    case 4:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mPeriodType = KnownTypeAdapters$k.a(p0, obj.mPeriodType);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantBubbleConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.mId);
          p0.r("popupPeriodMillis");
          p0.K(p1.mPopupPeriodMillis);
          p0.r("periodType");
          p0.K((long)p1.mPeriodType);
          p0.r("popupCount");
          p0.K((long)p1.mPopupCount);
          p0.r("delayMillis");
          p0.K(p1.mDelayMillis);
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          p0.j();
       }
       return;
    }
}
