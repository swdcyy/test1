package com.kwai.video.krtc.GL.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.opengl.GLES20;
import java.lang.StringBuilder;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.Buffer;
import java.lang.Boolean;
import com.kwai.video.krtc.utils.Log;
import java.lang.RuntimeException;

public class c	// class@00075b
{

    public static int a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int[] ointArray = new int[1];
       GLES20.glGenTextures(1, ointArray, 0);
       int i = ointArray[0];
       GLES20.glBindTexture(p0, i);
       GLES20.glTexParameterf(p0, 0x2801, 9729.00f);
       GLES20.glTexParameterf(p0, 0x2800, 9729.00f);
       GLES20.glTexParameterf(p0, 0x2802, 0x47012f00);
       GLES20.glTexParameterf(p0, 0x2803, 0x47012f00);
       c.a("GlUtil", "generateTexture\("+p0+"\)");
       return i;
    }
    public static FloatBuffer a(float[] p0){
       ByteBuffer obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ByteBuffer.allocateDirect((p0.length * 4));
       obj.order(ByteOrder.nativeOrder());
       FloatBuffer uFloatBuffer = obj.asFloatBuffer();
       uFloatBuffer.put(p0);
       uFloatBuffer.position(0);
       return uFloatBuffer;
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "2")) {
          return;
       }
       c.a(p0, p1, false);
       return;
    }
    public static void a(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, c.class, "1")) {
          return;
       }
       int i = GLES20.glGetError();
       if (i) {
          if (!p2) {
             Log.e("GlUtil", p1+": GLES20 error: "+i);
          }else {
             throw new RuntimeException(p1+": GLES20 error: "+i);
          }
       }
       return;
    }
}
