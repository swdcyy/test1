package com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
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

public final class CoverPicRecommendedCropWindow$TypeAdapter extends TypeAdapter	// class@000c52
{
    public final Gson a;
    public static final a b;

    static {
       CoverPicRecommendedCropWindow$TypeAdapter.b = a.get(CoverPicRecommendedCropWindow.class);
    }
    public void CoverPicRecommendedCropWindow$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public CoverPicRecommendedCropWindow a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverPicRecommendedCropWindow$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverPicRecommendedCropWindow uCoverPicRec = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverPicRec;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverPicRec;
       }else {
          p0.c();
          CoverPicRecommendedCropWindow uCoverPicRec1 = new CoverPicRecommendedCropWindow();
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
                 case 0xc50c8876:
                   if (str.equals("photoh")) {
                      i = 1;
                   }
                   break;
                 case 0xc50c8885:
                   if (str.equals("photow")) {
                      i = 2;
                   }
                   break;
                 case 'h':
                   if (str.equals("h")) {
                      i = 3;
                   }
                   break;
                 case 'w':
                   if (str.equals("w")) {
                      i = 4;
                   }
                   break;
                 case 'x':
                   if (str.equals("x")) {
                      i = 5;
                   }
                   break;
                 case 'y':
                   if (str.equals("y")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverPicRec1.mIsCropValid = KnownTypeAdapters$g.a(p0, uCoverPicRec1.mIsCropValid);
                   break;
                 case 1:
                   uCoverPicRec1.mPhotoHeight = KnownTypeAdapters$k.a(p0, uCoverPicRec1.mPhotoHeight);
                   break;
                 case 2:
                   uCoverPicRec1.mPhotoWidth = KnownTypeAdapters$k.a(p0, uCoverPicRec1.mPhotoWidth);
                   break;
                 case 3:
                   uCoverPicRec1.mCropHeight = KnownTypeAdapters$k.a(p0, uCoverPicRec1.mCropHeight);
                   break;
                 case 4:
                   uCoverPicRec1.mCropWidth = KnownTypeAdapters$k.a(p0, uCoverPicRec1.mCropWidth);
                   break;
                 case 5:
                   uCoverPicRec1.mBeginX = KnownTypeAdapters$k.a(p0, uCoverPicRec1.mBeginX);
                   break;
                 case 6:
                   uCoverPicRec1.mBeginY = KnownTypeAdapters$k.a(p0, uCoverPicRec1.mBeginY);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverPicRec1;
       }
    }
    public void b(b p0,CoverPicRecommendedCropWindow p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverPicRecommendedCropWindow$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("w");
          p0.K((long)p1.mCropWidth);
          p0.r("h");
          p0.K((long)p1.mCropHeight);
          p0.r("x");
          p0.K((long)p1.mBeginX);
          p0.r("y");
          p0.K((long)p1.mBeginY);
          p0.r("photow");
          p0.K((long)p1.mPhotoWidth);
          p0.r("photoh");
          p0.K((long)p1.mPhotoHeight);
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
