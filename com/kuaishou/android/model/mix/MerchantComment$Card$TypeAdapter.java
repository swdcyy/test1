package com.kuaishou.android.model.mix.MerchantComment$Card$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.MerchantComment$Card;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.internal.bind.TypeAdapters;
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

public final class MerchantComment$Card$TypeAdapter extends TypeAdapter	// class@000d1e
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       MerchantComment$Card$TypeAdapter.e = a.get(MerchantComment$Card.class);
    }
    public void MerchantComment$Card$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(CDNUrl.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public MerchantComment$Card a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MerchantComment$Card$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       MerchantComment$Card uCard = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCard;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCard;
       }else {
          p0.c();
          MerchantComment$Card uCard1 = new MerchantComment$Card();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbde62230:
                   if (str.equals("lcTags")) {
                      i = 0;
                   }
                   break;
                 case 0xe7f8c9dd:
                   if (str.equals("avatarUrls")) {
                      i = 1;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 2;
                   }
                   break;
                 case 0x363419:
                   if (str.equals("tags")) {
                      i = 3;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 4;
                   }
                   break;
                 case 0x4281c8e:
                   if (str.equals("nickName")) {
                      i = 5;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 6;
                   }
                   break;
                 case 0xbd19b59:
                   if (str.equals("actionUrl")) {
                      i = 7;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 8;
                   }
                   break;
                 case 0x5d51825e:
                   if (str.equals("actionLabel")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCard1.mLcTags = this.d.read(p0);
                   break;
                 case 1:
                   uCard1.mAvatarUrl = this.c.read(p0);
                   break;
                 case 2:
                   uCard1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uCard1.mTags = this.d.read(p0);
                   break;
                 case 4:
                   uCard1.mType = KnownTypeAdapters$k.a(p0, uCard1.mType);
                   break;
                 case 5:
                   uCard1.mNickName = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   uCard1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   uCard1.mActionUrl = TypeAdapters.A.read(p0);
                   break;
                 case 8:
                   uCard1.mContent = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   uCard1.mActionLabel = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCard1;
       }
    }
    public void b(b p0,MerchantComment$Card p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantComment$Card$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mActionLabel != null) {
             p0.r("actionLabel");
             TypeAdapters.A.write(p0, p1.mActionLabel);
          }
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mAvatarUrl != null) {
             p0.r("avatarUrls");
             this.c.write(p0, p1.mAvatarUrl);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mLcTags != null) {
             p0.r("lcTags");
             this.d.write(p0, p1.mLcTags);
          }
          if (p1.mNickName != null) {
             p0.r("nickName");
             TypeAdapters.A.write(p0, p1.mNickName);
          }
          if (p1.mTags != null) {
             p0.r("tags");
             this.d.write(p0, p1.mTags);
          }
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          p0.r("type");
          p0.K((long)p1.mType);
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
