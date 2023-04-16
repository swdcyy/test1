package com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo;
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
import com.google.gson.stream.b;

public final class ProfileTemplateCard$ButtonStatusInfo$TypeAdapter extends TypeAdapter	// class@001e7c
{
    public final Gson a;
    public static final a b;

    static {
       ProfileTemplateCard$ButtonStatusInfo$TypeAdapter.b = a.get(ProfileTemplateCard$ButtonStatusInfo.class);
    }
    public void ProfileTemplateCard$ButtonStatusInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCard$ButtonStatusInfo$TypeAdapter.class, "2");
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
             obj = new ProfileTemplateCard$ButtonStatusInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81c38dc8:
                      if (str.equals("darkBgColor")) {
                         i = 0;
                      }
                      break;
                    case 0x9824c17e:
                      if (str.equals("darkFontColor")) {
                         i = 1;
                      }
                      break;
                    case 0xa2aa8c54:
                      if (str.equals("fontColor")) {
                         i = 2;
                      }
                      break;
                    case 0xcacdcff2:
                      if (str.equals("status")) {
                         i = 3;
                      }
                      break;
                    case 0xf3ca161e:
                      if (str.equals("bgColor")) {
                         i = 4;
                      }
                      break;
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 5;
                      }
                      break;
                    case 0xbd19b59:
                      if (str.equals("actionUrl")) {
                         i = 6;
                      }
                      break;
                    case 0x6e617690:
                      if (str.equals("actionType")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mDarkBgColor = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDarkFontColor = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mFontColor = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mStatus = KnownTypeAdapters$k.a(p0, obj.mStatus);
                      break;
                    case 4:
                      obj.mBgColor = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mText = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mActionType = KnownTypeAdapters$k.a(p0, obj.mActionType);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileTemplateCard$ButtonStatusInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("status");
          p0.K((long)p1.mStatus);
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mFontColor != null) {
             p0.r("fontColor");
             TypeAdapters.A.write(p0, p1.mFontColor);
          }
          if (p1.mDarkFontColor != null) {
             p0.r("darkFontColor");
             TypeAdapters.A.write(p0, p1.mDarkFontColor);
          }
          if (p1.mBgColor != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBgColor);
          }
          if (p1.mDarkBgColor != null) {
             p0.r("darkBgColor");
             TypeAdapters.A.write(p0, p1.mDarkBgColor);
          }
          p0.r("actionType");
          p0.K((long)p1.mActionType);
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          p0.j();
       }
       return;
    }
}
