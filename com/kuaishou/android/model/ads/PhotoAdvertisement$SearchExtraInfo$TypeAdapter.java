package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$SearchExtraInfo$TypeAdapter extends TypeAdapter	// class@000a0d
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$SearchExtraInfo$TypeAdapter.c = a.get(PhotoAdvertisement$SearchExtraInfo.class);
    }
    public void PhotoAdvertisement$SearchExtraInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$LiveGoodsInfo$TypeAdapter.b);
    }
    public PhotoAdvertisement$SearchExtraInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$SearchExtraInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$SearchExtraInfo searchExtraI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return searchExtraI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return searchExtraI;
       }else {
          p0.c();
          PhotoAdvertisement$SearchExtraInfo searchExtraI1 = new PhotoAdvertisement$SearchExtraInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("liveGoodsInfo")) {
                p0.Q();
             }else {
                searchExtraI1.mLiveGoodsInfo = this.b.read(p0);
             }
          }
          p0.j();
          return searchExtraI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$SearchExtraInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$SearchExtraInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveGoodsInfo != null) {
             p0.r("liveGoodsInfo");
             this.b.write(p0, p1.mLiveGoodsInfo);
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
