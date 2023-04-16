package com.yxcorp.gifshow.media.model.CameraConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.media.model.CameraConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.media.model.CameraPageConfig$TypeAdapter;
import com.yxcorp.gifshow.media.model.CameraUnitConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.google.gson.stream.b;

public final class CameraConfig$TypeAdapter extends TypeAdapter	// class@001d01
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       CameraConfig$TypeAdapter.d = a.get(CameraConfig.class);
    }
    public void CameraConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(CameraPageConfig$TypeAdapter.b);
       this.c = p0.j(CameraUnitConfig$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CameraConfig$TypeAdapter.class, "2");
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
             obj = new CameraConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x838850c7:
                      if (str.equals("enableZeroShutterLagTakePicture")) {
                         i = 0;
                      }
                      break;
                    case 0x87e4c755:
                      if (str.equals("enableRecordingHint")) {
                         i = 1;
                      }
                      break;
                    case 0x8923be26:
                      if (str.equals("enableCameraVivoApi")) {
                         i = 2;
                      }
                      break;
                    case 0x8b31ecf4:
                      if (str.equals("enableTakePicture")) {
                         i = 3;
                      }
                      break;
                    case 0x8dcdd412:
                      if (str.equals("hardwareRecordFpsForHighFrameRate")) {
                         i = 4;
                      }
                      break;
                    case 0x96085186:
                      if (str.equals("storyPageConfig")) {
                         i = 5;
                      }
                      break;
                    case 0x961d81bd:
                      if (str.equals("disableSetAdaptedCameraFps")) {
                         i = 6;
                      }
                      break;
                    case 0x966f2a37:
                      if (str.equals("enableTimeStampCorrect")) {
                         i = 7;
                      }
                      break;
                    case 0x9f448c36:
                      if (str.equals("enableDenoise")) {
                         i = 8;
                      }
                      break;
                    case 0xa7c641bc:
                      if (str.equals("recordMaxFaceDetectCount")) {
                         i = 9;
                      }
                      break;
                    case 0xbcf804ca:
                      if (str.equals("disableAdaptiveResolution")) {
                         i = 10;
                      }
                      break;
                    case 0xc8116f5c:
                      if (str.equals("enableHardwareEncoderColorSpaceSetting")) {
                         i = 11;
                      }
                      break;
                    case 0xd0b34f68:
                      if (str.equals("pictureWidth")) {
                         i = 12;
                      }
                      break;
                    case 0xd1a32207:
                      if (str.equals("enableStannis")) {
                         i = 13;
                      }
                      break;
                    case 0xd4ed2228:
                      if (str.equals("targetMinFps")) {
                         i = 14;
                      }
                      break;
                    case 0xd80505c3:
                      if (str.equals("enableMediaRecorderEarlyPrepare")) {
                         i = 15;
                      }
                      break;
                    case 0xda596273:
                      if (str.equals("enableHdr")) {
                         i = 16;
                      }
                      break;
                    case 0xdbc5d4f2:
                      if (str.equals("hardwareEncoderAlignSize")) {
                         i = 17;
                      }
                      break;
                    case 0xe88041e2:
                      if (str.equals("recordPageConfig")) {
                         i = 18;
                      }
                      break;
                    case 0xf1220e72:
                      if (str.equals("videoBitrate")) {
                         i = 19;
                      }
                      break;
                    case 0xf5f1eb18:
                      if (str.equals("enableMediacodecBitrateModeCbr")) {
                         i = 20;
                      }
                      break;
                    case 0x873751a:
                      if (str.equals("enableAudioVideoMuxerInterval")) {
                         i = 21;
                      }
                      break;
                    case 0x12a0ba37:
                      if (str.equals("recordingHintCameraType")) {
                         i = 22;
                      }
                      break;
                    case 0x1e4fa4aa:
                      if (str.equals("cameraOutputDataType")) {
                         i = 23;
                      }
                      break;
                    case 0x2be7a3c5:
                      if (str.equals("pictureHeight")) {
                         i = 24;
                      }
                      break;
                    case 0x3084ee83:
                      if (str.equals("photoPageConfig")) {
                         i = 25;
                      }
                      break;
                    case 0x34ef8c2f:
                      if (str.equals("enableRenderThread2")) {
                         i = 26;
                      }
                      break;
                    case 0x3596a0e8:
                      if (str.equals("enableSuperWideAngle")) {
                         i = 27;
                      }
                      break;
                    case 0x36881f7d:
                      if (str.equals("videoCodecConfig")) {
                         i = 28;
                      }
                      break;
                    case 0x37a6e5fb:
                      if (str.equals("startRecordDelayAfterStartPlayMusic")) {
                         i = 29;
                      }
                      break;
                    case 0x3bb9cb17:
                      if (str.equals("enableDelayEncodeFrame")) {
                         i = 30;
                      }
                      break;
                    case 0x428ccaeb:
                      if (str.equals("cameraUnitConfig")) {
                         i = 31;
                      }
                      break;
                    case 0x4f8f9686:
                      if (str.equals("useEglImageTextureReader")) {
                         i = 32;
                      }
                      break;
                    case 0x5c8f3e63:
                      if (str.equals("cameraApiVersion")) {
                         i = 33;
                      }
                      break;
                    case 0x5e16022b:
                      if (str.equals("disableFallbackSoftwareEncoder")) {
                         i = 34;
                      }
                      break;
                    case 0x6602a7ba:
                      if (str.equals("sensorRate")) {
                         i = 35;
                      }
                      break;
                    case 0x6708d32e:
                      if (str.equals("enableCameraKit")) {
                         i = 36;
                      }
                      break;
                    case 0x7ef4045e:
                      if (str.equals("disableFaceDetectAutoExposure")) {
                         i = 37;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mEnableZeroShutterLagTakePicture = KnownTypeAdapters$g.a(p0, obj.mEnableZeroShutterLagTakePicture);
                      break;
                    case 1:
                      obj.mEnableRecordingHint = KnownTypeAdapters$g.a(p0, obj.mEnableRecordingHint);
                      break;
                    case 2:
                      obj.mEnableCameraVivoApi = KnownTypeAdapters$g.a(p0, obj.mEnableCameraVivoApi);
                      break;
                    case 3:
                      obj.mEnableTakePicture = KnownTypeAdapters$g.a(p0, obj.mEnableTakePicture);
                      break;
                    case 4:
                      obj.mHardwareRecordFpsForHighFrameRate = KnownTypeAdapters$k.a(p0, obj.mHardwareRecordFpsForHighFrameRate);
                      break;
                    case 5:
                      obj.mStoryPageConfig = this.b.read(p0);
                      break;
                    case 6:
                      obj.mDisableSetAdaptedCameraFps = KnownTypeAdapters$g.a(p0, obj.mDisableSetAdaptedCameraFps);
                      break;
                    case 7:
                      obj.mEnableTimeStampCorrect = KnownTypeAdapters$g.a(p0, obj.mEnableTimeStampCorrect);
                      break;
                    case 8:
                      obj.mEnableDenoise = KnownTypeAdapters$g.a(p0, obj.mEnableDenoise);
                      break;
                    case 9:
                      obj.mRecordMaxFaceDetectCount = KnownTypeAdapters$k.a(p0, obj.mRecordMaxFaceDetectCount);
                      break;
                    case 10:
                      obj.mDisableAdaptiveResolution = KnownTypeAdapters$g.a(p0, obj.mDisableAdaptiveResolution);
                      break;
                    case 11:
                      obj.mEnableHardwareEncoderColorSpaceSetting = KnownTypeAdapters$g.a(p0, obj.mEnableHardwareEncoderColorSpaceSetting);
                      break;
                    case 12:
                      obj.mPictureWidth = KnownTypeAdapters$k.a(p0, obj.mPictureWidth);
                      break;
                    case 13:
                      obj.mEnableStannis = KnownTypeAdapters$g.a(p0, obj.mEnableStannis);
                      break;
                    case 14:
                      obj.mTargetMinFps = KnownTypeAdapters$k.a(p0, obj.mTargetMinFps);
                      break;
                    case 15:
                      obj.mEnablePrepareMediaRecorder = KnownTypeAdapters$g.a(p0, obj.mEnablePrepareMediaRecorder);
                      break;
                    case 16:
                      obj.mEnableHdr = KnownTypeAdapters$g.a(p0, obj.mEnableHdr);
                      break;
                    case 17:
                      obj.mHardwareEncoderAlignSize = KnownTypeAdapters$k.a(p0, obj.mHardwareEncoderAlignSize);
                      break;
                    case 18:
                      obj.mRecordPageConfig = this.b.read(p0);
                      break;
                    case 19:
                      obj.mVideoBitrate = KnownTypeAdapters$k.a(p0, obj.mVideoBitrate);
                      break;
                    case 20:
                      obj.mEnableMediaCodecBitrateModeCbr = KnownTypeAdapters$g.a(p0, obj.mEnableMediaCodecBitrateModeCbr);
                      break;
                    case 21:
                      obj.mEnableAudioVideoMuxerInterval = KnownTypeAdapters$g.a(p0, obj.mEnableAudioVideoMuxerInterval);
                      break;
                    case 22:
                      obj.mRecordingHintCameraType = KnownTypeAdapters$k.a(p0, obj.mRecordingHintCameraType);
                      break;
                    case 23:
                      obj.mCameraOutputDataType = KnownTypeAdapters$k.a(p0, obj.mCameraOutputDataType);
                      break;
                    case 24:
                      obj.mPictureHeight = KnownTypeAdapters$k.a(p0, obj.mPictureHeight);
                      break;
                    case 25:
                      obj.mPhotoPageConfig = this.b.read(p0);
                      break;
                    case 26:
                      obj.mEnableRenderThread2 = KnownTypeAdapters$g.a(p0, obj.mEnableRenderThread2);
                      break;
                    case 27:
                      obj.mEnableUltraWideCamera = KnownTypeAdapters$g.a(p0, obj.mEnableUltraWideCamera);
                      break;
                    case 28:
                      obj.mVideoCodeConfig = TypeAdapters.A.read(p0);
                      break;
                    case 29:
                      obj.mStartRecordDelayAfterStartPlayMusic = KnownTypeAdapters$k.a(p0, obj.mStartRecordDelayAfterStartPlayMusic);
                      break;
                    case 30:
                      obj.mEnableDelayEncodeFrame = KnownTypeAdapters$g.a(p0, obj.mEnableDelayEncodeFrame);
                      break;
                    case 31:
                      obj.mCameraUnitConfig = this.c.read(p0);
                      break;
                    case 32:
                      obj.mUseEglimageTextureReader = KnownTypeAdapters$g.a(p0, obj.mUseEglimageTextureReader);
                      break;
                    case '!':
                      obj.mCameraApiVersion = KnownTypeAdapters$k.a(p0, obj.mCameraApiVersion);
                      break;
                    case '"':
                      obj.mDisableFallbackSoftwareEncoder = KnownTypeAdapters$g.a(p0, obj.mDisableFallbackSoftwareEncoder);
                      break;
                    case '#':
                      obj.mSensorRate = KnownTypeAdapters$k.a(p0, obj.mSensorRate);
                      break;
                    case '$':
                      obj.mEnableCameraKit = KnownTypeAdapters$g.a(p0, obj.mEnableCameraKit);
                      break;
                    case '%':
                      obj.mDisableFaceDetectAutoExposure = KnownTypeAdapters$g.a(p0, obj.mDisableFaceDetectAutoExposure);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("disableAdaptiveResolution");
          p0.P(p1.mDisableAdaptiveResolution);
          p0.r("cameraApiVersion");
          p0.K((long)p1.mCameraApiVersion);
          p0.r("cameraOutputDataType");
          p0.K((long)p1.mCameraOutputDataType);
          p0.r("enableRecordingHint");
          p0.P(p1.mEnableRecordingHint);
          p0.r("enableCameraKit");
          p0.P(p1.mEnableCameraKit);
          p0.r("enableCameraVivoApi");
          p0.P(p1.mEnableCameraVivoApi);
          p0.r("enableSuperWideAngle");
          p0.P(p1.mEnableUltraWideCamera);
          p0.r("recordingHintCameraType");
          p0.K((long)p1.mRecordingHintCameraType);
          p0.r("enableMediaRecorderEarlyPrepare");
          p0.P(p1.mEnablePrepareMediaRecorder);
          p0.r("recordMaxFaceDetectCount");
          p0.K((long)p1.mRecordMaxFaceDetectCount);
          p0.r("hardwareEncoderAlignSize");
          p0.K((long)p1.mHardwareEncoderAlignSize);
          p0.r("enableZeroShutterLagTakePicture");
          p0.P(p1.mEnableZeroShutterLagTakePicture);
          p0.r("enableTakePicture");
          p0.P(p1.mEnableTakePicture);
          p0.r("pictureWidth");
          p0.K((long)p1.mPictureWidth);
          p0.r("pictureHeight");
          p0.K((long)p1.mPictureHeight);
          p0.r("enableHdr");
          p0.P(p1.mEnableHdr);
          p0.r("enableStannis");
          p0.P(p1.mEnableStannis);
          p0.r("hardwareRecordFpsForHighFrameRate");
          p0.K((long)p1.mHardwareRecordFpsForHighFrameRate);
          p0.r("startRecordDelayAfterStartPlayMusic");
          p0.K((long)p1.mStartRecordDelayAfterStartPlayMusic);
          p0.r("videoBitrate");
          p0.K((long)p1.mVideoBitrate);
          if (p1.mRecordPageConfig != null) {
             p0.r("recordPageConfig");
             this.b.write(p0, p1.mRecordPageConfig);
          }
          if (p1.mPhotoPageConfig != null) {
             p0.r("photoPageConfig");
             this.b.write(p0, p1.mPhotoPageConfig);
          }
          if (p1.mStoryPageConfig != null) {
             p0.r("storyPageConfig");
             this.b.write(p0, p1.mStoryPageConfig);
          }
          p0.r("disableSetAdaptedCameraFps");
          p0.P(p1.mDisableSetAdaptedCameraFps);
          p0.r("enableTimeStampCorrect");
          p0.P(p1.mEnableTimeStampCorrect);
          p0.r("enableDelayEncodeFrame");
          p0.P(p1.mEnableDelayEncodeFrame);
          p0.r("targetMinFps");
          p0.K((long)p1.mTargetMinFps);
          p0.r("useEglImageTextureReader");
          p0.P(p1.mUseEglimageTextureReader);
          p0.r("enableDenoise");
          p0.P(p1.mEnableDenoise);
          p0.r("enableHardwareEncoderColorSpaceSetting");
          p0.P(p1.mEnableHardwareEncoderColorSpaceSetting);
          p0.r("enableMediacodecBitrateModeCbr");
          p0.P(p1.mEnableMediaCodecBitrateModeCbr);
          if (p1.mCameraUnitConfig != null) {
             p0.r("cameraUnitConfig");
             this.c.write(p0, p1.mCameraUnitConfig);
          }
          p0.r("sensorRate");
          p0.K((long)p1.mSensorRate);
          p0.r("enableRenderThread2");
          p0.P(p1.mEnableRenderThread2);
          p0.r("disableFaceDetectAutoExposure");
          p0.P(p1.mDisableFaceDetectAutoExposure);
          p0.r("disableFallbackSoftwareEncoder");
          p0.P(p1.mDisableFallbackSoftwareEncoder);
          if (p1.mVideoCodeConfig != null) {
             p0.r("videoCodecConfig");
             TypeAdapters.A.write(p0, p1.mVideoCodeConfig);
          }
          p0.r("enableAudioVideoMuxerInterval");
          p0.P(p1.mEnableAudioVideoMuxerInterval);
          p0.j();
       }
       return;
    }
}
