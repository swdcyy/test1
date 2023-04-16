package com.kwai.video.krtc.GL.b;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.video.krtc.GL.c;
import android.opengl.GLES20;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.nio.Buffer;
import java.lang.IllegalStateException;

public class b	// class@00075a
{
    public final int a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public void b(int p0){
       super();
       switch (p0){
           case 6407:
           case 6409:
           case 6408:
           default:
             throw new IllegalArgumentException("Invalid pixel format: "+p0);
       }
       this.c = p0;
       p0 = c.a(3553);
       this.b = p0;
       this.a(p0);
       this.d = 0;
       this.e = 0;
       int[] ointArray = new int[1];
       GLES20.glGenFramebuffers(1, ointArray, 0);
       this.a = ointArray[0];
       return;
    }
    public int a(){
       return this.a;
    }
    public final void a(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "4")) {
          return;
       }
       GLES20.glActiveTexture(0x84c0);
       GLES20.glBindTexture(3553, p0);
       GLES20.glTexParameterf(3553, 0x2800, 9729.00f);
       GLES20.glTexParameterf(3553, 0x2801, 9729.00f);
       GLES20.glTexParameterf(3553, 0x2802, 0x47012f00);
       GLES20.glTexParameterf(3553, 0x2803, 0x47012f00);
       GLES20.glBindTexture(3553, 0);
       c.a("GlTextureFrameBuffer", "initTexture\("+p0+"\)");
       return;
    }
    public void a(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.a(p0, p1, true);
       return;
    }
    public void a(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, b.class, "1")) {
          return;
       }
       if (!p0 || !p1) {
          throw new IllegalArgumentException("Invalid size: "+p0+"x"+p1);
       }
       if (p0 == this.d && p1 == this.e) {
          return;
       }
       this.d = p0;
       this.e = p1;
       GLES20.glActiveTexture(0x84c0);
       GLES20.glBindTexture(3553, this.b);
       b tc = this.c;
       GLES20.glTexImage2D(3553, 0, tc, p0, p1, 0, tc, 5121, null);
       int i = 0;
       GLES20.glBindTexture(3553, i);
       c.a("GlTextureFrameBuffer", "setSize\("+p0+","+p1+", "+p2+"\)");
       if (p2) {
          p1 = 0x8d40;
          GLES20.glBindFramebuffer(p1, this.a);
          GLES20.glFramebufferTexture2D(p1, 0x8ce0, 3553, this.b, i);
          p0 = GLES20.glCheckFramebufferStatus(p1);
          if (p0 == 0x8cd5) {
             GLES20.glBindFramebuffer(p1, i);
          }else {
             throw new IllegalStateException("Framebuffer not complete, status: "+p0);
          }
       }
       return;
    }
    public int b(){
       return this.b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       int[] ointArray = new int[]{this.b};
       GLES20.glDeleteTextures(1, ointArray, 0);
       ointArray = new int[]{this.a};
       GLES20.glDeleteFramebuffers(1, ointArray, 0);
       this.d = 0;
       this.e = 0;
       return;
    }
}
