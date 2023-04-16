package com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$TypeAdapter$a;

public final class LiveAuthorHeadIdentityTag$TypeAdapter extends TypeAdapter	// class@000af9
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveAuthorHeadIdentityTag$TypeAdapter.c = a.get(LiveAuthorHeadIdentityTag.class);
    }
    public void LiveAuthorHeadIdentityTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public LiveAuthorHeadIdentityTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveAuthorHeadIdentityTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveAuthorHeadIdentityTag liveAuthorHe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveAuthorHe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveAuthorHe;
       }else {
          p0.c();
          LiveAuthorHeadIdentityTag liveAuthorHe1 = new LiveAuthorHeadIdentityTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("iconUrls")) {
                if (!str.equals("text")) {
                   p0.Q();
                }else {
                   liveAuthorHe1.mTitle = TypeAdapters.A.read(p0);
                }
             }else {
                liveAuthorHe1.mIconUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new LiveAuthorHeadIdentityTag$TypeAdapter$b(this)).a(p0);
             }
          }
          p0.j();
          return liveAuthorHe1;
       }
    }
    public void b(b p0,LiveAuthorHeadIdentityTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAuthorHeadIdentityTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mIconUrls != null) {
             p0.r("iconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new LiveAuthorHeadIdentityTag$TypeAdapter$a(this)).b(p0, p1.mIconUrls);
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
