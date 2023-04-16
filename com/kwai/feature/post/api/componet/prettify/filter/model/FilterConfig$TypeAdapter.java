package com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.FileMd5Info;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.yxcorp.gifshow.model.OperationMaskTag$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import k16.b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.yxcorp.gifshow.model.OperationMaskTag;
import com.google.gson.stream.b;
import k16.a;

public final class FilterConfig$TypeAdapter extends TypeAdapter	// class@0012ea
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
       FilterConfig$TypeAdapter.h = a.get(FilterConfig.class);
    }
    public void FilterConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
       this.c = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.d = p0.j(OperationMaskTag$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(a.get(FileMd5Info.class));
       this.e = typeAdapter;
       this.f = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.g = p0.j(ItemNameStyle$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FilterConfig$TypeAdapter.class, "2");
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
             obj = new FilterConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9168f96f:
                      if (str.equals("bottomTag")) {
                         i = 0;
                      }
                      break;
                    case 0xa36b3e23:
                      if (str.equals("filterName")) {
                         i = 1;
                      }
                      break;
                    case 0xbdc0e5f5:
                      if (str.equals("sourceType")) {
                         i = 2;
                      }
                      break;
                    case 0xbebb6d66:
                      if (str.equals("dimension")) {
                         i = 3;
                      }
                      break;
                    case 0xcba88735:
                      if (str.equals("imageType")) {
                         i = 4;
                      }
                      break;
                    case 0xd40146a4:
                      if (str.equals("iconName")) {
                         i = 5;
                      }
                      break;
                    case 0xd503d6b3:
                      if (str.equals("filterId")) {
                         i = 6;
                      }
                      break;
                    case 0xee45ae26:
                      if (str.equals("minVersion")) {
                         i = 7;
                      }
                      break;
                    case 0x3c2c468:
                      if (str.equals("ratioIntensity")) {
                         i = 8;
                      }
                      break;
                    case 0x17be45c6:
                      if (str.equals("checkList")) {
                         i = 9;
                      }
                      break;
                    case 0x1dc31833:
                      if (str.equals("intensity")) {
                         i = 10;
                      }
                      break;
                    case 0x2ae84a38:
                      if (str.equals("zipSourceFile")) {
                         i = 11;
                      }
                      break;
                    case 0x333a8669:
                      if (str.equals("pageType")) {
                         i = 12;
                      }
                      break;
                    case 0x48e291e6:
                      if (str.equals("nameStyle")) {
                         i = 13;
                      }
                      break;
                    case 0x49956681:
                      if (str.equals("resourceUrl")) {
                         i = 14;
                      }
                      break;
                    case 0x4abdeb57:
                      if (str.equals("autoDownload")) {
                         i = 15;
                      }
                      break;
                    case 0x61ad9236:
                      if (str.equals("iconUrl")) {
                         i = 16;
                      }
                      break;
                    case 0x61ad9961:
                      if (str.equals("filterNameList")) {
                         i = 17;
                      }
                      break;
                    case 0x662bd66d:
                      if (str.equals("displayName")) {
                         i = 18;
                      }
                      break;
                    case 0x662eeb1c:
                      if (str.equals("displayType")) {
                         i = 19;
                      }
                      break;
                    case 0x7612c93d:
                      if (str.equals("colorType")) {
                         i = 20;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mOperationMaskTag = this.d.read(p0);
                      break;
                    case 1:
                      obj.mFilterName = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mSourceType = KnownTypeAdapters$k.a(p0, obj.mSourceType);
                      break;
                    case 3:
                      obj.mDimension = KnownTypeAdapters$k.a(p0, obj.mDimension);
                      break;
                    case 4:
                      obj.mImageType = KnownTypeAdapters$k.a(p0, obj.mImageType);
                      break;
                    case 5:
                      obj.mThumbImageName = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mFilterId = KnownTypeAdapters$k.a(p0, obj.mFilterId);
                      break;
                    case 7:
                      obj.mMinVersion = KnownTypeAdapters$k.a(p0, obj.mMinVersion);
                      break;
                    case 8:
                      obj.mRatioIntensity = KnownTypeAdapters$j.a(p0, obj.mRatioIntensity);
                      break;
                    case 9:
                      obj.mFileMd5CheckList = this.f.read(p0);
                      break;
                    case 10:
                      obj.mIntensity = KnownTypeAdapters$j.a(p0, obj.mIntensity);
                      break;
                    case 11:
                      obj.mZipSourceFile = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new b(this)).a(p0);
                      break;
                    case 12:
                      obj.mPageType = KnownTypeAdapters$k.a(p0, obj.mPageType);
                      break;
                    case 13:
                      obj.mItemNameStyle = this.g.read(p0);
                      break;
                    case 14:
                      obj.mFilterResourcesUrl = this.c.read(p0);
                      break;
                    case 15:
                      obj.mAutoDownload = KnownTypeAdapters$g.a(p0, obj.mAutoDownload);
                      break;
                    case 16:
                      obj.mThumbImageUrl = TypeAdapters.A.read(p0);
                      break;
                    case 17:
                      obj.mFilterResources = this.c.read(p0);
                      break;
                    case 18:
                      obj.mDisplayName = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mDisplayType = TypeAdapters.A.read(p0);
                      break;
                    case 20:
                      obj.mColorFilterType = KnownTypeAdapters$k.a(p0, obj.mColorFilterType);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FilterConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("minVersion");
          p0.K((long)p1.mMinVersion);
          p0.r("sourceType");
          p0.K((long)p1.mSourceType);
          if (p1.mZipSourceFile != null) {
             p0.r("zipSourceFile");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new a(this)).b(p0, p1.mZipSourceFile);
          }
          p0.r("filterId");
          p0.K((long)p1.mFilterId);
          if (p1.mFilterName != null) {
             p0.r("filterName");
             TypeAdapters.A.write(p0, p1.mFilterName);
          }
          if (p1.mDisplayName != null) {
             p0.r("displayName");
             TypeAdapters.A.write(p0, p1.mDisplayName);
          }
          if (p1.mDisplayType != null) {
             p0.r("displayType");
             TypeAdapters.A.write(p0, p1.mDisplayType);
          }
          p0.r("intensity");
          p0.J((double)p1.mIntensity);
          p0.r("ratioIntensity");
          p0.J((double)p1.mRatioIntensity);
          p0.r("imageType");
          p0.K((long)p1.mImageType);
          p0.r("dimension");
          p0.K((long)p1.mDimension);
          p0.r("autoDownload");
          p0.P(p1.mAutoDownload);
          if (p1.mThumbImageName != null) {
             p0.r("iconName");
             TypeAdapters.A.write(p0, p1.mThumbImageName);
          }
          if (p1.mFilterResources != null) {
             p0.r("filterNameList");
             this.c.write(p0, p1.mFilterResources);
          }
          if (p1.mThumbImageUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mThumbImageUrl);
          }
          if (p1.mFilterResourcesUrl != null) {
             p0.r("resourceUrl");
             this.c.write(p0, p1.mFilterResourcesUrl);
          }
          p0.r("pageType");
          p0.K((long)p1.mPageType);
          if (p1.mOperationMaskTag != null) {
             p0.r("bottomTag");
             this.d.write(p0, p1.mOperationMaskTag);
          }
          if (p1.mFileMd5CheckList != null) {
             p0.r("checkList");
             this.f.write(p0, p1.mFileMd5CheckList);
          }
          if (p1.mItemNameStyle != null) {
             p0.r("nameStyle");
             this.g.write(p0, p1.mItemNameStyle);
          }
          p0.r("colorType");
          p0.K((long)p1.mColorFilterType);
          p0.j();
       }
       return;
    }
}
