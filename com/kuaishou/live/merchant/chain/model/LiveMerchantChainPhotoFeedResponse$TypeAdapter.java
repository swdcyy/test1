package com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.merchant.chain.model.LiveMerchantChainPhotoFeedResponse$ChainBottomConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveMerchantChainPhotoFeedResponse$TypeAdapter extends TypeAdapter	// class@000ca4
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       LiveMerchantChainPhotoFeedResponse$TypeAdapter.e = a.get(LiveMerchantChainPhotoFeedResponse.class);
    }
    public void LiveMerchantChainPhotoFeedResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LiveMerchantChainPhotoFeedResponse$ChainBottomConfig.class));
       TypeAdapter typeAdapter = p0.j(a.get(QPhoto.class));
       this.c = typeAdapter;
       this.d = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantChainPhotoFeedResponse$TypeAdapter.class, "2");
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
             obj = new LiveMerchantChainPhotoFeedResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xa12b42df:
                      if (str.equals("linkedLiveTopUrl")) {
                         i = 0;
                      }
                      break;
                    case 0xd44fffc6:
                      if (str.equals("pcursor")) {
                         i = 1;
                      }
                      break;
                    case 0xe59bea2c:
                      if (str.equals("moreZoneBottom")) {
                         i = 2;
                      }
                      break;
                    case 0x3492916:
                      if (str.equals("timestamp")) {
                         i = 3;
                      }
                      break;
                    case 0x473848de:
                      if (str.equals("livesEmptyTips")) {
                         i = 4;
                      }
                      break;
                    case 0x64927bde:
                      if (str.equals("livingLives")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mLinkedLiveTopUrl = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mCursor = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mChainBottomConfig = this.b.read(p0);
                      break;
                    case 3:
                      obj.mTimeStampMs = KnownTypeAdapters$n.a(p0, obj.mTimeStampMs);
                      break;
                    case 4:
                      obj.mLivesEmptyTips = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mQPhotos = this.d.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantChainPhotoFeedResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLinkedLiveTopUrl != null) {
             p0.r("linkedLiveTopUrl");
             TypeAdapters.A.write(p0, p1.mLinkedLiveTopUrl);
          }
          if (p1.mChainBottomConfig != null) {
             p0.r("moreZoneBottom");
             this.b.write(p0, p1.mChainBottomConfig);
          }
          if (p1.mCursor != null) {
             p0.r("pcursor");
             TypeAdapters.A.write(p0, p1.mCursor);
          }
          if (p1.mQPhotos != null) {
             p0.r("livingLives");
             this.d.write(p0, p1.mQPhotos);
          }
          if (p1.mLivesEmptyTips != null) {
             p0.r("livesEmptyTips");
             TypeAdapters.A.write(p0, p1.mLivesEmptyTips);
          }
          p0.r("timestamp");
          p0.K(p1.mTimeStampMs);
          p0.j();
       }
       return;
    }
}
