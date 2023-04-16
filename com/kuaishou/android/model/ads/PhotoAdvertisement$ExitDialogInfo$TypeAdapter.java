package com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExitDialogInfo;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$ExitDialogInfo$TypeAdapter extends TypeAdapter	// class@000924
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$ExitDialogInfo$TypeAdapter.b = a.get(PhotoAdvertisement$ExitDialogInfo.class);
    }
    public void PhotoAdvertisement$ExitDialogInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$ExitDialogInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ExitDialogInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ExitDialogInfo uExitDialogI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uExitDialogI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uExitDialogI;
       }else {
          p0.c();
          PhotoAdvertisement$ExitDialogInfo uExitDialogI1 = new PhotoAdvertisement$ExitDialogInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("enableShowChangeVideoButton")) {
                p0.Q();
             }else {
                uExitDialogI1.mEnableShowChangeVideoButton = KnownTypeAdapters$g.a(p0, uExitDialogI1.mEnableShowChangeVideoButton);
             }
          }
          p0.j();
          return uExitDialogI1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ExitDialogInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ExitDialogInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("enableShowChangeVideoButton");
          p0.P(p1.mEnableShowChangeVideoButton);
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
