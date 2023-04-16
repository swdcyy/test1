package com.kuaishou.android.model.mix.PhotoDisplayLocationInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
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

public final class PhotoDisplayLocationInfo$TypeAdapter extends TypeAdapter	// class@000d4d
{
    public final Gson a;
    public static final a b;

    static {
       PhotoDisplayLocationInfo$TypeAdapter.b = a.get(PhotoDisplayLocationInfo.class);
    }
    public void PhotoDisplayLocationInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoDisplayLocationInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoDisplayLocationInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoDisplayLocationInfo photoDisplay = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoDisplay;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoDisplay;
       }else {
          p0.c();
          PhotoDisplayLocationInfo photoDisplay1 = new PhotoDisplayLocationInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x80897c89:
                   if (str.equals("displayHeight")) {
                      i = 0;
                   }
                   break;
                 case 0xa0a6dde5:
                   if (str.equals("widthRatio")) {
                      i = 1;
                   }
                   break;
                 case 0xc1b86f24:
                   if (str.equals("heightRatio")) {
                      i = 2;
                   }
                   break;
                 case 0xc5ac2bb6:
                   if (str.equals("topRatio")) {
                      i = 3;
                   }
                   break;
                 case 0xe1490eb4:
                   if (str.equals("photoWidth")) {
                      i = 4;
                   }
                   break;
                 case 0x2e09cdf9:
                   if (str.equals("photoHeight")) {
                      i = 5;
                   }
                   break;
                 case 0x5fd14e24:
                   if (str.equals("displayWidth")) {
                      i = 6;
                   }
                   break;
                 case 0x6714ac44:
                   if (str.equals("leftRatio")) {
                      i = 7;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoDisplay1.mDisplayHeight = KnownTypeAdapters$j.a(p0, photoDisplay1.mDisplayHeight);
                   break;
                 case 1:
                   photoDisplay1.mWidthRatio = KnownTypeAdapters$j.a(p0, photoDisplay1.mWidthRatio);
                   break;
                 case 2:
                   photoDisplay1.mHeightRatio = KnownTypeAdapters$j.a(p0, photoDisplay1.mHeightRatio);
                   break;
                 case 3:
                   photoDisplay1.mTopRatio = KnownTypeAdapters$j.a(p0, photoDisplay1.mTopRatio);
                   break;
                 case 4:
                   photoDisplay1.mPhotoWidth = KnownTypeAdapters$j.a(p0, photoDisplay1.mPhotoWidth);
                   break;
                 case 5:
                   photoDisplay1.mPhotoHeight = KnownTypeAdapters$j.a(p0, photoDisplay1.mPhotoHeight);
                   break;
                 case 6:
                   photoDisplay1.mDisplayWidth = KnownTypeAdapters$j.a(p0, photoDisplay1.mDisplayWidth);
                   break;
                 case 7:
                   photoDisplay1.mLeftRatio = KnownTypeAdapters$j.a(p0, photoDisplay1.mLeftRatio);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoDisplay1;
       }
    }
    public void b(b p0,PhotoDisplayLocationInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoDisplayLocationInfo$TypeAdapter.class, "1")) {
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
          p0.r("displayWidth");
          p0.J((double)p1.mDisplayWidth);
          p0.r("displayHeight");
          p0.J((double)p1.mDisplayHeight);
          p0.r("photoWidth");
          p0.J((double)p1.mPhotoWidth);
          p0.r("photoHeight");
          p0.J((double)p1.mPhotoHeight);
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
