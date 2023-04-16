package com.kwai.video.krtc.GL.e;
import java.nio.FloatBuffer;
import com.kwai.video.krtc.GL.c;
import java.lang.Object;
import com.kwai.video.krtc.utils.e$d;
import com.kwai.video.krtc.GL.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.a;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import com.kwai.video.krtc.GL.e$1;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import android.opengl.GLES20;
import java.lang.StringBuilder;
import com.kwai.video.krtc.GL.TextureBuffer;
import java.nio.ByteBuffer;
import java.lang.Integer;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.utils.RenderUtils;
import java.nio.Buffer;
import java.lang.IllegalStateException;

public class e	// class@00075e
{
    public final e$d d;
    public final b e;
    public TextureBuffer$Type f;
    public a g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public static final float[][] a;
    public static final FloatBuffer b;
    public static final FloatBuffer c;

    static {
       float[][] uofloatArray = new float[][4]{new float[9]{0x3e837b4a,0xbe17c1be,0x3ee0ded3,0x3f010cb3,0xbe94fdf4,0xbebc5048,0x3dc87fcc,0x3ee0ded3,0xbd923a2a},new float[9]{0x3e991687,0xbe2cbfb1,0x3f000000,0x3f1645a2,0xbea9a027,0xbed65fd9,0x3de978d5,0x3f000000,0xbda6809d},new float[9]{0x3e3afb7f,0xbdce3bcd,0x3ee0ded3,0x3f1d3c36,0xbead4fdf,0xbecc49ba,0x3d7df3b6,0x3ee0ded3,0xbd24a8c1},new float[9]{0x3e59b3d0,0xbdeab368,0x3f000000,0x3f371759,0xbec55326,0xbee88ce7,0x3d93dd98,0x3f000000,0xbd3b98c8}};
       e.a = uofloatArray;
       e.b = c.a(new float[8]{0xbf800000,0xbf800000,0x3f800000,0xbf800000,0xbf800000,0x3f800000,0x3f800000,0x3f800000});
       e.c = c.a(new float[8]{0,0,0x3f800000,0,0,0x3f800000,0x3f800000,0x3f800000});
    }
    public void e(){
       super();
       e$d uod = new e$d();
       this.d = uod;
       this.e = new b(6408);
       this.k = false;
       uod.a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.d.a();
       this.k = true;
       e tg = this.g;
       if (tg != null) {
          tg.b();
       }
       this.e.c();
       return;
    }
    public final void a(TextureBuffer$Type p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       e tg = this.g;
       if (tg != null) {
          tg.b();
       }
       int i = e$1.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             str = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main\(\) {\n  gl_FragColor.r = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc - 1.5 * xUnit\).rgb\);\n  gl_FragColor.g = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc - 0.5 * xUnit\).rgb\);\n  gl_FragColor.b = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc + 0.5 * xUnit\).rgb\);\n  gl_FragColor.a = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc + 1.5 * xUnit\).rgb\);\n}\n";
          }else {
             throw new IllegalArgumentException("Unsupported texture type.");
          }
       }else {
          str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main\(\) {\n  gl_FragColor.r = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc - 1.5 * xUnit\).rgb\);\n  gl_FragColor.g = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc - 0.5 * xUnit\).rgb\);\n  gl_FragColor.b = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc + 0.5 * xUnit\).rgb\);\n  gl_FragColor.a = coeffs.a + dot\(coeffs.rgb,\n      texture2D\(tex, interp_tc + 1.5 * xUnit\).rgb\);\n}\n";
       }
       this.f = p0;
       a uoa = new a("varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main\(\) {\n    gl_Position = in_pos;\n    interp_tc = \(texMatrix * in_tc\).xy;\n}\n", str);
       this.g = uoa;
       uoa.a();
       this.h = this.g.b("texMatrix");
       this.i = this.g.b("xUnit");
       this.j = this.g.b("coeffs");
       GLES20.glUniform1i(this.g.b("tex"), 0);
       c.a("YuvConverter", "initShader\("+p0+"\)");
       return;
    }
    public void a(TextureBuffer p0,ByteBuffer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       int rotation = p0.getRotation();
       rotation = (rotation == 90 || rotation == 270)? 1: 0;
       int height = (rotation)? p0.getHeight(): p0.getWidth();
       int i = height;
       rotation = (rotation)? p0.getWidth(): p0.getHeight();
       this.a(p1, i, rotation, (((i + 7) / 8) * 8), p0.getTextureId(), p0.getToI420Matrix(), p0.getType(), p0.getColorSpace());
       return;
    }
    public final void a(ByteBuffer p0,int p1,int p2,int p3,int p4,float[] p5,TextureBuffer$Type p6,int p7){
       Object obj = this;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       object oobject = p5;
       object oobject1 = p6;
       int i3 = p7;
       e uoe = e.class;
       int i4 = 3;
       int i5 = 5;
       int i6 = 8;
       int i7 = 4;
       int i8 = 1;
       int i9 = 2;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[i6];
          objArray[0] = p0;
          objArray[i8] = Integer.valueOf(p1);
          objArray[i9] = Integer.valueOf(p2);
          objArray[i4] = Integer.valueOf(p3);
          objArray[i7] = Integer.valueOf(p4);
          objArray[i5] = oobject;
          objArray[6] = oobject1;
          objArray[7] = Integer.valueOf(p7);
          if (PatchProxy.applyVoid(objArray, obj, uoe, "3")) {
             return;
          }
       }
       obj.d.a();
       if (obj.k == null) {
          if (oobject1 != obj.f) {
             obj.a(oobject1);
          }
          obj.g.a();
          obj.g.a("in_pos", i9, e.b);
          obj.g.a("in_tc", i9, e.c);
          if (!(i2 % 8)) {
             if (i2 >= i) {
                int i10 = (i + 7) / i6;
                int i11 = (i1 + 1) / i9;
                i5 = i10 * 2;
                i6 = i1 + i11;
                i7 = i2 * i6;
                if (p0.capacity() < i7) {
                   Log.e("YuvConverter", "YuvConverter.convert called with too small buffer yuv buf.capacity\(\):"+p0.capacity()+"size:"+i7);
                }
                if (oobject1 == TextureBuffer$Type.OES) {
                   oobject = RenderUtils.multiplyMatrices(oobject, RenderUtils.verticalFlipMatrix());
                }
                i4 = i2 / 4;
                obj.e.a(i4, i6);
                GLES20.glBindFramebuffer(0x8d40, obj.e.a());
                GLES20.glActiveTexture(0x84c0);
                GLES20.glBindTexture(p6.getGlTarget(), p4);
                GLES20.glUniformMatrix4fv(obj.h, i8, 0, oobject, 0);
                object oobject2 = e.a[i3];
                GLES20.glViewport(0, 0, i5, i1);
                float f = (float)i;
                GLES20.glUniform2f(obj.i, (oobject[0] / f), (oobject[i8] / f));
                float f1 = 0;
                if (!i3 || 2 == i3) {
                   f1 = 0.06f;
                }
                GLES20.glUniform4f(obj.j, oobject2[0], oobject2[3], oobject2[6], f1);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glViewport(0, i1, i10, i11);
                GLES20.glUniform2f(obj.i, ((oobject[0] * 2.00f) / f), ((oobject[1] * 2.00f) / f));
                GLES20.glUniform4f(obj.j, oobject2[1], oobject2[4], oobject2[7], 0x3f000000);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glViewport((i2 / 8), i1, i10, i11);
                GLES20.glUniform4f(obj.j, oobject2[2], oobject2[5], oobject2[8], 0x3f000000);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glReadPixels(0, 0, i4, i6, 6408, 5121, p0);
                GLES20.glBindFramebuffer(0x8d40, 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindTexture(p6.getGlTarget(), 0);
                return;
             }else {
                throw new IllegalArgumentException("Invalid stride, must >= width");
             }
          }else {
             throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
          }
       }else {
          throw new IllegalStateException("YuvConverter.convert called on released object");
       }
    }
}
