package com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter$a;

public final class LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter extends TypeAdapter	// class@00081f
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter.c = a.get(LiveStreamModel$WinterOlympicSimpleLive.class);
    }
    public void LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CDNUrl.class));
    }
    public LiveStreamModel$WinterOlympicSimpleLive a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamModel$WinterOlympicSimpleLive winterOlympi = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return winterOlympi;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return winterOlympi;
       }else {
          p0.c();
          LiveStreamModel$WinterOlympicSimpleLive winterOlympi1 = new LiveStreamModel$WinterOlympicSimpleLive();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x96020932:
                   if (str.equals("previewBgImageUrls")) {
                      i = 0;
                   }
                   break;
                 case 0xd0cdd17b:
                   if (str.equals("webUrl")) {
                      i = 1;
                   }
                   break;
                 case 0x54805e46:
                   if (str.equals("liveType")) {
                      i = 2;
                   }
                   break;
                 case 0x6c808337:
                   if (str.equals("imageLiveBgColor")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   winterOlympi1.mPreviewBgUrls = new KnownTypeAdapters$ArrayTypeAdapter(this.b, new LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter$b(this)).a(p0);
                   break;
                 case 1:
                   winterOlympi1.mWebUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   winterOlympi1.mLiveType = KnownTypeAdapters$k.a(p0, winterOlympi1.mLiveType);
                   break;
                 case 3:
                   winterOlympi1.mImageLiveBgColor = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return winterOlympi1;
       }
    }
    public void b(b p0,LiveStreamModel$WinterOlympicSimpleLive p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mWebUrl != null) {
             p0.r("webUrl");
             TypeAdapters.A.write(p0, p1.mWebUrl);
          }
          if (p1.mPreviewBgUrls != null) {
             p0.r("previewBgImageUrls");
             new KnownTypeAdapters$ArrayTypeAdapter(this.b, new LiveStreamModel$WinterOlympicSimpleLive$TypeAdapter$a(this)).b(p0, p1.mPreviewBgUrls);
          }
          p0.r("liveType");
          p0.K((long)p1.mLiveType);
          if (p1.mImageLiveBgColor != null) {
             p0.r("imageLiveBgColor");
             TypeAdapters.A.write(p0, p1.mImageLiveBgColor);
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
