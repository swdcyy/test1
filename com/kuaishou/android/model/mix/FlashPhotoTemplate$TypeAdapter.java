package com.kuaishou.android.model.mix.FlashPhotoTemplate$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.FlashPhotoTemplate$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.FlashPhotoTemplate$TypeAdapter$a;

public final class FlashPhotoTemplate$TypeAdapter extends TypeAdapter	// class@000c89
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       FlashPhotoTemplate$TypeAdapter.c = a.get(FlashPhotoTemplate.class);
    }
    public void FlashPhotoTemplate$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public FlashPhotoTemplate a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FlashPhotoTemplate$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FlashPhotoTemplate uFlashPhotoT = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFlashPhotoT;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFlashPhotoT;
       }else {
          p0.c();
          FlashPhotoTemplate uFlashPhotoT1 = new FlashPhotoTemplate();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x956a642e:
                   if (str.equals("templateDuration")) {
                      i = 0;
                   }
                   break;
                 case 0x9c075bd8:
                   if (str.equals("flashUseCount")) {
                      i = 1;
                   }
                   break;
                 case 0xb40535ea:
                   if (str.equals("flashGroupId")) {
                      i = 2;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 3;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 4;
                   }
                   break;
                 case 0x7600fd3b:
                   if (str.equals("coverUrls")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFlashPhotoT1.mTemplateDuration = KnownTypeAdapters$j.a(p0, uFlashPhotoT1.mTemplateDuration);
                   break;
                 case 1:
                   uFlashPhotoT1.mFlashUseCount = KnownTypeAdapters$n.a(p0, uFlashPhotoT1.mFlashUseCount);
                   break;
                 case 2:
                   uFlashPhotoT1.mGroupId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFlashPhotoT1.mId = KnownTypeAdapters$k.a(p0, uFlashPhotoT1.mId);
                   break;
                 case 4:
                   uFlashPhotoT1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uFlashPhotoT1.mCoverImageUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new FlashPhotoTemplate$TypeAdapter$b(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFlashPhotoT1;
       }
    }
    public void b(b p0,FlashPhotoTemplate p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FlashPhotoTemplate$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("id");
          p0.K((long)p1.mId);
          if (p1.mGroupId != null) {
             p0.r("flashGroupId");
             TypeAdapters.A.write(p0, p1.mGroupId);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          p0.r("templateDuration");
          p0.J((double)p1.mTemplateDuration);
          p0.r("flashUseCount");
          p0.K(p1.mFlashUseCount);
          if (p1.mCoverImageUrls != null) {
             p0.r("coverUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new FlashPhotoTemplate$TypeAdapter$a(this)).b(p0, p1.mCoverImageUrls);
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
