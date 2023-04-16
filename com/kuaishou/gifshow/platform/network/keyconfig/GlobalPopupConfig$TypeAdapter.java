package com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$ExtParams$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$ExtParams;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class GlobalPopupConfig$TypeAdapter extends TypeAdapter	// class@000869
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       GlobalPopupConfig$TypeAdapter.c = a.get(GlobalPopupConfig.class);
    }
    public void GlobalPopupConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(GlobalPopupConfig$ExtParams$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, GlobalPopupConfig$TypeAdapter.class, "2");
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
             obj = new GlobalPopupConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x960ee945:
                      if (str.equals("globalPopupEndTimeMs")) {
                         i = 0;
                      }
                      break;
                    case 0xb74c31cc:
                      if (str.equals("globalPopupStartTimeMs")) {
                         i = 1;
                      }
                      break;
                    case 0xc84278e1:
                      if (str.equals("autoDismissMs")) {
                         i = 2;
                      }
                      break;
                    case 0xe884fee7:
                      if (str.equals("popupId")) {
                         i = 3;
                      }
                      break;
                    case 0x15d861ad:
                      if (str.equals("allowDelayTimeMs")) {
                         i = 4;
                      }
                      break;
                    case 0x2dbd3592:
                      if (str.equals("liveParams")) {
                         i = 5;
                      }
                      break;
                    case 0x3b7c3658:
                      if (str.equals("photoParams")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEndTimeMs = KnownTypeAdapters$n.a(p0, obj.mEndTimeMs);
                      break;
                    case 1:
                      obj.mStartTimeMs = KnownTypeAdapters$n.a(p0, obj.mStartTimeMs);
                      break;
                    case 2:
                      obj.mAutoDismissMs = KnownTypeAdapters$n.a(p0, obj.mAutoDismissMs);
                      break;
                    case 3:
                      obj.mPopupId = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mDelayTimeMs = KnownTypeAdapters$n.a(p0, obj.mDelayTimeMs);
                      break;
                    case 5:
                      obj.mLiveParams = this.b.read(p0);
                      break;
                    case 6:
                      obj.mPhotoParams = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GlobalPopupConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mPopupId != null) {
             p0.r("popupId");
             TypeAdapters.A.write(p0, p1.mPopupId);
          }
          p0.r("globalPopupStartTimeMs");
          p0.K(p1.mStartTimeMs);
          p0.r("globalPopupEndTimeMs");
          p0.K(p1.mEndTimeMs);
          p0.r("allowDelayTimeMs");
          p0.K(p1.mDelayTimeMs);
          p0.r("autoDismissMs");
          p0.K(p1.mAutoDismissMs);
          if (p1.mLiveParams != null) {
             p0.r("liveParams");
             this.b.write(p0, p1.mLiveParams);
          }
          if (p1.mPhotoParams != null) {
             p0.r("photoParams");
             this.b.write(p0, p1.mPhotoParams);
          }
          p0.j();
       }
       return;
    }
}
