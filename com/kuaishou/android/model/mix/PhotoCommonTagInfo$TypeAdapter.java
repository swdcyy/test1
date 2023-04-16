package com.kuaishou.android.model.mix.PhotoCommonTagInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PhotoCommonTagInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PhotoCommonTagIconInfo;
import com.google.gson.stream.b;

public final class PhotoCommonTagInfo$TypeAdapter extends TypeAdapter	// class@000d3d
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoCommonTagInfo$TypeAdapter.c = a.get(PhotoCommonTagInfo.class);
    }
    public void PhotoCommonTagInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PhotoCommonTagIconInfo$TypeAdapter.b);
    }
    public PhotoCommonTagInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoCommonTagInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoCommonTagInfo photoCommonT = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return photoCommonT;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return photoCommonT;
       }else {
          p0.c();
          PhotoCommonTagInfo photoCommonT1 = new PhotoCommonTagInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xcf669209:
                   if (str.equals("keyWord")) {
                      i = 0;
                   }
                   break;
                 case 0xd3ff30c7:
                   if (str.equals("iconInfo")) {
                      i = 1;
                   }
                   break;
                 case 0xfa2ebeed:
                   if (str.equals("bizType")) {
                      i = 2;
                   }
                   break;
                 case 0xbd19b59:
                   if (str.equals("actionUrl")) {
                      i = 3;
                   }
                   break;
                 case 0x2499729f:
                   if (str.equals("matchType")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   photoCommonT1.mKeyWord = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   photoCommonT1.mIconInfo = this.b.read(p0);
                   break;
                 case 2:
                   photoCommonT1.mBizType = KnownTypeAdapters$k.a(p0, photoCommonT1.mBizType);
                   break;
                 case 3:
                   photoCommonT1.mActionUrl = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   photoCommonT1.mMatchType = KnownTypeAdapters$k.a(p0, photoCommonT1.mMatchType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return photoCommonT1;
       }
    }
    public void b(b p0,PhotoCommonTagInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoCommonTagInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("bizType");
          p0.K((long)p1.mBizType);
          p0.r("matchType");
          p0.K((long)p1.mMatchType);
          if (p1.mKeyWord != null) {
             p0.r("keyWord");
             TypeAdapters.A.write(p0, p1.mKeyWord);
          }
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mIconInfo != null) {
             p0.r("iconInfo");
             this.b.write(p0, p1.mIconInfo);
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
