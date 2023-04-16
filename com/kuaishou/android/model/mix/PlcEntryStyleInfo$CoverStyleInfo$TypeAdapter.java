package com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$ActionInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter extends TypeAdapter	// class@000d83
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter.f = a.get(PlcEntryStyleInfo$CoverStyleInfo.class);
    }
    public void PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.c = p0.j(PlcEntryStyleInfo$ActionInfo$TypeAdapter.e);
       this.d = p0.j(PlcEntryStyleInfo$TagPackage$TypeAdapter.b);
       this.e = p0.j(PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.b);
    }
    public PlcEntryStyleInfo$CoverStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$CoverStyleInfo uCoverStyleI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverStyleI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverStyleI;
       }else {
          p0.c();
          PlcEntryStyleInfo$CoverStyleInfo uCoverStyleI1 = new PlcEntryStyleInfo$CoverStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa76b5000:
                   if (str.equals("coverStyleSubType")) {
                      i = 0;
                   }
                   break;
                 case 0xb972ea94:
                   if (str.equals("coverStyleType")) {
                      i = 1;
                   }
                   break;
                 case 0xbdd05fff:
                   if (str.equals("labels")) {
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
                 case 0x302bcfe:
                   if (str.equals("category")) {
                      i = 5;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 6;
                   }
                   break;
                 case 0x5211f850:
                   if (str.equals("bundleInfo")) {
                      i = 7;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 8;
                   }
                   break;
                 case 0x6e5c4c04:
                   if (str.equals("actionInfo")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverStyleI1.mCoverStyleSubType = KnownTypeAdapters$k.a(p0, uCoverStyleI1.mCoverStyleSubType);
                   break;
                 case 1:
                   uCoverStyleI1.mStyleType = KnownTypeAdapters$k.a(p0, uCoverStyleI1.mStyleType);
                   break;
                 case 2:
                   uCoverStyleI1.mLabels = this.b.read(p0);
                   break;
                 case 3:
                   uCoverStyleI1.mCategoryMaxLength = KnownTypeAdapters$k.a(p0, uCoverStyleI1.mCategoryMaxLength);
                   break;
                 case 4:
                   uCoverStyleI1.mTagPackage = this.d.read(p0);
                   break;
                 case 5:
                   uCoverStyleI1.mCategory = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCoverStyleI1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCoverStyleI1.mTKBundleInfo = this.e.read(p0);
                   break;
                 case 8:
                   uCoverStyleI1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCoverStyleI1.mActionInfo = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverStyleI1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$CoverStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mLabels != null) {
             p0.r("labels");
             this.b.write(p0, p1.mLabels);
          }
          p0.r("categoryMaxLength");
          p0.K((long)p1.mCategoryMaxLength);
          if (p1.mCategory != null) {
             p0.r("category");
             TypeAdapters.A.write(p0, p1.mCategory);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          p0.r("coverStyleType");
          p0.K((long)p1.mStyleType);
          p0.r("coverStyleSubType");
          p0.K((long)p1.mCoverStyleSubType);
          if (p1.mActionInfo != null) {
             p0.r("actionInfo");
             this.c.write(p0, p1.mActionInfo);
          }
          if (p1.mTagPackage != null) {
             p0.r("tagPackage");
             this.d.write(p0, p1.mTagPackage);
          }
          if (p1.mTKBundleInfo != null) {
             p0.r("bundleInfo");
             this.e.write(p0, p1.mTKBundleInfo);
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
