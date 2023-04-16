package com.kuaishou.android.model.mix.CoverImageType$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverImageType;
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
import com.google.gson.stream.b;

public final class CoverImageType$TypeAdapter extends TypeAdapter	// class@000c39
{
    public final Gson a;
    public static final a b;

    static {
       CoverImageType$TypeAdapter.b = a.get(CoverImageType.class);
    }
    public void CoverImageType$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverImageType a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverImageType$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverImageType uCoverImageT = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverImageT;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverImageT;
       }else {
          p0.c();
          CoverImageType uCoverImageT1 = new CoverImageType();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xfd358654:
                   if (str.equals("ff_cover_thumbnail_type")) {
                      i = 0;
                   }
                   break;
                 case 0x27670035:
                   if (str.equals("cover_thumbnail_type")) {
                      i = 1;
                   }
                   break;
                 case 0x4aacaec2:
                   if (str.equals("cover_type")) {
                      i = 2;
                   }
                   break;
                 case 0x5d3a9bd0:
                   if (str.equals("corona_info_cover_type")) {
                      i = 3;
                   }
                   break;
                 case 0x763296c8:
                   if (str.equals("override_cover_thumbnail_type")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverImageT1.mFFCoverThumbnailType = KnownTypeAdapters$k.a(p0, uCoverImageT1.mFFCoverThumbnailType);
                   break;
                 case 1:
                   uCoverImageT1.mCoverThumbnailType = KnownTypeAdapters$k.a(p0, uCoverImageT1.mCoverThumbnailType);
                   break;
                 case 2:
                   uCoverImageT1.mCoverType = KnownTypeAdapters$k.a(p0, uCoverImageT1.mCoverType);
                   break;
                 case 3:
                   uCoverImageT1.mCoronaInfoCoverType = KnownTypeAdapters$k.a(p0, uCoverImageT1.mCoronaInfoCoverType);
                   break;
                 case 4:
                   uCoverImageT1.mOverrideCoverThumbnailType = KnownTypeAdapters$k.a(p0, uCoverImageT1.mOverrideCoverThumbnailType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverImageT1;
       }
    }
    public void b(b p0,CoverImageType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverImageType$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("cover_type");
          p0.K((long)p1.mCoverType);
          p0.r("cover_thumbnail_type");
          p0.K((long)p1.mCoverThumbnailType);
          p0.r("ff_cover_thumbnail_type");
          p0.K((long)p1.mFFCoverThumbnailType);
          p0.r("override_cover_thumbnail_type");
          p0.K((long)p1.mOverrideCoverThumbnailType);
          p0.r("corona_info_cover_type");
          p0.K((long)p1.mCoronaInfoCoverType);
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
