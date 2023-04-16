package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.yxcorp.gifshow.entity.QPhoto;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.ArrayList;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PadCoronaRankingListTabData$TypeAdapter extends TypeAdapter	// class@001242
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       PadCoronaRankingListTabData$TypeAdapter.e = a.get(PadCoronaRankingListTabData.class);
    }
    public void PadCoronaRankingListTabData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CoronaInfo.class));
       TypeAdapter typeAdapter = p0.j(a.get(QPhoto.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListTabData$TypeAdapter.class, "2");
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
             obj = new PadCoronaRankingListTabData();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa362dbc0:
                      if (str.equals("tabName")) {
                         i = 0;
                      }
                      break;
                    case 0xb55b61ea:
                      if (str.equals("coronaInfo")) {
                         i = 1;
                      }
                      break;
                    case 0xc9e135a1:
                      if (str.equals("schema")) {
                         i = 2;
                      }
                      break;
                    case 0xe91e9023:
                      if (str.equals("coronaZoneId")) {
                         i = 3;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 4;
                      }
                      break;
                    case 0x5ccce95:
                      if (str.equals("feeds")) {
                         i = 5;
                      }
                      break;
                    case 0x6903790:
                      if (str.equals("tabId")) {
                         i = 6;
                      }
                      break;
                    case 0x26589303:
                      if (str.equals("canSildeToSchema")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.setTabName(TypeAdapters.A.read(p0));
                      break;
                    case 1:
                      obj.setCoronaInfo(this.b.read(p0));
                      break;
                    case 2:
                      obj.setScheme(TypeAdapters.A.read(p0));
                      break;
                    case 3:
                      obj.setCoronaZoneId(KnownTypeAdapters$k.a(p0, obj.getCoronaZoneId()));
                      break;
                    case 4:
                      obj.setType(KnownTypeAdapters$k.a(p0, obj.getType()));
                      break;
                    case 5:
                      obj.setFeeds(this.d.read(p0));
                      break;
                    case 6:
                      obj.setTabId(KnownTypeAdapters$k.a(p0, obj.getTabId()));
                      break;
                    case 7:
                      obj.setCanSlideToScheme(KnownTypeAdapters$g.a(p0, obj.getCanSlideToScheme()));
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.getTabName() != null) {
                if (obj.getScheme() != null) {
                   if (obj.getCoronaInfo() != null) {
                      if (obj.getFeeds() == null) {
                         throw new IOException("getFeeds\(\) cannot be null");
                      }
                   }else {
                      throw new IOException("getCoronaInfo\(\) cannot be null");
                   }
                }else {
                   throw new IOException("getScheme\(\) cannot be null");
                }
             }else {
                throw new IOException("getTabName\(\) cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PadCoronaRankingListTabData$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("tabId");
          p0.K((long)p1.getTabId());
          if (p1.getTabName() != null) {
             p0.r("tabName");
             TypeAdapters.A.write(p0, p1.getTabName());
          }else if(p1.getTabName() != null){
             throw new IOException("getTabName\(\) cannot be null");
          }
          p0.r("type");
          p0.K((long)p1.getType());
          if (p1.getScheme() != null) {
             p0.r("schema");
             TypeAdapters.A.write(p0, p1.getScheme());
          }else if(p1.getScheme() != null){
             throw new IOException("getScheme\(\) cannot be null");
          }
          p0.r("canSildeToSchema");
          p0.P(p1.getCanSlideToScheme());
          p0.r("coronaZoneId");
          p0.K((long)p1.getCoronaZoneId());
          if (p1.getCoronaInfo() != null) {
             p0.r("coronaInfo");
             this.b.write(p0, p1.getCoronaInfo());
          }else if(p1.getCoronaInfo() != null){
             throw new IOException("getCoronaInfo\(\) cannot be null");
          }
          if (p1.getFeeds() != null) {
             p0.r("feeds");
             this.d.write(p0, p1.getFeeds());
          }else if(p1.getFeeds() != null){
             throw new IOException("getFeeds\(\) cannot be null");
          }
          p0.j();
       }
       return;
    }
}
