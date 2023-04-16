package com.kwai.framework.model.user.Status$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.Status;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$c;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.HashMap;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class Status$TypeAdapter extends TypeAdapter	// class@00172b
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       Status$TypeAdapter.f = a.get(Status.class);
    }
    public void Status$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       TypeAdapter typeAdapter1 = p0.j(a.get(Object.class));
       this.d = typeAdapter1;
       this.e = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, typeAdapter1, new KnownTypeAdapters$c());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Status$TypeAdapter.class, "2");
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
             obj = new Status();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xcb0f39a1:
                      if (str.equals("moodTitle")) {
                         i = 0;
                      }
                      break;
                    case 0xedc19810:
                      if (str.equals("moodIcon")) {
                         i = 1;
                      }
                      break;
                    case 0xedc6ead1:
                      if (str.equals("moodType")) {
                         i = 2;
                      }
                      break;
                    case 0xf048eca8:
                      if (str.equals("faceDetection")) {
                         i = 3;
                      }
                      break;
                    case 0x33a7140f:
                      if (str.equals("moodSubTitle")) {
                         i = 4;
                      }
                      break;
                    case 0x42d9e1f7:
                      if (str.equals("moodTemplatePreview")) {
                         i = 5;
                      }
                      break;
                    case 0x4747637f:
                      if (str.equals("viewType")) {
                         i = 6;
                      }
                      break;
                    case 0x6bb456a9:
                      if (str.equals("serverParams")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mMoodTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mMoodIcon = this.c.read(p0);
                      break;
                    case 2:
                      obj.mMoodType = KnownTypeAdapters$k.a(p0, obj.mMoodType);
                      break;
                    case 3:
                      obj.mFaceDetection = KnownTypeAdapters$g.a(p0, obj.mFaceDetection);
                      break;
                    case 4:
                      obj.mMoodSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mMoodTemplatePreview = this.c.read(p0);
                      break;
                    case 6:
                      obj.mViewType = KnownTypeAdapters$k.a(p0, obj.mViewType);
                      break;
                    case 7:
                      obj.mServerParams = this.e.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Status$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("moodType");
          p0.K((long)p1.mMoodType);
          p0.r("viewType");
          p0.K((long)p1.mViewType);
          if (p1.mMoodTitle != null) {
             p0.r("moodTitle");
             TypeAdapters.A.write(p0, p1.mMoodTitle);
          }
          if (p1.mMoodSubTitle != null) {
             p0.r("moodSubTitle");
             TypeAdapters.A.write(p0, p1.mMoodSubTitle);
          }
          p0.r("faceDetection");
          p0.P(p1.mFaceDetection);
          if (p1.mMoodIcon != null) {
             p0.r("moodIcon");
             this.c.write(p0, p1.mMoodIcon);
          }
          if (p1.mMoodTemplatePreview != null) {
             p0.r("moodTemplatePreview");
             this.c.write(p0, p1.mMoodTemplatePreview);
          }
          if (p1.mServerParams != null) {
             p0.r("serverParams");
             this.e.write(p0, p1.mServerParams);
          }
          p0.j();
       }
       return;
    }
}
