package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter extends TypeAdapter	// class@000d92
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
       PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter.j = a.get(PlcEntryStyleInfo$StrongStyleInfo.class);
    }
    public void PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.e = p0.j(PlcEntryStyleInfo$ActionInfo$TypeAdapter.e);
       this.f = p0.j(PlcEntryStyleInfo$TagPackage$TypeAdapter.b);
       this.g = p0.j(PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.b);
       TypeAdapter typeAdapter1 = p0.j(PlcEntryStyleInfo$StrongStyleItem$TypeAdapter.c);
       this.h = typeAdapter1;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public PlcEntryStyleInfo$StrongStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$StrongStyleInfo strongStyleI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return strongStyleI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return strongStyleI;
       }else {
          p0.c();
          PlcEntryStyleInfo$StrongStyleInfo strongStyleI1 = new PlcEntryStyleInfo$StrongStyleInfo();
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
                 case 0xbfd50286:
                   if (str.equals("strongStyleItems")) {
                      i = 2;
                   }
                   break;
                 case 0xd775520c:
                   if (str.equals("categoryMaxLength")) {
                      i = 3;
                   }
                   break;
                 case 0xddec2b4c:
                   if (str.equals("tagPackage")) {
                      i = 4;
                   }
                   break;
                 case 0xe51b9d03:
                   if (str.equals("atmosphereBarLeftImage")) {
                      i = 5;
                   }
                   break;
                 case 0xf87eb7b0:
                   if (str.equals("enableForceClose")) {
                      i = 6;
                   }
                   break;
                 case 0xfbd52b5a:
                   if (str.equals("multiHighlightLabels")) {
                      i = 7;
                   }
                   break;
                 case 0x1bf9a:
                   if (str.equals("tag")) {
                      i = 8;
                   }
                   break;
                 case 0x302bcfe:
                   if (str.equals("category")) {
                      i = 9;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 10;
                   }
                   break;
                 case 0x6b42b19:
                   if (str.equals("iconCdnUrlList")) {
                      i = 11;
                   }
                   break;
                 case 0x1db6d2a0:
                   if (str.equals("highlightLabel")) {
                      i = 12;
                   }
                   break;
                 case 0x311c22e0:
                   if (str.equals("strongStyleSubType")) {
                      i = 13;
                   }
                   break;
                 case 0x3133d055:
                   if (str.equals("hideAdTag")) {
                      i = 14;
                   }
                   break;
                 case 0x325ab6b4:
                   if (str.equals("iconLeftLabel")) {
                      i = 15;
                   }
                   break;
                 case 0x5211f850:
                   if (str.equals("bundleInfo")) {
                      i = 16;
                   }
                   break;
                 case 0x5bcac34d:
                   if (str.equals("highlightIcon")) {
                      i = 17;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 18;
                   }
                   break;
                 case 0x694e03b4:
                   if (str.equals("strongStyleType")) {
                      i = 19;
                   }
                   break;
                 case 0x6e5c4c04:
                   if (str.equals("actionInfo")) {
                      i = 20;
                   }
                   break;
                 case 0x72a810a3:
                   if (str.equals("highlightLabelColor")) {
                      i = 21;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   strongStyleI1.mIsRoundCornerIcon = KnownTypeAdapters$g.a(p0, strongStyleI1.mIsRoundCornerIcon);
                   break;
                 case 1:
                   strongStyleI1.mLabels = this.d.read(p0);
                   break;
                 case 2:
                   strongStyleI1.mStrongStyleItems = this.i.read(p0);
                   break;
                 case 3:
                   strongStyleI1.mCategoryMaxLength = KnownTypeAdapters$k.a(p0, strongStyleI1.mCategoryMaxLength);
                   break;
                 case 4:
                   strongStyleI1.mTagPackage = this.f.read(p0);
                   break;
                 case 5:
                   strongStyleI1.mAtmosphereBar = this.c.read(p0);
                   break;
                 case 6:
                   strongStyleI1.mEnableForceClose = KnownTypeAdapters$g.a(p0, strongStyleI1.mEnableForceClose);
                   break;
                 case 7:
                   strongStyleI1.mMultiHighlightLabels = this.d.read(p0);
                   break;
                 case 8:
                   strongStyleI1.mTagInfoText = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   strongStyleI1.mCategoryText = TypeAdapters.A.read(p0);
                   break;
                 case 10:
                   strongStyleI1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   strongStyleI1.mCDNUrls = this.c.read(p0);
                   break;
                 case 12:
                   strongStyleI1.mHighlightLabel = TypeAdapters.A.read(p0);
                   break;
                 case 13:
                   strongStyleI1.mStrongStyleSubType = KnownTypeAdapters$k.a(p0, strongStyleI1.mStrongStyleSubType);
                   break;
                 case 14:
                   strongStyleI1.mHideAdTag = KnownTypeAdapters$g.a(p0, strongStyleI1.mHideAdTag);
                   break;
                 case 15:
                   strongStyleI1.mIconLeftLabel = TypeAdapters.A.read(p0);
                   break;
                 case 16:
                   strongStyleI1.mTKBundleInfo = this.g.read(p0);
                   break;
                 case 17:
                   strongStyleI1.mHighlightIcon = TypeAdapters.A.read(p0);
                   break;
                 case 18:
                   strongStyleI1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 19:
                   strongStyleI1.mStyleType = KnownTypeAdapters$k.a(p0, strongStyleI1.mStyleType);
                   break;
                 case 20:
                   strongStyleI1.mActionInfo = this.e.read(p0);
                   break;
                 case 21:
                   strongStyleI1.mHighlightLabelColor = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return strongStyleI1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$StrongStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("hideAdTag");
          p0.P(p1.mHideAdTag);
          p0.r("strongStyleType");
          p0.K((long)p1.mStyleType);
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mCDNUrls != null) {
             p0.r("iconCdnUrlList");
             this.c.write(p0, p1.mCDNUrls);
          }
          if (p1.mIconLeftLabel != null) {
             p0.r("iconLeftLabel");
             TypeAdapters.A.write(p0, p1.mIconLeftLabel);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mLabels != null) {
             p0.r("labels");
             this.d.write(p0, p1.mLabels);
          }
          if (p1.mHighlightLabel != null) {
             p0.r("highlightLabel");
             TypeAdapters.A.write(p0, p1.mHighlightLabel);
          }
          if (p1.mHighlightLabelColor != null) {
             p0.r("highlightLabelColor");
             TypeAdapters.A.write(p0, p1.mHighlightLabelColor);
          }
          if (p1.mActionInfo != null) {
             p0.r("actionInfo");
             this.e.write(p0, p1.mActionInfo);
          }
          if (p1.mTagPackage != null) {
             p0.r("tagPackage");
             this.f.write(p0, p1.mTagPackage);
          }
          p0.r("enableForceClose");
          p0.P(p1.mEnableForceClose);
          if (p1.mTKBundleInfo != null) {
             p0.r("bundleInfo");
             this.g.write(p0, p1.mTKBundleInfo);
          }
          p0.r("strongStyleSubType");
          p0.K((long)p1.mStrongStyleSubType);
          if (p1.mStrongStyleItems != null) {
             p0.r("strongStyleItems");
             this.i.write(p0, p1.mStrongStyleItems);
          }
          p0.r("isRoundCornerIcon");
          p0.P(p1.mIsRoundCornerIcon);
          if (p1.mTagInfoText != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.mTagInfoText);
          }
          if (p1.mCategoryText != null) {
             p0.r("category");
             TypeAdapters.A.write(p0, p1.mCategoryText);
          }
          p0.r("categoryMaxLength");
          p0.K((long)p1.mCategoryMaxLength);
          if (p1.mHighlightIcon != null) {
             p0.r("highlightIcon");
             TypeAdapters.A.write(p0, p1.mHighlightIcon);
          }
          if (p1.mMultiHighlightLabels != null) {
             p0.r("multiHighlightLabels");
             this.d.write(p0, p1.mMultiHighlightLabels);
          }
          if (p1.mAtmosphereBar != null) {
             p0.r("atmosphereBarLeftImage");
             this.c.write(p0, p1.mAtmosphereBar);
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
