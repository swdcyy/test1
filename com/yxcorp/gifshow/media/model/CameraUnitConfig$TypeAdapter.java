package com.yxcorp.gifshow.media.model.CameraUnitConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class CameraUnitConfig$TypeAdapter extends TypeAdapter	// class@001d05
{
    public final Gson a;
    public static final a b;

    static {
       CameraUnitConfig$TypeAdapter.b = a.get(CameraUnitConfig.class);
    }
    public void CameraUnitConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CameraUnitConfig$TypeAdapter.class, "2");
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
             obj = new CameraUnitConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9cbcafea:
                      if (str.equals("supportSuperEisPro")) {
                         i = 0;
                      }
                      break;
                    case 0xb2952583:
                      if (str.equals("enable")) {
                         i = 1;
                      }
                      break;
                    case 0xe2ace468:
                      if (str.equals("enableSatCamera")) {
                         i = 2;
                      }
                      break;
                    case 0x430db010:
                      if (str.equals("allowEisWhenEffectOn")) {
                         i = 3;
                      }
                      break;
                    case 0x4e3179de:
                      if (str.equals("enableLowLightBoost")) {
                         i = 4;
                      }
                      break;
                    case 0x6a0f9999:
                      if (str.equals("enableBacklightDetection")) {
                         i = 5;
                      }
                      break;
                    case 0x75f6cfc3:
                      if (str.equals("supportSuperEis")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSupportSuperEisPro = KnownTypeAdapters$g.a(p0, obj.mSupportSuperEisPro);
                      break;
                    case 1:
                      obj.mEnable = KnownTypeAdapters$g.a(p0, obj.mEnable);
                      break;
                    case 2:
                      obj.mEnableSATCamera = KnownTypeAdapters$g.a(p0, obj.mEnableSATCamera);
                      break;
                    case 3:
                      obj.mAllowEisWhenEffectOn = KnownTypeAdapters$g.a(p0, obj.mAllowEisWhenEffectOn);
                      break;
                    case 4:
                      obj.mEnableLowLightBoost = KnownTypeAdapters$g.a(p0, obj.mEnableLowLightBoost);
                      break;
                    case 5:
                      obj.mEnableBacklightDetection = KnownTypeAdapters$g.a(p0, obj.mEnableBacklightDetection);
                      break;
                    case 6:
                      obj.mSupportSuperEis = KnownTypeAdapters$g.a(p0, obj.mSupportSuperEis);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraUnitConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enable");
          p0.P(p1.mEnable);
          p0.r("supportSuperEis");
          p0.P(p1.mSupportSuperEis);
          p0.r("supportSuperEisPro");
          p0.P(p1.mSupportSuperEisPro);
          p0.r("allowEisWhenEffectOn");
          p0.P(p1.mAllowEisWhenEffectOn);
          p0.r("enableLowLightBoost");
          p0.P(p1.mEnableLowLightBoost);
          p0.r("enableSatCamera");
          p0.P(p1.mEnableSATCamera);
          p0.r("enableBacklightDetection");
          p0.P(p1.mEnableBacklightDetection);
          p0.j();
       }
       return;
    }
}
