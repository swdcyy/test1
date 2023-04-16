package com.kuaishou.android.model.mix.FollowShootModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FollowShootModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.google.gson.stream.b;

public final class FollowShootModel$TypeAdapter extends TypeAdapter	// class@000c8d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       FollowShootModel$TypeAdapter.d = a.get(FollowShootModel.class);
    }
    public void FollowShootModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public FollowShootModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FollowShootModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FollowShootModel uFollowShoot = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFollowShoot;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFollowShoot;
       }else {
          p0.c();
          FollowShootModel uFollowShoot1 = new FollowShootModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbd82aaed:
                   if (str.equals("isLipsSyncPhoto")) {
                      i = 0;
                   }
                   break;
                 case 0x1944ea21:
                   if (str.equals("lrcUrls")) {
                      i = 1;
                   }
                   break;
                 case 0x207c22e6:
                   if (str.equals("disableFollowShoot")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFollowShoot1.mIsLipsSyncPhoto = KnownTypeAdapters$g.a(p0, uFollowShoot1.mIsLipsSyncPhoto);
                   break;
                 case 1:
                   uFollowShoot1.mLrcUrls = this.c.read(p0);
                   break;
                 case 2:
                   uFollowShoot1.mDisableFollowShoot = KnownTypeAdapters$g.a(p0, uFollowShoot1.mDisableFollowShoot);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFollowShoot1;
       }
    }
    public void b(b p0,FollowShootModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowShootModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLrcUrls != null) {
             p0.r("lrcUrls");
             this.c.write(p0, p1.mLrcUrls);
          }
          p0.r("disableFollowShoot");
          p0.P(p1.mDisableFollowShoot);
          p0.r("isLipsSyncPhoto");
          p0.P(p1.mIsLipsSyncPhoto);
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
