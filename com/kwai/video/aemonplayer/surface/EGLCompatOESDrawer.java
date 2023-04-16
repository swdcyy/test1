package com.kwai.video.aemonplayer.surface.EGLCompatOESDrawer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.aemonplayer.surface.EGLShader;
import android.opengl.GLES20;

public class EGLCompatOESDrawer	// class@0019d9
{
    public final int compatType;
    public EGLShader shader;

    public void EGLCompatOESDrawer(int p0){
       super();
       this.compatType = p0;
    }
    public static String getFragmentShader(){
       return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex;\nvoid main\(\) {\n  gl_FragColor = texture2D\(tex, vec2\(0.0\)\);\n}\n";
    }
    public static String getVertexShader(){
       return "precision mediump float;\nvoid main\(\) {\n  gl_Position = vec4\(0.0\);\n}\n";
    }
    public synchronized void draw(){
       if (PatchProxy.applyVoid(null, this, EGLCompatOESDrawer.class, "1")) {
          return;
       }
       if (this.shader == null) {
          this.shader = new EGLShader(EGLCompatOESDrawer.getVertexShader(), EGLCompatOESDrawer.getFragmentShader());
       }
       this.shader.useProgram();
       GLES20.glDrawArrays(5, 0, 0);
       GLES20.glClear(0x4000);
       return;
    }
    public int getCompatType(){
       return this.compatType;
    }
    public synchronized void release(){
       if (PatchProxy.applyVoid(null, this, EGLCompatOESDrawer.class, "2")) {
          return;
       }
       EGLCompatOESDrawer tshader = this.shader;
       if (tshader != null) {
          tshader.release();
          this.shader = null;
       }
       return;
    }
}
