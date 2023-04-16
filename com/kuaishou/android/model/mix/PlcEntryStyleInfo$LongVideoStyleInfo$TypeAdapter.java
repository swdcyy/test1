package com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.List;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter extends TypeAdapter	// class@000d8d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter.f = a.get(PlcEntryStyleInfo$LongVideoStyleInfo.class);
    }
    public void PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.c = p0.j(PlcEntryStyleInfo$ActionInfo$TypeAdapter.e);
       this.d = p0.j(PlcEntryStyleInfo$TagPackage$TypeAdapter.b);
       this.e = p0.j(PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.b);
    }
    public PlcEntryStyleInfo$LongVideoStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$LongVideoStyleInfo longVideoSty = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return longVideoSty;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return longVideoSty;
       }else {
          p0.c();
          PlcEntryStyleInfo$LongVideoStyleInfo longVideoSty1 = new PlcEntryStyleInfo$LongVideoStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbdd05fff:
                   if (str.equals("labels")) {
                      i = 0;
                   }
                   break;
                 case 0xddec2b4c:
                   if (str.equals("tagPackage")) {
                      i = 1;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 2;
                   }
                   break;
                 case 0x1db6d2a0:
                   if (str.equals("highlightLabel")) {
                      i = 3;
                   }
                   break;
                 case 0x3deb4fec:
                   if (str.equals("longVideoStyleType")) {
                      i = 4;
                   }
                   break;
                 case 0x5211f850:
                   if (str.equals("bundleInfo")) {
                      i = 5;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 6;
                   }
                   break;
                 case 0x6e5c4c04:
                   if (str.equals("actionInfo")) {
                      i = 7;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   longVideoSty1.mLabels = this.b.read(p0);
                   break;
                 case 1:
                   longVideoSty1.mTagPackage = this.d.read(p0);
                   break;
                 case 2:
                   longVideoSty1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   longVideoSty1.mHighlightLabel = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   longVideoSty1.mStyleType = KnownTypeAdapters$k.a(p0, longVideoSty1.mStyleType);
                   break;
                 case 5:
                   longVideoSty1.mTKBundleInfo = this.e.read(p0);
                   break;
                 case 6:
                   longVideoSty1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   longVideoSty1.mActionInfo = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return longVideoSty1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$LongVideoStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("longVideoStyleType");
          p0.K((long)p1.mStyleType);
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mLabels != null) {
             p0.r("labels");
             this.b.write(p0, p1.mLabels);
          }
          if (p1.mHighlightLabel != null) {
             p0.r("highlightLabel");
             TypeAdapters.A.write(p0, p1.mHighlightLabel);
          }
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
