package com.kuaishou.android.model.mix.RankMeta$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.RankMeta;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.RankMeta$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.RankMeta$TypeAdapter$a;

public final class RankMeta$TypeAdapter extends TypeAdapter	// class@000de1
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       RankMeta$TypeAdapter.e = a.get(RankMeta.class);
    }
    public void RankMeta$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(User.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(CDNUrl.class));
    }
    public RankMeta a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RankMeta$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       RankMeta rankMeta = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return rankMeta;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return rankMeta;
       }else {
          p0.c();
          RankMeta rankMeta1 = new RankMeta();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb3ccff59:
                   if (str.equals("feedId")) {
                      i = 0;
                   }
                   break;
                 case 0xd404b4fd:
                   if (str.equals("iconUrls")) {
                      i = 1;
                   }
                   break;
                 case 0x302bcfe:
                   if (str.equals("category")) {
                      i = 2;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 3;
                   }
                   break;
                 case 0x6a68e08:
                   if (str.equals("users")) {
                      i = 4;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   rankMeta1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   rankMeta1.mIconUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.d, new RankMeta$TypeAdapter$b(this)).a(p0);
                   break;
                 case 2:
                   rankMeta1.mCategory = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   rankMeta1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   rankMeta1.mUsers = this.c.read(p0);
                   break;
                 case 5:
                   rankMeta1.mContent = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return rankMeta1;
       }
    }
    public void b(b p0,RankMeta p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RankMeta$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("feedId");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mUsers != null) {
             p0.r("users");
             this.c.write(p0, p1.mUsers);
          }
          if (p1.mCategory != null) {
             p0.r("category");
             TypeAdapters.A.write(p0, p1.mCategory);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mIconUrls != null) {
             p0.r("iconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.d, new RankMeta$TypeAdapter$a(this)).b(p0, p1.mIconUrls);
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
