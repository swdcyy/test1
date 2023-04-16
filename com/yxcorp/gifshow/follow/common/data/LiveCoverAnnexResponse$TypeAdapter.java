package com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.follow.common.data.LiveCoverAnnexResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.feed.LiveCoverAnnex;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveCoverAnnexResponse$TypeAdapter extends TypeAdapter	// class@00101e
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LiveCoverAnnexResponse$TypeAdapter.d = a.get(LiveCoverAnnexResponse.class);
    }
    public void LiveCoverAnnexResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(LiveCoverAnnex.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveCoverAnnexResponse$TypeAdapter.class, "2");
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
             obj = new LiveCoverAnnexResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xd44fffc6:
                      if (str.equals("pcursor")) {
                         i = 0;
                      }
                      break;
                    case 0xe87fcca8:
                      if (str.equals("minRequestIntervalMillis")) {
                         i = 1;
                      }
                      break;
                    case 0xfd2bdd2a:
                      if (str.equals("maxContinuousRequestTimes")) {
                         i = 2;
                      }
                      break;
                    case 0x58a45557:
                      if (str.equals("liveCoverAnnexes")) {
                         i = 3;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mCursor = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mMinRequestIntervalMillis = KnownTypeAdapters$n.a(p0, obj.mMinRequestIntervalMillis);
                      break;
                    case 2:
                      obj.mMaxContinuousRequestTimes = KnownTypeAdapters$k.a(p0, obj.mMaxContinuousRequestTimes);
                      break;
                    case 3:
                      obj.mLiveCoverAnnex = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCoverAnnexResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLiveCoverAnnex != null) {
             p0.r("liveCoverAnnexes");
             this.c.write(p0, p1.mLiveCoverAnnex);
          }
          p0.r("minRequestIntervalMillis");
          p0.K(p1.mMinRequestIntervalMillis);
          p0.r("maxContinuousRequestTimes");
          p0.K((long)p1.mMaxContinuousRequestTimes);
          if (p1.mCursor != null) {
             p0.r("pcursor");
             TypeAdapters.A.write(p0, p1.mCursor);
          }
          p0.j();
       }
       return;
    }
}
