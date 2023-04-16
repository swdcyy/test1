package com.kuaishou.android.model.mix.TagItem$InitiatorPhoto$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto;
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
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.TagItem$InitiatorPhoto$TypeAdapter$a;

public final class TagItem$InitiatorPhoto$TypeAdapter extends TypeAdapter	// class@000e15
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       TagItem$InitiatorPhoto$TypeAdapter.c = a.get(TagItem$InitiatorPhoto.class);
    }
    public void TagItem$InitiatorPhoto$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public TagItem$InitiatorPhoto a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TagItem$InitiatorPhoto$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       TagItem$InitiatorPhoto initiatorPho = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return initiatorPho;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return initiatorPho;
       }else {
          p0.c();
          TagItem$InitiatorPhoto initiatorPho1 = new TagItem$InitiatorPhoto();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("cover_thumbnail_urls")) {
                p0.Q();
             }else {
                initiatorPho1.mCoverUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new TagItem$InitiatorPhoto$TypeAdapter$b(this)).a(p0);
             }
          }
          p0.j();
          return initiatorPho1;
       }
    }
    public void b(b p0,TagItem$InitiatorPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TagItem$InitiatorPhoto$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCoverUrls != null) {
             p0.r("cover_thumbnail_urls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new TagItem$InitiatorPhoto$TypeAdapter$a(this)).b(p0, p1.mCoverUrls);
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
