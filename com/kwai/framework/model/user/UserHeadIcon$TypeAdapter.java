package com.kwai.framework.model.user.UserHeadIcon$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.user.UserHeadIcon;
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
import pa6.s;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;
import pa6.r;

public final class UserHeadIcon$TypeAdapter extends TypeAdapter	// class@001759
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       UserHeadIcon$TypeAdapter.c = a.get(UserHeadIcon.class);
    }
    public void UserHeadIcon$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UserHeadIcon$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new UserHeadIcon();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("headIconName")) {
                   if (!str1.equals("headIconUrls")) {
                      p0.Q();
                   }else {
                      obj.mHeadIconUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new s(this)).a(p0);
                   }
                }else {
                   obj.mHeadIconName = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UserHeadIcon$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mHeadIconName != null) {
             p0.r("headIconName");
             TypeAdapters.A.write(p0, p1.mHeadIconName);
          }
          if (p1.mHeadIconUrls != null) {
             p0.r("headIconUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new r(this)).b(p0, p1.mHeadIconUrls);
          }
          p0.j();
       }
       return;
    }
}
