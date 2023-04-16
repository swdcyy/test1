package com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$PopupUiConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$PopupUiConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$ImageData$TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$VideoData$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$ImageData;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$VideoData;
import com.google.gson.stream.b;

public final class ActivityPopupConfig$PopupUiConfig$TypeAdapter extends TypeAdapter	// class@000851
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ActivityPopupConfig$PopupUiConfig$TypeAdapter.d = a.get(ActivityPopupConfig$PopupUiConfig.class);
    }
    public void ActivityPopupConfig$PopupUiConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(ActivityPopupConfig$ImageData$TypeAdapter.d);
       this.c = p0.j(ActivityPopupConfig$VideoData$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityPopupConfig$PopupUiConfig$TypeAdapter.class, "2");
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
             obj = new ActivityPopupConfig$PopupUiConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9681ba46:
                      if (str.equals("buttonTitle")) {
                         i = 0;
                      }
                      break;
                    case 0xb06a1851:
                      if (str.equals("detail")) {
                         i = 1;
                      }
                      break;
                    case 0xeac6773b:
                      if (str.equals("buttonBackgroundImage")) {
                         i = 2;
                      }
                      break;
                    case 0x5faa95b:
                      if (str.equals("image")) {
                         i = 3;
                      }
                      break;
                    case 0x6942258:
                      if (str.equals("title")) {
                         i = 4;
                      }
                      break;
                    case 0x6b0147b:
                      if (str.equals("video")) {
                         i = 5;
                      }
                      break;
                    case 0xbd19b59:
                      if (str.equals("actionUrl")) {
                         i = 6;
                      }
                      break;
                    case 0x78d4a8c4:
                      if (str.equals("logoIcon")) {
                         i = 7;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mButtonTitle = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mDetail = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mButtonBackgroundData = this.b.read(p0);
                      break;
                    case 3:
                      obj.mImageData = this.b.read(p0);
                      break;
                    case 4:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mVideoData = this.c.read(p0);
                      break;
                    case 6:
                      obj.mActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mLogoData = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityPopupConfig$PopupUiConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mDetail != null) {
             p0.r("detail");
             TypeAdapters.A.write(p0, p1.mDetail);
          }
          if (p1.mButtonTitle != null) {
             p0.r("buttonTitle");
             TypeAdapters.A.write(p0, p1.mButtonTitle);
          }
          if (p1.mActionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mLogoData != null) {
             p0.r("logoIcon");
             this.b.write(p0, p1.mLogoData);
          }
          if (p1.mButtonBackgroundData != null) {
             p0.r("buttonBackgroundImage");
             this.b.write(p0, p1.mButtonBackgroundData);
          }
          if (p1.mImageData != null) {
             p0.r("image");
             this.b.write(p0, p1.mImageData);
          }
          if (p1.mVideoData != null) {
             p0.r("video");
             this.c.write(p0, p1.mVideoData);
          }
          p0.j();
       }
       return;
    }
}
