package com.kwai.video.aemonplayer.surface.EGL;
import java.lang.Object;
import android.opengl.EGLDisplay;
import android.opengl.EGLConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.opengl.EGL14;
import com.kwai.video.aemonplayer.surface.EGL$GlException;
import java.util.Locale;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.video.aemonplayer.surface.EGL$1;
import android.graphics.Matrix;
import android.opengl.EGLContext;
import com.kwai.video.aemonplayer.surface.EGLCompat;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.lang.StringBuilder;
import java.lang.Float;

public class EGL	// class@0019d7
{
    public static final int[] EGL_CONFIG_ATTRIBUTES;

    static {
       EGL.EGL_CONFIG_ATTRIBUTES = new int[17]{0x3040,4,0x3024,8,0x3023,8,0x3022,8,0x3021,8,0x3025,0,0x3027,0x3038,0x3033,4,0x3038};
    }
    public void EGL(){
       super();
    }
    public static EGLConfig chooseEGLConfig(EGLDisplay p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EGL.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       EGLConfig[] uEGLConfigAr = new EGLConfig[i];
       int[] ointArray = new int[i];
       boolean b = EGL14.eglChooseConfig(p0, EGL.EGL_CONFIG_ATTRIBUTES, 0, uEGLConfigAr, 0, 1, ointArray, 0);
       if (b && (ointArray[0] > 0 && uEGLConfigAr[0] != null)) {
          return uEGLConfigAr[0];
       }
       Object[] objArray = new Object[]{Boolean.valueOf(b),Integer.valueOf(ointArray[0]),uEGLConfigAr[0]};
       throw new EGL$GlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArray), null);
    }
    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EGL.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float[] uofloatArray = new float[9];
       p0.getValues(uofloatArray);
       float[] uofloatArray1 = new float[]{uofloatArray[0],uofloatArray[3],0,uofloatArray[6],uofloatArray[1],uofloatArray[4],0,uofloatArray[7],0,0,0x3f800000,0,uofloatArray[2],uofloatArray[5],0,uofloatArray[8]};
       return uofloatArray1;
    }
    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] p0){
       float[] obj = PatchProxy.applyOneRefs(p0, null, EGL.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[]{p0[0],p0[4],p0[12],p0[1],p0[5],p0[13],p0[3],p0[7],p0[15]};
       Matrix matrix = new Matrix();
       matrix.setValues(obj);
       return matrix;
    }
    public static EGLContext createEGLContext(EGLDisplay p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EGL.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EGL.createEGLContext(p0, EGL.chooseEGLConfig(p0), null, 0);
    }
    public static EGLContext createEGLContext(EGLDisplay p0,EGLConfig p1,EGLContext p2,int p3){
       int[] ointArray;
       if (PatchProxy.isSupport(EGL.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, EGL.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (EGLCompat.isEnableOpenGlEs30())? 3: 2;
       if (!p3) {
          ointArray = new int[]{0x3098,i,0x3038};
       }else {
          ointArray = new int[]{0x3098,i,0x32c0,1,0x3038};
       }
       if (p2 == null) {
          p2 = EGL14.EGL_NO_CONTEXT;
       }
       EGLContext uEGLContext = EGL14.eglCreateContext(p0, p1, p2, ointArray, 0);
       if (uEGLContext != null && uEGLContext != EGL14.EGL_NO_CONTEXT) {
          return uEGLContext;
       }else {
          throw new EGL$GlException("eglCreateContext failed", null);
       }
    }
    public static EGLSurface createEGLSurface(EGLDisplay p0,EGLConfig p1,EGLContext p2,int p3){
       EGLSurface eGL_NO_SURFA;
       int[] ointArray;
       if (PatchProxy.isSupport(EGL.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, EGL.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p3 == 1) {
          eGL_NO_SURFA = EGL14.EGL_NO_SURFACE;
       }else if(p3 == 2){
          ointArray = new int[7]{0x3057,1,0x3056,1,0x32c0,1,0x3038};
       }else {
          ointArray = new int[5]{0x3057,1,0x3056,1,0x3038};
       }
       eGL_NO_SURFA = EGL14.eglCreatePbufferSurface(p0, p1, ointArray, 0);
       if (eGL_NO_SURFA == null) {
          throw new EGL$GlException("eglCreatePbufferSurface failed", null);
       }
       if (EGL14.eglMakeCurrent(p0, eGL_NO_SURFA, eGL_NO_SURFA, p2)) {
          return eGL_NO_SURFA;
       }else {
          throw new EGL$GlException("eglMakeCurrent failed", null);
       }
    }
    public static synchronized void deleteTextureIds(int[] p0){
       _monitor_enter(EGL.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, EGL.class, "8")) {
          _monitor_exit(EGL.class);
          return;
       }else {
          GLES20.glDeleteTextures(1, p0, 0);
          _monitor_exit(EGL.class);
          return;
       }
    }
    public static void destroyEGLContext(EGLDisplay p0,EGLContext p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EGL.class, "3")) {
          return;
       }
       EGLSurface uEGLSurface = null;
       if (p0 != null && !p0.equals(EGL14.EGL_NO_DISPLAY)) {
          uEGLSurface = EGL14.eglMakeCurrent(p0, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
       }
       if (!uEGLSurface) {
          return;
       }else if(p0 != null && p1 != null){
          EGL14.eglDestroyContext(p0, p1);
       }
       EGL14.eglReleaseThread();
       if (p0 != null && !p0.equals(EGL14.EGL_NO_DISPLAY)) {
          EGL14.eglTerminate(p0);
       }
       return;
    }
    public static String dumpMat(float[] p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, EGL.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int i = 0;
       int i1 = 4;
       while (i < i1) {
          Object[] objArray = new Object[i1];
          int i2 = i * 4;
          objArray[0] = Float.valueOf(p0[i2]);
          int i3 = i2 + 1;
          objArray[1] = Float.valueOf(p0[i3]);
          i3 = i2 + 2;
          objArray[2] = Float.valueOf(p0[i3]);
          i2 = i2 + 3;
          objArray[3] = Float.valueOf(p0[i2]);
          obj = obj+String.format("%.4f, %.4f, %.4f, %.4f\n", objArray);
          i = i + 1;
       }
       return obj;
    }
    public static synchronized void generateTextureIds(int[] p0){
       _monitor_enter(EGL.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, EGL.class, "7")) {
          _monitor_exit(EGL.class);
          return;
       }else {
          GLES20.glGenTextures(1, p0, 0);
          _monitor_exit(EGL.class);
          return;
       }
    }
    public static EGLDisplay getDefaultDisplay(){
       Object obj = PatchProxy.apply(null, null, EGL.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       EGLDisplay uEGLDisplay = EGL14.eglGetDisplay(i);
       if (uEGLDisplay == null) {
          throw new EGL$GlException("eglGetDisplay failed", null);
       }
       int[] ointArray = new int[2];
       if (EGL14.eglInitialize(uEGLDisplay, ointArray, i, ointArray, 1)) {
          return uEGLDisplay;
       }
       throw new EGL$GlException("eglInitialize failed", null);
    }
}
