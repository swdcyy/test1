package com.kwai.video.aemonplayer.surface.EGLShader;
import java.lang.String;
import java.lang.Object;
import android.opengl.GLES20;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.nio.FloatBuffer;
import java.nio.Buffer;

public class EGLShader	// class@0019da
{
    public int program;

    public void EGLShader(String p0,String p1){
       super();
       int i = EGLShader.compileShader(0x8b31, p0);
       int i1 = EGLShader.compileShader(0x8b30, p1);
       int i2 = GLES20.glCreateProgram();
       this.program = i2;
       if (!i2) {
          throw new RuntimeException("glCreateProgram\(\) failed. GLES20 error: "+GLES20.glGetError());
       }
       GLES20.glAttachShader(i2, i);
       GLES20.glAttachShader(this.program, i1);
       GLES20.glLinkProgram(this.program);
       int[] ointArray = new int[]{0};
       GLES20.glGetProgramiv(this.program, 0x8b82, ointArray, 0);
       if (ointArray[0] != 1) {
          throw new RuntimeException(GLES20.glGetProgramInfoLog(this.program));
       }
       GLES20.glDeleteShader(i);
       GLES20.glDeleteShader(i1);
       return;
    }
    public static int compileShader(int p0,String p1){
       int[] obj;
       EGLShader uEGLShader = EGLShader.class;
       if (PatchProxy.isSupport(uEGLShader)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uEGLShader, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = GLES20.glCreateShader(p0);
       if (p0) {
          GLES20.glShaderSource(p0, p1);
          GLES20.glCompileShader(p0);
          int i = 1;
          obj = new int[i];
          obj[0] = 0;
          GLES20.glGetShaderiv(p0, 0x8b81, obj, 0);
          if (obj[0] == i) {
             return p0;
          }else {
             throw new RuntimeException(GLES20.glGetShaderInfoLog(p0));
          }
       }else {
          throw new RuntimeException("glCreateShader\(\) failed. GLES20 error: "+GLES20.glGetError());
       }
    }
    public int getAttribLocation(String p0){
       EGLShader obj = PatchProxy.applyOneRefs(p0, this, EGLShader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.program;
       if (obj == -1) {
          throw new RuntimeException("The program has been released");
       }
       int i = GLES20.glGetAttribLocation(obj, p0);
       if (i >= 0) {
          return i;
       }
       throw new RuntimeException("Could not locate \'"+p0+"\' in program");
    }
    public int getUniformLocation(String p0){
       EGLShader obj = PatchProxy.applyOneRefs(p0, this, EGLShader.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.program;
       if (obj == -1) {
          throw new RuntimeException("The program has been released");
       }
       int i = GLES20.glGetUniformLocation(obj, p0);
       if (i >= 0) {
          return i;
       }
       throw new RuntimeException("Could not locate uniform \'"+p0+"\' in program");
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, EGLShader.class, "7")) {
          return;
       }
       EGLShader tprogram = this.program;
       if (tprogram != -1) {
          GLES20.glDeleteProgram(tprogram);
          this.program = -1;
       }
       return;
    }
    public void setVertexAttribArray(String p0,int p1,int p2,FloatBuffer p3){
       if (PatchProxy.isSupport(EGLShader.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, EGLShader.class, "4")) {
          return;
       }
       if (this.program == -1) {
          throw new RuntimeException("The program has been released");
       }
       int attribLocati = this.getAttribLocation(p0);
       GLES20.glEnableVertexAttribArray(attribLocati);
       GLES20.glVertexAttribPointer(attribLocati, p1, 5126, false, p2, p3);
       return;
    }
    public void setVertexAttribArray(String p0,int p1,FloatBuffer p2){
       if (PatchProxy.isSupport(EGLShader.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, EGLShader.class, "3")) {
          return;
       }
       this.setVertexAttribArray(p0, p1, 0, p2);
       return;
    }
    public void useProgram(){
       if (PatchProxy.applyVoid(null, this, EGLShader.class, "6")) {
          return;
       }
       EGLShader tprogram = this.program;
       if (tprogram == -1) {
          throw new RuntimeException("The program has been released");
       }
       GLES20.glUseProgram(tprogram);
       return;
    }
}
