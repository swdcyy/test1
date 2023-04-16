package com.kwai.video.krtc.GL.a;
import java.lang.String;
import java.lang.Object;
import android.opengl.GLES20;
import com.kwai.video.krtc.GL.c;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.lang.RuntimeException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.nio.FloatBuffer;
import java.nio.Buffer;

public class a	// class@000759
{
    public int a;

    public void a(String p0,String p1){
       super();
       int i = a.a(0x8b31, p0);
       int i1 = a.a(0x8b30, p1);
       int i2 = GLES20.glCreateProgram();
       this.a = i2;
       if (!i2) {
          throw new RuntimeException("glCreateProgram\(\) failed. GLES20 error: "+GLES20.glGetError());
       }
       GLES20.glAttachShader(i2, i);
       GLES20.glAttachShader(this.a, i1);
       GLES20.glLinkProgram(this.a);
       int[] ointArray = new int[]{0};
       GLES20.glGetProgramiv(this.a, 0x8b82, ointArray, 0);
       if (ointArray[0] == 1) {
          GLES20.glDeleteShader(i);
          GLES20.glDeleteShader(i1);
          c.a("GlShader", "Creating GlShader");
          return;
       }else {
          Log.e("GlShader", "Could not link program: "+GLES20.glGetProgramInfoLog(this.a));
          throw new RuntimeException(GLES20.glGetProgramInfoLog(this.a));
       }
    }
    public static int a(int p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = GLES20.glCreateShader(p0);
       if (i) {
          GLES20.glShaderSource(i, p1);
          GLES20.glCompileShader(i);
          int i1 = 1;
          int[] ointArray = new int[i1];
          ointArray[0] = 0;
          GLES20.glGetShaderiv(i, 0x8b81, ointArray, 0);
          if (ointArray[0] == i1) {
             c.a("GlShader", "compileShader");
             return i;
          }else {
             Log.e("GlShader", "Could not compile shader "+p0+":"+GLES20.glGetShaderInfoLog(i));
             throw new RuntimeException(GLES20.glGetShaderInfoLog(i));
          }
       }else {
          throw new RuntimeException("glCreateShader\(\) failed. GLES20 error: "+GLES20.glGetError());
       }
    }
    public int a(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == -1) {
          throw new RuntimeException("The program has been released");
       }
       int i = GLES20.glGetAttribLocation(obj, p0);
       if (i >= 0) {
          return i;
       }
       throw new RuntimeException("Could not locate \'"+p0+"\' in program");
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a ta = this.a;
       if (ta == -1) {
          throw new RuntimeException("The program has been released");
       }
       GLES20.glUseProgram(ta);
       return;
    }
    public void a(String p0,int p1,FloatBuffer p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "3")) {
          return;
       }
       if (this.a == -1) {
          throw new RuntimeException("The program has been released");
       }
       GLES20.glBindBuffer(0x8892, 0);
       int i = this.a(p0);
       GLES20.glEnableVertexAttribArray(i);
       GLES20.glVertexAttribPointer(i, p1, 5126, false, 0, p2);
       return;
    }
    public int b(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == -1) {
          throw new RuntimeException("The program has been released");
       }
       int i = GLES20.glGetUniformLocation(obj, p0);
       if (i >= 0) {
          return i;
       }
       throw new RuntimeException("Could not locate uniform \'"+p0+"\' in program");
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       Log.d("GlShader", "Deleting shader.");
       a ta = this.a;
       if (ta != -1) {
          GLES20.glDeleteProgram(ta);
          this.a = -1;
       }
       return;
    }
}
