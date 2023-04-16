package com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TransitionInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$TvcInfo$TypeAdapter extends TypeAdapter	// class@000a51
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$TvcInfo$TypeAdapter.d = a.get(PhotoAdvertisement$TvcInfo.class);
    }
    public void PhotoAdvertisement$TvcInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$TVCActionBarInfo$TypeAdapter.b);
       this.c = p0.j(PhotoAdvertisement$TransitionInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$TvcInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$TvcInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$TvcInfo tvcInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tvcInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tvcInfo;
       }else {
          p0.c();
          PhotoAdvertisement$TvcInfo tvcInfo1 = new PhotoAdvertisement$TvcInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x888d93a3:
                   if (str.equals("transitionInfo")) {
                      i = 0;
                   }
                   break;
                 case 0xd832e1c7:
                   if (str.equals("liveStreamId")) {
                      i = 1;
                   }
                   break;
                 case 0xf2fa34e1:
                   if (str.equals("sourceDescription")) {
                      i = 2;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 3;
                   }
                   break;
                 case 0x3ed0e44b:
                   if (str.equals("actionBarInfo")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tvcInfo1.mTransitionInfo = this.c.read(p0);
                   break;
                 case 1:
                   tvcInfo1.mLiveStreamId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   tvcInfo1.mSourceDescription = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   tvcInfo1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   tvcInfo1.mActionBarInfo = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tvcInfo1;
       }
    }
    public void b(b p0,PhotoAdvertisement$TvcInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$TvcInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mSourceDescription != null) {
             p0.r("sourceDescription");
             TypeAdapters.A.write(p0, p1.mSourceDescription);
          }
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mActionBarInfo != null) {
             p0.r("actionBarInfo");
             this.b.write(p0, p1.mActionBarInfo);
          }
          if (p1.mTransitionInfo != null) {
             p0.r("transitionInfo");
             this.c.write(p0, p1.mTransitionInfo);
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
