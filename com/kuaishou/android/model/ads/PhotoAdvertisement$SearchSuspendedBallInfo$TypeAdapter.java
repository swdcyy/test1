package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter extends TypeAdapter	// class@000a11
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter.d = a.get(PhotoAdvertisement$SearchSuspendedBallInfo.class);
    }
    public void PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoAdvertisement$StrongStyle$TypeAdapter.b);
       this.c = p0.j(PhotoAdvertisement$WeakStyle$TypeAdapter.b);
    }
    public PhotoAdvertisement$SearchSuspendedBallInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$SearchSuspendedBallInfo searchSuspen = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return searchSuspen;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return searchSuspen;
       }else {
          p0.c();
          PhotoAdvertisement$SearchSuspendedBallInfo searchSuspen1 = new PhotoAdvertisement$SearchSuspendedBallInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("weakStyle")) {
                if (!str.equals("strongStyle")) {
                   p0.Q();
                }else {
                   searchSuspen1.mStrongStyle = this.b.read(p0);
                }
             }else {
                searchSuspen1.mWeakStyle = this.c.read(p0);
             }
          }
          p0.j();
          return searchSuspen1;
       }
    }
    public void b(b p0,PhotoAdvertisement$SearchSuspendedBallInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$SearchSuspendedBallInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mStrongStyle != null) {
             p0.r("strongStyle");
             this.b.write(p0, p1.mStrongStyle);
          }
          if (p1.mWeakStyle != null) {
             p0.r("weakStyle");
             this.c.write(p0, p1.mWeakStyle);
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
