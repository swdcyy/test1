package com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;
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

public final class PhotoAdvertisement$AdLabelType$TypeAdapter extends TypeAdapter	// class@0008ab
{
    public static final a a;
    public static final HashMap b;
    public static final HashMap c;

    static {
       PhotoAdvertisement$AdLabelType$TypeAdapter.a = a.get(PhotoAdvertisement$AdLabelType.class);
       HashMap hashMap = new HashMap(2);
       PhotoAdvertisement$AdLabelType$TypeAdapter.b = hashMap;
       PhotoAdvertisement$AdLabelType tRANSPARENT_ = PhotoAdvertisement$AdLabelType.TRANSPARENT_BACKGROUND;
       hashMap.put("0", tRANSPARENT_);
       PhotoAdvertisement$AdLabelType sOLID_BACKGR = PhotoAdvertisement$AdLabelType.SOLID_BACKGROUND;
       hashMap.put("1", sOLID_BACKGR);
       hashMap = new HashMap(2);
       PhotoAdvertisement$AdLabelType$TypeAdapter.c = hashMap;
       hashMap.put(tRANSPARENT_, "0");
       hashMap.put(sOLID_BACKGR, "1");
    }
    public void PhotoAdvertisement$AdLabelType$TypeAdapter(Gson p0){
       super();
    }
    public PhotoAdvertisement$AdLabelType a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdLabelType$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.J() != JsonToken.NULL) {
          return PhotoAdvertisement$AdLabelType$TypeAdapter.b.get(p0.E());
       }
       p0.A();
       return null;
    }
    public void b(b p0,PhotoAdvertisement$AdLabelType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdLabelType$TypeAdapter.class, "1")) {
          return;
       }
       String str = (p1 == null)? null: PhotoAdvertisement$AdLabelType$TypeAdapter.c.get(p1);
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
