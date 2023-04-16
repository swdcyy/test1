package com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FansTopFeedFlameType;
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

public final class PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter extends TypeAdapter	// class@000938
{
    public static final a a;
    public static final HashMap b;
    public static final HashMap c;

    static {
       PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.a = a.get(PhotoAdvertisement$FansTopFeedFlameType.class);
       HashMap hashMap = new HashMap(5);
       PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.b = hashMap;
       PhotoAdvertisement$FansTopFeedFlameType oRIGINAL = PhotoAdvertisement$FansTopFeedFlameType.ORIGINAL;
       hashMap.put("0", oRIGINAL);
       PhotoAdvertisement$FansTopFeedFlameType fLAME_ONLY = PhotoAdvertisement$FansTopFeedFlameType.FLAME_ONLY;
       hashMap.put("1", fLAME_ONLY);
       PhotoAdvertisement$FansTopFeedFlameType fLAME_WITH_M = PhotoAdvertisement$FansTopFeedFlameType.FLAME_WITH_MESSAGE;
       hashMap.put("2", fLAME_WITH_M);
       PhotoAdvertisement$FansTopFeedFlameType fLAME_ON_COV = PhotoAdvertisement$FansTopFeedFlameType.FLAME_ON_COVER_IMAGE;
       hashMap.put("3", fLAME_ON_COV);
       PhotoAdvertisement$FansTopFeedFlameType nONE = PhotoAdvertisement$FansTopFeedFlameType.NONE;
       hashMap.put("4", nONE);
       hashMap = new HashMap(5);
       PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.c = hashMap;
       hashMap.put(oRIGINAL, "0");
       hashMap.put(fLAME_ONLY, "1");
       hashMap.put(fLAME_WITH_M, "2");
       hashMap.put(fLAME_ON_COV, "3");
       hashMap.put(nONE, "4");
    }
    public void PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter(Gson p0){
       super();
    }
    public PhotoAdvertisement$FansTopFeedFlameType a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.J() != JsonToken.NULL) {
          return PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.b.get(p0.E());
       }
       p0.A();
       return null;
    }
    public void b(b p0,PhotoAdvertisement$FansTopFeedFlameType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.class, "1")) {
          return;
       }
       String str = (p1 == null)? null: PhotoAdvertisement$FansTopFeedFlameType$TypeAdapter.c.get(p1);
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
