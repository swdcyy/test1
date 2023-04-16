package com.kwai.components.feedmodel.OperationBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.OperationBarInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.components.feedmodel.OperationBarInfo$RelatedVideoItem;
import com.kwai.components.feedmodel.OperationBarInfo$TopTrendingItem;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import ei5.e;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.kwai.components.feedmodel.OperationBarInfo$GeneralInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;
import ei5.d;

public final class OperationBarInfo$TypeAdapter extends TypeAdapter	// class@000c2b
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public static final a h;

    static {
       OperationBarInfo$TypeAdapter.h = a.get(OperationBarInfo.class);
    }
    public void OperationBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       TypeAdapter typeAdapter = p0.j(a.get(OperationBarInfo$RelatedVideoItem.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(OperationBarInfo$TopTrendingItem.class));
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.g = p0.j(OperationBarInfo$GeneralInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, OperationBarInfo$TypeAdapter.class, "2");
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
             obj = new OperationBarInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa3eb93b3:
                      if (str.equals("moreTrendingsLink")) {
                         i = 0;
                      }
                      break;
                    case 0xaca9e4cd:
                      if (str.equals("iconWidth")) {
                         i = 1;
                      }
                      break;
                    case 0xc0d1d089:
                      if (str.equals("isExtraTrendingFeed")) {
                         i = 2;
                      }
                      break;
                    case 0xc77522a5:
                      if (str.equals("descTextColor")) {
                         i = 3;
                      }
                      break;
                    case 0xcec3bb00:
                      if (str.equals("iconHeight")) {
                         i = 4;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 5;
                      }
                      break;
                    case 0x2efe91:
                      if (str.equals("desc")) {
                         i = 6;
                      }
                      break;
                    case 0x32affa:
                      if (str.equals("link")) {
                         i = 7;
                      }
                      break;
                    case 0x2f8048c:
                      if (str.equals("relatedPhotos")) {
                         i = 8;
                      }
                      break;
                    case 0x345d2db6:
                      if (str.equals("generalInfo")) {
                         i = 9;
                      }
                      break;
                    case 0x61ad9236:
                      if (str.equals("iconUrl")) {
                         i = 10;
                      }
                      break;
                    case 0x74c15e19:
                      if (str.equals("topTrendings")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.moreTrendingsLink = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mIconWidth = KnownTypeAdapters$k.a(p0, obj.mIconWidth);
                      break;
                    case 2:
                      obj.mIsExtraTrendingFeed = KnownTypeAdapters$g.a(p0, obj.mIsExtraTrendingFeed);
                      break;
                    case 3:
                      obj.mDescTextColor = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mIconHeight = KnownTypeAdapters$k.a(p0, obj.mIconHeight);
                      break;
                    case 5:
                      obj.mId = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mDesc = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mLink = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mRelatedPhotoList = this.d.read(p0);
                      break;
                    case 9:
                      obj.mGeneralInfo = this.g.read(p0);
                      break;
                    case 10:
                      obj.mIconUrl = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new e(this)).a(p0);
                      break;
                    case 11:
                      obj.mTopTrendingList = this.f.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperationBarInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
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
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new d(this)).b(p0, p1.mIconUrl);
          }
          p0.r("iconWidth");
          p0.K((long)p1.mIconWidth);
          p0.r("iconHeight");
          p0.K((long)p1.mIconHeight);
          if (p1.mDescTextColor != null) {
             p0.r("descTextColor");
             TypeAdapters.A.write(p0, p1.mDescTextColor);
          }
          p0.r("isExtraTrendingFeed");
          p0.P(p1.mIsExtraTrendingFeed);
          if (p1.moreTrendingsLink != null) {
             p0.r("moreTrendingsLink");
             TypeAdapters.A.write(p0, p1.moreTrendingsLink);
          }
          if (p1.mRelatedPhotoList != null) {
             p0.r("relatedPhotos");
             this.d.write(p0, p1.mRelatedPhotoList);
          }
          if (p1.mTopTrendingList != null) {
             p0.r("topTrendings");
             this.f.write(p0, p1.mTopTrendingList);
          }
          if (p1.mGeneralInfo != null) {
             p0.r("generalInfo");
             this.g.write(p0, p1.mGeneralInfo);
          }
          p0.j();
       }
       return;
    }
}
