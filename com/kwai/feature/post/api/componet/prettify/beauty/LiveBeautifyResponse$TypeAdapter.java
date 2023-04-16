package com.kwai.feature.post.api.componet.prettify.beauty.LiveBeautifyResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.LiveBeautifyResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyGroupInfo$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class LiveBeautifyResponse$TypeAdapter extends TypeAdapter	// class@0012df
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
       LiveBeautifyResponse$TypeAdapter.i = a.get(LiveBeautifyResponse.class);
    }
    public void LiveBeautifyResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(BeautifySuiteInfo$TypeAdapter.i);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(BeautyFilterItem$TypeAdapter.j);
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(BeautifyGroupInfo$TypeAdapter.c);
       this.f = typeAdapter;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.h = p0.j(MedicalBeautyConfig$TypeAdapter.c);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveBeautifyResponse$TypeAdapter.class, "2");
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
             obj = new LiveBeautifyResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9117bfe7:
                      if (str.equals("suitType")) {
                         i = 0;
                      }
                      break;
                    case 0xa677533c:
                      if (str.equals("defaultId")) {
                         i = 1;
                      }
                      break;
                    case 0xac215013:
                      if (str.equals("versionId")) {
                         i = 2;
                      }
                      break;
                    case 0xb313500f:
                      if (str.equals("medicalBeautyConfig")) {
                         i = 3;
                      }
                      break;
                    case 0xb63dd9d4:
                      if (str.equals("groups")) {
                         i = 4;
                      }
                      break;
                    case 0x6581ae0:
                      if (str.equals("parts")) {
                         i = 5;
                      }
                      break;
                    case 0x68b5706:
                      if (str.equals("suits")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSuitType = KnownTypeAdapters$k.a(p0, obj.mSuitType);
                      break;
                    case 1:
                      obj.mDefaultId = KnownTypeAdapters$k.a(p0, obj.mDefaultId);
                      break;
                    case 2:
                      obj.mVersionId = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mMedicalBeautyConfig = this.h.read(p0);
                      break;
                    case 4:
                      obj.mBeautifyGroupInfoList = this.g.read(p0);
                      break;
                    case 5:
                      obj.mBeautifyItemInfoList = this.e.read(p0);
                      break;
                    case 6:
                      obj.mSuiteInfoList = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBeautifyResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mSuiteInfoList != null) {
             p0.r("suits");
             this.c.write(p0, p1.mSuiteInfoList);
          }
          if (p1.mBeautifyItemInfoList != null) {
             p0.r("parts");
             this.e.write(p0, p1.mBeautifyItemInfoList);
          }
          if (p1.mBeautifyGroupInfoList != null) {
             p0.r("groups");
             this.g.write(p0, p1.mBeautifyGroupInfoList);
          }
          p0.r("suitType");
          p0.K((long)p1.mSuitType);
          p0.r("defaultId");
          p0.K((long)p1.mDefaultId);
          if (p1.mVersionId != null) {
             p0.r("versionId");
             TypeAdapters.A.write(p0, p1.mVersionId);
          }
          if (p1.mMedicalBeautyConfig != null) {
             p0.r("medicalBeautyConfig");
             this.h.write(p0, p1.mMedicalBeautyConfig);
          }
          p0.j();
       }
       return;
    }
}
