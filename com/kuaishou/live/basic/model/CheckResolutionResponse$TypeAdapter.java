package com.kuaishou.live.basic.model.CheckResolutionResponse$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.live.basic.model.CheckResolutionResponse$VideoConfig;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class CheckResolutionResponse$TypeAdapter extends TypeAdapter	// class@000cd8
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CheckResolutionResponse$TypeAdapter.c = a.get(CheckResolutionResponse.class);
    }
    public void CheckResolutionResponse$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(CheckResolutionResponse$VideoConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CheckResolutionResponse$TypeAdapter.class, "2");
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
             obj = new CheckResolutionResponse();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x893b2844:
                      if (str.equals("videoMaxBitrate")) {
                         i = 0;
                      }
                      break;
                    case 0x9b599ab7:
                      if (str.equals("audioBitrate")) {
                         i = 1;
                      }
                      break;
                    case 0xa0a178ac:
                      if (str.equals("resolution")) {
                         i = 2;
                      }
                      break;
                    case 0xdc136b66:
                      if (str.equals("pushResolution")) {
                         i = 3;
                      }
                      break;
                    case 0xf7666504:
                      if (str.equals("encoderComplexityOptions")) {
                         i = 4;
                      }
                      break;
                    case 0x18ce9:
                      if (str.equals("fps")) {
                         i = 5;
                      }
                      break;
                    case 0x1c92df96:
                      if (str.equals("videoMinBitrate")) {
                         i = 6;
                      }
                      break;
                    case 0x2293fb9d:
                      if (str.equals("videoConfig")) {
                         i = 7;
                      }
                      break;
                    case 0x2a9564c2:
                      if (str.equals("videoInitBitrate")) {
                         i = 8;
                      }
                      break;
                    case 0x2e10cdb7:
                      if (str.equals("liveHardwareEncodeEnabled")) {
                         i = 9;
                      }
                      break;
                    case 0x5bae1769:
                      if (str.equals("iFrameInterval")) {
                         i = 10;
                      }
                      break;
                    case 0x77a81e94:
                      if (str.equals("previewResolution")) {
                         i = 11;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mVideoMaxBitrate = KnownTypeAdapters$i.a(p0, obj.mVideoMaxBitrate);
                      break;
                    case 1:
                      obj.mAudioBitrate = KnownTypeAdapters$k.a(p0, obj.mAudioBitrate);
                      break;
                    case 2:
                      obj.mResolution = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mPushResolution = KnownTypeAdapters$k.a(p0, obj.mPushResolution);
                      break;
                    case 4:
                      obj.mEncoderComplexityOptions = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mFps = KnownTypeAdapters$k.a(p0, obj.mFps);
                      break;
                    case 6:
                      obj.mVideoMinBitrate = KnownTypeAdapters$i.a(p0, obj.mVideoMinBitrate);
                      break;
                    case 7:
                      obj.mVideoConfig = this.b.read(p0);
                      break;
                    case 8:
                      obj.mVideoInitBitrate = KnownTypeAdapters$i.a(p0, obj.mVideoInitBitrate);
                      break;
                    case 9:
                      obj.mLiveHardwareEncodeEnabled = KnownTypeAdapters$g.a(p0, obj.mLiveHardwareEncodeEnabled);
                      break;
                    case 10:
                      obj.mIFrameInterval = KnownTypeAdapters$k.a(p0, obj.mIFrameInterval);
                      break;
                    case 11:
                      obj.mPreviewResolution = KnownTypeAdapters$k.a(p0, obj.mPreviewResolution);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CheckResolutionResponse$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("fps");
          p0.K((long)p1.mFps);
          p0.r("videoMaxBitrate");
          p0.J(p1.mVideoMaxBitrate);
          p0.r("videoInitBitrate");
          p0.J(p1.mVideoInitBitrate);
          p0.r("videoMinBitrate");
          p0.J(p1.mVideoMinBitrate);
          p0.r("audioBitrate");
          p0.K((long)p1.mAudioBitrate);
          p0.r("iFrameInterval");
          p0.K((long)p1.mIFrameInterval);
          p0.r("liveHardwareEncodeEnabled");
          p0.P(p1.mLiveHardwareEncodeEnabled);
          if (p1.mEncoderComplexityOptions != null) {
             p0.r("encoderComplexityOptions");
             TypeAdapters.A.write(p0, p1.mEncoderComplexityOptions);
          }
          p0.r("pushResolution");
          p0.K((long)p1.mPushResolution);
          p0.r("previewResolution");
          p0.K((long)p1.mPreviewResolution);
          if (p1.mResolution != null) {
             p0.r("resolution");
             TypeAdapters.A.write(p0, p1.mResolution);
          }
          if (p1.mVideoConfig != null) {
             p0.r("videoConfig");
             this.b.write(p0, p1.mVideoConfig);
          }
          p0.j();
       }
       return;
    }
}
