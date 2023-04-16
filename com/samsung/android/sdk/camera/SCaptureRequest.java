package com.samsung.android.sdk.camera.SCaptureRequest;
import android.os.Parcelable;
import com.samsung.android.sdk.camera.a;
import com.samsung.android.sdk.camera.SCaptureRequest$a;
import com.samsung.android.sdk.camera.SCaptureRequest$b;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest$Key;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import android.hardware.camera2.CameraMetadata;
import java.lang.Object;
import android.os.Parcel;

public final class SCaptureRequest extends a implements Parcelable	// class@000b78
{
    public final CaptureRequest e;
    public static final SCaptureRequest$b A;
    public static final SCaptureRequest$b B;
    public static final SCaptureRequest$b C;
    public static final Parcelable$Creator CREATOR;
    public static final SCaptureRequest$b D;
    public static final SCaptureRequest$b E;
    public static final SCaptureRequest$b F;
    public static final SCaptureRequest$b G;
    public static final SCaptureRequest$b H;
    public static final SCaptureRequest$b I;
    public static final SCaptureRequest$b J;
    public static final SCaptureRequest$b K;
    public static final SCaptureRequest$b L;
    public static final SCaptureRequest$b M;
    public static final SCaptureRequest$b N;
    public static final SCaptureRequest$b O;
    public static final SCaptureRequest$b P;
    public static final SCaptureRequest$b Q;
    public static final SCaptureRequest$b R;
    public static final SCaptureRequest$b S;
    public static final SCaptureRequest$b T;
    public static final SCaptureRequest$b U;
    public static final SCaptureRequest$b U0;
    public static final SCaptureRequest$b V;
    public static final SCaptureRequest$b V0;
    public static final SCaptureRequest$b W;
    public static final SCaptureRequest$b W0;
    public static final SCaptureRequest$b X;
    public static final SCaptureRequest$b X0;
    public static final SCaptureRequest$b Y;
    public static final SCaptureRequest$b Y0;
    public static final SCaptureRequest$b Z;
    public static final SCaptureRequest$b Z0;
    public static final SCaptureRequest$b a1;
    public static final SCaptureRequest$b b1;
    public static final SCaptureRequest$b c1;
    public static final SCaptureRequest$b f;
    public static final SCaptureRequest$b g;
    public static final SCaptureRequest$b h;
    public static final SCaptureRequest$b i;
    public static final SCaptureRequest$b j;
    public static final SCaptureRequest$b k;
    public static final SCaptureRequest$b l;
    public static final SCaptureRequest$b m;
    public static final SCaptureRequest$b n;
    public static final SCaptureRequest$b o;
    public static final SCaptureRequest$b p;
    public static final SCaptureRequest$b q;
    public static final SCaptureRequest$b r;
    public static final SCaptureRequest$b s;
    public static final SCaptureRequest$b t;
    public static final SCaptureRequest$b u;
    public static final SCaptureRequest$b v;
    public static final SCaptureRequest$b w;
    public static final SCaptureRequest$b x;
    public static final SCaptureRequest$b y;
    public static final SCaptureRequest$b z;

    static {
       SCaptureRequest.CREATOR = new SCaptureRequest$a();
       SCaptureRequest.f = new SCaptureRequest$b(CaptureRequest.COLOR_CORRECTION_MODE, null);
       SCaptureRequest.g = new SCaptureRequest$b(CaptureRequest.COLOR_CORRECTION_TRANSFORM, null);
       SCaptureRequest.h = new SCaptureRequest$b(CaptureRequest.COLOR_CORRECTION_GAINS, null);
       SCaptureRequest.i = new SCaptureRequest$b(CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE, null);
       SCaptureRequest.j = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, null);
       SCaptureRequest.k = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, null);
       SCaptureRequest.l = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_LOCK, null);
       SCaptureRequest.m = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_MODE, null);
       SCaptureRequest.n = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_REGIONS, null);
       SCaptureRequest.o = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, null);
       SCaptureRequest.p = new SCaptureRequest$b(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, null);
       SCaptureRequest.q = new SCaptureRequest$b(CaptureRequest.CONTROL_AF_MODE, null);
       SCaptureRequest.r = new SCaptureRequest$b(CaptureRequest.CONTROL_AF_REGIONS, null);
       SCaptureRequest.s = new SCaptureRequest$b(CaptureRequest.CONTROL_AF_TRIGGER, null);
       SCaptureRequest.t = new SCaptureRequest$b(CaptureRequest.CONTROL_AWB_LOCK, null);
       SCaptureRequest.u = new SCaptureRequest$b(CaptureRequest.CONTROL_AWB_MODE, null);
       SCaptureRequest.v = new SCaptureRequest$b(CaptureRequest.CONTROL_AWB_REGIONS, null);
       SCaptureRequest.w = new SCaptureRequest$b(CaptureRequest.CONTROL_CAPTURE_INTENT, null);
       SCaptureRequest.x = new SCaptureRequest$b(CaptureRequest.CONTROL_EFFECT_MODE, null);
       SCaptureRequest.y = new SCaptureRequest$b(CaptureRequest.CONTROL_MODE, null);
       SCaptureRequest.z = new SCaptureRequest$b(CaptureRequest.CONTROL_SCENE_MODE, null);
       SCaptureRequest.A = new SCaptureRequest$b(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, null);
       SCaptureRequest.B = new SCaptureRequest$b(CaptureRequest.EDGE_MODE, null);
       SCaptureRequest.C = new SCaptureRequest$b(CaptureRequest.FLASH_MODE, null);
       SCaptureRequest.D = new SCaptureRequest$b(CaptureRequest.HOT_PIXEL_MODE, null);
       SCaptureRequest.E = new SCaptureRequest$b(CaptureRequest.JPEG_GPS_LOCATION, null);
       SCaptureRequest.F = new SCaptureRequest$b(CaptureRequest.JPEG_ORIENTATION, null);
       SCaptureRequest.G = new SCaptureRequest$b(CaptureRequest.JPEG_QUALITY, null);
       SCaptureRequest.H = new SCaptureRequest$b(CaptureRequest.JPEG_THUMBNAIL_QUALITY, null);
       SCaptureRequest.I = new SCaptureRequest$b(CaptureRequest.JPEG_THUMBNAIL_SIZE, null);
       SCaptureRequest.J = new SCaptureRequest$b(CaptureRequest.LENS_APERTURE, null);
       SCaptureRequest.K = new SCaptureRequest$b(CaptureRequest.LENS_FILTER_DENSITY, null);
       SCaptureRequest.L = new SCaptureRequest$b(CaptureRequest.LENS_FOCAL_LENGTH, null);
       SCaptureRequest.M = new SCaptureRequest$b(CaptureRequest.LENS_FOCUS_DISTANCE, null);
       SCaptureRequest.N = new SCaptureRequest$b(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, null);
       SCaptureRequest.O = new SCaptureRequest$b(CaptureRequest.NOISE_REDUCTION_MODE, null);
       SCaptureRequest.P = new SCaptureRequest$b(CaptureRequest.SCALER_CROP_REGION, null);
       SCaptureRequest.Q = new SCaptureRequest$b(CaptureRequest.SENSOR_EXPOSURE_TIME, null);
       SCaptureRequest.R = new SCaptureRequest$b(CaptureRequest.SENSOR_FRAME_DURATION, null);
       SCaptureRequest.S = new SCaptureRequest$b(CaptureRequest.SENSOR_SENSITIVITY, null);
       SCaptureRequest.T = new SCaptureRequest$b(CaptureRequest.SENSOR_TEST_PATTERN_DATA, null);
       SCaptureRequest.U = new SCaptureRequest$b(CaptureRequest.SENSOR_TEST_PATTERN_MODE, null);
       SCaptureRequest.V = new SCaptureRequest$b(CaptureRequest.SHADING_MODE, null);
       SCaptureRequest.W = new SCaptureRequest$b(CaptureRequest.STATISTICS_FACE_DETECT_MODE, null);
       SCaptureRequest.X = new SCaptureRequest$b(CaptureRequest.STATISTICS_HOT_PIXEL_MAP_MODE, null);
       SCaptureRequest.Y = new SCaptureRequest$b(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, null);
       SCaptureRequest.Z = new SCaptureRequest$b(CaptureRequest.TONEMAP_CURVE, null);
       SCaptureRequest.U0 = new SCaptureRequest$b(CaptureRequest.TONEMAP_MODE, null);
       SCaptureRequest.V0 = new SCaptureRequest$b("android.tonemap.gamma", "TONEMAP_GAMMA", null);
       SCaptureRequest.W0 = new SCaptureRequest$b("android.tonemap.presetCurve", "TONEMAP_PRESET_CURVE", null);
       SCaptureRequest.X0 = new SCaptureRequest$b(CaptureRequest.BLACK_LEVEL_LOCK, null);
       SCaptureRequest.Y0 = new SCaptureRequest$b("android.reprocess.effectiveExposureFactor", "REPROCESS_EFFECTIVE_EXPOSURE_FACTOR", null);
       Class tYPE = Integer.TYPE;
       SCaptureRequest.Z0 = new SCaptureRequest$b("samsung.android.control.liveHdrLevel", tYPE, null);
       SCaptureRequest.a1 = new SCaptureRequest$b("samsung.android.control.meteringMode", tYPE, null);
       SCaptureRequest.b1 = new SCaptureRequest$b("samsung.android.control.pafMode", tYPE, null);
       SCaptureRequest.c1 = new SCaptureRequest$b("samsung.android.lens.opticalStabilizationOperationMode", tYPE, null);
    }
    public void SCaptureRequest(CaptureRequest p0){
       super(p0);
       this.e = p0;
    }
    public Class a(){
       return SCaptureRequest$b.class;
    }
    public Object b(Object p0){
       return this.d(p0);
    }
    public final boolean c(SCaptureRequest p0){
       boolean b = (p0 != null && this.e.equals(p0.e))? true: false;
       return b;
    }
    public Object d(SCaptureRequest$b p0){
       p0 = p0.a;
       if (p0 == null) {
          return null;
       }
       return this.e.get(p0);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof SCaptureRequest && this.c(p0))? true: false;
       return b;
    }
    public int hashCode(){
       return this.e.hashCode();
    }
    public void writeToParcel(Parcel p0,int p1){
       this.e.writeToParcel(p0, p1);
    }
}
