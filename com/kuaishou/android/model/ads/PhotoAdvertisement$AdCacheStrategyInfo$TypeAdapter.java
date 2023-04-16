package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter extends TypeAdapter	// class@000895
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter.b = a.get(PhotoAdvertisement$AdCacheStrategyInfo.class);
    }
    public void PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$AdCacheStrategyInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$AdCacheStrategyInfo uAdCacheStra = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAdCacheStra;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAdCacheStra;
       }else {
          p0.c();
          PhotoAdvertisement$AdCacheStrategyInfo uAdCacheStra1 = new PhotoAdvertisement$AdCacheStrategyInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa79ba259:
                   if (str.equals("groupType")) {
                      i = 0;
                   }
                   break;
                 case 0xdf00e56f:
                   if (str.equals("cacheTime")) {
                      i = 1;
                   }
                   break;
                 case 0x6833e92:
                   if (str.equals("score")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAdCacheStra1.mGroupType = KnownTypeAdapters$k.a(p0, uAdCacheStra1.mGroupType);
                   break;
                 case 1:
                   uAdCacheStra1.mCacheTime = KnownTypeAdapters$k.a(p0, uAdCacheStra1.mCacheTime);
                   break;
                 case 2:
                   uAdCacheStra1.mScore = KnownTypeAdapters$n.a(p0, uAdCacheStra1.mScore);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAdCacheStra1;
       }
    }
    public void b(b p0,PhotoAdvertisement$AdCacheStrategyInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$AdCacheStrategyInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("groupType");
          p0.K((long)p1.mGroupType);
          p0.r("score");
          p0.K(p1.mScore);
          p0.r("cacheTime");
          p0.K((long)p1.mCacheTime);
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
