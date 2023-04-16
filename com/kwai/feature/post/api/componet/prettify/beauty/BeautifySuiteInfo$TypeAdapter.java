package com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$BeautifyItem$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
import java.util.ArrayList;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.internal.bind.TypeAdapters;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyTagInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class BeautifySuiteInfo$TypeAdapter extends TypeAdapter	// class@0012d0
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public final TypeAdapter g;
    public final TypeAdapter h;
    public static final a i;

    static {
       BeautifySuiteInfo$TypeAdapter.i = a.get(BeautifySuiteInfo.class);
    }
    public void BeautifySuiteInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
       typeAdapter = p0.j(BeautifySuiteInfo$BeautifyItem$TypeAdapter.c);
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$b());
       this.f = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$b());
       this.g = p0.j(ItemNameStyle$TypeAdapter.b);
       this.h = p0.j(BeautifyTagInfo$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, BeautifySuiteInfo$TypeAdapter.class, "2");
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
             obj = new BeautifySuiteInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xc76f1cb2:
                      if (str.equals("displayNameKey")) {
                         i = 0;
                      }
                      break;
                    case 0xce19381a:
                      if (str.equals("passThroughParams")) {
                         i = 1;
                      }
                      break;
                    case 0xd40146a4:
                      if (str.equals("iconName")) {
                         i = 2;
                      }
                      break;
                    case 0xf6abdc0c:
                      if (str.equals("resourcePathKey")) {
                         i = 3;
                      }
                      break;
                    case 3355:
                      if (str.equals("id")) {
                         i = 4;
                      }
                      break;
                    case 0x1c56f:
                      if (str.equals("url")) {
                         i = 5;
                      }
                      break;
                    case 0x337a8b:
                      if (str.equals("name")) {
                         i = 6;
                      }
                      break;
                    case 0x65061f9:
                      if (str.equals("opTag")) {
                         i = 7;
                      }
                      break;
                    case 0x6581ae0:
                      if (str.equals("parts")) {
                         i = 8;
                      }
                      break;
                    case 0x145b4fef:
                      if (str.equals("logName")) {
                         i = 9;
                      }
                      break;
                    case 0x1dc31833:
                      if (str.equals("intensity")) {
                         i = 10;
                      }
                      break;
                    case 0x25e3feb1:
                      if (str.equals("cdnUrls")) {
                         i = 11;
                      }
                      break;
                    case 0x39851db7:
                      if (str.equals("isDefault")) {
                         i = 12;
                      }
                      break;
                    case 0x47da2cc6:
                      if (str.equals("blackPartIds")) {
                         i = 13;
                      }
                      break;
                    case 0x48e291e6:
                      if (str.equals("nameStyle")) {
                         i = 14;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mNameResKey = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mPassThroughParams = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mIconResKey = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mResourcePathKey = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mId = KnownTypeAdapters$k.a(p0, obj.mId);
                      break;
                    case 5:
                      obj.mIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mName = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mBeautifyTagInfo = this.h.read(p0);
                      break;
                    case 8:
                      obj.mBeautifyItems = this.e.read(p0);
                      break;
                    case 9:
                      obj.mLogName = TypeAdapters.A.read(p0);
                      break;
                    case 10:
                      obj.mIntensity = KnownTypeAdapters$j.a(p0, obj.mIntensity);
                      break;
                    case 11:
                      obj.mIconCdnUrls = this.c.read(p0);
                      break;
                    case 12:
                      obj.isDefault = KnownTypeAdapters$g.a(p0, obj.isDefault);
                      break;
                    case 13:
                      obj.mUnSupportBeautifyList = this.f.read(p0);
                      break;
                    case 14:
                      obj.mItemNameStyle = this.g.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautifySuiteInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.mId);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mNameResKey != null) {
             p0.r("displayNameKey");
             TypeAdapters.A.write(p0, p1.mNameResKey);
          }
          if (p1.mIconUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mIconResKey != null) {
             p0.r("iconName");
             TypeAdapters.A.write(p0, p1.mIconResKey);
          }
          if (p1.mIconCdnUrls != null) {
             p0.r("cdnUrls");
             this.c.write(p0, p1.mIconCdnUrls);
          }
          if (p1.mBeautifyItems != null) {
             p0.r("parts");
             this.e.write(p0, p1.mBeautifyItems);
          }
          if (p1.mUnSupportBeautifyList != null) {
             p0.r("blackPartIds");
             this.f.write(p0, p1.mUnSupportBeautifyList);
          }
          if (p1.mLogName != null) {
             p0.r("logName");
             TypeAdapters.A.write(p0, p1.mLogName);
          }
          if (p1.mResourcePathKey != null) {
             p0.r("resourcePathKey");
             TypeAdapters.A.write(p0, p1.mResourcePathKey);
          }
          if (p1.mPassThroughParams != null) {
             p0.r("passThroughParams");
             TypeAdapters.A.write(p0, p1.mPassThroughParams);
          }
          p0.r("isDefault");
          p0.P(p1.isDefault);
          if (p1.mItemNameStyle != null) {
             p0.r("nameStyle");
             this.g.write(p0, p1.mItemNameStyle);
          }
          if (p1.mBeautifyTagInfo != null) {
             p0.r("opTag");
             this.h.write(p0, p1.mBeautifyTagInfo);
          }
          p0.r("intensity");
          p0.J((double)p1.mIntensity);
          p0.j();
       }
       return;
    }
}
