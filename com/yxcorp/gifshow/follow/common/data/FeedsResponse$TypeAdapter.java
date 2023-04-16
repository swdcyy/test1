package com.yxcorp.gifshow.follow.common.data.FeedsResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.google.gson.stream.b;

public final class FeedsResponse$TypeAdapter extends TypeAdapter	// class@001013
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       FeedsResponse$TypeAdapter.d = a.get(FeedsResponse.class);
    }
    public void FeedsResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(QPhoto.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FeedsResponse$TypeAdapter.class, "2");
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
             obj = new FeedsResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x82a2a910:
                      if (str.equals("pageTurningType")) {
                         i = 0;
                      }
                      break;
                    case 0xd44fffc6:
                      if (str.equals("pcursor")) {
                         i = 1;
                      }
                      break;
                    case 0x5ccce95:
                      if (str.equals("feeds")) {
                         i = 2;
                      }
                      break;
                    case 0x624bf4e:
                      if (str.equals("llsid")) {
                         i = 3;
                      }
                      break;
                    case 0x65fd78c:
                      if (str.equals("prsid")) {
                         i = 4;
                      }
                      break;
                    case 0x3a02a738:
                      if (str.equals("followPageTopFreshFeedCount")) {
                         i = 5;
                      }
                      break;
                    case 0x637688dd:
                      if (str.equals("needInvokePymkDialog")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mPageTuringType = KnownTypeAdapters$k.a(p0, obj.mPageTuringType);
                      break;
                    case 1:
                      obj.mCursor = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mPhotos = this.c.read(p0);
                      break;
                    case 3:
                      obj.mLlsid = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mPrSid = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mFollowPageTopFreshFeedCount = KnownTypeAdapters$k.a(p0, obj.mFollowPageTopFreshFeedCount);
                      break;
                    case 6:
                      obj.mNeedInvokePymkDialog = KnownTypeAdapters$g.a(p0, obj.mNeedInvokePymkDialog);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FeedsResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mCursor != null) {
             p0.r("pcursor");
             TypeAdapters.A.write(p0, p1.mCursor);
          }
          if (p1.mPhotos != null) {
             p0.r("feeds");
             this.c.write(p0, p1.mPhotos);
          }
          if (p1.mLlsid != null) {
             p0.r("llsid");
             TypeAdapters.A.write(p0, p1.mLlsid);
          }
          p0.r("pageTurningType");
          p0.K((long)p1.mPageTuringType);
          if (p1.mPrSid != null) {
             p0.r("prsid");
             TypeAdapters.A.write(p0, p1.mPrSid);
          }
          p0.r("followPageTopFreshFeedCount");
          p0.K((long)p1.mFollowPageTopFreshFeedCount);
          p0.r("needInvokePymkDialog");
          p0.P(p1.mNeedInvokePymkDialog);
          p0.j();
       }
       return;
    }
}
