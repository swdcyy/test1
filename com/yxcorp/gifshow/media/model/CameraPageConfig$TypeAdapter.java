package com.yxcorp.gifshow.media.model.CameraPageConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
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
import com.google.gson.stream.b;

public final class CameraPageConfig$TypeAdapter extends TypeAdapter	// class@001d03
{
    public final Gson a;
    public static final a b;

    static {
       CameraPageConfig$TypeAdapter.b = a.get(CameraPageConfig.class);
    }
    public void CameraPageConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CameraPageConfig$TypeAdapter.class, "2");
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
             obj = new CameraPageConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x9dafd6f6:
                      if (str.equals("cameraStreamTypeForBackCamera")) {
                         i = 0;
                      }
                      break;
                    case 0xae5176de:
                      if (str.equals("previewWidth")) {
                         i = 1;
                      }
                      break;
                    case 0xbbd15fe4:
                      if (str.equals("cameraStreamTypeForFrontCamera")) {
                         i = 2;
                      }
                      break;
                    case 0xde3017fa:
                      if (str.equals("previewMaxEdgeSize")) {
                         i = 3;
                      }
                      break;
                    case 0xf28972c1:
                      if (str.equals("captureStabilizationModeForFrontCamera")) {
                         i = 4;
                      }
                      break;
                    case 0x20e6b0f:
                      if (str.equals("previewHeight")) {
                         i = 5;
                      }
                      break;
                    case 0x7e6b7479:
                      if (str.equals("captureStabilizationModeForBackCamera")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mCameraStreamTypeForBackCamera = KnownTypeAdapters$k.a(p0, obj.mCameraStreamTypeForBackCamera);
                      break;
                    case 1:
                      obj.mPreviewWidth = KnownTypeAdapters$k.a(p0, obj.mPreviewWidth);
                      break;
                    case 2:
                      obj.mCameraStreamTypeForFrontCamera = KnownTypeAdapters$k.a(p0, obj.mCameraStreamTypeForFrontCamera);
                      break;
                    case 3:
                      obj.mPreviewMaxEdgeSize = KnownTypeAdapters$k.a(p0, obj.mPreviewMaxEdgeSize);
                      break;
                    case 4:
                      obj.mCaptureStabilizationModeForFrontCamera = KnownTypeAdapters$k.a(p0, obj.mCaptureStabilizationModeForFrontCamera);
                      break;
                    case 5:
                      obj.mPreviewHeight = KnownTypeAdapters$k.a(p0, obj.mPreviewHeight);
                      break;
                    case 6:
                      obj.mCaptureStabilizationModeForBackCamera = KnownTypeAdapters$k.a(p0, obj.mCaptureStabilizationModeForBackCamera);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraPageConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("previewWidth");
          p0.K((long)p1.mPreviewWidth);
          p0.r("previewHeight");
          p0.K((long)p1.mPreviewHeight);
          p0.r("previewMaxEdgeSize");
          p0.K((long)p1.mPreviewMaxEdgeSize);
          p0.r("cameraStreamTypeForFrontCamera");
          p0.K((long)p1.mCameraStreamTypeForFrontCamera);
          p0.r("cameraStreamTypeForBackCamera");
          p0.K((long)p1.mCameraStreamTypeForBackCamera);
          p0.r("captureStabilizationModeForFrontCamera");
          p0.K((long)p1.mCaptureStabilizationModeForFrontCamera);
          p0.r("captureStabilizationModeForBackCamera");
          p0.K((long)p1.mCaptureStabilizationModeForBackCamera);
          p0.j();
       }
       return;
    }
}
