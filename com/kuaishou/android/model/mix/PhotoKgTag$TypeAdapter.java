package com.kuaishou.android.model.mix.PhotoKgTag$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoKgTag;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class PhotoKgTag$TypeAdapter extends TypeAdapter	// class@000d50
{
    public final Gson a;
    public static final a b;

    static {
       PhotoKgTag$TypeAdapter.b = a.get(PhotoKgTag.class);
    }
    public void PhotoKgTag$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoKgTag a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoKgTag$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoKgTag photoKgTag = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoKgTag;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoKgTag;
       }else {
          p0.c();
          PhotoKgTag photoKgTag1 = new PhotoKgTag();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd1d01e37:
                   if (str.equals("tagStyle")) {
                      i = 0;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 1;
                   }
                   break;
                 case 0x322f97:
                   if (str.equals("kgId")) {
                      i = 2;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 3;
                   }
                   break;
                 case 0x67eb7855:
                   if (str.equals("tagSource")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoKgTag1.mTagSource = KnownTypeAdapters$k.a(p0, photoKgTag1.mTagSource);
                   break;
                 case 1:
                   photoKgTag1.mId = KnownTypeAdapters$n.a(p0, photoKgTag1.mId);
                   break;
                 case 2:
                   photoKgTag1.mKgId = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   photoKgTag1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   photoKgTag1.mRealTagSource = KnownTypeAdapters$k.a(p0, photoKgTag1.mRealTagSource);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoKgTag1;
       }
    }
    public void b(b p0,PhotoKgTag p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoKgTag$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("id");
          p0.K(p1.mId);
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mKgId != null) {
             p0.r("kgId");
             TypeAdapters.A.write(p0, p1.mKgId);
          }
          p0.r("tagSource");
          p0.K((long)p1.mRealTagSource);
          p0.r("tagStyle");
          p0.K((long)p1.mTagSource);
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
