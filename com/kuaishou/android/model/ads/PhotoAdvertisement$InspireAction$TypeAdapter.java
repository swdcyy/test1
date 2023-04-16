package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$InspireAction$TypeAdapter extends TypeAdapter	// class@000960
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$InspireAction$TypeAdapter.d = a.get(PhotoAdvertisement$InspireAction.class);
    }
    public void PhotoAdvertisement$InspireAction$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
       this.c = p0.j(PhotoAdvertisement$SecondNeoInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$InspireAction a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$InspireAction$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$InspireAction inspireActio = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return inspireActio;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return inspireActio;
       }else {
          p0.c();
          PhotoAdvertisement$InspireAction inspireActio1 = new PhotoAdvertisement$InspireAction();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8a963f47:
                   if (str.equals("activeAppRewardValue")) {
                      i = 0;
                   }
                   break;
                 case 0xc777569b:
                   if (str.equals("minActionTimeMs")) {
                      i = 1;
                   }
                   break;
                 case 0xd6ae7d68:
                   if (str.equals("pecType")) {
                      i = 2;
                   }
                   break;
                 case 0xff10f543:
                   if (str.equals("pecStyle")) {
                      i = 3;
                   }
                   break;
                 case 0xffe81bc5:
                   if (str.equals("fakeCommentUrl")) {
                      i = 4;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 5;
                   }
                   break;
                 case 0xbd151fd:
                   if (str.equals("actionBar")) {
                      i = 6;
                   }
                   break;
                 case 0x193ec342:
                   if (str.equals("secondInfo")) {
                      i = 7;
                   }
                   break;
                 case 0x7342b54a:
                   if (str.equals("fakeComment")) {
                      i = 8;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   inspireActio1.mActiveAppRewardValue = KnownTypeAdapters$k.a(p0, inspireActio1.mActiveAppRewardValue);
                   break;
                 case 1:
                   inspireActio1.mMinActionTimeMs = KnownTypeAdapters$k.a(p0, inspireActio1.mMinActionTimeMs);
                   break;
                 case 2:
                   inspireActio1.mPecType = KnownTypeAdapters$k.a(p0, inspireActio1.mPecType);
                   break;
                 case 3:
                   inspireActio1.mPecStyle = KnownTypeAdapters$k.a(p0, inspireActio1.mPecStyle);
                   break;
                 case 4:
                   inspireActio1.mFakeCommentUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   inspireActio1.mAwardType = TypeAdapters.A.read(p0);
                   break;
                 case 6:
                   inspireActio1.mActionBar = TypeAdapters.A.read(p0);
                   break;
                 case 7:
                   inspireActio1.mSecondNeoInfo = this.c.read(p0);
                   break;
                 case 8:
                   inspireActio1.mFakeComment = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return inspireActio1;
       }
    }
    public void b(b p0,PhotoAdvertisement$InspireAction p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$InspireAction$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("pecType");
          p0.K((long)p1.mPecType);
          if (p1.mActionBar != null) {
             p0.r("actionBar");
             TypeAdapters.A.write(p0, p1.mActionBar);
          }
          if (p1.mAwardType != null) {
             p0.r("type");
             TypeAdapters.A.write(p0, p1.mAwardType);
          }
          p0.r("pecStyle");
          p0.K((long)p1.mPecStyle);
          if (p1.mFakeComment != null) {
             p0.r("fakeComment");
             this.b.write(p0, p1.mFakeComment);
          }
          if (p1.mFakeCommentUrl != null) {
             p0.r("fakeCommentUrl");
             TypeAdapters.A.write(p0, p1.mFakeCommentUrl);
          }
          p0.r("activeAppRewardValue");
          p0.K((long)p1.mActiveAppRewardValue);
          p0.r("minActionTimeMs");
          p0.K((long)p1.mMinActionTimeMs);
          if (p1.mSecondNeoInfo != null) {
             p0.r("secondInfo");
             this.c.write(p0, p1.mSecondNeoInfo);
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
