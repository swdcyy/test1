package com.kuaishou.android.model.mix.PhotoTextLocationInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import com.google.gson.stream.b;

public final class PhotoTextLocationInfo$TypeAdapter extends TypeAdapter	// class@000d6b
{
    public final Gson a;
    public static final a b;

    static {
       PhotoTextLocationInfo$TypeAdapter.b = a.get(PhotoTextLocationInfo.class);
    }
    public void PhotoTextLocationInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoTextLocationInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoTextLocationInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoTextLocationInfo photoTextLoc = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoTextLoc;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoTextLoc;
       }else {
          p0.c();
          PhotoTextLocationInfo photoTextLoc1 = new PhotoTextLocationInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa0a6dde5:
                   if (str.equals("widthRatio")) {
                      i = 0;
                   }
                   break;
                 case 0xc1b86f24:
                   if (str.equals("heightRatio")) {
                      i = 1;
                   }
                   break;
                 case 0xc5ac2bb6:
                   if (str.equals("topRatio")) {
                      i = 2;
                   }
                   break;
                 case 0x6714ac44:
                   if (str.equals("leftRatio")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoTextLoc1.mWidthRatio = KnownTypeAdapters$j.a(p0, photoTextLoc1.mWidthRatio);
                   break;
                 case 1:
                   photoTextLoc1.mHeightRatio = KnownTypeAdapters$j.a(p0, photoTextLoc1.mHeightRatio);
                   break;
                 case 2:
                   photoTextLoc1.mTopRatio = KnownTypeAdapters$j.a(p0, photoTextLoc1.mTopRatio);
                   break;
                 case 3:
                   photoTextLoc1.mLeftRatio = KnownTypeAdapters$j.a(p0, photoTextLoc1.mLeftRatio);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoTextLoc1;
       }
    }
    public void b(b p0,PhotoTextLocationInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoTextLocationInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("leftRatio");
          p0.J((double)p1.mLeftRatio);
          p0.r("topRatio");
          p0.J((double)p1.mTopRatio);
          p0.r("widthRatio");
          p0.J((double)p1.mWidthRatio);
          p0.r("heightRatio");
          p0.J((double)p1.mHeightRatio);
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
