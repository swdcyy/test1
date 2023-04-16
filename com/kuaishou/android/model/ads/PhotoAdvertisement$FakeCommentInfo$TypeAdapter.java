package com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FakeCommentInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$FakeCommentInfo$TypeAdapter extends TypeAdapter	// class@000930
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$FakeCommentInfo$TypeAdapter.b = a.get(PhotoAdvertisement$FakeCommentInfo.class);
    }
    public void PhotoAdvertisement$FakeCommentInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$FakeCommentInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$FakeCommentInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$FakeCommentInfo uFakeComment = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFakeComment;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFakeComment;
       }else {
          p0.c();
          PhotoAdvertisement$FakeCommentInfo uFakeComment1 = new PhotoAdvertisement$FakeCommentInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa714ac1a:
                   if (str.equals("productName")) {
                      i = 0;
                   }
                   break;
                 case 0xa81f7ea5:
                   if (str.equals("enableHideFakeComment")) {
                      i = 1;
                   }
                   break;
                 case 0xd7e8530a:
                   if (str.equals("convertedDescription")) {
                      i = 2;
                   }
                   break;
                 case 0x59b3c247:
                   if (str.equals("productIconUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x7df56077:
                   if (str.equals("liveFakeTitle")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFakeComment1.mUserName = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uFakeComment1.mEnableHideFakeComment = KnownTypeAdapters$g.a(p0, uFakeComment1.mEnableHideFakeComment);
                   break;
                 case 2:
                   uFakeComment1.mConvertedDescription = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   uFakeComment1.mUserIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uFakeComment1.mLiveFakeTitle = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFakeComment1;
       }
    }
    public void b(b p0,PhotoAdvertisement$FakeCommentInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$FakeCommentInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUserName != null) {
             p0.r("productName");
             TypeAdapters.A.write(p0, p1.mUserName);
          }
          if (p1.mUserIconUrl != null) {
             p0.r("productIconUrl");
             TypeAdapters.A.write(p0, p1.mUserIconUrl);
          }
          p0.r("enableHideFakeComment");
          p0.P(p1.mEnableHideFakeComment);
          if (p1.mLiveFakeTitle != null) {
             p0.r("liveFakeTitle");
             TypeAdapters.A.write(p0, p1.mLiveFakeTitle);
          }
          if (p1.mConvertedDescription != null) {
             p0.r("convertedDescription");
             TypeAdapters.A.write(p0, p1.mConvertedDescription);
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
