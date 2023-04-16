package com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveCommonConfigResponse$WishListConfig$TypeAdapter extends TypeAdapter	// class@000e91
{
    public final Gson a;
    public static final a b;

    static {
       LiveCommonConfigResponse$WishListConfig$TypeAdapter.b = a.get(LiveCommonConfigResponse$WishListConfig.class);
    }
    public void LiveCommonConfigResponse$WishListConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCommonConfigResponse$WishListConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveCommonConfigResponse$WishListConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa1243f02:
                      if (str.equals("wishDetailPollIntervalMillis")) {
                         i = 0;
                      }
                      break;
                    case 0xa6cf935b:
                      if (str.equals("topSponsorsText")) {
                         i = 1;
                      }
                      break;
                    case 0xe4a159a2:
                      if (str.equals("wishGiftMaxCount")) {
                         i = 2;
                      }
                      break;
                    case 0xf6817905:
                      if (str.equals("wishListMaxLength")) {
                         i = 3;
                      }
                      break;
                    case 0x248c8f73:
                      if (str.equals("wishListMinLength")) {
                         i = 4;
                      }
                      break;
                    case 0x2ac22c72:
                      if (str.equals("wishDescMaxLength")) {
                         i = 5;
                      }
                      break;
                    case 0x4358912b:
                      if (str.equals("wishListLength")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mWishDetailPollIntervalTimeMs = KnownTypeAdapters$k.a(p0, obj.mWishDetailPollIntervalTimeMs);
                      break;
                    case 1:
                      obj.mWishTopSponsorsText = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mWishGiftMaxCount = KnownTypeAdapters$k.a(p0, obj.mWishGiftMaxCount);
                      break;
                    case 3:
                      obj.mWishListMaxLength = KnownTypeAdapters$k.a(p0, obj.mWishListMaxLength);
                      break;
                    case 4:
                      obj.mWishListMinLength = KnownTypeAdapters$k.a(p0, obj.mWishListMinLength);
                      break;
                    case 5:
                      obj.mWishDescriptionMaxLength = KnownTypeAdapters$k.a(p0, obj.mWishDescriptionMaxLength);
                      break;
                    case 6:
                      obj.mWishListLength = KnownTypeAdapters$k.a(p0, obj.mWishListLength);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonConfigResponse$WishListConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("wishListLength");
          p0.K((long)p1.mWishListLength);
          p0.r("wishListMinLength");
          p0.K((long)p1.mWishListMinLength);
          p0.r("wishListMaxLength");
          p0.K((long)p1.mWishListMaxLength);
          p0.r("wishGiftMaxCount");
          p0.K((long)p1.mWishGiftMaxCount);
          p0.r("wishDetailPollIntervalMillis");
          p0.K((long)p1.mWishDetailPollIntervalTimeMs);
          if (p1.mWishTopSponsorsText != null) {
             p0.r("topSponsorsText");
             TypeAdapters.A.write(p0, p1.mWishTopSponsorsText);
          }
          p0.r("wishDescMaxLength");
          p0.K((long)p1.mWishDescriptionMaxLength);
          p0.j();
       }
       return;
    }
}
