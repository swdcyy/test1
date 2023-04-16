package com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentEmojiInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import java.util.List;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CommentEmojiInfo$TypeAdapter extends TypeAdapter	// class@0008e8
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$CommentEmojiInfo$TypeAdapter.c = a.get(PhotoAdvertisement$CommentEmojiInfo.class);
    }
    public void PhotoAdvertisement$CommentEmojiInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$CommentEmojiInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CommentEmojiInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CommentEmojiInfo uCommentEmoj = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCommentEmoj;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCommentEmoj;
       }else {
          p0.c();
          PhotoAdvertisement$CommentEmojiInfo uCommentEmoj1 = new PhotoAdvertisement$CommentEmojiInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd4007cb7:
                   if (str.equals("iconList")) {
                      i = 0;
                   }
                   break;
                 case 0xd4045b53:
                   if (str.equals("iconType")) {
                      i = 1;
                   }
                   break;
                 case 0x3597b0a2:
                   if (str.equals("commentMsg")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCommentEmoj1.mIconList = this.b.read(p0);
                   break;
                 case 1:
                   uCommentEmoj1.mIconType = KnownTypeAdapters$k.a(p0, uCommentEmoj1.mIconType);
                   break;
                 case 2:
                   uCommentEmoj1.mCommentMsg = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCommentEmoj1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CommentEmojiInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CommentEmojiInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCommentMsg != null) {
             p0.r("commentMsg");
             TypeAdapters.A.write(p0, p1.mCommentMsg);
          }
          p0.r("iconType");
          p0.K((long)p1.mIconType);
          if (p1.mIconList != null) {
             p0.r("iconList");
             this.b.write(p0, p1.mIconList);
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
