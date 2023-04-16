package com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.PostBeautifyResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifySuiteInfo$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem$TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyGroupInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kwai.feature.post.api.componet.prettify.beauty.MedicalBeautyConfig;
import com.google.gson.stream.b;

public final class PostBeautifyResponse$TypeAdapter extends TypeAdapter	// class@0012e3
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
       PostBeautifyResponse$TypeAdapter.j = a.get(PostBeautifyResponse.class);
    }
    public void PostBeautifyResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(MedicalBeautyConfig$TypeAdapter.c);
       this.c = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter = p0.j(BeautifySuiteInfo$TypeAdapter.i);
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(BeautyFilterItem$TypeAdapter.j);
       this.f = typeAdapter;
       this.g = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(BeautifyGroupInfo$TypeAdapter.c);
       this.h = typeAdapter1;
       this.i = new KnownTypeAdapters$ListTypeAdapter(typeAdapter1, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PostBeautifyResponse$TypeAdapter.class, "2");
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
             obj = new PostBeautifyResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x901e2f1c:
                      if (str.equals("editSuits")) {
                         i = 0;
                      }
                      break;
                    case 0xb313500f:
                      if (str.equals("medicalBeautyConfig")) {
                         i = 1;
                      }
                      break;
                    case 0xb63dd9d4:
                      if (str.equals("groups")) {
                         i = 2;
                      }
                      break;
                    case 0xcdd2a7fc:
                      if (str.equals("whatsUpSuits")) {
                         i = 3;
                      }
                      break;
                    case 0x6581ae0:
                      if (str.equals("parts")) {
                         i = 4;
                      }
                      break;
                    case 0x68b5706:
                      if (str.equals("suits")) {
                         i = 5;
                      }
                      break;
                    case 0xb30791f:
                      if (str.equals("oldSuits")) {
                         i = 6;
                      }
                      break;
                    case 0x14f51cd8:
                      if (str.equals("version")) {
                         i = 7;
                      }
                      break;
                    case 0x780b6e69:
                      if (str.equals("reducedFrameRateIds")) {
                         i = 8;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEditSuiteInfoList = this.e.read(p0);
                      break;
                    case 1:
                      obj.mMedicalBeautyConfig = this.b.read(p0);
                      break;
                    case 2:
                      obj.mBeautifyGroupInfoList = this.i.read(p0);
                      break;
                    case 3:
                      obj.mWhatsUpSuiteInfoList = this.e.read(p0);
                      break;
                    case 4:
                      obj.mBeautifyItemInfoList = this.g.read(p0);
                      break;
                    case 5:
                      obj.mRecordNewSuiteInfoList = this.e.read(p0);
                      break;
                    case 6:
                      obj.mRecordSuiteInfoList = this.e.read(p0);
                      break;
                    case 7:
                      obj.mVersion = KnownTypeAdapters$k.a(p0, obj.mVersion);
                      break;
                    case 8:
                      obj.mReducedFrameRateIds = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostBeautifyResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMedicalBeautyConfig != null) {
             p0.r("medicalBeautyConfig");
             this.b.write(p0, p1.mMedicalBeautyConfig);
          }
          if (p1.mReducedFrameRateIds != null) {
             p0.r("reducedFrameRateIds");
             this.c.write(p0, p1.mReducedFrameRateIds);
          }
          if (p1.mRecordSuiteInfoList != null) {
             p0.r("oldSuits");
             this.e.write(p0, p1.mRecordSuiteInfoList);
          }
          if (p1.mRecordNewSuiteInfoList != null) {
             p0.r("suits");
             this.e.write(p0, p1.mRecordNewSuiteInfoList);
          }
          if (p1.mEditSuiteInfoList != null) {
             p0.r("editSuits");
             this.e.write(p0, p1.mEditSuiteInfoList);
          }
          if (p1.mWhatsUpSuiteInfoList != null) {
             p0.r("whatsUpSuits");
             this.e.write(p0, p1.mWhatsUpSuiteInfoList);
          }
          if (p1.mBeautifyItemInfoList != null) {
             p0.r("parts");
             this.g.write(p0, p1.mBeautifyItemInfoList);
          }
          if (p1.mBeautifyGroupInfoList != null) {
             p0.r("groups");
             this.i.write(p0, p1.mBeautifyGroupInfoList);
          }
          p0.r("version");
          p0.K((long)p1.mVersion);
          p0.j();
       }
       return;
    }
}
