package com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListTabInfo;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.ArrayList;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PadCoronaRankingListResponse$TypeAdapter extends TypeAdapter	// class@00123d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PadCoronaRankingListResponse$TypeAdapter.f = a.get(PadCoronaRankingListResponse.class);
    }
    public void PadCoronaRankingListResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(PadCoronaRankingListTabInfo.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
       TypeAdapter typeAdapter1 = p0.j(a.get(QPhoto.class));
       this.d = typeAdapter1;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PadCoronaRankingListResponse$TypeAdapter.class, "2");
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
             obj = new PadCoronaRankingListResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa36211d3:
                      if (str.equals("tabList")) {
                         i = 0;
                      }
                      break;
                    case 0xc84dc81d:
                      if (str.equals("result")) {
                         i = 1;
                      }
                      break;
                    case 0xee5c6596:
                      if (str.equals("updateText")) {
                         i = 2;
                      }
                      break;
                    case 0xfc43bd79:
                      if (str.equals("bgImageUrl")) {
                         i = 3;
                      }
                      break;
                    case 0x5ccce95:
                      if (str.equals("feeds")) {
                         i = 4;
                      }
                      break;
                    case 0x139cb015:
                      if (str.equals("errorCode")) {
                         i = 5;
                      }
                      break;
                    case 0x146a23c4:
                      if (str.equals("logoUrl")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.setTabList(this.c.read(p0));
                      break;
                    case 1:
                      obj.setResult(KnownTypeAdapters$k.a(p0, obj.getResult()));
                      break;
                    case 2:
                      obj.setUpdateText(TypeAdapters.A.read(p0));
                      break;
                    case 3:
                      obj.setBgImageUrl(TypeAdapters.A.read(p0));
                      break;
                    case 4:
                      obj.setFeeds(this.e.read(p0));
                      break;
                    case 5:
                      obj.setErrorCode(KnownTypeAdapters$k.a(p0, obj.getErrorCode()));
                      break;
                    case 6:
                      obj.setLogoUrl(TypeAdapters.A.read(p0));
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
             if (obj.getBgImageUrl() != null) {
                if (obj.getLogoUrl() != null) {
                   if (obj.getUpdateText() != null) {
                      if (obj.getTabList() != null) {
                         if (obj.getFeeds() == null) {
                            throw new IOException("getFeeds\(\) cannot be null");
                         }
                      }else {
                         throw new IOException("getTabList\(\) cannot be null");
                      }
                   }else {
                      throw new IOException("getUpdateText\(\) cannot be null");
                   }
                }else {
                   throw new IOException("getLogoUrl\(\) cannot be null");
                }
             }else {
                throw new IOException("getBgImageUrl\(\) cannot be null");
             }
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PadCoronaRankingListResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("result");
          p0.K((long)p1.getResult());
          p0.r("errorCode");
          p0.K((long)p1.getErrorCode());
          if (p1.getBgImageUrl() != null) {
             p0.r("bgImageUrl");
             TypeAdapters.A.write(p0, p1.getBgImageUrl());
          }else if(p1.getBgImageUrl() != null){
             throw new IOException("getBgImageUrl\(\) cannot be null");
          }
          if (p1.getLogoUrl() != null) {
             p0.r("logoUrl");
             TypeAdapters.A.write(p0, p1.getLogoUrl());
          }else if(p1.getLogoUrl() != null){
             throw new IOException("getLogoUrl\(\) cannot be null");
          }
          if (p1.getUpdateText() != null) {
             p0.r("updateText");
             TypeAdapters.A.write(p0, p1.getUpdateText());
          }else if(p1.getUpdateText() != null){
             throw new IOException("getUpdateText\(\) cannot be null");
          }
          if (p1.getTabList() != null) {
             p0.r("tabList");
             this.c.write(p0, p1.getTabList());
          }else if(p1.getTabList() != null){
             throw new IOException("getTabList\(\) cannot be null");
          }
          if (p1.getFeeds() != null) {
             p0.r("feeds");
             this.e.write(p0, p1.getFeeds());
          }else if(p1.getFeeds() != null){
             throw new IOException("getFeeds\(\) cannot be null");
          }
          p0.j();
       }
       return;
    }
}
