package com.kwai.components.feedmodel.BottomEntryInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.BottomEntryInfo;
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
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import ei5.b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;
import ei5.a;

public final class BottomEntryInfo$TypeAdapter extends TypeAdapter	// class@000c12
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       BottomEntryInfo$TypeAdapter.c = a.get(BottomEntryInfo.class);
    }
    public void BottomEntryInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BottomEntryInfo$TypeAdapter.class, "2");
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
             obj = new BottomEntryInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xaca9e4cd:
                      if (str.equals("iconWidth")) {
                         i = 0;
                      }
                      break;
                    case 0xc77522a5:
                      if (str.equals("descTextColor")) {
                         i = 1;
                      }
                      break;
                    case 0xcec3bb00:
                      if (str.equals("iconHeight")) {
                         i = 2;
                      }
                      break;
                    case 0x2efe91:
                      if (str.equals("desc")) {
                         i = 3;
                      }
                      break;
                    case 0x32affa:
                      if (str.equals("link")) {
                         i = 4;
                      }
                      break;
                    case 0x73d0f2b:
                      if (str.equals("traceParams")) {
                         i = 5;
                      }
                      break;
                    case 0x61ad9236:
                      if (str.equals("iconUrl")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mIconWidth = KnownTypeAdapters$k.a(p0, obj.mIconWidth);
                      break;
                    case 1:
                      obj.mDescTextColor = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mIconHeight = KnownTypeAdapters$k.a(p0, obj.mIconHeight);
                      break;
                    case 3:
                      obj.mDesc = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mLink = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mTraceParams = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mIconUrl = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new b(this)).a(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomEntryInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mDesc != null) {
             p0.r("desc");
             TypeAdapters.A.write(p0, p1.mDesc);
          }
          if (p1.mLink != null) {
             p0.r("link");
             TypeAdapters.A.write(p0, p1.mLink);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new a(this)).b(p0, p1.mIconUrl);
          }
          p0.r("iconWidth");
          p0.K((long)p1.mIconWidth);
          p0.r("iconHeight");
          p0.K((long)p1.mIconHeight);
          if (p1.mDescTextColor != null) {
             p0.r("descTextColor");
             TypeAdapters.A.write(p0, p1.mDescTextColor);
          }
          if (p1.mTraceParams != null) {
             p0.r("traceParams");
             TypeAdapters.A.write(p0, p1.mTraceParams);
          }
          p0.j();
       }
       return;
    }
}
