package com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopDetailPageFlameType;
import java.lang.Class;
import el.a;
import java.util.HashMap;
import java.lang.Object;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter extends TypeAdapter	// class@000934
{
    public static final a a;
    public static final HashMap b;
    public static final HashMap c;

    static {
       PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.a = a.get(PhotoAdvertisement$FansTopDetailPageFlameType.class);
       HashMap hashMap = new HashMap(4);
       PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.b = hashMap;
       PhotoAdvertisement$FansTopDetailPageFlameType oRIGINAL = PhotoAdvertisement$FansTopDetailPageFlameType.ORIGINAL;
       hashMap.put("0", oRIGINAL);
       PhotoAdvertisement$FansTopDetailPageFlameType fLAME_ONLY = PhotoAdvertisement$FansTopDetailPageFlameType.FLAME_ONLY;
       hashMap.put("1", fLAME_ONLY);
       PhotoAdvertisement$FansTopDetailPageFlameType fLAME_WITH_M = PhotoAdvertisement$FansTopDetailPageFlameType.FLAME_WITH_MESSAGE;
       hashMap.put("2", fLAME_WITH_M);
       PhotoAdvertisement$FansTopDetailPageFlameType nONE = PhotoAdvertisement$FansTopDetailPageFlameType.NONE;
       hashMap.put("3", nONE);
       hashMap = new HashMap(4);
       PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.c = hashMap;
       hashMap.put(oRIGINAL, "0");
       hashMap.put(fLAME_ONLY, "1");
       hashMap.put(fLAME_WITH_M, "2");
       hashMap.put(nONE, "3");
    }
    public void PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter(Gson p0){
       super();
    }
    public PhotoAdvertisement$FansTopDetailPageFlameType a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.J() != JsonToken.NULL) {
          return PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.b.get(p0.E());
       }
       p0.A();
       return null;
    }
    public void b(b p0,PhotoAdvertisement$FansTopDetailPageFlameType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.class, "1")) {
          return;
       }
       String str = (p1 == null)? null: PhotoAdvertisement$FansTopDetailPageFlameType$TypeAdapter.c.get(p1);
       p0.O(str);
       return;
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
