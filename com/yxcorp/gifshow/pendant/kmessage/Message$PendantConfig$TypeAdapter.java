package com.yxcorp.gifshow.pendant.kmessage.Message$PendantConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message$PendantConfig;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class Message$PendantConfig$TypeAdapter extends TypeAdapter	// class@001269
{
    public final Gson a;
    public static final a b;

    static {
       Message$PendantConfig$TypeAdapter.b = a.get(Message$PendantConfig.class);
    }
    public void Message$PendantConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Message$PendantConfig$TypeAdapter.class, "2");
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
             obj = new Message$PendantConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb477352d:
                      if (str.equals("animationFramePMs")) {
                         i = 0;
                      }
                      break;
                    case 0xa8de315:
                      if (str.equals("linkUrl")) {
                         i = 1;
                      }
                      break;
                    case 0x50a9c885:
                      if (str.equals("disableSkin")) {
                         i = 2;
                      }
                      break;
                    case 0x557e545d:
                      if (str.equals("animationResourceURL")) {
                         i = 3;
                      }
                      break;
                    case 0x5f57c866:
                      if (str.equals("animationCirculateTimes")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mAnimationFramePMs = KnownTypeAdapters$k.a(p0, obj.mAnimationFramePMs);
                      break;
                    case 1:
                      obj.mLinkUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mDisableSkin = KnownTypeAdapters$g.a(p0, obj.mDisableSkin);
                      break;
                    case 3:
                      obj.mAnimationResourceURL = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mAnimationCirculateTimes = KnownTypeAdapters$k.a(p0, obj.mAnimationCirculateTimes);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Message$PendantConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLinkUrl != null) {
             p0.r("linkUrl");
             TypeAdapters.A.write(p0, p1.mLinkUrl);
          }
          p0.r("disableSkin");
          p0.P(p1.mDisableSkin);
          if (p1.mAnimationResourceURL != null) {
             p0.r("animationResourceURL");
             TypeAdapters.A.write(p0, p1.mAnimationResourceURL);
          }
          p0.r("animationFramePMs");
          p0.K((long)p1.mAnimationFramePMs);
          p0.r("animationCirculateTimes");
          p0.K((long)p1.mAnimationCirculateTimes);
          p0.j();
       }
       return;
    }
}
