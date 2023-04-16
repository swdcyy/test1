package com.yxcorp.gifshow.postentrance.util.PostEntranceStartupPojo$TypeAdapter;
import com.google.gson.TypeAdapter;
import a0c.i;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
import cn6.a;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$e;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters;
import com.google.gson.JsonArray;
import java.util.Map;
import com.google.gson.stream.b;

public final class PostEntranceStartupPojo$TypeAdapter extends TypeAdapter	// class@001089
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       PostEntranceStartupPojo$TypeAdapter.g = a.get(i.class);
    }
    public void PostEntranceStartupPojo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(PostShowStartUpInfo.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       typeAdapter = p0.j(a.get(a.class));
       this.d = typeAdapter;
       this.e = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, typeAdapter, new KnownTypeAdapters$e());
       this.f = p0.j(a.get(PublishGuideInfo.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PostEntranceStartupPojo$TypeAdapter.class, "2");
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
             obj = new i();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x8f997f2d:
                      if (str.equals("publishGuide")) {
                         i = 0;
                      }
                      break;
                    case 0xed4b0345:
                      if (str.equals("localBubbleFrequency")) {
                         i = 1;
                      }
                      break;
                    case 0x639666e6:
                      if (str.equals("publishGuides")) {
                         i = 2;
                      }
                      break;
                    case 0x68eeb5fa:
                      if (str.equals("posterShowStartConfig")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPublishGuideInfo = this.f.read(p0);
                      break;
                    case 1:
                      obj.mHomePostLocalBubbleFrequencyMap = this.e.read(p0);
                      break;
                    case 2:
                      obj.mPublishGuidesInfo = KnownTypeAdapters.q.read(p0);
                      break;
                    case 3:
                      obj.mPostShowStartUpInfo = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostEntranceStartupPojo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPostShowStartUpInfo != null) {
             p0.r("posterShowStartConfig");
             this.c.write(p0, p1.mPostShowStartUpInfo);
          }
          if (p1.mHomePostLocalBubbleFrequencyMap != null) {
             p0.r("localBubbleFrequency");
             this.e.write(p0, p1.mHomePostLocalBubbleFrequencyMap);
          }
          if (p1.mPublishGuideInfo != null) {
             p0.r("publishGuide");
             this.f.write(p0, p1.mPublishGuideInfo);
          }
          if (p1.mPublishGuidesInfo != null) {
             p0.r("publishGuides");
             KnownTypeAdapters.q.write(p0, p1.mPublishGuidesInfo);
          }
          p0.j();
       }
       return;
    }
}
