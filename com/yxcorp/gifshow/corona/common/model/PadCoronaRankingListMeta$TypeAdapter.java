package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.ArrayList;
import com.google.gson.stream.b;

public final class PadCoronaRankingListMeta$TypeAdapter extends TypeAdapter	// class@001239
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PadCoronaRankingListMeta$TypeAdapter.d = a.get(PadCoronaRankingListMeta.class);
    }
    public void PadCoronaRankingListMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(PadCoronaRankingListTabData$TypeAdapter.e);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListMeta$TypeAdapter.class, "2");
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
             obj = new PadCoronaRankingListMeta();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa02514c6:
                      if (str.equals("hotTabList")) {
                         i = 0;
                      }
                      break;
                    case 0xe91e9023:
                      if (str.equals("coronaZoneId")) {
                         i = 1;
                      }
                      break;
                    case 0xe97b7135:
                      if (str.equals("rightZoneText")) {
                         i = 2;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.hotTabList = this.c.read(p0);
                      break;
                    case 1:
                      obj.coronaZoneId = KnownTypeAdapters$n.a(p0, obj.coronaZoneId);
                      break;
                    case 2:
                      obj.rightZoneText = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.title = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PadCoronaRankingListMeta$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("coronaZoneId");
          p0.K(p1.coronaZoneId);
          if (p1.title != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.title);
          }
          if (p1.rightZoneText != null) {
             p0.r("rightZoneText");
             TypeAdapters.A.write(p0, p1.rightZoneText);
          }
          if (p1.hotTabList != null) {
             p0.r("hotTabList");
             this.c.write(p0, p1.hotTabList);
          }
          p0.j();
       }
       return;
    }
}
