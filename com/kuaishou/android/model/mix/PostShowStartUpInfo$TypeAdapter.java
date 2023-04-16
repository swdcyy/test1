package com.kuaishou.android.model.mix.PostShowStartUpInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
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
import com.kuaishou.android.model.mix.PostShowStartUpInfo$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.PostShowStartUpInfo$TypeAdapter$a;

public final class PostShowStartUpInfo$TypeAdapter extends TypeAdapter	// class@000dbd
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PostShowStartUpInfo$TypeAdapter.c = a.get(PostShowStartUpInfo.class);
    }
    public void PostShowStartUpInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public PostShowStartUpInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PostShowStartUpInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PostShowStartUpInfo postShowStar = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return postShowStar;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return postShowStar;
       }else {
          p0.c();
          PostShowStartUpInfo postShowStar1 = new PostShowStartUpInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x99ccc41d:
                   if (str.equals("bottomSelectionShowLimit")) {
                      i = 0;
                   }
                   break;
                 case 0xf7c3d9d5:
                   if (str.equals("openCameraAlbumTab")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x16e34e2d:
                   if (str.equals("rightCornerShowLimit")) {
                      i = 3;
                   }
                   break;
                 case 0x68ad4256:
                   if (str.equals("originTagPic")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   postShowStar1.mBottomSelectionShowLimit = KnownTypeAdapters$k.a(p0, postShowStar1.mBottomSelectionShowLimit);
                   break;
                 case 1:
                   postShowStar1.mOpenCameraAlbumTab = KnownTypeAdapters$k.a(p0, postShowStar1.mOpenCameraAlbumTab);
                   break;
                 case 2:
                   postShowStar1.mType = KnownTypeAdapters$k.a(p0, postShowStar1.mType);
                   break;
                 case 3:
                   postShowStar1.mRightCornerShowLimit = KnownTypeAdapters$k.a(p0, postShowStar1.mRightCornerShowLimit);
                   break;
                 case 4:
                   postShowStar1.mOriginTagPic = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new PostShowStartUpInfo$TypeAdapter$b(this)).a(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return postShowStar1;
       }
    }
    public void b(b p0,PostShowStartUpInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostShowStartUpInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          p0.r("bottomSelectionShowLimit");
          p0.K((long)p1.mBottomSelectionShowLimit);
          p0.r("rightCornerShowLimit");
          p0.K((long)p1.mRightCornerShowLimit);
          if (p1.mOriginTagPic != null) {
             p0.r("originTagPic");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new PostShowStartUpInfo$TypeAdapter$a(this)).b(p0, p1.mOriginTagPic);
          }
          p0.r("openCameraAlbumTab");
          p0.K((long)p1.mOpenCameraAlbumTab);
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
