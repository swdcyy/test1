package com.kuaishou.android.model.mix.CoverSize$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverSize;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class CoverSize$TypeAdapter extends TypeAdapter	// class@000c56
{
    public final Gson a;
    public static final a b;

    static {
       CoverSize$TypeAdapter.b = a.get(CoverSize.class);
    }
    public void CoverSize$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverSize a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverSize$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverSize uCoverSize = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverSize;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverSize;
       }else {
          p0.c();
          CoverSize uCoverSize1 = new CoverSize();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x92d64142:
                   if (str.equals("isCropValid")) {
                      i = 0;
                   }
                   break;
                 case 0x9f5ca2e7:
                   if (str.equals("coverTitlePosToTop")) {
                      i = 1;
                   }
                   break;
                 case 0xb7389127:
                   if (str.equals("height")) {
                      i = 2;
                   }
                   break;
                 case 0xc631ad1d:
                   if (str.equals("shiftDirection")) {
                      i = 3;
                   }
                   break;
                 case 0xef034f8a:
                   if (str.equals("cuttingType")) {
                      i = 4;
                   }
                   break;
                 case 0xf150b632:
                   if (str.equals("cuttingShift")) {
                      i = 5;
                   }
                   break;
                 case 0x6be2dc6:
                   if (str.equals("width")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverSize1.mIsCropValid = KnownTypeAdapters$g.a(p0, uCoverSize1.mIsCropValid);
                   break;
                 case 1:
                   uCoverSize1.mCoverTitlePosToTop = KnownTypeAdapters$k.a(p0, uCoverSize1.mCoverTitlePosToTop);
                   break;
                 case 2:
                   uCoverSize1.mHeight = KnownTypeAdapters$k.a(p0, uCoverSize1.mHeight);
                   break;
                 case 3:
                   uCoverSize1.mShiftDirection = KnownTypeAdapters$k.a(p0, uCoverSize1.mShiftDirection);
                   break;
                 case 4:
                   uCoverSize1.mCuttingType = KnownTypeAdapters$k.a(p0, uCoverSize1.mCuttingType);
                   break;
                 case 5:
                   uCoverSize1.mCuttingShift = KnownTypeAdapters$k.a(p0, uCoverSize1.mCuttingShift);
                   break;
                 case 6:
                   uCoverSize1.mWidth = KnownTypeAdapters$k.a(p0, uCoverSize1.mWidth);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverSize1;
       }
    }
    public void b(b p0,CoverSize p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverSize$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("width");
          p0.K((long)p1.mWidth);
          p0.r("height");
          p0.K((long)p1.mHeight);
          p0.r("cuttingShift");
          p0.K((long)p1.mCuttingShift);
          p0.r("shiftDirection");
          p0.K((long)p1.mShiftDirection);
          p0.r("cuttingType");
          p0.K((long)p1.mCuttingType);
          p0.r("coverTitlePosToTop");
          p0.K((long)p1.mCoverTitlePosToTop);
          p0.r("isCropValid");
          p0.P(p1.mIsCropValid);
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
