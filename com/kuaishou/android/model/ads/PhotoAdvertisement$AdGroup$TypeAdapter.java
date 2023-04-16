package com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
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

public final class PhotoAdvertisement$AdGroup$TypeAdapter extends TypeAdapter	// class@0008a7
{
    public static final a a;
    public static final HashMap b;
    public static final HashMap c;

    static {
       PhotoAdvertisement$AdGroup$TypeAdapter.a = a.get(PhotoAdvertisement$AdGroup.class);
       HashMap hashMap = new HashMap(13);
       PhotoAdvertisement$AdGroup$TypeAdapter.b = hashMap;
       PhotoAdvertisement$AdGroup uNKNOWN = PhotoAdvertisement$AdGroup.UNKNOWN;
       hashMap.put("0", uNKNOWN);
       PhotoAdvertisement$AdGroup dSP = PhotoAdvertisement$AdGroup.DSP;
       hashMap.put("1", dSP);
       PhotoAdvertisement$AdGroup tHIRD_PLATFO = PhotoAdvertisement$AdGroup.THIRD_PLATFORM;
       hashMap.put("2", tHIRD_PLATFO);
       PhotoAdvertisement$AdGroup fANS_TOP = PhotoAdvertisement$AdGroup.FANS_TOP;
       hashMap.put("3", fANS_TOP);
       PhotoAdvertisement$AdGroup aD_SOCIAL = PhotoAdvertisement$AdGroup.AD_SOCIAL;
       hashMap.put("4", aD_SOCIAL);
       PhotoAdvertisement$AdGroup aLI_DONG_FEN = PhotoAdvertisement$AdGroup.ALI_DONG_FENG;
       hashMap.put("5", aLI_DONG_FEN);
       PhotoAdvertisement$AdGroup gR = PhotoAdvertisement$AdGroup.GR;
       hashMap.put("6", gR);
       PhotoAdvertisement$AdGroup aD_MERCHANT = PhotoAdvertisement$AdGroup.AD_MERCHANT;
       PhotoAdvertisement$AdGroup uAdGroup = gR;
       hashMap.put("7", aD_MERCHANT);
       PhotoAdvertisement$AdGroup uAdGroup1 = aD_MERCHANT;
       aD_MERCHANT = PhotoAdvertisement$AdGroup.FANS_TOP_MERCHANT;
       hashMap.put("8", aD_MERCHANT);
       PhotoAdvertisement$AdGroup uAdGroup2 = aD_MERCHANT;
       aD_MERCHANT = PhotoAdvertisement$AdGroup.AD_SOCIAL_MERCHANT;
       hashMap.put("9", aD_MERCHANT);
       PhotoAdvertisement$AdGroup uAdGroup3 = aD_MERCHANT;
       aD_MERCHANT = PhotoAdvertisement$AdGroup.AD_SOCIAL_CPS_MERCHANT;
       hashMap.put("10", aD_MERCHANT);
       PhotoAdvertisement$AdGroup uAdGroup4 = aD_MERCHANT;
       aD_MERCHANT = PhotoAdvertisement$AdGroup.AD_DSP_SOFT;
       hashMap.put("11", aD_MERCHANT);
       PhotoAdvertisement$AdGroup uAdGroup5 = aD_MERCHANT;
       aD_MERCHANT = PhotoAdvertisement$AdGroup.DSP_NATURE;
       hashMap.put("12", aD_MERCHANT);
       PhotoAdvertisement$AdGroup uAdGroup6 = aD_MERCHANT;
       hashMap = new HashMap(13);
       PhotoAdvertisement$AdGroup$TypeAdapter.c = hashMap;
       hashMap.put(uNKNOWN, "0");
       hashMap.put(dSP, "1");
       hashMap.put(tHIRD_PLATFO, "2");
       hashMap.put(fANS_TOP, "3");
       hashMap.put(aD_SOCIAL, "4");
       hashMap.put(aLI_DONG_FEN, "5");
       hashMap.put(uAdGroup, "6");
       hashMap.put(uAdGroup1, "7");
       hashMap.put(uAdGroup2, "8");
       hashMap.put(uAdGroup3, "9");
       hashMap.put(uAdGroup4, "10");
       hashMap.put(uAdGroup5, "11");
       hashMap.put(uAdGroup6, "12");
    }
    public void PhotoAdvertisement$AdGroup$TypeAdapter(Gson p0){
       super();
    }
    public PhotoAdvertisement$AdGroup a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdGroup$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.J() != JsonToken.NULL) {
          return PhotoAdvertisement$AdGroup$TypeAdapter.b.get(p0.E());
       }
       p0.A();
       return null;
    }
    public void b(b p0,PhotoAdvertisement$AdGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdGroup$TypeAdapter.class, "1")) {
          return;
       }
       String str = (p1 == null)? null: PhotoAdvertisement$AdGroup$TypeAdapter.c.get(p1);
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
