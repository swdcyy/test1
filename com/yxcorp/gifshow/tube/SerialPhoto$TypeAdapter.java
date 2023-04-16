package com.yxcorp.gifshow.tube.SerialPhoto$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.SerialPhoto;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SerialPhoto$TypeAdapter extends TypeAdapter	// class@001df3
{
    public final Gson a;
    public static final a b;

    static {
       SerialPhoto$TypeAdapter.b = a.get(SerialPhoto.class);
    }
    public void SerialPhoto$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SerialPhoto$TypeAdapter.class, "2");
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
             obj = new SerialPhoto();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8e69dd24:
                      if (str.equals("episodeNumber")) {
                         i = 0;
                      }
                      break;
                    case 0xb8bcbb2c:
                      if (str.equals("episodeDesc")) {
                         i = 1;
                      }
                      break;
                    case 0xb8c13726:
                      if (str.equals("episodeName")) {
                         i = 2;
                      }
                      break;
                    case 0xc0346afb:
                      if (str.equals("isLastEpisode")) {
                         i = 3;
                      }
                      break;
                    case 0x20ef99e6:
                      if (str.equals("caption")) {
                         i = 4;
                      }
                      break;
                    case 0x2a404be0:
                      if (str.equals("originCaption")) {
                         i = 5;
                      }
                      break;
                    case 0x71d90f75:
                      if (str.equals("isFirstEpisode")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.episodeNumber = KnownTypeAdapters$k.a(p0, obj.episodeNumber);
                      break;
                    case 1:
                      obj.mSerialDesc = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mEpisodeName = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.isLastValidEpisode = KnownTypeAdapters$g.a(p0, obj.isLastValidEpisode);
                      break;
                    case 4:
                      obj.caption = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mOriginCaption = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.isFirstValidEpisode = KnownTypeAdapters$g.a(p0, obj.isFirstValidEpisode);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialPhoto$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.caption != null) {
             p0.r("caption");
             TypeAdapters.A.write(p0, p1.caption);
          }
          if (p1.mOriginCaption != null) {
             p0.r("originCaption");
             TypeAdapters.A.write(p0, p1.mOriginCaption);
          }
          p0.r("episodeNumber");
          p0.K((long)p1.episodeNumber);
          if (p1.mEpisodeName != null) {
             p0.r("episodeName");
             TypeAdapters.A.write(p0, p1.mEpisodeName);
          }
          if (p1.mSerialDesc != null) {
             p0.r("episodeDesc");
             TypeAdapters.A.write(p0, p1.mSerialDesc);
          }
          p0.r("isFirstEpisode");
          p0.P(p1.isFirstValidEpisode);
          p0.r("isLastEpisode");
          p0.P(p1.isLastValidEpisode);
          p0.j();
       }
       return;
    }
}
