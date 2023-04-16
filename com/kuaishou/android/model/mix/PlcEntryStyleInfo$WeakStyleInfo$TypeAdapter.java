package com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter extends TypeAdapter	// class@000db1
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
       PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter.h = a.get(PlcEntryStyleInfo$WeakStyleInfo.class);
    }
    public void PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(PlcEntryStyleInfo$ActionInfo$TypeAdapter.e);
       this.e = p0.j(PlcEntryStyleInfo$TagPackage$TypeAdapter.b);
       this.f = p0.j(PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.b);
       this.g = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PlcEntryStyleInfo$WeakStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$WeakStyleInfo weakStyleInf = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return weakStyleInf;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return weakStyleInf;
       }else {
          p0.c();
          PlcEntryStyleInfo$WeakStyleInfo weakStyleInf1 = new PlcEntryStyleInfo$WeakStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x840cd612:
                   if (str.equals("isRoundCornerIcon")) {
                      i = 0;
                   }
                   break;
                 case 0xbdd05fff:
                   if (str.equals("labels")) {
                      i = 1;
                   }
                   break;
                 case 0xd775520c:
                   if (str.equals("categoryMaxLength")) {
                      i = 2;
                   }
                   break;
                 case 0xddec2b4c:
                   if (str.equals("tagPackage")) {
                      i = 3;
                   }
                   break;
                 case 0xf87eb7b0:
                   if (str.equals("enableForceClose")) {
                      i = 4;
                   }
                   break;
                 case 0x1bf9a:
                   if (str.equals("tag")) {
                      i = 5;
                   }
                   break;
                 case 0x302bcfe:
                   if (str.equals("category")) {
                      i = 6;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 7;
                   }
                   break;
                 case 0x6b42b19:
                   if (str.equals("iconCdnUrlList")) {
                      i = 8;
                   }
                   break;
                 case 0x3133d055:
                   if (str.equals("hideAdTag")) {
                      i = 9;
                   }
                   break;
                 case 0x506547f3:
                   if (str.equals("weakStyleType")) {
                      i = 10;
                   }
                   break;
                 case 0x5211f850:
                   if (str.equals("bundleInfo")) {
                      i = 11;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 12;
                   }
                   break;
                 case 0x6e5c4c04:
                   if (str.equals("actionInfo")) {
                      i = 13;
                   }
                   break;
                 case 0x7dab0241:
                   if (str.equals("weakStyleSubType")) {
                      i = 14;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   weakStyleInf1.mIsRoundCornerIcon = KnownTypeAdapters$g.a(p0, weakStyleInf1.mIsRoundCornerIcon);
                   break;
                 case 1:
                   weakStyleInf1.mLabels = this.g.read(p0);
                   break;
                 case 2:
                   weakStyleInf1.mCategoryMaxLength = KnownTypeAdapters$k.a(p0, weakStyleInf1.mCategoryMaxLength);
                   break;
                 case 3:
                   weakStyleInf1.mTagPackage = this.e.read(p0);
                   break;
                 case 4:
                   weakStyleInf1.mEnableForceClose = KnownTypeAdapters$g.a(p0, weakStyleInf1.mEnableForceClose);
                   break;
                 case 5:
                   weakStyleInf1.mTagInfoText = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   weakStyleInf1.mCategoryText = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   weakStyleInf1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   weakStyleInf1.mCDNUrls = this.c.read(p0);
                   break;
                 case 9:
                   weakStyleInf1.mHideAdTag = KnownTypeAdapters$g.a(p0, weakStyleInf1.mHideAdTag);
                   break;
                 case 10:
                   weakStyleInf1.mStyleType = KnownTypeAdapters$k.a(p0, weakStyleInf1.mStyleType);
                   break;
                 case 11:
                   weakStyleInf1.mTKBundleInfo = this.f.read(p0);
                   break;
                 case 12:
                   weakStyleInf1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   weakStyleInf1.mActionInfo = this.d.read(p0);
                   break;
                 case 14:
                   weakStyleInf1.mWeakStyleSubType = KnownTypeAdapters$k.a(p0, weakStyleInf1.mWeakStyleSubType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return weakStyleInf1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$WeakStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideAdTag");
          p0.P(p1.mHideAdTag);
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          p0.r("isRoundCornerIcon");
          p0.P(p1.mIsRoundCornerIcon);
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mCDNUrls != null) {
             p0.r("iconCdnUrlList");
             this.c.write(p0, p1.mCDNUrls);
          }
          p0.r("weakStyleType");
          p0.K((long)p1.mStyleType);
          if (p1.mActionInfo != null) {
             p0.r("actionInfo");
             this.d.write(p0, p1.mActionInfo);
          }
          if (p1.mTagPackage != null) {
             p0.r("tagPackage");
             this.e.write(p0, p1.mTagPackage);
          }
          p0.r("enableForceClose");
          p0.P(p1.mEnableForceClose);
          if (p1.mTKBundleInfo != null) {
             p0.r("bundleInfo");
             this.f.write(p0, p1.mTKBundleInfo);
          }
          if (p1.mCategoryText != null) {
             p0.r("category");
             TypeAdapters.A.write(p0, p1.mCategoryText);
          }
          p0.r("categoryMaxLength");
          p0.K((long)p1.mCategoryMaxLength);
          if (p1.mTagInfoText != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.mTagInfoText);
          }
          p0.r("weakStyleSubType");
          p0.K((long)p1.mWeakStyleSubType);
          if (p1.mLabels != null) {
             p0.r("labels");
             this.g.write(p0, p1.mLabels);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
