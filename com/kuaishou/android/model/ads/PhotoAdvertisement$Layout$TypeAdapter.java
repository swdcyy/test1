package com.kuaishou.android.model.ads.PhotoAdvertisement$Layout$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$Layout$TypeAdapter extends TypeAdapter	// class@000991
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$Layout$TypeAdapter.b = a.get(PhotoAdvertisement$Layout.class);
    }
    public void PhotoAdvertisement$Layout$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$Layout a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$Layout$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$Layout layout = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return layout;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return layout;
       }else {
          p0.c();
          PhotoAdvertisement$Layout layout1 = new PhotoAdvertisement$Layout();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("gravity")) {
                if (!str.equals("anchorTopMargin")) {
                   p0.Q();
                }else {
                   layout1.mAnchorTopMargin = KnownTypeAdapters$k.a(p0, layout1.mAnchorTopMargin);
                }
             }else {
                layout1.mGravity = KnownTypeAdapters$k.a(p0, layout1.mGravity);
             }
          }
          p0.j();
          return layout1;
       }
    }
    public void b(b p0,PhotoAdvertisement$Layout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$Layout$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("gravity");
          p0.K((long)p1.mGravity);
          p0.r("anchorTopMargin");
          p0.K((long)p1.mAnchorTopMargin);
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
