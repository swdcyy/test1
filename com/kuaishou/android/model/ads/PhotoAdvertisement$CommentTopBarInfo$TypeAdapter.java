package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import java.lang.Object;
import com.vimeo.stag.KnownTypeAdapters$MapTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$c;
import bl.p;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.HashMap;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CommentTopBarInfo$TypeAdapter extends TypeAdapter	// class@0008ec
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$CommentTopBarInfo$TypeAdapter.d = a.get(PhotoAdvertisement$CommentTopBarInfo.class);
    }
    public void PhotoAdvertisement$CommentTopBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(Object.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$MapTypeAdapter(TypeAdapters.A, typeAdapter, new KnownTypeAdapters$c());
    }
    public PhotoAdvertisement$CommentTopBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CommentTopBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CommentTopBarInfo uCommentTopB = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentTopB;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentTopB;
       }else {
          p0.c();
          PhotoAdvertisement$CommentTopBarInfo uCommentTopB1 = new PhotoAdvertisement$CommentTopBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x836c5bf8:
                   if (str.equals("subTitle")) {
                      i = 0;
                   }
                   break;
                 case 0x8ce5ff0c:
                   if (str.equals("showArrow")) {
                      i = 1;
                   }
                   break;
                 case 0x909910f1:
                   if (str.equals("subDesc")) {
                      i = 2;
                   }
                   break;
                 case 0xcb2acf20:
                   if (str.equals("clientExtData")) {
                      i = 3;
                   }
                   break;
                 case 0xf069d81f:
                   if (str.equals("mainTitle")) {
                      i = 4;
                   }
                   break;
                 case 0xff77f3ea:
                   if (str.equals("mainDesc")) {
                      i = 5;
                   }
                   break;
                 case 0x1bf9a:
                   if (str.equals("tag")) {
                      i = 6;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 7;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCommentTopB1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uCommentTopB1.mShowArrow = KnownTypeAdapters$g.a(p0, uCommentTopB1.mShowArrow);
                   break;
                 case 2:
                   uCommentTopB1.mSubDesc = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCommentTopB1.mClientExtData = this.c.read(p0);
                   break;
                 case 4:
                   uCommentTopB1.mMainTitle = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uCommentTopB1.mMainDesc = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCommentTopB1.mTag = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCommentTopB1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommentTopB1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CommentTopBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CommentTopBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mMainTitle != null) {
             p0.r("mainTitle");
             TypeAdapters.A.write(p0, p1.mMainTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subTitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mMainDesc != null) {
             p0.r("mainDesc");
             TypeAdapters.A.write(p0, p1.mMainDesc);
          }
          if (p1.mSubDesc != null) {
             p0.r("subDesc");
             TypeAdapters.A.write(p0, p1.mSubDesc);
          }
          p0.r("showArrow");
          p0.P(p1.mShowArrow);
          if (p1.mTag != null) {
             p0.r("tag");
             TypeAdapters.A.write(p0, p1.mTag);
          }
          if (p1.mClientExtData != null) {
             p0.r("clientExtData");
             this.c.write(p0, p1.mClientExtData);
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
