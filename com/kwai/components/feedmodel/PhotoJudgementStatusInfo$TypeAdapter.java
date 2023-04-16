package com.kwai.components.feedmodel.PhotoJudgementStatusInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.PhotoJudgementStatusInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoJudgementStatusInfo$TypeAdapter extends TypeAdapter	// class@000c2f
{
    public final Gson a;
    public static final a b;

    static {
       PhotoJudgementStatusInfo$TypeAdapter.b = a.get(PhotoJudgementStatusInfo.class);
    }
    public void PhotoJudgementStatusInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoJudgementStatusInfo$TypeAdapter.class, "2");
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
             obj = new PhotoJudgementStatusInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb214f593:
                      if (str.equals("titleId")) {
                         i = 0;
                      }
                      break;
                    case 0xb234ad75:
                      if (str.equals("preTitle")) {
                         i = 1;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 2;
                      }
                      break;
                    case 0xbd19b59:
                      if (str.equals("actionUrl")) {
                         i = 3;
                      }
                      break;
                    case 0x61ad9236:
                      if (str.equals("iconUrl")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mId = KnownTypeAdapters$k.a(p0, obj.mId);
                      break;
                    case 1:
                      obj.mPreTitle = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoJudgementStatusInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mPreTitle != null) {
             p0.r("preTitle");
             TypeAdapters.A.write(p0, p1.mPreTitle);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          p0.r("titleId");
          p0.K((long)p1.mId);
          p0.j();
       }
       return;
    }
}
