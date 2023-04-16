package com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$DeformMode$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class BeautyFilterItem$TypeAdapter extends TypeAdapter	// class@0012d7
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public final TypeAdapter i;
    public static final a j;

    static {
       BeautyFilterItem$TypeAdapter.j = a.get(BeautyFilterItem.class);
    }
    public void BeautyFilterItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       this.c = p0.j(ItemNameStyle$TypeAdapter.b);
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.f = p0.j(BeautyFilterItem$TypeAdapter.j);
       this.g = p0.j(BeautifyTagInfo$TypeAdapter.b);
       TypeAdapter typeAdapter1 = p0.j(BeautyFilterItem$DeformMode$TypeAdapter.b);
       this.h = typeAdapter1;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BeautyFilterItem$TypeAdapter.class, "2");
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
             obj = new BeautyFilterItem();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x97879d87:
                      if (str.equals("beautyVer")) {
                         i = 0;
                      }
                      break;
                    case 0xa0a27b3b:
                      if (str.equals("mvparamKey")) {
                         i = 1;
                      }
                      break;
                    case 0xaded1e3f:
                      if (str.equals("minValue")) {
                         i = 2;
                      }
                      break;
                    case 0xb76e9daa:
                      if (str.equals("hidden")) {
                         i = 3;
                      }
                      break;
                    case 0xc320f804:
                      if (str.equals("mvparamGroupKey")) {
                         i = 4;
                      }
                      break;
                    case 0xc76f1cb2:
                      if (str.equals("displayNameKey")) {
                         i = 5;
                      }
                      break;
                    case 0xd40146a4:
                      if (str.equals("iconName")) {
                         i = 6;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 7;
                      }
                      break;
                    case 0x1c56f:
                      if (str.equals("url")) {
                         i = 8;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 9;
                      }
                      break;
                    case 0x302bcfe:
                      if (str.equals("category")) {
                         i = 10;
                      }
                      break;
                    case 0x617c27f:
                      if (str.equals("lPart")) {
                         i = 11;
                      }
                      break;
                    case 0x65061f9:
                      if (str.equals("opTag")) {
                         i = 12;
                      }
                      break;
                    case 0x66c4f85:
                      if (str.equals("rPart")) {
                         i = 13;
                      }
                      break;
                    case 0x7e8b408:
                      if (str.equals("deformMode")) {
                         i = 14;
                      }
                      break;
                    case 0x145b4fef:
                      if (str.equals("logName")) {
                         i = 15;
                      }
                      break;
                    case 0x17cbba6d:
                      if (str.equals("maxValue")) {
                         i = 16;
                      }
                      break;
                    case 0x25e3feb1:
                      if (str.equals("cdnUrls")) {
                         i = 17;
                      }
                      break;
                    case 0x3731923b:
                      if (str.equals("serializedKey")) {
                         i = 18;
                      }
                      break;
                    case 0x48e291e6:
                      if (str.equals("nameStyle")) {
                         i = 19;
                      }
                      break;
                    case 0x5968203f:
                      if (str.equals("beautyMode")) {
                         i = 20;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSupportVersion = this.b.read(p0);
                      break;
                    case 1:
                      obj.mMvparamKey = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mMinValue = KnownTypeAdapters$j.a(p0, obj.mMinValue);
                      break;
                    case 3:
                      obj.mHidden = KnownTypeAdapters$g.a(p0, obj.mHidden);
                      break;
                    case 4:
                      obj.mMvparamGroupKey = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mNameResKey = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mIconResKey = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mId = KnownTypeAdapters$k.a(p0, obj.mId);
                      break;
                    case 8:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 9:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mCategory = KnownTypeAdapters$k.a(p0, obj.mCategory);
                      break;
                    case 11:
                      obj.mLeftPart = this.f.read(p0);
                      break;
                    case 12:
                      obj.mBeautifyTagInfo = this.g.read(p0);
                      break;
                    case 13:
                      obj.mRightPart = this.f.read(p0);
                      break;
                    case 14:
                      obj.mDeformModeList = this.i.read(p0);
                      break;
                    case 15:
                      obj.mLogName = TypeAdapters.A.read(p0);
                      break;
                    case 16:
                      obj.mMaxValue = KnownTypeAdapters$j.a(p0, obj.mMaxValue);
                      break;
                    case 17:
                      obj.mIconCdnUrls = this.e.read(p0);
                      break;
                    case 18:
                      obj.mSerializedKey = TypeAdapters.A.read(p0);
                      break;
                    case 19:
                      obj.mItemNameStyle = this.c.read(p0);
                      break;
                    case 20:
                      obj.mBeautyMode = KnownTypeAdapters$k.a(p0, obj.mBeautyMode);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautyFilterItem$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSupportVersion != null) {
             p0.r("beautyVer");
             this.b.write(p0, p1.mSupportVersion);
          }
          p0.r("id");
          p0.K((long)p1.mId);
          p0.r("category");
          p0.K((long)p1.mCategory);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mNameResKey != null) {
             p0.r("displayNameKey");
             TypeAdapters.A.write(p0, p1.mNameResKey);
          }
          if (p1.mItemNameStyle != null) {
             p0.r("nameStyle");
             this.c.write(p0, p1.mItemNameStyle);
          }
          if (p1.mIconUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mIconCdnUrls != null) {
             p0.r("cdnUrls");
             this.e.write(p0, p1.mIconCdnUrls);
          }
          if (p1.mIconResKey != null) {
             p0.r("iconName");
             TypeAdapters.A.write(p0, p1.mIconResKey);
          }
          p0.r("maxValue");
          p0.J((double)p1.mMaxValue);
          p0.r("minValue");
          p0.J((double)p1.mMinValue);
          if (p1.mMvparamKey != null) {
             p0.r("mvparamKey");
             TypeAdapters.A.write(p0, p1.mMvparamKey);
          }
          if (p1.mMvparamGroupKey != null) {
             p0.r("mvparamGroupKey");
             TypeAdapters.A.write(p0, p1.mMvparamGroupKey);
          }
          if (p1.mLogName != null) {
             p0.r("logName");
             TypeAdapters.A.write(p0, p1.mLogName);
          }
          p0.r("hidden");
          p0.P(p1.mHidden);
          if (p1.mLeftPart != null) {
             p0.r("lPart");
             this.f.write(p0, p1.mLeftPart);
          }
          if (p1.mRightPart != null) {
             p0.r("rPart");
             this.f.write(p0, p1.mRightPart);
          }
          if (p1.mBeautifyTagInfo != null) {
             p0.r("opTag");
             this.g.write(p0, p1.mBeautifyTagInfo);
          }
          p0.r("beautyMode");
          p0.K((long)p1.mBeautyMode);
          if (p1.mDeformModeList != null) {
             p0.r("deformMode");
             this.i.write(p0, p1.mDeformModeList);
          }
          if (p1.mSerializedKey != null) {
             p0.r("serializedKey");
             TypeAdapters.A.write(p0, p1.mSerializedKey);
          }
          p0.j();
       }
       return;
    }
}
