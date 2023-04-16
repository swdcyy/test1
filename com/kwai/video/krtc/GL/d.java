package com.kwai.video.krtc.GL.d;
import java.nio.FloatBuffer;
import com.kwai.video.krtc.GL.c;
import java.lang.Object;
import com.kwai.video.krtc.utils.e$d;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.GL.a;
import android.opengl.GLES20;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.GL.b;
import java.lang.Integer;
import com.kwai.video.krtc.utils.RenderUtils;
import java.lang.Boolean;
import java.lang.IllegalStateException;

public class d	// class@00075c
{
    public final e$d c;
    public TextureBuffer$Type d;
    public boolean e;
    public a f;
    public int g;
    public static final float[] a;
    public static final FloatBuffer b;

    static {
       d.a = new float[8]{0xbf800000,0xbf800000,0x3f800000,0xbf800000,0xbf800000,0x3f800000,0x3f800000,0x3f800000};
       d.b = c.a(new float[8]{0,0,0x3f800000,0,0,0x3f800000,0x3f800000,0x3f800000});
    }
    public void d(){
       super();
       e$d uod = new e$d();
       this.c = uod;
       this.d = TextureBuffer$Type.INVALID;
       this.e = false;
       this.f = null;
       this.g = 0;
       uod.a();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.c.a();
       this.e = true;
       d tf = this.f;
       if (tf != null) {
          tf.b();
          this.f = null;
       }
       return;
    }
    public final void a(TextureBuffer$Type p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       if (this.d != p0) {
          d tf = this.f;
          if (tf != null) {
             tf.b();
             this.f = null;
          }
          this.d = p0;
       }else if(this.f != null){
          return;
       }
       TextureBuffer$Type oES = TextureBuffer$Type.OES;
       String str = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main\(\) {\n    gl_Position = in_pos;\n    interp_tc = \(texMatrix * in_tc\).xy;\n}\n";
       this.f = (p0 == oES)? new a(str, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main\(\) {\n  gl_FragColor = texture2D\(oes_tex, interp_tc\);\n}\n"): new a(str, "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D rgb_tex;\n\nvoid main\(\) {\n  gl_FragColor = texture2D\(rgb_tex, interp_tc\);\n}\n");
       this.f.a();
       this.g = this.f.b("texMatrix");
       int i = 0;
       if (p0 == oES) {
          GLES20.glUniform1i(this.f.b("oes_tex"), i);
       }else {
          GLES20.glUniform1i(this.f.b("rgb_tex"), i);
       }
       Log.i("T2DConverter", " initShader\("+p0+"\) done");
       return;
    }
    public final void a(b p0,TextureBuffer$Type p1,int p2,int p3,int p4,int p5,int p6,float[] p7){
       d uod = this;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       int i1 = p3;
       object oobject2 = p7;
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6),oobject2};
          if (PatchProxy.applyVoid(objArray, this, uod1, "2")) {
             return;
          }
       }
       this.a(oobject1);
       uod.f.a();
       uod.f.a("in_pos", 2, c.a(RenderUtils.adjustRespectRatio(i, i1, p4, p5, d.a)));
       uod.f.a("in_tc", 2, d.b);
       oobject.a(i, i1);
       GLES20.glBindFramebuffer(0x8d40, p0.a());
       GLES20.glActiveTexture(0x84c0);
       GLES20.glBindTexture(p1.getGlTarget(), p6);
       GLES20.glUniformMatrix4fv(uod.g, 1, 0, oobject2, 0);
       GLES20.glViewport(0, 0, i, i1);
       GLES20.glDrawArrays(5, 0, 4);
       GLES20.glBindFramebuffer(0x8d40, 0);
       GLES20.glBindTexture(p1.getGlTarget(), 0);
       return;
    }
    public void a(b p0,TextureBuffer$Type p1,int p2,int p3,int p4,int p5,int p6,float[] p7,boolean p8){
       d uod = this;
       object oobject = p1;
       object oobject1 = p7;
       d uod1 = d.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = oobject1;
          objArray[8] = Boolean.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, uod1, "3")) {
             return;
          }
       }
       uod.c.a();
       if (uod.e == null) {
          if (oobject == TextureBuffer$Type.OES) {
             oobject1 = RenderUtils.multiplyMatrices(oobject1, RenderUtils.verticalFlipMatrix());
          }
          this.a(p0, p1, p2, p3, p4, p5, p6, oobject1);
          return;
       }else {
          throw new IllegalStateException("T2DConverter.convert called on released object");
       }
    }
}
